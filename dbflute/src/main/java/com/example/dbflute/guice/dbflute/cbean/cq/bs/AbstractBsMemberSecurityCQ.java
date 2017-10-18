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
 * The abstract condition-query of MEMBER_SECURITY.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMemberSecurityCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMemberSecurityCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "MEMBER_SECURITY";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER}
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
     * (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER}
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
     * (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMemberId_GreaterThan(Integer memberId) {
        regMemberId(CK_GT, memberId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMemberId_LessThan(Integer memberId) {
        regMemberId(CK_LT, memberId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberId_GreaterEqual(Integer memberId) {
        regMemberId(CK_GE, memberId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberId_LessEqual(Integer memberId) {
        regMemberId(CK_LE, memberId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER}
     * @param minNumber The min number of memberId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of memberId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMemberId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueMemberId(), "MEMBER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER}
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
     * (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberIdList The collection of memberId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberId_NotInScope(Collection<Integer> memberIdList) {
        doSetMemberId_NotInScope(memberIdList);
    }

    protected void doSetMemberId_NotInScope(Collection<Integer> memberIdList) {
        regINS(CK_NINS, cTL(memberIdList), getCValueMemberId(), "MEMBER_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER}
     */
    public void setMemberId_IsNull() { regMemberId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER}
     */
    public void setMemberId_IsNotNull() { regMemberId(CK_ISNN, DOBJ); }

    protected void regMemberId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMemberId(), "MEMBER_ID"); }
    protected abstract ConditionValue getCValueMemberId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (ログインパスワード)LOGIN_PASSWORD: {NotNull, VARCHAR(50)}
     * @param loginPassword The value of loginPassword as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginPassword_Equal(String loginPassword) {
        doSetLoginPassword_Equal(fRES(loginPassword));
    }

    protected void doSetLoginPassword_Equal(String loginPassword) {
        regLoginPassword(CK_EQ, loginPassword);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (ログインパスワード)LOGIN_PASSWORD: {NotNull, VARCHAR(50)}
     * @param loginPassword The value of loginPassword as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginPassword_NotEqual(String loginPassword) {
        doSetLoginPassword_NotEqual(fRES(loginPassword));
    }

    protected void doSetLoginPassword_NotEqual(String loginPassword) {
        regLoginPassword(CK_NES, loginPassword);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (ログインパスワード)LOGIN_PASSWORD: {NotNull, VARCHAR(50)}
     * @param loginPasswordList The collection of loginPassword as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginPassword_InScope(Collection<String> loginPasswordList) {
        doSetLoginPassword_InScope(loginPasswordList);
    }

    public void doSetLoginPassword_InScope(Collection<String> loginPasswordList) {
        regINS(CK_INS, cTL(loginPasswordList), getCValueLoginPassword(), "LOGIN_PASSWORD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (ログインパスワード)LOGIN_PASSWORD: {NotNull, VARCHAR(50)}
     * @param loginPasswordList The collection of loginPassword as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginPassword_NotInScope(Collection<String> loginPasswordList) {
        doSetLoginPassword_NotInScope(loginPasswordList);
    }

    public void doSetLoginPassword_NotInScope(Collection<String> loginPasswordList) {
        regINS(CK_NINS, cTL(loginPasswordList), getCValueLoginPassword(), "LOGIN_PASSWORD");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (ログインパスワード)LOGIN_PASSWORD: {NotNull, VARCHAR(50)}
     * @param loginPassword The value of loginPassword as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginPassword_PrefixSearch(String loginPassword) {
        setLoginPassword_LikeSearch(loginPassword, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (ログインパスワード)LOGIN_PASSWORD: {NotNull, VARCHAR(50)} <br />
     * <pre>e.g. setLoginPassword_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param loginPassword The value of loginPassword as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLoginPassword_LikeSearch(String loginPassword, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(loginPassword), getCValueLoginPassword(), "LOGIN_PASSWORD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (ログインパスワード)LOGIN_PASSWORD: {NotNull, VARCHAR(50)}
     * @param loginPassword The value of loginPassword as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLoginPassword_NotLikeSearch(String loginPassword, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(loginPassword), getCValueLoginPassword(), "LOGIN_PASSWORD", likeSearchOption);
    }

    protected void regLoginPassword(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueLoginPassword(), "LOGIN_PASSWORD"); }
    protected abstract ConditionValue getCValueLoginPassword();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (リマインダ質問)REMINDER_QUESTION: {NotNull, VARCHAR(50)}
     * @param reminderQuestion The value of reminderQuestion as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setReminderQuestion_Equal(String reminderQuestion) {
        doSetReminderQuestion_Equal(fRES(reminderQuestion));
    }

    protected void doSetReminderQuestion_Equal(String reminderQuestion) {
        regReminderQuestion(CK_EQ, reminderQuestion);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (リマインダ質問)REMINDER_QUESTION: {NotNull, VARCHAR(50)}
     * @param reminderQuestion The value of reminderQuestion as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setReminderQuestion_NotEqual(String reminderQuestion) {
        doSetReminderQuestion_NotEqual(fRES(reminderQuestion));
    }

    protected void doSetReminderQuestion_NotEqual(String reminderQuestion) {
        regReminderQuestion(CK_NES, reminderQuestion);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (リマインダ質問)REMINDER_QUESTION: {NotNull, VARCHAR(50)}
     * @param reminderQuestionList The collection of reminderQuestion as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setReminderQuestion_InScope(Collection<String> reminderQuestionList) {
        doSetReminderQuestion_InScope(reminderQuestionList);
    }

    public void doSetReminderQuestion_InScope(Collection<String> reminderQuestionList) {
        regINS(CK_INS, cTL(reminderQuestionList), getCValueReminderQuestion(), "REMINDER_QUESTION");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (リマインダ質問)REMINDER_QUESTION: {NotNull, VARCHAR(50)}
     * @param reminderQuestionList The collection of reminderQuestion as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setReminderQuestion_NotInScope(Collection<String> reminderQuestionList) {
        doSetReminderQuestion_NotInScope(reminderQuestionList);
    }

    public void doSetReminderQuestion_NotInScope(Collection<String> reminderQuestionList) {
        regINS(CK_NINS, cTL(reminderQuestionList), getCValueReminderQuestion(), "REMINDER_QUESTION");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (リマインダ質問)REMINDER_QUESTION: {NotNull, VARCHAR(50)}
     * @param reminderQuestion The value of reminderQuestion as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setReminderQuestion_PrefixSearch(String reminderQuestion) {
        setReminderQuestion_LikeSearch(reminderQuestion, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (リマインダ質問)REMINDER_QUESTION: {NotNull, VARCHAR(50)} <br />
     * <pre>e.g. setReminderQuestion_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reminderQuestion The value of reminderQuestion as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReminderQuestion_LikeSearch(String reminderQuestion, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(reminderQuestion), getCValueReminderQuestion(), "REMINDER_QUESTION", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (リマインダ質問)REMINDER_QUESTION: {NotNull, VARCHAR(50)}
     * @param reminderQuestion The value of reminderQuestion as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReminderQuestion_NotLikeSearch(String reminderQuestion, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reminderQuestion), getCValueReminderQuestion(), "REMINDER_QUESTION", likeSearchOption);
    }

    protected void regReminderQuestion(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueReminderQuestion(), "REMINDER_QUESTION"); }
    protected abstract ConditionValue getCValueReminderQuestion();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (リマインダ回答)REMINDER_ANSWER: {NotNull, VARCHAR(50)}
     * @param reminderAnswer The value of reminderAnswer as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setReminderAnswer_Equal(String reminderAnswer) {
        doSetReminderAnswer_Equal(fRES(reminderAnswer));
    }

    protected void doSetReminderAnswer_Equal(String reminderAnswer) {
        regReminderAnswer(CK_EQ, reminderAnswer);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (リマインダ回答)REMINDER_ANSWER: {NotNull, VARCHAR(50)}
     * @param reminderAnswer The value of reminderAnswer as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setReminderAnswer_NotEqual(String reminderAnswer) {
        doSetReminderAnswer_NotEqual(fRES(reminderAnswer));
    }

    protected void doSetReminderAnswer_NotEqual(String reminderAnswer) {
        regReminderAnswer(CK_NES, reminderAnswer);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (リマインダ回答)REMINDER_ANSWER: {NotNull, VARCHAR(50)}
     * @param reminderAnswerList The collection of reminderAnswer as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setReminderAnswer_InScope(Collection<String> reminderAnswerList) {
        doSetReminderAnswer_InScope(reminderAnswerList);
    }

    public void doSetReminderAnswer_InScope(Collection<String> reminderAnswerList) {
        regINS(CK_INS, cTL(reminderAnswerList), getCValueReminderAnswer(), "REMINDER_ANSWER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (リマインダ回答)REMINDER_ANSWER: {NotNull, VARCHAR(50)}
     * @param reminderAnswerList The collection of reminderAnswer as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setReminderAnswer_NotInScope(Collection<String> reminderAnswerList) {
        doSetReminderAnswer_NotInScope(reminderAnswerList);
    }

    public void doSetReminderAnswer_NotInScope(Collection<String> reminderAnswerList) {
        regINS(CK_NINS, cTL(reminderAnswerList), getCValueReminderAnswer(), "REMINDER_ANSWER");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (リマインダ回答)REMINDER_ANSWER: {NotNull, VARCHAR(50)}
     * @param reminderAnswer The value of reminderAnswer as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setReminderAnswer_PrefixSearch(String reminderAnswer) {
        setReminderAnswer_LikeSearch(reminderAnswer, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (リマインダ回答)REMINDER_ANSWER: {NotNull, VARCHAR(50)} <br />
     * <pre>e.g. setReminderAnswer_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reminderAnswer The value of reminderAnswer as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReminderAnswer_LikeSearch(String reminderAnswer, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(reminderAnswer), getCValueReminderAnswer(), "REMINDER_ANSWER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (リマインダ回答)REMINDER_ANSWER: {NotNull, VARCHAR(50)}
     * @param reminderAnswer The value of reminderAnswer as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReminderAnswer_NotLikeSearch(String reminderAnswer, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reminderAnswer), getCValueReminderAnswer(), "REMINDER_ANSWER", likeSearchOption);
    }

    protected void regReminderAnswer(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueReminderAnswer(), "REMINDER_ANSWER"); }
    protected abstract ConditionValue getCValueReminderAnswer();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (リマインダ利用回数)REMINDER_USE_COUNT: {NotNull, INTEGER(10)}
     * @param reminderUseCount The value of reminderUseCount as equal. (NullAllowed: if null, no condition)
     */
    public void setReminderUseCount_Equal(Integer reminderUseCount) {
        doSetReminderUseCount_Equal(reminderUseCount);
    }

    protected void doSetReminderUseCount_Equal(Integer reminderUseCount) {
        regReminderUseCount(CK_EQ, reminderUseCount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (リマインダ利用回数)REMINDER_USE_COUNT: {NotNull, INTEGER(10)}
     * @param reminderUseCount The value of reminderUseCount as notEqual. (NullAllowed: if null, no condition)
     */
    public void setReminderUseCount_NotEqual(Integer reminderUseCount) {
        doSetReminderUseCount_NotEqual(reminderUseCount);
    }

    protected void doSetReminderUseCount_NotEqual(Integer reminderUseCount) {
        regReminderUseCount(CK_NES, reminderUseCount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (リマインダ利用回数)REMINDER_USE_COUNT: {NotNull, INTEGER(10)}
     * @param reminderUseCount The value of reminderUseCount as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setReminderUseCount_GreaterThan(Integer reminderUseCount) {
        regReminderUseCount(CK_GT, reminderUseCount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (リマインダ利用回数)REMINDER_USE_COUNT: {NotNull, INTEGER(10)}
     * @param reminderUseCount The value of reminderUseCount as lessThan. (NullAllowed: if null, no condition)
     */
    public void setReminderUseCount_LessThan(Integer reminderUseCount) {
        regReminderUseCount(CK_LT, reminderUseCount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (リマインダ利用回数)REMINDER_USE_COUNT: {NotNull, INTEGER(10)}
     * @param reminderUseCount The value of reminderUseCount as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setReminderUseCount_GreaterEqual(Integer reminderUseCount) {
        regReminderUseCount(CK_GE, reminderUseCount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (リマインダ利用回数)REMINDER_USE_COUNT: {NotNull, INTEGER(10)}
     * @param reminderUseCount The value of reminderUseCount as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setReminderUseCount_LessEqual(Integer reminderUseCount) {
        regReminderUseCount(CK_LE, reminderUseCount);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (リマインダ利用回数)REMINDER_USE_COUNT: {NotNull, INTEGER(10)}
     * @param minNumber The min number of reminderUseCount. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of reminderUseCount. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReminderUseCount_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueReminderUseCount(), "REMINDER_USE_COUNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (リマインダ利用回数)REMINDER_USE_COUNT: {NotNull, INTEGER(10)}
     * @param reminderUseCountList The collection of reminderUseCount as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setReminderUseCount_InScope(Collection<Integer> reminderUseCountList) {
        doSetReminderUseCount_InScope(reminderUseCountList);
    }

    protected void doSetReminderUseCount_InScope(Collection<Integer> reminderUseCountList) {
        regINS(CK_INS, cTL(reminderUseCountList), getCValueReminderUseCount(), "REMINDER_USE_COUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (リマインダ利用回数)REMINDER_USE_COUNT: {NotNull, INTEGER(10)}
     * @param reminderUseCountList The collection of reminderUseCount as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setReminderUseCount_NotInScope(Collection<Integer> reminderUseCountList) {
        doSetReminderUseCount_NotInScope(reminderUseCountList);
    }

    protected void doSetReminderUseCount_NotInScope(Collection<Integer> reminderUseCountList) {
        regINS(CK_NINS, cTL(reminderUseCountList), getCValueReminderUseCount(), "REMINDER_USE_COUNT");
    }

    protected void regReminderUseCount(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueReminderUseCount(), "REMINDER_USE_COUNT"); }
    protected abstract ConditionValue getCValueReminderUseCount();

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
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;MemberSecurityCB&gt;() {
     *     public void query(MemberSecurityCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberSecurityCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, MemberSecurityCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;MemberSecurityCB&gt;() {
     *     public void query(MemberSecurityCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberSecurityCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, MemberSecurityCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;MemberSecurityCB&gt;() {
     *     public void query(MemberSecurityCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberSecurityCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, MemberSecurityCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;MemberSecurityCB&gt;() {
     *     public void query(MemberSecurityCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberSecurityCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, MemberSecurityCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;MemberSecurityCB&gt;() {
     *     public void query(MemberSecurityCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberSecurityCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, MemberSecurityCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MemberSecurityCB&gt;() {
     *     public void query(MemberSecurityCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberSecurityCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, MemberSecurityCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        MemberSecurityCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(MemberSecurityCQ sq);

    protected MemberSecurityCB xcreateScalarConditionCB() {
        MemberSecurityCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MemberSecurityCB xcreateScalarConditionPartitionByCB() {
        MemberSecurityCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MemberSecurityCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberSecurityCB cb = new MemberSecurityCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "MEMBER_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MemberSecurityCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MemberSecurityCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MemberSecurityCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberSecurityCB cb = new MemberSecurityCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MEMBER_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MemberSecurityCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MemberSecurityCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberSecurityCB cb = new MemberSecurityCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MemberSecurityCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<MemberSecurityCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberSecurityCB cb = new MemberSecurityCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(MemberSecurityCQ sq);

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
    protected MemberSecurityCB newMyCB() {
        return new MemberSecurityCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MemberSecurityCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
