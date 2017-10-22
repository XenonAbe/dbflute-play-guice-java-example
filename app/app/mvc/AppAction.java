package app.mvc;

import app.core.Constants;
import org.dbflute.hook.AccessContext;
import play.Logger;
import play.libs.F;
import play.mvc.Action;
import play.mvc.Http;
import play.mvc.Result;

import java.lang.reflect.Method;
import java.time.LocalDateTime;

public class AppAction extends Action.Simple {
    private static final Logger.ALogger logger = Logger.of(AppAction.class);

    protected final Method actionMethod;

    public AppAction(Method actionMethod) {
        this.actionMethod = actionMethod;
    }

    @Override
    public F.Promise<Result> call(Http.Context ctx) throws Throwable {
        try {
            try {
                initializeContext(ctx);
                return delegate.call(ctx);
            } finally {
                cleanupContext(ctx);
            }
        } catch(RuntimeException e) {
            throw e;
        } catch(Throwable t) {
            throw new RuntimeException(t);
        }
    }

    protected void initializeContext(Http.Context ctx) {
        if (logger.isInfoEnabled())
            logger.info("BEGIN ctx:{} {} {}", ctx.id(), ctx.request().method(), ctx.request().uri());

        // DBFlute AccessContextの設定
        AccessContext.setAccessContextOnThread(createAccessContext());
    }

    protected void cleanupContext(Http.Context ctx) {
        for (String key : Constants.CtxArgsKeys) {
            ctx.args.remove(key);
        }

        if (logger.isInfoEnabled())
            logger.info("END   ctx:{}", ctx.id());
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
        final String user = ctx == null ? "" : ctx.request().username();    // ユーザー認証されていない場合はnullとなる
        return user == null ? "unknown" : user;
    }

}
