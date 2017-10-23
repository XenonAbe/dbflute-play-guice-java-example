package test.controllers;

import org.junit.Test;
import play.mvc.Result;
import play.test.FakeRequest;
import play.test.Helpers;
import play.test.WithApplication;

import static org.junit.Assert.assertEquals;
import static play.mvc.Http.Status.OK;
import static play.test.Helpers.GET;
import static play.test.Helpers.route;

public class AsyncControllerTest extends WithApplication {

    /**
     * 非同期にデータベースにInsert
     * Http.Context から AccessContext が取得出来ないとエラーとなる
     */
    @Test
    public void testInsert() {
        final FakeRequest request = Helpers.fakeRequest(GET, "/insert");

        Result result = route(request);
        assertEquals(OK, Helpers.status(result));
    }

}
