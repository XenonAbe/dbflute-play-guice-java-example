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
 * The abstract condition-query of WHITE_DATE_TERM.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteDateTermCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteDateTermCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_DATE_TERM";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * DATE_TERM_ID: {PK, NotNull, DECIMAL(16)}
     * @param dateTermId The value of dateTermId as equal. (NullAllowed: if null, no condition)
     */
    public void setDateTermId_Equal(Long dateTermId) {
        doSetDateTermId_Equal(dateTermId);
    }

    protected void doSetDateTermId_Equal(Long dateTermId) {
        regDateTermId(CK_EQ, dateTermId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * DATE_TERM_ID: {PK, NotNull, DECIMAL(16)}
     * @param dateTermId The value of dateTermId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setDateTermId_NotEqual(Long dateTermId) {
        doSetDateTermId_NotEqual(dateTermId);
    }

    protected void doSetDateTermId_NotEqual(Long dateTermId) {
        regDateTermId(CK_NES, dateTermId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * DATE_TERM_ID: {PK, NotNull, DECIMAL(16)}
     * @param dateTermId The value of dateTermId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setDateTermId_GreaterThan(Long dateTermId) {
        regDateTermId(CK_GT, dateTermId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * DATE_TERM_ID: {PK, NotNull, DECIMAL(16)}
     * @param dateTermId The value of dateTermId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setDateTermId_LessThan(Long dateTermId) {
        regDateTermId(CK_LT, dateTermId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * DATE_TERM_ID: {PK, NotNull, DECIMAL(16)}
     * @param dateTermId The value of dateTermId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setDateTermId_GreaterEqual(Long dateTermId) {
        regDateTermId(CK_GE, dateTermId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * DATE_TERM_ID: {PK, NotNull, DECIMAL(16)}
     * @param dateTermId The value of dateTermId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setDateTermId_LessEqual(Long dateTermId) {
        regDateTermId(CK_LE, dateTermId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * DATE_TERM_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of dateTermId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of dateTermId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDateTermId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueDateTermId(), "DATE_TERM_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * DATE_TERM_ID: {PK, NotNull, DECIMAL(16)}
     * @param dateTermIdList The collection of dateTermId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDateTermId_InScope(Collection<Long> dateTermIdList) {
        doSetDateTermId_InScope(dateTermIdList);
    }

    protected void doSetDateTermId_InScope(Collection<Long> dateTermIdList) {
        regINS(CK_INS, cTL(dateTermIdList), getCValueDateTermId(), "DATE_TERM_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * DATE_TERM_ID: {PK, NotNull, DECIMAL(16)}
     * @param dateTermIdList The collection of dateTermId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDateTermId_NotInScope(Collection<Long> dateTermIdList) {
        doSetDateTermId_NotInScope(dateTermIdList);
    }

    protected void doSetDateTermId_NotInScope(Collection<Long> dateTermIdList) {
        regINS(CK_NINS, cTL(dateTermIdList), getCValueDateTermId(), "DATE_TERM_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * DATE_TERM_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setDateTermId_IsNull() { regDateTermId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * DATE_TERM_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setDateTermId_IsNotNull() { regDateTermId(CK_ISNN, DOBJ); }

    protected void regDateTermId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueDateTermId(), "DATE_TERM_ID"); }
    protected abstract ConditionValue getCValueDateTermId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * DATE_TERM_VALUE: {NotNull, VARCHAR(200)}
     * @param dateTermValue The value of dateTermValue as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setDateTermValue_Equal(String dateTermValue) {
        doSetDateTermValue_Equal(fRES(dateTermValue));
    }

    protected void doSetDateTermValue_Equal(String dateTermValue) {
        regDateTermValue(CK_EQ, dateTermValue);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * DATE_TERM_VALUE: {NotNull, VARCHAR(200)}
     * @param dateTermValue The value of dateTermValue as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setDateTermValue_NotEqual(String dateTermValue) {
        doSetDateTermValue_NotEqual(fRES(dateTermValue));
    }

    protected void doSetDateTermValue_NotEqual(String dateTermValue) {
        regDateTermValue(CK_NES, dateTermValue);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * DATE_TERM_VALUE: {NotNull, VARCHAR(200)}
     * @param dateTermValueList The collection of dateTermValue as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDateTermValue_InScope(Collection<String> dateTermValueList) {
        doSetDateTermValue_InScope(dateTermValueList);
    }

    public void doSetDateTermValue_InScope(Collection<String> dateTermValueList) {
        regINS(CK_INS, cTL(dateTermValueList), getCValueDateTermValue(), "DATE_TERM_VALUE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * DATE_TERM_VALUE: {NotNull, VARCHAR(200)}
     * @param dateTermValueList The collection of dateTermValue as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDateTermValue_NotInScope(Collection<String> dateTermValueList) {
        doSetDateTermValue_NotInScope(dateTermValueList);
    }

    public void doSetDateTermValue_NotInScope(Collection<String> dateTermValueList) {
        regINS(CK_NINS, cTL(dateTermValueList), getCValueDateTermValue(), "DATE_TERM_VALUE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * DATE_TERM_VALUE: {NotNull, VARCHAR(200)}
     * @param dateTermValue The value of dateTermValue as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setDateTermValue_PrefixSearch(String dateTermValue) {
        setDateTermValue_LikeSearch(dateTermValue, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * DATE_TERM_VALUE: {NotNull, VARCHAR(200)} <br />
     * <pre>e.g. setDateTermValue_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dateTermValue The value of dateTermValue as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDateTermValue_LikeSearch(String dateTermValue, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dateTermValue), getCValueDateTermValue(), "DATE_TERM_VALUE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * DATE_TERM_VALUE: {NotNull, VARCHAR(200)}
     * @param dateTermValue The value of dateTermValue as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDateTermValue_NotLikeSearch(String dateTermValue, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dateTermValue), getCValueDateTermValue(), "DATE_TERM_VALUE", likeSearchOption);
    }

    protected void regDateTermValue(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueDateTermValue(), "DATE_TERM_VALUE"); }
    protected abstract ConditionValue getCValueDateTermValue();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * BEGIN_DATE: {NotNull, DATE(8)}
     * @param beginDate The value of beginDate as equal. (NullAllowed: if null, no condition)
     */
    public void setBeginDate_Equal(org.joda.time.LocalDate beginDate) {
        regBeginDate(CK_EQ,  beginDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * BEGIN_DATE: {NotNull, DATE(8)}
     * @param beginDate The value of beginDate as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setBeginDate_GreaterThan(org.joda.time.LocalDate beginDate) {
        regBeginDate(CK_GT,  beginDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * BEGIN_DATE: {NotNull, DATE(8)}
     * @param beginDate The value of beginDate as lessThan. (NullAllowed: if null, no condition)
     */
    public void setBeginDate_LessThan(org.joda.time.LocalDate beginDate) {
        regBeginDate(CK_LT,  beginDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * BEGIN_DATE: {NotNull, DATE(8)}
     * @param beginDate The value of beginDate as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setBeginDate_GreaterEqual(org.joda.time.LocalDate beginDate) {
        regBeginDate(CK_GE,  beginDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * BEGIN_DATE: {NotNull, DATE(8)}
     * @param beginDate The value of beginDate as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setBeginDate_LessEqual(org.joda.time.LocalDate beginDate) {
        regBeginDate(CK_LE, beginDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * BEGIN_DATE: {NotNull, DATE(8)}
     * <pre>e.g. setBeginDate_FromTo(fromDate, toDate, new <span style="color: #DD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of beginDate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of beginDate. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setBeginDate_FromTo(org.joda.time.LocalDate fromDatetime, org.joda.time.LocalDate toDatetime, FromToOption fromToOption) {
        regFTQ(toUtilDate(fromDatetime), toUtilDate(toDatetime), getCValueBeginDate(), "BEGIN_DATE", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * BEGIN_DATE: {NotNull, DATE(8)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #DD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of beginDate. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of beginDate. (NullAllowed: if null, no to-condition)
     */
    public void setBeginDate_DateFromTo(org.joda.time.LocalDate fromDate, org.joda.time.LocalDate toDate) {
        setBeginDate_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    protected void regBeginDate(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueBeginDate(), "BEGIN_DATE"); }
    protected abstract ConditionValue getCValueBeginDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * END_DATE: {NotNull, DATE(8)}
     * @param endDate The value of endDate as equal. (NullAllowed: if null, no condition)
     */
    public void setEndDate_Equal(org.joda.time.LocalDate endDate) {
        regEndDate(CK_EQ,  endDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * END_DATE: {NotNull, DATE(8)}
     * @param endDate The value of endDate as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setEndDate_GreaterThan(org.joda.time.LocalDate endDate) {
        regEndDate(CK_GT,  endDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * END_DATE: {NotNull, DATE(8)}
     * @param endDate The value of endDate as lessThan. (NullAllowed: if null, no condition)
     */
    public void setEndDate_LessThan(org.joda.time.LocalDate endDate) {
        regEndDate(CK_LT,  endDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * END_DATE: {NotNull, DATE(8)}
     * @param endDate The value of endDate as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setEndDate_GreaterEqual(org.joda.time.LocalDate endDate) {
        regEndDate(CK_GE,  endDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * END_DATE: {NotNull, DATE(8)}
     * @param endDate The value of endDate as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setEndDate_LessEqual(org.joda.time.LocalDate endDate) {
        regEndDate(CK_LE, endDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * END_DATE: {NotNull, DATE(8)}
     * <pre>e.g. setEndDate_FromTo(fromDate, toDate, new <span style="color: #DD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of endDate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of endDate. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setEndDate_FromTo(org.joda.time.LocalDate fromDatetime, org.joda.time.LocalDate toDatetime, FromToOption fromToOption) {
        regFTQ(toUtilDate(fromDatetime), toUtilDate(toDatetime), getCValueEndDate(), "END_DATE", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * END_DATE: {NotNull, DATE(8)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #DD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of endDate. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of endDate. (NullAllowed: if null, no to-condition)
     */
    public void setEndDate_DateFromTo(org.joda.time.LocalDate fromDate, org.joda.time.LocalDate toDate) {
        setEndDate_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    protected void regEndDate(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueEndDate(), "END_DATE"); }
    protected abstract ConditionValue getCValueEndDate();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteDateTermCB&gt;() {
     *     public void query(WhiteDateTermCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteDateTermCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, WhiteDateTermCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteDateTermCB&gt;() {
     *     public void query(WhiteDateTermCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteDateTermCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, WhiteDateTermCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteDateTermCB&gt;() {
     *     public void query(WhiteDateTermCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteDateTermCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, WhiteDateTermCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteDateTermCB&gt;() {
     *     public void query(WhiteDateTermCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteDateTermCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, WhiteDateTermCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteDateTermCB&gt;() {
     *     public void query(WhiteDateTermCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteDateTermCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, WhiteDateTermCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteDateTermCB&gt;() {
     *     public void query(WhiteDateTermCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteDateTermCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, WhiteDateTermCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteDateTermCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteDateTermCQ sq);

    protected WhiteDateTermCB xcreateScalarConditionCB() {
        WhiteDateTermCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteDateTermCB xcreateScalarConditionPartitionByCB() {
        WhiteDateTermCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteDateTermCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteDateTermCB cb = new WhiteDateTermCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "DATE_TERM_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteDateTermCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteDateTermCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteDateTermCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteDateTermCB cb = new WhiteDateTermCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "DATE_TERM_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteDateTermCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteDateTermCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteDateTermCB cb = new WhiteDateTermCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteDateTermCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteDateTermCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteDateTermCB cb = new WhiteDateTermCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteDateTermCQ sq);

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
    protected WhiteDateTermCB newMyCB() {
        return new WhiteDateTermCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteDateTermCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
