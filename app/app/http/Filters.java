package app.http;

import play.api.mvc.EssentialFilter;
import play.filters.csrf.CSRFFilter;
import play.http.HttpFilters;

import javax.inject.Inject;

public class Filters implements HttpFilters {

    private final CSRFFilter csrf;

    @Inject
    public Filters(CSRFFilter csrf) {
        this.csrf = csrf;
    }

    @Override
    public EssentialFilter[] filters() {
        return new EssentialFilter[] { csrf };
    }
}
