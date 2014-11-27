import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.seasar.dbflute.AccessContext;
import org.seasar.dbflute.AccessContext.AccessContextHolder;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.AnnotationTransactionAttributeSource;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionInterceptor;

import play.Application;
import play.GlobalSettings;
import play.Logger;
import play.Logger.ALogger;
import play.db.DB;
import play.libs.F;
import play.mvc.Action;
import play.mvc.Http;
import play.mvc.Http.Context;
import play.mvc.Http.Request;
import play.mvc.Result;

import com.example.dbflute.guice.dbflute.allcommon.DBFluteModule;
import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.Stage;
import com.google.inject.matcher.Matchers;

public class Global extends GlobalSettings {
    @SuppressWarnings("unused")
	private static final ALogger logger = Logger.of(Application.class);

    private static Injector INJECTOR;

    /* (非 Javadoc)
     * @see play.GlobalSettings#onStart(play.Application)
     */
    @Override
    public void onStart(Application app) {
        super.onStart(app);

        // DI初期化
        List<Module> moduleList = new ArrayList<Module>();

        DataSource dataSource = DB.getDataSource();
        moduleList.add(new TransactionModule(dataSource));
        moduleList.add(new DBFluteModule(new TransactionAwareDataSourceProxy(dataSource)));

        // DBFlute AccessContext の設定
        AccessContext.unlock();
        AccessContext.useSurrogateHolder(new AccessContextHolder() {
            private static final String CTX_ARG_ACCESS_CONTEXT = "CTX_ARG_ACCESS_CONTEXT";

            @Override
            public void save(AccessContext accessContext) {
                Context ctx = Http.Context.current();
                ctx.args.put(CTX_ARG_ACCESS_CONTEXT, accessContext);
            }

            @Override
            public AccessContext provide() {
                Context ctx = Http.Context.current();
                AccessContext accessContext = (AccessContext)ctx.args.get(CTX_ARG_ACCESS_CONTEXT);
                return accessContext;
            }
        });
        AccessContext.lock();

        // Create Injector
        if (app.isProd())
        	INJECTOR = Guice.createInjector(Stage.PRODUCTION, moduleList.toArray(new Module[] {}));
        else
        	INJECTOR = Guice.createInjector(Stage.DEVELOPMENT, moduleList.toArray(new Module[] {}));
    }

    /* (非 Javadoc)
     * @see play.GlobalSettings#getControllerInstance(java.lang.Class)
     */
    @Override
    public <A> A getControllerInstance(Class<A> controllerClass) throws Exception {
        A controller = INJECTOR.getInstance(controllerClass);
        return controller;
    }

    /* (非 Javadoc)
     * @see play.GlobalSettings#onRequest(play.mvc.Http.Request, java.lang.reflect.Method)
     */
    @Override
    @SuppressWarnings("rawtypes")
    public Action onRequest(Request request, Method actionMethod) {
        final String controllerName = actionMethod.getDeclaringClass().getSimpleName();

        return new Action.Simple() {
            private final String _controllerName = controllerName;

            public F.Promise<Result> call(Context ctx) throws Throwable {
                // DBFlute AccessContextの設定
                AccessContext accessContext = new AccessContext();
                AccessContext.setAccessContextOnThread(accessContext);
                accessContext.setAccessUser("EXAMPLE_USER");
                accessContext.setAccessProcess(_controllerName);

                return delegate.call(ctx);
            }
        };
    }

    /**
     * トランザクション制御用のGuiceモジュール
     */
    protected static class TransactionModule extends AbstractModule {

        protected DataSource dataSource;

        public TransactionModule(DataSource dataSource) {
            if (dataSource == null) {
                String msg = "The argument 'dataSource' should not be null!";
                throw new IllegalArgumentException(msg);
            }
            this.dataSource = dataSource;
        }

        @Override
        protected void configure() {
            // TransactionManager
            PlatformTransactionManager transactionManager = new DataSourceTransactionManager(dataSource);

            // TransactionInterceptor
            TransactionInterceptor transactionInterceptor = new TransactionInterceptor(transactionManager, new AnnotationTransactionAttributeSource(false));

            bindInterceptor(Matchers.any(), Matchers.annotatedWith(Transactional.class), transactionInterceptor);

            bind(PlatformTransactionManager.class).toInstance(transactionManager);
        }
    }
}
