package app.http;

import app.mvc.AppAction;
import play.http.HttpRequestHandler;
import play.mvc.Action;
import play.mvc.Http;

import java.lang.reflect.Method;

public class RequestHandler implements HttpRequestHandler {

    @Override
    public Action createAction(Http.Request request, Method actionMethod) {
        return new AppAction(actionMethod);
    }

    @Override
    public Action wrapAction(Action action) {
        return action;
    }
}
