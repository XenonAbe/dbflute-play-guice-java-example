import app.db.AppDBFluteModule;
import app.db.TransactionModule;
import app.mvc.AppAction;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.Stage;
import play.Application;
import play.GlobalSettings;
import play.Logger;
import play.Logger.ALogger;
import play.api.mvc.EssentialFilter;
import play.filters.csrf.CSRFFilter;
import play.mvc.Action;
import play.mvc.Http.Request;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Global extends GlobalSettings {
    @SuppressWarnings("unused")
	private static final ALogger logger = Logger.of("application");

    private static Injector INJECTOR;

    @Override
    public void onStart(Application app) {
        logger.info("Start Application");

        super.onStart(app);

        // DI初期化
        List<Module> moduleList = new ArrayList<Module>();

        moduleList.add(new TransactionModule());
        moduleList.add(new AppDBFluteModule());

        // Create Injector
        if (app.isProd())
        	INJECTOR = Guice.createInjector(Stage.PRODUCTION, moduleList.toArray(new Module[] {}));
        else
        	INJECTOR = Guice.createInjector(Stage.DEVELOPMENT, moduleList.toArray(new Module[] {}));
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Action onRequest(Request request, Method actionMethod) {
        return new AppAction(actionMethod);
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T extends EssentialFilter> Class<T>[] filters() {
        return new Class[]{CSRFFilter.class};
    }
}
