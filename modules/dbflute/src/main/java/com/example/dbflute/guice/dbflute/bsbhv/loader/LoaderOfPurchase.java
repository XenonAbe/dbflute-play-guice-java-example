package com.example.dbflute.guice.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import com.example.dbflute.guice.dbflute.exbhv.*;
import com.example.dbflute.guice.dbflute.exentity.*;
import com.example.dbflute.guice.dbflute.cbean.*;

/**
 * The referrer loader of (購入)PURCHASE as TABLE. <br />
 * <pre>
 * [primary key]
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
 * [foreign table]
 *     MEMBER, PRODUCT, SUMMARY_PRODUCT, MEMBER_LOGIN(AsBizManyToOne), WHITE_DATE_TERM(AsValid)
 *
 * [referrer table]
 *     PURCHASE_PAYMENT
 *
 * [foreign property]
 *     member, product, summaryProduct, memberLoginAsBizManyToOne, whiteDateTermAsValid
 *
 * [referrer property]
 *     purchasePaymentList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfPurchase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Purchase> _selectedList;
    protected BehaviorSelector _selector;
    protected PurchaseBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfPurchase ready(List<Purchase> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected PurchaseBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(PurchaseBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<PurchasePayment> _referrerPurchasePayment;
    public NestedReferrerLoaderGateway<LoaderOfPurchasePayment> loadPurchasePayment(ReferrerConditionSetupper<PurchasePaymentCB> setupper) {
        myBhv().loadPurchasePayment(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<PurchasePayment>() {
            public void handle(List<PurchasePayment> referrerList) { _referrerPurchasePayment = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfPurchasePayment>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfPurchasePayment> handler) {
                handler.handle(new LoaderOfPurchasePayment().ready(_referrerPurchasePayment, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMember _foreignMemberLoader;
    public LoaderOfMember pulloutMember() {
        if (_foreignMemberLoader != null) { return _foreignMemberLoader; }
        List<Member> pulledList = myBhv().pulloutMember(_selectedList);
        _foreignMemberLoader = new LoaderOfMember().ready(pulledList, _selector);
        return _foreignMemberLoader;
    }

    protected LoaderOfProduct _foreignProductLoader;
    public LoaderOfProduct pulloutProduct() {
        if (_foreignProductLoader != null) { return _foreignProductLoader; }
        List<Product> pulledList = myBhv().pulloutProduct(_selectedList);
        _foreignProductLoader = new LoaderOfProduct().ready(pulledList, _selector);
        return _foreignProductLoader;
    }

    protected LoaderOfSummaryProduct _foreignSummaryProductLoader;
    public LoaderOfSummaryProduct pulloutSummaryProduct() {
        if (_foreignSummaryProductLoader != null) { return _foreignSummaryProductLoader; }
        List<SummaryProduct> pulledList = myBhv().pulloutSummaryProduct(_selectedList);
        _foreignSummaryProductLoader = new LoaderOfSummaryProduct().ready(pulledList, _selector);
        return _foreignSummaryProductLoader;
    }

    protected LoaderOfMemberLogin _foreignMemberLoginAsBizManyToOneLoader;
    public LoaderOfMemberLogin pulloutMemberLoginAsBizManyToOne() {
        if (_foreignMemberLoginAsBizManyToOneLoader != null) { return _foreignMemberLoginAsBizManyToOneLoader; }
        List<MemberLogin> pulledList = myBhv().pulloutMemberLoginAsBizManyToOne(_selectedList);
        _foreignMemberLoginAsBizManyToOneLoader = new LoaderOfMemberLogin().ready(pulledList, _selector);
        return _foreignMemberLoginAsBizManyToOneLoader;
    }

    protected LoaderOfWhiteDateTerm _foreignWhiteDateTermAsValidLoader;
    public LoaderOfWhiteDateTerm pulloutWhiteDateTermAsValid() {
        if (_foreignWhiteDateTermAsValidLoader != null) { return _foreignWhiteDateTermAsValidLoader; }
        List<WhiteDateTerm> pulledList = myBhv().pulloutWhiteDateTermAsValid(_selectedList);
        _foreignWhiteDateTermAsValidLoader = new LoaderOfWhiteDateTerm().ready(pulledList, _selector);
        return _foreignWhiteDateTermAsValidLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Purchase> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
