package utils;

import play.api.GlobalSettings;

public class TestUtils {

    public static <T> T instanceOf(play.test.FakeApplication app, Class<T> type) {
        return app.injector().instanceOf(type);
    }

    public static String getMethodName() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}
