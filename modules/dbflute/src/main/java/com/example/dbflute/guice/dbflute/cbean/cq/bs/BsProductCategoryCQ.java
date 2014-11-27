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
 * The base condition-query of PRODUCT_CATEGORY.
 * @author DBFlute(AutoGenerator)
 */
public class BsProductCategoryCQ extends AbstractBsProductCategoryCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ProductCategoryCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsProductCategoryCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from PRODUCT_CATEGORY) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ProductCategoryCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ProductCategoryCIQ xcreateCIQ() {
        ProductCategoryCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ProductCategoryCIQ xnewCIQ() {
        return new ProductCategoryCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join PRODUCT_CATEGORY on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ProductCategoryCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ProductCategoryCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _productCategoryCode;
    public ConditionValue getProductCategoryCode()
    { if (_productCategoryCode == null) { _productCategoryCode = nCV(); }
      return _productCategoryCode; }
    protected ConditionValue getCValueProductCategoryCode() { return getProductCategoryCode(); }

    public Map<String, ProductCQ> getProductCategoryCode_ExistsReferrer_ProductList() { return xgetSQueMap("productCategoryCode_ExistsReferrer_ProductList"); }
    public String keepProductCategoryCode_ExistsReferrer_ProductList(ProductCQ sq) { return xkeepSQue("productCategoryCode_ExistsReferrer_ProductList", sq); }

    public Map<String, ProductCategoryCQ> getProductCategoryCode_ExistsReferrer_ProductCategorySelfList() { return xgetSQueMap("productCategoryCode_ExistsReferrer_ProductCategorySelfList"); }
    public String keepProductCategoryCode_ExistsReferrer_ProductCategorySelfList(ProductCategoryCQ sq) { return xkeepSQue("productCategoryCode_ExistsReferrer_ProductCategorySelfList", sq); }

    public Map<String, ProductCQ> getProductCategoryCode_NotExistsReferrer_ProductList() { return xgetSQueMap("productCategoryCode_NotExistsReferrer_ProductList"); }
    public String keepProductCategoryCode_NotExistsReferrer_ProductList(ProductCQ sq) { return xkeepSQue("productCategoryCode_NotExistsReferrer_ProductList", sq); }

    public Map<String, ProductCategoryCQ> getProductCategoryCode_NotExistsReferrer_ProductCategorySelfList() { return xgetSQueMap("productCategoryCode_NotExistsReferrer_ProductCategorySelfList"); }
    public String keepProductCategoryCode_NotExistsReferrer_ProductCategorySelfList(ProductCategoryCQ sq) { return xkeepSQue("productCategoryCode_NotExistsReferrer_ProductCategorySelfList", sq); }

    public Map<String, ProductCQ> getProductCategoryCode_InScopeRelation_ProductList() { return xgetSQueMap("productCategoryCode_InScopeRelation_ProductList"); }
    public String keepProductCategoryCode_InScopeRelation_ProductList(ProductCQ sq) { return xkeepSQue("productCategoryCode_InScopeRelation_ProductList", sq); }

    public Map<String, ProductCategoryCQ> getProductCategoryCode_InScopeRelation_ProductCategorySelfList() { return xgetSQueMap("productCategoryCode_InScopeRelation_ProductCategorySelfList"); }
    public String keepProductCategoryCode_InScopeRelation_ProductCategorySelfList(ProductCategoryCQ sq) { return xkeepSQue("productCategoryCode_InScopeRelation_ProductCategorySelfList", sq); }

    public Map<String, ProductCQ> getProductCategoryCode_NotInScopeRelation_ProductList() { return xgetSQueMap("productCategoryCode_NotInScopeRelation_ProductList"); }
    public String keepProductCategoryCode_NotInScopeRelation_ProductList(ProductCQ sq) { return xkeepSQue("productCategoryCode_NotInScopeRelation_ProductList", sq); }

    public Map<String, ProductCategoryCQ> getProductCategoryCode_NotInScopeRelation_ProductCategorySelfList() { return xgetSQueMap("productCategoryCode_NotInScopeRelation_ProductCategorySelfList"); }
    public String keepProductCategoryCode_NotInScopeRelation_ProductCategorySelfList(ProductCategoryCQ sq) { return xkeepSQue("productCategoryCode_NotInScopeRelation_ProductCategorySelfList", sq); }

    public Map<String, ProductCQ> getProductCategoryCode_SpecifyDerivedReferrer_ProductList() { return xgetSQueMap("productCategoryCode_SpecifyDerivedReferrer_ProductList"); }
    public String keepProductCategoryCode_SpecifyDerivedReferrer_ProductList(ProductCQ sq) { return xkeepSQue("productCategoryCode_SpecifyDerivedReferrer_ProductList", sq); }

    public Map<String, ProductCategoryCQ> getProductCategoryCode_SpecifyDerivedReferrer_ProductCategorySelfList() { return xgetSQueMap("productCategoryCode_SpecifyDerivedReferrer_ProductCategorySelfList"); }
    public String keepProductCategoryCode_SpecifyDerivedReferrer_ProductCategorySelfList(ProductCategoryCQ sq) { return xkeepSQue("productCategoryCode_SpecifyDerivedReferrer_ProductCategorySelfList", sq); }

    public Map<String, ProductCQ> getProductCategoryCode_QueryDerivedReferrer_ProductList() { return xgetSQueMap("productCategoryCode_QueryDerivedReferrer_ProductList"); }
    public String keepProductCategoryCode_QueryDerivedReferrer_ProductList(ProductCQ sq) { return xkeepSQue("productCategoryCode_QueryDerivedReferrer_ProductList", sq); }
    public Map<String, Object> getProductCategoryCode_QueryDerivedReferrer_ProductListParameter() { return xgetSQuePmMap("productCategoryCode_QueryDerivedReferrer_ProductList"); }
    public String keepProductCategoryCode_QueryDerivedReferrer_ProductListParameter(Object pm) { return xkeepSQuePm("productCategoryCode_QueryDerivedReferrer_ProductList", pm); }

    public Map<String, ProductCategoryCQ> getProductCategoryCode_QueryDerivedReferrer_ProductCategorySelfList() { return xgetSQueMap("productCategoryCode_QueryDerivedReferrer_ProductCategorySelfList"); }
    public String keepProductCategoryCode_QueryDerivedReferrer_ProductCategorySelfList(ProductCategoryCQ sq) { return xkeepSQue("productCategoryCode_QueryDerivedReferrer_ProductCategorySelfList", sq); }
    public Map<String, Object> getProductCategoryCode_QueryDerivedReferrer_ProductCategorySelfListParameter() { return xgetSQuePmMap("productCategoryCode_QueryDerivedReferrer_ProductCategorySelfList"); }
    public String keepProductCategoryCode_QueryDerivedReferrer_ProductCategorySelfListParameter(Object pm) { return xkeepSQuePm("productCategoryCode_QueryDerivedReferrer_ProductCategorySelfList", pm); }

    /** 
     * Add order-by as ascend. <br />
     * (商品カテゴリコード)PRODUCT_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsProductCategoryCQ addOrderBy_ProductCategoryCode_Asc() { regOBA("PRODUCT_CATEGORY_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * (商品カテゴリコード)PRODUCT_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsProductCategoryCQ addOrderBy_ProductCategoryCode_Desc() { regOBD("PRODUCT_CATEGORY_CODE"); return this; }

    protected ConditionValue _productCategoryName;
    public ConditionValue getProductCategoryName()
    { if (_productCategoryName == null) { _productCategoryName = nCV(); }
      return _productCategoryName; }
    protected ConditionValue getCValueProductCategoryName() { return getProductCategoryName(); }

    /** 
     * Add order-by as ascend. <br />
     * (商品カテゴリ名称)PRODUCT_CATEGORY_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsProductCategoryCQ addOrderBy_ProductCategoryName_Asc() { regOBA("PRODUCT_CATEGORY_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * (商品カテゴリ名称)PRODUCT_CATEGORY_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsProductCategoryCQ addOrderBy_ProductCategoryName_Desc() { regOBD("PRODUCT_CATEGORY_NAME"); return this; }

    protected ConditionValue _parentCategoryCode;
    public ConditionValue getParentCategoryCode()
    { if (_parentCategoryCode == null) { _parentCategoryCode = nCV(); }
      return _parentCategoryCode; }
    protected ConditionValue getCValueParentCategoryCode() { return getParentCategoryCode(); }

    /** 
     * Add order-by as ascend. <br />
     * (親カテゴリコード)PARENT_CATEGORY_CODE: {IX, CHAR(3), FK to PRODUCT_CATEGORY}
     * @return this. (NotNull)
     */
    public BsProductCategoryCQ addOrderBy_ParentCategoryCode_Asc() { regOBA("PARENT_CATEGORY_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * (親カテゴリコード)PARENT_CATEGORY_CODE: {IX, CHAR(3), FK to PRODUCT_CATEGORY}
     * @return this. (NotNull)
     */
    public BsProductCategoryCQ addOrderBy_ParentCategoryCode_Desc() { regOBD("PARENT_CATEGORY_CODE"); return this; }

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
    public BsProductCategoryCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsProductCategoryCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        ProductCategoryCQ bq = (ProductCategoryCQ)bqs;
        ProductCategoryCQ uq = (ProductCategoryCQ)uqs;
        if (bq.hasConditionQueryProductCategorySelf()) {
            uq.queryProductCategorySelf().reflectRelationOnUnionQuery(bq.queryProductCategorySelf(), uq.queryProductCategorySelf());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * (商品カテゴリ)PRODUCT_CATEGORY by my PARENT_CATEGORY_CODE, named 'productCategorySelf'.
     * @return The instance of condition-query. (NotNull)
     */
    public ProductCategoryCQ queryProductCategorySelf() {
        return getConditionQueryProductCategorySelf();
    }
    public ProductCategoryCQ getConditionQueryProductCategorySelf() {
        String prop = "productCategorySelf";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryProductCategorySelf()); xsetupOuterJoinProductCategorySelf(); }
        return xgetQueRlMap(prop);
    }
    protected ProductCategoryCQ xcreateQueryProductCategorySelf() {
        String nrp = xresolveNRP("PRODUCT_CATEGORY", "productCategorySelf"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new ProductCategoryCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "productCategorySelf", nrp);
    }
    protected void xsetupOuterJoinProductCategorySelf() { xregOutJo("productCategorySelf"); }
    public boolean hasConditionQueryProductCategorySelf() { return xhasQueRlMap("productCategorySelf"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, ProductCategoryCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ProductCategoryCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ProductCategoryCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ProductCategoryCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ProductCategoryCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ProductCategoryCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ProductCategoryCQ> _myselfExistsMap;
    public Map<String, ProductCategoryCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ProductCategoryCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ProductCategoryCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ProductCategoryCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ProductCategoryCB.class.getName(); }
    protected String xCQ() { return ProductCategoryCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
