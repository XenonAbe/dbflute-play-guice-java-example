package app.db;

import play.api.db.Database;

import javax.inject.Provider;
import javax.sql.DataSource;

class TransactionAwareDataSourceProxy extends org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy {

    private final Provider<Database> databaseProvider;

    public TransactionAwareDataSourceProxy(Provider<Database> databaseProvider) {
        this.databaseProvider = databaseProvider;
    }

    @Override
    public void setTargetDataSource(DataSource targetDataSource) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DataSource getTargetDataSource() {
        return databaseProvider.get().dataSource();
    }

}
