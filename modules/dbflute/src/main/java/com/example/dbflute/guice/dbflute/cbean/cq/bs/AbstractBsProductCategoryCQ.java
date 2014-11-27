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
 * The abstract condition-query of PRODUCT_CATEGORY.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsProductCategoryCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsProductCategoryCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "PRODUCT_CATEGORY";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (商品カテゴリコード)PRODUCT_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     * @param productCategoryCode The value of productCategoryCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductCategoryCode_Equal(String productCategoryCode) {
        doSetProductCategoryCode_Equal(fRES(productCategoryCode));
    }

    protected void doSetProductCategoryCode_Equal(String productCategoryCode) {
        regProductCategoryCode(CK_EQ, hSC("PRODUCT_CATEGORY_CODE", productCategoryCode, 3, "E"));
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (商品カテゴリコード)PRODUCT_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     * @param productCategoryCode The value of productCategoryCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductCategoryCode_NotEqual(String productCategoryCode) {
        doSetProductCategoryCode_NotEqual(fRES(productCategoryCode));
    }

    protected void doSetProductCategoryCode_NotEqual(String productCategoryCode) {
        regProductCategoryCode(CK_NES, hSC("PRODUCT_CATEGORY_CODE", productCategoryCode, 3, "E"));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (商品カテゴリコード)PRODUCT_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     * @param productCategoryCodeList The collection of productCategoryCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductCategoryCode_InScope(Collection<String> productCategoryCodeList) {
        doSetProductCategoryCode_InScope(productCategoryCodeList);
    }

    public void doSetProductCategoryCode_InScope(Collection<String> productCategoryCodeList) {
        regINS(CK_INS, cTL(productCategoryCodeList), getCValueProductCategoryCode(), "PRODUCT_CATEGORY_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (商品カテゴリコード)PRODUCT_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     * @param productCategoryCodeList The collection of productCategoryCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductCategoryCode_NotInScope(Collection<String> productCategoryCodeList) {
        doSetProductCategoryCode_NotInScope(productCategoryCodeList);
    }

    public void doSetProductCategoryCode_NotInScope(Collection<String> productCategoryCodeList) {
        regINS(CK_NINS, cTL(productCategoryCodeList), getCValueProductCategoryCode(), "PRODUCT_CATEGORY_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (商品カテゴリコード)PRODUCT_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     * @param productCategoryCode The value of productCategoryCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductCategoryCode_PrefixSearch(String productCategoryCode) {
        setProductCategoryCode_LikeSearch(productCategoryCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (商品カテゴリコード)PRODUCT_CATEGORY_CODE: {PK, NotNull, CHAR(3)} <br />
     * <pre>e.g. setProductCategoryCode_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productCategoryCode The value of productCategoryCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductCategoryCode_LikeSearch(String productCategoryCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productCategoryCode), getCValueProductCategoryCode(), "PRODUCT_CATEGORY_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (商品カテゴリコード)PRODUCT_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     * @param productCategoryCode The value of productCategoryCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCategoryCode_NotLikeSearch(String productCategoryCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCategoryCode), getCValueProductCategoryCode(), "PRODUCT_CATEGORY_CODE", likeSearchOption);
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select PRODUCT_CATEGORY_CODE from PRODUCT where ...)} <br />
     * (商品)PRODUCT by PRODUCT_CATEGORY_CODE, named 'productAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsProduct</span>(new SubQuery&lt;ProductCB&gt;() {
     *     public void query(ProductCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of ProductList for 'exists'. (NotNull)
     */
    public void existsProduct(SubQuery<ProductCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        ProductCB cb = new ProductCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepProductCategoryCode_ExistsReferrer_ProductList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_CATEGORY_CODE", "PRODUCT_CATEGORY_CODE", pp, "productList");
    }
    public abstract String keepProductCategoryCode_ExistsReferrer_ProductList(ProductCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select PARENT_CATEGORY_CODE from PRODUCT_CATEGORY where ...)} <br />
     * (商品カテゴリ)PRODUCT_CATEGORY by PARENT_CATEGORY_CODE, named 'productCategorySelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsProductCategorySelf</span>(new SubQuery&lt;ProductCategoryCB&gt;() {
     *     public void query(ProductCategoryCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of ProductCategorySelfList for 'exists'. (NotNull)
     */
    public void existsProductCategorySelf(SubQuery<ProductCategoryCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        ProductCategoryCB cb = new ProductCategoryCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepProductCategoryCode_ExistsReferrer_ProductCategorySelfList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_CATEGORY_CODE", "PARENT_CATEGORY_CODE", pp, "productCategorySelfList");
    }
    public abstract String keepProductCategoryCode_ExistsReferrer_ProductCategorySelfList(ProductCategoryCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select PRODUCT_CATEGORY_CODE from PRODUCT where ...)} <br />
     * (商品)PRODUCT by PRODUCT_CATEGORY_CODE, named 'productAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsProduct</span>(new SubQuery&lt;ProductCB&gt;() {
     *     public void query(ProductCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of ProductCategoryCode_NotExistsReferrer_ProductList for 'not exists'. (NotNull)
     */
    public void notExistsProduct(SubQuery<ProductCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        ProductCB cb = new ProductCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepProductCategoryCode_NotExistsReferrer_ProductList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_CATEGORY_CODE", "PRODUCT_CATEGORY_CODE", pp, "productList");
    }
    public abstract String keepProductCategoryCode_NotExistsReferrer_ProductList(ProductCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select PARENT_CATEGORY_CODE from PRODUCT_CATEGORY where ...)} <br />
     * (商品カテゴリ)PRODUCT_CATEGORY by PARENT_CATEGORY_CODE, named 'productCategorySelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsProductCategorySelf</span>(new SubQuery&lt;ProductCategoryCB&gt;() {
     *     public void query(ProductCategoryCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of ProductCategoryCode_NotExistsReferrer_ProductCategorySelfList for 'not exists'. (NotNull)
     */
    public void notExistsProductCategorySelf(SubQuery<ProductCategoryCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        ProductCategoryCB cb = new ProductCategoryCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepProductCategoryCode_NotExistsReferrer_ProductCategorySelfList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_CATEGORY_CODE", "PARENT_CATEGORY_CODE", pp, "productCategorySelfList");
    }
    public abstract String keepProductCategoryCode_NotExistsReferrer_ProductCategorySelfList(ProductCategoryCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PRODUCT_CATEGORY_CODE from PRODUCT where ...)} <br />
     * (商品)PRODUCT by PRODUCT_CATEGORY_CODE, named 'productAsOne'.
     * @param subQuery The sub-query of ProductList for 'in-scope'. (NotNull)
     */
    public void inScopeProductList(SubQuery<ProductCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        ProductCB cb = new ProductCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepProductCategoryCode_InScopeRelation_ProductList(cb.query());
        registerInScopeRelation(cb.query(), "PRODUCT_CATEGORY_CODE", "PRODUCT_CATEGORY_CODE", pp, "productList");
    }
    public abstract String keepProductCategoryCode_InScopeRelation_ProductList(ProductCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PARENT_CATEGORY_CODE from PRODUCT_CATEGORY where ...)} <br />
     * (商品カテゴリ)PRODUCT_CATEGORY by PARENT_CATEGORY_CODE, named 'productCategorySelfAsOne'.
     * @param subQuery The sub-query of ProductCategorySelfList for 'in-scope'. (NotNull)
     */
    public void inScopeProductCategorySelfList(SubQuery<ProductCategoryCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        ProductCategoryCB cb = new ProductCategoryCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepProductCategoryCode_InScopeRelation_ProductCategorySelfList(cb.query());
        registerInScopeRelation(cb.query(), "PRODUCT_CATEGORY_CODE", "PARENT_CATEGORY_CODE", pp, "productCategorySelfList");
    }
    public abstract String keepProductCategoryCode_InScopeRelation_ProductCategorySelfList(ProductCategoryCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PRODUCT_CATEGORY_CODE from PRODUCT where ...)} <br />
     * (商品)PRODUCT by PRODUCT_CATEGORY_CODE, named 'productAsOne'.
     * @param subQuery The sub-query of ProductList for 'not in-scope'. (NotNull)
     */
    public void notInScopeProductList(SubQuery<ProductCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        ProductCB cb = new ProductCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepProductCategoryCode_NotInScopeRelation_ProductList(cb.query());
        registerNotInScopeRelation(cb.query(), "PRODUCT_CATEGORY_CODE", "PRODUCT_CATEGORY_CODE", pp, "productList");
    }
    public abstract String keepProductCategoryCode_NotInScopeRelation_ProductList(ProductCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PARENT_CATEGORY_CODE from PRODUCT_CATEGORY where ...)} <br />
     * (商品カテゴリ)PRODUCT_CATEGORY by PARENT_CATEGORY_CODE, named 'productCategorySelfAsOne'.
     * @param subQuery The sub-query of ProductCategorySelfList for 'not in-scope'. (NotNull)
     */
    public void notInScopeProductCategorySelfList(SubQuery<ProductCategoryCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        ProductCategoryCB cb = new ProductCategoryCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepProductCategoryCode_NotInScopeRelation_ProductCategorySelfList(cb.query());
        registerNotInScopeRelation(cb.query(), "PRODUCT_CATEGORY_CODE", "PARENT_CATEGORY_CODE", pp, "productCategorySelfList");
    }
    public abstract String keepProductCategoryCode_NotInScopeRelation_ProductCategorySelfList(ProductCategoryCQ sq);

    public void xsderiveProductList(String fn, SubQuery<ProductCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ProductCB cb = new ProductCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepProductCategoryCode_SpecifyDerivedReferrer_ProductList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_CATEGORY_CODE", "PRODUCT_CATEGORY_CODE", pp, "productList", al, op);
    }
    public abstract String keepProductCategoryCode_SpecifyDerivedReferrer_ProductList(ProductCQ sq);

    public void xsderiveProductCategorySelfList(String fn, SubQuery<ProductCategoryCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ProductCategoryCB cb = new ProductCategoryCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepProductCategoryCode_SpecifyDerivedReferrer_ProductCategorySelfList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_CATEGORY_CODE", "PARENT_CATEGORY_CODE", pp, "productCategorySelfList", al, op);
    }
    public abstract String keepProductCategoryCode_SpecifyDerivedReferrer_ProductCategorySelfList(ProductCategoryCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from PRODUCT where ...)} <br />
     * (商品)PRODUCT by PRODUCT_CATEGORY_CODE, named 'productAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedProduct()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;ProductCB&gt;() {
     *     public void query(ProductCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<ProductCB> derivedProduct() {
        return xcreateQDRFunctionProductList();
    }
    protected HpQDRFunction<ProductCB> xcreateQDRFunctionProductList() {
        return new HpQDRFunction<ProductCB>(new HpQDRSetupper<ProductCB>() {
            public void setup(String fn, SubQuery<ProductCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveProductList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveProductList(String fn, SubQuery<ProductCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ProductCB cb = new ProductCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepProductCategoryCode_QueryDerivedReferrer_ProductList(cb.query()); String prpp = keepProductCategoryCode_QueryDerivedReferrer_ProductListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_CATEGORY_CODE", "PRODUCT_CATEGORY_CODE", sqpp, "productList", rd, vl, prpp, op);
    }
    public abstract String keepProductCategoryCode_QueryDerivedReferrer_ProductList(ProductCQ sq);
    public abstract String keepProductCategoryCode_QueryDerivedReferrer_ProductListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from PRODUCT_CATEGORY where ...)} <br />
     * (商品カテゴリ)PRODUCT_CATEGORY by PARENT_CATEGORY_CODE, named 'productCategorySelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedProductCategorySelf()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;ProductCategoryCB&gt;() {
     *     public void query(ProductCategoryCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<ProductCategoryCB> derivedProductCategorySelf() {
        return xcreateQDRFunctionProductCategorySelfList();
    }
    protected HpQDRFunction<ProductCategoryCB> xcreateQDRFunctionProductCategorySelfList() {
        return new HpQDRFunction<ProductCategoryCB>(new HpQDRSetupper<ProductCategoryCB>() {
            public void setup(String fn, SubQuery<ProductCategoryCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveProductCategorySelfList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveProductCategorySelfList(String fn, SubQuery<ProductCategoryCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ProductCategoryCB cb = new ProductCategoryCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepProductCategoryCode_QueryDerivedReferrer_ProductCategorySelfList(cb.query()); String prpp = keepProductCategoryCode_QueryDerivedReferrer_ProductCategorySelfListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_CATEGORY_CODE", "PARENT_CATEGORY_CODE", sqpp, "productCategorySelfList", rd, vl, prpp, op);
    }
    public abstract String keepProductCategoryCode_QueryDerivedReferrer_ProductCategorySelfList(ProductCategoryCQ sq);
    public abstract String keepProductCategoryCode_QueryDerivedReferrer_ProductCategorySelfListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * (商品カテゴリコード)PRODUCT_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     */
    public void setProductCategoryCode_IsNull() { regProductCategoryCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * (商品カテゴリコード)PRODUCT_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     */
    public void setProductCategoryCode_IsNotNull() { regProductCategoryCode(CK_ISNN, DOBJ); }

    protected void regProductCategoryCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueProductCategoryCode(), "PRODUCT_CATEGORY_CODE"); }
    protected abstract ConditionValue getCValueProductCategoryCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (商品カテゴリ名称)PRODUCT_CATEGORY_NAME: {NotNull, VARCHAR(50)}
     * @param productCategoryName The value of productCategoryName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductCategoryName_Equal(String productCategoryName) {
        doSetProductCategoryName_Equal(fRES(productCategoryName));
    }

    protected void doSetProductCategoryName_Equal(String productCategoryName) {
        regProductCategoryName(CK_EQ, productCategoryName);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (商品カテゴリ名称)PRODUCT_CATEGORY_NAME: {NotNull, VARCHAR(50)}
     * @param productCategoryName The value of productCategoryName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductCategoryName_PrefixSearch(String productCategoryName) {
        setProductCategoryName_LikeSearch(productCategoryName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (商品カテゴリ名称)PRODUCT_CATEGORY_NAME: {NotNull, VARCHAR(50)} <br />
     * <pre>e.g. setProductCategoryName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productCategoryName The value of productCategoryName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductCategoryName_LikeSearch(String productCategoryName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productCategoryName), getCValueProductCategoryName(), "PRODUCT_CATEGORY_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (商品カテゴリ名称)PRODUCT_CATEGORY_NAME: {NotNull, VARCHAR(50)}
     * @param productCategoryName The value of productCategoryName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCategoryName_NotLikeSearch(String productCategoryName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCategoryName), getCValueProductCategoryName(), "PRODUCT_CATEGORY_NAME", likeSearchOption);
    }

    protected void regProductCategoryName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueProductCategoryName(), "PRODUCT_CATEGORY_NAME"); }
    protected abstract ConditionValue getCValueProductCategoryName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (親カテゴリコード)PARENT_CATEGORY_CODE: {IX, CHAR(3), FK to PRODUCT_CATEGORY}
     * @param parentCategoryCode The value of parentCategoryCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setParentCategoryCode_Equal(String parentCategoryCode) {
        doSetParentCategoryCode_Equal(fRES(parentCategoryCode));
    }

    protected void doSetParentCategoryCode_Equal(String parentCategoryCode) {
        regParentCategoryCode(CK_EQ, hSC("PARENT_CATEGORY_CODE", parentCategoryCode, 3, "E"));
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (親カテゴリコード)PARENT_CATEGORY_CODE: {IX, CHAR(3), FK to PRODUCT_CATEGORY}
     * @param parentCategoryCode The value of parentCategoryCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setParentCategoryCode_NotEqual(String parentCategoryCode) {
        doSetParentCategoryCode_NotEqual(fRES(parentCategoryCode));
    }

    protected void doSetParentCategoryCode_NotEqual(String parentCategoryCode) {
        regParentCategoryCode(CK_NES, hSC("PARENT_CATEGORY_CODE", parentCategoryCode, 3, "E"));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (親カテゴリコード)PARENT_CATEGORY_CODE: {IX, CHAR(3), FK to PRODUCT_CATEGORY}
     * @param parentCategoryCodeList The collection of parentCategoryCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setParentCategoryCode_InScope(Collection<String> parentCategoryCodeList) {
        doSetParentCategoryCode_InScope(parentCategoryCodeList);
    }

    public void doSetParentCategoryCode_InScope(Collection<String> parentCategoryCodeList) {
        regINS(CK_INS, cTL(parentCategoryCodeList), getCValueParentCategoryCode(), "PARENT_CATEGORY_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (親カテゴリコード)PARENT_CATEGORY_CODE: {IX, CHAR(3), FK to PRODUCT_CATEGORY}
     * @param parentCategoryCodeList The collection of parentCategoryCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setParentCategoryCode_NotInScope(Collection<String> parentCategoryCodeList) {
        doSetParentCategoryCode_NotInScope(parentCategoryCodeList);
    }

    public void doSetParentCategoryCode_NotInScope(Collection<String> parentCategoryCodeList) {
        regINS(CK_NINS, cTL(parentCategoryCodeList), getCValueParentCategoryCode(), "PARENT_CATEGORY_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (親カテゴリコード)PARENT_CATEGORY_CODE: {IX, CHAR(3), FK to PRODUCT_CATEGORY}
     * @param parentCategoryCode The value of parentCategoryCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setParentCategoryCode_PrefixSearch(String parentCategoryCode) {
        setParentCategoryCode_LikeSearch(parentCategoryCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (親カテゴリコード)PARENT_CATEGORY_CODE: {IX, CHAR(3), FK to PRODUCT_CATEGORY} <br />
     * <pre>e.g. setParentCategoryCode_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param parentCategoryCode The value of parentCategoryCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setParentCategoryCode_LikeSearch(String parentCategoryCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(parentCategoryCode), getCValueParentCategoryCode(), "PARENT_CATEGORY_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (親カテゴリコード)PARENT_CATEGORY_CODE: {IX, CHAR(3), FK to PRODUCT_CATEGORY}
     * @param parentCategoryCode The value of parentCategoryCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setParentCategoryCode_NotLikeSearch(String parentCategoryCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(parentCategoryCode), getCValueParentCategoryCode(), "PARENT_CATEGORY_CODE", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * (親カテゴリコード)PARENT_CATEGORY_CODE: {IX, CHAR(3), FK to PRODUCT_CATEGORY}
     */
    public void setParentCategoryCode_IsNull() { regParentCategoryCode(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * (親カテゴリコード)PARENT_CATEGORY_CODE: {IX, CHAR(3), FK to PRODUCT_CATEGORY}
     */
    public void setParentCategoryCode_IsNullOrEmpty() { regParentCategoryCode(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * (親カテゴリコード)PARENT_CATEGORY_CODE: {IX, CHAR(3), FK to PRODUCT_CATEGORY}
     */
    public void setParentCategoryCode_IsNotNull() { regParentCategoryCode(CK_ISNN, DOBJ); }

    protected void regParentCategoryCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueParentCategoryCode(), "PARENT_CATEGORY_CODE"); }
    protected abstract ConditionValue getCValueParentCategoryCode();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;ProductCategoryCB&gt;() {
     *     public void query(ProductCategoryCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ProductCategoryCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, ProductCategoryCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;ProductCategoryCB&gt;() {
     *     public void query(ProductCategoryCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ProductCategoryCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, ProductCategoryCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;ProductCategoryCB&gt;() {
     *     public void query(ProductCategoryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ProductCategoryCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, ProductCategoryCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;ProductCategoryCB&gt;() {
     *     public void query(ProductCategoryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ProductCategoryCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, ProductCategoryCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;ProductCategoryCB&gt;() {
     *     public void query(ProductCategoryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ProductCategoryCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, ProductCategoryCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ProductCategoryCB&gt;() {
     *     public void query(ProductCategoryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ProductCategoryCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, ProductCategoryCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        ProductCategoryCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(ProductCategoryCQ sq);

    protected ProductCategoryCB xcreateScalarConditionCB() {
        ProductCategoryCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected ProductCategoryCB xcreateScalarConditionPartitionByCB() {
        ProductCategoryCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<ProductCategoryCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ProductCategoryCB cb = new ProductCategoryCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "PRODUCT_CATEGORY_CODE";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(ProductCategoryCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ProductCategoryCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(ProductCategoryCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ProductCategoryCB cb = new ProductCategoryCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PRODUCT_CATEGORY_CODE";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(ProductCategoryCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<ProductCategoryCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        ProductCategoryCB cb = new ProductCategoryCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(ProductCategoryCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<ProductCategoryCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        ProductCategoryCB cb = new ProductCategoryCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(ProductCategoryCQ sq);

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
    protected ProductCategoryCB newMyCB() {
        return new ProductCategoryCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return ProductCategoryCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
