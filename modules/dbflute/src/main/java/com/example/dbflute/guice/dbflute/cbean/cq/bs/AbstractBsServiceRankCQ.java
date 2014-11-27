package com.example.dbflute.guice.dbflute.cbean.cq.bs;

import java.util.*;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import org.seasar.dbflute.util.DfTypeUtil;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import com.example.dbflute.guice.dbflute.allcommon.*;
import com.example.dbflute.guice.dbflute.cbean.*;
import com.example.dbflute.guice.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of SERVICE_RANK.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsServiceRankCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsServiceRankCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "SERVICE_RANK";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (サービスランクコード)SERVICE_RANK_CODE: {PK, NotNull, CHAR(3), classification=ServiceRank}
     * @param serviceRankCode The value of serviceRankCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    protected void setServiceRankCode_Equal(String serviceRankCode) {
        doSetServiceRankCode_Equal(fRES(serviceRankCode));
    }

    /**
     * Equal(=). As ServiceRank. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (サービスランクコード)SERVICE_RANK_CODE: {PK, NotNull, CHAR(3), classification=ServiceRank} <br />
     * rank of service member gets
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setServiceRankCode_Equal_AsServiceRank(CDef.ServiceRank cdef) {
        doSetServiceRankCode_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As Platinum (PLT). And OnlyOnceRegistered. <br />
     * PLATINUM: platinum rank
     */
    public void setServiceRankCode_Equal_Platinum() {
        setServiceRankCode_Equal_AsServiceRank(CDef.ServiceRank.Platinum);
    }

    /**
     * Equal(=). As Gold (GLD). And OnlyOnceRegistered. <br />
     * GOLD: gold rank
     */
    public void setServiceRankCode_Equal_Gold() {
        setServiceRankCode_Equal_AsServiceRank(CDef.ServiceRank.Gold);
    }

    /**
     * Equal(=). As Silver (SIL). And OnlyOnceRegistered. <br />
     * SILVER: silver rank
     */
    public void setServiceRankCode_Equal_Silver() {
        setServiceRankCode_Equal_AsServiceRank(CDef.ServiceRank.Silver);
    }

    /**
     * Equal(=). As Bronze (BRZ). And OnlyOnceRegistered. <br />
     * BRONZE: bronze rank
     */
    public void setServiceRankCode_Equal_Bronze() {
        setServiceRankCode_Equal_AsServiceRank(CDef.ServiceRank.Bronze);
    }

    /**
     * Equal(=). As Plastic (PLS). And OnlyOnceRegistered. <br />
     * PLASTIC: plastic rank
     */
    public void setServiceRankCode_Equal_Plastic() {
        setServiceRankCode_Equal_AsServiceRank(CDef.ServiceRank.Plastic);
    }

    protected void doSetServiceRankCode_Equal(String serviceRankCode) {
        regServiceRankCode(CK_EQ, hSC("SERVICE_RANK_CODE", serviceRankCode, 3, "E"));
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (サービスランクコード)SERVICE_RANK_CODE: {PK, NotNull, CHAR(3), classification=ServiceRank}
     * @param serviceRankCode The value of serviceRankCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    protected void setServiceRankCode_NotEqual(String serviceRankCode) {
        doSetServiceRankCode_NotEqual(fRES(serviceRankCode));
    }

    /**
     * NotEqual(&lt;&gt;). As ServiceRank. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (サービスランクコード)SERVICE_RANK_CODE: {PK, NotNull, CHAR(3), classification=ServiceRank} <br />
     * rank of service member gets
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setServiceRankCode_NotEqual_AsServiceRank(CDef.ServiceRank cdef) {
        doSetServiceRankCode_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As Platinum (PLT). And OnlyOnceRegistered. <br />
     * PLATINUM: platinum rank
     */
    public void setServiceRankCode_NotEqual_Platinum() {
        setServiceRankCode_NotEqual_AsServiceRank(CDef.ServiceRank.Platinum);
    }

    /**
     * NotEqual(&lt;&gt;). As Gold (GLD). And OnlyOnceRegistered. <br />
     * GOLD: gold rank
     */
    public void setServiceRankCode_NotEqual_Gold() {
        setServiceRankCode_NotEqual_AsServiceRank(CDef.ServiceRank.Gold);
    }

    /**
     * NotEqual(&lt;&gt;). As Silver (SIL). And OnlyOnceRegistered. <br />
     * SILVER: silver rank
     */
    public void setServiceRankCode_NotEqual_Silver() {
        setServiceRankCode_NotEqual_AsServiceRank(CDef.ServiceRank.Silver);
    }

    /**
     * NotEqual(&lt;&gt;). As Bronze (BRZ). And OnlyOnceRegistered. <br />
     * BRONZE: bronze rank
     */
    public void setServiceRankCode_NotEqual_Bronze() {
        setServiceRankCode_NotEqual_AsServiceRank(CDef.ServiceRank.Bronze);
    }

    /**
     * NotEqual(&lt;&gt;). As Plastic (PLS). And OnlyOnceRegistered. <br />
     * PLASTIC: plastic rank
     */
    public void setServiceRankCode_NotEqual_Plastic() {
        setServiceRankCode_NotEqual_AsServiceRank(CDef.ServiceRank.Plastic);
    }

    protected void doSetServiceRankCode_NotEqual(String serviceRankCode) {
        regServiceRankCode(CK_NES, hSC("SERVICE_RANK_CODE", serviceRankCode, 3, "E"));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (サービスランクコード)SERVICE_RANK_CODE: {PK, NotNull, CHAR(3), classification=ServiceRank}
     * @param serviceRankCodeList The collection of serviceRankCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setServiceRankCode_InScope(Collection<String> serviceRankCodeList) {
        doSetServiceRankCode_InScope(serviceRankCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As ServiceRank. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (サービスランクコード)SERVICE_RANK_CODE: {PK, NotNull, CHAR(3), classification=ServiceRank} <br />
     * rank of service member gets
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setServiceRankCode_InScope_AsServiceRank(Collection<CDef.ServiceRank> cdefList) {
        doSetServiceRankCode_InScope(cTStrL(cdefList));
    }

    public void doSetServiceRankCode_InScope(Collection<String> serviceRankCodeList) {
        regINS(CK_INS, cTL(serviceRankCodeList), getCValueServiceRankCode(), "SERVICE_RANK_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (サービスランクコード)SERVICE_RANK_CODE: {PK, NotNull, CHAR(3), classification=ServiceRank}
     * @param serviceRankCodeList The collection of serviceRankCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setServiceRankCode_NotInScope(Collection<String> serviceRankCodeList) {
        doSetServiceRankCode_NotInScope(serviceRankCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ServiceRank. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (サービスランクコード)SERVICE_RANK_CODE: {PK, NotNull, CHAR(3), classification=ServiceRank} <br />
     * rank of service member gets
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setServiceRankCode_NotInScope_AsServiceRank(Collection<CDef.ServiceRank> cdefList) {
        doSetServiceRankCode_NotInScope(cTStrL(cdefList));
    }

    public void doSetServiceRankCode_NotInScope(Collection<String> serviceRankCodeList) {
        regINS(CK_NINS, cTL(serviceRankCodeList), getCValueServiceRankCode(), "SERVICE_RANK_CODE");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select SERVICE_RANK_CODE from MEMBER_SERVICE where ...)} <br />
     * (会員サービス)MEMBER_SERVICE by SERVICE_RANK_CODE, named 'memberServiceAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsMemberService</span>(new SubQuery&lt;MemberServiceCB&gt;() {
     *     public void query(MemberServiceCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemberServiceList for 'exists'. (NotNull)
     */
    public void existsMemberService(SubQuery<MemberServiceCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberServiceCB cb = new MemberServiceCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepServiceRankCode_ExistsReferrer_MemberServiceList(cb.query());
        registerExistsReferrer(cb.query(), "SERVICE_RANK_CODE", "SERVICE_RANK_CODE", pp, "memberServiceList");
    }
    public abstract String keepServiceRankCode_ExistsReferrer_MemberServiceList(MemberServiceCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select SERVICE_RANK_CODE from MEMBER_SERVICE where ...)} <br />
     * (会員サービス)MEMBER_SERVICE by SERVICE_RANK_CODE, named 'memberServiceAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsMemberService</span>(new SubQuery&lt;MemberServiceCB&gt;() {
     *     public void query(MemberServiceCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of ServiceRankCode_NotExistsReferrer_MemberServiceList for 'not exists'. (NotNull)
     */
    public void notExistsMemberService(SubQuery<MemberServiceCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberServiceCB cb = new MemberServiceCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepServiceRankCode_NotExistsReferrer_MemberServiceList(cb.query());
        registerNotExistsReferrer(cb.query(), "SERVICE_RANK_CODE", "SERVICE_RANK_CODE", pp, "memberServiceList");
    }
    public abstract String keepServiceRankCode_NotExistsReferrer_MemberServiceList(MemberServiceCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select SERVICE_RANK_CODE from MEMBER_SERVICE where ...)} <br />
     * (会員サービス)MEMBER_SERVICE by SERVICE_RANK_CODE, named 'memberServiceAsOne'.
     * @param subQuery The sub-query of MemberServiceList for 'in-scope'. (NotNull)
     */
    public void inScopeMemberServiceList(SubQuery<MemberServiceCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberServiceCB cb = new MemberServiceCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepServiceRankCode_InScopeRelation_MemberServiceList(cb.query());
        registerInScopeRelation(cb.query(), "SERVICE_RANK_CODE", "SERVICE_RANK_CODE", pp, "memberServiceList");
    }
    public abstract String keepServiceRankCode_InScopeRelation_MemberServiceList(MemberServiceCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select SERVICE_RANK_CODE from MEMBER_SERVICE where ...)} <br />
     * (会員サービス)MEMBER_SERVICE by SERVICE_RANK_CODE, named 'memberServiceAsOne'.
     * @param subQuery The sub-query of MemberServiceList for 'not in-scope'. (NotNull)
     */
    public void notInScopeMemberServiceList(SubQuery<MemberServiceCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberServiceCB cb = new MemberServiceCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepServiceRankCode_NotInScopeRelation_MemberServiceList(cb.query());
        registerNotInScopeRelation(cb.query(), "SERVICE_RANK_CODE", "SERVICE_RANK_CODE", pp, "memberServiceList");
    }
    public abstract String keepServiceRankCode_NotInScopeRelation_MemberServiceList(MemberServiceCQ sq);

    public void xsderiveMemberServiceList(String fn, SubQuery<MemberServiceCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberServiceCB cb = new MemberServiceCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepServiceRankCode_SpecifyDerivedReferrer_MemberServiceList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "SERVICE_RANK_CODE", "SERVICE_RANK_CODE", pp, "memberServiceList", al, op);
    }
    public abstract String keepServiceRankCode_SpecifyDerivedReferrer_MemberServiceList(MemberServiceCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from MEMBER_SERVICE where ...)} <br />
     * (会員サービス)MEMBER_SERVICE by SERVICE_RANK_CODE, named 'memberServiceAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedMemberService()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;MemberServiceCB&gt;() {
     *     public void query(MemberServiceCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MemberServiceCB> derivedMemberService() {
        return xcreateQDRFunctionMemberServiceList();
    }
    protected HpQDRFunction<MemberServiceCB> xcreateQDRFunctionMemberServiceList() {
        return new HpQDRFunction<MemberServiceCB>(new HpQDRSetupper<MemberServiceCB>() {
            public void setup(String fn, SubQuery<MemberServiceCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveMemberServiceList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveMemberServiceList(String fn, SubQuery<MemberServiceCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberServiceCB cb = new MemberServiceCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepServiceRankCode_QueryDerivedReferrer_MemberServiceList(cb.query()); String prpp = keepServiceRankCode_QueryDerivedReferrer_MemberServiceListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "SERVICE_RANK_CODE", "SERVICE_RANK_CODE", sqpp, "memberServiceList", rd, vl, prpp, op);
    }
    public abstract String keepServiceRankCode_QueryDerivedReferrer_MemberServiceList(MemberServiceCQ sq);
    public abstract String keepServiceRankCode_QueryDerivedReferrer_MemberServiceListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * (サービスランクコード)SERVICE_RANK_CODE: {PK, NotNull, CHAR(3), classification=ServiceRank}
     */
    public void setServiceRankCode_IsNull() { regServiceRankCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * (サービスランクコード)SERVICE_RANK_CODE: {PK, NotNull, CHAR(3), classification=ServiceRank}
     */
    public void setServiceRankCode_IsNotNull() { regServiceRankCode(CK_ISNN, DOBJ); }

    protected void regServiceRankCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueServiceRankCode(), "SERVICE_RANK_CODE"); }
    protected abstract ConditionValue getCValueServiceRankCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (サービスランク名称)SERVICE_RANK_NAME: {NotNull, VARCHAR(50)}
     * @param serviceRankName The value of serviceRankName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setServiceRankName_Equal(String serviceRankName) {
        doSetServiceRankName_Equal(fRES(serviceRankName));
    }

    protected void doSetServiceRankName_Equal(String serviceRankName) {
        regServiceRankName(CK_EQ, serviceRankName);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (サービスランク名称)SERVICE_RANK_NAME: {NotNull, VARCHAR(50)}
     * @param serviceRankName The value of serviceRankName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setServiceRankName_PrefixSearch(String serviceRankName) {
        setServiceRankName_LikeSearch(serviceRankName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (サービスランク名称)SERVICE_RANK_NAME: {NotNull, VARCHAR(50)} <br />
     * <pre>e.g. setServiceRankName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param serviceRankName The value of serviceRankName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setServiceRankName_LikeSearch(String serviceRankName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(serviceRankName), getCValueServiceRankName(), "SERVICE_RANK_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (サービスランク名称)SERVICE_RANK_NAME: {NotNull, VARCHAR(50)}
     * @param serviceRankName The value of serviceRankName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setServiceRankName_NotLikeSearch(String serviceRankName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(serviceRankName), getCValueServiceRankName(), "SERVICE_RANK_NAME", likeSearchOption);
    }

    protected void regServiceRankName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueServiceRankName(), "SERVICE_RANK_NAME"); }
    protected abstract ConditionValue getCValueServiceRankName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (サービスポイント発生率)SERVICE_POINT_INCIDENCE: {NotNull, DECIMAL(5, 3)}
     * @param servicePointIncidence The value of servicePointIncidence as equal. (NullAllowed: if null, no condition)
     */
    public void setServicePointIncidence_Equal(java.math.BigDecimal servicePointIncidence) {
        doSetServicePointIncidence_Equal(servicePointIncidence);
    }

    protected void doSetServicePointIncidence_Equal(java.math.BigDecimal servicePointIncidence) {
        regServicePointIncidence(CK_EQ, servicePointIncidence);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (サービスポイント発生率)SERVICE_POINT_INCIDENCE: {NotNull, DECIMAL(5, 3)}
     * @param servicePointIncidence The value of servicePointIncidence as notEqual. (NullAllowed: if null, no condition)
     */
    public void setServicePointIncidence_NotEqual(java.math.BigDecimal servicePointIncidence) {
        doSetServicePointIncidence_NotEqual(servicePointIncidence);
    }

    protected void doSetServicePointIncidence_NotEqual(java.math.BigDecimal servicePointIncidence) {
        regServicePointIncidence(CK_NES, servicePointIncidence);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (サービスポイント発生率)SERVICE_POINT_INCIDENCE: {NotNull, DECIMAL(5, 3)}
     * @param servicePointIncidence The value of servicePointIncidence as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setServicePointIncidence_GreaterThan(java.math.BigDecimal servicePointIncidence) {
        regServicePointIncidence(CK_GT, servicePointIncidence);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (サービスポイント発生率)SERVICE_POINT_INCIDENCE: {NotNull, DECIMAL(5, 3)}
     * @param servicePointIncidence The value of servicePointIncidence as lessThan. (NullAllowed: if null, no condition)
     */
    public void setServicePointIncidence_LessThan(java.math.BigDecimal servicePointIncidence) {
        regServicePointIncidence(CK_LT, servicePointIncidence);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (サービスポイント発生率)SERVICE_POINT_INCIDENCE: {NotNull, DECIMAL(5, 3)}
     * @param servicePointIncidence The value of servicePointIncidence as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setServicePointIncidence_GreaterEqual(java.math.BigDecimal servicePointIncidence) {
        regServicePointIncidence(CK_GE, servicePointIncidence);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (サービスポイント発生率)SERVICE_POINT_INCIDENCE: {NotNull, DECIMAL(5, 3)}
     * @param servicePointIncidence The value of servicePointIncidence as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setServicePointIncidence_LessEqual(java.math.BigDecimal servicePointIncidence) {
        regServicePointIncidence(CK_LE, servicePointIncidence);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (サービスポイント発生率)SERVICE_POINT_INCIDENCE: {NotNull, DECIMAL(5, 3)}
     * @param minNumber The min number of servicePointIncidence. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of servicePointIncidence. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setServicePointIncidence_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueServicePointIncidence(), "SERVICE_POINT_INCIDENCE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (サービスポイント発生率)SERVICE_POINT_INCIDENCE: {NotNull, DECIMAL(5, 3)}
     * @param servicePointIncidenceList The collection of servicePointIncidence as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setServicePointIncidence_InScope(Collection<java.math.BigDecimal> servicePointIncidenceList) {
        doSetServicePointIncidence_InScope(servicePointIncidenceList);
    }

    protected void doSetServicePointIncidence_InScope(Collection<java.math.BigDecimal> servicePointIncidenceList) {
        regINS(CK_INS, cTL(servicePointIncidenceList), getCValueServicePointIncidence(), "SERVICE_POINT_INCIDENCE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (サービスポイント発生率)SERVICE_POINT_INCIDENCE: {NotNull, DECIMAL(5, 3)}
     * @param servicePointIncidenceList The collection of servicePointIncidence as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setServicePointIncidence_NotInScope(Collection<java.math.BigDecimal> servicePointIncidenceList) {
        doSetServicePointIncidence_NotInScope(servicePointIncidenceList);
    }

    protected void doSetServicePointIncidence_NotInScope(Collection<java.math.BigDecimal> servicePointIncidenceList) {
        regINS(CK_NINS, cTL(servicePointIncidenceList), getCValueServicePointIncidence(), "SERVICE_POINT_INCIDENCE");
    }

    protected void regServicePointIncidence(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueServicePointIncidence(), "SERVICE_POINT_INCIDENCE"); }
    protected abstract ConditionValue getCValueServicePointIncidence();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (新規受け入れ可能フラグ)NEW_ACCEPTABLE_FLG: {NotNull, INTEGER(10), classification=Flg}
     * @param newAcceptableFlg The value of newAcceptableFlg as equal. (NullAllowed: if null, no condition)
     */
    protected void setNewAcceptableFlg_Equal(Integer newAcceptableFlg) {
        doSetNewAcceptableFlg_Equal(newAcceptableFlg);
    }

    /**
     * Equal(=). As Flg. And NullIgnored, OnlyOnceRegistered. <br />
     * (新規受け入れ可能フラグ)NEW_ACCEPTABLE_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setNewAcceptableFlg_Equal_AsFlg(CDef.Flg cdef) {
        doSetNewAcceptableFlg_Equal(cTNum(cdef != null ? cdef.code() : null, Integer.class));
    }

    /**
     * Equal(=). As True (1). And NullIgnored, OnlyOnceRegistered. <br />
     * Yes: means valid
     */
    public void setNewAcceptableFlg_Equal_True() {
        setNewAcceptableFlg_Equal_AsFlg(CDef.Flg.True);
    }

    /**
     * Equal(=). As False (0). And NullIgnored, OnlyOnceRegistered. <br />
     * No: means invalid
     */
    public void setNewAcceptableFlg_Equal_False() {
        setNewAcceptableFlg_Equal_AsFlg(CDef.Flg.False);
    }

    protected void doSetNewAcceptableFlg_Equal(Integer newAcceptableFlg) {
        regNewAcceptableFlg(CK_EQ, newAcceptableFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (新規受け入れ可能フラグ)NEW_ACCEPTABLE_FLG: {NotNull, INTEGER(10), classification=Flg}
     * @param newAcceptableFlg The value of newAcceptableFlg as notEqual. (NullAllowed: if null, no condition)
     */
    protected void setNewAcceptableFlg_NotEqual(Integer newAcceptableFlg) {
        doSetNewAcceptableFlg_NotEqual(newAcceptableFlg);
    }

    /**
     * NotEqual(&lt;&gt;). As Flg. And NullIgnored, OnlyOnceRegistered. <br />
     * (新規受け入れ可能フラグ)NEW_ACCEPTABLE_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setNewAcceptableFlg_NotEqual_AsFlg(CDef.Flg cdef) {
        doSetNewAcceptableFlg_NotEqual(cTNum(cdef != null ? cdef.code() : null, Integer.class));
    }

    /**
     * NotEqual(&lt;&gt;). As True (1). And NullIgnored, OnlyOnceRegistered. <br />
     * Yes: means valid
     */
    public void setNewAcceptableFlg_NotEqual_True() {
        setNewAcceptableFlg_NotEqual_AsFlg(CDef.Flg.True);
    }

    /**
     * NotEqual(&lt;&gt;). As False (0). And NullIgnored, OnlyOnceRegistered. <br />
     * No: means invalid
     */
    public void setNewAcceptableFlg_NotEqual_False() {
        setNewAcceptableFlg_NotEqual_AsFlg(CDef.Flg.False);
    }

    protected void doSetNewAcceptableFlg_NotEqual(Integer newAcceptableFlg) {
        regNewAcceptableFlg(CK_NES, newAcceptableFlg);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (新規受け入れ可能フラグ)NEW_ACCEPTABLE_FLG: {NotNull, INTEGER(10), classification=Flg}
     * @param newAcceptableFlgList The collection of newAcceptableFlg as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNewAcceptableFlg_InScope(Collection<Integer> newAcceptableFlgList) {
        doSetNewAcceptableFlg_InScope(newAcceptableFlgList);
    }

    /**
     * InScope {in (1, 2)}. As Flg. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (新規受け入れ可能フラグ)NEW_ACCEPTABLE_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * general boolean classification for every flg-column
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setNewAcceptableFlg_InScope_AsFlg(Collection<CDef.Flg> cdefList) {
        doSetNewAcceptableFlg_InScope(cTNumL(cdefList, Integer.class));
    }

    protected void doSetNewAcceptableFlg_InScope(Collection<Integer> newAcceptableFlgList) {
        regINS(CK_INS, cTL(newAcceptableFlgList), getCValueNewAcceptableFlg(), "NEW_ACCEPTABLE_FLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (新規受け入れ可能フラグ)NEW_ACCEPTABLE_FLG: {NotNull, INTEGER(10), classification=Flg}
     * @param newAcceptableFlgList The collection of newAcceptableFlg as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNewAcceptableFlg_NotInScope(Collection<Integer> newAcceptableFlgList) {
        doSetNewAcceptableFlg_NotInScope(newAcceptableFlgList);
    }

    /**
     * NotInScope {not in (1, 2)}. As Flg. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (新規受け入れ可能フラグ)NEW_ACCEPTABLE_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * general boolean classification for every flg-column
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setNewAcceptableFlg_NotInScope_AsFlg(Collection<CDef.Flg> cdefList) {
        doSetNewAcceptableFlg_NotInScope(cTNumL(cdefList, Integer.class));
    }

    protected void doSetNewAcceptableFlg_NotInScope(Collection<Integer> newAcceptableFlgList) {
        regINS(CK_NINS, cTL(newAcceptableFlgList), getCValueNewAcceptableFlg(), "NEW_ACCEPTABLE_FLG");
    }

    protected void regNewAcceptableFlg(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueNewAcceptableFlg(), "NEW_ACCEPTABLE_FLG"); }
    protected abstract ConditionValue getCValueNewAcceptableFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (説明)DESCRIPTION: {NotNull, VARCHAR(200)}
     * @param description The value of description as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setDescription_Equal(String description) {
        doSetDescription_Equal(fRES(description));
    }

    protected void doSetDescription_Equal(String description) {
        regDescription(CK_EQ, description);
    }

    protected void regDescription(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueDescription(), "DESCRIPTION"); }
    protected abstract ConditionValue getCValueDescription();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (表示順)DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)}
     * @param displayOrder The value of displayOrder as equal. (NullAllowed: if null, no condition)
     */
    public void setDisplayOrder_Equal(Integer displayOrder) {
        doSetDisplayOrder_Equal(displayOrder);
    }

    protected void doSetDisplayOrder_Equal(Integer displayOrder) {
        regDisplayOrder(CK_EQ, displayOrder);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (表示順)DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)}
     * @param minNumber The min number of displayOrder. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of displayOrder. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDisplayOrder_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueDisplayOrder(), "DISPLAY_ORDER", rangeOfOption);
    }

    protected void regDisplayOrder(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueDisplayOrder(), "DISPLAY_ORDER"); }
    protected abstract ConditionValue getCValueDisplayOrder();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;ServiceRankCB&gt;() {
     *     public void query(ServiceRankCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ServiceRankCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, ServiceRankCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;ServiceRankCB&gt;() {
     *     public void query(ServiceRankCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ServiceRankCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, ServiceRankCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;ServiceRankCB&gt;() {
     *     public void query(ServiceRankCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ServiceRankCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, ServiceRankCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;ServiceRankCB&gt;() {
     *     public void query(ServiceRankCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ServiceRankCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, ServiceRankCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;ServiceRankCB&gt;() {
     *     public void query(ServiceRankCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ServiceRankCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, ServiceRankCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ServiceRankCB&gt;() {
     *     public void query(ServiceRankCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ServiceRankCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, ServiceRankCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        ServiceRankCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(ServiceRankCQ sq);

    protected ServiceRankCB xcreateScalarConditionCB() {
        ServiceRankCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected ServiceRankCB xcreateScalarConditionPartitionByCB() {
        ServiceRankCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<ServiceRankCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ServiceRankCB cb = new ServiceRankCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "SERVICE_RANK_CODE";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(ServiceRankCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ServiceRankCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(ServiceRankCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ServiceRankCB cb = new ServiceRankCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SERVICE_RANK_CODE";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(ServiceRankCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * MemberCB cb = new MemberCB();
     * ManualOrderBean mob = new ManualOrderBean();
     * mob.<span style="color: #DD4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #DD4747">withManualOrder(mob)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * MemberCB cb = new MemberCB();
     * ManualOrderBean mob = new ManualOrderBean();
     * mob.<span style="color: #DD4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     * mob.<span style="color: #DD4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     * mob.<span style="color: #DD4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #DD4747">withManualOrder(mob)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param mob The bean of manual order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderBean mob) { // is user public!
        xdoWithManualOrder(mob);
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    protected Date toUtilDate(Object date) {
        if (date != null && date instanceof ReadablePartial) {
            return new Date(((ReadablePartial) date).toDateTime(null).getMillis());
        } else if (date != null && date instanceof ReadableInstant) {
            return new Date(((ReadableInstant) date).getMillis());
        }
        return DfTypeUtil.toDate(date);
    }

    protected java.sql.Timestamp toTimestamp(Object date) {
        if (date != null && date instanceof ReadablePartial) {
            return new java.sql.Timestamp(((ReadablePartial) date).toDateTime(null).getMillis());
        } else if (date != null && date instanceof ReadableInstant) {
            return new java.sql.Timestamp(((ReadableInstant) date).getMillis());
        }
        return DfTypeUtil.toTimestamp(date);
    }

    @Override
    protected Object filterFromToRegisteredDate(Date date, String columnDbName) {
        if (date instanceof java.sql.Timestamp) {
            return LocalDateTime.fromDateFields(date);
        } else { // basically pure Date
            return LocalDate.fromDateFields(date);
        }
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected ServiceRankCB newMyCB() {
        return new ServiceRankCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return ServiceRankCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
