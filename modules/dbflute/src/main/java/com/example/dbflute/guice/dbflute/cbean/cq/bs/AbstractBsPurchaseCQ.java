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
 * The abstract condition-query of PURCHASE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsPurchaseCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsPurchaseCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "PURCHASE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)}
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
     * PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)}
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
     * PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param purchaseId The value of purchaseId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setPurchaseId_GreaterThan(Long purchaseId) {
        regPurchaseId(CK_GT, purchaseId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param purchaseId The value of purchaseId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setPurchaseId_LessThan(Long purchaseId) {
        regPurchaseId(CK_LT, purchaseId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param purchaseId The value of purchaseId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchaseId_GreaterEqual(Long purchaseId) {
        regPurchaseId(CK_GE, purchaseId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param purchaseId The value of purchaseId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchaseId_LessEqual(Long purchaseId) {
        regPurchaseId(CK_LE, purchaseId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of purchaseId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of purchaseId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPurchaseId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValuePurchaseId(), "PURCHASE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)}
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
     * PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param purchaseIdList The collection of purchaseId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseId_NotInScope(Collection<Long> purchaseIdList) {
        doSetPurchaseId_NotInScope(purchaseIdList);
    }

    protected void doSetPurchaseId_NotInScope(Collection<Long> purchaseIdList) {
        regINS(CK_NINS, cTL(purchaseIdList), getCValuePurchaseId(), "PURCHASE_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select PURCHASE_ID from PURCHASE_PAYMENT where ...)} <br />
     * (購入支払)PURCHASE_PAYMENT by PURCHASE_ID, named 'purchasePaymentAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsPurchasePayment</span>(new SubQuery&lt;PurchasePaymentCB&gt;() {
     *     public void query(PurchasePaymentCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of PurchasePaymentList for 'exists'. (NotNull)
     */
    public void existsPurchasePayment(SubQuery<PurchasePaymentCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        PurchasePaymentCB cb = new PurchasePaymentCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepPurchaseId_ExistsReferrer_PurchasePaymentList(cb.query());
        registerExistsReferrer(cb.query(), "PURCHASE_ID", "PURCHASE_ID", pp, "purchasePaymentList");
    }
    public abstract String keepPurchaseId_ExistsReferrer_PurchasePaymentList(PurchasePaymentCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select PURCHASE_ID from PURCHASE_PAYMENT where ...)} <br />
     * (購入支払)PURCHASE_PAYMENT by PURCHASE_ID, named 'purchasePaymentAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsPurchasePayment</span>(new SubQuery&lt;PurchasePaymentCB&gt;() {
     *     public void query(PurchasePaymentCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of PurchaseId_NotExistsReferrer_PurchasePaymentList for 'not exists'. (NotNull)
     */
    public void notExistsPurchasePayment(SubQuery<PurchasePaymentCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        PurchasePaymentCB cb = new PurchasePaymentCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepPurchaseId_NotExistsReferrer_PurchasePaymentList(cb.query());
        registerNotExistsReferrer(cb.query(), "PURCHASE_ID", "PURCHASE_ID", pp, "purchasePaymentList");
    }
    public abstract String keepPurchaseId_NotExistsReferrer_PurchasePaymentList(PurchasePaymentCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PURCHASE_ID from PURCHASE_PAYMENT where ...)} <br />
     * (購入支払)PURCHASE_PAYMENT by PURCHASE_ID, named 'purchasePaymentAsOne'.
     * @param subQuery The sub-query of PurchasePaymentList for 'in-scope'. (NotNull)
     */
    public void inScopePurchasePaymentList(SubQuery<PurchasePaymentCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        PurchasePaymentCB cb = new PurchasePaymentCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepPurchaseId_InScopeRelation_PurchasePaymentList(cb.query());
        registerInScopeRelation(cb.query(), "PURCHASE_ID", "PURCHASE_ID", pp, "purchasePaymentList");
    }
    public abstract String keepPurchaseId_InScopeRelation_PurchasePaymentList(PurchasePaymentCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PURCHASE_ID from PURCHASE_PAYMENT where ...)} <br />
     * (購入支払)PURCHASE_PAYMENT by PURCHASE_ID, named 'purchasePaymentAsOne'.
     * @param subQuery The sub-query of PurchasePaymentList for 'not in-scope'. (NotNull)
     */
    public void notInScopePurchasePaymentList(SubQuery<PurchasePaymentCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        PurchasePaymentCB cb = new PurchasePaymentCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepPurchaseId_NotInScopeRelation_PurchasePaymentList(cb.query());
        registerNotInScopeRelation(cb.query(), "PURCHASE_ID", "PURCHASE_ID", pp, "purchasePaymentList");
    }
    public abstract String keepPurchaseId_NotInScopeRelation_PurchasePaymentList(PurchasePaymentCQ sq);

    public void xsderivePurchasePaymentList(String fn, SubQuery<PurchasePaymentCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PurchasePaymentCB cb = new PurchasePaymentCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepPurchaseId_SpecifyDerivedReferrer_PurchasePaymentList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PURCHASE_ID", "PURCHASE_ID", pp, "purchasePaymentList", al, op);
    }
    public abstract String keepPurchaseId_SpecifyDerivedReferrer_PurchasePaymentList(PurchasePaymentCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from PURCHASE_PAYMENT where ...)} <br />
     * (購入支払)PURCHASE_PAYMENT by PURCHASE_ID, named 'purchasePaymentAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedPurchasePayment()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;PurchasePaymentCB&gt;() {
     *     public void query(PurchasePaymentCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<PurchasePaymentCB> derivedPurchasePayment() {
        return xcreateQDRFunctionPurchasePaymentList();
    }
    protected HpQDRFunction<PurchasePaymentCB> xcreateQDRFunctionPurchasePaymentList() {
        return new HpQDRFunction<PurchasePaymentCB>(new HpQDRSetupper<PurchasePaymentCB>() {
            public void setup(String fn, SubQuery<PurchasePaymentCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderivePurchasePaymentList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderivePurchasePaymentList(String fn, SubQuery<PurchasePaymentCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PurchasePaymentCB cb = new PurchasePaymentCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepPurchaseId_QueryDerivedReferrer_PurchasePaymentList(cb.query()); String prpp = keepPurchaseId_QueryDerivedReferrer_PurchasePaymentListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PURCHASE_ID", "PURCHASE_ID", sqpp, "purchasePaymentList", rd, vl, prpp, op);
    }
    public abstract String keepPurchaseId_QueryDerivedReferrer_PurchasePaymentList(PurchasePaymentCQ sq);
    public abstract String keepPurchaseId_QueryDerivedReferrer_PurchasePaymentListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setPurchaseId_IsNull() { regPurchaseId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setPurchaseId_IsNotNull() { regPurchaseId(CK_ISNN, DOBJ); }

    protected void regPurchaseId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValuePurchaseId(), "PURCHASE_ID"); }
    protected abstract ConditionValue getCValuePurchaseId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as equal. (NullAllowed: if null, no condition)
     */
    public void setMemberId_Equal(Integer memberId) {
        doSetMemberId_Equal(memberId);
    }

    protected void doSetMemberId_Equal(Integer memberId) {
        regMemberId(CK_EQ, memberId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberId_NotEqual(Integer memberId) {
        doSetMemberId_NotEqual(memberId);
    }

    protected void doSetMemberId_NotEqual(Integer memberId) {
        regMemberId(CK_NES, memberId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMemberId_GreaterThan(Integer memberId) {
        regMemberId(CK_GT, memberId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMemberId_LessThan(Integer memberId) {
        regMemberId(CK_LT, memberId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberId_GreaterEqual(Integer memberId) {
        regMemberId(CK_GE, memberId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberId_LessEqual(Integer memberId) {
        regMemberId(CK_LE, memberId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param minNumber The min number of memberId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of memberId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMemberId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueMemberId(), "MEMBER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberIdList The collection of memberId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberId_InScope(Collection<Integer> memberIdList) {
        doSetMemberId_InScope(memberIdList);
    }

    protected void doSetMemberId_InScope(Collection<Integer> memberIdList) {
        regINS(CK_INS, cTL(memberIdList), getCValueMemberId(), "MEMBER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberIdList The collection of memberId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberId_NotInScope(Collection<Integer> memberIdList) {
        doSetMemberId_NotInScope(memberIdList);
    }

    protected void doSetMemberId_NotInScope(Collection<Integer> memberIdList) {
        regINS(CK_NINS, cTL(memberIdList), getCValueMemberId(), "MEMBER_ID");
    }

    protected void regMemberId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMemberId(), "MEMBER_ID"); }
    protected abstract ConditionValue getCValueMemberId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (商品ID)PRODUCT_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to PRODUCT}
     * @param productId The value of productId as equal. (NullAllowed: if null, no condition)
     */
    public void setProductId_Equal(Integer productId) {
        doSetProductId_Equal(productId);
    }

    protected void doSetProductId_Equal(Integer productId) {
        regProductId(CK_EQ, productId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (商品ID)PRODUCT_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to PRODUCT}
     * @param productId The value of productId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setProductId_NotEqual(Integer productId) {
        doSetProductId_NotEqual(productId);
    }

    protected void doSetProductId_NotEqual(Integer productId) {
        regProductId(CK_NES, productId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (商品ID)PRODUCT_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to PRODUCT}
     * @param productId The value of productId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setProductId_GreaterThan(Integer productId) {
        regProductId(CK_GT, productId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (商品ID)PRODUCT_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to PRODUCT}
     * @param productId The value of productId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setProductId_LessThan(Integer productId) {
        regProductId(CK_LT, productId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (商品ID)PRODUCT_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to PRODUCT}
     * @param productId The value of productId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setProductId_GreaterEqual(Integer productId) {
        regProductId(CK_GE, productId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (商品ID)PRODUCT_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to PRODUCT}
     * @param productId The value of productId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setProductId_LessEqual(Integer productId) {
        regProductId(CK_LE, productId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (商品ID)PRODUCT_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to PRODUCT}
     * @param minNumber The min number of productId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of productId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProductId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueProductId(), "PRODUCT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (商品ID)PRODUCT_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to PRODUCT}
     * @param productIdList The collection of productId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductId_InScope(Collection<Integer> productIdList) {
        doSetProductId_InScope(productIdList);
    }

    protected void doSetProductId_InScope(Collection<Integer> productIdList) {
        regINS(CK_INS, cTL(productIdList), getCValueProductId(), "PRODUCT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (商品ID)PRODUCT_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to PRODUCT}
     * @param productIdList The collection of productId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductId_NotInScope(Collection<Integer> productIdList) {
        doSetProductId_NotInScope(productIdList);
    }

    protected void doSetProductId_NotInScope(Collection<Integer> productIdList) {
        regINS(CK_NINS, cTL(productIdList), getCValueProductId(), "PRODUCT_ID");
    }

    protected void regProductId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueProductId(), "PRODUCT_ID"); }
    protected abstract ConditionValue getCValueProductId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入日時)PURCHASE_DATETIME: {+UQ, IX+, NotNull, TIMESTAMP(23, 10)}
     * @param purchaseDatetime The value of purchaseDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setPurchaseDatetime_Equal(org.joda.time.LocalDateTime purchaseDatetime) {
        regPurchaseDatetime(CK_EQ,  purchaseDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入日時)PURCHASE_DATETIME: {+UQ, IX+, NotNull, TIMESTAMP(23, 10)}
     * @param purchaseDatetime The value of purchaseDatetime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setPurchaseDatetime_GreaterThan(org.joda.time.LocalDateTime purchaseDatetime) {
        regPurchaseDatetime(CK_GT,  purchaseDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入日時)PURCHASE_DATETIME: {+UQ, IX+, NotNull, TIMESTAMP(23, 10)}
     * @param purchaseDatetime The value of purchaseDatetime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setPurchaseDatetime_LessThan(org.joda.time.LocalDateTime purchaseDatetime) {
        regPurchaseDatetime(CK_LT,  purchaseDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入日時)PURCHASE_DATETIME: {+UQ, IX+, NotNull, TIMESTAMP(23, 10)}
     * @param purchaseDatetime The value of purchaseDatetime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchaseDatetime_GreaterEqual(org.joda.time.LocalDateTime purchaseDatetime) {
        regPurchaseDatetime(CK_GE,  purchaseDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入日時)PURCHASE_DATETIME: {+UQ, IX+, NotNull, TIMESTAMP(23, 10)}
     * @param purchaseDatetime The value of purchaseDatetime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchaseDatetime_LessEqual(org.joda.time.LocalDateTime purchaseDatetime) {
        regPurchaseDatetime(CK_LE, purchaseDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (購入日時)PURCHASE_DATETIME: {+UQ, IX+, NotNull, TIMESTAMP(23, 10)}
     * <pre>e.g. setPurchaseDatetime_FromTo(fromDate, toDate, new <span style="color: #DD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of purchaseDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of purchaseDatetime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setPurchaseDatetime_FromTo(org.joda.time.LocalDateTime fromDatetime, org.joda.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        regFTQ(toTimestamp(fromDatetime), toTimestamp(toDatetime), getCValuePurchaseDatetime(), "PURCHASE_DATETIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (購入日時)PURCHASE_DATETIME: {+UQ, IX+, NotNull, TIMESTAMP(23, 10)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #DD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of purchaseDatetime. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of purchaseDatetime. (NullAllowed: if null, no to-condition)
     */
    public void setPurchaseDatetime_DateFromTo(org.joda.time.LocalDateTime fromDate, org.joda.time.LocalDateTime toDate) {
        setPurchaseDatetime_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    protected void regPurchaseDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, getCValuePurchaseDatetime(), "PURCHASE_DATETIME"); }
    protected abstract ConditionValue getCValuePurchaseDatetime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入数量)PURCHASE_COUNT: {NotNull, INTEGER(10)}
     * @param purchaseCount The value of purchaseCount as equal. (NullAllowed: if null, no condition)
     */
    public void setPurchaseCount_Equal(Integer purchaseCount) {
        doSetPurchaseCount_Equal(purchaseCount);
    }

    protected void doSetPurchaseCount_Equal(Integer purchaseCount) {
        regPurchaseCount(CK_EQ, purchaseCount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入数量)PURCHASE_COUNT: {NotNull, INTEGER(10)}
     * @param purchaseCount The value of purchaseCount as notEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchaseCount_NotEqual(Integer purchaseCount) {
        doSetPurchaseCount_NotEqual(purchaseCount);
    }

    protected void doSetPurchaseCount_NotEqual(Integer purchaseCount) {
        regPurchaseCount(CK_NES, purchaseCount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入数量)PURCHASE_COUNT: {NotNull, INTEGER(10)}
     * @param purchaseCount The value of purchaseCount as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setPurchaseCount_GreaterThan(Integer purchaseCount) {
        regPurchaseCount(CK_GT, purchaseCount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入数量)PURCHASE_COUNT: {NotNull, INTEGER(10)}
     * @param purchaseCount The value of purchaseCount as lessThan. (NullAllowed: if null, no condition)
     */
    public void setPurchaseCount_LessThan(Integer purchaseCount) {
        regPurchaseCount(CK_LT, purchaseCount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入数量)PURCHASE_COUNT: {NotNull, INTEGER(10)}
     * @param purchaseCount The value of purchaseCount as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchaseCount_GreaterEqual(Integer purchaseCount) {
        regPurchaseCount(CK_GE, purchaseCount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入数量)PURCHASE_COUNT: {NotNull, INTEGER(10)}
     * @param purchaseCount The value of purchaseCount as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchaseCount_LessEqual(Integer purchaseCount) {
        regPurchaseCount(CK_LE, purchaseCount);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (購入数量)PURCHASE_COUNT: {NotNull, INTEGER(10)}
     * @param minNumber The min number of purchaseCount. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of purchaseCount. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPurchaseCount_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValuePurchaseCount(), "PURCHASE_COUNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (購入数量)PURCHASE_COUNT: {NotNull, INTEGER(10)}
     * @param purchaseCountList The collection of purchaseCount as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseCount_InScope(Collection<Integer> purchaseCountList) {
        doSetPurchaseCount_InScope(purchaseCountList);
    }

    protected void doSetPurchaseCount_InScope(Collection<Integer> purchaseCountList) {
        regINS(CK_INS, cTL(purchaseCountList), getCValuePurchaseCount(), "PURCHASE_COUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (購入数量)PURCHASE_COUNT: {NotNull, INTEGER(10)}
     * @param purchaseCountList The collection of purchaseCount as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseCount_NotInScope(Collection<Integer> purchaseCountList) {
        doSetPurchaseCount_NotInScope(purchaseCountList);
    }

    protected void doSetPurchaseCount_NotInScope(Collection<Integer> purchaseCountList) {
        regINS(CK_NINS, cTL(purchaseCountList), getCValuePurchaseCount(), "PURCHASE_COUNT");
    }

    protected void regPurchaseCount(ConditionKey ky, Object vl) { regQ(ky, vl, getCValuePurchaseCount(), "PURCHASE_COUNT"); }
    protected abstract ConditionValue getCValuePurchaseCount();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入価格)PURCHASE_PRICE: {IX, NotNull, INTEGER(10)}
     * @param purchasePrice The value of purchasePrice as equal. (NullAllowed: if null, no condition)
     */
    public void setPurchasePrice_Equal(Integer purchasePrice) {
        doSetPurchasePrice_Equal(purchasePrice);
    }

    protected void doSetPurchasePrice_Equal(Integer purchasePrice) {
        regPurchasePrice(CK_EQ, purchasePrice);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入価格)PURCHASE_PRICE: {IX, NotNull, INTEGER(10)}
     * @param purchasePrice The value of purchasePrice as notEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchasePrice_NotEqual(Integer purchasePrice) {
        doSetPurchasePrice_NotEqual(purchasePrice);
    }

    protected void doSetPurchasePrice_NotEqual(Integer purchasePrice) {
        regPurchasePrice(CK_NES, purchasePrice);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入価格)PURCHASE_PRICE: {IX, NotNull, INTEGER(10)}
     * @param purchasePrice The value of purchasePrice as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setPurchasePrice_GreaterThan(Integer purchasePrice) {
        regPurchasePrice(CK_GT, purchasePrice);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入価格)PURCHASE_PRICE: {IX, NotNull, INTEGER(10)}
     * @param purchasePrice The value of purchasePrice as lessThan. (NullAllowed: if null, no condition)
     */
    public void setPurchasePrice_LessThan(Integer purchasePrice) {
        regPurchasePrice(CK_LT, purchasePrice);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入価格)PURCHASE_PRICE: {IX, NotNull, INTEGER(10)}
     * @param purchasePrice The value of purchasePrice as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchasePrice_GreaterEqual(Integer purchasePrice) {
        regPurchasePrice(CK_GE, purchasePrice);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入価格)PURCHASE_PRICE: {IX, NotNull, INTEGER(10)}
     * @param purchasePrice The value of purchasePrice as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchasePrice_LessEqual(Integer purchasePrice) {
        regPurchasePrice(CK_LE, purchasePrice);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (購入価格)PURCHASE_PRICE: {IX, NotNull, INTEGER(10)}
     * @param minNumber The min number of purchasePrice. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of purchasePrice. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPurchasePrice_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValuePurchasePrice(), "PURCHASE_PRICE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (購入価格)PURCHASE_PRICE: {IX, NotNull, INTEGER(10)}
     * @param purchasePriceList The collection of purchasePrice as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchasePrice_InScope(Collection<Integer> purchasePriceList) {
        doSetPurchasePrice_InScope(purchasePriceList);
    }

    protected void doSetPurchasePrice_InScope(Collection<Integer> purchasePriceList) {
        regINS(CK_INS, cTL(purchasePriceList), getCValuePurchasePrice(), "PURCHASE_PRICE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (購入価格)PURCHASE_PRICE: {IX, NotNull, INTEGER(10)}
     * @param purchasePriceList The collection of purchasePrice as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchasePrice_NotInScope(Collection<Integer> purchasePriceList) {
        doSetPurchasePrice_NotInScope(purchasePriceList);
    }

    protected void doSetPurchasePrice_NotInScope(Collection<Integer> purchasePriceList) {
        regINS(CK_NINS, cTL(purchasePriceList), getCValuePurchasePrice(), "PURCHASE_PRICE");
    }

    protected void regPurchasePrice(ConditionKey ky, Object vl) { regQ(ky, vl, getCValuePurchasePrice(), "PURCHASE_PRICE"); }
    protected abstract ConditionValue getCValuePurchasePrice();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(10), classification=Flg}
     * @param paymentCompleteFlg The value of paymentCompleteFlg as equal. (NullAllowed: if null, no condition)
     */
    protected void setPaymentCompleteFlg_Equal(Integer paymentCompleteFlg) {
        doSetPaymentCompleteFlg_Equal(paymentCompleteFlg);
    }

    /**
     * Equal(=). As Flg. And NullIgnored, OnlyOnceRegistered. <br />
     * (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setPaymentCompleteFlg_Equal_AsFlg(CDef.Flg cdef) {
        doSetPaymentCompleteFlg_Equal(cTNum(cdef != null ? cdef.code() : null, Integer.class));
    }

    /**
     * Equal(=). As True (1). And NullIgnored, OnlyOnceRegistered. <br />
     * Yes: means valid
     */
    public void setPaymentCompleteFlg_Equal_True() {
        setPaymentCompleteFlg_Equal_AsFlg(CDef.Flg.True);
    }

    /**
     * Equal(=). As False (0). And NullIgnored, OnlyOnceRegistered. <br />
     * No: means invalid
     */
    public void setPaymentCompleteFlg_Equal_False() {
        setPaymentCompleteFlg_Equal_AsFlg(CDef.Flg.False);
    }

    protected void doSetPaymentCompleteFlg_Equal(Integer paymentCompleteFlg) {
        regPaymentCompleteFlg(CK_EQ, paymentCompleteFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(10), classification=Flg}
     * @param paymentCompleteFlg The value of paymentCompleteFlg as notEqual. (NullAllowed: if null, no condition)
     */
    protected void setPaymentCompleteFlg_NotEqual(Integer paymentCompleteFlg) {
        doSetPaymentCompleteFlg_NotEqual(paymentCompleteFlg);
    }

    /**
     * NotEqual(&lt;&gt;). As Flg. And NullIgnored, OnlyOnceRegistered. <br />
     * (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setPaymentCompleteFlg_NotEqual_AsFlg(CDef.Flg cdef) {
        doSetPaymentCompleteFlg_NotEqual(cTNum(cdef != null ? cdef.code() : null, Integer.class));
    }

    /**
     * NotEqual(&lt;&gt;). As True (1). And NullIgnored, OnlyOnceRegistered. <br />
     * Yes: means valid
     */
    public void setPaymentCompleteFlg_NotEqual_True() {
        setPaymentCompleteFlg_NotEqual_AsFlg(CDef.Flg.True);
    }

    /**
     * NotEqual(&lt;&gt;). As False (0). And NullIgnored, OnlyOnceRegistered. <br />
     * No: means invalid
     */
    public void setPaymentCompleteFlg_NotEqual_False() {
        setPaymentCompleteFlg_NotEqual_AsFlg(CDef.Flg.False);
    }

    protected void doSetPaymentCompleteFlg_NotEqual(Integer paymentCompleteFlg) {
        regPaymentCompleteFlg(CK_NES, paymentCompleteFlg);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(10), classification=Flg}
     * @param paymentCompleteFlgList The collection of paymentCompleteFlg as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPaymentCompleteFlg_InScope(Collection<Integer> paymentCompleteFlgList) {
        doSetPaymentCompleteFlg_InScope(paymentCompleteFlgList);
    }

    /**
     * InScope {in (1, 2)}. As Flg. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * general boolean classification for every flg-column
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setPaymentCompleteFlg_InScope_AsFlg(Collection<CDef.Flg> cdefList) {
        doSetPaymentCompleteFlg_InScope(cTNumL(cdefList, Integer.class));
    }

    protected void doSetPaymentCompleteFlg_InScope(Collection<Integer> paymentCompleteFlgList) {
        regINS(CK_INS, cTL(paymentCompleteFlgList), getCValuePaymentCompleteFlg(), "PAYMENT_COMPLETE_FLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(10), classification=Flg}
     * @param paymentCompleteFlgList The collection of paymentCompleteFlg as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPaymentCompleteFlg_NotInScope(Collection<Integer> paymentCompleteFlgList) {
        doSetPaymentCompleteFlg_NotInScope(paymentCompleteFlgList);
    }

    /**
     * NotInScope {not in (1, 2)}. As Flg. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * general boolean classification for every flg-column
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setPaymentCompleteFlg_NotInScope_AsFlg(Collection<CDef.Flg> cdefList) {
        doSetPaymentCompleteFlg_NotInScope(cTNumL(cdefList, Integer.class));
    }

    protected void doSetPaymentCompleteFlg_NotInScope(Collection<Integer> paymentCompleteFlgList) {
        regINS(CK_NINS, cTL(paymentCompleteFlgList), getCValuePaymentCompleteFlg(), "PAYMENT_COMPLETE_FLG");
    }

    protected void regPaymentCompleteFlg(ConditionKey ky, Object vl) { regQ(ky, vl, getCValuePaymentCompleteFlg(), "PAYMENT_COMPLETE_FLG"); }
    protected abstract ConditionValue getCValuePaymentCompleteFlg();

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

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @param versionNo The value of versionNo as equal. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_Equal(Long versionNo) {
        doSetVersionNo_Equal(versionNo);
    }

    protected void doSetVersionNo_Equal(Long versionNo) {
        regVersionNo(CK_EQ, versionNo);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @param minNumber The min number of versionNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of versionNo. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setVersionNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueVersionNo(), "VERSION_NO", rangeOfOption);
    }

    protected void regVersionNo(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueVersionNo(), "VERSION_NO"); }
    protected abstract ConditionValue getCValueVersionNo();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<PurchaseCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, PurchaseCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<PurchaseCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, PurchaseCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<PurchaseCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, PurchaseCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<PurchaseCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, PurchaseCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<PurchaseCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, PurchaseCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<PurchaseCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, PurchaseCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        PurchaseCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(PurchaseCQ sq);

    protected PurchaseCB xcreateScalarConditionCB() {
        PurchaseCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected PurchaseCB xcreateScalarConditionPartitionByCB() {
        PurchaseCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<PurchaseCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PurchaseCB cb = new PurchaseCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "PURCHASE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(PurchaseCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<PurchaseCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(PurchaseCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PurchaseCB cb = new PurchaseCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PURCHASE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(PurchaseCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<PurchaseCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        PurchaseCB cb = new PurchaseCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(PurchaseCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<PurchaseCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        PurchaseCB cb = new PurchaseCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(PurchaseCQ sq);

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
    protected PurchaseCB newMyCB() {
        return new PurchaseCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return PurchaseCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
