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
 * The base condition-query of VENDOR_$_DOLLAR.
 * @author DBFlute(AutoGenerator)
 */
public class BsVendor$DollarCQ extends AbstractBsVendor$DollarCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected Vendor$DollarCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsVendor$DollarCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from VENDOR_$_DOLLAR) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public Vendor$DollarCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected Vendor$DollarCIQ xcreateCIQ() {
        Vendor$DollarCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected Vendor$DollarCIQ xnewCIQ() {
        return new Vendor$DollarCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join VENDOR_$_DOLLAR on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public Vendor$DollarCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        Vendor$DollarCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _vendor$DollarId;
    public ConditionValue getVendor$DollarId()
    { if (_vendor$DollarId == null) { _vendor$DollarId = nCV(); }
      return _vendor$DollarId; }
    protected ConditionValue getCValueVendor$DollarId() { return getVendor$DollarId(); }

    /** 
     * Add order-by as ascend. <br />
     * VENDOR_$_DOLLAR_ID: {PK, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsVendor$DollarCQ addOrderBy_Vendor$DollarId_Asc() { regOBA("VENDOR_$_DOLLAR_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * VENDOR_$_DOLLAR_ID: {PK, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsVendor$DollarCQ addOrderBy_Vendor$DollarId_Desc() { regOBD("VENDOR_$_DOLLAR_ID"); return this; }

    protected ConditionValue _vendor$DollarName;
    public ConditionValue getVendor$DollarName()
    { if (_vendor$DollarName == null) { _vendor$DollarName = nCV(); }
      return _vendor$DollarName; }
    protected ConditionValue getCValueVendor$DollarName() { return getVendor$DollarName(); }

    /** 
     * Add order-by as ascend. <br />
     * VENDOR_$_DOLLAR_NAME: {VARCHAR(32)}
     * @return this. (NotNull)
     */
    public BsVendor$DollarCQ addOrderBy_Vendor$DollarName_Asc() { regOBA("VENDOR_$_DOLLAR_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * VENDOR_$_DOLLAR_NAME: {VARCHAR(32)}
     * @return this. (NotNull)
     */
    public BsVendor$DollarCQ addOrderBy_Vendor$DollarName_Desc() { regOBD("VENDOR_$_DOLLAR_NAME"); return this; }

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
    public BsVendor$DollarCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsVendor$DollarCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, Vendor$DollarCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(Vendor$DollarCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, Vendor$DollarCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(Vendor$DollarCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, Vendor$DollarCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(Vendor$DollarCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, Vendor$DollarCQ> _myselfExistsMap;
    public Map<String, Vendor$DollarCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(Vendor$DollarCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, Vendor$DollarCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(Vendor$DollarCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return Vendor$DollarCB.class.getName(); }
    protected String xCQ() { return Vendor$DollarCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
