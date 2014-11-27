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
 * The abstract condition-query of REGION.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsRegionCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsRegionCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "REGION";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (地域ID)REGION_ID: {PK, NotNull, INTEGER(10), classification=Region}
     * @param regionId The value of regionId as equal. (NullAllowed: if null, no condition)
     */
    public void setRegionId_Equal(Integer regionId) {
        doSetRegionId_Equal(regionId);
    }

    /**
     * Equal(=). As Region. And NullIgnored, OnlyOnceRegistered. <br />
     * (地域ID)REGION_ID: {PK, NotNull, INTEGER(10), classification=Region} <br />
     * mainly region of member address
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setRegionId_Equal_AsRegion(CDef.Region cdef) {
        doSetRegionId_Equal(cTNum(cdef != null ? cdef.code() : null, Integer.class));
    }

    /**
     * Equal(=). As America (1). And NullIgnored, OnlyOnceRegistered. <br />
     * AMERICA
     */
    public void setRegionId_Equal_America() {
        setRegionId_Equal_AsRegion(CDef.Region.America);
    }

    /**
     * Equal(=). As Canada (2). And NullIgnored, OnlyOnceRegistered. <br />
     * CANADA
     */
    public void setRegionId_Equal_Canada() {
        setRegionId_Equal_AsRegion(CDef.Region.Canada);
    }

    /**
     * Equal(=). As China (3). And NullIgnored, OnlyOnceRegistered. <br />
     * CHINA
     */
    public void setRegionId_Equal_China() {
        setRegionId_Equal_AsRegion(CDef.Region.China);
    }

    /**
     * Equal(=). As Chiba (4). And NullIgnored, OnlyOnceRegistered. <br />
     * CHIBA
     */
    public void setRegionId_Equal_Chiba() {
        setRegionId_Equal_AsRegion(CDef.Region.Chiba);
    }

    protected void doSetRegionId_Equal(Integer regionId) {
        regRegionId(CK_EQ, regionId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (地域ID)REGION_ID: {PK, NotNull, INTEGER(10), classification=Region}
     * @param regionId The value of regionId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setRegionId_NotEqual(Integer regionId) {
        doSetRegionId_NotEqual(regionId);
    }

    /**
     * NotEqual(&lt;&gt;). As Region. And NullIgnored, OnlyOnceRegistered. <br />
     * (地域ID)REGION_ID: {PK, NotNull, INTEGER(10), classification=Region} <br />
     * mainly region of member address
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setRegionId_NotEqual_AsRegion(CDef.Region cdef) {
        doSetRegionId_NotEqual(cTNum(cdef != null ? cdef.code() : null, Integer.class));
    }

    /**
     * NotEqual(&lt;&gt;). As America (1). And NullIgnored, OnlyOnceRegistered. <br />
     * AMERICA
     */
    public void setRegionId_NotEqual_America() {
        setRegionId_NotEqual_AsRegion(CDef.Region.America);
    }

    /**
     * NotEqual(&lt;&gt;). As Canada (2). And NullIgnored, OnlyOnceRegistered. <br />
     * CANADA
     */
    public void setRegionId_NotEqual_Canada() {
        setRegionId_NotEqual_AsRegion(CDef.Region.Canada);
    }

    /**
     * NotEqual(&lt;&gt;). As China (3). And NullIgnored, OnlyOnceRegistered. <br />
     * CHINA
     */
    public void setRegionId_NotEqual_China() {
        setRegionId_NotEqual_AsRegion(CDef.Region.China);
    }

    /**
     * NotEqual(&lt;&gt;). As Chiba (4). And NullIgnored, OnlyOnceRegistered. <br />
     * CHIBA
     */
    public void setRegionId_NotEqual_Chiba() {
        setRegionId_NotEqual_AsRegion(CDef.Region.Chiba);
    }

    protected void doSetRegionId_NotEqual(Integer regionId) {
        regRegionId(CK_NES, regionId);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (地域ID)REGION_ID: {PK, NotNull, INTEGER(10), classification=Region}
     * @param regionIdList The collection of regionId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegionId_InScope(Collection<Integer> regionIdList) {
        doSetRegionId_InScope(regionIdList);
    }

    /**
     * InScope {in (1, 2)}. As Region. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (地域ID)REGION_ID: {PK, NotNull, INTEGER(10), classification=Region} <br />
     * mainly region of member address
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setRegionId_InScope_AsRegion(Collection<CDef.Region> cdefList) {
        doSetRegionId_InScope(cTNumL(cdefList, Integer.class));
    }

    protected void doSetRegionId_InScope(Collection<Integer> regionIdList) {
        regINS(CK_INS, cTL(regionIdList), getCValueRegionId(), "REGION_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (地域ID)REGION_ID: {PK, NotNull, INTEGER(10), classification=Region}
     * @param regionIdList The collection of regionId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegionId_NotInScope(Collection<Integer> regionIdList) {
        doSetRegionId_NotInScope(regionIdList);
    }

    /**
     * NotInScope {not in (1, 2)}. As Region. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (地域ID)REGION_ID: {PK, NotNull, INTEGER(10), classification=Region} <br />
     * mainly region of member address
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setRegionId_NotInScope_AsRegion(Collection<CDef.Region> cdefList) {
        doSetRegionId_NotInScope(cTNumL(cdefList, Integer.class));
    }

    protected void doSetRegionId_NotInScope(Collection<Integer> regionIdList) {
        regINS(CK_NINS, cTL(regionIdList), getCValueRegionId(), "REGION_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select REGION_ID from MEMBER_ADDRESS where ...)} <br />
     * (会員住所情報)MEMBER_ADDRESS by REGION_ID, named 'memberAddressAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsMemberAddress</span>(new SubQuery&lt;MemberAddressCB&gt;() {
     *     public void query(MemberAddressCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemberAddressList for 'exists'. (NotNull)
     */
    public void existsMemberAddress(SubQuery<MemberAddressCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberAddressCB cb = new MemberAddressCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepRegionId_ExistsReferrer_MemberAddressList(cb.query());
        registerExistsReferrer(cb.query(), "REGION_ID", "REGION_ID", pp, "memberAddressList");
    }
    public abstract String keepRegionId_ExistsReferrer_MemberAddressList(MemberAddressCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select REGION_ID from MEMBER_ADDRESS where ...)} <br />
     * (会員住所情報)MEMBER_ADDRESS by REGION_ID, named 'memberAddressAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsMemberAddress</span>(new SubQuery&lt;MemberAddressCB&gt;() {
     *     public void query(MemberAddressCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of RegionId_NotExistsReferrer_MemberAddressList for 'not exists'. (NotNull)
     */
    public void notExistsMemberAddress(SubQuery<MemberAddressCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberAddressCB cb = new MemberAddressCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepRegionId_NotExistsReferrer_MemberAddressList(cb.query());
        registerNotExistsReferrer(cb.query(), "REGION_ID", "REGION_ID", pp, "memberAddressList");
    }
    public abstract String keepRegionId_NotExistsReferrer_MemberAddressList(MemberAddressCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select REGION_ID from MEMBER_ADDRESS where ...)} <br />
     * (会員住所情報)MEMBER_ADDRESS by REGION_ID, named 'memberAddressAsOne'.
     * @param subQuery The sub-query of MemberAddressList for 'in-scope'. (NotNull)
     */
    public void inScopeMemberAddressList(SubQuery<MemberAddressCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberAddressCB cb = new MemberAddressCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepRegionId_InScopeRelation_MemberAddressList(cb.query());
        registerInScopeRelation(cb.query(), "REGION_ID", "REGION_ID", pp, "memberAddressList");
    }
    public abstract String keepRegionId_InScopeRelation_MemberAddressList(MemberAddressCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select REGION_ID from MEMBER_ADDRESS where ...)} <br />
     * (会員住所情報)MEMBER_ADDRESS by REGION_ID, named 'memberAddressAsOne'.
     * @param subQuery The sub-query of MemberAddressList for 'not in-scope'. (NotNull)
     */
    public void notInScopeMemberAddressList(SubQuery<MemberAddressCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberAddressCB cb = new MemberAddressCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepRegionId_NotInScopeRelation_MemberAddressList(cb.query());
        registerNotInScopeRelation(cb.query(), "REGION_ID", "REGION_ID", pp, "memberAddressList");
    }
    public abstract String keepRegionId_NotInScopeRelation_MemberAddressList(MemberAddressCQ sq);

    public void xsderiveMemberAddressList(String fn, SubQuery<MemberAddressCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberAddressCB cb = new MemberAddressCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepRegionId_SpecifyDerivedReferrer_MemberAddressList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "REGION_ID", "REGION_ID", pp, "memberAddressList", al, op);
    }
    public abstract String keepRegionId_SpecifyDerivedReferrer_MemberAddressList(MemberAddressCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from MEMBER_ADDRESS where ...)} <br />
     * (会員住所情報)MEMBER_ADDRESS by REGION_ID, named 'memberAddressAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedMemberAddress()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;MemberAddressCB&gt;() {
     *     public void query(MemberAddressCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MemberAddressCB> derivedMemberAddress() {
        return xcreateQDRFunctionMemberAddressList();
    }
    protected HpQDRFunction<MemberAddressCB> xcreateQDRFunctionMemberAddressList() {
        return new HpQDRFunction<MemberAddressCB>(new HpQDRSetupper<MemberAddressCB>() {
            public void setup(String fn, SubQuery<MemberAddressCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveMemberAddressList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveMemberAddressList(String fn, SubQuery<MemberAddressCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberAddressCB cb = new MemberAddressCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepRegionId_QueryDerivedReferrer_MemberAddressList(cb.query()); String prpp = keepRegionId_QueryDerivedReferrer_MemberAddressListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "REGION_ID", "REGION_ID", sqpp, "memberAddressList", rd, vl, prpp, op);
    }
    public abstract String keepRegionId_QueryDerivedReferrer_MemberAddressList(MemberAddressCQ sq);
    public abstract String keepRegionId_QueryDerivedReferrer_MemberAddressListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * (地域ID)REGION_ID: {PK, NotNull, INTEGER(10), classification=Region}
     */
    public void setRegionId_IsNull() { regRegionId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * (地域ID)REGION_ID: {PK, NotNull, INTEGER(10), classification=Region}
     */
    public void setRegionId_IsNotNull() { regRegionId(CK_ISNN, DOBJ); }

    protected void regRegionId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRegionId(), "REGION_ID"); }
    protected abstract ConditionValue getCValueRegionId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (地域名称)REGION_NAME: {NotNull, VARCHAR(50)}
     * @param regionName The value of regionName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegionName_Equal(String regionName) {
        doSetRegionName_Equal(fRES(regionName));
    }

    protected void doSetRegionName_Equal(String regionName) {
        regRegionName(CK_EQ, regionName);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (地域名称)REGION_NAME: {NotNull, VARCHAR(50)}
     * @param regionName The value of regionName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegionName_PrefixSearch(String regionName) {
        setRegionName_LikeSearch(regionName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (地域名称)REGION_NAME: {NotNull, VARCHAR(50)} <br />
     * <pre>e.g. setRegionName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param regionName The value of regionName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRegionName_LikeSearch(String regionName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(regionName), getCValueRegionName(), "REGION_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (地域名称)REGION_NAME: {NotNull, VARCHAR(50)}
     * @param regionName The value of regionName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRegionName_NotLikeSearch(String regionName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(regionName), getCValueRegionName(), "REGION_NAME", likeSearchOption);
    }

    protected void regRegionName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRegionName(), "REGION_NAME"); }
    protected abstract ConditionValue getCValueRegionName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;RegionCB&gt;() {
     *     public void query(RegionCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<RegionCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, RegionCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;RegionCB&gt;() {
     *     public void query(RegionCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<RegionCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, RegionCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;RegionCB&gt;() {
     *     public void query(RegionCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<RegionCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, RegionCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;RegionCB&gt;() {
     *     public void query(RegionCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<RegionCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, RegionCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;RegionCB&gt;() {
     *     public void query(RegionCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<RegionCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, RegionCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;RegionCB&gt;() {
     *     public void query(RegionCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<RegionCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, RegionCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        RegionCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(RegionCQ sq);

    protected RegionCB xcreateScalarConditionCB() {
        RegionCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected RegionCB xcreateScalarConditionPartitionByCB() {
        RegionCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<RegionCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        RegionCB cb = new RegionCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "REGION_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(RegionCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<RegionCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(RegionCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        RegionCB cb = new RegionCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "REGION_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(RegionCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<RegionCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        RegionCB cb = new RegionCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(RegionCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<RegionCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        RegionCB cb = new RegionCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(RegionCQ sq);

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
    protected RegionCB newMyCB() {
        return new RegionCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return RegionCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
