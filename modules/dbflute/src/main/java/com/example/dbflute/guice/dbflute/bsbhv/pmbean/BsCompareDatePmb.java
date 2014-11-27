package com.example.dbflute.guice.dbflute.bsbhv.pmbean;

import java.util.*;

import org.seasar.dbflute.outsidesql.typed.*;
import org.seasar.dbflute.jdbc.*;
import org.seasar.dbflute.jdbc.ParameterUtil.ShortCharHandlingMode;
import org.seasar.dbflute.util.DfCollectionUtil;
import org.seasar.dbflute.util.DfTypeUtil;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import com.example.dbflute.guice.dbflute.allcommon.*;
import com.example.dbflute.guice.dbflute.exbhv.*;

/**
 * The base class for typed parameter-bean of CompareDate. <br />
 * This is related to "<span style="color: #AD4747">whitebox:pmbean:selectCompareDate</span>" on MemberBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsCompareDatePmb implements ExecuteHandlingPmb<MemberBhv>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of memberId:ref(MEMBER) :: refers to (会員ID)MEMBER_ID: {PK, ID, NotNull, INTEGER(10)}. */
    protected Integer _memberId;

    /** The parameter of birthdateFrom:ref(MEMBER.BIRTHDATE) :: refers to (生年月日)BIRTHDATE: {DATE(8)}. */
    protected org.joda.time.LocalDate _birthdateFrom;

    /** The parameter of formalizedDatetimeFrom:ref(MEMBER.FORMALIZED_DATETIME) :: refers to (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(23, 10)}. */
    protected org.joda.time.LocalDateTime _formalizedDatetimeFrom;

    /** The max size of safety result. */
    protected int _safetyMaxResultSize;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of CompareDate. <br />
     * This is related to "<span style="color: #AD4747">whitebox:pmbean:selectCompareDate</span>" on MemberBhv.
     */
    public BsCompareDatePmb() {
    }

    // ===================================================================================
    //                                                                Typed Implementation
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    public String getOutsideSqlPath() {
        return "whitebox:pmbean:selectCompareDate";
    }

    // ===================================================================================
    //                                                                       Safety Result
    //                                                                       =============
    /**
     * {@inheritDoc}
     */
    public void checkSafetyResult(int safetyMaxResultSize) {
        _safetyMaxResultSize = safetyMaxResultSize;
    }

    /**
     * {@inheritDoc}
     */
    public int getSafetyMaxResultSize() {
        return _safetyMaxResultSize;
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected String filterStringParameter(String value) {
        if (isEmptyStringParameterAllowed()) {
            return value;
        }
        return convertEmptyToNull(value);
    }

    protected boolean isEmptyStringParameterAllowed() {
	    return DBFluteConfig.getInstance().isEmptyStringParameterAllowed();
    }

    protected String convertEmptyToNull(String value) {
	    return ParameterUtil.convertEmptyToNull(value);
    }

    protected String handleShortChar(String propertyName, String value, Integer size) {
        ShortCharHandlingMode mode = getShortCharHandlingMode(propertyName, value, size);
        return ParameterUtil.handleShortChar(propertyName, value, size, mode);
    }

    protected ShortCharHandlingMode getShortCharHandlingMode(String propertyName, String value, Integer size) {
        return ShortCharHandlingMode.EXCEPTION;
    }

    @SuppressWarnings("unchecked")
    protected <ELEMENT> ArrayList<ELEMENT> newArrayList(ELEMENT... elements) { // might be called by option handling
        Object obj = DfCollectionUtil.newArrayList(elements);
        return (ArrayList<ELEMENT>)obj; // to avoid the warning between JDK6 and JDK7
    }

    @SuppressWarnings("unchecked")
    protected <NUMBER extends Number> NUMBER toNumber(Object obj, Class<NUMBER> type) { // might be called by option handling
        return (NUMBER)DfTypeUtil.toNumber(obj, type);
    }

    protected Boolean toBoolean(Object obj) {
        return DfTypeUtil.toBoolean(obj);
    }

    protected Date toUtilDate(Object date) {
        if (date != null && date instanceof ReadablePartial) {
            return new Date(((ReadablePartial) date).toDateTime(null).getMillis());
        } else if (date != null && date instanceof ReadableInstant) {
            return new Date(((ReadableInstant) date).getMillis());
        }
        return DfTypeUtil.toDate(date); // if sub class, re-create as pure date
    }

    @SuppressWarnings("unchecked")
    protected <DATE> DATE toLocalDate(Date date, Class<DATE> localType) {
        if (LocalDate.class.isAssignableFrom(localType)) {
            return (DATE)LocalDate.fromDateFields(date);
        } else if (LocalDateTime.class.isAssignableFrom(localType)) {
            return (DATE)LocalDateTime.fromDateFields(date);
        }
        return null; // unreachable
    }

    protected String formatUtilDate(Date date) {
        String pattern = "yyyy-MM-dd";
        return DfTypeUtil.toString(date, pattern);
    }

    protected String formatByteArray(byte[] bytes) {
        return "byte[" + (bytes != null ? String.valueOf(bytes.length) : "null") + "]";
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * @return The display string of all parameters. (NotNull)
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(DfTypeUtil.toClassTitle(this)).append(":");
        sb.append(xbuildColumnString());
        return sb.toString();
    }
    protected String xbuildColumnString() {
        final String dm = ", ";
        final StringBuilder sb = new StringBuilder();
        sb.append(dm).append(_memberId);
        sb.append(dm).append(_birthdateFrom);
        sb.append(dm).append(_formalizedDatetimeFrom);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] memberId:ref(MEMBER) :: refers to (会員ID)MEMBER_ID: {PK, ID, NotNull, INTEGER(10)} <br />
     * @return The value of memberId. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Integer getMemberId() {
        return _memberId;
    }

    /**
     * [set] memberId:ref(MEMBER) :: refers to (会員ID)MEMBER_ID: {PK, ID, NotNull, INTEGER(10)} <br />
     * @param memberId The value of memberId. (NullAllowed)
     */
    public void setMemberId(Integer memberId) {
        _memberId = memberId;
    }

    /**
     * [get] birthdateFrom:ref(MEMBER.BIRTHDATE) :: refers to (生年月日)BIRTHDATE: {DATE(8)} <br />
     * @return The value of birthdateFrom. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public org.joda.time.LocalDate getBirthdateFrom() {
        return _birthdateFrom;
    }

    /**
     * [set] birthdateFrom:ref(MEMBER.BIRTHDATE) :: refers to (生年月日)BIRTHDATE: {DATE(8)} <br />
     * @param birthdateFrom The value of birthdateFrom. (NullAllowed)
     */
    public void setBirthdateFrom(org.joda.time.LocalDate birthdateFrom) {
        _birthdateFrom = birthdateFrom;
    }

    /**
     * [get] formalizedDatetimeFrom:ref(MEMBER.FORMALIZED_DATETIME) :: refers to (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(23, 10)} <br />
     * @return The value of formalizedDatetimeFrom. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public org.joda.time.LocalDateTime getFormalizedDatetimeFrom() {
        return _formalizedDatetimeFrom;
    }

    /**
     * [set] formalizedDatetimeFrom:ref(MEMBER.FORMALIZED_DATETIME) :: refers to (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(23, 10)} <br />
     * @param formalizedDatetimeFrom The value of formalizedDatetimeFrom. (NullAllowed)
     */
    public void setFormalizedDatetimeFrom(org.joda.time.LocalDateTime formalizedDatetimeFrom) {
        _formalizedDatetimeFrom = formalizedDatetimeFrom;
    }
}
