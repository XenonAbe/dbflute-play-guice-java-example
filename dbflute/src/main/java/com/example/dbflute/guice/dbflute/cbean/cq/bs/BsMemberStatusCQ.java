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
 * The base condition-query of MEMBER_STATUS.
 * @author DBFlute(AutoGenerator)
 */
public class BsMemberStatusCQ extends AbstractBsMemberStatusCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MemberStatusCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMemberStatusCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from MEMBER_STATUS) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MemberStatusCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MemberStatusCIQ xcreateCIQ() {
        MemberStatusCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MemberStatusCIQ xnewCIQ() {
        return new MemberStatusCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join MEMBER_STATUS on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MemberStatusCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MemberStatusCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _memberStatusCode;
    public ConditionValue getMemberStatusCode()
    { if (_memberStatusCode == null) { _memberStatusCode = nCV(); }
      return _memberStatusCode; }
    protected ConditionValue getCValueMemberStatusCode() { return getMemberStatusCode(); }

    public Map<String, MemberCQ> getMemberStatusCode_ExistsReferrer_MemberList() { return xgetSQueMap("memberStatusCode_ExistsReferrer_MemberList"); }
    public String keepMemberStatusCode_ExistsReferrer_MemberList(MemberCQ sq) { return xkeepSQue("memberStatusCode_ExistsReferrer_MemberList", sq); }

    public Map<String, MemberLoginCQ> getMemberStatusCode_ExistsReferrer_MemberLoginList() { return xgetSQueMap("memberStatusCode_ExistsReferrer_MemberLoginList"); }
    public String keepMemberStatusCode_ExistsReferrer_MemberLoginList(MemberLoginCQ sq) { return xkeepSQue("memberStatusCode_ExistsReferrer_MemberLoginList", sq); }

    public Map<String, MemberCQ> getMemberStatusCode_NotExistsReferrer_MemberList() { return xgetSQueMap("memberStatusCode_NotExistsReferrer_MemberList"); }
    public String keepMemberStatusCode_NotExistsReferrer_MemberList(MemberCQ sq) { return xkeepSQue("memberStatusCode_NotExistsReferrer_MemberList", sq); }

    public Map<String, MemberLoginCQ> getMemberStatusCode_NotExistsReferrer_MemberLoginList() { return xgetSQueMap("memberStatusCode_NotExistsReferrer_MemberLoginList"); }
    public String keepMemberStatusCode_NotExistsReferrer_MemberLoginList(MemberLoginCQ sq) { return xkeepSQue("memberStatusCode_NotExistsReferrer_MemberLoginList", sq); }

    public Map<String, MemberCQ> getMemberStatusCode_InScopeRelation_MemberList() { return xgetSQueMap("memberStatusCode_InScopeRelation_MemberList"); }
    public String keepMemberStatusCode_InScopeRelation_MemberList(MemberCQ sq) { return xkeepSQue("memberStatusCode_InScopeRelation_MemberList", sq); }

    public Map<String, MemberLoginCQ> getMemberStatusCode_InScopeRelation_MemberLoginList() { return xgetSQueMap("memberStatusCode_InScopeRelation_MemberLoginList"); }
    public String keepMemberStatusCode_InScopeRelation_MemberLoginList(MemberLoginCQ sq) { return xkeepSQue("memberStatusCode_InScopeRelation_MemberLoginList", sq); }

    public Map<String, MemberCQ> getMemberStatusCode_NotInScopeRelation_MemberList() { return xgetSQueMap("memberStatusCode_NotInScopeRelation_MemberList"); }
    public String keepMemberStatusCode_NotInScopeRelation_MemberList(MemberCQ sq) { return xkeepSQue("memberStatusCode_NotInScopeRelation_MemberList", sq); }

    public Map<String, MemberLoginCQ> getMemberStatusCode_NotInScopeRelation_MemberLoginList() { return xgetSQueMap("memberStatusCode_NotInScopeRelation_MemberLoginList"); }
    public String keepMemberStatusCode_NotInScopeRelation_MemberLoginList(MemberLoginCQ sq) { return xkeepSQue("memberStatusCode_NotInScopeRelation_MemberLoginList", sq); }

    public Map<String, MemberCQ> getMemberStatusCode_SpecifyDerivedReferrer_MemberList() { return xgetSQueMap("memberStatusCode_SpecifyDerivedReferrer_MemberList"); }
    public String keepMemberStatusCode_SpecifyDerivedReferrer_MemberList(MemberCQ sq) { return xkeepSQue("memberStatusCode_SpecifyDerivedReferrer_MemberList", sq); }

    public Map<String, MemberLoginCQ> getMemberStatusCode_SpecifyDerivedReferrer_MemberLoginList() { return xgetSQueMap("memberStatusCode_SpecifyDerivedReferrer_MemberLoginList"); }
    public String keepMemberStatusCode_SpecifyDerivedReferrer_MemberLoginList(MemberLoginCQ sq) { return xkeepSQue("memberStatusCode_SpecifyDerivedReferrer_MemberLoginList", sq); }

    public Map<String, MemberCQ> getMemberStatusCode_QueryDerivedReferrer_MemberList() { return xgetSQueMap("memberStatusCode_QueryDerivedReferrer_MemberList"); }
    public String keepMemberStatusCode_QueryDerivedReferrer_MemberList(MemberCQ sq) { return xkeepSQue("memberStatusCode_QueryDerivedReferrer_MemberList", sq); }
    public Map<String, Object> getMemberStatusCode_QueryDerivedReferrer_MemberListParameter() { return xgetSQuePmMap("memberStatusCode_QueryDerivedReferrer_MemberList"); }
    public String keepMemberStatusCode_QueryDerivedReferrer_MemberListParameter(Object pm) { return xkeepSQuePm("memberStatusCode_QueryDerivedReferrer_MemberList", pm); }

    public Map<String, MemberLoginCQ> getMemberStatusCode_QueryDerivedReferrer_MemberLoginList() { return xgetSQueMap("memberStatusCode_QueryDerivedReferrer_MemberLoginList"); }
    public String keepMemberStatusCode_QueryDerivedReferrer_MemberLoginList(MemberLoginCQ sq) { return xkeepSQue("memberStatusCode_QueryDerivedReferrer_MemberLoginList", sq); }
    public Map<String, Object> getMemberStatusCode_QueryDerivedReferrer_MemberLoginListParameter() { return xgetSQuePmMap("memberStatusCode_QueryDerivedReferrer_MemberLoginList"); }
    public String keepMemberStatusCode_QueryDerivedReferrer_MemberLoginListParameter(Object pm) { return xkeepSQuePm("memberStatusCode_QueryDerivedReferrer_MemberLoginList", pm); }

    /** 
     * Add order-by as ascend. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {PK, NotNull, CHAR(3), classification=MemberStatus}
     * @return this. (NotNull)
     */
    public BsMemberStatusCQ addOrderBy_MemberStatusCode_Asc() { regOBA("MEMBER_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {PK, NotNull, CHAR(3), classification=MemberStatus}
     * @return this. (NotNull)
     */
    public BsMemberStatusCQ addOrderBy_MemberStatusCode_Desc() { regOBD("MEMBER_STATUS_CODE"); return this; }

    protected ConditionValue _memberStatusName;
    public ConditionValue getMemberStatusName()
    { if (_memberStatusName == null) { _memberStatusName = nCV(); }
      return _memberStatusName; }
    protected ConditionValue getCValueMemberStatusName() { return getMemberStatusName(); }

    /** 
     * Add order-by as ascend. <br />
     * (会員ステータス名称)MEMBER_STATUS_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsMemberStatusCQ addOrderBy_MemberStatusName_Asc() { regOBA("MEMBER_STATUS_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * (会員ステータス名称)MEMBER_STATUS_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsMemberStatusCQ addOrderBy_MemberStatusName_Desc() { regOBD("MEMBER_STATUS_NAME"); return this; }

    protected ConditionValue _description;
    public ConditionValue getDescription()
    { if (_description == null) { _description = nCV(); }
      return _description; }
    protected ConditionValue getCValueDescription() { return getDescription(); }

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
    public BsMemberStatusCQ addOrderBy_DisplayOrder_Asc() { regOBA("DISPLAY_ORDER"); return this; }

    /**
     * Add order-by as descend. <br />
     * (表示順)DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsMemberStatusCQ addOrderBy_DisplayOrder_Desc() { regOBD("DISPLAY_ORDER"); return this; }

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
    public BsMemberStatusCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMemberStatusCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    protected String xCB() { return MemberStatusCB.class.getName(); }
    protected String xCQ() { return MemberStatusCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
