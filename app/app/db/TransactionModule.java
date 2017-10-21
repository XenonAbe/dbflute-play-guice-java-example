package app.db;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.AnnotationTransactionAttributeSource;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAttributeSource;
import org.springframework.transaction.interceptor.TransactionInterceptor;
import play.api.db.Database;

import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;

public class TransactionModule extends AbstractModule {

    @Override
    protected void configure() {
        // TransactionManager
        bind(PlatformTransactionManager.class).toProvider(getPlatformTransactionManagerType()).in(Singleton.class);

        // TransactionInterceptor
        final TransactionInterceptor transactionInterceptor = new TransactionInterceptorEx(getProvider(PlatformTransactionManager.class), new AnnotationTransactionAttributeSource(false));
        bindInterceptor(Matchers.any(), Matchers.annotatedWith(Transactional.class), transactionInterceptor);
    }

    protected Class<? extends Provider<? extends PlatformTransactionManager>> getPlatformTransactionManagerType() {
        return PlatformTransactionManagerProvider.class;
    }

    protected static class PlatformTransactionManagerProvider implements Provider<PlatformTransactionManager> {
        private final Database db;

        @Inject
        public PlatformTransactionManagerProvider(Database db) {
            this.db = db;
        }

        @Override
        public PlatformTransactionManager get() {
            return new TransactionManagerWithDBFlute(db.dataSource());
        }
    }

    protected static class TransactionInterceptorEx extends TransactionInterceptor {
        private final Provider<PlatformTransactionManager> transactionManagerProvider;

        protected TransactionInterceptorEx(Provider<PlatformTransactionManager> ptmp, TransactionAttributeSource tas) {
            setTransactionAttributeSource(tas);
            transactionManagerProvider = ptmp;
        }

        @Override
        public Object invoke(MethodInvocation invocation) throws Throwable {
            setTransactionManager(transactionManagerProvider.get());
            return super.invoke(invocation);
        }
    }

}
