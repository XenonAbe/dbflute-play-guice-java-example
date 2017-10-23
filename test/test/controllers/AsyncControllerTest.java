package test.controllers;

import org.junit.Test;
import play.mvc.Http;
import play.mvc.Result;
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
        final Http.RequestBuilder request = Helpers.fakeRequest()
                .method(GET)
                .uri("/insert");

        Result result = route(request);
        assertEquals(OK, result.status());
    }

}
