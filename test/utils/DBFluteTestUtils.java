package utils;

import org.dbflute.hook.AccessContext;

import java.time.LocalDateTime;

public class DBFluteTestUtils {

    public static void setAccessContextInTest() {
        // DBFlute AccessContextの設定
        AccessContext accessContext = new AccessContext();
        accessContext.setAccessLocalDateTimeProvider(LocalDateTime::now);
        accessContext.setAccessUser("TESTUSER");
        AccessContext.setAccessContextOnThread(accessContext);
    }

}
