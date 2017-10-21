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
    private static final Logger.ALogger logger = Logger.of("application");

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
        AccessContext accessContext = new AccessContext();
        accessContext.setAccessUserProvider(new AccessContext.AccessUserProvider() {
            @Override
            public String getAccessUser() {
                final Http.Context ctx = Http.Context.current.get();
                final String user = ctx == null ? "" : ctx.request().username();
                return user == null ? "unknown" : user;
            }
        });

        AccessContext.setAccessContextOnThread(accessContext);
    }

    protected void cleanupContext(Http.Context ctx) {
        for (String key : Constants.CtxArgsKeys) {
            ctx.args.remove(key);
        }

        if (logger.isInfoEnabled())
            logger.info("END   ctx:{}", ctx.id());
    }

}
