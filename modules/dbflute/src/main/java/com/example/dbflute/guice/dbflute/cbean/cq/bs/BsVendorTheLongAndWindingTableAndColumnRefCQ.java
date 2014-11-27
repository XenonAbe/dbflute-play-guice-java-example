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
 * The base condition-query of VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF.
 * @author DBFlute(AutoGenerator)
 */
public class BsVendorTheLongAndWindingTableAndColumnRefCQ extends AbstractBsVendorTheLongAndWindingTableAndColumnRefCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected VendorTheLongAndWindingTableAndColumnRefCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsVendorTheLongAndWindingTableAndColumnRefCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public VendorTheLongAndWindingTableAndColumnRefCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected VendorTheLongAndWindingTableAndColumnRefCIQ xcreateCIQ() {
        VendorTheLongAndWindingTableAndColumnRefCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected VendorTheLongAndWindingTableAndColumnRefCIQ xnewCIQ() {
        return new VendorTheLongAndWindingTableAndColumnRefCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public VendorTheLongAndWindingTableAndColumnRefCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        VendorTheLongAndWindingTableAndColumnRefCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _theLongAndWindingTableAndColumnRefId;
    public ConditionValue getTheLongAndWindingTableAndColumnRefId()
    { if (_theLongAndWindingTableAndColumnRefId == null) { _theLongAndWindingTableAndColumnRefId = nCV(); }
      return _theLongAndWindingTableAndColumnRefId; }
    protected ConditionValue getCValueTheLongAndWindingTableAndColumnRefId() { return getTheLongAndWindingTableAndColumnRefId(); }

    /** 
     * Add order-by as ascend. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsVendorTheLongAndWindingTableAndColumnRefCQ addOrderBy_TheLongAndWindingTableAndColumnRefId_Asc() { regOBA("THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsVendorTheLongAndWindingTableAndColumnRefCQ addOrderBy_TheLongAndWindingTableAndColumnRefId_Desc() { regOBD("THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID"); return this; }

    protected ConditionValue _theLongAndWindingTableAndColumnId;
    public ConditionValue getTheLongAndWindingTableAndColumnId()
    { if (_theLongAndWindingTableAndColumnId == null) { _theLongAndWindingTableAndColumnId = nCV(); }
      return _theLongAndWindingTableAndColumnId; }
    protected ConditionValue getCValueTheLongAndWindingTableAndColumnId() { return getTheLongAndWindingTableAndColumnId(); }

    /** 
     * Add order-by as ascend. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {IX, NotNull, BIGINT(19), FK to VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN}
     * @return this. (NotNull)
     */
    public BsVendorTheLongAndWindingTableAndColumnRefCQ addOrderBy_TheLongAndWindingTableAndColumnId_Asc() { regOBA("THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {IX, NotNull, BIGINT(19), FK to VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN}
     * @return this. (NotNull)
     */
    public BsVendorTheLongAndWindingTableAndColumnRefCQ addOrderBy_TheLongAndWindingTableAndColumnId_Desc() { regOBD("THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID"); return this; }

    protected ConditionValue _theLongAndWindingTableAndColumnRefDate;
    public ConditionValue getTheLongAndWindingTableAndColumnRefDate()
    { if (_theLongAndWindingTableAndColumnRefDate == null) { _theLongAndWindingTableAndColumnRefDate = nCV(); }
      return _theLongAndWindingTableAndColumnRefDate; }
    protected ConditionValue getCValueTheLongAndWindingTableAndColumnRefDate() { return getTheLongAndWindingTableAndColumnRefDate(); }

    /** 
     * Add order-by as ascend. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE: {NotNull, DATE(8)}
     * @return this. (NotNull)
     */
    public BsVendorTheLongAndWindingTableAndColumnRefCQ addOrderBy_TheLongAndWindingTableAndColumnRefDate_Asc() { regOBA("THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE"); return this; }

    /**
     * Add order-by as descend. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE: {NotNull, DATE(8)}
     * @return this. (NotNull)
     */
    public BsVendorTheLongAndWindingTableAndColumnRefCQ addOrderBy_TheLongAndWindingTableAndColumnRefDate_Desc() { regOBD("THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE"); return this; }

    protected ConditionValue _shortDate;
    public ConditionValue getShortDate()
    { if (_shortDate == null) { _shortDate = nCV(); }
      return _shortDate; }
    protected ConditionValue getCValueShortDate() { return getShortDate(); }

    /** 
     * Add order-by as ascend. <br />
     * SHORT_DATE: {NotNull, DATE(8)}
     * @return this. (NotNull)
     */
    public BsVendorTheLongAndWindingTableAndColumnRefCQ addOrderBy_ShortDate_Asc() { regOBA("SHORT_DATE"); return this; }

    /**
     * Add order-by as descend. <br />
     * SHORT_DATE: {NotNull, DATE(8)}
     * @return this. (NotNull)
     */
    public BsVendorTheLongAndWindingTableAndColumnRefCQ addOrderBy_ShortDate_Desc() { regOBD("SHORT_DATE"); return this; }

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
    public BsVendorTheLongAndWindingTableAndColumnRefCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsVendorTheLongAndWindingTableAndColumnRefCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        VendorTheLongAndWindingTableAndColumnRefCQ bq = (VendorTheLongAndWindingTableAndColumnRefCQ)bqs;
        VendorTheLongAndWindingTableAndColumnRefCQ uq = (VendorTheLongAndWindingTableAndColumnRefCQ)uqs;
        if (bq.hasConditionQueryVendorTheLongAndWindingTableAndColumn()) {
            uq.queryVendorTheLongAndWindingTableAndColumn().reflectRelationOnUnionQuery(bq.queryVendorTheLongAndWindingTableAndColumn(), uq.queryVendorTheLongAndWindingTableAndColumn());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN by my THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID, named 'vendorTheLongAndWindingTableAndColumn'.
     * @return The instance of condition-query. (NotNull)
     */
    public VendorTheLongAndWindingTableAndColumnCQ queryVendorTheLongAndWindingTableAndColumn() {
        return getConditionQueryVendorTheLongAndWindingTableAndColumn();
    }
    public VendorTheLongAndWindingTableAndColumnCQ getConditionQueryVendorTheLongAndWindingTableAndColumn() {
        String prop = "vendorTheLongAndWindingTableAndColumn";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryVendorTheLongAndWindingTableAndColumn()); xsetupOuterJoinVendorTheLongAndWindingTableAndColumn(); }
        return xgetQueRlMap(prop);
    }
    protected VendorTheLongAndWindingTableAndColumnCQ xcreateQueryVendorTheLongAndWindingTableAndColumn() {
        String nrp = xresolveNRP("VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF", "vendorTheLongAndWindingTableAndColumn"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new VendorTheLongAndWindingTableAndColumnCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "vendorTheLongAndWindingTableAndColumn", nrp);
    }
    protected void xsetupOuterJoinVendorTheLongAndWindingTableAndColumn() { xregOutJo("vendorTheLongAndWindingTableAndColumn"); }
    public boolean hasConditionQueryVendorTheLongAndWindingTableAndColumn() { return xhasQueRlMap("vendorTheLongAndWindingTableAndColumn"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, VendorTheLongAndWindingTableAndColumnRefCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(VendorTheLongAndWindingTableAndColumnRefCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, VendorTheLongAndWindingTableAndColumnRefCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(VendorTheLongAndWindingTableAndColumnRefCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, VendorTheLongAndWindingTableAndColumnRefCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(VendorTheLongAndWindingTableAndColumnRefCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, VendorTheLongAndWindingTableAndColumnRefCQ> _myselfExistsMap;
    public Map<String, VendorTheLongAndWindingTableAndColumnRefCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(VendorTheLongAndWindingTableAndColumnRefCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, VendorTheLongAndWindingTableAndColumnRefCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(VendorTheLongAndWindingTableAndColumnRefCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return VendorTheLongAndWindingTableAndColumnRefCB.class.getName(); }
    protected String xCQ() { return VendorTheLongAndWindingTableAndColumnRefCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
