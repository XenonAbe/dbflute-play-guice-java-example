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
 * The abstract condition-query of VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsVendorTheLongAndWindingTableAndColumnCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsVendorTheLongAndWindingTableAndColumnCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)}
     * @param theLongAndWindingTableAndColumnId The value of theLongAndWindingTableAndColumnId as equal. (NullAllowed: if null, no condition)
     */
    public void setTheLongAndWindingTableAndColumnId_Equal(Long theLongAndWindingTableAndColumnId) {
        doSetTheLongAndWindingTableAndColumnId_Equal(theLongAndWindingTableAndColumnId);
    }

    protected void doSetTheLongAndWindingTableAndColumnId_Equal(Long theLongAndWindingTableAndColumnId) {
        regTheLongAndWindingTableAndColumnId(CK_EQ, theLongAndWindingTableAndColumnId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)}
     * @param theLongAndWindingTableAndColumnId The value of theLongAndWindingTableAndColumnId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setTheLongAndWindingTableAndColumnId_NotEqual(Long theLongAndWindingTableAndColumnId) {
        doSetTheLongAndWindingTableAndColumnId_NotEqual(theLongAndWindingTableAndColumnId);
    }

    protected void doSetTheLongAndWindingTableAndColumnId_NotEqual(Long theLongAndWindingTableAndColumnId) {
        regTheLongAndWindingTableAndColumnId(CK_NES, theLongAndWindingTableAndColumnId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)}
     * @param theLongAndWindingTableAndColumnId The value of theLongAndWindingTableAndColumnId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTheLongAndWindingTableAndColumnId_GreaterThan(Long theLongAndWindingTableAndColumnId) {
        regTheLongAndWindingTableAndColumnId(CK_GT, theLongAndWindingTableAndColumnId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)}
     * @param theLongAndWindingTableAndColumnId The value of theLongAndWindingTableAndColumnId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTheLongAndWindingTableAndColumnId_LessThan(Long theLongAndWindingTableAndColumnId) {
        regTheLongAndWindingTableAndColumnId(CK_LT, theLongAndWindingTableAndColumnId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)}
     * @param theLongAndWindingTableAndColumnId The value of theLongAndWindingTableAndColumnId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTheLongAndWindingTableAndColumnId_GreaterEqual(Long theLongAndWindingTableAndColumnId) {
        regTheLongAndWindingTableAndColumnId(CK_GE, theLongAndWindingTableAndColumnId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)}
     * @param theLongAndWindingTableAndColumnId The value of theLongAndWindingTableAndColumnId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTheLongAndWindingTableAndColumnId_LessEqual(Long theLongAndWindingTableAndColumnId) {
        regTheLongAndWindingTableAndColumnId(CK_LE, theLongAndWindingTableAndColumnId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of theLongAndWindingTableAndColumnId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of theLongAndWindingTableAndColumnId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTheLongAndWindingTableAndColumnId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTheLongAndWindingTableAndColumnId(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)}
     * @param theLongAndWindingTableAndColumnIdList The collection of theLongAndWindingTableAndColumnId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTheLongAndWindingTableAndColumnId_InScope(Collection<Long> theLongAndWindingTableAndColumnIdList) {
        doSetTheLongAndWindingTableAndColumnId_InScope(theLongAndWindingTableAndColumnIdList);
    }

    protected void doSetTheLongAndWindingTableAndColumnId_InScope(Collection<Long> theLongAndWindingTableAndColumnIdList) {
        regINS(CK_INS, cTL(theLongAndWindingTableAndColumnIdList), getCValueTheLongAndWindingTableAndColumnId(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)}
     * @param theLongAndWindingTableAndColumnIdList The collection of theLongAndWindingTableAndColumnId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTheLongAndWindingTableAndColumnId_NotInScope(Collection<Long> theLongAndWindingTableAndColumnIdList) {
        doSetTheLongAndWindingTableAndColumnId_NotInScope(theLongAndWindingTableAndColumnIdList);
    }

    protected void doSetTheLongAndWindingTableAndColumnId_NotInScope(Collection<Long> theLongAndWindingTableAndColumnIdList) {
        regINS(CK_NINS, cTL(theLongAndWindingTableAndColumnIdList), getCValueTheLongAndWindingTableAndColumnId(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID from VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF where ...)} <br />
     * VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF by THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID, named 'vendorTheLongAndWindingTableAndColumnRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsVendorTheLongAndWindingTableAndColumnRef</span>(new SubQuery&lt;VendorTheLongAndWindingTableAndColumnRefCB&gt;() {
     *     public void query(VendorTheLongAndWindingTableAndColumnRefCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of VendorTheLongAndWindingTableAndColumnRefList for 'exists'. (NotNull)
     */
    public void existsVendorTheLongAndWindingTableAndColumnRef(SubQuery<VendorTheLongAndWindingTableAndColumnRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorTheLongAndWindingTableAndColumnRefCB cb = new VendorTheLongAndWindingTableAndColumnRefCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepTheLongAndWindingTableAndColumnId_ExistsReferrer_VendorTheLongAndWindingTableAndColumnRefList(cb.query());
        registerExistsReferrer(cb.query(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID", "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID", pp, "vendorTheLongAndWindingTableAndColumnRefList");
    }
    public abstract String keepTheLongAndWindingTableAndColumnId_ExistsReferrer_VendorTheLongAndWindingTableAndColumnRefList(VendorTheLongAndWindingTableAndColumnRefCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID from VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF where ...)} <br />
     * VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF by THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID, named 'vendorTheLongAndWindingTableAndColumnRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsVendorTheLongAndWindingTableAndColumnRef</span>(new SubQuery&lt;VendorTheLongAndWindingTableAndColumnRefCB&gt;() {
     *     public void query(VendorTheLongAndWindingTableAndColumnRefCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of TheLongAndWindingTableAndColumnId_NotExistsReferrer_VendorTheLongAndWindingTableAndColumnRefList for 'not exists'. (NotNull)
     */
    public void notExistsVendorTheLongAndWindingTableAndColumnRef(SubQuery<VendorTheLongAndWindingTableAndColumnRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorTheLongAndWindingTableAndColumnRefCB cb = new VendorTheLongAndWindingTableAndColumnRefCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepTheLongAndWindingTableAndColumnId_NotExistsReferrer_VendorTheLongAndWindingTableAndColumnRefList(cb.query());
        registerNotExistsReferrer(cb.query(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID", "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID", pp, "vendorTheLongAndWindingTableAndColumnRefList");
    }
    public abstract String keepTheLongAndWindingTableAndColumnId_NotExistsReferrer_VendorTheLongAndWindingTableAndColumnRefList(VendorTheLongAndWindingTableAndColumnRefCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID from VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF where ...)} <br />
     * VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF by THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID, named 'vendorTheLongAndWindingTableAndColumnRefAsOne'.
     * @param subQuery The sub-query of VendorTheLongAndWindingTableAndColumnRefList for 'in-scope'. (NotNull)
     */
    public void inScopeVendorTheLongAndWindingTableAndColumnRefList(SubQuery<VendorTheLongAndWindingTableAndColumnRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorTheLongAndWindingTableAndColumnRefCB cb = new VendorTheLongAndWindingTableAndColumnRefCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepTheLongAndWindingTableAndColumnId_InScopeRelation_VendorTheLongAndWindingTableAndColumnRefList(cb.query());
        registerInScopeRelation(cb.query(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID", "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID", pp, "vendorTheLongAndWindingTableAndColumnRefList");
    }
    public abstract String keepTheLongAndWindingTableAndColumnId_InScopeRelation_VendorTheLongAndWindingTableAndColumnRefList(VendorTheLongAndWindingTableAndColumnRefCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID from VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF where ...)} <br />
     * VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF by THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID, named 'vendorTheLongAndWindingTableAndColumnRefAsOne'.
     * @param subQuery The sub-query of VendorTheLongAndWindingTableAndColumnRefList for 'not in-scope'. (NotNull)
     */
    public void notInScopeVendorTheLongAndWindingTableAndColumnRefList(SubQuery<VendorTheLongAndWindingTableAndColumnRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorTheLongAndWindingTableAndColumnRefCB cb = new VendorTheLongAndWindingTableAndColumnRefCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepTheLongAndWindingTableAndColumnId_NotInScopeRelation_VendorTheLongAndWindingTableAndColumnRefList(cb.query());
        registerNotInScopeRelation(cb.query(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID", "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID", pp, "vendorTheLongAndWindingTableAndColumnRefList");
    }
    public abstract String keepTheLongAndWindingTableAndColumnId_NotInScopeRelation_VendorTheLongAndWindingTableAndColumnRefList(VendorTheLongAndWindingTableAndColumnRefCQ sq);

    public void xsderiveVendorTheLongAndWindingTableAndColumnRefList(String fn, SubQuery<VendorTheLongAndWindingTableAndColumnRefCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorTheLongAndWindingTableAndColumnRefCB cb = new VendorTheLongAndWindingTableAndColumnRefCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepTheLongAndWindingTableAndColumnId_SpecifyDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID", "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID", pp, "vendorTheLongAndWindingTableAndColumnRefList", al, op);
    }
    public abstract String keepTheLongAndWindingTableAndColumnId_SpecifyDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefList(VendorTheLongAndWindingTableAndColumnRefCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF where ...)} <br />
     * VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF by THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID, named 'vendorTheLongAndWindingTableAndColumnRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedVendorTheLongAndWindingTableAndColumnRef()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;VendorTheLongAndWindingTableAndColumnRefCB&gt;() {
     *     public void query(VendorTheLongAndWindingTableAndColumnRefCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<VendorTheLongAndWindingTableAndColumnRefCB> derivedVendorTheLongAndWindingTableAndColumnRef() {
        return xcreateQDRFunctionVendorTheLongAndWindingTableAndColumnRefList();
    }
    protected HpQDRFunction<VendorTheLongAndWindingTableAndColumnRefCB> xcreateQDRFunctionVendorTheLongAndWindingTableAndColumnRefList() {
        return new HpQDRFunction<VendorTheLongAndWindingTableAndColumnRefCB>(new HpQDRSetupper<VendorTheLongAndWindingTableAndColumnRefCB>() {
            public void setup(String fn, SubQuery<VendorTheLongAndWindingTableAndColumnRefCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveVendorTheLongAndWindingTableAndColumnRefList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveVendorTheLongAndWindingTableAndColumnRefList(String fn, SubQuery<VendorTheLongAndWindingTableAndColumnRefCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorTheLongAndWindingTableAndColumnRefCB cb = new VendorTheLongAndWindingTableAndColumnRefCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepTheLongAndWindingTableAndColumnId_QueryDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefList(cb.query()); String prpp = keepTheLongAndWindingTableAndColumnId_QueryDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID", "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID", sqpp, "vendorTheLongAndWindingTableAndColumnRefList", rd, vl, prpp, op);
    }
    public abstract String keepTheLongAndWindingTableAndColumnId_QueryDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefList(VendorTheLongAndWindingTableAndColumnRefCQ sq);
    public abstract String keepTheLongAndWindingTableAndColumnId_QueryDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setTheLongAndWindingTableAndColumnId_IsNull() { regTheLongAndWindingTableAndColumnId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setTheLongAndWindingTableAndColumnId_IsNotNull() { regTheLongAndWindingTableAndColumnId(CK_ISNN, DOBJ); }

    protected void regTheLongAndWindingTableAndColumnId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTheLongAndWindingTableAndColumnId(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID"); }
    protected abstract ConditionValue getCValueTheLongAndWindingTableAndColumnId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME: {UQ, NotNull, VARCHAR(200)}
     * @param theLongAndWindingTableAndColumnName The value of theLongAndWindingTableAndColumnName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTheLongAndWindingTableAndColumnName_Equal(String theLongAndWindingTableAndColumnName) {
        doSetTheLongAndWindingTableAndColumnName_Equal(fRES(theLongAndWindingTableAndColumnName));
    }

    protected void doSetTheLongAndWindingTableAndColumnName_Equal(String theLongAndWindingTableAndColumnName) {
        regTheLongAndWindingTableAndColumnName(CK_EQ, theLongAndWindingTableAndColumnName);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME: {UQ, NotNull, VARCHAR(200)}
     * @param theLongAndWindingTableAndColumnName The value of theLongAndWindingTableAndColumnName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setTheLongAndWindingTableAndColumnName_PrefixSearch(String theLongAndWindingTableAndColumnName) {
        setTheLongAndWindingTableAndColumnName_LikeSearch(theLongAndWindingTableAndColumnName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME: {UQ, NotNull, VARCHAR(200)} <br />
     * <pre>e.g. setTheLongAndWindingTableAndColumnName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param theLongAndWindingTableAndColumnName The value of theLongAndWindingTableAndColumnName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTheLongAndWindingTableAndColumnName_LikeSearch(String theLongAndWindingTableAndColumnName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(theLongAndWindingTableAndColumnName), getCValueTheLongAndWindingTableAndColumnName(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME: {UQ, NotNull, VARCHAR(200)}
     * @param theLongAndWindingTableAndColumnName The value of theLongAndWindingTableAndColumnName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTheLongAndWindingTableAndColumnName_NotLikeSearch(String theLongAndWindingTableAndColumnName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(theLongAndWindingTableAndColumnName), getCValueTheLongAndWindingTableAndColumnName(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME", likeSearchOption);
    }

    protected void regTheLongAndWindingTableAndColumnName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTheLongAndWindingTableAndColumnName(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME"); }
    protected abstract ConditionValue getCValueTheLongAndWindingTableAndColumnName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * SHORT_NAME: {NotNull, VARCHAR(200)}
     * @param shortName The value of shortName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setShortName_Equal(String shortName) {
        doSetShortName_Equal(fRES(shortName));
    }

    protected void doSetShortName_Equal(String shortName) {
        regShortName(CK_EQ, shortName);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * SHORT_NAME: {NotNull, VARCHAR(200)}
     * @param shortName The value of shortName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setShortName_PrefixSearch(String shortName) {
        setShortName_LikeSearch(shortName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * SHORT_NAME: {NotNull, VARCHAR(200)} <br />
     * <pre>e.g. setShortName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shortName The value of shortName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShortName_LikeSearch(String shortName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shortName), getCValueShortName(), "SHORT_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * SHORT_NAME: {NotNull, VARCHAR(200)}
     * @param shortName The value of shortName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShortName_NotLikeSearch(String shortName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shortName), getCValueShortName(), "SHORT_NAME", likeSearchOption);
    }

    protected void regShortName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueShortName(), "SHORT_NAME"); }
    protected abstract ConditionValue getCValueShortName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * SHORT_SIZE: {NotNull, INTEGER(10)}
     * @param shortSize The value of shortSize as equal. (NullAllowed: if null, no condition)
     */
    public void setShortSize_Equal(Integer shortSize) {
        doSetShortSize_Equal(shortSize);
    }

    protected void doSetShortSize_Equal(Integer shortSize) {
        regShortSize(CK_EQ, shortSize);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * SHORT_SIZE: {NotNull, INTEGER(10)}
     * @param shortSize The value of shortSize as notEqual. (NullAllowed: if null, no condition)
     */
    public void setShortSize_NotEqual(Integer shortSize) {
        doSetShortSize_NotEqual(shortSize);
    }

    protected void doSetShortSize_NotEqual(Integer shortSize) {
        regShortSize(CK_NES, shortSize);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * SHORT_SIZE: {NotNull, INTEGER(10)}
     * @param shortSize The value of shortSize as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setShortSize_GreaterThan(Integer shortSize) {
        regShortSize(CK_GT, shortSize);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * SHORT_SIZE: {NotNull, INTEGER(10)}
     * @param shortSize The value of shortSize as lessThan. (NullAllowed: if null, no condition)
     */
    public void setShortSize_LessThan(Integer shortSize) {
        regShortSize(CK_LT, shortSize);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * SHORT_SIZE: {NotNull, INTEGER(10)}
     * @param shortSize The value of shortSize as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setShortSize_GreaterEqual(Integer shortSize) {
        regShortSize(CK_GE, shortSize);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * SHORT_SIZE: {NotNull, INTEGER(10)}
     * @param shortSize The value of shortSize as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setShortSize_LessEqual(Integer shortSize) {
        regShortSize(CK_LE, shortSize);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * SHORT_SIZE: {NotNull, INTEGER(10)}
     * @param minNumber The min number of shortSize. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of shortSize. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShortSize_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueShortSize(), "SHORT_SIZE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * SHORT_SIZE: {NotNull, INTEGER(10)}
     * @param shortSizeList The collection of shortSize as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setShortSize_InScope(Collection<Integer> shortSizeList) {
        doSetShortSize_InScope(shortSizeList);
    }

    protected void doSetShortSize_InScope(Collection<Integer> shortSizeList) {
        regINS(CK_INS, cTL(shortSizeList), getCValueShortSize(), "SHORT_SIZE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * SHORT_SIZE: {NotNull, INTEGER(10)}
     * @param shortSizeList The collection of shortSize as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setShortSize_NotInScope(Collection<Integer> shortSizeList) {
        doSetShortSize_NotInScope(shortSizeList);
    }

    protected void doSetShortSize_NotInScope(Collection<Integer> shortSizeList) {
        regINS(CK_NINS, cTL(shortSizeList), getCValueShortSize(), "SHORT_SIZE");
    }

    protected void regShortSize(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueShortSize(), "SHORT_SIZE"); }
    protected abstract ConditionValue getCValueShortSize();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;VendorTheLongAndWindingTableAndColumnCB&gt;() {
     *     public void query(VendorTheLongAndWindingTableAndColumnCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorTheLongAndWindingTableAndColumnCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, VendorTheLongAndWindingTableAndColumnCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;VendorTheLongAndWindingTableAndColumnCB&gt;() {
     *     public void query(VendorTheLongAndWindingTableAndColumnCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorTheLongAndWindingTableAndColumnCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, VendorTheLongAndWindingTableAndColumnCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;VendorTheLongAndWindingTableAndColumnCB&gt;() {
     *     public void query(VendorTheLongAndWindingTableAndColumnCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorTheLongAndWindingTableAndColumnCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, VendorTheLongAndWindingTableAndColumnCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;VendorTheLongAndWindingTableAndColumnCB&gt;() {
     *     public void query(VendorTheLongAndWindingTableAndColumnCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorTheLongAndWindingTableAndColumnCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, VendorTheLongAndWindingTableAndColumnCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;VendorTheLongAndWindingTableAndColumnCB&gt;() {
     *     public void query(VendorTheLongAndWindingTableAndColumnCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorTheLongAndWindingTableAndColumnCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, VendorTheLongAndWindingTableAndColumnCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;VendorTheLongAndWindingTableAndColumnCB&gt;() {
     *     public void query(VendorTheLongAndWindingTableAndColumnCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorTheLongAndWindingTableAndColumnCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, VendorTheLongAndWindingTableAndColumnCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        VendorTheLongAndWindingTableAndColumnCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(VendorTheLongAndWindingTableAndColumnCQ sq);

    protected VendorTheLongAndWindingTableAndColumnCB xcreateScalarConditionCB() {
        VendorTheLongAndWindingTableAndColumnCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected VendorTheLongAndWindingTableAndColumnCB xcreateScalarConditionPartitionByCB() {
        VendorTheLongAndWindingTableAndColumnCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<VendorTheLongAndWindingTableAndColumnCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorTheLongAndWindingTableAndColumnCB cb = new VendorTheLongAndWindingTableAndColumnCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(VendorTheLongAndWindingTableAndColumnCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<VendorTheLongAndWindingTableAndColumnCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(VendorTheLongAndWindingTableAndColumnCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorTheLongAndWindingTableAndColumnCB cb = new VendorTheLongAndWindingTableAndColumnCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(VendorTheLongAndWindingTableAndColumnCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<VendorTheLongAndWindingTableAndColumnCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorTheLongAndWindingTableAndColumnCB cb = new VendorTheLongAndWindingTableAndColumnCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(VendorTheLongAndWindingTableAndColumnCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<VendorTheLongAndWindingTableAndColumnCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorTheLongAndWindingTableAndColumnCB cb = new VendorTheLongAndWindingTableAndColumnCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(VendorTheLongAndWindingTableAndColumnCQ sq);

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
    protected VendorTheLongAndWindingTableAndColumnCB newMyCB() {
        return new VendorTheLongAndWindingTableAndColumnCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return VendorTheLongAndWindingTableAndColumnCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
