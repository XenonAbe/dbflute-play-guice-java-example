package com.example.dbflute.guice.dbflute.bsbhv.pmbean;

import java.util.*;

import org.seasar.dbflute.outsidesql.typed.*;
import org.seasar.dbflute.jdbc.*;
import org.seasar.dbflute.jdbc.ParameterUtil.ShortCharHandlingMode;
import org.seasar.dbflute.cbean.coption.LikeSearchOption;
import org.seasar.dbflute.util.DfCollectionUtil;
import org.seasar.dbflute.exception.*;
import org.seasar.dbflute.util.DfTypeUtil;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import com.example.dbflute.guice.dbflute.allcommon.*;
import com.example.dbflute.guice.dbflute.exbhv.*;
import com.example.dbflute.guice.dbflute.exentity.customize.*;

/**
 * The base class for typed parameter-bean of SimpleMember. <br />
 * This is related to "<span style="color: #AD4747">selectSimpleMember</span>" on MemberBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsSimpleMemberPmb implements ListHandlingPmb<MemberBhv, SimpleMember>, EntityHandlingPmb<MemberBhv, SimpleMember>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of memberId. */
    protected Integer _memberId;

    /** The parameter of memberName:likePrefix. */
    protected String _memberName;

    /** The option of like-search for memberName. */
    protected LikeSearchOption _memberNameInternalLikeSearchOption;

    /** The parameter of birthdate. */
    protected org.joda.time.LocalDate _birthdate;

    /** The max size of safety result. */
    protected int _safetyMaxResultSize;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of SimpleMember. <br />
     * This is related to "<span style="color: #AD4747">selectSimpleMember</span>" on MemberBhv.
     */
    public BsSimpleMemberPmb() {
    }

    // ===================================================================================
    //                                                                Typed Implementation
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    public String getOutsideSqlPath() {
        return "selectSimpleMember";
    }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    public Class<SimpleMember> getEntityType() {
        return SimpleMember.class;
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

    protected void assertLikeSearchOptionValid(String name, LikeSearchOption option) {
        if (option == null) {
            String msg = "The like-search option is required!";
            throw new RequiredOptionNotFoundException(msg);
        }
        if (option.isSplit()) {
            String msg = "The split of like-search is NOT available on parameter-bean.";
            msg = msg + " Don't use splitByXxx(): " + option;
            throw new IllegalOutsideSqlOperationException(msg);
        }
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
        sb.append(dm).append(_memberName);
        sb.append(dm).append(_birthdate);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] memberId <br />
     * @return The value of memberId. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Integer getMemberId() {
        return _memberId;
    }

    /**
     * [set] memberId <br />
     * @param memberId The value of memberId. (NullAllowed)
     */
    public void setMemberId(Integer memberId) {
        _memberId = memberId;
    }

    /**
     * [get] memberName:likePrefix <br />
     * @return The value of memberName. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getMemberName() {
        return filterStringParameter(_memberName);
    }

    /**
     * [set as prefixSearch] memberName:likePrefix <br />
     * @param memberName The value of memberName. (NullAllowed)
     */
    public void setMemberName_PrefixSearch(String memberName) {
        _memberName = memberName;
        _memberNameInternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for memberName. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for memberName. (NullAllowed)
     */
    public LikeSearchOption getMemberNameInternalLikeSearchOption() {
        return _memberNameInternalLikeSearchOption;
    }

    /**
     * [get] birthdate <br />
     * @return The value of birthdate. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public org.joda.time.LocalDate getBirthdate() {
        return _birthdate;
    }

    /**
     * [set] birthdate <br />
     * @param birthdate The value of birthdate. (NullAllowed)
     */
    public void setBirthdate(org.joda.time.LocalDate birthdate) {
        _birthdate = birthdate;
    }
}
