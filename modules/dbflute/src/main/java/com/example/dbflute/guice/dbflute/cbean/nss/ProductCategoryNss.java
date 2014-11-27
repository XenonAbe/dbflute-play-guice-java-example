package com.example.dbflute.guice.dbflute.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.guice.dbflute.cbean.cq.ProductCategoryCQ;

/**
 * The nest select set-upper of PRODUCT_CATEGORY.
 * @author DBFlute(AutoGenerator)
 */
public class ProductCategoryNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ProductCategoryCQ _query;
    public ProductCategoryNss(ProductCategoryCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * (商品カテゴリ)PRODUCT_CATEGORY by my PARENT_CATEGORY_CODE, named 'productCategorySelf'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public ProductCategoryNss withProductCategorySelf() {
        _query.doNss(new ProductCategoryCQ.NssCall() { public ConditionQuery qf() { return _query.queryProductCategorySelf(); }});
        return new ProductCategoryNss(_query.queryProductCategorySelf());
    }
}
