package utils;

import org.seasar.dbflute.AccessContext;

public class DBFluteTestUtils {

    public static void setAccessContextInTest() {
        // DBFlute AccessContextの設定
        AccessContext accessContext = new AccessContext();
        accessContext.setAccessUser("TESTUSER");
        AccessContext.setAccessContextOnThread(accessContext);
    }

}
