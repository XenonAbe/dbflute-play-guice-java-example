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
 * The behavior of (会員フォローイング)MEMBER_FOLLOWING as TABLE. <br />
 * <pre>
 * [primary key]
 *     MEMBER_FOLLOWING_ID
 *
 * [column]
 *     MEMBER_FOLLOWING_ID, MY_MEMBER_ID, YOUR_MEMBER_ID, FOLLOW_DATETIME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MEMBER_FOLLOWING_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     MEMBER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     memberByMyMemberId, memberByYourMemberId
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMemberFollowingBhv extends AbstractBehaviorWritable<MemberFollowing, MemberFollowingCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public MemberFollowingDbm getDBMeta() { return MemberFollowingDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public MemberFollowingCB newConditionBean() { return new MemberFollowingCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MemberFollowingCB cb = new MemberFollowingCB();
     * cb.query().setFoo...(value);
     * int count = memberFollowingBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MemberFollowing. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(MemberFollowingCB cb) {
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
     * MemberFollowingCB cb = new MemberFollowingCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;MemberFollowing&gt; entity = memberFollowingBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(memberFollowing -&gt; {
     *     ...
     * });
     * MemberFollowing memberFollowing = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(memberFollowing -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     MemberFollowing memberFollowing = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of MemberFollowing. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<MemberFollowing> selectEntity(MemberFollowingCB cb) {
        return facadeSelectEntity(cb);
    }

    protected OptionalEntity<MemberFollowing> facadeSelectEntity(MemberFollowingCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends MemberFollowing> OptionalEntity<ENTITY> doSelectOptionalEntity(MemberFollowingCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElseNull(); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * MemberFollowingCB cb = new MemberFollowingCB();
     * cb.query().setFoo...(value);
     * MemberFollowing memberFollowing = memberFollowingBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = memberFollowing.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MemberFollowing. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MemberFollowing selectEntityWithDeletedCheck(MemberFollowingCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param memberFollowingId (会員フォローイングID): PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<MemberFollowing> selectByPK(Long memberFollowingId) {
        return facadeSelectByPK(memberFollowingId);
    }

    protected OptionalEntity<MemberFollowing> facadeSelectByPK(Long memberFollowingId) {
        return doSelectOptionalByPK(memberFollowingId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MemberFollowing> ENTITY doSelectByPK(Long memberFollowingId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(memberFollowingId), tp);
    }

    protected <ENTITY extends MemberFollowing> OptionalEntity<ENTITY> doSelectOptionalByPK(Long memberFollowingId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(memberFollowingId, tp), memberFollowingId);
    }

    protected MemberFollowingCB xprepareCBAsPK(Long memberFollowingId) {
        assertObjectNotNull("memberFollowingId", memberFollowingId);
        return newConditionBean().acceptPK(memberFollowingId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param myMemberId (わたし): UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER. (NotNull)
     * @param yourMemberId (あなた): +UQ, IX+, NotNull, INTEGER(10), FK to MEMBER. (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<MemberFollowing> selectByUniqueOf(Integer myMemberId, Integer yourMemberId) {
        return facadeSelectByUniqueOf(myMemberId, yourMemberId);
    }

    protected OptionalEntity<MemberFollowing> facadeSelectByUniqueOf(Integer myMemberId, Integer yourMemberId) {
        return doSelectByUniqueOf(myMemberId, yourMemberId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MemberFollowing> OptionalEntity<ENTITY> doSelectByUniqueOf(Integer myMemberId, Integer yourMemberId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(myMemberId, yourMemberId), tp), myMemberId, yourMemberId);
    }

    protected MemberFollowingCB xprepareCBAsUniqueOf(Integer myMemberId, Integer yourMemberId) {
        assertObjectNotNull("myMemberId", myMemberId);assertObjectNotNull("yourMemberId", yourMemberId);
        return newConditionBean().acceptUniqueOf(myMemberId, yourMemberId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MemberFollowingCB cb = new MemberFollowingCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;MemberFollowing&gt; memberFollowingList = memberFollowingBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (MemberFollowing memberFollowing : memberFollowingList) {
     *     ... = memberFollowing.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MemberFollowing. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MemberFollowing> selectList(MemberFollowingCB cb) {
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
     * MemberFollowingCB cb = new MemberFollowingCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MemberFollowing&gt; page = memberFollowingBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (MemberFollowing memberFollowing : page) {
     *     ... = memberFollowing.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MemberFollowing. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MemberFollowing> selectPage(MemberFollowingCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * MemberFollowingCB cb = new MemberFollowingCB();
     * cb.query().setFoo...(value);
     * memberFollowingBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;MemberFollowing&gt;() {
     *     public void handle(MemberFollowing entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of MemberFollowing. (NotNull)
     * @param entityRowHandler The handler of entity row of MemberFollowing. (NotNull)
     */
    public void selectCursor(MemberFollowingCB cb, EntityRowHandler<MemberFollowing> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * memberFollowingBhv.<span style="color: #DD4747">selectScalar</span>(Date.class).max(new ScalarQuery() {
     *     public void query(MemberFollowingCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MemberFollowingCB, RESULT> selectScalar(Class<RESULT> resultType) {
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
     * @param memberFollowingList The entity list of memberFollowing. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<MemberFollowing> memberFollowingList, ReferrerLoaderHandler<LoaderOfMemberFollowing> handler) {
        xassLRArg(memberFollowingList, handler);
        handler.handle(new LoaderOfMemberFollowing().ready(memberFollowingList, _behaviorSelector));
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
     * @param memberFollowing The entity of memberFollowing. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(MemberFollowing memberFollowing, ReferrerLoaderHandler<LoaderOfMemberFollowing> handler) {
        xassLRArg(memberFollowing, handler);
        handler.handle(new LoaderOfMemberFollowing().ready(xnewLRAryLs(memberFollowing), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'Member'.
     * @param memberFollowingList The list of memberFollowing. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Member> pulloutMemberByMyMemberId(List<MemberFollowing> memberFollowingList)
    { return helpPulloutInternally(memberFollowingList, "memberByMyMemberId"); }

    /**
     * Pull out the list of foreign table 'Member'.
     * @param memberFollowingList The list of memberFollowing. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Member> pulloutMemberByYourMemberId(List<MemberFollowing> memberFollowingList)
    { return helpPulloutInternally(memberFollowingList, "memberByYourMemberId"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key memberFollowingId.
     * @param memberFollowingList The list of memberFollowing. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractMemberFollowingIdList(List<MemberFollowing> memberFollowingList)
    { return helpExtractListInternally(memberFollowingList, "memberFollowingId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MemberFollowing memberFollowing = new MemberFollowing();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * memberFollowing.setFoo...(value);
     * memberFollowing.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberFollowing.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberFollowing.set...;</span>
     * memberFollowingBhv.<span style="color: #DD4747">insert</span>(memberFollowing);
     * ... = memberFollowing.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param memberFollowing The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(MemberFollowing memberFollowing) {
        doInsert(memberFollowing, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * MemberFollowing memberFollowing = new MemberFollowing();
     * memberFollowing.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * memberFollowing.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberFollowing.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberFollowing.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * memberFollowing.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     memberFollowingBhv.<span style="color: #DD4747">update</span>(memberFollowing);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param memberFollowing The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(MemberFollowing memberFollowing) {
        doUpdate(memberFollowing, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param memberFollowing The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(MemberFollowing memberFollowing) {
        doInsertOrUpdate(memberFollowing, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * MemberFollowing memberFollowing = new MemberFollowing();
     * memberFollowing.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * memberFollowing.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     memberFollowingBhv.<span style="color: #DD4747">delete</span>(memberFollowing);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param memberFollowing The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MemberFollowing memberFollowing) {
        doDelete(memberFollowing, null);
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
     *     MemberFollowing memberFollowing = new MemberFollowing();
     *     memberFollowing.setFooName("foo");
     *     if (...) {
     *         memberFollowing.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     memberFollowingList.add(memberFollowing);
     * }
     * memberFollowingBhv.<span style="color: #DD4747">batchInsert</span>(memberFollowingList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param memberFollowingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<MemberFollowing> memberFollowingList) {
        return doBatchInsert(memberFollowingList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MemberFollowing memberFollowing = new MemberFollowing();
     *     memberFollowing.setFooName("foo");
     *     if (...) {
     *         memberFollowing.setFooPrice(123);
     *     } else {
     *         memberFollowing.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//memberFollowing.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     memberFollowingList.add(memberFollowing);
     * }
     * memberFollowingBhv.<span style="color: #DD4747">batchUpdate</span>(memberFollowingList);
     * </pre>
     * @param memberFollowingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<MemberFollowing> memberFollowingList) {
        return doBatchUpdate(memberFollowingList, null);
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * memberFollowingBhv.<span style="color: #DD4747">batchUpdate</span>(memberFollowingList, new SpecifyQuery<MemberFollowingCB>() {
     *     public void specify(MemberFollowingCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * memberFollowingBhv.<span style="color: #DD4747">batchUpdate</span>(memberFollowingList, new SpecifyQuery<MemberFollowingCB>() {
     *     public void specify(MemberFollowingCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param memberFollowingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<MemberFollowing> memberFollowingList, SpecifyQuery<MemberFollowingCB> updateColumnSpec) {
        return doBatchUpdate(memberFollowingList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param memberFollowingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<MemberFollowing> memberFollowingList) {
        return doBatchDelete(memberFollowingList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * memberFollowingBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;MemberFollowing, MemberFollowingCB&gt;() {
     *     public ConditionBean setup(MemberFollowing entity, MemberFollowingCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<MemberFollowing, MemberFollowingCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * MemberFollowing memberFollowing = new MemberFollowing();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//memberFollowing.setPK...(value);</span>
     * memberFollowing.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberFollowing.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberFollowing.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberFollowing.setVersionNo(value);</span>
     * MemberFollowingCB cb = new MemberFollowingCB();
     * cb.query().setFoo...(value);
     * memberFollowingBhv.<span style="color: #DD4747">queryUpdate</span>(memberFollowing, cb);
     * </pre>
     * @param memberFollowing The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MemberFollowing. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MemberFollowing memberFollowing, MemberFollowingCB cb) {
        return doQueryUpdate(memberFollowing, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MemberFollowingCB cb = new MemberFollowingCB();
     * cb.query().setFoo...(value);
     * memberFollowingBhv.<span style="color: #DD4747">queryDelete</span>(memberFollowing, cb);
     * </pre>
     * @param cb The condition-bean of MemberFollowing. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(MemberFollowingCB cb) {
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
     * MemberFollowing memberFollowing = new MemberFollowing();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * memberFollowing.setFoo...(value);
     * memberFollowing.setBar...(value);
     * InsertOption<MemberFollowingCB> option = new InsertOption<MemberFollowingCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * memberFollowingBhv.<span style="color: #DD4747">varyingInsert</span>(memberFollowing, option);
     * ... = memberFollowing.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param memberFollowing The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(MemberFollowing memberFollowing, InsertOption<MemberFollowingCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(memberFollowing, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * MemberFollowing memberFollowing = new MemberFollowing();
     * memberFollowing.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * memberFollowing.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * memberFollowing.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;MemberFollowingCB&gt; option = new UpdateOption&lt;MemberFollowingCB&gt;();
     *     option.self(new SpecifyQuery&lt;MemberFollowingCB&gt;() {
     *         public void specify(MemberFollowingCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     memberFollowingBhv.<span style="color: #DD4747">varyingUpdate</span>(memberFollowing, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param memberFollowing The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(MemberFollowing memberFollowing, UpdateOption<MemberFollowingCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(memberFollowing, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param memberFollowing The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(MemberFollowing memberFollowing, InsertOption<MemberFollowingCB> insertOption, UpdateOption<MemberFollowingCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(memberFollowing, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param memberFollowing The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MemberFollowing memberFollowing, DeleteOption<MemberFollowingCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(memberFollowing, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param memberFollowingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<MemberFollowing> memberFollowingList, InsertOption<MemberFollowingCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(memberFollowingList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param memberFollowingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<MemberFollowing> memberFollowingList, UpdateOption<MemberFollowingCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(memberFollowingList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param memberFollowingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<MemberFollowing> memberFollowingList, DeleteOption<MemberFollowingCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(memberFollowingList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<MemberFollowing, MemberFollowingCB> setupper, InsertOption<MemberFollowingCB> option) {
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
     * MemberFollowing memberFollowing = new MemberFollowing();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//memberFollowing.setPK...(value);</span>
     * memberFollowing.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberFollowing.setVersionNo(value);</span>
     * MemberFollowingCB cb = new MemberFollowingCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;MemberFollowingCB&gt; option = new UpdateOption&lt;MemberFollowingCB&gt;();
     * option.self(new SpecifyQuery&lt;MemberFollowingCB&gt;() {
     *     public void specify(MemberFollowingCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * memberFollowingBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(memberFollowing, cb, option);
     * </pre>
     * @param memberFollowing The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MemberFollowing. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MemberFollowing memberFollowing, MemberFollowingCB cb, UpdateOption<MemberFollowingCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(memberFollowing, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of MemberFollowing. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(MemberFollowingCB cb, DeleteOption<MemberFollowingCB> option) {
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
    public OutsideSqlAllFacadeExecutor<MemberFollowingBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends MemberFollowing> typeOfSelectedEntity() { return MemberFollowing.class; }
    protected Class<MemberFollowing> typeOfHandlingEntity() { return MemberFollowing.class; }
    protected Class<MemberFollowingCB> typeOfHandlingConditionBean() { return MemberFollowingCB.class; }
}
