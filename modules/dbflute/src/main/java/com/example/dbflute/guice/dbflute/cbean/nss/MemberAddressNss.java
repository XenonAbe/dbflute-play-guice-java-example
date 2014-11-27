package com.example.dbflute.guice.dbflute.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.guice.dbflute.cbean.cq.MemberAddressCQ;

/**
 * The nest select set-upper of MEMBER_ADDRESS.
 * @author DBFlute(AutoGenerator)
 */
public class MemberAddressNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MemberAddressCQ _query;
    public MemberAddressNss(MemberAddressCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * (会員)MEMBER by my MEMBER_ID, named 'member'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberNss withMember() {
        _query.doNss(new MemberAddressCQ.NssCall() { public ConditionQuery qf() { return _query.queryMember(); }});
        return new MemberNss(_query.queryMember());
    }
    /**
     * With nested relation columns to select clause. <br />
     * (地域)REGION by my REGION_ID, named 'region'.
     */
    public void withRegion() {
        _query.doNss(new MemberAddressCQ.NssCall() { public ConditionQuery qf() { return _query.queryRegion(); }});
    }
}
