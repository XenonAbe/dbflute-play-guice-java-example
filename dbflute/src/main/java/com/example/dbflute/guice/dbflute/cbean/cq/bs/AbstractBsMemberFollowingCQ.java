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
 * The abstract condition-query of MEMBER_FOLLOWING.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMemberFollowingCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMemberFollowingCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "MEMBER_FOLLOWING";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberFollowingId The value of memberFollowingId as equal. (NullAllowed: if null, no condition)
     */
    public void setMemberFollowingId_Equal(Long memberFollowingId) {
        doSetMemberFollowingId_Equal(memberFollowingId);
    }

    protected void doSetMemberFollowingId_Equal(Long memberFollowingId) {
        regMemberFollowingId(CK_EQ, memberFollowingId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberFollowingId The value of memberFollowingId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberFollowingId_NotEqual(Long memberFollowingId) {
        doSetMemberFollowingId_NotEqual(memberFollowingId);
    }

    protected void doSetMemberFollowingId_NotEqual(Long memberFollowingId) {
        regMemberFollowingId(CK_NES, memberFollowingId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberFollowingId The value of memberFollowingId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMemberFollowingId_GreaterThan(Long memberFollowingId) {
        regMemberFollowingId(CK_GT, memberFollowingId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberFollowingId The value of memberFollowingId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMemberFollowingId_LessThan(Long memberFollowingId) {
        regMemberFollowingId(CK_LT, memberFollowingId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberFollowingId The value of memberFollowingId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberFollowingId_GreaterEqual(Long memberFollowingId) {
        regMemberFollowingId(CK_GE, memberFollowingId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberFollowingId The value of memberFollowingId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberFollowingId_LessEqual(Long memberFollowingId) {
        regMemberFollowingId(CK_LE, memberFollowingId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of memberFollowingId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of memberFollowingId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMemberFollowingId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueMemberFollowingId(), "MEMBER_FOLLOWING_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberFollowingIdList The collection of memberFollowingId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberFollowingId_InScope(Collection<Long> memberFollowingIdList) {
        doSetMemberFollowingId_InScope(memberFollowingIdList);
    }

    protected void doSetMemberFollowingId_InScope(Collection<Long> memberFollowingIdList) {
        regINS(CK_INS, cTL(memberFollowingIdList), getCValueMemberFollowingId(), "MEMBER_FOLLOWING_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberFollowingIdList The collection of memberFollowingId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberFollowingId_NotInScope(Collection<Long> memberFollowingIdList) {
        doSetMemberFollowingId_NotInScope(memberFollowingIdList);
    }

    protected void doSetMemberFollowingId_NotInScope(Collection<Long> memberFollowingIdList) {
        regINS(CK_NINS, cTL(memberFollowingIdList), getCValueMemberFollowingId(), "MEMBER_FOLLOWING_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setMemberFollowingId_IsNull() { regMemberFollowingId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setMemberFollowingId_IsNotNull() { regMemberFollowingId(CK_ISNN, DOBJ); }

    protected void regMemberFollowingId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMemberFollowingId(), "MEMBER_FOLLOWING_ID"); }
    protected abstract ConditionValue getCValueMemberFollowingId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (わたし)MY_MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param myMemberId The value of myMemberId as equal. (NullAllowed: if null, no condition)
     */
    public void setMyMemberId_Equal(Integer myMemberId) {
        doSetMyMemberId_Equal(myMemberId);
    }

    protected void doSetMyMemberId_Equal(Integer myMemberId) {
        regMyMemberId(CK_EQ, myMemberId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (わたし)MY_MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param myMemberId The value of myMemberId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setMyMemberId_NotEqual(Integer myMemberId) {
        doSetMyMemberId_NotEqual(myMemberId);
    }

    protected void doSetMyMemberId_NotEqual(Integer myMemberId) {
        regMyMemberId(CK_NES, myMemberId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (わたし)MY_MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param myMemberId The value of myMemberId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMyMemberId_GreaterThan(Integer myMemberId) {
        regMyMemberId(CK_GT, myMemberId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (わたし)MY_MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param myMemberId The value of myMemberId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMyMemberId_LessThan(Integer myMemberId) {
        regMyMemberId(CK_LT, myMemberId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (わたし)MY_MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param myMemberId The value of myMemberId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMyMemberId_GreaterEqual(Integer myMemberId) {
        regMyMemberId(CK_GE, myMemberId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (わたし)MY_MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param myMemberId The value of myMemberId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMyMemberId_LessEqual(Integer myMemberId) {
        regMyMemberId(CK_LE, myMemberId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (わたし)MY_MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param minNumber The min number of myMemberId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of myMemberId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMyMemberId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueMyMemberId(), "MY_MEMBER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (わたし)MY_MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param myMemberIdList The collection of myMemberId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMyMemberId_InScope(Collection<Integer> myMemberIdList) {
        doSetMyMemberId_InScope(myMemberIdList);
    }

    protected void doSetMyMemberId_InScope(Collection<Integer> myMemberIdList) {
        regINS(CK_INS, cTL(myMemberIdList), getCValueMyMemberId(), "MY_MEMBER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (わたし)MY_MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param myMemberIdList The collection of myMemberId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMyMemberId_NotInScope(Collection<Integer> myMemberIdList) {
        doSetMyMemberId_NotInScope(myMemberIdList);
    }

    protected void doSetMyMemberId_NotInScope(Collection<Integer> myMemberIdList) {
        regINS(CK_NINS, cTL(myMemberIdList), getCValueMyMemberId(), "MY_MEMBER_ID");
    }

    protected void regMyMemberId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMyMemberId(), "MY_MEMBER_ID"); }
    protected abstract ConditionValue getCValueMyMemberId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (あなた)YOUR_MEMBER_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param yourMemberId The value of yourMemberId as equal. (NullAllowed: if null, no condition)
     */
    public void setYourMemberId_Equal(Integer yourMemberId) {
        doSetYourMemberId_Equal(yourMemberId);
    }

    protected void doSetYourMemberId_Equal(Integer yourMemberId) {
        regYourMemberId(CK_EQ, yourMemberId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (あなた)YOUR_MEMBER_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param yourMemberId The value of yourMemberId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setYourMemberId_NotEqual(Integer yourMemberId) {
        doSetYourMemberId_NotEqual(yourMemberId);
    }

    protected void doSetYourMemberId_NotEqual(Integer yourMemberId) {
        regYourMemberId(CK_NES, yourMemberId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (あなた)YOUR_MEMBER_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param yourMemberId The value of yourMemberId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setYourMemberId_GreaterThan(Integer yourMemberId) {
        regYourMemberId(CK_GT, yourMemberId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (あなた)YOUR_MEMBER_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param yourMemberId The value of yourMemberId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setYourMemberId_LessThan(Integer yourMemberId) {
        regYourMemberId(CK_LT, yourMemberId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (あなた)YOUR_MEMBER_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param yourMemberId The value of yourMemberId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setYourMemberId_GreaterEqual(Integer yourMemberId) {
        regYourMemberId(CK_GE, yourMemberId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (あなた)YOUR_MEMBER_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param yourMemberId The value of yourMemberId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setYourMemberId_LessEqual(Integer yourMemberId) {
        regYourMemberId(CK_LE, yourMemberId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (あなた)YOUR_MEMBER_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param minNumber The min number of yourMemberId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of yourMemberId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setYourMemberId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueYourMemberId(), "YOUR_MEMBER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (あなた)YOUR_MEMBER_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param yourMemberIdList The collection of yourMemberId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setYourMemberId_InScope(Collection<Integer> yourMemberIdList) {
        doSetYourMemberId_InScope(yourMemberIdList);
    }

    protected void doSetYourMemberId_InScope(Collection<Integer> yourMemberIdList) {
        regINS(CK_INS, cTL(yourMemberIdList), getCValueYourMemberId(), "YOUR_MEMBER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (あなた)YOUR_MEMBER_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param yourMemberIdList The collection of yourMemberId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setYourMemberId_NotInScope(Collection<Integer> yourMemberIdList) {
        doSetYourMemberId_NotInScope(yourMemberIdList);
    }

    protected void doSetYourMemberId_NotInScope(Collection<Integer> yourMemberIdList) {
        regINS(CK_NINS, cTL(yourMemberIdList), getCValueYourMemberId(), "YOUR_MEMBER_ID");
    }

    protected void regYourMemberId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueYourMemberId(), "YOUR_MEMBER_ID"); }
    protected abstract ConditionValue getCValueYourMemberId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (その瞬間)FOLLOW_DATETIME: {IX, NotNull, TIMESTAMP(23, 10)}
     * @param followDatetime The value of followDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setFollowDatetime_Equal(org.joda.time.LocalDateTime followDatetime) {
        regFollowDatetime(CK_EQ,  followDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (その瞬間)FOLLOW_DATETIME: {IX, NotNull, TIMESTAMP(23, 10)}
     * @param followDatetime The value of followDatetime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setFollowDatetime_GreaterThan(org.joda.time.LocalDateTime followDatetime) {
        regFollowDatetime(CK_GT,  followDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (その瞬間)FOLLOW_DATETIME: {IX, NotNull, TIMESTAMP(23, 10)}
     * @param followDatetime The value of followDatetime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setFollowDatetime_LessThan(org.joda.time.LocalDateTime followDatetime) {
        regFollowDatetime(CK_LT,  followDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (その瞬間)FOLLOW_DATETIME: {IX, NotNull, TIMESTAMP(23, 10)}
     * @param followDatetime The value of followDatetime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setFollowDatetime_GreaterEqual(org.joda.time.LocalDateTime followDatetime) {
        regFollowDatetime(CK_GE,  followDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (その瞬間)FOLLOW_DATETIME: {IX, NotNull, TIMESTAMP(23, 10)}
     * @param followDatetime The value of followDatetime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setFollowDatetime_LessEqual(org.joda.time.LocalDateTime followDatetime) {
        regFollowDatetime(CK_LE, followDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (その瞬間)FOLLOW_DATETIME: {IX, NotNull, TIMESTAMP(23, 10)}
     * <pre>e.g. setFollowDatetime_FromTo(fromDate, toDate, new <span style="color: #DD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of followDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of followDatetime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setFollowDatetime_FromTo(org.joda.time.LocalDateTime fromDatetime, org.joda.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        regFTQ(toTimestamp(fromDatetime), toTimestamp(toDatetime), getCValueFollowDatetime(), "FOLLOW_DATETIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (その瞬間)FOLLOW_DATETIME: {IX, NotNull, TIMESTAMP(23, 10)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #DD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of followDatetime. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of followDatetime. (NullAllowed: if null, no to-condition)
     */
    public void setFollowDatetime_DateFromTo(org.joda.time.LocalDateTime fromDate, org.joda.time.LocalDateTime toDate) {
        setFollowDatetime_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    protected void regFollowDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueFollowDatetime(), "FOLLOW_DATETIME"); }
    protected abstract ConditionValue getCValueFollowDatetime();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberFollowingCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberFollowingCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, MemberFollowingCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberFollowingCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberFollowingCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, MemberFollowingCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberFollowingCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberFollowingCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, MemberFollowingCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberFollowingCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberFollowingCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, MemberFollowingCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberFollowingCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberFollowingCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, MemberFollowingCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberFollowingCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberFollowingCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, MemberFollowingCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        MemberFollowingCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(MemberFollowingCQ sq);

    protected MemberFollowingCB xcreateScalarConditionCB() {
        MemberFollowingCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MemberFollowingCB xcreateScalarConditionPartitionByCB() {
        MemberFollowingCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MemberFollowingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberFollowingCB cb = new MemberFollowingCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "MEMBER_FOLLOWING_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MemberFollowingCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MemberFollowingCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MemberFollowingCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberFollowingCB cb = new MemberFollowingCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MEMBER_FOLLOWING_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MemberFollowingCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MemberFollowingCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberFollowingCB cb = new MemberFollowingCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MemberFollowingCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<MemberFollowingCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberFollowingCB cb = new MemberFollowingCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(MemberFollowingCQ sq);

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
    protected MemberFollowingCB newMyCB() {
        return new MemberFollowingCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MemberFollowingCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
