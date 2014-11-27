package com.example.dbflute.guice.simpleflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.example.dbflute.guice.simpleflute.AppCDef;
import com.example.dbflute.guice.simpleflute.dto.*;

/**
 * The simple DTO of (会員ログイン)MEMBER_LOGIN as TABLE. <br />
 * <pre>
 * [primary-key]
 *     MEMBER_LOGIN_ID
 * 
 * [column]
 *     MEMBER_LOGIN_ID, MEMBER_ID, LOGIN_DATETIME, MOBILE_LOGIN_FLG, LOGIN_MEMBER_STATUS_CODE
 * 
 * [sequence]
 *     EXAMPLEDB.PUBLIC.SEQ_MEMBER_LOGIN
 * 
 * [identity]
 *     MEMBER_LOGIN_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign-table]
 *     MEMBER_STATUS, MEMBER
 * 
 * [referrer-table]
 *     
 * 
 * [foreign-property]
 *     memberStatus, member
 * 
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMemberLoginDto implements Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** (会員ログインID)MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _memberLoginId;

    /** (会員ID)MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER} */
    @JsonKey
    protected Integer _memberId;

    /** (ログイン日時)LOGIN_DATETIME: {+UQ, IX, NotNull, TIMESTAMP(23, 10)} */
    @JsonKey
    protected org.joda.time.LocalDateTime _loginDatetime;

    /** (モバイルログインフラグ)MOBILE_LOGIN_FLG: {NotNull, INTEGER(10), classification=Flg} */
    @JsonKey
    protected Integer _mobileLoginFlg;

    /** (ログイン時会員ステータスコード)LOGIN_MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} */
    @JsonKey
    protected String _loginMemberStatusCode;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMemberLoginDto() {
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Set the value of mobileLoginFlg as the classification of Flg. <br />
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed)
     */
    public void setMobileLoginFlgAsFlg(AppCDef.Flg cdef) {
        setMobileLoginFlg(cdef != null ? Integer.valueOf(cdef.code()) : null);
    }

    /**
     * Get the value of mobileLoginFlg as the classification of Flg. <br />
     * general boolean classification for every flg-column
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed)
     */
    public AppCDef.Flg getMobileLoginFlgAsFlg() {
        return AppCDef.Flg.codeOf(getMobileLoginFlg());
    }

    /**
     * Set the value of loginMemberStatusCode as the classification of MemberStatus. <br />
     * status of member from entry to withdrawal
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed)
     */
    public void setLoginMemberStatusCodeAsMemberStatus(AppCDef.MemberStatus cdef) {
        setLoginMemberStatusCode(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of loginMemberStatusCode as the classification of MemberStatus. <br />
     * status of member from entry to withdrawal
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed)
     */
    public AppCDef.MemberStatus getLoginMemberStatusCodeAsMemberStatus() {
        return AppCDef.MemberStatus.codeOf(getLoginMemberStatusCode());
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of mobileLoginFlg as True. <br />
     * Yes: means valid
     */
    public void setMobileLoginFlg_True() {
        setMobileLoginFlgAsFlg(AppCDef.Flg.True);
    }

    /**
     * Set the value of mobileLoginFlg as False. <br />
     * No: means invalid
     */
    public void setMobileLoginFlg_False() {
        setMobileLoginFlgAsFlg(AppCDef.Flg.False);
    }

    /**
     * Set the value of loginMemberStatusCode as Formalized. <br />
     * Formalized: as formal member, allowed to use all service
     */
    public void setLoginMemberStatusCode_Formalized() {
        setLoginMemberStatusCodeAsMemberStatus(AppCDef.MemberStatus.Formalized);
    }

    /**
     * Set the value of loginMemberStatusCode as Withdrawal. <br />
     * Withdrawal: withdrawal is fixed, not allowed to use service
     */
    public void setLoginMemberStatusCode_Withdrawal() {
        setLoginMemberStatusCodeAsMemberStatus(AppCDef.MemberStatus.Withdrawal);
    }

    /**
     * Set the value of loginMemberStatusCode as Provisional. <br />
     * Provisional: first status after entry, allowed to use only part of service
     */
    public void setLoginMemberStatusCode_Provisional() {
        setLoginMemberStatusCodeAsMemberStatus(AppCDef.MemberStatus.Provisional);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of mobileLoginFlg 'True'? <br />
     * Yes: means valid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMobileLoginFlgTrue() {
        AppCDef.Flg cdef = getMobileLoginFlgAsFlg();
        return cdef != null ? cdef.equals(AppCDef.Flg.True) : false;
    }

    /**
     * Is the value of mobileLoginFlg 'False'? <br />
     * No: means invalid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMobileLoginFlgFalse() {
        AppCDef.Flg cdef = getMobileLoginFlgAsFlg();
        return cdef != null ? cdef.equals(AppCDef.Flg.False) : false;
    }

    /**
     * Is the value of loginMemberStatusCode 'Formalized'? <br />
     * Formalized: as formal member, allowed to use all service
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLoginMemberStatusCodeFormalized() {
        AppCDef.MemberStatus cdef = getLoginMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(AppCDef.MemberStatus.Formalized) : false;
    }

    /**
     * Is the value of loginMemberStatusCode 'Withdrawal'? <br />
     * Withdrawal: withdrawal is fixed, not allowed to use service
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLoginMemberStatusCodeWithdrawal() {
        AppCDef.MemberStatus cdef = getLoginMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(AppCDef.MemberStatus.Withdrawal) : false;
    }

    /**
     * Is the value of loginMemberStatusCode 'Provisional'? <br />
     * Provisional: first status after entry, allowed to use only part of service
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLoginMemberStatusCodeProvisional() {
        AppCDef.MemberStatus cdef = getLoginMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(AppCDef.MemberStatus.Provisional) : false;
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    protected MemberStatusDto _memberStatus;

    public MemberStatusDto getMemberStatus() {
        return _memberStatus;
    }

    public void setMemberStatus(MemberStatusDto memberStatus) {
        this._memberStatus = memberStatus;
    }

    protected MemberDto _member;

    public MemberDto getMember() {
        return _member;
    }

    public void setMember(MemberDto member) {
        this._member = member;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    public Set<String> mymodifiedProperties() {
        return __modifiedProperties;
    }

    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMemberLoginDto)) { return false; }
        final BsMemberLoginDto otherEntity = (BsMemberLoginDto)other;
        if (!helpComparingValue(getMemberLoginId(), otherEntity.getMemberLoginId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "MEMBER_LOGIN");
        result = xCH(result, getMemberLoginId());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        if (value == null) {
            return result;
        }
        return (31 * result) + (value instanceof byte[] ? ((byte[]) value).length : value.hashCode());
    }

    public int instanceHash() {
        return super.hashCode();
    }

    public String toString() {
        String c = ", ";
        StringBuilder sb = new StringBuilder();
        sb.append(c).append(getMemberLoginId());
        sb.append(c).append(getMemberId());
        sb.append(c).append(getLoginDatetime());
        sb.append(c).append(getMobileLoginFlg());
        sb.append(c).append(getLoginMemberStatusCode());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (会員ログインID)MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'MEMBER_LOGIN_ID'. (NullAllowed)
     */
    public Long getMemberLoginId() {
        return _memberLoginId;
    }

    /**
     * [set] (会員ログインID)MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @param memberLoginId The value of the column 'MEMBER_LOGIN_ID'. (NullAllowed)
     */
    public void setMemberLoginId(Long memberLoginId) {
        __modifiedProperties.add("memberLoginId");
        this._memberLoginId = memberLoginId;
    }

    /**
     * [get] (会員ID)MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER} <br />
     * @return The value of the column 'MEMBER_ID'. (NullAllowed)
     */
    public Integer getMemberId() {
        return _memberId;
    }

    /**
     * [set] (会員ID)MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER} <br />
     * @param memberId The value of the column 'MEMBER_ID'. (NullAllowed)
     */
    public void setMemberId(Integer memberId) {
        __modifiedProperties.add("memberId");
        this._memberId = memberId;
    }

    /**
     * [get] (ログイン日時)LOGIN_DATETIME: {+UQ, IX, NotNull, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'LOGIN_DATETIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
    public org.joda.time.LocalDateTime getLoginDatetime() {
        return _loginDatetime;
    }

    /**
     * [set] (ログイン日時)LOGIN_DATETIME: {+UQ, IX, NotNull, TIMESTAMP(23, 10)} <br />
     * @param loginDatetime The value of the column 'LOGIN_DATETIME'. (NullAllowed)
     */
    public void setLoginDatetime(org.joda.time.LocalDateTime loginDatetime) {
        __modifiedProperties.add("loginDatetime");
        this._loginDatetime = loginDatetime;
    }

    /**
     * [get] (モバイルログインフラグ)MOBILE_LOGIN_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * @return The value of the column 'MOBILE_LOGIN_FLG'. (NullAllowed)
     */
    public Integer getMobileLoginFlg() {
        return _mobileLoginFlg;
    }

    /**
     * [set] (モバイルログインフラグ)MOBILE_LOGIN_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * @param mobileLoginFlg The value of the column 'MOBILE_LOGIN_FLG'. (NullAllowed)
     */
    public void setMobileLoginFlg(Integer mobileLoginFlg) {
        __modifiedProperties.add("mobileLoginFlg");
        this._mobileLoginFlg = mobileLoginFlg;
    }

    /**
     * [get] (ログイン時会員ステータスコード)LOGIN_MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * @return The value of the column 'LOGIN_MEMBER_STATUS_CODE'. (NullAllowed)
     */
    public String getLoginMemberStatusCode() {
        return _loginMemberStatusCode;
    }

    /**
     * [set] (ログイン時会員ステータスコード)LOGIN_MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * @param loginMemberStatusCode The value of the column 'LOGIN_MEMBER_STATUS_CODE'. (NullAllowed)
     */
    public void setLoginMemberStatusCode(String loginMemberStatusCode) {
        __modifiedProperties.add("loginMemberStatusCode");
        this._loginMemberStatusCode = loginMemberStatusCode;
    }

}
