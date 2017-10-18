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
 * The base class for typed parameter-bean of ResolvedPackageName. <br />
 * This is related to "<span style="color: #AD4747">whitebox:pmbean:selectResolvedPackageName</span>" on MemberBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsResolvedPackageNamePmb implements ExecuteHandlingPmb<MemberBhv>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of string1. */
    protected String _string1;

    /** The parameter of integer1. */
    protected Integer _integer1;

    /** The parameter of bigDecimal1. */
    protected java.math.BigDecimal _bigDecimal1;

    /** The parameter of bigDecimal2. */
    protected java.math.BigDecimal _bigDecimal2;

    /** The parameter of date1. */
    protected org.joda.time.LocalDate _date1;

    /** The parameter of date2. */
    protected java.util.Date _date2;

    /** The parameter of date3. */
    protected java.sql.Date _date3;

    /** The parameter of time1. */
    protected java.sql.Time _time1;

    /** The parameter of time2. */
    protected java.sql.Time _time2;

    /** The parameter of timestamp1. */
    protected org.joda.time.LocalDateTime _timestamp1;

    /** The parameter of timestamp2. */
    protected java.sql.Timestamp _timestamp2;

    /** The parameter of list1. */
    protected List<String> _list1;

    /** The parameter of list2. */
    protected java.util.List<String> _list2;

    /** The parameter of map1. */
    protected Map<String, String> _map1;

    /** The parameter of map2. */
    protected java.util.Map<String, String> _map2;

    /** The parameter of cdef. */
    protected com.example.dbflute.guice.dbflute.allcommon.CDef _cdef;

    /** The parameter of cdefFlg. */
    protected com.example.dbflute.guice.dbflute.allcommon.CDef.Flg _cdefFlg;

    /** The parameter of bytes. */
    protected byte[] _bytes;

    /** The max size of safety result. */
    protected int _safetyMaxResultSize;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of ResolvedPackageName. <br />
     * This is related to "<span style="color: #AD4747">whitebox:pmbean:selectResolvedPackageName</span>" on MemberBhv.
     */
    public BsResolvedPackageNamePmb() {
    }

    // ===================================================================================
    //                                                                Typed Implementation
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    public String getOutsideSqlPath() {
        return "whitebox:pmbean:selectResolvedPackageName";
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
        sb.append(dm).append(_string1);
        sb.append(dm).append(_integer1);
        sb.append(dm).append(_bigDecimal1);
        sb.append(dm).append(_bigDecimal2);
        sb.append(dm).append(_date1);
        sb.append(dm).append(formatUtilDate(_date2));
        sb.append(dm).append(_date3);
        sb.append(dm).append(_time1);
        sb.append(dm).append(_time2);
        sb.append(dm).append(_timestamp1);
        sb.append(dm).append(_timestamp2);
        sb.append(dm).append(_list1);
        sb.append(dm).append(_list2);
        sb.append(dm).append(_map1);
        sb.append(dm).append(_map2);
        sb.append(dm).append(_cdef);
        sb.append(dm).append(_cdefFlg);
        sb.append(dm).append(formatByteArray(_bytes));
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] string1 <br />
     * @return The value of string1. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getString1() {
        return filterStringParameter(_string1);
    }

    /**
     * [set] string1 <br />
     * @param string1 The value of string1. (NullAllowed)
     */
    public void setString1(String string1) {
        _string1 = string1;
    }

    /**
     * [get] integer1 <br />
     * @return The value of integer1. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Integer getInteger1() {
        return _integer1;
    }

    /**
     * [set] integer1 <br />
     * @param integer1 The value of integer1. (NullAllowed)
     */
    public void setInteger1(Integer integer1) {
        _integer1 = integer1;
    }

    /**
     * [get] bigDecimal1 <br />
     * @return The value of bigDecimal1. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.math.BigDecimal getBigDecimal1() {
        return _bigDecimal1;
    }

    /**
     * [set] bigDecimal1 <br />
     * @param bigDecimal1 The value of bigDecimal1. (NullAllowed)
     */
    public void setBigDecimal1(java.math.BigDecimal bigDecimal1) {
        _bigDecimal1 = bigDecimal1;
    }

    /**
     * [get] bigDecimal2 <br />
     * @return The value of bigDecimal2. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.math.BigDecimal getBigDecimal2() {
        return _bigDecimal2;
    }

    /**
     * [set] bigDecimal2 <br />
     * @param bigDecimal2 The value of bigDecimal2. (NullAllowed)
     */
    public void setBigDecimal2(java.math.BigDecimal bigDecimal2) {
        _bigDecimal2 = bigDecimal2;
    }

    /**
     * [get] date1 <br />
     * @return The value of date1. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public org.joda.time.LocalDate getDate1() {
        return _date1;
    }

    /**
     * [set] date1 <br />
     * @param date1 The value of date1. (NullAllowed)
     */
    public void setDate1(org.joda.time.LocalDate date1) {
        _date1 = date1;
    }

    /**
     * [get] date2 <br />
     * @return The value of date2. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.util.Date getDate2() {
        return toUtilDate(_date2);
    }

    /**
     * [set] date2 <br />
     * @param date2 The value of date2. (NullAllowed)
     */
    public void setDate2(java.util.Date date2) {
        _date2 = date2;
    }

    /**
     * [get] date3 <br />
     * @return The value of date3. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.sql.Date getDate3() {
        return _date3;
    }

    /**
     * [set] date3 <br />
     * @param date3 The value of date3. (NullAllowed)
     */
    public void setDate3(java.sql.Date date3) {
        _date3 = date3;
    }

    /**
     * [get] time1 <br />
     * @return The value of time1. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.sql.Time getTime1() {
        return _time1;
    }

    /**
     * [set] time1 <br />
     * @param time1 The value of time1. (NullAllowed)
     */
    public void setTime1(java.sql.Time time1) {
        _time1 = time1;
    }

    /**
     * [get] time2 <br />
     * @return The value of time2. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.sql.Time getTime2() {
        return _time2;
    }

    /**
     * [set] time2 <br />
     * @param time2 The value of time2. (NullAllowed)
     */
    public void setTime2(java.sql.Time time2) {
        _time2 = time2;
    }

    /**
     * [get] timestamp1 <br />
     * @return The value of timestamp1. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public org.joda.time.LocalDateTime getTimestamp1() {
        return _timestamp1;
    }

    /**
     * [set] timestamp1 <br />
     * @param timestamp1 The value of timestamp1. (NullAllowed)
     */
    public void setTimestamp1(org.joda.time.LocalDateTime timestamp1) {
        _timestamp1 = timestamp1;
    }

    /**
     * [get] timestamp2 <br />
     * @return The value of timestamp2. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.sql.Timestamp getTimestamp2() {
        return _timestamp2;
    }

    /**
     * [set] timestamp2 <br />
     * @param timestamp2 The value of timestamp2. (NullAllowed)
     */
    public void setTimestamp2(java.sql.Timestamp timestamp2) {
        _timestamp2 = timestamp2;
    }

    /**
     * [get] list1 <br />
     * @return The value of list1. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public List<String> getList1() {
        return _list1;
    }

    /**
     * [set] list1 <br />
     * @param list1 The value of list1. (NullAllowed)
     */
    public void setList1(List<String> list1) {
        _list1 = list1;
    }

    /**
     * [get] list2 <br />
     * @return The value of list2. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.util.List<String> getList2() {
        return _list2;
    }

    /**
     * [set] list2 <br />
     * @param list2 The value of list2. (NullAllowed)
     */
    public void setList2(java.util.List<String> list2) {
        _list2 = list2;
    }

    /**
     * [get] map1 <br />
     * @return The value of map1. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Map<String, String> getMap1() {
        return _map1;
    }

    /**
     * [set] map1 <br />
     * @param map1 The value of map1. (NullAllowed)
     */
    public void setMap1(Map<String, String> map1) {
        _map1 = map1;
    }

    /**
     * [get] map2 <br />
     * @return The value of map2. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.util.Map<String, String> getMap2() {
        return _map2;
    }

    /**
     * [set] map2 <br />
     * @param map2 The value of map2. (NullAllowed)
     */
    public void setMap2(java.util.Map<String, String> map2) {
        _map2 = map2;
    }

    /**
     * [get] cdef <br />
     * @return The value of cdef. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public com.example.dbflute.guice.dbflute.allcommon.CDef getCdef() {
        return _cdef;
    }

    /**
     * [set] cdef <br />
     * @param cdef The value of cdef. (NullAllowed)
     */
    public void setCdef(com.example.dbflute.guice.dbflute.allcommon.CDef cdef) {
        _cdef = cdef;
    }

    /**
     * [get] cdefFlg <br />
     * @return The value of cdefFlg. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public com.example.dbflute.guice.dbflute.allcommon.CDef.Flg getCdefFlg() {
        return _cdefFlg;
    }

    /**
     * [set] cdefFlg <br />
     * @param cdefFlg The value of cdefFlg. (NullAllowed)
     */
    public void setCdefFlg(com.example.dbflute.guice.dbflute.allcommon.CDef.Flg cdefFlg) {
        _cdefFlg = cdefFlg;
    }

    /**
     * [get] bytes <br />
     * @return The value of bytes. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public byte[] getBytes() {
        return _bytes;
    }

    /**
     * [set] bytes <br />
     * @param bytes The value of bytes. (NullAllowed)
     */
    public void setBytes(byte[] bytes) {
        _bytes = bytes;
    }
}
