package app.http;

import play.filters.csrf.CSRFFilter;
import play.http.DefaultHttpFilters;

import javax.inject.Inject;

public class Filters extends DefaultHttpFilters {

    @Inject
    public Filters(CSRFFilter csrfFilter) {
        super(csrfFilter);
    }

}
