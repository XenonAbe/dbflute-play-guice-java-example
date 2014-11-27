package com.example.dbflute.guice.dbflute.nogen;

import java.util.Date;

import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.seasar.dbflute.util.DfTypeUtil;

/**
 * @author jflute
 */
public class JodaUtil {

    public static LocalDate toLocalDate(Date date) {
        return date != null ? LocalDate.fromDateFields(date) : null;
    }

    public static LocalDateTime toLocalDateTime(Date date) {
        return date != null ? LocalDateTime.fromDateFields(date) : null;
    }

    public static Date toUtilDate(Object date) {
        if (date != null && date instanceof ReadablePartial) {
            return new Date(((ReadablePartial) date).toDateTime(null).getMillis());
        } else if (date != null && date instanceof ReadableInstant) {
            return new Date(((ReadableInstant) date).getMillis());
        }
        return DfTypeUtil.toDate(date);
    }
}
