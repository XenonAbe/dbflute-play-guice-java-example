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
 * The base condition-query of WHITE_DATE_TERM.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteDateTermCQ extends AbstractBsWhiteDateTermCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteDateTermCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteDateTermCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from WHITE_DATE_TERM) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteDateTermCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteDateTermCIQ xcreateCIQ() {
        WhiteDateTermCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteDateTermCIQ xnewCIQ() {
        return new WhiteDateTermCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join WHITE_DATE_TERM on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteDateTermCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteDateTermCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _dateTermId;
    public ConditionValue getDateTermId()
    { if (_dateTermId == null) { _dateTermId = nCV(); }
      return _dateTermId; }
    protected ConditionValue getCValueDateTermId() { return getDateTermId(); }

    /** 
     * Add order-by as ascend. <br />
     * DATE_TERM_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteDateTermCQ addOrderBy_DateTermId_Asc() { regOBA("DATE_TERM_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * DATE_TERM_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteDateTermCQ addOrderBy_DateTermId_Desc() { regOBD("DATE_TERM_ID"); return this; }

    protected ConditionValue _dateTermValue;
    public ConditionValue getDateTermValue()
    { if (_dateTermValue == null) { _dateTermValue = nCV(); }
      return _dateTermValue; }
    protected ConditionValue getCValueDateTermValue() { return getDateTermValue(); }

    /** 
     * Add order-by as ascend. <br />
     * DATE_TERM_VALUE: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteDateTermCQ addOrderBy_DateTermValue_Asc() { regOBA("DATE_TERM_VALUE"); return this; }

    /**
     * Add order-by as descend. <br />
     * DATE_TERM_VALUE: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteDateTermCQ addOrderBy_DateTermValue_Desc() { regOBD("DATE_TERM_VALUE"); return this; }

    protected ConditionValue _beginDate;
    public ConditionValue getBeginDate()
    { if (_beginDate == null) { _beginDate = nCV(); }
      return _beginDate; }
    protected ConditionValue getCValueBeginDate() { return getBeginDate(); }

    /** 
     * Add order-by as ascend. <br />
     * BEGIN_DATE: {NotNull, DATE(8)}
     * @return this. (NotNull)
     */
    public BsWhiteDateTermCQ addOrderBy_BeginDate_Asc() { regOBA("BEGIN_DATE"); return this; }

    /**
     * Add order-by as descend. <br />
     * BEGIN_DATE: {NotNull, DATE(8)}
     * @return this. (NotNull)
     */
    public BsWhiteDateTermCQ addOrderBy_BeginDate_Desc() { regOBD("BEGIN_DATE"); return this; }

    protected ConditionValue _endDate;
    public ConditionValue getEndDate()
    { if (_endDate == null) { _endDate = nCV(); }
      return _endDate; }
    protected ConditionValue getCValueEndDate() { return getEndDate(); }

    /** 
     * Add order-by as ascend. <br />
     * END_DATE: {NotNull, DATE(8)}
     * @return this. (NotNull)
     */
    public BsWhiteDateTermCQ addOrderBy_EndDate_Asc() { regOBA("END_DATE"); return this; }

    /**
     * Add order-by as descend. <br />
     * END_DATE: {NotNull, DATE(8)}
     * @return this. (NotNull)
     */
    public BsWhiteDateTermCQ addOrderBy_EndDate_Desc() { regOBD("END_DATE"); return this; }

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
    public BsWhiteDateTermCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteDateTermCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WhiteDateTermCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteDateTermCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteDateTermCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteDateTermCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteDateTermCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteDateTermCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteDateTermCQ> _myselfExistsMap;
    public Map<String, WhiteDateTermCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteDateTermCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteDateTermCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteDateTermCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteDateTermCB.class.getName(); }
    protected String xCQ() { return WhiteDateTermCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
