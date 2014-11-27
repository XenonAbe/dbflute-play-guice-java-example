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
 * The condition-query for in-line of MEMBER_SERVICE.
 * @author DBFlute(AutoGenerator)
 */
public class MemberServiceCIQ extends AbstractBsMemberServiceCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsMemberServiceCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MemberServiceCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsMemberServiceCQ myCQ) {
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
    protected ConditionValue getCValueMemberServiceId() { return _myCQ.getMemberServiceId(); }
    protected ConditionValue getCValueMemberId() { return _myCQ.getMemberId(); }
    protected ConditionValue getCValueServicePointCount() { return _myCQ.getServicePointCount(); }
    protected ConditionValue getCValueServiceRankCode() { return _myCQ.getServiceRankCode(); }
    protected ConditionValue getCValueRegisterDatetime() { return _myCQ.getRegisterDatetime(); }
    protected ConditionValue getCValueRegisterUser() { return _myCQ.getRegisterUser(); }
    protected ConditionValue getCValueUpdateDatetime() { return _myCQ.getUpdateDatetime(); }
    protected ConditionValue getCValueUpdateUser() { return _myCQ.getUpdateUser(); }
    protected ConditionValue getCValueVersionNo() { return _myCQ.getVersionNo(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(MemberServiceCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MemberServiceCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MemberServiceCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MemberServiceCQ sq)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(MemberServiceCQ sq)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MemberServiceCB.class.getName(); }
    protected String xinCQ() { return MemberServiceCQ.class.getName(); }
}
