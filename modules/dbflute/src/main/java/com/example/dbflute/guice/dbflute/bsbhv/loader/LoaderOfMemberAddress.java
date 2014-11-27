package com.example.dbflute.guice.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.guice.dbflute.exbhv.*;
import com.example.dbflute.guice.dbflute.exentity.*;

/**
 * The referrer loader of (会員住所情報)MEMBER_ADDRESS as TABLE. <br />
 * <pre>
 * [primary key]
 *     MEMBER_ADDRESS_ID
 *
 * [column]
 *     MEMBER_ADDRESS_ID, MEMBER_ID, VALID_BEGIN_DATE, VALID_END_DATE, ADDRESS, REGION_ID, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MEMBER_ADDRESS_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     MEMBER, REGION
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     member, region
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMemberAddress {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MemberAddress> _selectedList;
    protected BehaviorSelector _selector;
    protected MemberAddressBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMemberAddress ready(List<MemberAddress> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MemberAddressBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MemberAddressBhv.class); return _myBhv; } }

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

    protected LoaderOfRegion _foreignRegionLoader;
    public LoaderOfRegion pulloutRegion() {
        if (_foreignRegionLoader != null) { return _foreignRegionLoader; }
        List<Region> pulledList = myBhv().pulloutRegion(_selectedList);
        _foreignRegionLoader = new LoaderOfRegion().ready(pulledList, _selector);
        return _foreignRegionLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MemberAddress> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
