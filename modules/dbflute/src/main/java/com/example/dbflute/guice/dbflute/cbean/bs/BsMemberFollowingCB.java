package com.example.dbflute.guice.dbflute.cbean.bs;

import org.seasar.dbflute.cbean.AbstractConditionBean;
import org.seasar.dbflute.cbean.AndQuery;
import org.seasar.dbflute.cbean.ConditionBean;
import org.seasar.dbflute.cbean.ConditionQuery;
import org.seasar.dbflute.cbean.OrQuery;
import org.seasar.dbflute.cbean.SpecifyQuery;
import org.seasar.dbflute.cbean.SubQuery;
import org.seasar.dbflute.cbean.UnionQuery;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.cbean.sqlclause.SqlClauseCreator;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import org.seasar.dbflute.twowaysql.factory.SqlAnalyzerFactory;
import com.example.dbflute.guice.dbflute.allcommon.DBFluteConfig;
import com.example.dbflute.guice.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.guice.dbflute.allcommon.ImplementedInvokerAssistant;
import com.example.dbflute.guice.dbflute.allcommon.ImplementedSqlClauseCreator;
import com.example.dbflute.guice.dbflute.cbean.*;
import com.example.dbflute.guice.dbflute.cbean.cq.*;
import com.example.dbflute.guice.dbflute.cbean.nss.*;

/**
 * The base condition-bean of MEMBER_FOLLOWING.
 * @author DBFlute(AutoGenerator)
 */
public class BsMemberFollowingCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MemberFollowingCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMemberFollowingCB() {
        if (DBFluteConfig.getInstance().isPagingCountLater()) {
            enablePagingCountLater();
        }
        if (DBFluteConfig.getInstance().isPagingCountLeastJoin()) {
            enablePagingCountLeastJoin();
        }
        if (DBFluteConfig.getInstance().isNonSpecifiedColumnAccessAllowed()) {
            enableNonSpecifiedColumnAccess();
        }
        if (DBFluteConfig.getInstance().isQueryUpdateCountPreCheck()) {
            enableQueryUpdateCountPreCheck();
        }
    }

    // ===================================================================================
    //                                                                           SqlClause
    //                                                                           =========
    @Override
    protected SqlClause createSqlClause() {
        SqlClauseCreator creator = DBFluteConfig.getInstance().getSqlClauseCreator();
        if (creator != null) {
            return creator.createSqlClause(this);
        }
        return new ImplementedSqlClauseCreator().createSqlClause(this); // as default
    }

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider getDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider(); // as default
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "MEMBER_FOLLOWING";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param memberFollowingId (会員フォローイングID): PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return this. (NotNull)
     */
    public MemberFollowingCB acceptPK(Long memberFollowingId) {
        assertObjectNotNull("memberFollowingId", memberFollowingId);
        BsMemberFollowingCB cb = this;
        cb.query().setMemberFollowingId_Equal(memberFollowingId);
        return (MemberFollowingCB)this;
    }

    /**
     * Accept the query condition of unique key as equal.
     * @param myMemberId (わたし): UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER. (NotNull)
     * @param yourMemberId (あなた): +UQ, IX+, NotNull, INTEGER(10), FK to MEMBER. (NotNull)
     * @return this. (NotNull)
     */
    public MemberFollowingCB acceptUniqueOf(Integer myMemberId, Integer yourMemberId) {
        assertObjectNotNull("myMemberId", myMemberId);assertObjectNotNull("yourMemberId", yourMemberId);
        BsMemberFollowingCB cb = this;
        cb.query().setMyMemberId_Equal(myMemberId);cb.query().setYourMemberId_Equal(yourMemberId);
        return (MemberFollowingCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_MemberFollowingId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_MemberFollowingId_Desc();
        return this;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Prepare for various queries. <br />
     * Examples of main functions are following:
     * <pre>
     * <span style="color: #3F7E5E">// Basic Queries</span>
     * cb.query().setMemberId_Equal(value);        <span style="color: #3F7E5E">// =</span>
     * cb.query().setMemberId_NotEqual(value);     <span style="color: #3F7E5E">// !=</span>
     * cb.query().setMemberId_GreaterThan(value);  <span style="color: #3F7E5E">// &gt;</span>
     * cb.query().setMemberId_LessThan(value);     <span style="color: #3F7E5E">// &lt;</span>
     * cb.query().setMemberId_GreaterEqual(value); <span style="color: #3F7E5E">// &gt;=</span>
     * cb.query().setMemberId_LessEqual(value);    <span style="color: #3F7E5E">// &lt;=</span>
     * cb.query().setMemberName_InScope(valueList);    <span style="color: #3F7E5E">// in ('a', 'b')</span>
     * cb.query().setMemberName_NotInScope(valueList); <span style="color: #3F7E5E">// not in ('a', 'b')</span>
     * cb.query().setMemberName_PrefixSearch(value);   <span style="color: #3F7E5E">// like 'a%' escape '|'</span>
     * <span style="color: #3F7E5E">// LikeSearch with various options: (versatile)</span>
     * <span style="color: #3F7E5E">// {like ... [options]}</span>
     * cb.query().setMemberName_LikeSearch(value, option);
     * cb.query().setMemberName_NotLikeSearch(value, option); <span style="color: #3F7E5E">// not like ...</span>
     * <span style="color: #3F7E5E">// FromTo with various options: (versatile)</span>
     * <span style="color: #3F7E5E">// {(default) fromDatetime &lt;= BIRTHDATE &lt;= toDatetime}</span>
     * cb.query().setBirthdate_FromTo(fromDatetime, toDatetime, option);
     * <span style="color: #3F7E5E">// DateFromTo: (Date means yyyy/MM/dd)</span>
     * <span style="color: #3F7E5E">// {fromDate &lt;= BIRTHDATE &lt; toDate + 1 day}</span>
     * cb.query().setBirthdate_DateFromTo(fromDate, toDate);
     * cb.query().setBirthdate_IsNull();    <span style="color: #3F7E5E">// is null</span>
     * cb.query().setBirthdate_IsNotNull(); <span style="color: #3F7E5E">// is not null</span>
     * 
     * <span style="color: #3F7E5E">// ExistsReferrer: (correlated sub-query)</span>
     * <span style="color: #3F7E5E">// {where exists (select PURCHASE_ID from PURCHASE where ...)}</span>
     * cb.query().existsPurchaseList(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.query().setXxx... <span style="color: #3F7E5E">// referrer sub-query condition</span>
     *     }
     * });
     * cb.query().notExistsPurchaseList...
     * 
     * <span style="color: #3F7E5E">// InScopeRelation: (sub-query)</span>
     * <span style="color: #3F7E5E">// {where MEMBER_STATUS_CODE in (select MEMBER_STATUS_CODE from MEMBER_STATUS where ...)}</span>
     * cb.query().inScopeMemberStatus(new SubQuery&lt;MemberStatusCB&gt;() {
     *     public void query(MemberStatusCB subCB) {
     *         subCB.query().setXxx... <span style="color: #3F7E5E">// relation sub-query condition</span>
     *     }
     * });
     * cb.query().notInScopeMemberStatus...
     * 
     * <span style="color: #3F7E5E">// (Query)DerivedReferrer: (correlated sub-query)</span>
     * cb.query().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchasePrice(); <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setXxx... <span style="color: #3F7E5E">// referrer sub-query condition</span>
     *     }
     * }).greaterEqual(value);
     * 
     * <span style="color: #3F7E5E">// ScalarCondition: (self-table sub-query)</span>
     * cb.query().scalar_Equal().max(new SubQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.specify().columnBirthdate(); <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setXxx... <span style="color: #3F7E5E">// scalar sub-query condition</span>
     *     }
     * });
     * 
     * <span style="color: #3F7E5E">// OrderBy</span>
     * cb.query().addOrderBy_MemberName_Asc();
     * cb.query().addOrderBy_MemberName_Desc().withManualOrder(valueList);
     * cb.query().addOrderBy_MemberName_Desc().withNullsFirst();
     * cb.query().addOrderBy_MemberName_Desc().withNullsLast();
     * cb.query().addSpecifiedDerivedOrderBy_Desc(aliasName);
     * 
     * <span style="color: #3F7E5E">// Query(Relation)</span>
     * cb.query().queryMemberStatus()...;
     * cb.query().queryMemberAddressAsValid(targetDate)...;
     * </pre>
     * @return The instance of condition-query for base-point table to set up query. (NotNull)
     */
    public MemberFollowingCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return getConditionQuery();
    }

    public MemberFollowingCQ getConditionQuery() { // public for parameter comment and internal
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected MemberFollowingCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected MemberFollowingCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        MemberFollowingCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected MemberFollowingCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new MemberFollowingCQ(childQuery, sqlClause, aliasName, nestLevel);
    }

    public ConditionQuery localCQ() {
        return getConditionQuery();
    }

    // ===================================================================================
    //                                                                               Union
    //                                                                               =====
    /**
     * Set up 'union' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #DD4747">union</span>(new UnionQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberFollowingCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<MemberFollowingCB> unionQuery) {
        final MemberFollowingCB cb = new MemberFollowingCB(); cb.xsetupForUnion(this); xsyncUQ(cb); 
        try { lock(); unionQuery.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final MemberFollowingCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #DD4747">unionAll</span>(new UnionQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberFollowingCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<MemberFollowingCB> unionQuery) {
        final MemberFollowingCB cb = new MemberFollowingCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionQuery.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final MemberFollowingCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected MemberNss _nssMemberByMyMemberId;
    public MemberNss getNssMemberByMyMemberId() {
        if (_nssMemberByMyMemberId == null) { _nssMemberByMyMemberId = new MemberNss(null); }
        return _nssMemberByMyMemberId;
    }
    /**
     * Set up relation columns to select clause. <br />
     * (会員)MEMBER by my MY_MEMBER_ID, named 'memberByMyMemberId'.
     * <pre>
     * MemberFollowingCB cb = new MemberFollowingCB();
     * cb.<span style="color: #DD4747">setupSelect_MemberByMyMemberId()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * MemberFollowing memberFollowing = memberFollowingBhv.selectEntityWithDeletedCheck(cb);
     * ... = memberFollowing.<span style="color: #DD4747">getMemberByMyMemberId()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberNss setupSelect_MemberByMyMemberId() {
        assertSetupSelectPurpose("memberByMyMemberId");
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnMyMemberId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryMemberByMyMemberId(); } });
        if (_nssMemberByMyMemberId == null || !_nssMemberByMyMemberId.hasConditionQuery())
        { _nssMemberByMyMemberId = new MemberNss(query().queryMemberByMyMemberId()); }
        return _nssMemberByMyMemberId;
    }

    protected MemberNss _nssMemberByYourMemberId;
    public MemberNss getNssMemberByYourMemberId() {
        if (_nssMemberByYourMemberId == null) { _nssMemberByYourMemberId = new MemberNss(null); }
        return _nssMemberByYourMemberId;
    }
    /**
     * Set up relation columns to select clause. <br />
     * (会員)MEMBER by my YOUR_MEMBER_ID, named 'memberByYourMemberId'.
     * <pre>
     * MemberFollowingCB cb = new MemberFollowingCB();
     * cb.<span style="color: #DD4747">setupSelect_MemberByYourMemberId()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * MemberFollowing memberFollowing = memberFollowingBhv.selectEntityWithDeletedCheck(cb);
     * ... = memberFollowing.<span style="color: #DD4747">getMemberByYourMemberId()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberNss setupSelect_MemberByYourMemberId() {
        assertSetupSelectPurpose("memberByYourMemberId");
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnYourMemberId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryMemberByYourMemberId(); } });
        if (_nssMemberByYourMemberId == null || !_nssMemberByYourMemberId.hasConditionQuery())
        { _nssMemberByYourMemberId = new MemberNss(query().queryMemberByYourMemberId()); }
        return _nssMemberByYourMemberId;
    }

    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected HpSpecification _specification;

    /**
     * Prepare for SpecifyColumn, (Specify)DerivedReferrer. <br />
     * This method should be called after SetupSelect.
     * <pre>
     * cb.setupSelect_MemberStatus(); <span style="color: #3F7E5E">// should be called before specify()</span>
     * cb.specify().columnMemberName();
     * cb.specify().specifyMemberStatus().columnMemberStatusName();
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *         subCB.query().set...
     *     }
     * }, aliasName);
     * </pre>
     * @return The instance of specification. (NotNull)
     */
    public HpSpecification specify() {
        assertSpecifyPurpose();
        if (_specification == null) { _specification = new HpSpecification(this
            , new HpSpQyCall<MemberFollowingCQ>() {
                public boolean has() { return true; }
                public MemberFollowingCQ qy() { return getConditionQuery(); }
            }
            , _purpose, getDBMetaProvider()); }
        return _specification;
    }

    public HpColumnSpHandler localSp() {
        return specify();
    }

    public boolean hasSpecifiedColumn() {
        return _specification != null && _specification.isAlreadySpecifiedRequiredColumn();
    }

    public static class HpSpecification extends HpAbstractSpecification<MemberFollowingCQ> {
        protected MemberCB.HpSpecification _memberByMyMemberId;
        protected MemberCB.HpSpecification _memberByYourMemberId;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<MemberFollowingCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, purpose, dbmetaProvider); }
        /**
         * (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnMemberFollowingId() { return doColumn("MEMBER_FOLLOWING_ID"); }
        /**
         * (わたし)MY_MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnMyMemberId() { return doColumn("MY_MEMBER_ID"); }
        /**
         * (あなた)YOUR_MEMBER_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to MEMBER}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnYourMemberId() { return doColumn("YOUR_MEMBER_ID"); }
        /**
         * (その瞬間)FOLLOW_DATETIME: {IX, NotNull, TIMESTAMP(23, 10)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnFollowDatetime() { return doColumn("FOLLOW_DATETIME"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnMemberFollowingId(); // PK
            if (qyCall().qy().hasConditionQueryMemberByMyMemberId()
                    || qyCall().qy().xgetReferrerQuery() instanceof MemberCQ) {
                columnMyMemberId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMemberByYourMemberId()
                    || qyCall().qy().xgetReferrerQuery() instanceof MemberCQ) {
                columnYourMemberId(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "MEMBER_FOLLOWING"; }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員)MEMBER by my MY_MEMBER_ID, named 'memberByMyMemberId'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberCB.HpSpecification specifyMemberByMyMemberId() {
            assertRelation("memberByMyMemberId");
            if (_memberByMyMemberId == null) {
                _memberByMyMemberId = new MemberCB.HpSpecification(_baseCB, new HpSpQyCall<MemberCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberByMyMemberId(); }
                    public MemberCQ qy() { return _qyCall.qy().queryMemberByMyMemberId(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberByMyMemberId.xsetSyncQyCall(new HpSpQyCall<MemberCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberByMyMemberId(); }
                        public MemberCQ qy() { return xsyncQyCall().qy().queryMemberByMyMemberId(); }
                    });
                }
            }
            return _memberByMyMemberId;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員)MEMBER by my YOUR_MEMBER_ID, named 'memberByYourMemberId'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberCB.HpSpecification specifyMemberByYourMemberId() {
            assertRelation("memberByYourMemberId");
            if (_memberByYourMemberId == null) {
                _memberByYourMemberId = new MemberCB.HpSpecification(_baseCB, new HpSpQyCall<MemberCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberByYourMemberId(); }
                    public MemberCQ qy() { return _qyCall.qy().queryMemberByYourMemberId(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberByYourMemberId.xsetSyncQyCall(new HpSpQyCall<MemberCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberByYourMemberId(); }
                        public MemberCQ qy() { return xsyncQyCall().qy().queryMemberByYourMemberId(); }
                    });
                }
            }
            return _memberByYourMemberId;
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<MemberFollowingCB, MemberFollowingCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<MemberFollowingCB, MemberFollowingCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<MemberFollowingCB, MemberFollowingCQ>() {
                public void setup(String fn, SubQuery<MemberFollowingCB> sq, MemberFollowingCQ cq, String al, DerivedReferrerOption op) {
                    cq.xsmyselfDerive(fn, sq, al, op); } }, _dbmetaProvider);
        }
    }

    // [DBFlute-0.9.5.3]
    // ===================================================================================
    //                                                                        Column Query
    //                                                                        ============
    /**
     * Set up column-query. {column1 = column2}
     * <pre>
     * <span style="color: #3F7E5E">// where FOO &lt; BAR</span>
     * cb.<span style="color: #DD4747">columnQuery</span>(new SpecifyQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberFollowingCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberFollowingCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<MemberFollowingCB> columnQuery(final SpecifyQuery<MemberFollowingCB> leftSpecifyQuery) {
        return xcreateColQyOperand(new HpColQyHandler<MemberFollowingCB>() {
            public HpCalculator handle(SpecifyQuery<MemberFollowingCB> rightSp, String operand) {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), leftSpecifyQuery, rightSp, operand);
            }
        });
    }

    protected MemberFollowingCB xcreateColumnQueryCB() {
        MemberFollowingCB cb = new MemberFollowingCB();
        cb.xsetupForColumnQuery((MemberFollowingCB)this);
        return cb;
    }

    // ===================================================================================
    //                                                                        Dream Cruise
    //                                                                        ============
    /**
     * Welcome to the Dream Cruise for condition-bean deep world. <br />
     * This is very specialty so you can get the frontier spirit. Bon voyage!
     * @return The condition-bean for dream cruise, which is linked to main condition-bean.
     */
    public MemberFollowingCB dreamCruiseCB() {
        MemberFollowingCB cb = new MemberFollowingCB();
        cb.xsetupForDreamCruise((MemberFollowingCB) this);
        return cb;
    }

    protected ConditionBean xdoCreateDreamCruiseCB() {
        return dreamCruiseCB();
    }

    // [DBFlute-0.9.6.3]
    // ===================================================================================
    //                                                                       OrScope Query
    //                                                                       =============
    /**
     * Set up the query for or-scope. <br />
     * (Same-column-and-same-condition-key conditions are allowed in or-scope)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or BAR = '...')</span>
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberFollowingCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orQuery The query for or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<MemberFollowingCB> orQuery) {
        xorSQ((MemberFollowingCB)this, orQuery);
    }

    /**
     * Set up the and-part of or-scope. <br />
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberFollowingCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #DD4747">orScopeQueryAndPart</span>(new AndQuery&lt;MemberFollowingCB&gt;() {
     *             public void query(MemberFollowingCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andQuery The query for and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<MemberFollowingCB> andQuery) {
        xorSQAP((MemberFollowingCB)this, andQuery);
    }

    // ===================================================================================
    //                                                                          DisplaySQL
    //                                                                          ==========
    @Override
    protected SqlAnalyzerFactory getSqlAnalyzerFactory()
    { return new ImplementedInvokerAssistant().assistSqlAnalyzerFactory(); }
    @Override
    protected String getLogDateFormat() { return DBFluteConfig.getInstance().getLogDateFormat(); }
    @Override
    protected String getLogTimestampFormat() { return DBFluteConfig.getInstance().getLogTimestampFormat(); }

    // ===================================================================================
    //                                                                       Meta Handling
    //                                                                       =============
    public boolean hasUnionQueryOrUnionAllQuery() {
        return query().hasUnionQueryOrUnionAllQuery();
    }

    // ===================================================================================
    //                                                                        Purpose Type
    //                                                                        ============
    @Override
    protected void xprepareSyncQyCall(ConditionBean mainCB) {
        final MemberFollowingCB cb;
        if (mainCB != null) {
            cb = (MemberFollowingCB)mainCB;
        } else {
            cb = new MemberFollowingCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall<MemberFollowingCQ>() {
            public boolean has() { return true; }
            public MemberFollowingCQ qy() { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return MemberFollowingCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return MemberFollowingCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String getConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
