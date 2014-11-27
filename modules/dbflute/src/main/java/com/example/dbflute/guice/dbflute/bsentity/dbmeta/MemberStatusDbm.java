package com.example.dbflute.guice.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import org.seasar.dbflute.dbmeta.property.PropertyGateway;
import com.example.dbflute.guice.dbflute.allcommon.*;
import com.example.dbflute.guice.dbflute.exentity.*;

/**
 * The DB meta of MEMBER_STATUS. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MemberStatusDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MemberStatusDbm _instance = new MemberStatusDbm();
    private MemberStatusDbm() {}
    public static MemberStatusDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgMemberStatusCode(), "memberStatusCode");
        setupEpg(_epgMap, new EpgMemberStatusName(), "memberStatusName");
        setupEpg(_epgMap, new EpgDescription(), "description");
        setupEpg(_epgMap, new EpgDisplayOrder(), "displayOrder");
    }
    public class EpgMemberStatusCode implements PropertyGateway {
        public Object read(Entity et) { return ((MemberStatus)et).getMemberStatusCode(); }
        public void write(Entity et, Object vl) {
            ColumnInfo col = columnMemberStatusCode();
            CDef.MemberStatus cls = (CDef.MemberStatus)gcls(col, vl);
            if (cls != null) {
                ((MemberStatus)et).setMemberStatusCodeAsMemberStatus(cls);
            } else {
                ((MemberStatus)et).mynativeMappingMemberStatusCode((String)vl);
            }
        }
    }
    public static class EpgMemberStatusName implements PropertyGateway {
        public Object read(Entity et) { return ((MemberStatus)et).getMemberStatusName(); }
        public void write(Entity et, Object vl) { ((MemberStatus)et).setMemberStatusName((String)vl); }
    }
    public static class EpgDescription implements PropertyGateway {
        public Object read(Entity et) { return ((MemberStatus)et).getDescription(); }
        public void write(Entity et, Object vl) { ((MemberStatus)et).setDescription((String)vl); }
    }
    public static class EpgDisplayOrder implements PropertyGateway {
        public Object read(Entity et) { return ((MemberStatus)et).getDisplayOrder(); }
        public void write(Entity et, Object vl) { ((MemberStatus)et).setDisplayOrder(cti(vl)); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "MEMBER_STATUS";
    protected final String _tablePropertyName = "memberStatus";
    protected final TableSqlName _tableSqlName = new TableSqlName("EXAMPLEDB.PUBLIC.MEMBER_STATUS", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "会員ステータス";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberStatusCode = cci("MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", null, "会員ステータスコード", String.class, "memberStatusCode", null, true, false, true, "CHAR", 3, 0, null, false, null, null, null, "memberList,memberLoginList", CDef.DefMeta.MemberStatus);
    protected final ColumnInfo _columnMemberStatusName = cci("MEMBER_STATUS_NAME", "MEMBER_STATUS_NAME", null, "会員ステータス名称", String.class, "memberStatusName", null, false, false, true, "VARCHAR", 50, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnDescription = cci("DESCRIPTION", "DESCRIPTION", null, "説明", String.class, "description", null, false, false, true, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnDisplayOrder = cci("DISPLAY_ORDER", "DISPLAY_ORDER", null, "表示順", Integer.class, "displayOrder", null, false, false, true, "INTEGER", 10, 0, null, false, null, null, null, null, null);

    /**
     * (会員ステータスコード)MEMBER_STATUS_CODE: {PK, NotNull, CHAR(3), classification=MemberStatus}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberStatusCode() { return _columnMemberStatusCode; }
    /**
     * (会員ステータス名称)MEMBER_STATUS_NAME: {NotNull, VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberStatusName() { return _columnMemberStatusName; }
    /**
     * (説明)DESCRIPTION: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDescription() { return _columnDescription; }
    /**
     * (表示順)DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDisplayOrder() { return _columnDisplayOrder; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberStatusCode());
        ls.add(columnMemberStatusName());
        ls.add(columnDescription());
        ls.add(columnDisplayOrder());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnMemberStatusCode()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * (会員)MEMBER by MEMBER_STATUS_CODE, named 'memberList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMemberList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberStatusCode(), MemberDbm.getInstance().columnMemberStatusCode());
        return cri("FK_MEMBER_MEMBER_STATUS", "memberList", this, MemberDbm.getInstance(), mp, false, "memberStatus");
    }
    /**
     * (会員ログイン)MEMBER_LOGIN by LOGIN_MEMBER_STATUS_CODE, named 'memberLoginList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMemberLoginList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberStatusCode(), MemberLoginDbm.getInstance().columnLoginMemberStatusCode());
        return cri("FK_MEMBER_LOGIN_MEMBER_STATUS", "memberLoginList", this, MemberLoginDbm.getInstance(), mp, false, "memberStatus");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.guice.dbflute.exentity.MemberStatus"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.guice.dbflute.cbean.MemberStatusCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.guice.dbflute.exbhv.MemberStatusBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MemberStatus> getEntityType() { return MemberStatus.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MemberStatus newEntity() { return new MemberStatus(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MemberStatus)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MemberStatus)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
