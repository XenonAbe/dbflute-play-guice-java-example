package com.example.dbflute.guice.simpleflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.example.dbflute.guice.simpleflute.AppCDef;
import com.example.dbflute.guice.simpleflute.dto.*;

/**
 * The simple DTO of (会員)MEMBER as TABLE. <br />
 * <pre>
 * [primary-key]
 *     MEMBER_ID
 * 
 * [column]
 *     MEMBER_ID, MEMBER_NAME, MEMBER_ACCOUNT, MEMBER_STATUS_CODE, FORMALIZED_DATETIME, BIRTHDATE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 * 
 * [sequence]
 *     SEQ_MEMBER
 * 
 * [identity]
 *     MEMBER_ID
 * 
 * [version-no]
 *     VERSION_NO
 * 
 * [foreign-table]
 *     MEMBER_STATUS, MEMBER_ADDRESS(AsValid), MEMBER_SECURITY(AsOne), MEMBER_SERVICE(AsOne), MEMBER_WITHDRAWAL(AsOne)
 * 
 * [referrer-table]
 *     MEMBER_ADDRESS, MEMBER_FOLLOWING, MEMBER_LOGIN, PURCHASE, MEMBER_SECURITY, MEMBER_SERVICE, MEMBER_WITHDRAWAL
 * 
 * [foreign-property]
 *     memberStatus, memberAddressAsValid, memberSecurityAsOne, memberServiceAsOne, memberWithdrawalAsOne
 * 
 * [referrer-property]
 *     memberAddressList, memberFollowingByMyMemberIdList, memberFollowingByYourMemberIdList, memberLoginList, purchaseList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMemberDto implements Serializable {

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
    /** (会員ID)MEMBER_ID: {PK, ID, NotNull, INTEGER(10), FK to MEMBER_ADDRESS} */
    @JsonKey
    protected Integer _memberId;

    /** (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _memberName;

    /** (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)} */
    @JsonKey
    protected String _memberAccount;

    /** (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} */
    @JsonKey
    protected String _memberStatusCode;

    /** (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(23, 10)} */
    @JsonKey
    protected org.joda.time.LocalDateTime _formalizedDatetime;

    /** (生年月日)BIRTHDATE: {DATE(8)} */
    @JsonKey
    protected org.joda.time.LocalDate _birthdate;

    /** (登録日時)REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)} */
    @JsonKey
    protected org.joda.time.LocalDateTime _registerDatetime;

    /** (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _registerUser;

    /** (更新日時)UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)} */
    @JsonKey
    protected org.joda.time.LocalDateTime _updateDatetime;

    /** (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _updateUser;

    /** (バージョンNO)VERSION_NO: {NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _versionNo;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMemberDto() {
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Set the value of memberStatusCode as the classification of MemberStatus. <br />
     * status of member from entry to withdrawal
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed)
     */
    public void setMemberStatusCodeAsMemberStatus(AppCDef.MemberStatus cdef) {
        setMemberStatusCode(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of memberStatusCode as the classification of MemberStatus. <br />
     * status of member from entry to withdrawal
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed)
     */
    public AppCDef.MemberStatus getMemberStatusCodeAsMemberStatus() {
        return AppCDef.MemberStatus.codeOf(getMemberStatusCode());
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of memberStatusCode as Formalized. <br />
     * Formalized: as formal member, allowed to use all service
     */
    public void setMemberStatusCode_Formalized() {
        setMemberStatusCodeAsMemberStatus(AppCDef.MemberStatus.Formalized);
    }

    /**
     * Set the value of memberStatusCode as Withdrawal. <br />
     * Withdrawal: withdrawal is fixed, not allowed to use service
     */
    public void setMemberStatusCode_Withdrawal() {
        setMemberStatusCodeAsMemberStatus(AppCDef.MemberStatus.Withdrawal);
    }

    /**
     * Set the value of memberStatusCode as Provisional. <br />
     * Provisional: first status after entry, allowed to use only part of service
     */
    public void setMemberStatusCode_Provisional() {
        setMemberStatusCodeAsMemberStatus(AppCDef.MemberStatus.Provisional);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of memberStatusCode 'Formalized'? <br />
     * Formalized: as formal member, allowed to use all service
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMemberStatusCodeFormalized() {
        AppCDef.MemberStatus cdef = getMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(AppCDef.MemberStatus.Formalized) : false;
    }

    /**
     * Is the value of memberStatusCode 'Withdrawal'? <br />
     * Withdrawal: withdrawal is fixed, not allowed to use service
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMemberStatusCodeWithdrawal() {
        AppCDef.MemberStatus cdef = getMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(AppCDef.MemberStatus.Withdrawal) : false;
    }

    /**
     * Is the value of memberStatusCode 'Provisional'? <br />
     * Provisional: first status after entry, allowed to use only part of service
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMemberStatusCodeProvisional() {
        AppCDef.MemberStatus cdef = getMemberStatusCodeAsMemberStatus();
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

    protected MemberAddressDto _memberAddressAsValid;

    public MemberAddressDto getMemberAddressAsValid() {
        return _memberAddressAsValid;
    }

    public void setMemberAddressAsValid(MemberAddressDto memberAddressAsValid) {
        this._memberAddressAsValid = memberAddressAsValid;
    }

    protected MemberSecurityDto _memberSecurityAsOne;

    public MemberSecurityDto getMemberSecurityAsOne() {
        return _memberSecurityAsOne;
    }

    public void setMemberSecurityAsOne(MemberSecurityDto memberSecurityAsOne) {
        this._memberSecurityAsOne = memberSecurityAsOne;
    }

    protected MemberServiceDto _memberServiceAsOne;

    public MemberServiceDto getMemberServiceAsOne() {
        return _memberServiceAsOne;
    }

    public void setMemberServiceAsOne(MemberServiceDto memberServiceAsOne) {
        this._memberServiceAsOne = memberServiceAsOne;
    }

    protected MemberWithdrawalDto _memberWithdrawalAsOne;

    public MemberWithdrawalDto getMemberWithdrawalAsOne() {
        return _memberWithdrawalAsOne;
    }

    public void setMemberWithdrawalAsOne(MemberWithdrawalDto memberWithdrawalAsOne) {
        this._memberWithdrawalAsOne = memberWithdrawalAsOne;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<MemberAddressDto> _memberAddressList;

    public List<MemberAddressDto> getMemberAddressList() {
        if (_memberAddressList == null) { _memberAddressList = new ArrayList<MemberAddressDto>(); }
        return _memberAddressList;
    }

    public void setMemberAddressList(List<MemberAddressDto> memberAddressList) {
        this._memberAddressList = memberAddressList;
    }

    protected List<MemberFollowingDto> _memberFollowingByMyMemberIdList;

    public List<MemberFollowingDto> getMemberFollowingByMyMemberIdList() {
        if (_memberFollowingByMyMemberIdList == null) { _memberFollowingByMyMemberIdList = new ArrayList<MemberFollowingDto>(); }
        return _memberFollowingByMyMemberIdList;
    }

    public void setMemberFollowingByMyMemberIdList(List<MemberFollowingDto> memberFollowingByMyMemberIdList) {
        this._memberFollowingByMyMemberIdList = memberFollowingByMyMemberIdList;
    }

    protected List<MemberFollowingDto> _memberFollowingByYourMemberIdList;

    public List<MemberFollowingDto> getMemberFollowingByYourMemberIdList() {
        if (_memberFollowingByYourMemberIdList == null) { _memberFollowingByYourMemberIdList = new ArrayList<MemberFollowingDto>(); }
        return _memberFollowingByYourMemberIdList;
    }

    public void setMemberFollowingByYourMemberIdList(List<MemberFollowingDto> memberFollowingByYourMemberIdList) {
        this._memberFollowingByYourMemberIdList = memberFollowingByYourMemberIdList;
    }

    protected List<MemberLoginDto> _memberLoginList;

    public List<MemberLoginDto> getMemberLoginList() {
        if (_memberLoginList == null) { _memberLoginList = new ArrayList<MemberLoginDto>(); }
        return _memberLoginList;
    }

    public void setMemberLoginList(List<MemberLoginDto> memberLoginList) {
        this._memberLoginList = memberLoginList;
    }

    protected List<PurchaseDto> _purchaseList;

    public List<PurchaseDto> getPurchaseList() {
        if (_purchaseList == null) { _purchaseList = new ArrayList<PurchaseDto>(); }
        return _purchaseList;
    }

    public void setPurchaseList(List<PurchaseDto> purchaseList) {
        this._purchaseList = purchaseList;
    }

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
        if (other == null || !(other instanceof BsMemberDto)) { return false; }
        final BsMemberDto otherEntity = (BsMemberDto)other;
        if (!helpComparingValue(getMemberId(), otherEntity.getMemberId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "MEMBER");
        result = xCH(result, getMemberId());
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
        sb.append(c).append(getMemberId());
        sb.append(c).append(getMemberName());
        sb.append(c).append(getMemberAccount());
        sb.append(c).append(getMemberStatusCode());
        sb.append(c).append(getFormalizedDatetime());
        sb.append(c).append(getBirthdate());
        sb.append(c).append(getRegisterDatetime());
        sb.append(c).append(getRegisterUser());
        sb.append(c).append(getUpdateDatetime());
        sb.append(c).append(getUpdateUser());
        sb.append(c).append(getVersionNo());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (会員ID)MEMBER_ID: {PK, ID, NotNull, INTEGER(10), FK to MEMBER_ADDRESS} <br />
     * @return The value of the column 'MEMBER_ID'. (NullAllowed)
     */
    public Integer getMemberId() {
        return _memberId;
    }

    /**
     * [set] (会員ID)MEMBER_ID: {PK, ID, NotNull, INTEGER(10), FK to MEMBER_ADDRESS} <br />
     * @param memberId The value of the column 'MEMBER_ID'. (NullAllowed)
     */
    public void setMemberId(Integer memberId) {
        __modifiedProperties.add("memberId");
        this._memberId = memberId;
    }

    /**
     * [get] (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'MEMBER_NAME'. (NullAllowed)
     */
    public String getMemberName() {
        return _memberName;
    }

    /**
     * [set] (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR(200)} <br />
     * @param memberName The value of the column 'MEMBER_NAME'. (NullAllowed)
     */
    public void setMemberName(String memberName) {
        __modifiedProperties.add("memberName");
        this._memberName = memberName;
    }

    /**
     * [get] (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)} <br />
     * @return The value of the column 'MEMBER_ACCOUNT'. (NullAllowed)
     */
    public String getMemberAccount() {
        return _memberAccount;
    }

    /**
     * [set] (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)} <br />
     * @param memberAccount The value of the column 'MEMBER_ACCOUNT'. (NullAllowed)
     */
    public void setMemberAccount(String memberAccount) {
        __modifiedProperties.add("memberAccount");
        this._memberAccount = memberAccount;
    }

    /**
     * [get] (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * @return The value of the column 'MEMBER_STATUS_CODE'. (NullAllowed)
     */
    public String getMemberStatusCode() {
        return _memberStatusCode;
    }

    /**
     * [set] (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * @param memberStatusCode The value of the column 'MEMBER_STATUS_CODE'. (NullAllowed)
     */
    public void setMemberStatusCode(String memberStatusCode) {
        __modifiedProperties.add("memberStatusCode");
        this._memberStatusCode = memberStatusCode;
    }

    /**
     * [get] (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'FORMALIZED_DATETIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
    public org.joda.time.LocalDateTime getFormalizedDatetime() {
        return _formalizedDatetime;
    }

    /**
     * [set] (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(23, 10)} <br />
     * @param formalizedDatetime The value of the column 'FORMALIZED_DATETIME'. (NullAllowed)
     */
    public void setFormalizedDatetime(org.joda.time.LocalDateTime formalizedDatetime) {
        __modifiedProperties.add("formalizedDatetime");
        this._formalizedDatetime = formalizedDatetime;
    }

    /**
     * [get] (生年月日)BIRTHDATE: {DATE(8)} <br />
     * @return The value of the column 'BIRTHDATE'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd")
    public org.joda.time.LocalDate getBirthdate() {
        return _birthdate;
    }

    /**
     * [set] (生年月日)BIRTHDATE: {DATE(8)} <br />
     * @param birthdate The value of the column 'BIRTHDATE'. (NullAllowed)
     */
    public void setBirthdate(org.joda.time.LocalDate birthdate) {
        __modifiedProperties.add("birthdate");
        this._birthdate = birthdate;
    }

    /**
     * [get] (登録日時)REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'REGISTER_DATETIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
    public org.joda.time.LocalDateTime getRegisterDatetime() {
        return _registerDatetime;
    }

    /**
     * [set] (登録日時)REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @param registerDatetime The value of the column 'REGISTER_DATETIME'. (NullAllowed)
     */
    public void setRegisterDatetime(org.joda.time.LocalDateTime registerDatetime) {
        __modifiedProperties.add("registerDatetime");
        this._registerDatetime = registerDatetime;
    }

    /**
     * [get] (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'REGISTER_USER'. (NullAllowed)
     */
    public String getRegisterUser() {
        return _registerUser;
    }

    /**
     * [set] (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR(200)} <br />
     * @param registerUser The value of the column 'REGISTER_USER'. (NullAllowed)
     */
    public void setRegisterUser(String registerUser) {
        __modifiedProperties.add("registerUser");
        this._registerUser = registerUser;
    }

    /**
     * [get] (更新日時)UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'UPDATE_DATETIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
    public org.joda.time.LocalDateTime getUpdateDatetime() {
        return _updateDatetime;
    }

    /**
     * [set] (更新日時)UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @param updateDatetime The value of the column 'UPDATE_DATETIME'. (NullAllowed)
     */
    public void setUpdateDatetime(org.joda.time.LocalDateTime updateDatetime) {
        __modifiedProperties.add("updateDatetime");
        this._updateDatetime = updateDatetime;
    }

    /**
     * [get] (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'UPDATE_USER'. (NullAllowed)
     */
    public String getUpdateUser() {
        return _updateUser;
    }

    /**
     * [set] (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)} <br />
     * @param updateUser The value of the column 'UPDATE_USER'. (NullAllowed)
     */
    public void setUpdateUser(String updateUser) {
        __modifiedProperties.add("updateUser");
        this._updateUser = updateUser;
    }

    /**
     * [get] (バージョンNO)VERSION_NO: {NotNull, BIGINT(19)} <br />
     * @return The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public Long getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] (バージョンNO)VERSION_NO: {NotNull, BIGINT(19)} <br />
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public void setVersionNo(Long versionNo) {
        __modifiedProperties.add("versionNo");
        this._versionNo = versionNo;
    }

}
