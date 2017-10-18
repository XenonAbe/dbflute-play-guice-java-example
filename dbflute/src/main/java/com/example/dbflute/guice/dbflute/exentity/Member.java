package com.example.dbflute.guice.dbflute.exentity;

import org.joda.time.LocalDateTime;

/**
 * The entity of MEMBER.
 * @author DBFlute(AutoGenerator)
 */
public class Member extends com.example.dbflute.guice.dbflute.bsentity.BsMember {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    public static final String PROP_latestLoginDatetime = "latestLoginDatetime";
    public static final String PROP_loginCount = "loginCount";
    public static final String PROP_productKindCount = "productKindCount";

    /** HIGHEST_PURCHASE_PRICE: Derived Referrer Alias. */
    public static final String PROP_highestPurchasePrice = "HIGHEST_PURCHASE_PRICE";

    /** PROP_TOTAL_PAYMENT_AMOUNT: Derived Referrer Alias. */
    public static final String PROP_totalPaymentAmount = "PROP_TOTAL_PAYMENT_AMOUNT";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** 導出カラム「最終ログイン日時」のためのプロパティ。これは手動で作成する。 */
    protected LocalDateTime _latestLoginDatetime;

    /** 導出カラム「ログイン回数」のためのプロパティ。これは手動で作成する。 */
    protected Integer _loginCount;

    /** 導出カラム「プロダクト種類数」のためのプロパティ。これは手動で作成する。 */
    protected Integer _productKindCount;

    /** HIGHEST_PURCHASE_PRICE: (Derived Referrer) */
    protected Integer _highestPurchasePrice;

    /** PROP_TOTAL_PAYMENT_AMOUNT: (Derived Referrer) */
    protected Integer _propTotalPaymentAmount;

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public LocalDateTime getLatestLoginDatetime() {
        return _latestLoginDatetime;
    }

    public void setLatestLoginDatetime(LocalDateTime latestLoginDatetime) {
        _latestLoginDatetime = latestLoginDatetime;
    }

    public Integer getLoginCount() {
        return _loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this._loginCount = loginCount;
    }

    public Integer getProductKindCount() {
        return _productKindCount;
    }

    public void setProductKindCount(Integer productKindCount) {
        this._productKindCount = productKindCount;
    }

    /**
     * [get] HIGHEST_PURCHASE_PRICE: (Derived Referrer)
     * @return The value of the column 'HIGHEST_PURCHASE_PRICE'. (NullAllowed)
     */
    public Integer getHighestPurchasePrice() {
        return _highestPurchasePrice;
    }

    /**
     * [set] HIGHEST_PURCHASE_PRICE: (Derived Referrer)
     * @param highestPurchasePrice The value of the column 'HIGHEST_PURCHASE_PRICE'. (NullAllowed)
     */
    public void setHighestPurchasePrice(Integer highestPurchasePrice) {
        _highestPurchasePrice = highestPurchasePrice;
    }

    /**
     * [get] PROP_TOTAL_PAYMENT_AMOUNT: (Derived Referrer)
     * @return The value of the column 'PROP_TOTAL_PAYMENT_AMOUNT'. (NullAllowed)
     */
    public Integer getPropTotalPaymentAmount() {
        return _propTotalPaymentAmount;
    }

    /**
     * [set] PROP_TOTAL_PAYMENT_AMOUNT: (Derived Referrer)
     * @param propTotalPaymentAmount The value of the column 'PROP_TOTAL_PAYMENT_AMOUNT'. (NullAllowed)
     */
    public void setPropTotalPaymentAmount(Integer propTotalPaymentAmount) {
        _propTotalPaymentAmount = propTotalPaymentAmount;
    }
}
