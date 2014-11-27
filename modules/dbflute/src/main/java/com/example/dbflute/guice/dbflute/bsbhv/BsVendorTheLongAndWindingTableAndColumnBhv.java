package com.example.dbflute.guice.dbflute.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.HpSLSFunction;
import org.seasar.dbflute.exception.*;
import org.seasar.dbflute.optional.OptionalEntity;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.guice.dbflute.exbhv.*;
import com.example.dbflute.guice.dbflute.bsbhv.loader.*;
import com.example.dbflute.guice.dbflute.exentity.*;
import com.example.dbflute.guice.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.guice.dbflute.cbean.*;

/**
 * The behavior of VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN as TABLE. <br />
 * <pre>
 * [primary key]
 *     THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID
 *
 * [column]
 *     THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID, THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME, SHORT_NAME, SHORT_SIZE
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     vendorTheLongAndWindingTableAndColumnRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorTheLongAndWindingTableAndColumnBhv extends AbstractBehaviorWritable<VendorTheLongAndWindingTableAndColumn, VendorTheLongAndWindingTableAndColumnCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public VendorTheLongAndWindingTableAndColumnDbm getDBMeta() { return VendorTheLongAndWindingTableAndColumnDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public VendorTheLongAndWindingTableAndColumnCB newConditionBean() { return new VendorTheLongAndWindingTableAndColumnCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * VendorTheLongAndWindingTableAndColumnCB cb = new VendorTheLongAndWindingTableAndColumnCB();
     * cb.query().setFoo...(value);
     * int count = vendorTheLongAndWindingTableAndColumnBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of VendorTheLongAndWindingTableAndColumn. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(VendorTheLongAndWindingTableAndColumnCB cb) {
        return facadeSelectCount(cb);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. <br />
     * It returns not-null optional entity, so you should ... <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, get() without check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * VendorTheLongAndWindingTableAndColumnCB cb = new VendorTheLongAndWindingTableAndColumnCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;VendorTheLongAndWindingTableAndColumn&gt; entity = vendorTheLongAndWindingTableAndColumnBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(vendorTheLongAndWindingTableAndColumn -&gt; {
     *     ...
     * });
     * VendorTheLongAndWindingTableAndColumn vendorTheLongAndWindingTableAndColumn = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(vendorTheLongAndWindingTableAndColumn -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     VendorTheLongAndWindingTableAndColumn vendorTheLongAndWindingTableAndColumn = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of VendorTheLongAndWindingTableAndColumn. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<VendorTheLongAndWindingTableAndColumn> selectEntity(VendorTheLongAndWindingTableAndColumnCB cb) {
        return facadeSelectEntity(cb);
    }

    protected OptionalEntity<VendorTheLongAndWindingTableAndColumn> facadeSelectEntity(VendorTheLongAndWindingTableAndColumnCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorTheLongAndWindingTableAndColumn> OptionalEntity<ENTITY> doSelectOptionalEntity(VendorTheLongAndWindingTableAndColumnCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElseNull(); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * VendorTheLongAndWindingTableAndColumnCB cb = new VendorTheLongAndWindingTableAndColumnCB();
     * cb.query().setFoo...(value);
     * VendorTheLongAndWindingTableAndColumn vendorTheLongAndWindingTableAndColumn = vendorTheLongAndWindingTableAndColumnBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendorTheLongAndWindingTableAndColumn.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of VendorTheLongAndWindingTableAndColumn. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorTheLongAndWindingTableAndColumn selectEntityWithDeletedCheck(VendorTheLongAndWindingTableAndColumnCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param theLongAndWindingTableAndColumnId : PK, NotNull, BIGINT(19). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<VendorTheLongAndWindingTableAndColumn> selectByPK(Long theLongAndWindingTableAndColumnId) {
        return facadeSelectByPK(theLongAndWindingTableAndColumnId);
    }

    protected OptionalEntity<VendorTheLongAndWindingTableAndColumn> facadeSelectByPK(Long theLongAndWindingTableAndColumnId) {
        return doSelectOptionalByPK(theLongAndWindingTableAndColumnId, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorTheLongAndWindingTableAndColumn> ENTITY doSelectByPK(Long theLongAndWindingTableAndColumnId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(theLongAndWindingTableAndColumnId), tp);
    }

    protected <ENTITY extends VendorTheLongAndWindingTableAndColumn> OptionalEntity<ENTITY> doSelectOptionalByPK(Long theLongAndWindingTableAndColumnId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(theLongAndWindingTableAndColumnId, tp), theLongAndWindingTableAndColumnId);
    }

    protected VendorTheLongAndWindingTableAndColumnCB xprepareCBAsPK(Long theLongAndWindingTableAndColumnId) {
        assertObjectNotNull("theLongAndWindingTableAndColumnId", theLongAndWindingTableAndColumnId);
        return newConditionBean().acceptPK(theLongAndWindingTableAndColumnId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param theLongAndWindingTableAndColumnName : UQ, NotNull, VARCHAR(200). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<VendorTheLongAndWindingTableAndColumn> selectByUniqueOf(String theLongAndWindingTableAndColumnName) {
        return facadeSelectByUniqueOf(theLongAndWindingTableAndColumnName);
    }

    protected OptionalEntity<VendorTheLongAndWindingTableAndColumn> facadeSelectByUniqueOf(String theLongAndWindingTableAndColumnName) {
        return doSelectByUniqueOf(theLongAndWindingTableAndColumnName, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorTheLongAndWindingTableAndColumn> OptionalEntity<ENTITY> doSelectByUniqueOf(String theLongAndWindingTableAndColumnName, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(theLongAndWindingTableAndColumnName), tp), theLongAndWindingTableAndColumnName);
    }

    protected VendorTheLongAndWindingTableAndColumnCB xprepareCBAsUniqueOf(String theLongAndWindingTableAndColumnName) {
        assertObjectNotNull("theLongAndWindingTableAndColumnName", theLongAndWindingTableAndColumnName);
        return newConditionBean().acceptUniqueOf(theLongAndWindingTableAndColumnName);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * VendorTheLongAndWindingTableAndColumnCB cb = new VendorTheLongAndWindingTableAndColumnCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;VendorTheLongAndWindingTableAndColumn&gt; vendorTheLongAndWindingTableAndColumnList = vendorTheLongAndWindingTableAndColumnBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (VendorTheLongAndWindingTableAndColumn vendorTheLongAndWindingTableAndColumn : vendorTheLongAndWindingTableAndColumnList) {
     *     ... = vendorTheLongAndWindingTableAndColumn.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorTheLongAndWindingTableAndColumn. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<VendorTheLongAndWindingTableAndColumn> selectList(VendorTheLongAndWindingTableAndColumnCB cb) {
        return facadeSelectList(cb);
    }

    @Override
    protected boolean isEntityDerivedMappable() { return true; }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * VendorTheLongAndWindingTableAndColumnCB cb = new VendorTheLongAndWindingTableAndColumnCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;VendorTheLongAndWindingTableAndColumn&gt; page = vendorTheLongAndWindingTableAndColumnBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (VendorTheLongAndWindingTableAndColumn vendorTheLongAndWindingTableAndColumn : page) {
     *     ... = vendorTheLongAndWindingTableAndColumn.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorTheLongAndWindingTableAndColumn. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<VendorTheLongAndWindingTableAndColumn> selectPage(VendorTheLongAndWindingTableAndColumnCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * VendorTheLongAndWindingTableAndColumnCB cb = new VendorTheLongAndWindingTableAndColumnCB();
     * cb.query().setFoo...(value);
     * vendorTheLongAndWindingTableAndColumnBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;VendorTheLongAndWindingTableAndColumn&gt;() {
     *     public void handle(VendorTheLongAndWindingTableAndColumn entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of VendorTheLongAndWindingTableAndColumn. (NotNull)
     * @param entityRowHandler The handler of entity row of VendorTheLongAndWindingTableAndColumn. (NotNull)
     */
    public void selectCursor(VendorTheLongAndWindingTableAndColumnCB cb, EntityRowHandler<VendorTheLongAndWindingTableAndColumn> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * vendorTheLongAndWindingTableAndColumnBhv.<span style="color: #DD4747">selectScalar</span>(Date.class).max(new ScalarQuery() {
     *     public void query(VendorTheLongAndWindingTableAndColumnCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<VendorTheLongAndWindingTableAndColumnCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    @Override
    protected Number doReadNextVal() {
        String msg = "This table is NOT related to sequence: " + getTableDbName();
        throw new UnsupportedOperationException(msg);
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * Load referrer by the the referrer loader. <br />
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.query().set...
     * List&lt;Member&gt; memberList = memberBhv.selectList(cb);
     * memberBhv.<span style="color: #DD4747">load</span>(memberList, loader -&gt; {
     *     loader.<span style="color: #DD4747">loadPurchaseList</span>(purchaseCB -&gt; {
     *         purchaseCB.query().set...
     *         purchaseCB.query().addOrderBy_PurchasePrice_Desc();
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedList(purchaseLoader -&gt {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePaymentList(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//loader.pulloutMemberStatus().loadMemberLoginList(...)</span>
     * }
     * for (Member member : memberList) {
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #DD4747">getPurchaseList()</span>;
     *     for (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param vendorTheLongAndWindingTableAndColumnList The entity list of vendorTheLongAndWindingTableAndColumn. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<VendorTheLongAndWindingTableAndColumn> vendorTheLongAndWindingTableAndColumnList, ReferrerLoaderHandler<LoaderOfVendorTheLongAndWindingTableAndColumn> handler) {
        xassLRArg(vendorTheLongAndWindingTableAndColumnList, handler);
        handler.handle(new LoaderOfVendorTheLongAndWindingTableAndColumn().ready(vendorTheLongAndWindingTableAndColumnList, _behaviorSelector));
    }

    /**
     * Load referrer of ${referrer.referrerJavaBeansRulePropertyName} by the referrer loader. <br />
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.query().set...
     * Member member = memberBhv.selectEntityWithDeletedCheck(cb);
     * memberBhv.<span style="color: #DD4747">load</span>(member, loader -&gt; {
     *     loader.<span style="color: #DD4747">loadPurchaseList</span>(purchaseCB -&gt; {
     *         purchaseCB.query().set...
     *         purchaseCB.query().addOrderBy_PurchasePrice_Desc();
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedList(purchaseLoader -&gt {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePaymentList(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//loader.pulloutMemberStatus().loadMemberLoginList(...)</span>
     * }
     * for (Member member : memberList) {
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #DD4747">getPurchaseList()</span>;
     *     for (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param vendorTheLongAndWindingTableAndColumn The entity of vendorTheLongAndWindingTableAndColumn. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(VendorTheLongAndWindingTableAndColumn vendorTheLongAndWindingTableAndColumn, ReferrerLoaderHandler<LoaderOfVendorTheLongAndWindingTableAndColumn> handler) {
        xassLRArg(vendorTheLongAndWindingTableAndColumn, handler);
        handler.handle(new LoaderOfVendorTheLongAndWindingTableAndColumn().ready(xnewLRAryLs(vendorTheLongAndWindingTableAndColumn), _behaviorSelector));
    }

    /**
     * Load referrer of vendorTheLongAndWindingTableAndColumnRefList by the set-upper of referrer. <br />
     * VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF by THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID, named 'vendorTheLongAndWindingTableAndColumnRefList'.
     * <pre>
     * vendorTheLongAndWindingTableAndColumnBhv.<span style="color: #DD4747">loadVendorTheLongAndWindingTableAndColumnRef</span>(vendorTheLongAndWindingTableAndColumnList, new ReferrerConditionSetupper&lt;VendorTheLongAndWindingTableAndColumnRefCB&gt;() {
     *     public void setup(VendorTheLongAndWindingTableAndColumnRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (VendorTheLongAndWindingTableAndColumn vendorTheLongAndWindingTableAndColumn : vendorTheLongAndWindingTableAndColumnList) {
     *     ... = vendorTheLongAndWindingTableAndColumn.<span style="color: #DD4747">getVendorTheLongAndWindingTableAndColumnRefList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTheLongAndWindingTableAndColumnId_InScope(pkList);
     * cb.query().addOrderBy_TheLongAndWindingTableAndColumnId_Asc();
     * </pre>
     * @param vendorTheLongAndWindingTableAndColumnList The entity list of vendorTheLongAndWindingTableAndColumn. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<VendorTheLongAndWindingTableAndColumnRef> loadVendorTheLongAndWindingTableAndColumnRef(List<VendorTheLongAndWindingTableAndColumn> vendorTheLongAndWindingTableAndColumnList, ReferrerConditionSetupper<VendorTheLongAndWindingTableAndColumnRefCB> setupper) {
        xassLRArg(vendorTheLongAndWindingTableAndColumnList, setupper);
        return doLoadVendorTheLongAndWindingTableAndColumnRef(vendorTheLongAndWindingTableAndColumnList, new LoadReferrerOption<VendorTheLongAndWindingTableAndColumnRefCB, VendorTheLongAndWindingTableAndColumnRef>().xinit(setupper));
    }

    /**
     * Load referrer of vendorTheLongAndWindingTableAndColumnRefList by the set-upper of referrer. <br />
     * VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF by THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID, named 'vendorTheLongAndWindingTableAndColumnRefList'.
     * <pre>
     * vendorTheLongAndWindingTableAndColumnBhv.<span style="color: #DD4747">loadVendorTheLongAndWindingTableAndColumnRef</span>(vendorTheLongAndWindingTableAndColumnList, new ReferrerConditionSetupper&lt;VendorTheLongAndWindingTableAndColumnRefCB&gt;() {
     *     public void setup(VendorTheLongAndWindingTableAndColumnRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = vendorTheLongAndWindingTableAndColumn.<span style="color: #DD4747">getVendorTheLongAndWindingTableAndColumnRefList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTheLongAndWindingTableAndColumnId_InScope(pkList);
     * cb.query().addOrderBy_TheLongAndWindingTableAndColumnId_Asc();
     * </pre>
     * @param vendorTheLongAndWindingTableAndColumn The entity of vendorTheLongAndWindingTableAndColumn. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<VendorTheLongAndWindingTableAndColumnRef> loadVendorTheLongAndWindingTableAndColumnRef(VendorTheLongAndWindingTableAndColumn vendorTheLongAndWindingTableAndColumn, ReferrerConditionSetupper<VendorTheLongAndWindingTableAndColumnRefCB> setupper) {
        xassLRArg(vendorTheLongAndWindingTableAndColumn, setupper);
        return doLoadVendorTheLongAndWindingTableAndColumnRef(xnewLRLs(vendorTheLongAndWindingTableAndColumn), new LoadReferrerOption<VendorTheLongAndWindingTableAndColumnRefCB, VendorTheLongAndWindingTableAndColumnRef>().xinit(setupper));
    }

    protected NestedReferrerListGateway<VendorTheLongAndWindingTableAndColumnRef> doLoadVendorTheLongAndWindingTableAndColumnRef(List<VendorTheLongAndWindingTableAndColumn> vendorTheLongAndWindingTableAndColumnList, LoadReferrerOption<VendorTheLongAndWindingTableAndColumnRefCB, VendorTheLongAndWindingTableAndColumnRef> option) {
        return helpLoadReferrerInternally(vendorTheLongAndWindingTableAndColumnList, option, "vendorTheLongAndWindingTableAndColumnRefList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key theLongAndWindingTableAndColumnId.
     * @param vendorTheLongAndWindingTableAndColumnList The list of vendorTheLongAndWindingTableAndColumn. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractTheLongAndWindingTableAndColumnIdList(List<VendorTheLongAndWindingTableAndColumn> vendorTheLongAndWindingTableAndColumnList)
    { return helpExtractListInternally(vendorTheLongAndWindingTableAndColumnList, "theLongAndWindingTableAndColumnId"); }

    /**
     * Extract the value list of (single) unique key theLongAndWindingTableAndColumnName.
     * @param vendorTheLongAndWindingTableAndColumnList The list of vendorTheLongAndWindingTableAndColumn. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractTheLongAndWindingTableAndColumnNameList(List<VendorTheLongAndWindingTableAndColumn> vendorTheLongAndWindingTableAndColumnList)
    { return helpExtractListInternally(vendorTheLongAndWindingTableAndColumnList, "theLongAndWindingTableAndColumnName"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * VendorTheLongAndWindingTableAndColumn vendorTheLongAndWindingTableAndColumn = new VendorTheLongAndWindingTableAndColumn();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorTheLongAndWindingTableAndColumn.setFoo...(value);
     * vendorTheLongAndWindingTableAndColumn.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorTheLongAndWindingTableAndColumn.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorTheLongAndWindingTableAndColumn.set...;</span>
     * vendorTheLongAndWindingTableAndColumnBhv.<span style="color: #DD4747">insert</span>(vendorTheLongAndWindingTableAndColumn);
     * ... = vendorTheLongAndWindingTableAndColumn.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param vendorTheLongAndWindingTableAndColumn The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(VendorTheLongAndWindingTableAndColumn vendorTheLongAndWindingTableAndColumn) {
        doInsert(vendorTheLongAndWindingTableAndColumn, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * VendorTheLongAndWindingTableAndColumn vendorTheLongAndWindingTableAndColumn = new VendorTheLongAndWindingTableAndColumn();
     * vendorTheLongAndWindingTableAndColumn.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorTheLongAndWindingTableAndColumn.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorTheLongAndWindingTableAndColumn.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorTheLongAndWindingTableAndColumn.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorTheLongAndWindingTableAndColumn.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorTheLongAndWindingTableAndColumnBhv.<span style="color: #DD4747">update</span>(vendorTheLongAndWindingTableAndColumn);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorTheLongAndWindingTableAndColumn The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(VendorTheLongAndWindingTableAndColumn vendorTheLongAndWindingTableAndColumn) {
        doUpdate(vendorTheLongAndWindingTableAndColumn, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param vendorTheLongAndWindingTableAndColumn The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(VendorTheLongAndWindingTableAndColumn vendorTheLongAndWindingTableAndColumn) {
        doInsertOrUpdate(vendorTheLongAndWindingTableAndColumn, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * VendorTheLongAndWindingTableAndColumn vendorTheLongAndWindingTableAndColumn = new VendorTheLongAndWindingTableAndColumn();
     * vendorTheLongAndWindingTableAndColumn.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorTheLongAndWindingTableAndColumn.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorTheLongAndWindingTableAndColumnBhv.<span style="color: #DD4747">delete</span>(vendorTheLongAndWindingTableAndColumn);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorTheLongAndWindingTableAndColumn The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(VendorTheLongAndWindingTableAndColumn vendorTheLongAndWindingTableAndColumn) {
        doDelete(vendorTheLongAndWindingTableAndColumn, null);
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <p><span style="color: #DD4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * for (... : ...) {
     *     VendorTheLongAndWindingTableAndColumn vendorTheLongAndWindingTableAndColumn = new VendorTheLongAndWindingTableAndColumn();
     *     vendorTheLongAndWindingTableAndColumn.setFooName("foo");
     *     if (...) {
     *         vendorTheLongAndWindingTableAndColumn.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     vendorTheLongAndWindingTableAndColumnList.add(vendorTheLongAndWindingTableAndColumn);
     * }
     * vendorTheLongAndWindingTableAndColumnBhv.<span style="color: #DD4747">batchInsert</span>(vendorTheLongAndWindingTableAndColumnList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param vendorTheLongAndWindingTableAndColumnList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<VendorTheLongAndWindingTableAndColumn> vendorTheLongAndWindingTableAndColumnList) {
        return doBatchInsert(vendorTheLongAndWindingTableAndColumnList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     VendorTheLongAndWindingTableAndColumn vendorTheLongAndWindingTableAndColumn = new VendorTheLongAndWindingTableAndColumn();
     *     vendorTheLongAndWindingTableAndColumn.setFooName("foo");
     *     if (...) {
     *         vendorTheLongAndWindingTableAndColumn.setFooPrice(123);
     *     } else {
     *         vendorTheLongAndWindingTableAndColumn.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//vendorTheLongAndWindingTableAndColumn.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     vendorTheLongAndWindingTableAndColumnList.add(vendorTheLongAndWindingTableAndColumn);
     * }
     * vendorTheLongAndWindingTableAndColumnBhv.<span style="color: #DD4747">batchUpdate</span>(vendorTheLongAndWindingTableAndColumnList);
     * </pre>
     * @param vendorTheLongAndWindingTableAndColumnList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorTheLongAndWindingTableAndColumn> vendorTheLongAndWindingTableAndColumnList) {
        return doBatchUpdate(vendorTheLongAndWindingTableAndColumnList, null);
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * vendorTheLongAndWindingTableAndColumnBhv.<span style="color: #DD4747">batchUpdate</span>(vendorTheLongAndWindingTableAndColumnList, new SpecifyQuery<VendorTheLongAndWindingTableAndColumnCB>() {
     *     public void specify(VendorTheLongAndWindingTableAndColumnCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * vendorTheLongAndWindingTableAndColumnBhv.<span style="color: #DD4747">batchUpdate</span>(vendorTheLongAndWindingTableAndColumnList, new SpecifyQuery<VendorTheLongAndWindingTableAndColumnCB>() {
     *     public void specify(VendorTheLongAndWindingTableAndColumnCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param vendorTheLongAndWindingTableAndColumnList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorTheLongAndWindingTableAndColumn> vendorTheLongAndWindingTableAndColumnList, SpecifyQuery<VendorTheLongAndWindingTableAndColumnCB> updateColumnSpec) {
        return doBatchUpdate(vendorTheLongAndWindingTableAndColumnList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param vendorTheLongAndWindingTableAndColumnList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<VendorTheLongAndWindingTableAndColumn> vendorTheLongAndWindingTableAndColumnList) {
        return doBatchDelete(vendorTheLongAndWindingTableAndColumnList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * vendorTheLongAndWindingTableAndColumnBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;VendorTheLongAndWindingTableAndColumn, VendorTheLongAndWindingTableAndColumnCB&gt;() {
     *     public ConditionBean setup(VendorTheLongAndWindingTableAndColumn entity, VendorTheLongAndWindingTableAndColumnCB intoCB) {
     *         FooCB cb = FooCB();
     *         cb.setupSelect_Bar();
     *
     *         <span style="color: #3F7E5E">// mapping</span>
     *         intoCB.specify().columnMyName().mappedFrom(cb.specify().columnFooName());
     *         intoCB.specify().columnMyCount().mappedFrom(cb.specify().columnFooCount());
     *         intoCB.specify().columnMyDate().mappedFrom(cb.specify().specifyBar().columnBarDate());
     *         entity.setMyFixedValue("foo"); <span style="color: #3F7E5E">// fixed value</span>
     *         <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     *         <span style="color: #3F7E5E">//entity.setRegisterUser(value);</span>
     *         <span style="color: #3F7E5E">//entity.set...;</span>
     *         <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     *         <span style="color: #3F7E5E">//entity.setVersionNo(value);</span>
     *
     *         return cb;
     *     }
     * });
     * </pre>
     * @param setupper The set-upper of query-insert. (NotNull)
     * @return The inserted count.
     */
    public int queryInsert(QueryInsertSetupper<VendorTheLongAndWindingTableAndColumn, VendorTheLongAndWindingTableAndColumnCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * VendorTheLongAndWindingTableAndColumn vendorTheLongAndWindingTableAndColumn = new VendorTheLongAndWindingTableAndColumn();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorTheLongAndWindingTableAndColumn.setPK...(value);</span>
     * vendorTheLongAndWindingTableAndColumn.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorTheLongAndWindingTableAndColumn.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorTheLongAndWindingTableAndColumn.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorTheLongAndWindingTableAndColumn.setVersionNo(value);</span>
     * VendorTheLongAndWindingTableAndColumnCB cb = new VendorTheLongAndWindingTableAndColumnCB();
     * cb.query().setFoo...(value);
     * vendorTheLongAndWindingTableAndColumnBhv.<span style="color: #DD4747">queryUpdate</span>(vendorTheLongAndWindingTableAndColumn, cb);
     * </pre>
     * @param vendorTheLongAndWindingTableAndColumn The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of VendorTheLongAndWindingTableAndColumn. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(VendorTheLongAndWindingTableAndColumn vendorTheLongAndWindingTableAndColumn, VendorTheLongAndWindingTableAndColumnCB cb) {
        return doQueryUpdate(vendorTheLongAndWindingTableAndColumn, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * VendorTheLongAndWindingTableAndColumnCB cb = new VendorTheLongAndWindingTableAndColumnCB();
     * cb.query().setFoo...(value);
     * vendorTheLongAndWindingTableAndColumnBhv.<span style="color: #DD4747">queryDelete</span>(vendorTheLongAndWindingTableAndColumn, cb);
     * </pre>
     * @param cb The condition-bean of VendorTheLongAndWindingTableAndColumn. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(VendorTheLongAndWindingTableAndColumnCB cb) {
        return doQueryDelete(cb, null);
    }

    // ===================================================================================
    //                                                                      Varying Update
    //                                                                      ==============
    // -----------------------------------------------------
    //                                         Entity Update
    //                                         -------------
    /**
     * Insert the entity with varying requests. <br />
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br />
     * Other specifications are same as insert(entity).
     * <pre>
     * VendorTheLongAndWindingTableAndColumn vendorTheLongAndWindingTableAndColumn = new VendorTheLongAndWindingTableAndColumn();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorTheLongAndWindingTableAndColumn.setFoo...(value);
     * vendorTheLongAndWindingTableAndColumn.setBar...(value);
     * InsertOption<VendorTheLongAndWindingTableAndColumnCB> option = new InsertOption<VendorTheLongAndWindingTableAndColumnCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * vendorTheLongAndWindingTableAndColumnBhv.<span style="color: #DD4747">varyingInsert</span>(vendorTheLongAndWindingTableAndColumn, option);
     * ... = vendorTheLongAndWindingTableAndColumn.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param vendorTheLongAndWindingTableAndColumn The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(VendorTheLongAndWindingTableAndColumn vendorTheLongAndWindingTableAndColumn, InsertOption<VendorTheLongAndWindingTableAndColumnCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(vendorTheLongAndWindingTableAndColumn, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * VendorTheLongAndWindingTableAndColumn vendorTheLongAndWindingTableAndColumn = new VendorTheLongAndWindingTableAndColumn();
     * vendorTheLongAndWindingTableAndColumn.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorTheLongAndWindingTableAndColumn.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorTheLongAndWindingTableAndColumn.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;VendorTheLongAndWindingTableAndColumnCB&gt; option = new UpdateOption&lt;VendorTheLongAndWindingTableAndColumnCB&gt;();
     *     option.self(new SpecifyQuery&lt;VendorTheLongAndWindingTableAndColumnCB&gt;() {
     *         public void specify(VendorTheLongAndWindingTableAndColumnCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     vendorTheLongAndWindingTableAndColumnBhv.<span style="color: #DD4747">varyingUpdate</span>(vendorTheLongAndWindingTableAndColumn, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorTheLongAndWindingTableAndColumn The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(VendorTheLongAndWindingTableAndColumn vendorTheLongAndWindingTableAndColumn, UpdateOption<VendorTheLongAndWindingTableAndColumnCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(vendorTheLongAndWindingTableAndColumn, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param vendorTheLongAndWindingTableAndColumn The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(VendorTheLongAndWindingTableAndColumn vendorTheLongAndWindingTableAndColumn, InsertOption<VendorTheLongAndWindingTableAndColumnCB> insertOption, UpdateOption<VendorTheLongAndWindingTableAndColumnCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(vendorTheLongAndWindingTableAndColumn, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param vendorTheLongAndWindingTableAndColumn The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(VendorTheLongAndWindingTableAndColumn vendorTheLongAndWindingTableAndColumn, DeleteOption<VendorTheLongAndWindingTableAndColumnCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(vendorTheLongAndWindingTableAndColumn, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param vendorTheLongAndWindingTableAndColumnList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<VendorTheLongAndWindingTableAndColumn> vendorTheLongAndWindingTableAndColumnList, InsertOption<VendorTheLongAndWindingTableAndColumnCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(vendorTheLongAndWindingTableAndColumnList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param vendorTheLongAndWindingTableAndColumnList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<VendorTheLongAndWindingTableAndColumn> vendorTheLongAndWindingTableAndColumnList, UpdateOption<VendorTheLongAndWindingTableAndColumnCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(vendorTheLongAndWindingTableAndColumnList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param vendorTheLongAndWindingTableAndColumnList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<VendorTheLongAndWindingTableAndColumn> vendorTheLongAndWindingTableAndColumnList, DeleteOption<VendorTheLongAndWindingTableAndColumnCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(vendorTheLongAndWindingTableAndColumnList, option);
    }

    // -----------------------------------------------------
    //                                          Query Update
    //                                          ------------
    /**
     * Insert the several entities by query with varying requests (modified-only for fixed value). <br />
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br />
     * Other specifications are same as queryInsert(entity, setupper).
     * @param setupper The set-upper of query-insert. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The inserted count.
     */
    public int varyingQueryInsert(QueryInsertSetupper<VendorTheLongAndWindingTableAndColumn, VendorTheLongAndWindingTableAndColumnCB> setupper, InsertOption<VendorTheLongAndWindingTableAndColumnCB> option) {
        assertInsertOptionNotNull(option);
        return doQueryInsert(setupper, option);
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * VendorTheLongAndWindingTableAndColumn vendorTheLongAndWindingTableAndColumn = new VendorTheLongAndWindingTableAndColumn();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorTheLongAndWindingTableAndColumn.setPK...(value);</span>
     * vendorTheLongAndWindingTableAndColumn.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorTheLongAndWindingTableAndColumn.setVersionNo(value);</span>
     * VendorTheLongAndWindingTableAndColumnCB cb = new VendorTheLongAndWindingTableAndColumnCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;VendorTheLongAndWindingTableAndColumnCB&gt; option = new UpdateOption&lt;VendorTheLongAndWindingTableAndColumnCB&gt;();
     * option.self(new SpecifyQuery&lt;VendorTheLongAndWindingTableAndColumnCB&gt;() {
     *     public void specify(VendorTheLongAndWindingTableAndColumnCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * vendorTheLongAndWindingTableAndColumnBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(vendorTheLongAndWindingTableAndColumn, cb, option);
     * </pre>
     * @param vendorTheLongAndWindingTableAndColumn The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of VendorTheLongAndWindingTableAndColumn. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(VendorTheLongAndWindingTableAndColumn vendorTheLongAndWindingTableAndColumn, VendorTheLongAndWindingTableAndColumnCB cb, UpdateOption<VendorTheLongAndWindingTableAndColumnCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(vendorTheLongAndWindingTableAndColumn, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of VendorTheLongAndWindingTableAndColumn. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(VendorTheLongAndWindingTableAndColumnCB cb, DeleteOption<VendorTheLongAndWindingTableAndColumnCB> option) {
        assertDeleteOptionNotNull(option);
        return doQueryDelete(cb, option);
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the basic executor of outside-SQL to execute it. <br />
     * The invoker of behavior command should be not null when you call this method.
     * <pre>
     * You can use the methods for outside-SQL are as follows:
     * {Basic}
     *   o selectList()
     *   o execute()
     *   o call()
     *
     * {Entity}
     *   o entityHandling().selectEntity()
     *   o entityHandling().selectEntityWithDeletedCheck()
     *
     * {Paging}
     *   o autoPaging().selectList()
     *   o autoPaging().selectPage()
     *   o manualPaging().selectList()
     *   o manualPaging().selectPage()
     *
     * {Cursor}
     *   o cursorHandling().selectCursor()
     *
     * {Option}
     *   o dynamicBinding().selectList()
     *   o removeBlockComment().selectList()
     *   o removeLineComment().selectList()
     *   o formatSql().selectList()
     * </pre>
     * @return The basic executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<VendorTheLongAndWindingTableAndColumnBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends VendorTheLongAndWindingTableAndColumn> typeOfSelectedEntity() { return VendorTheLongAndWindingTableAndColumn.class; }
    protected Class<VendorTheLongAndWindingTableAndColumn> typeOfHandlingEntity() { return VendorTheLongAndWindingTableAndColumn.class; }
    protected Class<VendorTheLongAndWindingTableAndColumnCB> typeOfHandlingConditionBean() { return VendorTheLongAndWindingTableAndColumnCB.class; }
}
