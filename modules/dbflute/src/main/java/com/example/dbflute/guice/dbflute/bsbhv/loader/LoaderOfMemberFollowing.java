package com.example.dbflute.guice.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.guice.dbflute.exbhv.*;
import com.example.dbflute.guice.dbflute.exentity.*;

/**
 * The referrer loader of (会員フォローイング)MEMBER_FOLLOWING as TABLE. <br />
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
public class LoaderOfMemberFollowing {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MemberFollowing> _selectedList;
    protected BehaviorSelector _selector;
    protected MemberFollowingBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMemberFollowing ready(List<MemberFollowing> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MemberFollowingBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MemberFollowingBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMember _foreignMemberByMyMemberIdLoader;
    public LoaderOfMember pulloutMemberByMyMemberId() {
        if (_foreignMemberByMyMemberIdLoader != null) { return _foreignMemberByMyMemberIdLoader; }
        List<Member> pulledList = myBhv().pulloutMemberByMyMemberId(_selectedList);
        _foreignMemberByMyMemberIdLoader = new LoaderOfMember().ready(pulledList, _selector);
        return _foreignMemberByMyMemberIdLoader;
    }

    protected LoaderOfMember _foreignMemberByYourMemberIdLoader;
    public LoaderOfMember pulloutMemberByYourMemberId() {
        if (_foreignMemberByYourMemberIdLoader != null) { return _foreignMemberByYourMemberIdLoader; }
        List<Member> pulledList = myBhv().pulloutMemberByYourMemberId(_selectedList);
        _foreignMemberByYourMemberIdLoader = new LoaderOfMember().ready(pulledList, _selector);
        return _foreignMemberByYourMemberIdLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MemberFollowing> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
