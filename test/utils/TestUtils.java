package utils;

import play.Application;

public class TestUtils {

    public static <T> T instanceOf(Application app, Class<T> type) {
        return app.injector().instanceOf(type);
    }

    public static String getMethodName() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}
