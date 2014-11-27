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
 * The abstract condition-query of VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsVendorTheLongAndWindingTableAndColumnRefCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsVendorTheLongAndWindingTableAndColumnRefCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID: {PK, NotNull, BIGINT(19)}
     * @param theLongAndWindingTableAndColumnRefId The value of theLongAndWindingTableAndColumnRefId as equal. (NullAllowed: if null, no condition)
     */
    public void setTheLongAndWindingTableAndColumnRefId_Equal(Long theLongAndWindingTableAndColumnRefId) {
        doSetTheLongAndWindingTableAndColumnRefId_Equal(theLongAndWindingTableAndColumnRefId);
    }

    protected void doSetTheLongAndWindingTableAndColumnRefId_Equal(Long theLongAndWindingTableAndColumnRefId) {
        regTheLongAndWindingTableAndColumnRefId(CK_EQ, theLongAndWindingTableAndColumnRefId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID: {PK, NotNull, BIGINT(19)}
     * @param theLongAndWindingTableAndColumnRefId The value of theLongAndWindingTableAndColumnRefId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setTheLongAndWindingTableAndColumnRefId_NotEqual(Long theLongAndWindingTableAndColumnRefId) {
        doSetTheLongAndWindingTableAndColumnRefId_NotEqual(theLongAndWindingTableAndColumnRefId);
    }

    protected void doSetTheLongAndWindingTableAndColumnRefId_NotEqual(Long theLongAndWindingTableAndColumnRefId) {
        regTheLongAndWindingTableAndColumnRefId(CK_NES, theLongAndWindingTableAndColumnRefId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID: {PK, NotNull, BIGINT(19)}
     * @param theLongAndWindingTableAndColumnRefId The value of theLongAndWindingTableAndColumnRefId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTheLongAndWindingTableAndColumnRefId_GreaterThan(Long theLongAndWindingTableAndColumnRefId) {
        regTheLongAndWindingTableAndColumnRefId(CK_GT, theLongAndWindingTableAndColumnRefId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID: {PK, NotNull, BIGINT(19)}
     * @param theLongAndWindingTableAndColumnRefId The value of theLongAndWindingTableAndColumnRefId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTheLongAndWindingTableAndColumnRefId_LessThan(Long theLongAndWindingTableAndColumnRefId) {
        regTheLongAndWindingTableAndColumnRefId(CK_LT, theLongAndWindingTableAndColumnRefId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID: {PK, NotNull, BIGINT(19)}
     * @param theLongAndWindingTableAndColumnRefId The value of theLongAndWindingTableAndColumnRefId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTheLongAndWindingTableAndColumnRefId_GreaterEqual(Long theLongAndWindingTableAndColumnRefId) {
        regTheLongAndWindingTableAndColumnRefId(CK_GE, theLongAndWindingTableAndColumnRefId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID: {PK, NotNull, BIGINT(19)}
     * @param theLongAndWindingTableAndColumnRefId The value of theLongAndWindingTableAndColumnRefId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTheLongAndWindingTableAndColumnRefId_LessEqual(Long theLongAndWindingTableAndColumnRefId) {
        regTheLongAndWindingTableAndColumnRefId(CK_LE, theLongAndWindingTableAndColumnRefId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of theLongAndWindingTableAndColumnRefId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of theLongAndWindingTableAndColumnRefId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTheLongAndWindingTableAndColumnRefId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTheLongAndWindingTableAndColumnRefId(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID: {PK, NotNull, BIGINT(19)}
     * @param theLongAndWindingTableAndColumnRefIdList The collection of theLongAndWindingTableAndColumnRefId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTheLongAndWindingTableAndColumnRefId_InScope(Collection<Long> theLongAndWindingTableAndColumnRefIdList) {
        doSetTheLongAndWindingTableAndColumnRefId_InScope(theLongAndWindingTableAndColumnRefIdList);
    }

    protected void doSetTheLongAndWindingTableAndColumnRefId_InScope(Collection<Long> theLongAndWindingTableAndColumnRefIdList) {
        regINS(CK_INS, cTL(theLongAndWindingTableAndColumnRefIdList), getCValueTheLongAndWindingTableAndColumnRefId(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID: {PK, NotNull, BIGINT(19)}
     * @param theLongAndWindingTableAndColumnRefIdList The collection of theLongAndWindingTableAndColumnRefId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTheLongAndWindingTableAndColumnRefId_NotInScope(Collection<Long> theLongAndWindingTableAndColumnRefIdList) {
        doSetTheLongAndWindingTableAndColumnRefId_NotInScope(theLongAndWindingTableAndColumnRefIdList);
    }

    protected void doSetTheLongAndWindingTableAndColumnRefId_NotInScope(Collection<Long> theLongAndWindingTableAndColumnRefIdList) {
        regINS(CK_NINS, cTL(theLongAndWindingTableAndColumnRefIdList), getCValueTheLongAndWindingTableAndColumnRefId(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setTheLongAndWindingTableAndColumnRefId_IsNull() { regTheLongAndWindingTableAndColumnRefId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setTheLongAndWindingTableAndColumnRefId_IsNotNull() { regTheLongAndWindingTableAndColumnRefId(CK_ISNN, DOBJ); }

    protected void regTheLongAndWindingTableAndColumnRefId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTheLongAndWindingTableAndColumnRefId(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID"); }
    protected abstract ConditionValue getCValueTheLongAndWindingTableAndColumnRefId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {IX, NotNull, BIGINT(19), FK to VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN}
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
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {IX, NotNull, BIGINT(19), FK to VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN}
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
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {IX, NotNull, BIGINT(19), FK to VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN}
     * @param theLongAndWindingTableAndColumnId The value of theLongAndWindingTableAndColumnId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTheLongAndWindingTableAndColumnId_GreaterThan(Long theLongAndWindingTableAndColumnId) {
        regTheLongAndWindingTableAndColumnId(CK_GT, theLongAndWindingTableAndColumnId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {IX, NotNull, BIGINT(19), FK to VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN}
     * @param theLongAndWindingTableAndColumnId The value of theLongAndWindingTableAndColumnId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTheLongAndWindingTableAndColumnId_LessThan(Long theLongAndWindingTableAndColumnId) {
        regTheLongAndWindingTableAndColumnId(CK_LT, theLongAndWindingTableAndColumnId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {IX, NotNull, BIGINT(19), FK to VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN}
     * @param theLongAndWindingTableAndColumnId The value of theLongAndWindingTableAndColumnId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTheLongAndWindingTableAndColumnId_GreaterEqual(Long theLongAndWindingTableAndColumnId) {
        regTheLongAndWindingTableAndColumnId(CK_GE, theLongAndWindingTableAndColumnId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {IX, NotNull, BIGINT(19), FK to VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN}
     * @param theLongAndWindingTableAndColumnId The value of theLongAndWindingTableAndColumnId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTheLongAndWindingTableAndColumnId_LessEqual(Long theLongAndWindingTableAndColumnId) {
        regTheLongAndWindingTableAndColumnId(CK_LE, theLongAndWindingTableAndColumnId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {IX, NotNull, BIGINT(19), FK to VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN}
     * @param minNumber The min number of theLongAndWindingTableAndColumnId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of theLongAndWindingTableAndColumnId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTheLongAndWindingTableAndColumnId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTheLongAndWindingTableAndColumnId(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {IX, NotNull, BIGINT(19), FK to VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN}
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
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {IX, NotNull, BIGINT(19), FK to VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN}
     * @param theLongAndWindingTableAndColumnIdList The collection of theLongAndWindingTableAndColumnId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTheLongAndWindingTableAndColumnId_NotInScope(Collection<Long> theLongAndWindingTableAndColumnIdList) {
        doSetTheLongAndWindingTableAndColumnId_NotInScope(theLongAndWindingTableAndColumnIdList);
    }

    protected void doSetTheLongAndWindingTableAndColumnId_NotInScope(Collection<Long> theLongAndWindingTableAndColumnIdList) {
        regINS(CK_NINS, cTL(theLongAndWindingTableAndColumnIdList), getCValueTheLongAndWindingTableAndColumnId(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID");
    }

    protected void regTheLongAndWindingTableAndColumnId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTheLongAndWindingTableAndColumnId(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID"); }
    protected abstract ConditionValue getCValueTheLongAndWindingTableAndColumnId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE: {NotNull, DATE(8)}
     * @param theLongAndWindingTableAndColumnRefDate The value of theLongAndWindingTableAndColumnRefDate as equal. (NullAllowed: if null, no condition)
     */
    public void setTheLongAndWindingTableAndColumnRefDate_Equal(org.joda.time.LocalDate theLongAndWindingTableAndColumnRefDate) {
        regTheLongAndWindingTableAndColumnRefDate(CK_EQ,  theLongAndWindingTableAndColumnRefDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE: {NotNull, DATE(8)}
     * @param theLongAndWindingTableAndColumnRefDate The value of theLongAndWindingTableAndColumnRefDate as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTheLongAndWindingTableAndColumnRefDate_GreaterThan(org.joda.time.LocalDate theLongAndWindingTableAndColumnRefDate) {
        regTheLongAndWindingTableAndColumnRefDate(CK_GT,  theLongAndWindingTableAndColumnRefDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE: {NotNull, DATE(8)}
     * @param theLongAndWindingTableAndColumnRefDate The value of theLongAndWindingTableAndColumnRefDate as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTheLongAndWindingTableAndColumnRefDate_LessThan(org.joda.time.LocalDate theLongAndWindingTableAndColumnRefDate) {
        regTheLongAndWindingTableAndColumnRefDate(CK_LT,  theLongAndWindingTableAndColumnRefDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE: {NotNull, DATE(8)}
     * @param theLongAndWindingTableAndColumnRefDate The value of theLongAndWindingTableAndColumnRefDate as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTheLongAndWindingTableAndColumnRefDate_GreaterEqual(org.joda.time.LocalDate theLongAndWindingTableAndColumnRefDate) {
        regTheLongAndWindingTableAndColumnRefDate(CK_GE,  theLongAndWindingTableAndColumnRefDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE: {NotNull, DATE(8)}
     * @param theLongAndWindingTableAndColumnRefDate The value of theLongAndWindingTableAndColumnRefDate as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTheLongAndWindingTableAndColumnRefDate_LessEqual(org.joda.time.LocalDate theLongAndWindingTableAndColumnRefDate) {
        regTheLongAndWindingTableAndColumnRefDate(CK_LE, theLongAndWindingTableAndColumnRefDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE: {NotNull, DATE(8)}
     * <pre>e.g. setTheLongAndWindingTableAndColumnRefDate_FromTo(fromDate, toDate, new <span style="color: #DD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of theLongAndWindingTableAndColumnRefDate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of theLongAndWindingTableAndColumnRefDate. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setTheLongAndWindingTableAndColumnRefDate_FromTo(org.joda.time.LocalDate fromDatetime, org.joda.time.LocalDate toDatetime, FromToOption fromToOption) {
        regFTQ(toUtilDate(fromDatetime), toUtilDate(toDatetime), getCValueTheLongAndWindingTableAndColumnRefDate(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE: {NotNull, DATE(8)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #DD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of theLongAndWindingTableAndColumnRefDate. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of theLongAndWindingTableAndColumnRefDate. (NullAllowed: if null, no to-condition)
     */
    public void setTheLongAndWindingTableAndColumnRefDate_DateFromTo(org.joda.time.LocalDate fromDate, org.joda.time.LocalDate toDate) {
        setTheLongAndWindingTableAndColumnRefDate_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    protected void regTheLongAndWindingTableAndColumnRefDate(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTheLongAndWindingTableAndColumnRefDate(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE"); }
    protected abstract ConditionValue getCValueTheLongAndWindingTableAndColumnRefDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * SHORT_DATE: {NotNull, DATE(8)}
     * @param shortDate The value of shortDate as equal. (NullAllowed: if null, no condition)
     */
    public void setShortDate_Equal(org.joda.time.LocalDate shortDate) {
        regShortDate(CK_EQ,  shortDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * SHORT_DATE: {NotNull, DATE(8)}
     * @param shortDate The value of shortDate as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setShortDate_GreaterThan(org.joda.time.LocalDate shortDate) {
        regShortDate(CK_GT,  shortDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * SHORT_DATE: {NotNull, DATE(8)}
     * @param shortDate The value of shortDate as lessThan. (NullAllowed: if null, no condition)
     */
    public void setShortDate_LessThan(org.joda.time.LocalDate shortDate) {
        regShortDate(CK_LT,  shortDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * SHORT_DATE: {NotNull, DATE(8)}
     * @param shortDate The value of shortDate as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setShortDate_GreaterEqual(org.joda.time.LocalDate shortDate) {
        regShortDate(CK_GE,  shortDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * SHORT_DATE: {NotNull, DATE(8)}
     * @param shortDate The value of shortDate as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setShortDate_LessEqual(org.joda.time.LocalDate shortDate) {
        regShortDate(CK_LE, shortDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * SHORT_DATE: {NotNull, DATE(8)}
     * <pre>e.g. setShortDate_FromTo(fromDate, toDate, new <span style="color: #DD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of shortDate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of shortDate. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setShortDate_FromTo(org.joda.time.LocalDate fromDatetime, org.joda.time.LocalDate toDatetime, FromToOption fromToOption) {
        regFTQ(toUtilDate(fromDatetime), toUtilDate(toDatetime), getCValueShortDate(), "SHORT_DATE", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * SHORT_DATE: {NotNull, DATE(8)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #DD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of shortDate. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of shortDate. (NullAllowed: if null, no to-condition)
     */
    public void setShortDate_DateFromTo(org.joda.time.LocalDate fromDate, org.joda.time.LocalDate toDate) {
        setShortDate_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    protected void regShortDate(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueShortDate(), "SHORT_DATE"); }
    protected abstract ConditionValue getCValueShortDate();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;VendorTheLongAndWindingTableAndColumnRefCB&gt;() {
     *     public void query(VendorTheLongAndWindingTableAndColumnRefCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorTheLongAndWindingTableAndColumnRefCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, VendorTheLongAndWindingTableAndColumnRefCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;VendorTheLongAndWindingTableAndColumnRefCB&gt;() {
     *     public void query(VendorTheLongAndWindingTableAndColumnRefCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorTheLongAndWindingTableAndColumnRefCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, VendorTheLongAndWindingTableAndColumnRefCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;VendorTheLongAndWindingTableAndColumnRefCB&gt;() {
     *     public void query(VendorTheLongAndWindingTableAndColumnRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorTheLongAndWindingTableAndColumnRefCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, VendorTheLongAndWindingTableAndColumnRefCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;VendorTheLongAndWindingTableAndColumnRefCB&gt;() {
     *     public void query(VendorTheLongAndWindingTableAndColumnRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorTheLongAndWindingTableAndColumnRefCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, VendorTheLongAndWindingTableAndColumnRefCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;VendorTheLongAndWindingTableAndColumnRefCB&gt;() {
     *     public void query(VendorTheLongAndWindingTableAndColumnRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorTheLongAndWindingTableAndColumnRefCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, VendorTheLongAndWindingTableAndColumnRefCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;VendorTheLongAndWindingTableAndColumnRefCB&gt;() {
     *     public void query(VendorTheLongAndWindingTableAndColumnRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorTheLongAndWindingTableAndColumnRefCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, VendorTheLongAndWindingTableAndColumnRefCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        VendorTheLongAndWindingTableAndColumnRefCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(VendorTheLongAndWindingTableAndColumnRefCQ sq);

    protected VendorTheLongAndWindingTableAndColumnRefCB xcreateScalarConditionCB() {
        VendorTheLongAndWindingTableAndColumnRefCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected VendorTheLongAndWindingTableAndColumnRefCB xcreateScalarConditionPartitionByCB() {
        VendorTheLongAndWindingTableAndColumnRefCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<VendorTheLongAndWindingTableAndColumnRefCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorTheLongAndWindingTableAndColumnRefCB cb = new VendorTheLongAndWindingTableAndColumnRefCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(VendorTheLongAndWindingTableAndColumnRefCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<VendorTheLongAndWindingTableAndColumnRefCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(VendorTheLongAndWindingTableAndColumnRefCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorTheLongAndWindingTableAndColumnRefCB cb = new VendorTheLongAndWindingTableAndColumnRefCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(VendorTheLongAndWindingTableAndColumnRefCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<VendorTheLongAndWindingTableAndColumnRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorTheLongAndWindingTableAndColumnRefCB cb = new VendorTheLongAndWindingTableAndColumnRefCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(VendorTheLongAndWindingTableAndColumnRefCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<VendorTheLongAndWindingTableAndColumnRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorTheLongAndWindingTableAndColumnRefCB cb = new VendorTheLongAndWindingTableAndColumnRefCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(VendorTheLongAndWindingTableAndColumnRefCQ sq);

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
    protected VendorTheLongAndWindingTableAndColumnRefCB newMyCB() {
        return new VendorTheLongAndWindingTableAndColumnRefCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return VendorTheLongAndWindingTableAndColumnRefCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
