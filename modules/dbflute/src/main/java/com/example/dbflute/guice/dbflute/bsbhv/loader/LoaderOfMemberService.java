package com.example.dbflute.guice.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.guice.dbflute.exbhv.*;
import com.example.dbflute.guice.dbflute.exentity.*;

/**
 * The referrer loader of (会員サービス)MEMBER_SERVICE as TABLE. <br />
 * <pre>
 * [primary key]
 *     MEMBER_SERVICE_ID
 *
 * [column]
 *     MEMBER_SERVICE_ID, MEMBER_ID, SERVICE_POINT_COUNT, SERVICE_RANK_CODE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MEMBER_SERVICE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     MEMBER, SERVICE_RANK
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     member, serviceRank
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMemberService {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MemberService> _selectedList;
    protected BehaviorSelector _selector;
    protected MemberServiceBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMemberService ready(List<MemberService> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MemberServiceBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MemberServiceBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMember _foreignMemberLoader;
    public LoaderOfMember pulloutMember() {
        if (_foreignMemberLoader != null) { return _foreignMemberLoader; }
        List<Member> pulledList = myBhv().pulloutMember(_selectedList);
        _foreignMemberLoader = new LoaderOfMember().ready(pulledList, _selector);
        return _foreignMemberLoader;
    }

    protected LoaderOfServiceRank _foreignServiceRankLoader;
    public LoaderOfServiceRank pulloutServiceRank() {
        if (_foreignServiceRankLoader != null) { return _foreignServiceRankLoader; }
        List<ServiceRank> pulledList = myBhv().pulloutServiceRank(_selectedList);
        _foreignServiceRankLoader = new LoaderOfServiceRank().ready(pulledList, _selector);
        return _foreignServiceRankLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MemberService> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
