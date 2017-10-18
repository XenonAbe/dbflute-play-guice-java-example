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

/**
 * The base condition-bean of VENDOR_CHECK.
 * @author DBFlute(AutoGenerator)
 */
public class BsVendorCheckCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected VendorCheckCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsVendorCheckCB() {
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
        return "VENDOR_CHECK";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param vendorCheckId : PK, NotNull, DECIMAL(16). (NotNull)
     * @return this. (NotNull)
     */
    public VendorCheckCB acceptPK(Long vendorCheckId) {
        assertObjectNotNull("vendorCheckId", vendorCheckId);
        BsVendorCheckCB cb = this;
        cb.query().setVendorCheckId_Equal(vendorCheckId);
        return (VendorCheckCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_VendorCheckId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_VendorCheckId_Desc();
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
    public VendorCheckCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return getConditionQuery();
    }

    public VendorCheckCQ getConditionQuery() { // public for parameter comment and internal
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected VendorCheckCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected VendorCheckCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        VendorCheckCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected VendorCheckCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new VendorCheckCQ(childQuery, sqlClause, aliasName, nestLevel);
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
     * cb.query().<span style="color: #DD4747">union</span>(new UnionQuery&lt;VendorCheckCB&gt;() {
     *     public void query(VendorCheckCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<VendorCheckCB> unionQuery) {
        final VendorCheckCB cb = new VendorCheckCB(); cb.xsetupForUnion(this); xsyncUQ(cb); 
        try { lock(); unionQuery.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final VendorCheckCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #DD4747">unionAll</span>(new UnionQuery&lt;VendorCheckCB&gt;() {
     *     public void query(VendorCheckCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<VendorCheckCB> unionQuery) {
        final VendorCheckCB cb = new VendorCheckCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionQuery.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final VendorCheckCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
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
            , new HpSpQyCall<VendorCheckCQ>() {
                public boolean has() { return true; }
                public VendorCheckCQ qy() { return getConditionQuery(); }
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

    public static class HpSpecification extends HpAbstractSpecification<VendorCheckCQ> {
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<VendorCheckCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, purpose, dbmetaProvider); }
        /**
         * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnVendorCheckId() { return doColumn("VENDOR_CHECK_ID"); }
        /**
         * TYPE_OF_CHAR: {CHAR(3)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnTypeOfChar() { return doColumn("TYPE_OF_CHAR"); }
        /**
         * TYPE_OF_VARCHAR: {VARCHAR(32)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnTypeOfVarchar() { return doColumn("TYPE_OF_VARCHAR"); }
        /**
         * TYPE_OF_CLOB: {CLOB(2147483647)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnTypeOfClob() { return doColumn("TYPE_OF_CLOB"); }
        /**
         * TYPE_OF_TEXT: {CLOB(2147483647)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnTypeOfText() { return doColumn("TYPE_OF_TEXT"); }
        /**
         * TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnTypeOfNumericInteger() { return doColumn("TYPE_OF_NUMERIC_INTEGER"); }
        /**
         * TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnTypeOfNumericBigint() { return doColumn("TYPE_OF_NUMERIC_BIGINT"); }
        /**
         * TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnTypeOfNumericDecimal() { return doColumn("TYPE_OF_NUMERIC_DECIMAL"); }
        /**
         * TYPE_OF_NUMERIC_INTEGER_MIN: {DECIMAL(1)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnTypeOfNumericIntegerMin() { return doColumn("TYPE_OF_NUMERIC_INTEGER_MIN"); }
        /**
         * TYPE_OF_NUMERIC_INTEGER_MAX: {DECIMAL(9)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnTypeOfNumericIntegerMax() { return doColumn("TYPE_OF_NUMERIC_INTEGER_MAX"); }
        /**
         * TYPE_OF_NUMERIC_BIGINT_MIN: {DECIMAL(10)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnTypeOfNumericBigintMin() { return doColumn("TYPE_OF_NUMERIC_BIGINT_MIN"); }
        /**
         * TYPE_OF_NUMERIC_BIGINT_MAX: {DECIMAL(18)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnTypeOfNumericBigintMax() { return doColumn("TYPE_OF_NUMERIC_BIGINT_MAX"); }
        /**
         * TYPE_OF_NUMERIC_SUPERINT_MIN: {DECIMAL(19)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnTypeOfNumericSuperintMin() { return doColumn("TYPE_OF_NUMERIC_SUPERINT_MIN"); }
        /**
         * TYPE_OF_NUMERIC_SUPERINT_MAX: {DECIMAL(38)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnTypeOfNumericSuperintMax() { return doColumn("TYPE_OF_NUMERIC_SUPERINT_MAX"); }
        /**
         * TYPE_OF_NUMERIC_MAXDECIMAL: {DECIMAL(38, 38)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnTypeOfNumericMaxdecimal() { return doColumn("TYPE_OF_NUMERIC_MAXDECIMAL"); }
        /**
         * TYPE_OF_INTEGER: {INTEGER(10)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnTypeOfInteger() { return doColumn("TYPE_OF_INTEGER"); }
        /**
         * TYPE_OF_BIGINT: {BIGINT(19)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnTypeOfBigint() { return doColumn("TYPE_OF_BIGINT"); }
        /**
         * TYPE_OF_DATE: {DATE(8)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnTypeOfDate() { return doColumn("TYPE_OF_DATE"); }
        /**
         * TYPE_OF_TIMESTAMP: {TIMESTAMP(23, 10)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnTypeOfTimestamp() { return doColumn("TYPE_OF_TIMESTAMP"); }
        /**
         * TYPE_OF_TIME: {TIME(6)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnTypeOfTime() { return doColumn("TYPE_OF_TIME"); }
        /**
         * TYPE_OF_BOOLEAN: {BOOLEAN(1)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnTypeOfBoolean() { return doColumn("TYPE_OF_BOOLEAN"); }
        /**
         * TYPE_OF_BINARY: {VARBINARY(2147483647)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnTypeOfBinary() { return doColumn("TYPE_OF_BINARY"); }
        /**
         * TYPE_OF_BLOB: {BLOB(2147483647)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnTypeOfBlob() { return doColumn("TYPE_OF_BLOB"); }
        /**
         * TYPE_OF_UUID: {UUID(2147483647)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnTypeOfUuid() { return doColumn("TYPE_OF_UUID"); }
        /**
         * TYPE_OF_ARRAY: {ARRAY}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnTypeOfArray() { return doColumn("TYPE_OF_ARRAY"); }
        /**
         * TYPE_OF_OTHER: {OTHER(2147483647)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnTypeOfOther() { return doColumn("TYPE_OF_OTHER"); }
        /**
         * J_A_V_A_BEANS_PROPERTY: {VARCHAR(10)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnJAVABeansProperty() { return doColumn("J_A_V_A_BEANS_PROPERTY"); }
        /**
         * J_POP_BEANS_PROPERTY: {VARCHAR(10)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnJPopBeansProperty() { return doColumn("J_POP_BEANS_PROPERTY"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnVendorCheckId(); // PK
        }
        @Override
        protected String getTableDbName() { return "VENDOR_CHECK"; }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<VendorCheckCB, VendorCheckCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<VendorCheckCB, VendorCheckCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<VendorCheckCB, VendorCheckCQ>() {
                public void setup(String fn, SubQuery<VendorCheckCB> sq, VendorCheckCQ cq, String al, DerivedReferrerOption op) {
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
     * cb.<span style="color: #DD4747">columnQuery</span>(new SpecifyQuery&lt;VendorCheckCB&gt;() {
     *     public void query(VendorCheckCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;VendorCheckCB&gt;() {
     *     public void query(VendorCheckCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<VendorCheckCB> columnQuery(final SpecifyQuery<VendorCheckCB> leftSpecifyQuery) {
        return xcreateColQyOperand(new HpColQyHandler<VendorCheckCB>() {
            public HpCalculator handle(SpecifyQuery<VendorCheckCB> rightSp, String operand) {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), leftSpecifyQuery, rightSp, operand);
            }
        });
    }

    protected VendorCheckCB xcreateColumnQueryCB() {
        VendorCheckCB cb = new VendorCheckCB();
        cb.xsetupForColumnQuery((VendorCheckCB)this);
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
    public VendorCheckCB dreamCruiseCB() {
        VendorCheckCB cb = new VendorCheckCB();
        cb.xsetupForDreamCruise((VendorCheckCB) this);
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
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;VendorCheckCB&gt;() {
     *     public void query(VendorCheckCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orQuery The query for or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<VendorCheckCB> orQuery) {
        xorSQ((VendorCheckCB)this, orQuery);
    }

    /**
     * Set up the and-part of or-scope. <br />
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;VendorCheckCB&gt;() {
     *     public void query(VendorCheckCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #DD4747">orScopeQueryAndPart</span>(new AndQuery&lt;VendorCheckCB&gt;() {
     *             public void query(VendorCheckCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andQuery The query for and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<VendorCheckCB> andQuery) {
        xorSQAP((VendorCheckCB)this, andQuery);
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
        final VendorCheckCB cb;
        if (mainCB != null) {
            cb = (VendorCheckCB)mainCB;
        } else {
            cb = new VendorCheckCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall<VendorCheckCQ>() {
            public boolean has() { return true; }
            public VendorCheckCQ qy() { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return VendorCheckCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return VendorCheckCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String getConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
