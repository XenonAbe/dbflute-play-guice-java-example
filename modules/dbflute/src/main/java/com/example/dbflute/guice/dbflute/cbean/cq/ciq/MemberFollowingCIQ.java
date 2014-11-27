package com.example.dbflute.guice.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.ConditionOption;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.guice.dbflute.cbean.*;
import com.example.dbflute.guice.dbflute.cbean.cq.bs.*;
import com.example.dbflute.guice.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of MEMBER_FOLLOWING.
 * @author DBFlute(AutoGenerator)
 */
public class MemberFollowingCIQ extends AbstractBsMemberFollowingCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsMemberFollowingCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MemberFollowingCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsMemberFollowingCQ myCQ) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq)
    { throw new IllegalConditionBeanOperationException("InlineView cannot use Union: " + bq + " : " + uq); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col)
    { regIQ(k, v, cv, col); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op)
    { regIQ(k, v, cv, col, op); }

    @Override
    protected void registerWhereClause(String wc)
    { registerInlineWhereClause(wc); }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) { throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported."); }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue getCValueMemberFollowingId() { return _myCQ.getMemberFollowingId(); }
    protected ConditionValue getCValueMyMemberId() { return _myCQ.getMyMemberId(); }
    protected ConditionValue getCValueYourMemberId() { return _myCQ.getYourMemberId(); }
    protected ConditionValue getCValueFollowDatetime() { return _myCQ.getFollowDatetime(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(MemberFollowingCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MemberFollowingCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MemberFollowingCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MemberFollowingCQ sq)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(MemberFollowingCQ sq)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MemberFollowingCB.class.getName(); }
    protected String xinCQ() { return MemberFollowingCQ.class.getName(); }
}
