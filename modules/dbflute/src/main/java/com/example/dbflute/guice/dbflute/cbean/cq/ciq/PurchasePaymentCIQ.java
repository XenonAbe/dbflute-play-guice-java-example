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
 * The condition-query for in-line of PURCHASE_PAYMENT.
 * @author DBFlute(AutoGenerator)
 */
public class PurchasePaymentCIQ extends AbstractBsPurchasePaymentCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsPurchasePaymentCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public PurchasePaymentCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsPurchasePaymentCQ myCQ) {
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
    protected ConditionValue getCValuePurchasePaymentId() { return _myCQ.getPurchasePaymentId(); }
    protected ConditionValue getCValuePurchaseId() { return _myCQ.getPurchaseId(); }
    protected ConditionValue getCValuePaymentAmount() { return _myCQ.getPaymentAmount(); }
    protected ConditionValue getCValuePaymentDatetime() { return _myCQ.getPaymentDatetime(); }
    protected ConditionValue getCValuePaymentMethodCode() { return _myCQ.getPaymentMethodCode(); }
    protected ConditionValue getCValueRegisterDatetime() { return _myCQ.getRegisterDatetime(); }
    protected ConditionValue getCValueRegisterUser() { return _myCQ.getRegisterUser(); }
    protected ConditionValue getCValueUpdateDatetime() { return _myCQ.getUpdateDatetime(); }
    protected ConditionValue getCValueUpdateUser() { return _myCQ.getUpdateUser(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(PurchasePaymentCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(PurchasePaymentCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(PurchasePaymentCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(PurchasePaymentCQ sq)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(PurchasePaymentCQ sq)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return PurchasePaymentCB.class.getName(); }
    protected String xinCQ() { return PurchasePaymentCQ.class.getName(); }
}
