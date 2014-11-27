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
 * The base condition-query of SERVICE_RANK.
 * @author DBFlute(AutoGenerator)
 */
public class BsServiceRankCQ extends AbstractBsServiceRankCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ServiceRankCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsServiceRankCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from SERVICE_RANK) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ServiceRankCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ServiceRankCIQ xcreateCIQ() {
        ServiceRankCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ServiceRankCIQ xnewCIQ() {
        return new ServiceRankCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join SERVICE_RANK on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ServiceRankCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ServiceRankCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _serviceRankCode;
    public ConditionValue getServiceRankCode()
    { if (_serviceRankCode == null) { _serviceRankCode = nCV(); }
      return _serviceRankCode; }
    protected ConditionValue getCValueServiceRankCode() { return getServiceRankCode(); }

    public Map<String, MemberServiceCQ> getServiceRankCode_ExistsReferrer_MemberServiceList() { return xgetSQueMap("serviceRankCode_ExistsReferrer_MemberServiceList"); }
    public String keepServiceRankCode_ExistsReferrer_MemberServiceList(MemberServiceCQ sq) { return xkeepSQue("serviceRankCode_ExistsReferrer_MemberServiceList", sq); }

    public Map<String, MemberServiceCQ> getServiceRankCode_NotExistsReferrer_MemberServiceList() { return xgetSQueMap("serviceRankCode_NotExistsReferrer_MemberServiceList"); }
    public String keepServiceRankCode_NotExistsReferrer_MemberServiceList(MemberServiceCQ sq) { return xkeepSQue("serviceRankCode_NotExistsReferrer_MemberServiceList", sq); }

    public Map<String, MemberServiceCQ> getServiceRankCode_InScopeRelation_MemberServiceList() { return xgetSQueMap("serviceRankCode_InScopeRelation_MemberServiceList"); }
    public String keepServiceRankCode_InScopeRelation_MemberServiceList(MemberServiceCQ sq) { return xkeepSQue("serviceRankCode_InScopeRelation_MemberServiceList", sq); }

    public Map<String, MemberServiceCQ> getServiceRankCode_NotInScopeRelation_MemberServiceList() { return xgetSQueMap("serviceRankCode_NotInScopeRelation_MemberServiceList"); }
    public String keepServiceRankCode_NotInScopeRelation_MemberServiceList(MemberServiceCQ sq) { return xkeepSQue("serviceRankCode_NotInScopeRelation_MemberServiceList", sq); }

    public Map<String, MemberServiceCQ> getServiceRankCode_SpecifyDerivedReferrer_MemberServiceList() { return xgetSQueMap("serviceRankCode_SpecifyDerivedReferrer_MemberServiceList"); }
    public String keepServiceRankCode_SpecifyDerivedReferrer_MemberServiceList(MemberServiceCQ sq) { return xkeepSQue("serviceRankCode_SpecifyDerivedReferrer_MemberServiceList", sq); }

    public Map<String, MemberServiceCQ> getServiceRankCode_QueryDerivedReferrer_MemberServiceList() { return xgetSQueMap("serviceRankCode_QueryDerivedReferrer_MemberServiceList"); }
    public String keepServiceRankCode_QueryDerivedReferrer_MemberServiceList(MemberServiceCQ sq) { return xkeepSQue("serviceRankCode_QueryDerivedReferrer_MemberServiceList", sq); }
    public Map<String, Object> getServiceRankCode_QueryDerivedReferrer_MemberServiceListParameter() { return xgetSQuePmMap("serviceRankCode_QueryDerivedReferrer_MemberServiceList"); }
    public String keepServiceRankCode_QueryDerivedReferrer_MemberServiceListParameter(Object pm) { return xkeepSQuePm("serviceRankCode_QueryDerivedReferrer_MemberServiceList", pm); }

    /** 
     * Add order-by as ascend. <br />
     * (サービスランクコード)SERVICE_RANK_CODE: {PK, NotNull, CHAR(3), classification=ServiceRank}
     * @return this. (NotNull)
     */
    public BsServiceRankCQ addOrderBy_ServiceRankCode_Asc() { regOBA("SERVICE_RANK_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * (サービスランクコード)SERVICE_RANK_CODE: {PK, NotNull, CHAR(3), classification=ServiceRank}
     * @return this. (NotNull)
     */
    public BsServiceRankCQ addOrderBy_ServiceRankCode_Desc() { regOBD("SERVICE_RANK_CODE"); return this; }

    protected ConditionValue _serviceRankName;
    public ConditionValue getServiceRankName()
    { if (_serviceRankName == null) { _serviceRankName = nCV(); }
      return _serviceRankName; }
    protected ConditionValue getCValueServiceRankName() { return getServiceRankName(); }

    /** 
     * Add order-by as ascend. <br />
     * (サービスランク名称)SERVICE_RANK_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsServiceRankCQ addOrderBy_ServiceRankName_Asc() { regOBA("SERVICE_RANK_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * (サービスランク名称)SERVICE_RANK_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsServiceRankCQ addOrderBy_ServiceRankName_Desc() { regOBD("SERVICE_RANK_NAME"); return this; }

    protected ConditionValue _servicePointIncidence;
    public ConditionValue getServicePointIncidence()
    { if (_servicePointIncidence == null) { _servicePointIncidence = nCV(); }
      return _servicePointIncidence; }
    protected ConditionValue getCValueServicePointIncidence() { return getServicePointIncidence(); }

    /** 
     * Add order-by as ascend. <br />
     * (サービスポイント発生率)SERVICE_POINT_INCIDENCE: {NotNull, DECIMAL(5, 3)}
     * @return this. (NotNull)
     */
    public BsServiceRankCQ addOrderBy_ServicePointIncidence_Asc() { regOBA("SERVICE_POINT_INCIDENCE"); return this; }

    /**
     * Add order-by as descend. <br />
     * (サービスポイント発生率)SERVICE_POINT_INCIDENCE: {NotNull, DECIMAL(5, 3)}
     * @return this. (NotNull)
     */
    public BsServiceRankCQ addOrderBy_ServicePointIncidence_Desc() { regOBD("SERVICE_POINT_INCIDENCE"); return this; }

    protected ConditionValue _newAcceptableFlg;
    public ConditionValue getNewAcceptableFlg()
    { if (_newAcceptableFlg == null) { _newAcceptableFlg = nCV(); }
      return _newAcceptableFlg; }
    protected ConditionValue getCValueNewAcceptableFlg() { return getNewAcceptableFlg(); }

    /** 
     * Add order-by as ascend. <br />
     * (新規受け入れ可能フラグ)NEW_ACCEPTABLE_FLG: {NotNull, INTEGER(10), classification=Flg}
     * @return this. (NotNull)
     */
    public BsServiceRankCQ addOrderBy_NewAcceptableFlg_Asc() { regOBA("NEW_ACCEPTABLE_FLG"); return this; }

    /**
     * Add order-by as descend. <br />
     * (新規受け入れ可能フラグ)NEW_ACCEPTABLE_FLG: {NotNull, INTEGER(10), classification=Flg}
     * @return this. (NotNull)
     */
    public BsServiceRankCQ addOrderBy_NewAcceptableFlg_Desc() { regOBD("NEW_ACCEPTABLE_FLG"); return this; }

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
    public BsServiceRankCQ addOrderBy_DisplayOrder_Asc() { regOBA("DISPLAY_ORDER"); return this; }

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
    public BsServiceRankCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsServiceRankCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, ServiceRankCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ServiceRankCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ServiceRankCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ServiceRankCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ServiceRankCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ServiceRankCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ServiceRankCB.class.getName(); }
    protected String xCQ() { return ServiceRankCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
