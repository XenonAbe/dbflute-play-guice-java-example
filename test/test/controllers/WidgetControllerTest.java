package test.controllers;

import com.google.common.collect.ImmutableMap;
import org.junit.Test;
import play.mvc.Http;
import play.mvc.Result;
import play.test.Helpers;
import play.test.WithApplication;

import static org.junit.Assert.assertEquals;
import static play.mvc.Http.Status.OK;
import static play.test.Helpers.*;

/**
 * Tests form processing.
 *
 * https://www.playframework.com/documentation/latest/JavaFunctionalTest
 */
public class WidgetControllerTest extends WithApplication {

    @Test
    public void testIndex() {
        final Http.RequestBuilder request = Helpers.fakeRequest()
                .method(GET)
                .uri("/");

        Result result = route(request);
        assertEquals(OK, result.status());
    }

    @Test
    public void testListWidget() {
        final Http.RequestBuilder request = Helpers.fakeRequest()
                .method(GET)
                .uri("/widgets");

        Result result = route(request);
        assertEquals(OK, result.status());
    }

    @Test
    public void testCreateWidget() {
        final Http.RequestBuilder request = Helpers.fakeRequest()
                .method(POST)
                .uri("/widgets")
                .bodyForm(ImmutableMap.of("name","widget 6", "price", "6"));

        Result result = route(request);
        assertEquals(FORBIDDEN, result.status());    // Reject by CSRF Filter
    }

}
