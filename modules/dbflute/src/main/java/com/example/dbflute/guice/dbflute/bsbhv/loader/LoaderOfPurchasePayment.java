package com.example.dbflute.guice.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.guice.dbflute.exbhv.*;
import com.example.dbflute.guice.dbflute.exentity.*;

/**
 * The referrer loader of (購入支払)PURCHASE_PAYMENT as TABLE. <br />
 * <pre>
 * [primary key]
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
 * [foreign table]
 *     PURCHASE
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     purchase
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfPurchasePayment {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<PurchasePayment> _selectedList;
    protected BehaviorSelector _selector;
    protected PurchasePaymentBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfPurchasePayment ready(List<PurchasePayment> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected PurchasePaymentBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(PurchasePaymentBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfPurchase _foreignPurchaseLoader;
    public LoaderOfPurchase pulloutPurchase() {
        if (_foreignPurchaseLoader != null) { return _foreignPurchaseLoader; }
        List<Purchase> pulledList = myBhv().pulloutPurchase(_selectedList);
        _foreignPurchaseLoader = new LoaderOfPurchase().ready(pulledList, _selector);
        return _foreignPurchaseLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<PurchasePayment> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
