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
 * The base condition-query of WITHDRAWAL_REASON.
 * @author DBFlute(AutoGenerator)
 */
public class BsWithdrawalReasonCQ extends AbstractBsWithdrawalReasonCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WithdrawalReasonCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWithdrawalReasonCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from WITHDRAWAL_REASON) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WithdrawalReasonCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WithdrawalReasonCIQ xcreateCIQ() {
        WithdrawalReasonCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WithdrawalReasonCIQ xnewCIQ() {
        return new WithdrawalReasonCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join WITHDRAWAL_REASON on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WithdrawalReasonCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WithdrawalReasonCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _withdrawalReasonCode;
    public ConditionValue getWithdrawalReasonCode()
    { if (_withdrawalReasonCode == null) { _withdrawalReasonCode = nCV(); }
      return _withdrawalReasonCode; }
    protected ConditionValue getCValueWithdrawalReasonCode() { return getWithdrawalReasonCode(); }

    public Map<String, MemberWithdrawalCQ> getWithdrawalReasonCode_ExistsReferrer_MemberWithdrawalList() { return xgetSQueMap("withdrawalReasonCode_ExistsReferrer_MemberWithdrawalList"); }
    public String keepWithdrawalReasonCode_ExistsReferrer_MemberWithdrawalList(MemberWithdrawalCQ sq) { return xkeepSQue("withdrawalReasonCode_ExistsReferrer_MemberWithdrawalList", sq); }

    public Map<String, MemberWithdrawalCQ> getWithdrawalReasonCode_NotExistsReferrer_MemberWithdrawalList() { return xgetSQueMap("withdrawalReasonCode_NotExistsReferrer_MemberWithdrawalList"); }
    public String keepWithdrawalReasonCode_NotExistsReferrer_MemberWithdrawalList(MemberWithdrawalCQ sq) { return xkeepSQue("withdrawalReasonCode_NotExistsReferrer_MemberWithdrawalList", sq); }

    public Map<String, MemberWithdrawalCQ> getWithdrawalReasonCode_InScopeRelation_MemberWithdrawalList() { return xgetSQueMap("withdrawalReasonCode_InScopeRelation_MemberWithdrawalList"); }
    public String keepWithdrawalReasonCode_InScopeRelation_MemberWithdrawalList(MemberWithdrawalCQ sq) { return xkeepSQue("withdrawalReasonCode_InScopeRelation_MemberWithdrawalList", sq); }

    public Map<String, MemberWithdrawalCQ> getWithdrawalReasonCode_NotInScopeRelation_MemberWithdrawalList() { return xgetSQueMap("withdrawalReasonCode_NotInScopeRelation_MemberWithdrawalList"); }
    public String keepWithdrawalReasonCode_NotInScopeRelation_MemberWithdrawalList(MemberWithdrawalCQ sq) { return xkeepSQue("withdrawalReasonCode_NotInScopeRelation_MemberWithdrawalList", sq); }

    public Map<String, MemberWithdrawalCQ> getWithdrawalReasonCode_SpecifyDerivedReferrer_MemberWithdrawalList() { return xgetSQueMap("withdrawalReasonCode_SpecifyDerivedReferrer_MemberWithdrawalList"); }
    public String keepWithdrawalReasonCode_SpecifyDerivedReferrer_MemberWithdrawalList(MemberWithdrawalCQ sq) { return xkeepSQue("withdrawalReasonCode_SpecifyDerivedReferrer_MemberWithdrawalList", sq); }

    public Map<String, MemberWithdrawalCQ> getWithdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalList() { return xgetSQueMap("withdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalList"); }
    public String keepWithdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalList(MemberWithdrawalCQ sq) { return xkeepSQue("withdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalList", sq); }
    public Map<String, Object> getWithdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalListParameter() { return xgetSQuePmMap("withdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalList"); }
    public String keepWithdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalListParameter(Object pm) { return xkeepSQuePm("withdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalList", pm); }

    /** 
     * Add order-by as ascend. <br />
     * (退会理由コード)WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3), classification=WithdrawalReason}
     * @return this. (NotNull)
     */
    public BsWithdrawalReasonCQ addOrderBy_WithdrawalReasonCode_Asc() { regOBA("WITHDRAWAL_REASON_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * (退会理由コード)WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3), classification=WithdrawalReason}
     * @return this. (NotNull)
     */
    public BsWithdrawalReasonCQ addOrderBy_WithdrawalReasonCode_Desc() { regOBD("WITHDRAWAL_REASON_CODE"); return this; }

    protected ConditionValue _withdrawalReasonText;
    public ConditionValue getWithdrawalReasonText()
    { if (_withdrawalReasonText == null) { _withdrawalReasonText = nCV(); }
      return _withdrawalReasonText; }
    protected ConditionValue getCValueWithdrawalReasonText() { return getWithdrawalReasonText(); }

    /**
     * Add order-by as descend. <br />
     * (退会理由テキスト)WITHDRAWAL_REASON_TEXT: {NotNull, CLOB(2147483647)}
     * @return this. (NotNull)
     */
    public BsWithdrawalReasonCQ addOrderBy_WithdrawalReasonText_Desc() { regOBD("WITHDRAWAL_REASON_TEXT"); return this; }

    protected ConditionValue _displayOrder;
    public ConditionValue getDisplayOrder()
    { if (_displayOrder == null) { _displayOrder = nCV(); }
      return _displayOrder; }
    protected ConditionValue getCValueDisplayOrder() { return getDisplayOrder(); }

    /** 
     * Add order-by as ascend. <br />
     * DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWithdrawalReasonCQ addOrderBy_DisplayOrder_Asc() { regOBA("DISPLAY_ORDER"); return this; }

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
    public BsWithdrawalReasonCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWithdrawalReasonCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WithdrawalReasonCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WithdrawalReasonCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WithdrawalReasonCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WithdrawalReasonCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WithdrawalReasonCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WithdrawalReasonCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WithdrawalReasonCQ> _myselfExistsMap;
    public Map<String, WithdrawalReasonCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WithdrawalReasonCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WithdrawalReasonCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WithdrawalReasonCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WithdrawalReasonCB.class.getName(); }
    protected String xCQ() { return WithdrawalReasonCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
