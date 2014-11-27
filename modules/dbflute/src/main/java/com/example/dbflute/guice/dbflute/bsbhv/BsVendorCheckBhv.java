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
 * The behavior of VENDOR_CHECK as TABLE. <br />
 * <pre>
 * [primary key]
 *     VENDOR_CHECK_ID
 *
 * [column]
 *     VENDOR_CHECK_ID, TYPE_OF_CHAR, TYPE_OF_VARCHAR, TYPE_OF_CLOB, TYPE_OF_TEXT, TYPE_OF_NUMERIC_INTEGER, TYPE_OF_NUMERIC_BIGINT, TYPE_OF_NUMERIC_DECIMAL, TYPE_OF_NUMERIC_INTEGER_MIN, TYPE_OF_NUMERIC_INTEGER_MAX, TYPE_OF_NUMERIC_BIGINT_MIN, TYPE_OF_NUMERIC_BIGINT_MAX, TYPE_OF_NUMERIC_SUPERINT_MIN, TYPE_OF_NUMERIC_SUPERINT_MAX, TYPE_OF_NUMERIC_MAXDECIMAL, TYPE_OF_INTEGER, TYPE_OF_BIGINT, TYPE_OF_DATE, TYPE_OF_TIMESTAMP, TYPE_OF_TIME, TYPE_OF_BOOLEAN, TYPE_OF_BINARY, TYPE_OF_BLOB, TYPE_OF_UUID, TYPE_OF_ARRAY, TYPE_OF_OTHER, J_A_V_A_BEANS_PROPERTY, J_POP_BEANS_PROPERTY
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
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorCheckBhv extends AbstractBehaviorWritable<VendorCheck, VendorCheckCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    public static final String PATH_whitebox_vendorcheck_selectDoubleByteOnSql = "whitebox:vendorcheck:selectDoubleByteOnSql";
    public static final String PATH_whitebox_vendorcheck_selectSimpleVendorCheck = "whitebox:vendorcheck:selectSimpleVendorCheck";
    public static final String PATH_whitebox_vendorcheck_selectVendorCheckDecimalSum = "whitebox:vendorcheck:selectVendorCheckDecimalSum";
    public static final String PATH_whitebox_vendorcheck_selectVendorCheckIntegerSum = "whitebox:vendorcheck:selectVendorCheckIntegerSum";
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public VendorCheckDbm getDBMeta() { return VendorCheckDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public VendorCheckCB newConditionBean() { return new VendorCheckCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * VendorCheckCB cb = new VendorCheckCB();
     * cb.query().setFoo...(value);
     * int count = vendorCheckBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of VendorCheck. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(VendorCheckCB cb) {
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
     * VendorCheckCB cb = new VendorCheckCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;VendorCheck&gt; entity = vendorCheckBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(vendorCheck -&gt; {
     *     ...
     * });
     * VendorCheck vendorCheck = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(vendorCheck -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     VendorCheck vendorCheck = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of VendorCheck. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<VendorCheck> selectEntity(VendorCheckCB cb) {
        return facadeSelectEntity(cb);
    }

    protected OptionalEntity<VendorCheck> facadeSelectEntity(VendorCheckCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorCheck> OptionalEntity<ENTITY> doSelectOptionalEntity(VendorCheckCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElseNull(); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * VendorCheckCB cb = new VendorCheckCB();
     * cb.query().setFoo...(value);
     * VendorCheck vendorCheck = vendorCheckBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendorCheck.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of VendorCheck. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorCheck selectEntityWithDeletedCheck(VendorCheckCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param vendorCheckId : PK, NotNull, DECIMAL(16). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<VendorCheck> selectByPK(Long vendorCheckId) {
        return facadeSelectByPK(vendorCheckId);
    }

    protected OptionalEntity<VendorCheck> facadeSelectByPK(Long vendorCheckId) {
        return doSelectOptionalByPK(vendorCheckId, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorCheck> ENTITY doSelectByPK(Long vendorCheckId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(vendorCheckId), tp);
    }

    protected <ENTITY extends VendorCheck> OptionalEntity<ENTITY> doSelectOptionalByPK(Long vendorCheckId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(vendorCheckId, tp), vendorCheckId);
    }

    protected VendorCheckCB xprepareCBAsPK(Long vendorCheckId) {
        assertObjectNotNull("vendorCheckId", vendorCheckId);
        return newConditionBean().acceptPK(vendorCheckId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * VendorCheckCB cb = new VendorCheckCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;VendorCheck&gt; vendorCheckList = vendorCheckBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (VendorCheck vendorCheck : vendorCheckList) {
     *     ... = vendorCheck.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorCheck. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<VendorCheck> selectList(VendorCheckCB cb) {
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
     * VendorCheckCB cb = new VendorCheckCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;VendorCheck&gt; page = vendorCheckBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (VendorCheck vendorCheck : page) {
     *     ... = vendorCheck.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorCheck. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<VendorCheck> selectPage(VendorCheckCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * VendorCheckCB cb = new VendorCheckCB();
     * cb.query().setFoo...(value);
     * vendorCheckBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;VendorCheck&gt;() {
     *     public void handle(VendorCheck entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of VendorCheck. (NotNull)
     * @param entityRowHandler The handler of entity row of VendorCheck. (NotNull)
     */
    public void selectCursor(VendorCheckCB cb, EntityRowHandler<VendorCheck> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * vendorCheckBhv.<span style="color: #DD4747">selectScalar</span>(Date.class).max(new ScalarQuery() {
     *     public void query(VendorCheckCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<VendorCheckCB, RESULT> selectScalar(Class<RESULT> resultType) {
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
     * @param vendorCheckList The entity list of vendorCheck. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<VendorCheck> vendorCheckList, ReferrerLoaderHandler<LoaderOfVendorCheck> handler) {
        xassLRArg(vendorCheckList, handler);
        handler.handle(new LoaderOfVendorCheck().ready(vendorCheckList, _behaviorSelector));
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
     * @param vendorCheck The entity of vendorCheck. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(VendorCheck vendorCheck, ReferrerLoaderHandler<LoaderOfVendorCheck> handler) {
        xassLRArg(vendorCheck, handler);
        handler.handle(new LoaderOfVendorCheck().ready(xnewLRAryLs(vendorCheck), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key vendorCheckId.
     * @param vendorCheckList The list of vendorCheck. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractVendorCheckIdList(List<VendorCheck> vendorCheckList)
    { return helpExtractListInternally(vendorCheckList, "vendorCheckId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * VendorCheck vendorCheck = new VendorCheck();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorCheck.setFoo...(value);
     * vendorCheck.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorCheck.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorCheck.set...;</span>
     * vendorCheckBhv.<span style="color: #DD4747">insert</span>(vendorCheck);
     * ... = vendorCheck.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param vendorCheck The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(VendorCheck vendorCheck) {
        doInsert(vendorCheck, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * VendorCheck vendorCheck = new VendorCheck();
     * vendorCheck.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorCheck.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorCheck.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorCheck.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorCheck.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorCheckBhv.<span style="color: #DD4747">update</span>(vendorCheck);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorCheck The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(VendorCheck vendorCheck) {
        doUpdate(vendorCheck, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param vendorCheck The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(VendorCheck vendorCheck) {
        doInsertOrUpdate(vendorCheck, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * VendorCheck vendorCheck = new VendorCheck();
     * vendorCheck.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorCheck.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorCheckBhv.<span style="color: #DD4747">delete</span>(vendorCheck);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorCheck The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(VendorCheck vendorCheck) {
        doDelete(vendorCheck, null);
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
     *     VendorCheck vendorCheck = new VendorCheck();
     *     vendorCheck.setFooName("foo");
     *     if (...) {
     *         vendorCheck.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     vendorCheckList.add(vendorCheck);
     * }
     * vendorCheckBhv.<span style="color: #DD4747">batchInsert</span>(vendorCheckList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param vendorCheckList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<VendorCheck> vendorCheckList) {
        return doBatchInsert(vendorCheckList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     VendorCheck vendorCheck = new VendorCheck();
     *     vendorCheck.setFooName("foo");
     *     if (...) {
     *         vendorCheck.setFooPrice(123);
     *     } else {
     *         vendorCheck.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//vendorCheck.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     vendorCheckList.add(vendorCheck);
     * }
     * vendorCheckBhv.<span style="color: #DD4747">batchUpdate</span>(vendorCheckList);
     * </pre>
     * @param vendorCheckList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorCheck> vendorCheckList) {
        return doBatchUpdate(vendorCheckList, null);
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * vendorCheckBhv.<span style="color: #DD4747">batchUpdate</span>(vendorCheckList, new SpecifyQuery<VendorCheckCB>() {
     *     public void specify(VendorCheckCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * vendorCheckBhv.<span style="color: #DD4747">batchUpdate</span>(vendorCheckList, new SpecifyQuery<VendorCheckCB>() {
     *     public void specify(VendorCheckCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param vendorCheckList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorCheck> vendorCheckList, SpecifyQuery<VendorCheckCB> updateColumnSpec) {
        return doBatchUpdate(vendorCheckList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param vendorCheckList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<VendorCheck> vendorCheckList) {
        return doBatchDelete(vendorCheckList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * vendorCheckBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;VendorCheck, VendorCheckCB&gt;() {
     *     public ConditionBean setup(VendorCheck entity, VendorCheckCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<VendorCheck, VendorCheckCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * VendorCheck vendorCheck = new VendorCheck();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorCheck.setPK...(value);</span>
     * vendorCheck.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorCheck.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorCheck.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorCheck.setVersionNo(value);</span>
     * VendorCheckCB cb = new VendorCheckCB();
     * cb.query().setFoo...(value);
     * vendorCheckBhv.<span style="color: #DD4747">queryUpdate</span>(vendorCheck, cb);
     * </pre>
     * @param vendorCheck The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of VendorCheck. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(VendorCheck vendorCheck, VendorCheckCB cb) {
        return doQueryUpdate(vendorCheck, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * VendorCheckCB cb = new VendorCheckCB();
     * cb.query().setFoo...(value);
     * vendorCheckBhv.<span style="color: #DD4747">queryDelete</span>(vendorCheck, cb);
     * </pre>
     * @param cb The condition-bean of VendorCheck. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(VendorCheckCB cb) {
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
     * VendorCheck vendorCheck = new VendorCheck();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorCheck.setFoo...(value);
     * vendorCheck.setBar...(value);
     * InsertOption<VendorCheckCB> option = new InsertOption<VendorCheckCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * vendorCheckBhv.<span style="color: #DD4747">varyingInsert</span>(vendorCheck, option);
     * ... = vendorCheck.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param vendorCheck The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(VendorCheck vendorCheck, InsertOption<VendorCheckCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(vendorCheck, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * VendorCheck vendorCheck = new VendorCheck();
     * vendorCheck.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorCheck.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorCheck.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;VendorCheckCB&gt; option = new UpdateOption&lt;VendorCheckCB&gt;();
     *     option.self(new SpecifyQuery&lt;VendorCheckCB&gt;() {
     *         public void specify(VendorCheckCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     vendorCheckBhv.<span style="color: #DD4747">varyingUpdate</span>(vendorCheck, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorCheck The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(VendorCheck vendorCheck, UpdateOption<VendorCheckCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(vendorCheck, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param vendorCheck The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(VendorCheck vendorCheck, InsertOption<VendorCheckCB> insertOption, UpdateOption<VendorCheckCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(vendorCheck, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param vendorCheck The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(VendorCheck vendorCheck, DeleteOption<VendorCheckCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(vendorCheck, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param vendorCheckList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<VendorCheck> vendorCheckList, InsertOption<VendorCheckCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(vendorCheckList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param vendorCheckList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<VendorCheck> vendorCheckList, UpdateOption<VendorCheckCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(vendorCheckList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param vendorCheckList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<VendorCheck> vendorCheckList, DeleteOption<VendorCheckCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(vendorCheckList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<VendorCheck, VendorCheckCB> setupper, InsertOption<VendorCheckCB> option) {
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
     * VendorCheck vendorCheck = new VendorCheck();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorCheck.setPK...(value);</span>
     * vendorCheck.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorCheck.setVersionNo(value);</span>
     * VendorCheckCB cb = new VendorCheckCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;VendorCheckCB&gt; option = new UpdateOption&lt;VendorCheckCB&gt;();
     * option.self(new SpecifyQuery&lt;VendorCheckCB&gt;() {
     *     public void specify(VendorCheckCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * vendorCheckBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(vendorCheck, cb, option);
     * </pre>
     * @param vendorCheck The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of VendorCheck. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(VendorCheck vendorCheck, VendorCheckCB cb, UpdateOption<VendorCheckCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(vendorCheck, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of VendorCheck. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(VendorCheckCB cb, DeleteOption<VendorCheckCB> option) {
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
    public OutsideSqlAllFacadeExecutor<VendorCheckBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends VendorCheck> typeOfSelectedEntity() { return VendorCheck.class; }
    protected Class<VendorCheck> typeOfHandlingEntity() { return VendorCheck.class; }
    protected Class<VendorCheckCB> typeOfHandlingConditionBean() { return VendorCheckCB.class; }
}
