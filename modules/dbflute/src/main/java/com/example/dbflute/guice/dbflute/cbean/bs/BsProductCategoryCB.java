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
 * The base condition-bean of PRODUCT_CATEGORY.
 * @author DBFlute(AutoGenerator)
 */
public class BsProductCategoryCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ProductCategoryCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsProductCategoryCB() {
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
        return "PRODUCT_CATEGORY";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param productCategoryCode (商品カテゴリコード): PK, NotNull, CHAR(3). (NotNull)
     * @return this. (NotNull)
     */
    public ProductCategoryCB acceptPK(String productCategoryCode) {
        assertObjectNotNull("productCategoryCode", productCategoryCode);
        BsProductCategoryCB cb = this;
        cb.query().setProductCategoryCode_Equal(productCategoryCode);
        return (ProductCategoryCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_ProductCategoryCode_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_ProductCategoryCode_Desc();
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
    public ProductCategoryCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return getConditionQuery();
    }

    public ProductCategoryCQ getConditionQuery() { // public for parameter comment and internal
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected ProductCategoryCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected ProductCategoryCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        ProductCategoryCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected ProductCategoryCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new ProductCategoryCQ(childQuery, sqlClause, aliasName, nestLevel);
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
     * cb.query().<span style="color: #DD4747">union</span>(new UnionQuery&lt;ProductCategoryCB&gt;() {
     *     public void query(ProductCategoryCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<ProductCategoryCB> unionQuery) {
        final ProductCategoryCB cb = new ProductCategoryCB(); cb.xsetupForUnion(this); xsyncUQ(cb); 
        try { lock(); unionQuery.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final ProductCategoryCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #DD4747">unionAll</span>(new UnionQuery&lt;ProductCategoryCB&gt;() {
     *     public void query(ProductCategoryCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<ProductCategoryCB> unionQuery) {
        final ProductCategoryCB cb = new ProductCategoryCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionQuery.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final ProductCategoryCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected ProductCategoryNss _nssProductCategorySelf;
    public ProductCategoryNss getNssProductCategorySelf() {
        if (_nssProductCategorySelf == null) { _nssProductCategorySelf = new ProductCategoryNss(null); }
        return _nssProductCategorySelf;
    }
    /**
     * Set up relation columns to select clause. <br />
     * (商品カテゴリ)PRODUCT_CATEGORY by my PARENT_CATEGORY_CODE, named 'productCategorySelf'.
     * <pre>
     * ProductCategoryCB cb = new ProductCategoryCB();
     * cb.<span style="color: #DD4747">setupSelect_ProductCategorySelf()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * ProductCategory productCategory = productCategoryBhv.selectEntityWithDeletedCheck(cb);
     * ... = productCategory.<span style="color: #DD4747">getProductCategorySelf()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public ProductCategoryNss setupSelect_ProductCategorySelf() {
        assertSetupSelectPurpose("productCategorySelf");
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnParentCategoryCode();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryProductCategorySelf(); } });
        if (_nssProductCategorySelf == null || !_nssProductCategorySelf.hasConditionQuery())
        { _nssProductCategorySelf = new ProductCategoryNss(query().queryProductCategorySelf()); }
        return _nssProductCategorySelf;
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
            , new HpSpQyCall<ProductCategoryCQ>() {
                public boolean has() { return true; }
                public ProductCategoryCQ qy() { return getConditionQuery(); }
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

    public static class HpSpecification extends HpAbstractSpecification<ProductCategoryCQ> {
        protected ProductCategoryCB.HpSpecification _productCategorySelf;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<ProductCategoryCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, purpose, dbmetaProvider); }
        /**
         * (商品カテゴリコード)PRODUCT_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnProductCategoryCode() { return doColumn("PRODUCT_CATEGORY_CODE"); }
        /**
         * (商品カテゴリ名称)PRODUCT_CATEGORY_NAME: {NotNull, VARCHAR(50)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnProductCategoryName() { return doColumn("PRODUCT_CATEGORY_NAME"); }
        /**
         * (親カテゴリコード)PARENT_CATEGORY_CODE: {IX, CHAR(3), FK to PRODUCT_CATEGORY}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnParentCategoryCode() { return doColumn("PARENT_CATEGORY_CODE"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnProductCategoryCode(); // PK
            if (qyCall().qy().hasConditionQueryProductCategorySelf()
                    || qyCall().qy().xgetReferrerQuery() instanceof ProductCategoryCQ) {
                columnParentCategoryCode(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "PRODUCT_CATEGORY"; }
        /**
         * Prepare to specify functions about relation table. <br />
         * (商品カテゴリ)PRODUCT_CATEGORY by my PARENT_CATEGORY_CODE, named 'productCategorySelf'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public ProductCategoryCB.HpSpecification specifyProductCategorySelf() {
            assertRelation("productCategorySelf");
            if (_productCategorySelf == null) {
                _productCategorySelf = new ProductCategoryCB.HpSpecification(_baseCB, new HpSpQyCall<ProductCategoryCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryProductCategorySelf(); }
                    public ProductCategoryCQ qy() { return _qyCall.qy().queryProductCategorySelf(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _productCategorySelf.xsetSyncQyCall(new HpSpQyCall<ProductCategoryCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryProductCategorySelf(); }
                        public ProductCategoryCQ qy() { return xsyncQyCall().qy().queryProductCategorySelf(); }
                    });
                }
            }
            return _productCategorySelf;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br />
         * {select max(FOO) from PRODUCT where ...) as FOO_MAX} <br />
         * (商品)PRODUCT by PRODUCT_CATEGORY_CODE, named 'productList'.
         * <pre>
         * cb.specify().<span style="color: #DD4747">derivedProduct()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;ProductCB&gt;() {
         *     public void query(ProductCB subCB) {
         *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
         *     }
         * }, Product.<span style="color: #DD4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<ProductCB, ProductCategoryCQ> derivedProduct() {
            assertDerived("productList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<ProductCB, ProductCategoryCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<ProductCB, ProductCategoryCQ>() {
                public void setup(String fn, SubQuery<ProductCB> sq, ProductCategoryCQ cq, String al, DerivedReferrerOption op) {
                    cq.xsderiveProductList(fn, sq, al, op); } }, _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br />
         * {select max(FOO) from PRODUCT_CATEGORY where ...) as FOO_MAX} <br />
         * (商品カテゴリ)PRODUCT_CATEGORY by PARENT_CATEGORY_CODE, named 'productCategorySelfList'.
         * <pre>
         * cb.specify().<span style="color: #DD4747">derivedProductCategorySelf()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;ProductCategoryCB&gt;() {
         *     public void query(ProductCategoryCB subCB) {
         *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
         *     }
         * }, ProductCategory.<span style="color: #DD4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<ProductCategoryCB, ProductCategoryCQ> derivedProductCategorySelf() {
            assertDerived("productCategorySelfList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<ProductCategoryCB, ProductCategoryCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<ProductCategoryCB, ProductCategoryCQ>() {
                public void setup(String fn, SubQuery<ProductCategoryCB> sq, ProductCategoryCQ cq, String al, DerivedReferrerOption op) {
                    cq.xsderiveProductCategorySelfList(fn, sq, al, op); } }, _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<ProductCategoryCB, ProductCategoryCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<ProductCategoryCB, ProductCategoryCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<ProductCategoryCB, ProductCategoryCQ>() {
                public void setup(String fn, SubQuery<ProductCategoryCB> sq, ProductCategoryCQ cq, String al, DerivedReferrerOption op) {
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
     * cb.<span style="color: #DD4747">columnQuery</span>(new SpecifyQuery&lt;ProductCategoryCB&gt;() {
     *     public void query(ProductCategoryCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;ProductCategoryCB&gt;() {
     *     public void query(ProductCategoryCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<ProductCategoryCB> columnQuery(final SpecifyQuery<ProductCategoryCB> leftSpecifyQuery) {
        return xcreateColQyOperand(new HpColQyHandler<ProductCategoryCB>() {
            public HpCalculator handle(SpecifyQuery<ProductCategoryCB> rightSp, String operand) {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), leftSpecifyQuery, rightSp, operand);
            }
        });
    }

    protected ProductCategoryCB xcreateColumnQueryCB() {
        ProductCategoryCB cb = new ProductCategoryCB();
        cb.xsetupForColumnQuery((ProductCategoryCB)this);
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
    public ProductCategoryCB dreamCruiseCB() {
        ProductCategoryCB cb = new ProductCategoryCB();
        cb.xsetupForDreamCruise((ProductCategoryCB) this);
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
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;ProductCategoryCB&gt;() {
     *     public void query(ProductCategoryCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orQuery The query for or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<ProductCategoryCB> orQuery) {
        xorSQ((ProductCategoryCB)this, orQuery);
    }

    /**
     * Set up the and-part of or-scope. <br />
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;ProductCategoryCB&gt;() {
     *     public void query(ProductCategoryCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #DD4747">orScopeQueryAndPart</span>(new AndQuery&lt;ProductCategoryCB&gt;() {
     *             public void query(ProductCategoryCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andQuery The query for and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<ProductCategoryCB> andQuery) {
        xorSQAP((ProductCategoryCB)this, andQuery);
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
        final ProductCategoryCB cb;
        if (mainCB != null) {
            cb = (ProductCategoryCB)mainCB;
        } else {
            cb = new ProductCategoryCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall<ProductCategoryCQ>() {
            public boolean has() { return true; }
            public ProductCategoryCQ qy() { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return ProductCategoryCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return ProductCategoryCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String getConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
