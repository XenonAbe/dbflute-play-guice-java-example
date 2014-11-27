package com.example.dbflute.guice.simpleflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.example.dbflute.guice.simpleflute.AppCDef;
import com.example.dbflute.guice.simpleflute.dto.*;

/**
 * The simple DTO of (購入支払)PURCHASE_PAYMENT as TABLE. <br />
 * <pre>
 * [primary-key]
 *     PURCHASE_PAYMENT_ID
 * 
 * [column]
 *     PURCHASE_PAYMENT_ID, PURCHASE_ID, PAYMENT_AMOUNT, PAYMENT_DATETIME, PAYMENT_METHOD_CODE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     PURCHASE_PAYMENT_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign-table]
 *     PURCHASE
 * 
 * [referrer-table]
 *     
 * 
 * [foreign-property]
 *     purchase
 * 
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsPurchasePaymentDto implements Serializable {

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
    /** (購入支払ID)PURCHASE_PAYMENT_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _purchasePaymentId;

    /** (購入ID)PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to PURCHASE} */
    @JsonKey
    protected Long _purchaseId;

    /** (支払金額)PAYMENT_AMOUNT: {NotNull, DECIMAL(10, 2)} */
    @JsonKey
    protected java.math.BigDecimal _paymentAmount;

    /** (支払日時)PAYMENT_DATETIME: {IX+, NotNull, TIMESTAMP(23, 10)} */
    @JsonKey
    protected org.joda.time.LocalDateTime _paymentDatetime;

    /** (支払方法コード)PAYMENT_METHOD_CODE: {NotNull, CHAR(3), classification=PaymentMethod} */
    @JsonKey
    protected String _paymentMethodCode;

    /** REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)} */
    @JsonKey
    protected org.joda.time.LocalDateTime _registerDatetime;

    /** REGISTER_USER: {NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _registerUser;

    /** UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)} */
    @JsonKey
    protected org.joda.time.LocalDateTime _updateDatetime;

    /** UPDATE_USER: {NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _updateUser;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsPurchasePaymentDto() {
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Set the value of paymentMethodCode as the classification of PaymentMethod. <br />
     * method of payment for purchase
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed)
     */
    public void setPaymentMethodCodeAsPaymentMethod(AppCDef.PaymentMethod cdef) {
        setPaymentMethodCode(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of paymentMethodCode as the classification of PaymentMethod. <br />
     * method of payment for purchase
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed)
     */
    public AppCDef.PaymentMethod getPaymentMethodCodeAsPaymentMethod() {
        return AppCDef.PaymentMethod.codeOf(getPaymentMethodCode());
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of paymentMethodCode as ByHand. <br />
     * by hand: payment by hand, face-to-face
     */
    public void setPaymentMethodCode_ByHand() {
        setPaymentMethodCodeAsPaymentMethod(AppCDef.PaymentMethod.ByHand);
    }

    /**
     * Set the value of paymentMethodCode as BankTransfer. <br />
     * bank transfer: bank transfer payment
     */
    public void setPaymentMethodCode_BankTransfer() {
        setPaymentMethodCodeAsPaymentMethod(AppCDef.PaymentMethod.BankTransfer);
    }

    /**
     * Set the value of paymentMethodCode as CreditCard. <br />
     * credit card: credit card payment
     */
    public void setPaymentMethodCode_CreditCard() {
        setPaymentMethodCodeAsPaymentMethod(AppCDef.PaymentMethod.CreditCard);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of paymentMethodCode 'ByHand'? <br />
     * by hand: payment by hand, face-to-face
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPaymentMethodCodeByHand() {
        AppCDef.PaymentMethod cdef = getPaymentMethodCodeAsPaymentMethod();
        return cdef != null ? cdef.equals(AppCDef.PaymentMethod.ByHand) : false;
    }

    /**
     * Is the value of paymentMethodCode 'BankTransfer'? <br />
     * bank transfer: bank transfer payment
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPaymentMethodCodeBankTransfer() {
        AppCDef.PaymentMethod cdef = getPaymentMethodCodeAsPaymentMethod();
        return cdef != null ? cdef.equals(AppCDef.PaymentMethod.BankTransfer) : false;
    }

    /**
     * Is the value of paymentMethodCode 'CreditCard'? <br />
     * credit card: credit card payment
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPaymentMethodCodeCreditCard() {
        AppCDef.PaymentMethod cdef = getPaymentMethodCodeAsPaymentMethod();
        return cdef != null ? cdef.equals(AppCDef.PaymentMethod.CreditCard) : false;
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    protected PurchaseDto _purchase;

    public PurchaseDto getPurchase() {
        return _purchase;
    }

    public void setPurchase(PurchaseDto purchase) {
        this._purchase = purchase;
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
        if (other == null || !(other instanceof BsPurchasePaymentDto)) { return false; }
        final BsPurchasePaymentDto otherEntity = (BsPurchasePaymentDto)other;
        if (!helpComparingValue(getPurchasePaymentId(), otherEntity.getPurchasePaymentId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "PURCHASE_PAYMENT");
        result = xCH(result, getPurchasePaymentId());
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
        sb.append(c).append(getPurchasePaymentId());
        sb.append(c).append(getPurchaseId());
        sb.append(c).append(getPaymentAmount());
        sb.append(c).append(getPaymentDatetime());
        sb.append(c).append(getPaymentMethodCode());
        sb.append(c).append(getRegisterDatetime());
        sb.append(c).append(getRegisterUser());
        sb.append(c).append(getUpdateDatetime());
        sb.append(c).append(getUpdateUser());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (購入支払ID)PURCHASE_PAYMENT_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'PURCHASE_PAYMENT_ID'. (NullAllowed)
     */
    public Long getPurchasePaymentId() {
        return _purchasePaymentId;
    }

    /**
     * [set] (購入支払ID)PURCHASE_PAYMENT_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @param purchasePaymentId The value of the column 'PURCHASE_PAYMENT_ID'. (NullAllowed)
     */
    public void setPurchasePaymentId(Long purchasePaymentId) {
        __modifiedProperties.add("purchasePaymentId");
        this._purchasePaymentId = purchasePaymentId;
    }

    /**
     * [get] (購入ID)PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to PURCHASE} <br />
     * @return The value of the column 'PURCHASE_ID'. (NullAllowed)
     */
    public Long getPurchaseId() {
        return _purchaseId;
    }

    /**
     * [set] (購入ID)PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to PURCHASE} <br />
     * @param purchaseId The value of the column 'PURCHASE_ID'. (NullAllowed)
     */
    public void setPurchaseId(Long purchaseId) {
        __modifiedProperties.add("purchaseId");
        this._purchaseId = purchaseId;
    }

    /**
     * [get] (支払金額)PAYMENT_AMOUNT: {NotNull, DECIMAL(10, 2)} <br />
     * @return The value of the column 'PAYMENT_AMOUNT'. (NullAllowed)
     */
    public java.math.BigDecimal getPaymentAmount() {
        return _paymentAmount;
    }

    /**
     * [set] (支払金額)PAYMENT_AMOUNT: {NotNull, DECIMAL(10, 2)} <br />
     * @param paymentAmount The value of the column 'PAYMENT_AMOUNT'. (NullAllowed)
     */
    public void setPaymentAmount(java.math.BigDecimal paymentAmount) {
        __modifiedProperties.add("paymentAmount");
        this._paymentAmount = paymentAmount;
    }

    /**
     * [get] (支払日時)PAYMENT_DATETIME: {IX+, NotNull, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'PAYMENT_DATETIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
    public org.joda.time.LocalDateTime getPaymentDatetime() {
        return _paymentDatetime;
    }

    /**
     * [set] (支払日時)PAYMENT_DATETIME: {IX+, NotNull, TIMESTAMP(23, 10)} <br />
     * @param paymentDatetime The value of the column 'PAYMENT_DATETIME'. (NullAllowed)
     */
    public void setPaymentDatetime(org.joda.time.LocalDateTime paymentDatetime) {
        __modifiedProperties.add("paymentDatetime");
        this._paymentDatetime = paymentDatetime;
    }

    /**
     * [get] (支払方法コード)PAYMENT_METHOD_CODE: {NotNull, CHAR(3), classification=PaymentMethod} <br />
     * @return The value of the column 'PAYMENT_METHOD_CODE'. (NullAllowed)
     */
    public String getPaymentMethodCode() {
        return _paymentMethodCode;
    }

    /**
     * [set] (支払方法コード)PAYMENT_METHOD_CODE: {NotNull, CHAR(3), classification=PaymentMethod} <br />
     * @param paymentMethodCode The value of the column 'PAYMENT_METHOD_CODE'. (NullAllowed)
     */
    public void setPaymentMethodCode(String paymentMethodCode) {
        __modifiedProperties.add("paymentMethodCode");
        this._paymentMethodCode = paymentMethodCode;
    }

    /**
     * [get] REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'REGISTER_DATETIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
    public org.joda.time.LocalDateTime getRegisterDatetime() {
        return _registerDatetime;
    }

    /**
     * [set] REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @param registerDatetime The value of the column 'REGISTER_DATETIME'. (NullAllowed)
     */
    public void setRegisterDatetime(org.joda.time.LocalDateTime registerDatetime) {
        __modifiedProperties.add("registerDatetime");
        this._registerDatetime = registerDatetime;
    }

    /**
     * [get] REGISTER_USER: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'REGISTER_USER'. (NullAllowed)
     */
    public String getRegisterUser() {
        return _registerUser;
    }

    /**
     * [set] REGISTER_USER: {NotNull, VARCHAR(200)} <br />
     * @param registerUser The value of the column 'REGISTER_USER'. (NullAllowed)
     */
    public void setRegisterUser(String registerUser) {
        __modifiedProperties.add("registerUser");
        this._registerUser = registerUser;
    }

    /**
     * [get] UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'UPDATE_DATETIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
    public org.joda.time.LocalDateTime getUpdateDatetime() {
        return _updateDatetime;
    }

    /**
     * [set] UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @param updateDatetime The value of the column 'UPDATE_DATETIME'. (NullAllowed)
     */
    public void setUpdateDatetime(org.joda.time.LocalDateTime updateDatetime) {
        __modifiedProperties.add("updateDatetime");
        this._updateDatetime = updateDatetime;
    }

    /**
     * [get] UPDATE_USER: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'UPDATE_USER'. (NullAllowed)
     */
    public String getUpdateUser() {
        return _updateUser;
    }

    /**
     * [set] UPDATE_USER: {NotNull, VARCHAR(200)} <br />
     * @param updateUser The value of the column 'UPDATE_USER'. (NullAllowed)
     */
    public void setUpdateUser(String updateUser) {
        __modifiedProperties.add("updateUser");
        this._updateUser = updateUser;
    }

}
