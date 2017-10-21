package app.db;

public class AppDBFluteModule extends DBFluteModule {

    public AppDBFluteModule() {
        super(dataSource -> new dbflute.allcommon.DBFluteModule(dataSource));
    }
}
