package app.db;

import app.core.Constants;
import com.google.inject.AbstractModule;
import com.google.inject.Provider;
import org.seasar.dbflute.AccessContext;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;
import play.Application;
import play.Play;
import play.db.DB;
import play.libs.F;
import play.mvc.Http;

import javax.sql.DataSource;

public class DBFluteModule extends AbstractModule {

    private final F.Function<DataSource, AbstractModule> createActualDBFluteModuleFunction;

    public DBFluteModule() {
        this(null);
    }

    public DBFluteModule(F.Function<DataSource, AbstractModule> createActualDBFluteModuleFunction) {
        this.createActualDBFluteModuleFunction = createActualDBFluteModuleFunction;
    }

    @Override
    protected void configure() {
        setupAccessContextHolder(new Provider<Application>() {
            @Override
            public Application get() {
                return Play.application();
            }
        });

        final DataSource dataSource = DB.getDataSource();

        final TransactionAwareDataSourceProxy dataSourceProxy = new TransactionAwareDataSourceProxy(dataSource);

        final AbstractModule dbFluteModule = createActualDBFluteModule(dataSourceProxy);

        dbFluteModule.configure(binder());
    }

    protected AbstractModule createActualDBFluteModule(DataSource dataSource) {
        if (createActualDBFluteModuleFunction != null) {
            try {
                return createActualDBFluteModuleFunction.apply(dataSource);
            } catch (RuntimeException ex) {
                throw ex;
            } catch (Throwable throwable) {
                throw new RuntimeException(throwable);
            }
        } else {
            // TODO load from application.conf
            throw new UnsupportedOperationException();
        }
    }

    /**
     * DBFlute AccessContextHolder の設定
     */
    private void setupAccessContextHolder(final Provider<Application> applicationProvider) {
        AccessContext.unlock();
        AccessContext.useSurrogateHolder(createAccessContextHolder(applicationProvider));
        AccessContext.lock();
    }

    protected AccessContext.AccessContextHolder createAccessContextHolder(final Provider<Application> applicationProvider) {
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

