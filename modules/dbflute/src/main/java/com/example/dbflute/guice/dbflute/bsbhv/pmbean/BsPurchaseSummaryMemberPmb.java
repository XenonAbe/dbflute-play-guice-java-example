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
 * The base class for typed parameter-bean of PurchaseSummaryMember. <br />
 * This is related to "<span style="color: #AD4747">selectPurchaseSummaryMember</span>" on MemberBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsPurchaseSummaryMemberPmb implements CursorHandlingPmb<MemberBhv, Void>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of memberStatusCode:cls(MemberStatus). */
    protected String _memberStatusCode;

    /** The parameter of formalizedDatetime. */
    protected org.joda.time.LocalDateTime _formalizedDatetime;

    /** The max size of safety result. */
    protected int _safetyMaxResultSize;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of PurchaseSummaryMember. <br />
     * This is related to "<span style="color: #AD4747">selectPurchaseSummaryMember</span>" on MemberBhv.
     */
    public BsPurchaseSummaryMemberPmb() {
    }

    // ===================================================================================
    //                                                                Typed Implementation
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    public String getOutsideSqlPath() {
        return "selectPurchaseSummaryMember";
    }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, cursor handling. (NotNull)
     */
    public Class<Void> getEntityType() {
        return Void.class;
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
        sb.append(dm).append(_memberStatusCode);
        sb.append(dm).append(_formalizedDatetime);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] memberStatusCode:cls(MemberStatus) <br />
     * @return The value of memberStatusCode. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getMemberStatusCode() {
        return filterStringParameter(_memberStatusCode);
    }

    /**
     * [set as Formalized] memberStatusCode:cls(MemberStatus) <br />
     * as formal member, allowed to use all service
     */
    public void setMemberStatusCode_Formalized() {
        _memberStatusCode = CDef.MemberStatus.Formalized.code();
    }

    /**
     * [set as Withdrawal] memberStatusCode:cls(MemberStatus) <br />
     * withdrawal is fixed, not allowed to use service
     */
    public void setMemberStatusCode_Withdrawal() {
        _memberStatusCode = CDef.MemberStatus.Withdrawal.code();
    }

    /**
     * [set as Provisional] memberStatusCode:cls(MemberStatus) <br />
     * first status after entry, allowed to use only part of service
     */
    public void setMemberStatusCode_Provisional() {
        _memberStatusCode = CDef.MemberStatus.Provisional.code();
    }

    /**
     * [get] formalizedDatetime <br />
     * @return The value of formalizedDatetime. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public org.joda.time.LocalDateTime getFormalizedDatetime() {
        return _formalizedDatetime;
    }

    /**
     * [set] formalizedDatetime <br />
     * @param formalizedDatetime The value of formalizedDatetime. (NullAllowed)
     */
    public void setFormalizedDatetime(org.joda.time.LocalDateTime formalizedDatetime) {
        _formalizedDatetime = formalizedDatetime;
    }
}
