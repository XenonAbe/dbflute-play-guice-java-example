package app.mvc;

import app.core.Constants;
import org.dbflute.hook.AccessContext;
import play.Application;
import play.Logger;
import play.mvc.Action;
import play.mvc.Http;
import play.mvc.Result;

import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import static play.mvc.Security.USERNAME;

public class AppAction extends Action.Simple {
    private static final Logger.ALogger logger = Logger.of(AppAction.class);

    protected final Application application;
    protected final Method actionMethod;

    public AppAction(Application application, Method actionMethod) {
        this.application = application;
        this.actionMethod = actionMethod;
    }

    @Override
    public CompletionStage<Result> call(Http.Context ctx) {
        CompletionStage<Result> resultCompletionStage;
        try {
            onBegin(ctx);
            try {
                resultCompletionStage = delegate.call(ctx);
                if (logger.isInfoEnabled() && resultCompletionStage instanceof CompletableFuture && !((CompletableFuture)resultCompletionStage).isDone())
                    logger.info("ASYNC ctx:{}", ctx.id());
            } catch(Throwable t) {
                resultCompletionStage = CompletableFuture.completedFuture(handleException(ctx, t));
            }
        } catch(Throwable t) {
            onComplete(ctx, null, t);
            throw t;
        }

        resultCompletionStage = resultCompletionStage.exceptionally(throwable -> {
            final Http.Context oldCtx = Http.Context.current.get();
            if (oldCtx == null) Http.Context.current.set(ctx);
            try {
                return handleException(Http.Context.current(), throwable);
            } finally {
                Http.Context.current.set(oldCtx);
            }
        });

        resultCompletionStage = resultCompletionStage.whenComplete((result, throwable) -> {
            final Http.Context oldCtx = Http.Context.current.get();
            if (oldCtx == null) Http.Context.current.set(ctx);
            try {
                onComplete(Http.Context.current(), result, throwable);
            } finally {
                Http.Context.current.set(oldCtx);
            }
        });

        return resultCompletionStage;
    }

    protected Result handleException(Http.Context ctx, Throwable throwable) {
        if (logger.isWarnEnabled())
            logger.warn("Exception Occurred ctx:{} {}: {}", ctx.id(), throwable.getClass().getSimpleName(), throwable.getMessage());

        if (throwable instanceof RuntimeException)
            throw (RuntimeException)throwable;
        else if (throwable instanceof Error)
            throw (Error)throwable;
        throw new RuntimeException(throwable);
    }

    protected void onBegin(Http.Context ctx) {
        if (logger.isInfoEnabled())
            logger.info("BEGIN ctx:{} {} {}", ctx.id(), ctx.request().method(), ctx.request().uri());

        initializeContext(ctx);
    }

    protected void onComplete(Http.Context ctx, Result result, Throwable throwable) {
        try {
            if (throwable != null)
                onFailure(Http.Context.current(), throwable);
            else
                onDone(Http.Context.current(), result);
        } finally {
            cleanupContext(ctx);
        }
    }

    protected void onDone(Http.Context ctx, Result result) {
        if (logger.isInfoEnabled())
            logger.info("DONE  ctx:{} {}", ctx.id(), result.status());
    }

    protected void onFailure(Http.Context ctx, Throwable throwable) {
        if (logger.isErrorEnabled())
            logger.error("FAIL  ctx:{}", ctx.id(), throwable);
    }

    protected void initializeContext(Http.Context ctx) {
        // DBFlute AccessContextの設定
        AccessContext.setAccessContextOnThread(createAccessContext());
    }

    protected void cleanupContext(Http.Context ctx) {
        for (String key : Constants.CtxArgsKeys) {
            ctx.args.remove(key);
        }
    }

    protected AccessContext createAccessContext() {
        AccessContext accessContext = new AccessContext();
        accessContext.setAccessLocalDateTimeProvider(LocalDateTime::now);
        accessContext.setAccessUserProvider(() -> {
            return getAccessUser(Http.Context.current.get());
        });
        return accessContext;
    }

    protected String getAccessUser(Http.Context ctx) {
        final String user = ctx == null ? "" : ctx.request().attrs().getOptional(USERNAME).orElse(null);    // ユーザー認証されていない場合はnullとなる
        return user == null ? "unknown" : user;
    }

}
