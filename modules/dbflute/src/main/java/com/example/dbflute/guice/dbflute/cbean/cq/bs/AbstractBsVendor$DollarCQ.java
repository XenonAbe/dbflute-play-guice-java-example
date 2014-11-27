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
 * The abstract condition-query of VENDOR_$_DOLLAR.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsVendor$DollarCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsVendor$DollarCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "VENDOR_$_DOLLAR";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_$_DOLLAR_ID: {PK, NotNull, INTEGER(10)}
     * @param vendor$DollarId The value of vendor$DollarId as equal. (NullAllowed: if null, no condition)
     */
    public void setVendor$DollarId_Equal(Integer vendor$DollarId) {
        doSetVendor$DollarId_Equal(vendor$DollarId);
    }

    protected void doSetVendor$DollarId_Equal(Integer vendor$DollarId) {
        regVendor$DollarId(CK_EQ, vendor$DollarId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_$_DOLLAR_ID: {PK, NotNull, INTEGER(10)}
     * @param vendor$DollarId The value of vendor$DollarId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setVendor$DollarId_NotEqual(Integer vendor$DollarId) {
        doSetVendor$DollarId_NotEqual(vendor$DollarId);
    }

    protected void doSetVendor$DollarId_NotEqual(Integer vendor$DollarId) {
        regVendor$DollarId(CK_NES, vendor$DollarId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_$_DOLLAR_ID: {PK, NotNull, INTEGER(10)}
     * @param vendor$DollarId The value of vendor$DollarId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setVendor$DollarId_GreaterThan(Integer vendor$DollarId) {
        regVendor$DollarId(CK_GT, vendor$DollarId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_$_DOLLAR_ID: {PK, NotNull, INTEGER(10)}
     * @param vendor$DollarId The value of vendor$DollarId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setVendor$DollarId_LessThan(Integer vendor$DollarId) {
        regVendor$DollarId(CK_LT, vendor$DollarId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_$_DOLLAR_ID: {PK, NotNull, INTEGER(10)}
     * @param vendor$DollarId The value of vendor$DollarId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setVendor$DollarId_GreaterEqual(Integer vendor$DollarId) {
        regVendor$DollarId(CK_GE, vendor$DollarId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_$_DOLLAR_ID: {PK, NotNull, INTEGER(10)}
     * @param vendor$DollarId The value of vendor$DollarId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setVendor$DollarId_LessEqual(Integer vendor$DollarId) {
        regVendor$DollarId(CK_LE, vendor$DollarId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_$_DOLLAR_ID: {PK, NotNull, INTEGER(10)}
     * @param minNumber The min number of vendor$DollarId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of vendor$DollarId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setVendor$DollarId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueVendor$DollarId(), "VENDOR_$_DOLLAR_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * VENDOR_$_DOLLAR_ID: {PK, NotNull, INTEGER(10)}
     * @param vendor$DollarIdList The collection of vendor$DollarId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVendor$DollarId_InScope(Collection<Integer> vendor$DollarIdList) {
        doSetVendor$DollarId_InScope(vendor$DollarIdList);
    }

    protected void doSetVendor$DollarId_InScope(Collection<Integer> vendor$DollarIdList) {
        regINS(CK_INS, cTL(vendor$DollarIdList), getCValueVendor$DollarId(), "VENDOR_$_DOLLAR_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * VENDOR_$_DOLLAR_ID: {PK, NotNull, INTEGER(10)}
     * @param vendor$DollarIdList The collection of vendor$DollarId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVendor$DollarId_NotInScope(Collection<Integer> vendor$DollarIdList) {
        doSetVendor$DollarId_NotInScope(vendor$DollarIdList);
    }

    protected void doSetVendor$DollarId_NotInScope(Collection<Integer> vendor$DollarIdList) {
        regINS(CK_NINS, cTL(vendor$DollarIdList), getCValueVendor$DollarId(), "VENDOR_$_DOLLAR_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * VENDOR_$_DOLLAR_ID: {PK, NotNull, INTEGER(10)}
     */
    public void setVendor$DollarId_IsNull() { regVendor$DollarId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * VENDOR_$_DOLLAR_ID: {PK, NotNull, INTEGER(10)}
     */
    public void setVendor$DollarId_IsNotNull() { regVendor$DollarId(CK_ISNN, DOBJ); }

    protected void regVendor$DollarId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueVendor$DollarId(), "VENDOR_$_DOLLAR_ID"); }
    protected abstract ConditionValue getCValueVendor$DollarId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * VENDOR_$_DOLLAR_NAME: {VARCHAR(32)}
     * @param vendor$DollarName The value of vendor$DollarName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setVendor$DollarName_Equal(String vendor$DollarName) {
        doSetVendor$DollarName_Equal(fRES(vendor$DollarName));
    }

    protected void doSetVendor$DollarName_Equal(String vendor$DollarName) {
        regVendor$DollarName(CK_EQ, vendor$DollarName);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * VENDOR_$_DOLLAR_NAME: {VARCHAR(32)}
     * @param vendor$DollarName The value of vendor$DollarName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setVendor$DollarName_PrefixSearch(String vendor$DollarName) {
        setVendor$DollarName_LikeSearch(vendor$DollarName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * VENDOR_$_DOLLAR_NAME: {VARCHAR(32)} <br />
     * <pre>e.g. setVendor$DollarName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param vendor$DollarName The value of vendor$DollarName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setVendor$DollarName_LikeSearch(String vendor$DollarName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(vendor$DollarName), getCValueVendor$DollarName(), "VENDOR_$_DOLLAR_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * VENDOR_$_DOLLAR_NAME: {VARCHAR(32)}
     * @param vendor$DollarName The value of vendor$DollarName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setVendor$DollarName_NotLikeSearch(String vendor$DollarName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(vendor$DollarName), getCValueVendor$DollarName(), "VENDOR_$_DOLLAR_NAME", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * VENDOR_$_DOLLAR_NAME: {VARCHAR(32)}
     */
    public void setVendor$DollarName_IsNull() { regVendor$DollarName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * VENDOR_$_DOLLAR_NAME: {VARCHAR(32)}
     */
    public void setVendor$DollarName_IsNullOrEmpty() { regVendor$DollarName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * VENDOR_$_DOLLAR_NAME: {VARCHAR(32)}
     */
    public void setVendor$DollarName_IsNotNull() { regVendor$DollarName(CK_ISNN, DOBJ); }

    protected void regVendor$DollarName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueVendor$DollarName(), "VENDOR_$_DOLLAR_NAME"); }
    protected abstract ConditionValue getCValueVendor$DollarName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;Vendor$DollarCB&gt;() {
     *     public void query(Vendor$DollarCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<Vendor$DollarCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, Vendor$DollarCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;Vendor$DollarCB&gt;() {
     *     public void query(Vendor$DollarCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<Vendor$DollarCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, Vendor$DollarCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;Vendor$DollarCB&gt;() {
     *     public void query(Vendor$DollarCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<Vendor$DollarCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, Vendor$DollarCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;Vendor$DollarCB&gt;() {
     *     public void query(Vendor$DollarCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<Vendor$DollarCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, Vendor$DollarCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;Vendor$DollarCB&gt;() {
     *     public void query(Vendor$DollarCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<Vendor$DollarCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, Vendor$DollarCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;Vendor$DollarCB&gt;() {
     *     public void query(Vendor$DollarCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<Vendor$DollarCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, Vendor$DollarCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        Vendor$DollarCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(Vendor$DollarCQ sq);

    protected Vendor$DollarCB xcreateScalarConditionCB() {
        Vendor$DollarCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected Vendor$DollarCB xcreateScalarConditionPartitionByCB() {
        Vendor$DollarCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<Vendor$DollarCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        Vendor$DollarCB cb = new Vendor$DollarCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "VENDOR_$_DOLLAR_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(Vendor$DollarCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<Vendor$DollarCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(Vendor$DollarCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        Vendor$DollarCB cb = new Vendor$DollarCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "VENDOR_$_DOLLAR_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(Vendor$DollarCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<Vendor$DollarCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        Vendor$DollarCB cb = new Vendor$DollarCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(Vendor$DollarCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<Vendor$DollarCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        Vendor$DollarCB cb = new Vendor$DollarCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(Vendor$DollarCQ sq);

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
    protected Vendor$DollarCB newMyCB() {
        return new Vendor$DollarCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return Vendor$DollarCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
