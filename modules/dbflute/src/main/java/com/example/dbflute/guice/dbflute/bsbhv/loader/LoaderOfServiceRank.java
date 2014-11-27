package com.example.dbflute.guice.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import com.example.dbflute.guice.dbflute.exbhv.*;
import com.example.dbflute.guice.dbflute.exentity.*;
import com.example.dbflute.guice.dbflute.cbean.*;

/**
 * The referrer loader of (サービスランク)SERVICE_RANK as TABLE. <br />
 * <pre>
 * [primary key]
 *     SERVICE_RANK_CODE
 *
 * [column]
 *     SERVICE_RANK_CODE, SERVICE_RANK_NAME, SERVICE_POINT_INCIDENCE, NEW_ACCEPTABLE_FLG, DESCRIPTION, DISPLAY_ORDER
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
 *     MEMBER_SERVICE
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     memberServiceList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfServiceRank {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ServiceRank> _selectedList;
    protected BehaviorSelector _selector;
    protected ServiceRankBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfServiceRank ready(List<ServiceRank> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ServiceRankBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ServiceRankBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MemberService> _referrerMemberService;
    public NestedReferrerLoaderGateway<LoaderOfMemberService> loadMemberService(ReferrerConditionSetupper<MemberServiceCB> setupper) {
        myBhv().loadMemberService(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<MemberService>() {
            public void handle(List<MemberService> referrerList) { _referrerMemberService = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfMemberService>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfMemberService> handler) {
                handler.handle(new LoaderOfMemberService().ready(_referrerMemberService, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ServiceRank> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
