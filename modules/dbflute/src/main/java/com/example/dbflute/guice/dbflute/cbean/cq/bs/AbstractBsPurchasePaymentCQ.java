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
 * The abstract condition-query of PURCHASE_PAYMENT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsPurchasePaymentCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsPurchasePaymentCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "PURCHASE_PAYMENT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入支払ID)PURCHASE_PAYMENT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param purchasePaymentId The value of purchasePaymentId as equal. (NullAllowed: if null, no condition)
     */
    public void setPurchasePaymentId_Equal(Long purchasePaymentId) {
        doSetPurchasePaymentId_Equal(purchasePaymentId);
    }

    protected void doSetPurchasePaymentId_Equal(Long purchasePaymentId) {
        regPurchasePaymentId(CK_EQ, purchasePaymentId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入支払ID)PURCHASE_PAYMENT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param purchasePaymentId The value of purchasePaymentId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchasePaymentId_NotEqual(Long purchasePaymentId) {
        doSetPurchasePaymentId_NotEqual(purchasePaymentId);
    }

    protected void doSetPurchasePaymentId_NotEqual(Long purchasePaymentId) {
        regPurchasePaymentId(CK_NES, purchasePaymentId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入支払ID)PURCHASE_PAYMENT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param purchasePaymentId The value of purchasePaymentId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setPurchasePaymentId_GreaterThan(Long purchasePaymentId) {
        regPurchasePaymentId(CK_GT, purchasePaymentId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入支払ID)PURCHASE_PAYMENT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param purchasePaymentId The value of purchasePaymentId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setPurchasePaymentId_LessThan(Long purchasePaymentId) {
        regPurchasePaymentId(CK_LT, purchasePaymentId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入支払ID)PURCHASE_PAYMENT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param purchasePaymentId The value of purchasePaymentId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchasePaymentId_GreaterEqual(Long purchasePaymentId) {
        regPurchasePaymentId(CK_GE, purchasePaymentId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入支払ID)PURCHASE_PAYMENT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param purchasePaymentId The value of purchasePaymentId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchasePaymentId_LessEqual(Long purchasePaymentId) {
        regPurchasePaymentId(CK_LE, purchasePaymentId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (購入支払ID)PURCHASE_PAYMENT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of purchasePaymentId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of purchasePaymentId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPurchasePaymentId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValuePurchasePaymentId(), "PURCHASE_PAYMENT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (購入支払ID)PURCHASE_PAYMENT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param purchasePaymentIdList The collection of purchasePaymentId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchasePaymentId_InScope(Collection<Long> purchasePaymentIdList) {
        doSetPurchasePaymentId_InScope(purchasePaymentIdList);
    }

    protected void doSetPurchasePaymentId_InScope(Collection<Long> purchasePaymentIdList) {
        regINS(CK_INS, cTL(purchasePaymentIdList), getCValuePurchasePaymentId(), "PURCHASE_PAYMENT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (購入支払ID)PURCHASE_PAYMENT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param purchasePaymentIdList The collection of purchasePaymentId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchasePaymentId_NotInScope(Collection<Long> purchasePaymentIdList) {
        doSetPurchasePaymentId_NotInScope(purchasePaymentIdList);
    }

    protected void doSetPurchasePaymentId_NotInScope(Collection<Long> purchasePaymentIdList) {
        regINS(CK_NINS, cTL(purchasePaymentIdList), getCValuePurchasePaymentId(), "PURCHASE_PAYMENT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * (購入支払ID)PURCHASE_PAYMENT_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setPurchasePaymentId_IsNull() { regPurchasePaymentId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * (購入支払ID)PURCHASE_PAYMENT_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setPurchasePaymentId_IsNotNull() { regPurchasePaymentId(CK_ISNN, DOBJ); }

    protected void regPurchasePaymentId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValuePurchasePaymentId(), "PURCHASE_PAYMENT_ID"); }
    protected abstract ConditionValue getCValuePurchasePaymentId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入ID)PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to PURCHASE}
     * @param purchaseId The value of purchaseId as equal. (NullAllowed: if null, no condition)
     */
    public void setPurchaseId_Equal(Long purchaseId) {
        doSetPurchaseId_Equal(purchaseId);
    }

    protected void doSetPurchaseId_Equal(Long purchaseId) {
        regPurchaseId(CK_EQ, purchaseId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入ID)PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to PURCHASE}
     * @param purchaseId The value of purchaseId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchaseId_NotEqual(Long purchaseId) {
        doSetPurchaseId_NotEqual(purchaseId);
    }

    protected void doSetPurchaseId_NotEqual(Long purchaseId) {
        regPurchaseId(CK_NES, purchaseId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入ID)PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to PURCHASE}
     * @param purchaseId The value of purchaseId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setPurchaseId_GreaterThan(Long purchaseId) {
        regPurchaseId(CK_GT, purchaseId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入ID)PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to PURCHASE}
     * @param purchaseId The value of purchaseId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setPurchaseId_LessThan(Long purchaseId) {
        regPurchaseId(CK_LT, purchaseId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入ID)PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to PURCHASE}
     * @param purchaseId The value of purchaseId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchaseId_GreaterEqual(Long purchaseId) {
        regPurchaseId(CK_GE, purchaseId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入ID)PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to PURCHASE}
     * @param purchaseId The value of purchaseId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchaseId_LessEqual(Long purchaseId) {
        regPurchaseId(CK_LE, purchaseId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (購入ID)PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to PURCHASE}
     * @param minNumber The min number of purchaseId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of purchaseId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPurchaseId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValuePurchaseId(), "PURCHASE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (購入ID)PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to PURCHASE}
     * @param purchaseIdList The collection of purchaseId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseId_InScope(Collection<Long> purchaseIdList) {
        doSetPurchaseId_InScope(purchaseIdList);
    }

    protected void doSetPurchaseId_InScope(Collection<Long> purchaseIdList) {
        regINS(CK_INS, cTL(purchaseIdList), getCValuePurchaseId(), "PURCHASE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (購入ID)PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to PURCHASE}
     * @param purchaseIdList The collection of purchaseId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseId_NotInScope(Collection<Long> purchaseIdList) {
        doSetPurchaseId_NotInScope(purchaseIdList);
    }

    protected void doSetPurchaseId_NotInScope(Collection<Long> purchaseIdList) {
        regINS(CK_NINS, cTL(purchaseIdList), getCValuePurchaseId(), "PURCHASE_ID");
    }

    protected void regPurchaseId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValuePurchaseId(), "PURCHASE_ID"); }
    protected abstract ConditionValue getCValuePurchaseId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (支払金額)PAYMENT_AMOUNT: {NotNull, DECIMAL(10, 2)}
     * @param paymentAmount The value of paymentAmount as equal. (NullAllowed: if null, no condition)
     */
    public void setPaymentAmount_Equal(java.math.BigDecimal paymentAmount) {
        doSetPaymentAmount_Equal(paymentAmount);
    }

    protected void doSetPaymentAmount_Equal(java.math.BigDecimal paymentAmount) {
        regPaymentAmount(CK_EQ, paymentAmount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (支払金額)PAYMENT_AMOUNT: {NotNull, DECIMAL(10, 2)}
     * @param paymentAmount The value of paymentAmount as notEqual. (NullAllowed: if null, no condition)
     */
    public void setPaymentAmount_NotEqual(java.math.BigDecimal paymentAmount) {
        doSetPaymentAmount_NotEqual(paymentAmount);
    }

    protected void doSetPaymentAmount_NotEqual(java.math.BigDecimal paymentAmount) {
        regPaymentAmount(CK_NES, paymentAmount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (支払金額)PAYMENT_AMOUNT: {NotNull, DECIMAL(10, 2)}
     * @param paymentAmount The value of paymentAmount as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setPaymentAmount_GreaterThan(java.math.BigDecimal paymentAmount) {
        regPaymentAmount(CK_GT, paymentAmount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (支払金額)PAYMENT_AMOUNT: {NotNull, DECIMAL(10, 2)}
     * @param paymentAmount The value of paymentAmount as lessThan. (NullAllowed: if null, no condition)
     */
    public void setPaymentAmount_LessThan(java.math.BigDecimal paymentAmount) {
        regPaymentAmount(CK_LT, paymentAmount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (支払金額)PAYMENT_AMOUNT: {NotNull, DECIMAL(10, 2)}
     * @param paymentAmount The value of paymentAmount as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setPaymentAmount_GreaterEqual(java.math.BigDecimal paymentAmount) {
        regPaymentAmount(CK_GE, paymentAmount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (支払金額)PAYMENT_AMOUNT: {NotNull, DECIMAL(10, 2)}
     * @param paymentAmount The value of paymentAmount as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setPaymentAmount_LessEqual(java.math.BigDecimal paymentAmount) {
        regPaymentAmount(CK_LE, paymentAmount);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (支払金額)PAYMENT_AMOUNT: {NotNull, DECIMAL(10, 2)}
     * @param minNumber The min number of paymentAmount. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of paymentAmount. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPaymentAmount_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValuePaymentAmount(), "PAYMENT_AMOUNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (支払金額)PAYMENT_AMOUNT: {NotNull, DECIMAL(10, 2)}
     * @param paymentAmountList The collection of paymentAmount as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPaymentAmount_InScope(Collection<java.math.BigDecimal> paymentAmountList) {
        doSetPaymentAmount_InScope(paymentAmountList);
    }

    protected void doSetPaymentAmount_InScope(Collection<java.math.BigDecimal> paymentAmountList) {
        regINS(CK_INS, cTL(paymentAmountList), getCValuePaymentAmount(), "PAYMENT_AMOUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (支払金額)PAYMENT_AMOUNT: {NotNull, DECIMAL(10, 2)}
     * @param paymentAmountList The collection of paymentAmount as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPaymentAmount_NotInScope(Collection<java.math.BigDecimal> paymentAmountList) {
        doSetPaymentAmount_NotInScope(paymentAmountList);
    }

    protected void doSetPaymentAmount_NotInScope(Collection<java.math.BigDecimal> paymentAmountList) {
        regINS(CK_NINS, cTL(paymentAmountList), getCValuePaymentAmount(), "PAYMENT_AMOUNT");
    }

    protected void regPaymentAmount(ConditionKey ky, Object vl) { regQ(ky, vl, getCValuePaymentAmount(), "PAYMENT_AMOUNT"); }
    protected abstract ConditionValue getCValuePaymentAmount();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (支払日時)PAYMENT_DATETIME: {IX+, NotNull, TIMESTAMP(23, 10)}
     * @param paymentDatetime The value of paymentDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setPaymentDatetime_Equal(org.joda.time.LocalDateTime paymentDatetime) {
        regPaymentDatetime(CK_EQ,  paymentDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (支払日時)PAYMENT_DATETIME: {IX+, NotNull, TIMESTAMP(23, 10)}
     * @param paymentDatetime The value of paymentDatetime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setPaymentDatetime_GreaterThan(org.joda.time.LocalDateTime paymentDatetime) {
        regPaymentDatetime(CK_GT,  paymentDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (支払日時)PAYMENT_DATETIME: {IX+, NotNull, TIMESTAMP(23, 10)}
     * @param paymentDatetime The value of paymentDatetime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setPaymentDatetime_LessThan(org.joda.time.LocalDateTime paymentDatetime) {
        regPaymentDatetime(CK_LT,  paymentDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (支払日時)PAYMENT_DATETIME: {IX+, NotNull, TIMESTAMP(23, 10)}
     * @param paymentDatetime The value of paymentDatetime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setPaymentDatetime_GreaterEqual(org.joda.time.LocalDateTime paymentDatetime) {
        regPaymentDatetime(CK_GE,  paymentDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (支払日時)PAYMENT_DATETIME: {IX+, NotNull, TIMESTAMP(23, 10)}
     * @param paymentDatetime The value of paymentDatetime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setPaymentDatetime_LessEqual(org.joda.time.LocalDateTime paymentDatetime) {
        regPaymentDatetime(CK_LE, paymentDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (支払日時)PAYMENT_DATETIME: {IX+, NotNull, TIMESTAMP(23, 10)}
     * <pre>e.g. setPaymentDatetime_FromTo(fromDate, toDate, new <span style="color: #DD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of paymentDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of paymentDatetime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setPaymentDatetime_FromTo(org.joda.time.LocalDateTime fromDatetime, org.joda.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        regFTQ(toTimestamp(fromDatetime), toTimestamp(toDatetime), getCValuePaymentDatetime(), "PAYMENT_DATETIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (支払日時)PAYMENT_DATETIME: {IX+, NotNull, TIMESTAMP(23, 10)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #DD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of paymentDatetime. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of paymentDatetime. (NullAllowed: if null, no to-condition)
     */
    public void setPaymentDatetime_DateFromTo(org.joda.time.LocalDateTime fromDate, org.joda.time.LocalDateTime toDate) {
        setPaymentDatetime_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    protected void regPaymentDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, getCValuePaymentDatetime(), "PAYMENT_DATETIME"); }
    protected abstract ConditionValue getCValuePaymentDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (支払方法コード)PAYMENT_METHOD_CODE: {NotNull, CHAR(3), classification=PaymentMethod}
     * @param paymentMethodCode The value of paymentMethodCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    protected void setPaymentMethodCode_Equal(String paymentMethodCode) {
        doSetPaymentMethodCode_Equal(fRES(paymentMethodCode));
    }

    /**
     * Equal(=). As PaymentMethod. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (支払方法コード)PAYMENT_METHOD_CODE: {NotNull, CHAR(3), classification=PaymentMethod} <br />
     * method of payment for purchase
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setPaymentMethodCode_Equal_AsPaymentMethod(CDef.PaymentMethod cdef) {
        doSetPaymentMethodCode_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As ByHand (HAN). And OnlyOnceRegistered. <br />
     * by hand: payment by hand, face-to-face
     */
    public void setPaymentMethodCode_Equal_ByHand() {
        setPaymentMethodCode_Equal_AsPaymentMethod(CDef.PaymentMethod.ByHand);
    }

    /**
     * Equal(=). As BankTransfer (BAK). And OnlyOnceRegistered. <br />
     * bank transfer: bank transfer payment
     */
    public void setPaymentMethodCode_Equal_BankTransfer() {
        setPaymentMethodCode_Equal_AsPaymentMethod(CDef.PaymentMethod.BankTransfer);
    }

    /**
     * Equal(=). As CreditCard (CRC). And OnlyOnceRegistered. <br />
     * credit card: credit card payment
     */
    public void setPaymentMethodCode_Equal_CreditCard() {
        setPaymentMethodCode_Equal_AsPaymentMethod(CDef.PaymentMethod.CreditCard);
    }

    protected void doSetPaymentMethodCode_Equal(String paymentMethodCode) {
        regPaymentMethodCode(CK_EQ, hSC("PAYMENT_METHOD_CODE", paymentMethodCode, 3, "E"));
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (支払方法コード)PAYMENT_METHOD_CODE: {NotNull, CHAR(3), classification=PaymentMethod}
     * @param paymentMethodCode The value of paymentMethodCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    protected void setPaymentMethodCode_NotEqual(String paymentMethodCode) {
        doSetPaymentMethodCode_NotEqual(fRES(paymentMethodCode));
    }

    /**
     * NotEqual(&lt;&gt;). As PaymentMethod. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (支払方法コード)PAYMENT_METHOD_CODE: {NotNull, CHAR(3), classification=PaymentMethod} <br />
     * method of payment for purchase
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setPaymentMethodCode_NotEqual_AsPaymentMethod(CDef.PaymentMethod cdef) {
        doSetPaymentMethodCode_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As ByHand (HAN). And OnlyOnceRegistered. <br />
     * by hand: payment by hand, face-to-face
     */
    public void setPaymentMethodCode_NotEqual_ByHand() {
        setPaymentMethodCode_NotEqual_AsPaymentMethod(CDef.PaymentMethod.ByHand);
    }

    /**
     * NotEqual(&lt;&gt;). As BankTransfer (BAK). And OnlyOnceRegistered. <br />
     * bank transfer: bank transfer payment
     */
    public void setPaymentMethodCode_NotEqual_BankTransfer() {
        setPaymentMethodCode_NotEqual_AsPaymentMethod(CDef.PaymentMethod.BankTransfer);
    }

    /**
     * NotEqual(&lt;&gt;). As CreditCard (CRC). And OnlyOnceRegistered. <br />
     * credit card: credit card payment
     */
    public void setPaymentMethodCode_NotEqual_CreditCard() {
        setPaymentMethodCode_NotEqual_AsPaymentMethod(CDef.PaymentMethod.CreditCard);
    }

    protected void doSetPaymentMethodCode_NotEqual(String paymentMethodCode) {
        regPaymentMethodCode(CK_NES, hSC("PAYMENT_METHOD_CODE", paymentMethodCode, 3, "E"));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (支払方法コード)PAYMENT_METHOD_CODE: {NotNull, CHAR(3), classification=PaymentMethod}
     * @param paymentMethodCodeList The collection of paymentMethodCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPaymentMethodCode_InScope(Collection<String> paymentMethodCodeList) {
        doSetPaymentMethodCode_InScope(paymentMethodCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As PaymentMethod. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (支払方法コード)PAYMENT_METHOD_CODE: {NotNull, CHAR(3), classification=PaymentMethod} <br />
     * method of payment for purchase
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setPaymentMethodCode_InScope_AsPaymentMethod(Collection<CDef.PaymentMethod> cdefList) {
        doSetPaymentMethodCode_InScope(cTStrL(cdefList));
    }

    /**
     * InScope {in ('a', 'b')}. As PaymentMethod. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * method of payment for purchase <br />
     * the most recommended method <br />
     * The group elements:[ByHand]
     */
    public void setPaymentMethodCode_InScope_Recommended() {
        setPaymentMethodCode_InScope_AsPaymentMethod(CDef.PaymentMethod.listOfRecommended());
    }

    public void doSetPaymentMethodCode_InScope(Collection<String> paymentMethodCodeList) {
        regINS(CK_INS, cTL(paymentMethodCodeList), getCValuePaymentMethodCode(), "PAYMENT_METHOD_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (支払方法コード)PAYMENT_METHOD_CODE: {NotNull, CHAR(3), classification=PaymentMethod}
     * @param paymentMethodCodeList The collection of paymentMethodCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPaymentMethodCode_NotInScope(Collection<String> paymentMethodCodeList) {
        doSetPaymentMethodCode_NotInScope(paymentMethodCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As PaymentMethod. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (支払方法コード)PAYMENT_METHOD_CODE: {NotNull, CHAR(3), classification=PaymentMethod} <br />
     * method of payment for purchase
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setPaymentMethodCode_NotInScope_AsPaymentMethod(Collection<CDef.PaymentMethod> cdefList) {
        doSetPaymentMethodCode_NotInScope(cTStrL(cdefList));
    }

    public void doSetPaymentMethodCode_NotInScope(Collection<String> paymentMethodCodeList) {
        regINS(CK_NINS, cTL(paymentMethodCodeList), getCValuePaymentMethodCode(), "PAYMENT_METHOD_CODE");
    }

    protected void regPaymentMethodCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValuePaymentMethodCode(), "PAYMENT_METHOD_CODE"); }
    protected abstract ConditionValue getCValuePaymentMethodCode();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @param registerDatetime The value of registerDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setRegisterDatetime_Equal(org.joda.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_EQ,  registerDatetime);
    }

    protected void regRegisterDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRegisterDatetime(), "REGISTER_DATETIME"); }
    protected abstract ConditionValue getCValueRegisterDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REGISTER_USER: {NotNull, VARCHAR(200)}
     * @param registerUser The value of registerUser as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_Equal(String registerUser) {
        doSetRegisterUser_Equal(fRES(registerUser));
    }

    protected void doSetRegisterUser_Equal(String registerUser) {
        regRegisterUser(CK_EQ, registerUser);
    }

    protected void regRegisterUser(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRegisterUser(), "REGISTER_USER"); }
    protected abstract ConditionValue getCValueRegisterUser();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @param updateDatetime The value of updateDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setUpdateDatetime_Equal(org.joda.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_EQ,  updateDatetime);
    }

    protected void regUpdateDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueUpdateDatetime(), "UPDATE_DATETIME"); }
    protected abstract ConditionValue getCValueUpdateDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * UPDATE_USER: {NotNull, VARCHAR(200)}
     * @param updateUser The value of updateUser as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_Equal(String updateUser) {
        doSetUpdateUser_Equal(fRES(updateUser));
    }

    protected void doSetUpdateUser_Equal(String updateUser) {
        regUpdateUser(CK_EQ, updateUser);
    }

    protected void regUpdateUser(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueUpdateUser(), "UPDATE_USER"); }
    protected abstract ConditionValue getCValueUpdateUser();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;PurchasePaymentCB&gt;() {
     *     public void query(PurchasePaymentCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<PurchasePaymentCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, PurchasePaymentCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;PurchasePaymentCB&gt;() {
     *     public void query(PurchasePaymentCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<PurchasePaymentCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, PurchasePaymentCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;PurchasePaymentCB&gt;() {
     *     public void query(PurchasePaymentCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<PurchasePaymentCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, PurchasePaymentCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;PurchasePaymentCB&gt;() {
     *     public void query(PurchasePaymentCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<PurchasePaymentCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, PurchasePaymentCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;PurchasePaymentCB&gt;() {
     *     public void query(PurchasePaymentCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<PurchasePaymentCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, PurchasePaymentCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;PurchasePaymentCB&gt;() {
     *     public void query(PurchasePaymentCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<PurchasePaymentCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, PurchasePaymentCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        PurchasePaymentCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(PurchasePaymentCQ sq);

    protected PurchasePaymentCB xcreateScalarConditionCB() {
        PurchasePaymentCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected PurchasePaymentCB xcreateScalarConditionPartitionByCB() {
        PurchasePaymentCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<PurchasePaymentCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PurchasePaymentCB cb = new PurchasePaymentCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "PURCHASE_PAYMENT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(PurchasePaymentCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<PurchasePaymentCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(PurchasePaymentCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PurchasePaymentCB cb = new PurchasePaymentCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PURCHASE_PAYMENT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(PurchasePaymentCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<PurchasePaymentCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        PurchasePaymentCB cb = new PurchasePaymentCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(PurchasePaymentCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<PurchasePaymentCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        PurchasePaymentCB cb = new PurchasePaymentCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(PurchasePaymentCQ sq);

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
    protected PurchasePaymentCB newMyCB() {
        return new PurchasePaymentCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return PurchasePaymentCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
