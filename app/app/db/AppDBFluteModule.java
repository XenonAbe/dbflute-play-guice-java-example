package app.db;

import com.google.inject.AbstractModule;
import play.libs.F;

import javax.sql.DataSource;

public class AppDBFluteModule extends DBFluteModule {

    public AppDBFluteModule() {
        super(new F.Function<DataSource, AbstractModule>() {
            @Override
            public AbstractModule apply(DataSource dataSource) throws Throwable {
                return new dbflute.allcommon.DBFluteModule(dataSource);
            }
        });
    }
}
