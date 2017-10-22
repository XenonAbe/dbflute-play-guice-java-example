package app.http;

import app.mvc.AppAction;
import play.Application;
import play.mvc.Action;
import play.mvc.Http;

import javax.inject.Inject;
import javax.inject.Provider;
import java.lang.reflect.Method;

public class AppActionCreator implements  play.http.ActionCreator {

    protected final Provider<Application> applicationProvider;

    @Inject
    public AppActionCreator(Provider<Application> applicationProvider) {
        this.applicationProvider = applicationProvider;
    }

    @Override
    public Action createAction(Http.Request request, Method actionMethod) {
        return new AppAction(applicationProvider.get(), actionMethod);
    }
}
