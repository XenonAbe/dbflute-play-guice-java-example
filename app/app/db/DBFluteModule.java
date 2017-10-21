package app.db;

import app.core.Constants;
import com.google.inject.AbstractModule;
import org.seasar.dbflute.AccessContext;
import play.Application;
import play.api.db.Database;
import play.mvc.Http;

import javax.inject.Provider;
import javax.sql.DataSource;
import java.util.function.Function;

public class DBFluteModule extends AbstractModule {

    private final Function<DataSource, AbstractModule> createActualDBFluteModuleFunction;

    public DBFluteModule() {
        this(null);
    }

    public DBFluteModule(Function<DataSource, AbstractModule> createActualDBFluteModuleFunction) {
        this.createActualDBFluteModuleFunction = createActualDBFluteModuleFunction;
    }

    @Override
    protected void configure() {
        setupAccessContextHolder(getProvider(Application.class));

        final TransactionAwareDataSourceProxy dataSourceProxy = new TransactionAwareDataSourceProxy(getProvider(Database.class));

        final AbstractModule dbFluteModule = createActualDBFluteModule(dataSourceProxy);

        dbFluteModule.configure(binder());
    }

    protected AbstractModule createActualDBFluteModule(DataSource dataSource) {
        if (createActualDBFluteModuleFunction != null) {
            return createActualDBFluteModuleFunction.apply(dataSource);
        } else {
            // TODO load from application.conf
            throw new UnsupportedOperationException();
        }
    }

    /**
     * DBFlute AccessContextHolder の設定
     */
    private void setupAccessContextHolder(Provider<Application> applicationProvider) {
        AccessContext.unlock();
        AccessContext.useSurrogateHolder(createAccessContextHolder(applicationProvider));
        AccessContext.lock();
    }

    protected AccessContext.AccessContextHolder createAccessContextHolder(Provider<Application> applicationProvider) {
        return new AccessContextHolder(applicationProvider);
    }

    /**
     * DBFlute AccessContextHolder
     * Http.ContextにAccessContextを保持する
     * ただし、Test時でHttp.Contextが存在しない場合はThreadLocalに保持する
     */
    protected static class AccessContextHolder implements AccessContext.AccessContextHolder {
        protected static final ThreadLocal<AccessContext> threadLocalAccessContext = new ThreadLocal<AccessContext>();

        private final Provider<Application> applicationProvider;

        public AccessContextHolder(Provider<Application> applicationProvider) {
            this.applicationProvider = applicationProvider;
        }

        @Override
        public void save(AccessContext accessContext) {
            if (Http.Context.current.get() == null) {
                final Application application = applicationProvider.get();
                if (application.isTest()) {
                    threadLocalAccessContext.set(accessContext);
                    return;
                }
            }
            Http.Context.current().args.put(Constants.CTX_ARGS_KEY_ACCESS_CONTEXT, accessContext);
        }

        @Override
        public AccessContext provide() {
            if (Http.Context.current.get() == null) {
                final Application application = applicationProvider.get();
                if (application.isTest()) {
                    return threadLocalAccessContext.get();
                }
            }
            return (AccessContext)Http.Context.current().args.get(Constants.CTX_ARGS_KEY_ACCESS_CONTEXT);
        }
    }
}

