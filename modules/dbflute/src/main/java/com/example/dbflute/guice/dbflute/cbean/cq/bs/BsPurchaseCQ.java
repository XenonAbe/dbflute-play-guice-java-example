package com.example.dbflute.guice.dbflute.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.guice.dbflute.cbean.cq.ciq.*;
import com.example.dbflute.guice.dbflute.cbean.*;
import com.example.dbflute.guice.dbflute.cbean.cq.*;

/**
 * The base condition-query of PURCHASE.
 * @author DBFlute(AutoGenerator)
 */
public class BsPurchaseCQ extends AbstractBsPurchaseCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected PurchaseCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsPurchaseCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from PURCHASE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public PurchaseCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected PurchaseCIQ xcreateCIQ() {
        PurchaseCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected PurchaseCIQ xnewCIQ() {
        return new PurchaseCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join PURCHASE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public PurchaseCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        PurchaseCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _purchaseId;
    public ConditionValue getPurchaseId()
    { if (_purchaseId == null) { _purchaseId = nCV(); }
      return _purchaseId; }
    protected ConditionValue getCValuePurchaseId() { return getPurchaseId(); }

    public Map<String, PurchasePaymentCQ> getPurchaseId_ExistsReferrer_PurchasePaymentList() { return xgetSQueMap("purchaseId_ExistsReferrer_PurchasePaymentList"); }
    public String keepPurchaseId_ExistsReferrer_PurchasePaymentList(PurchasePaymentCQ sq) { return xkeepSQue("purchaseId_ExistsReferrer_PurchasePaymentList", sq); }

    public Map<String, PurchasePaymentCQ> getPurchaseId_NotExistsReferrer_PurchasePaymentList() { return xgetSQueMap("purchaseId_NotExistsReferrer_PurchasePaymentList"); }
    public String keepPurchaseId_NotExistsReferrer_PurchasePaymentList(PurchasePaymentCQ sq) { return xkeepSQue("purchaseId_NotExistsReferrer_PurchasePaymentList", sq); }

    public Map<String, PurchasePaymentCQ> getPurchaseId_SpecifyDerivedReferrer_PurchasePaymentList() { return xgetSQueMap("purchaseId_SpecifyDerivedReferrer_PurchasePaymentList"); }
    public String keepPurchaseId_SpecifyDerivedReferrer_PurchasePaymentList(PurchasePaymentCQ sq) { return xkeepSQue("purchaseId_SpecifyDerivedReferrer_PurchasePaymentList", sq); }

    public Map<String, PurchasePaymentCQ> getPurchaseId_InScopeRelation_PurchasePaymentList() { return xgetSQueMap("purchaseId_InScopeRelation_PurchasePaymentList"); }
    public String keepPurchaseId_InScopeRelation_PurchasePaymentList(PurchasePaymentCQ sq) { return xkeepSQue("purchaseId_InScopeRelation_PurchasePaymentList", sq); }

    public Map<String, PurchasePaymentCQ> getPurchaseId_NotInScopeRelation_PurchasePaymentList() { return xgetSQueMap("purchaseId_NotInScopeRelation_PurchasePaymentList"); }
    public String keepPurchaseId_NotInScopeRelation_PurchasePaymentList(PurchasePaymentCQ sq) { return xkeepSQue("purchaseId_NotInScopeRelation_PurchasePaymentList", sq); }

    public Map<String, PurchasePaymentCQ> getPurchaseId_QueryDerivedReferrer_PurchasePaymentList() { return xgetSQueMap("purchaseId_QueryDerivedReferrer_PurchasePaymentList"); }
    public String keepPurchaseId_QueryDerivedReferrer_PurchasePaymentList(PurchasePaymentCQ sq) { return xkeepSQue("purchaseId_QueryDerivedReferrer_PurchasePaymentList", sq); }
    public Map<String, Object> getPurchaseId_QueryDerivedReferrer_PurchasePaymentListParameter() { return xgetSQuePmMap("purchaseId_QueryDerivedReferrer_PurchasePaymentList"); }
    public String keepPurchaseId_QueryDerivedReferrer_PurchasePaymentListParameter(Object pm) { return xkeepSQuePm("purchaseId_QueryDerivedReferrer_PurchasePaymentList", pm); }

    /** 
     * Add order-by as ascend. <br />
     * PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PurchaseId_Asc() { regOBA("PURCHASE_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PurchaseId_Desc() { regOBD("PURCHASE_ID"); return this; }

    protected ConditionValue _memberId;
    public ConditionValue getMemberId()
    { if (_memberId == null) { _memberId = nCV(); }
      return _memberId; }
    protected ConditionValue getCValueMemberId() { return getMemberId(); }

    /** 
     * Add order-by as ascend. <br />
     * (会員ID)MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_MemberId_Asc() { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * (会員ID)MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_MemberId_Desc() { regOBD("MEMBER_ID"); return this; }

    protected ConditionValue _productId;
    public ConditionValue getProductId()
    { if (_productId == null) { _productId = nCV(); }
      return _productId; }
    protected ConditionValue getCValueProductId() { return getProductId(); }

    /** 
     * Add order-by as ascend. <br />
     * (商品ID)PRODUCT_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to PRODUCT}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * (商品ID)PRODUCT_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to PRODUCT}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

    protected ConditionValue _purchaseDatetime;
    public ConditionValue getPurchaseDatetime()
    { if (_purchaseDatetime == null) { _purchaseDatetime = nCV(); }
      return _purchaseDatetime; }
    protected ConditionValue getCValuePurchaseDatetime() { return getPurchaseDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * (購入日時)PURCHASE_DATETIME: {+UQ, IX+, NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PurchaseDatetime_Asc() { regOBA("PURCHASE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * (購入日時)PURCHASE_DATETIME: {+UQ, IX+, NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PurchaseDatetime_Desc() { regOBD("PURCHASE_DATETIME"); return this; }

    protected ConditionValue _purchaseCount;
    public ConditionValue getPurchaseCount()
    { if (_purchaseCount == null) { _purchaseCount = nCV(); }
      return _purchaseCount; }
    protected ConditionValue getCValuePurchaseCount() { return getPurchaseCount(); }

    /** 
     * Add order-by as ascend. <br />
     * (購入数量)PURCHASE_COUNT: {NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PurchaseCount_Asc() { regOBA("PURCHASE_COUNT"); return this; }

    /**
     * Add order-by as descend. <br />
     * (購入数量)PURCHASE_COUNT: {NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PurchaseCount_Desc() { regOBD("PURCHASE_COUNT"); return this; }

    protected ConditionValue _purchasePrice;
    public ConditionValue getPurchasePrice()
    { if (_purchasePrice == null) { _purchasePrice = nCV(); }
      return _purchasePrice; }
    protected ConditionValue getCValuePurchasePrice() { return getPurchasePrice(); }

    /** 
     * Add order-by as ascend. <br />
     * (購入価格)PURCHASE_PRICE: {IX, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PurchasePrice_Asc() { regOBA("PURCHASE_PRICE"); return this; }

    /**
     * Add order-by as descend. <br />
     * (購入価格)PURCHASE_PRICE: {IX, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PurchasePrice_Desc() { regOBD("PURCHASE_PRICE"); return this; }

    protected ConditionValue _paymentCompleteFlg;
    public ConditionValue getPaymentCompleteFlg()
    { if (_paymentCompleteFlg == null) { _paymentCompleteFlg = nCV(); }
      return _paymentCompleteFlg; }
    protected ConditionValue getCValuePaymentCompleteFlg() { return getPaymentCompleteFlg(); }

    /** 
     * Add order-by as ascend. <br />
     * (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(10), classification=Flg}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PaymentCompleteFlg_Asc() { regOBA("PAYMENT_COMPLETE_FLG"); return this; }

    /**
     * Add order-by as descend. <br />
     * (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(10), classification=Flg}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PaymentCompleteFlg_Desc() { regOBD("PAYMENT_COMPLETE_FLG"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue getRegisterDatetime()
    { if (_registerDatetime == null) { _registerDatetime = nCV(); }
      return _registerDatetime; }
    protected ConditionValue getCValueRegisterDatetime() { return getRegisterDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

    protected ConditionValue _registerUser;
    public ConditionValue getRegisterUser()
    { if (_registerUser == null) { _registerUser = nCV(); }
      return _registerUser; }
    protected ConditionValue getCValueRegisterUser() { return getRegisterUser(); }

    /** 
     * Add order-by as ascend. <br />
     * REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue getUpdateDatetime()
    { if (_updateDatetime == null) { _updateDatetime = nCV(); }
      return _updateDatetime; }
    protected ConditionValue getCValueUpdateDatetime() { return getUpdateDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

    protected ConditionValue _updateUser;
    public ConditionValue getUpdateUser()
    { if (_updateUser == null) { _updateUser = nCV(); }
      return _updateUser; }
    protected ConditionValue getCValueUpdateUser() { return getUpdateUser(); }

    /** 
     * Add order-by as ascend. <br />
     * UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue getVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue getCValueVersionNo() { return getVersionNo(); }

    /** 
     * Add order-by as ascend. <br />
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br />
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #DD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #DD4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #DD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #DD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #DD4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #DD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        PurchaseCQ bq = (PurchaseCQ)bqs;
        PurchaseCQ uq = (PurchaseCQ)uqs;
        if (bq.hasConditionQueryMember()) {
            uq.queryMember().reflectRelationOnUnionQuery(bq.queryMember(), uq.queryMember());
        }
        if (bq.hasConditionQueryProduct()) {
            uq.queryProduct().reflectRelationOnUnionQuery(bq.queryProduct(), uq.queryProduct());
        }
        if (bq.hasConditionQuerySummaryProduct()) {
            uq.querySummaryProduct().reflectRelationOnUnionQuery(bq.querySummaryProduct(), uq.querySummaryProduct());
        }
        if (bq.hasConditionQueryMemberLoginAsBizManyToOne()) {
            uq.queryMemberLoginAsBizManyToOne().reflectRelationOnUnionQuery(bq.queryMemberLoginAsBizManyToOne(), uq.queryMemberLoginAsBizManyToOne());
        }
        if (bq.hasConditionQueryWhiteDateTermAsValid()) {
            uq.queryWhiteDateTermAsValid().reflectRelationOnUnionQuery(bq.queryWhiteDateTermAsValid(), uq.queryWhiteDateTermAsValid());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * (会員)MEMBER by my MEMBER_ID, named 'member'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberCQ queryMember() {
        return getConditionQueryMember();
    }
    public MemberCQ getConditionQueryMember() {
        String prop = "member";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMember()); xsetupOuterJoinMember(); }
        return xgetQueRlMap(prop);
    }
    protected MemberCQ xcreateQueryMember() {
        String nrp = xresolveNRP("PURCHASE", "member"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "member", nrp);
    }
    protected void xsetupOuterJoinMember() { xregOutJo("member"); }
    public boolean hasConditionQueryMember() { return xhasQueRlMap("member"); }

    /**
     * Get the condition-query for relation table. <br />
     * (商品)PRODUCT by my PRODUCT_ID, named 'product'.
     * @return The instance of condition-query. (NotNull)
     */
    public ProductCQ queryProduct() {
        return getConditionQueryProduct();
    }
    public ProductCQ getConditionQueryProduct() {
        String prop = "product";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryProduct()); xsetupOuterJoinProduct(); }
        return xgetQueRlMap(prop);
    }
    protected ProductCQ xcreateQueryProduct() {
        String nrp = xresolveNRP("PURCHASE", "product"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new ProductCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "product", nrp);
    }
    protected void xsetupOuterJoinProduct() { xregOutJo("product"); }
    public boolean hasConditionQueryProduct() { return xhasQueRlMap("product"); }

    /**
     * Get the condition-query for relation table. <br />
     * SUMMARY_PRODUCT by my PRODUCT_ID, named 'summaryProduct'.
     * @return The instance of condition-query. (NotNull)
     */
    public SummaryProductCQ querySummaryProduct() {
        return getConditionQuerySummaryProduct();
    }
    public SummaryProductCQ getConditionQuerySummaryProduct() {
        String prop = "summaryProduct";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQuerySummaryProduct()); xsetupOuterJoinSummaryProduct(); }
        return xgetQueRlMap(prop);
    }
    protected SummaryProductCQ xcreateQuerySummaryProduct() {
        String nrp = xresolveNRP("PURCHASE", "summaryProduct"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new SummaryProductCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "summaryProduct", nrp);
    }
    protected void xsetupOuterJoinSummaryProduct() { xregOutJo("summaryProduct"); }
    public boolean hasConditionQuerySummaryProduct() { return xhasQueRlMap("summaryProduct"); }

    /**
     * Get the condition-query for relation table. <br />
     * (会員ログイン)MEMBER_LOGIN by my MEMBER_ID, named 'memberLoginAsBizManyToOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberLoginCQ queryMemberLoginAsBizManyToOne() {
        return getConditionQueryMemberLoginAsBizManyToOne();
    }
    public MemberLoginCQ getConditionQueryMemberLoginAsBizManyToOne() {
        String prop = "memberLoginAsBizManyToOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberLoginAsBizManyToOne()); xsetupOuterJoinMemberLoginAsBizManyToOne(); }
        return xgetQueRlMap(prop);
    }
    protected MemberLoginCQ xcreateQueryMemberLoginAsBizManyToOne() {
        String nrp = xresolveNRP("PURCHASE", "memberLoginAsBizManyToOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberLoginCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberLoginAsBizManyToOne", nrp);
    }
    protected void xsetupOuterJoinMemberLoginAsBizManyToOne() { xregOutJo("memberLoginAsBizManyToOne"); }
    public boolean hasConditionQueryMemberLoginAsBizManyToOne() { return xhasQueRlMap("memberLoginAsBizManyToOne"); }

    /**
     * Get the condition-query for relation table. <br />
     * WHITE_DATE_TERM by my , named 'whiteDateTermAsValid'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteDateTermCQ queryWhiteDateTermAsValid() {
        return getConditionQueryWhiteDateTermAsValid();
    }
    public WhiteDateTermCQ getConditionQueryWhiteDateTermAsValid() {
        String prop = "whiteDateTermAsValid";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteDateTermAsValid()); xsetupOuterJoinWhiteDateTermAsValid(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteDateTermCQ xcreateQueryWhiteDateTermAsValid() {
        String nrp = xresolveNRP("PURCHASE", "whiteDateTermAsValid"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteDateTermCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteDateTermAsValid", nrp);
    }
    protected void xsetupOuterJoinWhiteDateTermAsValid() { xregOutJo("whiteDateTermAsValid"); }
    public boolean hasConditionQueryWhiteDateTermAsValid() { return xhasQueRlMap("whiteDateTermAsValid"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, PurchaseCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(PurchaseCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, PurchaseCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(PurchaseCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, PurchaseCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(PurchaseCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, PurchaseCQ> _myselfExistsMap;
    public Map<String, PurchaseCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(PurchaseCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, PurchaseCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(PurchaseCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return PurchaseCB.class.getName(); }
    protected String xCQ() { return PurchaseCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
