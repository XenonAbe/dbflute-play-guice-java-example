package com.example.dbflute.guice.simpleflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * The simple DTO of SUMMARY_WITHDRAWAL as VIEW. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     MEMBER_ID, MEMBER_NAME, WITHDRAWAL_REASON_CODE, WITHDRAWAL_REASON_TEXT, WITHDRAWAL_REASON_INPUT_TEXT, WITHDRAWAL_DATETIME, MEMBER_STATUS_CODE, MEMBER_STATUS_NAME, MAX_PURCHASE_PRICE
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     
 * 
 * [foreign-table]
 *     
 * 
 * [referrer-table]
 *     
 * 
 * [foreign-property]
 *     
 * 
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsSummaryWithdrawalDto implements Serializable {

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
    /** MEMBER_ID: {INTEGER(10)} */
    @JsonKey
    protected Integer _memberId;

    /** MEMBER_NAME: {VARCHAR(200)} */
    @JsonKey
    protected String _memberName;

    /** WITHDRAWAL_REASON_CODE: {CHAR(3)} */
    @JsonKey
    protected String _withdrawalReasonCode;

    /** WITHDRAWAL_REASON_TEXT: {CLOB(2147483647)} */
    @JsonKey
    protected String _withdrawalReasonText;

    /** WITHDRAWAL_REASON_INPUT_TEXT: {CLOB(2147483647)} */
    @JsonKey
    protected String _withdrawalReasonInputText;

    /** WITHDRAWAL_DATETIME: {TIMESTAMP(23, 10)} */
    @JsonKey
    protected org.joda.time.LocalDateTime _withdrawalDatetime;

    /** MEMBER_STATUS_CODE: {CHAR(3)} */
    @JsonKey
    protected String _memberStatusCode;

    /** MEMBER_STATUS_NAME: {VARCHAR(50)} */
    @JsonKey
    protected String _memberStatusName;

    /** MAX_PURCHASE_PRICE: {INTEGER(10)} */
    @JsonKey
    protected Integer _maxPurchasePrice;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSummaryWithdrawalDto() {
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
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
        if (other == null || !(other instanceof BsSummaryWithdrawalDto)) { return false; }
        final BsSummaryWithdrawalDto otherEntity = (BsSummaryWithdrawalDto)other;
        if (!helpComparingValue(getMemberId(), otherEntity.getMemberId())) { return false; }
        if (!helpComparingValue(getMemberName(), otherEntity.getMemberName())) { return false; }
        if (!helpComparingValue(getWithdrawalReasonCode(), otherEntity.getWithdrawalReasonCode())) { return false; }
        if (!helpComparingValue(getWithdrawalReasonText(), otherEntity.getWithdrawalReasonText())) { return false; }
        if (!helpComparingValue(getWithdrawalReasonInputText(), otherEntity.getWithdrawalReasonInputText())) { return false; }
        if (!helpComparingValue(getWithdrawalDatetime(), otherEntity.getWithdrawalDatetime())) { return false; }
        if (!helpComparingValue(getMemberStatusCode(), otherEntity.getMemberStatusCode())) { return false; }
        if (!helpComparingValue(getMemberStatusName(), otherEntity.getMemberStatusName())) { return false; }
        if (!helpComparingValue(getMaxPurchasePrice(), otherEntity.getMaxPurchasePrice())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SUMMARY_WITHDRAWAL");
        result = xCH(result, getMemberId());
        result = xCH(result, getMemberName());
        result = xCH(result, getWithdrawalReasonCode());
        result = xCH(result, getWithdrawalReasonText());
        result = xCH(result, getWithdrawalReasonInputText());
        result = xCH(result, getWithdrawalDatetime());
        result = xCH(result, getMemberStatusCode());
        result = xCH(result, getMemberStatusName());
        result = xCH(result, getMaxPurchasePrice());
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
        sb.append(c).append(getWithdrawalReasonCode());
        sb.append(c).append(getWithdrawalReasonText());
        sb.append(c).append(getWithdrawalReasonInputText());
        sb.append(c).append(getWithdrawalDatetime());
        sb.append(c).append(getMemberStatusCode());
        sb.append(c).append(getMemberStatusName());
        sb.append(c).append(getMaxPurchasePrice());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MEMBER_ID: {INTEGER(10)} <br />
     * @return The value of the column 'MEMBER_ID'. (NullAllowed)
     */
    public Integer getMemberId() {
        return _memberId;
    }

    /**
     * [set] MEMBER_ID: {INTEGER(10)} <br />
     * @param memberId The value of the column 'MEMBER_ID'. (NullAllowed)
     */
    public void setMemberId(Integer memberId) {
        __modifiedProperties.add("memberId");
        this._memberId = memberId;
    }

    /**
     * [get] MEMBER_NAME: {VARCHAR(200)} <br />
     * @return The value of the column 'MEMBER_NAME'. (NullAllowed)
     */
    public String getMemberName() {
        return _memberName;
    }

    /**
     * [set] MEMBER_NAME: {VARCHAR(200)} <br />
     * @param memberName The value of the column 'MEMBER_NAME'. (NullAllowed)
     */
    public void setMemberName(String memberName) {
        __modifiedProperties.add("memberName");
        this._memberName = memberName;
    }

    /**
     * [get] WITHDRAWAL_REASON_CODE: {CHAR(3)} <br />
     * @return The value of the column 'WITHDRAWAL_REASON_CODE'. (NullAllowed)
     */
    public String getWithdrawalReasonCode() {
        return _withdrawalReasonCode;
    }

    /**
     * [set] WITHDRAWAL_REASON_CODE: {CHAR(3)} <br />
     * @param withdrawalReasonCode The value of the column 'WITHDRAWAL_REASON_CODE'. (NullAllowed)
     */
    public void setWithdrawalReasonCode(String withdrawalReasonCode) {
        __modifiedProperties.add("withdrawalReasonCode");
        this._withdrawalReasonCode = withdrawalReasonCode;
    }

    /**
     * [get] WITHDRAWAL_REASON_TEXT: {CLOB(2147483647)} <br />
     * @return The value of the column 'WITHDRAWAL_REASON_TEXT'. (NullAllowed)
     */
    public String getWithdrawalReasonText() {
        return _withdrawalReasonText;
    }

    /**
     * [set] WITHDRAWAL_REASON_TEXT: {CLOB(2147483647)} <br />
     * @param withdrawalReasonText The value of the column 'WITHDRAWAL_REASON_TEXT'. (NullAllowed)
     */
    public void setWithdrawalReasonText(String withdrawalReasonText) {
        __modifiedProperties.add("withdrawalReasonText");
        this._withdrawalReasonText = withdrawalReasonText;
    }

    /**
     * [get] WITHDRAWAL_REASON_INPUT_TEXT: {CLOB(2147483647)} <br />
     * @return The value of the column 'WITHDRAWAL_REASON_INPUT_TEXT'. (NullAllowed)
     */
    public String getWithdrawalReasonInputText() {
        return _withdrawalReasonInputText;
    }

    /**
     * [set] WITHDRAWAL_REASON_INPUT_TEXT: {CLOB(2147483647)} <br />
     * @param withdrawalReasonInputText The value of the column 'WITHDRAWAL_REASON_INPUT_TEXT'. (NullAllowed)
     */
    public void setWithdrawalReasonInputText(String withdrawalReasonInputText) {
        __modifiedProperties.add("withdrawalReasonInputText");
        this._withdrawalReasonInputText = withdrawalReasonInputText;
    }

    /**
     * [get] WITHDRAWAL_DATETIME: {TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'WITHDRAWAL_DATETIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
    public org.joda.time.LocalDateTime getWithdrawalDatetime() {
        return _withdrawalDatetime;
    }

    /**
     * [set] WITHDRAWAL_DATETIME: {TIMESTAMP(23, 10)} <br />
     * @param withdrawalDatetime The value of the column 'WITHDRAWAL_DATETIME'. (NullAllowed)
     */
    public void setWithdrawalDatetime(org.joda.time.LocalDateTime withdrawalDatetime) {
        __modifiedProperties.add("withdrawalDatetime");
        this._withdrawalDatetime = withdrawalDatetime;
    }

    /**
     * [get] MEMBER_STATUS_CODE: {CHAR(3)} <br />
     * @return The value of the column 'MEMBER_STATUS_CODE'. (NullAllowed)
     */
    public String getMemberStatusCode() {
        return _memberStatusCode;
    }

    /**
     * [set] MEMBER_STATUS_CODE: {CHAR(3)} <br />
     * @param memberStatusCode The value of the column 'MEMBER_STATUS_CODE'. (NullAllowed)
     */
    public void setMemberStatusCode(String memberStatusCode) {
        __modifiedProperties.add("memberStatusCode");
        this._memberStatusCode = memberStatusCode;
    }

    /**
     * [get] MEMBER_STATUS_NAME: {VARCHAR(50)} <br />
     * @return The value of the column 'MEMBER_STATUS_NAME'. (NullAllowed)
     */
    public String getMemberStatusName() {
        return _memberStatusName;
    }

    /**
     * [set] MEMBER_STATUS_NAME: {VARCHAR(50)} <br />
     * @param memberStatusName The value of the column 'MEMBER_STATUS_NAME'. (NullAllowed)
     */
    public void setMemberStatusName(String memberStatusName) {
        __modifiedProperties.add("memberStatusName");
        this._memberStatusName = memberStatusName;
    }

    /**
     * [get] MAX_PURCHASE_PRICE: {INTEGER(10)} <br />
     * @return The value of the column 'MAX_PURCHASE_PRICE'. (NullAllowed)
     */
    public Integer getMaxPurchasePrice() {
        return _maxPurchasePrice;
    }

    /**
     * [set] MAX_PURCHASE_PRICE: {INTEGER(10)} <br />
     * @param maxPurchasePrice The value of the column 'MAX_PURCHASE_PRICE'. (NullAllowed)
     */
    public void setMaxPurchasePrice(Integer maxPurchasePrice) {
        __modifiedProperties.add("maxPurchasePrice");
        this._maxPurchasePrice = maxPurchasePrice;
    }

}
