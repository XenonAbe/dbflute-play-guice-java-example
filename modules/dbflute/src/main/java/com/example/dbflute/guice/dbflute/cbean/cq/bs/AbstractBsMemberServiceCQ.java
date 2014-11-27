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
 * The abstract condition-query of MEMBER_SERVICE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMemberServiceCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMemberServiceCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "MEMBER_SERVICE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員サービスID)MEMBER_SERVICE_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param memberServiceId The value of memberServiceId as equal. (NullAllowed: if null, no condition)
     */
    public void setMemberServiceId_Equal(Integer memberServiceId) {
        doSetMemberServiceId_Equal(memberServiceId);
    }

    protected void doSetMemberServiceId_Equal(Integer memberServiceId) {
        regMemberServiceId(CK_EQ, memberServiceId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員サービスID)MEMBER_SERVICE_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param memberServiceId The value of memberServiceId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberServiceId_NotEqual(Integer memberServiceId) {
        doSetMemberServiceId_NotEqual(memberServiceId);
    }

    protected void doSetMemberServiceId_NotEqual(Integer memberServiceId) {
        regMemberServiceId(CK_NES, memberServiceId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員サービスID)MEMBER_SERVICE_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param memberServiceId The value of memberServiceId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMemberServiceId_GreaterThan(Integer memberServiceId) {
        regMemberServiceId(CK_GT, memberServiceId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員サービスID)MEMBER_SERVICE_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param memberServiceId The value of memberServiceId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMemberServiceId_LessThan(Integer memberServiceId) {
        regMemberServiceId(CK_LT, memberServiceId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員サービスID)MEMBER_SERVICE_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param memberServiceId The value of memberServiceId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberServiceId_GreaterEqual(Integer memberServiceId) {
        regMemberServiceId(CK_GE, memberServiceId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員サービスID)MEMBER_SERVICE_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param memberServiceId The value of memberServiceId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberServiceId_LessEqual(Integer memberServiceId) {
        regMemberServiceId(CK_LE, memberServiceId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (会員サービスID)MEMBER_SERVICE_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param minNumber The min number of memberServiceId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of memberServiceId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMemberServiceId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueMemberServiceId(), "MEMBER_SERVICE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (会員サービスID)MEMBER_SERVICE_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param memberServiceIdList The collection of memberServiceId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberServiceId_InScope(Collection<Integer> memberServiceIdList) {
        doSetMemberServiceId_InScope(memberServiceIdList);
    }

    protected void doSetMemberServiceId_InScope(Collection<Integer> memberServiceIdList) {
        regINS(CK_INS, cTL(memberServiceIdList), getCValueMemberServiceId(), "MEMBER_SERVICE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (会員サービスID)MEMBER_SERVICE_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param memberServiceIdList The collection of memberServiceId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberServiceId_NotInScope(Collection<Integer> memberServiceIdList) {
        doSetMemberServiceId_NotInScope(memberServiceIdList);
    }

    protected void doSetMemberServiceId_NotInScope(Collection<Integer> memberServiceIdList) {
        regINS(CK_NINS, cTL(memberServiceIdList), getCValueMemberServiceId(), "MEMBER_SERVICE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * (会員サービスID)MEMBER_SERVICE_ID: {PK, ID, NotNull, INTEGER(10)}
     */
    public void setMemberServiceId_IsNull() { regMemberServiceId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * (会員サービスID)MEMBER_SERVICE_ID: {PK, ID, NotNull, INTEGER(10)}
     */
    public void setMemberServiceId_IsNotNull() { regMemberServiceId(CK_ISNN, DOBJ); }

    protected void regMemberServiceId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMemberServiceId(), "MEMBER_SERVICE_ID"); }
    protected abstract ConditionValue getCValueMemberServiceId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ, IX, NotNull, INTEGER(10), FK to MEMBER}
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
     * (会員ID)MEMBER_ID: {UQ, IX, NotNull, INTEGER(10), FK to MEMBER}
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
     * (会員ID)MEMBER_ID: {UQ, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMemberId_GreaterThan(Integer memberId) {
        regMemberId(CK_GT, memberId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMemberId_LessThan(Integer memberId) {
        regMemberId(CK_LT, memberId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberId_GreaterEqual(Integer memberId) {
        regMemberId(CK_GE, memberId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberId_LessEqual(Integer memberId) {
        regMemberId(CK_LE, memberId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param minNumber The min number of memberId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of memberId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMemberId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueMemberId(), "MEMBER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ, IX, NotNull, INTEGER(10), FK to MEMBER}
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
     * (会員ID)MEMBER_ID: {UQ, IX, NotNull, INTEGER(10), FK to MEMBER}
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
     * (サービスポイント数)SERVICE_POINT_COUNT: {IX, NotNull, INTEGER(10)}
     * @param servicePointCount The value of servicePointCount as equal. (NullAllowed: if null, no condition)
     */
    public void setServicePointCount_Equal(Integer servicePointCount) {
        doSetServicePointCount_Equal(servicePointCount);
    }

    protected void doSetServicePointCount_Equal(Integer servicePointCount) {
        regServicePointCount(CK_EQ, servicePointCount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (サービスポイント数)SERVICE_POINT_COUNT: {IX, NotNull, INTEGER(10)}
     * @param servicePointCount The value of servicePointCount as notEqual. (NullAllowed: if null, no condition)
     */
    public void setServicePointCount_NotEqual(Integer servicePointCount) {
        doSetServicePointCount_NotEqual(servicePointCount);
    }

    protected void doSetServicePointCount_NotEqual(Integer servicePointCount) {
        regServicePointCount(CK_NES, servicePointCount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (サービスポイント数)SERVICE_POINT_COUNT: {IX, NotNull, INTEGER(10)}
     * @param servicePointCount The value of servicePointCount as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setServicePointCount_GreaterThan(Integer servicePointCount) {
        regServicePointCount(CK_GT, servicePointCount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (サービスポイント数)SERVICE_POINT_COUNT: {IX, NotNull, INTEGER(10)}
     * @param servicePointCount The value of servicePointCount as lessThan. (NullAllowed: if null, no condition)
     */
    public void setServicePointCount_LessThan(Integer servicePointCount) {
        regServicePointCount(CK_LT, servicePointCount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (サービスポイント数)SERVICE_POINT_COUNT: {IX, NotNull, INTEGER(10)}
     * @param servicePointCount The value of servicePointCount as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setServicePointCount_GreaterEqual(Integer servicePointCount) {
        regServicePointCount(CK_GE, servicePointCount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (サービスポイント数)SERVICE_POINT_COUNT: {IX, NotNull, INTEGER(10)}
     * @param servicePointCount The value of servicePointCount as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setServicePointCount_LessEqual(Integer servicePointCount) {
        regServicePointCount(CK_LE, servicePointCount);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (サービスポイント数)SERVICE_POINT_COUNT: {IX, NotNull, INTEGER(10)}
     * @param minNumber The min number of servicePointCount. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of servicePointCount. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setServicePointCount_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueServicePointCount(), "SERVICE_POINT_COUNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (サービスポイント数)SERVICE_POINT_COUNT: {IX, NotNull, INTEGER(10)}
     * @param servicePointCountList The collection of servicePointCount as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setServicePointCount_InScope(Collection<Integer> servicePointCountList) {
        doSetServicePointCount_InScope(servicePointCountList);
    }

    protected void doSetServicePointCount_InScope(Collection<Integer> servicePointCountList) {
        regINS(CK_INS, cTL(servicePointCountList), getCValueServicePointCount(), "SERVICE_POINT_COUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (サービスポイント数)SERVICE_POINT_COUNT: {IX, NotNull, INTEGER(10)}
     * @param servicePointCountList The collection of servicePointCount as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setServicePointCount_NotInScope(Collection<Integer> servicePointCountList) {
        doSetServicePointCount_NotInScope(servicePointCountList);
    }

    protected void doSetServicePointCount_NotInScope(Collection<Integer> servicePointCountList) {
        regINS(CK_NINS, cTL(servicePointCountList), getCValueServicePointCount(), "SERVICE_POINT_COUNT");
    }

    protected void regServicePointCount(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueServicePointCount(), "SERVICE_POINT_COUNT"); }
    protected abstract ConditionValue getCValueServicePointCount();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (サービスランクコード)SERVICE_RANK_CODE: {IX, NotNull, CHAR(3), FK to SERVICE_RANK, classification=ServiceRank}
     * @param serviceRankCode The value of serviceRankCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    protected void setServiceRankCode_Equal(String serviceRankCode) {
        doSetServiceRankCode_Equal(fRES(serviceRankCode));
    }

    /**
     * Equal(=). As ServiceRank. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (サービスランクコード)SERVICE_RANK_CODE: {IX, NotNull, CHAR(3), FK to SERVICE_RANK, classification=ServiceRank} <br />
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
     * (サービスランクコード)SERVICE_RANK_CODE: {IX, NotNull, CHAR(3), FK to SERVICE_RANK, classification=ServiceRank}
     * @param serviceRankCode The value of serviceRankCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    protected void setServiceRankCode_NotEqual(String serviceRankCode) {
        doSetServiceRankCode_NotEqual(fRES(serviceRankCode));
    }

    /**
     * NotEqual(&lt;&gt;). As ServiceRank. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (サービスランクコード)SERVICE_RANK_CODE: {IX, NotNull, CHAR(3), FK to SERVICE_RANK, classification=ServiceRank} <br />
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
     * (サービスランクコード)SERVICE_RANK_CODE: {IX, NotNull, CHAR(3), FK to SERVICE_RANK, classification=ServiceRank}
     * @param serviceRankCodeList The collection of serviceRankCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setServiceRankCode_InScope(Collection<String> serviceRankCodeList) {
        doSetServiceRankCode_InScope(serviceRankCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As ServiceRank. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (サービスランクコード)SERVICE_RANK_CODE: {IX, NotNull, CHAR(3), FK to SERVICE_RANK, classification=ServiceRank} <br />
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
     * (サービスランクコード)SERVICE_RANK_CODE: {IX, NotNull, CHAR(3), FK to SERVICE_RANK, classification=ServiceRank}
     * @param serviceRankCodeList The collection of serviceRankCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setServiceRankCode_NotInScope(Collection<String> serviceRankCodeList) {
        doSetServiceRankCode_NotInScope(serviceRankCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ServiceRank. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (サービスランクコード)SERVICE_RANK_CODE: {IX, NotNull, CHAR(3), FK to SERVICE_RANK, classification=ServiceRank} <br />
     * rank of service member gets
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setServiceRankCode_NotInScope_AsServiceRank(Collection<CDef.ServiceRank> cdefList) {
        doSetServiceRankCode_NotInScope(cTStrL(cdefList));
    }

    public void doSetServiceRankCode_NotInScope(Collection<String> serviceRankCodeList) {
        regINS(CK_NINS, cTL(serviceRankCodeList), getCValueServiceRankCode(), "SERVICE_RANK_CODE");
    }

    protected void regServiceRankCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueServiceRankCode(), "SERVICE_RANK_CODE"); }
    protected abstract ConditionValue getCValueServiceRankCode();

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
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;MemberServiceCB&gt;() {
     *     public void query(MemberServiceCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberServiceCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, MemberServiceCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;MemberServiceCB&gt;() {
     *     public void query(MemberServiceCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberServiceCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, MemberServiceCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;MemberServiceCB&gt;() {
     *     public void query(MemberServiceCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberServiceCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, MemberServiceCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;MemberServiceCB&gt;() {
     *     public void query(MemberServiceCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberServiceCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, MemberServiceCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;MemberServiceCB&gt;() {
     *     public void query(MemberServiceCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberServiceCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, MemberServiceCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MemberServiceCB&gt;() {
     *     public void query(MemberServiceCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberServiceCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, MemberServiceCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        MemberServiceCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(MemberServiceCQ sq);

    protected MemberServiceCB xcreateScalarConditionCB() {
        MemberServiceCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MemberServiceCB xcreateScalarConditionPartitionByCB() {
        MemberServiceCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MemberServiceCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberServiceCB cb = new MemberServiceCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "MEMBER_SERVICE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MemberServiceCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MemberServiceCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MemberServiceCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberServiceCB cb = new MemberServiceCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MEMBER_SERVICE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MemberServiceCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MemberServiceCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberServiceCB cb = new MemberServiceCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MemberServiceCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<MemberServiceCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberServiceCB cb = new MemberServiceCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(MemberServiceCQ sq);

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
    protected MemberServiceCB newMyCB() {
        return new MemberServiceCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MemberServiceCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
