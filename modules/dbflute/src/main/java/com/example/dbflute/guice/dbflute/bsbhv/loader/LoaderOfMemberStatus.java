package com.example.dbflute.guice.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import com.example.dbflute.guice.dbflute.exbhv.*;
import com.example.dbflute.guice.dbflute.exentity.*;
import com.example.dbflute.guice.dbflute.cbean.*;

/**
 * The referrer loader of (会員ステータス)MEMBER_STATUS as TABLE. <br />
 * <pre>
 * [primary key]
 *     MEMBER_STATUS_CODE
 *
 * [column]
 *     MEMBER_STATUS_CODE, MEMBER_STATUS_NAME, DESCRIPTION, DISPLAY_ORDER
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
 *     MEMBER, MEMBER_LOGIN
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     memberList, memberLoginList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMemberStatus {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MemberStatus> _selectedList;
    protected BehaviorSelector _selector;
    protected MemberStatusBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMemberStatus ready(List<MemberStatus> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MemberStatusBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MemberStatusBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<Member> _referrerMember;
    public NestedReferrerLoaderGateway<LoaderOfMember> loadMember(ReferrerConditionSetupper<MemberCB> setupper) {
        myBhv().loadMember(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<Member>() {
            public void handle(List<Member> referrerList) { _referrerMember = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfMember>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfMember> handler) {
                handler.handle(new LoaderOfMember().ready(_referrerMember, _selector));
            }
        };
    }

    protected List<MemberLogin> _referrerMemberLogin;
    public NestedReferrerLoaderGateway<LoaderOfMemberLogin> loadMemberLogin(ReferrerConditionSetupper<MemberLoginCB> setupper) {
        myBhv().loadMemberLogin(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<MemberLogin>() {
            public void handle(List<MemberLogin> referrerList) { _referrerMemberLogin = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfMemberLogin>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfMemberLogin> handler) {
                handler.handle(new LoaderOfMemberLogin().ready(_referrerMemberLogin, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MemberStatus> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
