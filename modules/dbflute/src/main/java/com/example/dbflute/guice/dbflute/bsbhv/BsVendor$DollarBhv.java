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
 * The behavior of VENDOR_$_DOLLAR as TABLE. <br />
 * <pre>
 * [primary key]
 *     VENDOR_$_DOLLAR_ID
 *
 * [column]
 *     VENDOR_$_DOLLAR_ID, VENDOR_$_DOLLAR_NAME
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
public abstract class BsVendor$DollarBhv extends AbstractBehaviorWritable<Vendor$Dollar, Vendor$DollarCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public Vendor$DollarDbm getDBMeta() { return Vendor$DollarDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Vendor$DollarCB newConditionBean() { return new Vendor$DollarCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * Vendor$DollarCB cb = new Vendor$DollarCB();
     * cb.query().setFoo...(value);
     * int count = vendor$DollarBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of Vendor$Dollar. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(Vendor$DollarCB cb) {
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
     * Vendor$DollarCB cb = new Vendor$DollarCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;Vendor$Dollar&gt; entity = vendor$DollarBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(vendor$Dollar -&gt; {
     *     ...
     * });
     * Vendor$Dollar vendor$Dollar = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(vendor$Dollar -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     Vendor$Dollar vendor$Dollar = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of Vendor$Dollar. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<Vendor$Dollar> selectEntity(Vendor$DollarCB cb) {
        return facadeSelectEntity(cb);
    }

    protected OptionalEntity<Vendor$Dollar> facadeSelectEntity(Vendor$DollarCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends Vendor$Dollar> OptionalEntity<ENTITY> doSelectOptionalEntity(Vendor$DollarCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElseNull(); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * Vendor$DollarCB cb = new Vendor$DollarCB();
     * cb.query().setFoo...(value);
     * Vendor$Dollar vendor$Dollar = vendor$DollarBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendor$Dollar.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of Vendor$Dollar. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public Vendor$Dollar selectEntityWithDeletedCheck(Vendor$DollarCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param vendor$DollarId : PK, NotNull, INTEGER(10). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<Vendor$Dollar> selectByPK(Integer vendor$DollarId) {
        return facadeSelectByPK(vendor$DollarId);
    }

    protected OptionalEntity<Vendor$Dollar> facadeSelectByPK(Integer vendor$DollarId) {
        return doSelectOptionalByPK(vendor$DollarId, typeOfSelectedEntity());
    }

    protected <ENTITY extends Vendor$Dollar> ENTITY doSelectByPK(Integer vendor$DollarId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(vendor$DollarId), tp);
    }

    protected <ENTITY extends Vendor$Dollar> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer vendor$DollarId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(vendor$DollarId, tp), vendor$DollarId);
    }

    protected Vendor$DollarCB xprepareCBAsPK(Integer vendor$DollarId) {
        assertObjectNotNull("vendor$DollarId", vendor$DollarId);
        return newConditionBean().acceptPK(vendor$DollarId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * Vendor$DollarCB cb = new Vendor$DollarCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;Vendor$Dollar&gt; vendor$DollarList = vendor$DollarBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (Vendor$Dollar vendor$Dollar : vendor$DollarList) {
     *     ... = vendor$Dollar.get...();
     * }
     * </pre>
     * @param cb The condition-bean of Vendor$Dollar. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<Vendor$Dollar> selectList(Vendor$DollarCB cb) {
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
     * Vendor$DollarCB cb = new Vendor$DollarCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;Vendor$Dollar&gt; page = vendor$DollarBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (Vendor$Dollar vendor$Dollar : page) {
     *     ... = vendor$Dollar.get...();
     * }
     * </pre>
     * @param cb The condition-bean of Vendor$Dollar. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<Vendor$Dollar> selectPage(Vendor$DollarCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * Vendor$DollarCB cb = new Vendor$DollarCB();
     * cb.query().setFoo...(value);
     * vendor$DollarBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;Vendor$Dollar&gt;() {
     *     public void handle(Vendor$Dollar entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of Vendor$Dollar. (NotNull)
     * @param entityRowHandler The handler of entity row of Vendor$Dollar. (NotNull)
     */
    public void selectCursor(Vendor$DollarCB cb, EntityRowHandler<Vendor$Dollar> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * vendor$DollarBhv.<span style="color: #DD4747">selectScalar</span>(Date.class).max(new ScalarQuery() {
     *     public void query(Vendor$DollarCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<Vendor$DollarCB, RESULT> selectScalar(Class<RESULT> resultType) {
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
     * @param vendor$DollarList The entity list of vendor$Dollar. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<Vendor$Dollar> vendor$DollarList, ReferrerLoaderHandler<LoaderOfVendor$Dollar> handler) {
        xassLRArg(vendor$DollarList, handler);
        handler.handle(new LoaderOfVendor$Dollar().ready(vendor$DollarList, _behaviorSelector));
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
     * @param vendor$Dollar The entity of vendor$Dollar. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(Vendor$Dollar vendor$Dollar, ReferrerLoaderHandler<LoaderOfVendor$Dollar> handler) {
        xassLRArg(vendor$Dollar, handler);
        handler.handle(new LoaderOfVendor$Dollar().ready(xnewLRAryLs(vendor$Dollar), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key vendor$DollarId.
     * @param vendor$DollarList The list of vendor$Dollar. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractVendor$DollarIdList(List<Vendor$Dollar> vendor$DollarList)
    { return helpExtractListInternally(vendor$DollarList, "vendor$DollarId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * Vendor$Dollar vendor$Dollar = new Vendor$Dollar();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendor$Dollar.setFoo...(value);
     * vendor$Dollar.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendor$Dollar.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendor$Dollar.set...;</span>
     * vendor$DollarBhv.<span style="color: #DD4747">insert</span>(vendor$Dollar);
     * ... = vendor$Dollar.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param vendor$Dollar The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(Vendor$Dollar vendor$Dollar) {
        doInsert(vendor$Dollar, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * Vendor$Dollar vendor$Dollar = new Vendor$Dollar();
     * vendor$Dollar.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendor$Dollar.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendor$Dollar.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendor$Dollar.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendor$Dollar.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendor$DollarBhv.<span style="color: #DD4747">update</span>(vendor$Dollar);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendor$Dollar The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(Vendor$Dollar vendor$Dollar) {
        doUpdate(vendor$Dollar, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param vendor$Dollar The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(Vendor$Dollar vendor$Dollar) {
        doInsertOrUpdate(vendor$Dollar, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * Vendor$Dollar vendor$Dollar = new Vendor$Dollar();
     * vendor$Dollar.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendor$Dollar.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendor$DollarBhv.<span style="color: #DD4747">delete</span>(vendor$Dollar);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendor$Dollar The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(Vendor$Dollar vendor$Dollar) {
        doDelete(vendor$Dollar, null);
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
     *     Vendor$Dollar vendor$Dollar = new Vendor$Dollar();
     *     vendor$Dollar.setFooName("foo");
     *     if (...) {
     *         vendor$Dollar.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     vendor$DollarList.add(vendor$Dollar);
     * }
     * vendor$DollarBhv.<span style="color: #DD4747">batchInsert</span>(vendor$DollarList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param vendor$DollarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<Vendor$Dollar> vendor$DollarList) {
        return doBatchInsert(vendor$DollarList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     Vendor$Dollar vendor$Dollar = new Vendor$Dollar();
     *     vendor$Dollar.setFooName("foo");
     *     if (...) {
     *         vendor$Dollar.setFooPrice(123);
     *     } else {
     *         vendor$Dollar.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//vendor$Dollar.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     vendor$DollarList.add(vendor$Dollar);
     * }
     * vendor$DollarBhv.<span style="color: #DD4747">batchUpdate</span>(vendor$DollarList);
     * </pre>
     * @param vendor$DollarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<Vendor$Dollar> vendor$DollarList) {
        return doBatchUpdate(vendor$DollarList, null);
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * vendor$DollarBhv.<span style="color: #DD4747">batchUpdate</span>(vendor$DollarList, new SpecifyQuery<Vendor$DollarCB>() {
     *     public void specify(Vendor$DollarCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * vendor$DollarBhv.<span style="color: #DD4747">batchUpdate</span>(vendor$DollarList, new SpecifyQuery<Vendor$DollarCB>() {
     *     public void specify(Vendor$DollarCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param vendor$DollarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<Vendor$Dollar> vendor$DollarList, SpecifyQuery<Vendor$DollarCB> updateColumnSpec) {
        return doBatchUpdate(vendor$DollarList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param vendor$DollarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<Vendor$Dollar> vendor$DollarList) {
        return doBatchDelete(vendor$DollarList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * vendor$DollarBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;Vendor$Dollar, Vendor$DollarCB&gt;() {
     *     public ConditionBean setup(Vendor$Dollar entity, Vendor$DollarCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<Vendor$Dollar, Vendor$DollarCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * Vendor$Dollar vendor$Dollar = new Vendor$Dollar();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendor$Dollar.setPK...(value);</span>
     * vendor$Dollar.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendor$Dollar.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendor$Dollar.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendor$Dollar.setVersionNo(value);</span>
     * Vendor$DollarCB cb = new Vendor$DollarCB();
     * cb.query().setFoo...(value);
     * vendor$DollarBhv.<span style="color: #DD4747">queryUpdate</span>(vendor$Dollar, cb);
     * </pre>
     * @param vendor$Dollar The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of Vendor$Dollar. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(Vendor$Dollar vendor$Dollar, Vendor$DollarCB cb) {
        return doQueryUpdate(vendor$Dollar, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * Vendor$DollarCB cb = new Vendor$DollarCB();
     * cb.query().setFoo...(value);
     * vendor$DollarBhv.<span style="color: #DD4747">queryDelete</span>(vendor$Dollar, cb);
     * </pre>
     * @param cb The condition-bean of Vendor$Dollar. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(Vendor$DollarCB cb) {
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
     * Vendor$Dollar vendor$Dollar = new Vendor$Dollar();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendor$Dollar.setFoo...(value);
     * vendor$Dollar.setBar...(value);
     * InsertOption<Vendor$DollarCB> option = new InsertOption<Vendor$DollarCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * vendor$DollarBhv.<span style="color: #DD4747">varyingInsert</span>(vendor$Dollar, option);
     * ... = vendor$Dollar.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param vendor$Dollar The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(Vendor$Dollar vendor$Dollar, InsertOption<Vendor$DollarCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(vendor$Dollar, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * Vendor$Dollar vendor$Dollar = new Vendor$Dollar();
     * vendor$Dollar.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendor$Dollar.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendor$Dollar.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;Vendor$DollarCB&gt; option = new UpdateOption&lt;Vendor$DollarCB&gt;();
     *     option.self(new SpecifyQuery&lt;Vendor$DollarCB&gt;() {
     *         public void specify(Vendor$DollarCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     vendor$DollarBhv.<span style="color: #DD4747">varyingUpdate</span>(vendor$Dollar, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendor$Dollar The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(Vendor$Dollar vendor$Dollar, UpdateOption<Vendor$DollarCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(vendor$Dollar, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param vendor$Dollar The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(Vendor$Dollar vendor$Dollar, InsertOption<Vendor$DollarCB> insertOption, UpdateOption<Vendor$DollarCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(vendor$Dollar, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param vendor$Dollar The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(Vendor$Dollar vendor$Dollar, DeleteOption<Vendor$DollarCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(vendor$Dollar, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param vendor$DollarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<Vendor$Dollar> vendor$DollarList, InsertOption<Vendor$DollarCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(vendor$DollarList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param vendor$DollarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<Vendor$Dollar> vendor$DollarList, UpdateOption<Vendor$DollarCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(vendor$DollarList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param vendor$DollarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<Vendor$Dollar> vendor$DollarList, DeleteOption<Vendor$DollarCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(vendor$DollarList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<Vendor$Dollar, Vendor$DollarCB> setupper, InsertOption<Vendor$DollarCB> option) {
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
     * Vendor$Dollar vendor$Dollar = new Vendor$Dollar();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendor$Dollar.setPK...(value);</span>
     * vendor$Dollar.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendor$Dollar.setVersionNo(value);</span>
     * Vendor$DollarCB cb = new Vendor$DollarCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;Vendor$DollarCB&gt; option = new UpdateOption&lt;Vendor$DollarCB&gt;();
     * option.self(new SpecifyQuery&lt;Vendor$DollarCB&gt;() {
     *     public void specify(Vendor$DollarCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * vendor$DollarBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(vendor$Dollar, cb, option);
     * </pre>
     * @param vendor$Dollar The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of Vendor$Dollar. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(Vendor$Dollar vendor$Dollar, Vendor$DollarCB cb, UpdateOption<Vendor$DollarCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(vendor$Dollar, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of Vendor$Dollar. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(Vendor$DollarCB cb, DeleteOption<Vendor$DollarCB> option) {
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
    public OutsideSqlAllFacadeExecutor<Vendor$DollarBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends Vendor$Dollar> typeOfSelectedEntity() { return Vendor$Dollar.class; }
    protected Class<Vendor$Dollar> typeOfHandlingEntity() { return Vendor$Dollar.class; }
    protected Class<Vendor$DollarCB> typeOfHandlingConditionBean() { return Vendor$DollarCB.class; }
}
