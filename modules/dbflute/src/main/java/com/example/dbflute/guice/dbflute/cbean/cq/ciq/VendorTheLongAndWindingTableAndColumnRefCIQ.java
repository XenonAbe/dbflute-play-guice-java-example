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
 * The condition-query for in-line of VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF.
 * @author DBFlute(AutoGenerator)
 */
public class VendorTheLongAndWindingTableAndColumnRefCIQ extends AbstractBsVendorTheLongAndWindingTableAndColumnRefCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsVendorTheLongAndWindingTableAndColumnRefCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public VendorTheLongAndWindingTableAndColumnRefCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsVendorTheLongAndWindingTableAndColumnRefCQ myCQ) {
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
    protected ConditionValue getCValueTheLongAndWindingTableAndColumnRefId() { return _myCQ.getTheLongAndWindingTableAndColumnRefId(); }
    protected ConditionValue getCValueTheLongAndWindingTableAndColumnId() { return _myCQ.getTheLongAndWindingTableAndColumnId(); }
    protected ConditionValue getCValueTheLongAndWindingTableAndColumnRefDate() { return _myCQ.getTheLongAndWindingTableAndColumnRefDate(); }
    protected ConditionValue getCValueShortDate() { return _myCQ.getShortDate(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(VendorTheLongAndWindingTableAndColumnRefCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(VendorTheLongAndWindingTableAndColumnRefCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(VendorTheLongAndWindingTableAndColumnRefCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(VendorTheLongAndWindingTableAndColumnRefCQ sq)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(VendorTheLongAndWindingTableAndColumnRefCQ sq)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return VendorTheLongAndWindingTableAndColumnRefCB.class.getName(); }
    protected String xinCQ() { return VendorTheLongAndWindingTableAndColumnRefCQ.class.getName(); }
}
