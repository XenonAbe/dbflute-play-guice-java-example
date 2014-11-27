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
 * The base condition-query of PRODUCT_STATUS.
 * @author DBFlute(AutoGenerator)
 */
public class BsProductStatusCQ extends AbstractBsProductStatusCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ProductStatusCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsProductStatusCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from PRODUCT_STATUS) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ProductStatusCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ProductStatusCIQ xcreateCIQ() {
        ProductStatusCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ProductStatusCIQ xnewCIQ() {
        return new ProductStatusCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join PRODUCT_STATUS on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ProductStatusCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ProductStatusCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _productStatusCode;
    public ConditionValue getProductStatusCode()
    { if (_productStatusCode == null) { _productStatusCode = nCV(); }
      return _productStatusCode; }
    protected ConditionValue getCValueProductStatusCode() { return getProductStatusCode(); }

    public Map<String, ProductCQ> getProductStatusCode_ExistsReferrer_ProductList() { return xgetSQueMap("productStatusCode_ExistsReferrer_ProductList"); }
    public String keepProductStatusCode_ExistsReferrer_ProductList(ProductCQ sq) { return xkeepSQue("productStatusCode_ExistsReferrer_ProductList", sq); }

    public Map<String, SummaryProductCQ> getProductStatusCode_ExistsReferrer_SummaryProductList() { return xgetSQueMap("productStatusCode_ExistsReferrer_SummaryProductList"); }
    public String keepProductStatusCode_ExistsReferrer_SummaryProductList(SummaryProductCQ sq) { return xkeepSQue("productStatusCode_ExistsReferrer_SummaryProductList", sq); }

    public Map<String, ProductCQ> getProductStatusCode_NotExistsReferrer_ProductList() { return xgetSQueMap("productStatusCode_NotExistsReferrer_ProductList"); }
    public String keepProductStatusCode_NotExistsReferrer_ProductList(ProductCQ sq) { return xkeepSQue("productStatusCode_NotExistsReferrer_ProductList", sq); }

    public Map<String, SummaryProductCQ> getProductStatusCode_NotExistsReferrer_SummaryProductList() { return xgetSQueMap("productStatusCode_NotExistsReferrer_SummaryProductList"); }
    public String keepProductStatusCode_NotExistsReferrer_SummaryProductList(SummaryProductCQ sq) { return xkeepSQue("productStatusCode_NotExistsReferrer_SummaryProductList", sq); }

    public Map<String, ProductCQ> getProductStatusCode_InScopeRelation_ProductList() { return xgetSQueMap("productStatusCode_InScopeRelation_ProductList"); }
    public String keepProductStatusCode_InScopeRelation_ProductList(ProductCQ sq) { return xkeepSQue("productStatusCode_InScopeRelation_ProductList", sq); }

    public Map<String, SummaryProductCQ> getProductStatusCode_InScopeRelation_SummaryProductList() { return xgetSQueMap("productStatusCode_InScopeRelation_SummaryProductList"); }
    public String keepProductStatusCode_InScopeRelation_SummaryProductList(SummaryProductCQ sq) { return xkeepSQue("productStatusCode_InScopeRelation_SummaryProductList", sq); }

    public Map<String, ProductCQ> getProductStatusCode_NotInScopeRelation_ProductList() { return xgetSQueMap("productStatusCode_NotInScopeRelation_ProductList"); }
    public String keepProductStatusCode_NotInScopeRelation_ProductList(ProductCQ sq) { return xkeepSQue("productStatusCode_NotInScopeRelation_ProductList", sq); }

    public Map<String, SummaryProductCQ> getProductStatusCode_NotInScopeRelation_SummaryProductList() { return xgetSQueMap("productStatusCode_NotInScopeRelation_SummaryProductList"); }
    public String keepProductStatusCode_NotInScopeRelation_SummaryProductList(SummaryProductCQ sq) { return xkeepSQue("productStatusCode_NotInScopeRelation_SummaryProductList", sq); }

    public Map<String, ProductCQ> getProductStatusCode_SpecifyDerivedReferrer_ProductList() { return xgetSQueMap("productStatusCode_SpecifyDerivedReferrer_ProductList"); }
    public String keepProductStatusCode_SpecifyDerivedReferrer_ProductList(ProductCQ sq) { return xkeepSQue("productStatusCode_SpecifyDerivedReferrer_ProductList", sq); }

    public Map<String, SummaryProductCQ> getProductStatusCode_SpecifyDerivedReferrer_SummaryProductList() { return xgetSQueMap("productStatusCode_SpecifyDerivedReferrer_SummaryProductList"); }
    public String keepProductStatusCode_SpecifyDerivedReferrer_SummaryProductList(SummaryProductCQ sq) { return xkeepSQue("productStatusCode_SpecifyDerivedReferrer_SummaryProductList", sq); }

    public Map<String, ProductCQ> getProductStatusCode_QueryDerivedReferrer_ProductList() { return xgetSQueMap("productStatusCode_QueryDerivedReferrer_ProductList"); }
    public String keepProductStatusCode_QueryDerivedReferrer_ProductList(ProductCQ sq) { return xkeepSQue("productStatusCode_QueryDerivedReferrer_ProductList", sq); }
    public Map<String, Object> getProductStatusCode_QueryDerivedReferrer_ProductListParameter() { return xgetSQuePmMap("productStatusCode_QueryDerivedReferrer_ProductList"); }
    public String keepProductStatusCode_QueryDerivedReferrer_ProductListParameter(Object pm) { return xkeepSQuePm("productStatusCode_QueryDerivedReferrer_ProductList", pm); }

    public Map<String, SummaryProductCQ> getProductStatusCode_QueryDerivedReferrer_SummaryProductList() { return xgetSQueMap("productStatusCode_QueryDerivedReferrer_SummaryProductList"); }
    public String keepProductStatusCode_QueryDerivedReferrer_SummaryProductList(SummaryProductCQ sq) { return xkeepSQue("productStatusCode_QueryDerivedReferrer_SummaryProductList", sq); }
    public Map<String, Object> getProductStatusCode_QueryDerivedReferrer_SummaryProductListParameter() { return xgetSQuePmMap("productStatusCode_QueryDerivedReferrer_SummaryProductList"); }
    public String keepProductStatusCode_QueryDerivedReferrer_SummaryProductListParameter(Object pm) { return xkeepSQuePm("productStatusCode_QueryDerivedReferrer_SummaryProductList", pm); }

    /** 
     * Add order-by as ascend. <br />
     * (商品ステータスコード)PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3), classification=ProductStatus}
     * @return this. (NotNull)
     */
    public BsProductStatusCQ addOrderBy_ProductStatusCode_Asc() { regOBA("PRODUCT_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * (商品ステータスコード)PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3), classification=ProductStatus}
     * @return this. (NotNull)
     */
    public BsProductStatusCQ addOrderBy_ProductStatusCode_Desc() { regOBD("PRODUCT_STATUS_CODE"); return this; }

    protected ConditionValue _productStatusName;
    public ConditionValue getProductStatusName()
    { if (_productStatusName == null) { _productStatusName = nCV(); }
      return _productStatusName; }
    protected ConditionValue getCValueProductStatusName() { return getProductStatusName(); }

    /** 
     * Add order-by as ascend. <br />
     * (商品ステータス名称)PRODUCT_STATUS_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsProductStatusCQ addOrderBy_ProductStatusName_Asc() { regOBA("PRODUCT_STATUS_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * (商品ステータス名称)PRODUCT_STATUS_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsProductStatusCQ addOrderBy_ProductStatusName_Desc() { regOBD("PRODUCT_STATUS_NAME"); return this; }

    protected ConditionValue _displayOrder;
    public ConditionValue getDisplayOrder()
    { if (_displayOrder == null) { _displayOrder = nCV(); }
      return _displayOrder; }
    protected ConditionValue getCValueDisplayOrder() { return getDisplayOrder(); }

    /** 
     * Add order-by as ascend. <br />
     * (表示順)DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsProductStatusCQ addOrderBy_DisplayOrder_Asc() { regOBA("DISPLAY_ORDER"); return this; }

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
    public BsProductStatusCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsProductStatusCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ProductStatusCB.class.getName(); }
    protected String xCQ() { return ProductStatusCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
