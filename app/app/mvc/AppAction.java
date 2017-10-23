package app.mvc;

import app.core.Constants;
import org.seasar.dbflute.AccessContext;
import play.Logger;
import play.libs.F;
import play.mvc.Action;
import play.mvc.Http;
import play.mvc.Result;

import java.lang.reflect.Method;

public class AppAction extends Action.Simple {
    private static final Logger.ALogger logger = Logger.of(AppAction.class);

    protected final Method actionMethod;

    public AppAction(Method actionMethod) {
        this.actionMethod = actionMethod;
    }

    @Override
    public F.Promise<Result> call(final Http.Context ctx) throws Throwable {
        F.Promise<Result> resultPromise;
        try {
            onBegin(ctx);
            try {
                resultPromise = delegate.call(ctx);
                if (logger.isInfoEnabled() && !resultPromise.wrapped().isCompleted())
                    logger.info("ASYNC ctx:{}", ctx.id());
            } catch(Throwable t) {
                resultPromise = F.Promise.pure(handleException(ctx, t));
            }
        } catch(Throwable t) {
            onComplete(ctx, null, t);
            throw t;
        }

        resultPromise = resultPromise.recover(new F.Function<Throwable, Result>() {
            @Override
            public Result apply(Throwable throwable) throws Throwable {
                final Http.Context oldCtx = Http.Context.current.get();
                if (oldCtx == null) Http.Context.current.set(ctx);
                try {
                    return handleException(Http.Context.current(), throwable);
                } finally {
                    Http.Context.current.set(oldCtx);
                }
            }
        });

        resultPromise.onFailure(new F.Callback<Throwable>() {
            @Override
            public void invoke(Throwable throwable) throws Throwable {
                final Http.Context oldCtx = Http.Context.current.get();
                if (oldCtx == null) Http.Context.current.set(ctx);
                try {
                    onComplete(Http.Context.current(), null, throwable);
                } finally {
                    Http.Context.current.set(oldCtx);
                }
            }
        });

        resultPromise.onRedeem(new F.Callback<Result>() {
            @Override
            public void invoke(Result result) throws Throwable {
                final Http.Context oldCtx = Http.Context.current.get();
                if (oldCtx == null) Http.Context.current.set(ctx);
                try {
                    onComplete(Http.Context.current(), result, null);
                } finally {
                    Http.Context.current.set(oldCtx);
                }
            }
        });

        return resultPromise;
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
            logger.info("DONE  ctx:{} {}", ctx.id(), result.toScala().header().status());
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
        final AppAction that = this;
        AccessContext accessContext = new AccessContext();
        accessContext.setAccessUserProvider(new AccessContext.AccessUserProvider() {
            @Override
            public String getAccessUser() {
                return that.getAccessUser(Http.Context.current.get());
            }
        });
        return accessContext;
    }

    protected String getAccessUser(Http.Context ctx) {
        final String user = ctx == null ? "" : ctx.request().username();    // ユーザー認証されていない場合はnullとなる
        return user == null ? "unknown" : user;
    }

}
