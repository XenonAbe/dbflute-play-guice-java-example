package test.controllers;

import com.google.common.collect.ImmutableMap;
import org.junit.Test;
import play.mvc.Result;
import play.test.FakeRequest;
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
        final FakeRequest request = Helpers.fakeRequest(GET, "/");

        Result result = route(request);
        assertEquals(OK, Helpers.status(result));
    }

    @Test
    public void testListWidget() {
        final FakeRequest request = Helpers.fakeRequest(GET, "/widgets");

        Result result = route(request);
        assertEquals(OK, Helpers.status(result));
    }

    @Test
    public void testCreateWidget() {
        final FakeRequest request = Helpers.fakeRequest(POST, "/widgets")
                .withFormUrlEncodedBody(ImmutableMap.of("name","widget 6", "price", "6"));

        Result result = route(request);
        assertEquals(FORBIDDEN, Helpers.status(result));    // Reject by CSRF Filter
    }

}
