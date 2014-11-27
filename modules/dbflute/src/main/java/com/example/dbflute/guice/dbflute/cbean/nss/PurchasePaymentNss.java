package com.example.dbflute.guice.dbflute.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.guice.dbflute.cbean.cq.PurchasePaymentCQ;

/**
 * The nest select set-upper of PURCHASE_PAYMENT.
 * @author DBFlute(AutoGenerator)
 */
public class PurchasePaymentNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected PurchasePaymentCQ _query;
    public PurchasePaymentNss(PurchasePaymentCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * (購入)PURCHASE by my PURCHASE_ID, named 'purchase'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public PurchaseNss withPurchase() {
        _query.doNss(new PurchasePaymentCQ.NssCall() { public ConditionQuery qf() { return _query.queryPurchase(); }});
        return new PurchaseNss(_query.queryPurchase());
    }
}
