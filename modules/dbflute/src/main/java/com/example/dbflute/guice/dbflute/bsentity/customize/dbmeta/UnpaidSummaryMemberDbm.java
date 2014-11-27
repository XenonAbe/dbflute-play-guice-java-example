package com.example.dbflute.guice.dbflute.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import org.seasar.dbflute.dbmeta.property.PropertyGateway;
import com.example.dbflute.guice.dbflute.allcommon.*;
import com.example.dbflute.guice.dbflute.exentity.customize.*;

/**
 * The DB meta of UnpaidSummaryMember. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class UnpaidSummaryMemberDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final UnpaidSummaryMemberDbm _instance = new UnpaidSummaryMemberDbm();
    private UnpaidSummaryMemberDbm() {}
    public static UnpaidSummaryMemberDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgMemberId(), "memberId");
        setupEpg(_epgMap, new EpgMemberName(), "memberName");
        setupEpg(_epgMap, new EpgUnpaidPriceSummary(), "unpaidPriceSummary");
        setupEpg(_epgMap, new EpgMemberStatusName(), "memberStatusName");
    }
    public static class EpgMemberId implements PropertyGateway {
        public Object read(Entity et) { return ((UnpaidSummaryMember)et).getMemberId(); }
        public void write(Entity et, Object vl) { ((UnpaidSummaryMember)et).setMemberId(cti(vl)); }
    }
    public static class EpgMemberName implements PropertyGateway {
        public Object read(Entity et) { return ((UnpaidSummaryMember)et).getMemberName(); }
        public void write(Entity et, Object vl) { ((UnpaidSummaryMember)et).setMemberName((String)vl); }
    }
    public static class EpgUnpaidPriceSummary implements PropertyGateway {
        public Object read(Entity et) { return ((UnpaidSummaryMember)et).getUnpaidPriceSummary(); }
        public void write(Entity et, Object vl) { ((UnpaidSummaryMember)et).setUnpaidPriceSummary(ctl(vl)); }
    }
    public static class EpgMemberStatusName implements PropertyGateway {
        public Object read(Entity et) { return ((UnpaidSummaryMember)et).getMemberStatusName(); }
        public void write(Entity et, Object vl) { ((UnpaidSummaryMember)et).setMemberStatusName((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "UnpaidSummaryMember";
    protected final String _tablePropertyName = "unpaidSummaryMember";
    protected final TableSqlName _tableSqlName = new TableSqlName("UnpaidSummaryMember", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, "会員ID", Integer.class, "memberId", null, false, false, false, "INTEGER", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMemberName = cci("MEMBER_NAME", "MEMBER_NAME", null, "会員名称", String.class, "memberName", null, false, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnUnpaidPriceSummary = cci("UNPAID_PRICE_SUMMARY", "UNPAID_PRICE_SUMMARY", null, null, Long.class, "unpaidPriceSummary", null, false, false, false, "BIGINT", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMemberStatusName = cci("MEMBER_STATUS_NAME", "MEMBER_STATUS_NAME", null, "会員ステータス名称", String.class, "memberStatusName", null, false, false, false, "VARCHAR", 50, 0, null, false, null, null, null, null, null);

    /**
     * (会員ID)MEMBER_ID: {INTEGER(10), refers to MEMBER.MEMBER_ID}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    /**
     * (会員名称)MEMBER_NAME: {VARCHAR(200), refers to MEMBER.MEMBER_NAME}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberName() { return _columnMemberName; }
    /**
     * UNPAID_PRICE_SUMMARY: {BIGINT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnpaidPriceSummary() { return _columnUnpaidPriceSummary; }
    /**
     * (会員ステータス名称)MEMBER_STATUS_NAME: {VARCHAR(50), refers to MEMBER_STATUS.MEMBER_STATUS_NAME}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberStatusName() { return _columnMemberStatusName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberId());
        ls.add(columnMemberName());
        ls.add(columnUnpaidPriceSummary());
        ls.add(columnMemberStatusName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() {
        throw new UnsupportedOperationException("The table does not have primary key: " + getTableDbName());
    }
    public boolean hasPrimaryKey() { return false; }
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

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.guice.dbflute.exentity.customize.UnpaidSummaryMember"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<UnpaidSummaryMember> getEntityType() { return UnpaidSummaryMember.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public UnpaidSummaryMember newEntity() { return new UnpaidSummaryMember(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((UnpaidSummaryMember)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((UnpaidSummaryMember)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
