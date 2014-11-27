package com.example.dbflute.guice.simpleflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.example.dbflute.guice.simpleflute.AppCDef;
import com.example.dbflute.guice.simpleflute.dto.*;

/**
 * The simple DTO of (購入)PURCHASE as TABLE. <br />
 * <pre>
 * [primary-key]
 *     PURCHASE_ID
 * 
 * [column]
 *     PURCHASE_ID, MEMBER_ID, PRODUCT_ID, PURCHASE_DATETIME, PURCHASE_COUNT, PURCHASE_PRICE, PAYMENT_COMPLETE_FLG, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 * 
 * [sequence]
 *     PUBLIC.SEQ_PURCHASE
 * 
 * [identity]
 *     PURCHASE_ID
 * 
 * [version-no]
 *     VERSION_NO
 * 
 * [foreign-table]
 *     MEMBER, PRODUCT, SUMMARY_PRODUCT, MEMBER_LOGIN(AsBizManyToOne), WHITE_DATE_TERM(AsValid)
 * 
 * [referrer-table]
 *     PURCHASE_PAYMENT
 * 
 * [foreign-property]
 *     member, product, summaryProduct, memberLoginAsBizManyToOne, whiteDateTermAsValid
 * 
 * [referrer-property]
 *     purchasePaymentList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsPurchaseDto implements Serializable {

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
    /** PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _purchaseId;

    /** (会員ID)MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER} */
    @JsonKey
    protected Integer _memberId;

    /** (商品ID)PRODUCT_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to PRODUCT} */
    @JsonKey
    protected Integer _productId;

    /** (購入日時)PURCHASE_DATETIME: {+UQ, IX+, NotNull, TIMESTAMP(23, 10)} */
    @JsonKey
    protected org.joda.time.LocalDateTime _purchaseDatetime;

    /** (購入数量)PURCHASE_COUNT: {NotNull, INTEGER(10)} */
    @JsonKey
    protected Integer _purchaseCount;

    /** (購入価格)PURCHASE_PRICE: {IX, NotNull, INTEGER(10)} */
    @JsonKey
    protected Integer _purchasePrice;

    /** (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(10), classification=Flg} */
    @JsonKey
    protected Integer _paymentCompleteFlg;

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

    /** VERSION_NO: {NotNull, BIGINT(19)} */
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
    public BsPurchaseDto() {
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Set the value of paymentCompleteFlg as the classification of Flg. <br />
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed)
     */
    public void setPaymentCompleteFlgAsFlg(AppCDef.Flg cdef) {
        setPaymentCompleteFlg(cdef != null ? Integer.valueOf(cdef.code()) : null);
    }

    /**
     * Get the value of paymentCompleteFlg as the classification of Flg. <br />
     * general boolean classification for every flg-column
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed)
     */
    public AppCDef.Flg getPaymentCompleteFlgAsFlg() {
        return AppCDef.Flg.codeOf(getPaymentCompleteFlg());
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of paymentCompleteFlg as True. <br />
     * Yes: means valid
     */
    public void setPaymentCompleteFlg_True() {
        setPaymentCompleteFlgAsFlg(AppCDef.Flg.True);
    }

    /**
     * Set the value of paymentCompleteFlg as False. <br />
     * No: means invalid
     */
    public void setPaymentCompleteFlg_False() {
        setPaymentCompleteFlgAsFlg(AppCDef.Flg.False);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of paymentCompleteFlg 'True'? <br />
     * Yes: means valid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPaymentCompleteFlgTrue() {
        AppCDef.Flg cdef = getPaymentCompleteFlgAsFlg();
        return cdef != null ? cdef.equals(AppCDef.Flg.True) : false;
    }

    /**
     * Is the value of paymentCompleteFlg 'False'? <br />
     * No: means invalid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPaymentCompleteFlgFalse() {
        AppCDef.Flg cdef = getPaymentCompleteFlgAsFlg();
        return cdef != null ? cdef.equals(AppCDef.Flg.False) : false;
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    protected MemberDto _member;

    public MemberDto getMember() {
        return _member;
    }

    public void setMember(MemberDto member) {
        this._member = member;
    }

    protected ProductDto _product;

    public ProductDto getProduct() {
        return _product;
    }

    public void setProduct(ProductDto product) {
        this._product = product;
    }

    protected SummaryProductDto _summaryProduct;

    public SummaryProductDto getSummaryProduct() {
        return _summaryProduct;
    }

    public void setSummaryProduct(SummaryProductDto summaryProduct) {
        this._summaryProduct = summaryProduct;
    }

    protected MemberLoginDto _memberLoginAsBizManyToOne;

    public MemberLoginDto getMemberLoginAsBizManyToOne() {
        return _memberLoginAsBizManyToOne;
    }

    public void setMemberLoginAsBizManyToOne(MemberLoginDto memberLoginAsBizManyToOne) {
        this._memberLoginAsBizManyToOne = memberLoginAsBizManyToOne;
    }

    protected WhiteDateTermDto _whiteDateTermAsValid;

    public WhiteDateTermDto getWhiteDateTermAsValid() {
        return _whiteDateTermAsValid;
    }

    public void setWhiteDateTermAsValid(WhiteDateTermDto whiteDateTermAsValid) {
        this._whiteDateTermAsValid = whiteDateTermAsValid;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<PurchasePaymentDto> _purchasePaymentList;

    public List<PurchasePaymentDto> getPurchasePaymentList() {
        if (_purchasePaymentList == null) { _purchasePaymentList = new ArrayList<PurchasePaymentDto>(); }
        return _purchasePaymentList;
    }

    public void setPurchasePaymentList(List<PurchasePaymentDto> purchasePaymentList) {
        this._purchasePaymentList = purchasePaymentList;
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
        if (other == null || !(other instanceof BsPurchaseDto)) { return false; }
        final BsPurchaseDto otherEntity = (BsPurchaseDto)other;
        if (!helpComparingValue(getPurchaseId(), otherEntity.getPurchaseId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "PURCHASE");
        result = xCH(result, getPurchaseId());
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
        sb.append(c).append(getPurchaseId());
        sb.append(c).append(getMemberId());
        sb.append(c).append(getProductId());
        sb.append(c).append(getPurchaseDatetime());
        sb.append(c).append(getPurchaseCount());
        sb.append(c).append(getPurchasePrice());
        sb.append(c).append(getPaymentCompleteFlg());
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
     * [get] PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'PURCHASE_ID'. (NullAllowed)
     */
    public Long getPurchaseId() {
        return _purchaseId;
    }

    /**
     * [set] PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @param purchaseId The value of the column 'PURCHASE_ID'. (NullAllowed)
     */
    public void setPurchaseId(Long purchaseId) {
        __modifiedProperties.add("purchaseId");
        this._purchaseId = purchaseId;
    }

    /**
     * [get] (会員ID)MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER} <br />
     * @return The value of the column 'MEMBER_ID'. (NullAllowed)
     */
    public Integer getMemberId() {
        return _memberId;
    }

    /**
     * [set] (会員ID)MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER} <br />
     * @param memberId The value of the column 'MEMBER_ID'. (NullAllowed)
     */
    public void setMemberId(Integer memberId) {
        __modifiedProperties.add("memberId");
        this._memberId = memberId;
    }

    /**
     * [get] (商品ID)PRODUCT_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to PRODUCT} <br />
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public Integer getProductId() {
        return _productId;
    }

    /**
     * [set] (商品ID)PRODUCT_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to PRODUCT} <br />
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public void setProductId(Integer productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
    }

    /**
     * [get] (購入日時)PURCHASE_DATETIME: {+UQ, IX+, NotNull, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'PURCHASE_DATETIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
    public org.joda.time.LocalDateTime getPurchaseDatetime() {
        return _purchaseDatetime;
    }

    /**
     * [set] (購入日時)PURCHASE_DATETIME: {+UQ, IX+, NotNull, TIMESTAMP(23, 10)} <br />
     * @param purchaseDatetime The value of the column 'PURCHASE_DATETIME'. (NullAllowed)
     */
    public void setPurchaseDatetime(org.joda.time.LocalDateTime purchaseDatetime) {
        __modifiedProperties.add("purchaseDatetime");
        this._purchaseDatetime = purchaseDatetime;
    }

    /**
     * [get] (購入数量)PURCHASE_COUNT: {NotNull, INTEGER(10)} <br />
     * @return The value of the column 'PURCHASE_COUNT'. (NullAllowed)
     */
    public Integer getPurchaseCount() {
        return _purchaseCount;
    }

    /**
     * [set] (購入数量)PURCHASE_COUNT: {NotNull, INTEGER(10)} <br />
     * @param purchaseCount The value of the column 'PURCHASE_COUNT'. (NullAllowed)
     */
    public void setPurchaseCount(Integer purchaseCount) {
        __modifiedProperties.add("purchaseCount");
        this._purchaseCount = purchaseCount;
    }

    /**
     * [get] (購入価格)PURCHASE_PRICE: {IX, NotNull, INTEGER(10)} <br />
     * @return The value of the column 'PURCHASE_PRICE'. (NullAllowed)
     */
    public Integer getPurchasePrice() {
        return _purchasePrice;
    }

    /**
     * [set] (購入価格)PURCHASE_PRICE: {IX, NotNull, INTEGER(10)} <br />
     * @param purchasePrice The value of the column 'PURCHASE_PRICE'. (NullAllowed)
     */
    public void setPurchasePrice(Integer purchasePrice) {
        __modifiedProperties.add("purchasePrice");
        this._purchasePrice = purchasePrice;
    }

    /**
     * [get] (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * @return The value of the column 'PAYMENT_COMPLETE_FLG'. (NullAllowed)
     */
    public Integer getPaymentCompleteFlg() {
        return _paymentCompleteFlg;
    }

    /**
     * [set] (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * @param paymentCompleteFlg The value of the column 'PAYMENT_COMPLETE_FLG'. (NullAllowed)
     */
    public void setPaymentCompleteFlg(Integer paymentCompleteFlg) {
        __modifiedProperties.add("paymentCompleteFlg");
        this._paymentCompleteFlg = paymentCompleteFlg;
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

    /**
     * [get] VERSION_NO: {NotNull, BIGINT(19)} <br />
     * @return The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public Long getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, BIGINT(19)} <br />
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public void setVersionNo(Long versionNo) {
        __modifiedProperties.add("versionNo");
        this._versionNo = versionNo;
    }

}
