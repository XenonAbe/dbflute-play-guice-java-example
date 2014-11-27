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
 * The DB meta of SUMMARY_WITHDRAWAL. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SummaryWithdrawalDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SummaryWithdrawalDbm _instance = new SummaryWithdrawalDbm();
    private SummaryWithdrawalDbm() {}
    public static SummaryWithdrawalDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgWithdrawalReasonCode(), "withdrawalReasonCode");
        setupEpg(_epgMap, new EpgWithdrawalReasonText(), "withdrawalReasonText");
        setupEpg(_epgMap, new EpgWithdrawalReasonInputText(), "withdrawalReasonInputText");
        setupEpg(_epgMap, new EpgWithdrawalDatetime(), "withdrawalDatetime");
        setupEpg(_epgMap, new EpgMemberStatusCode(), "memberStatusCode");
        setupEpg(_epgMap, new EpgMemberStatusName(), "memberStatusName");
        setupEpg(_epgMap, new EpgMaxPurchasePrice(), "maxPurchasePrice");
    }
    public static class EpgMemberId implements PropertyGateway {
        public Object read(Entity et) { return ((SummaryWithdrawal)et).getMemberId(); }
        public void write(Entity et, Object vl) { ((SummaryWithdrawal)et).setMemberId(cti(vl)); }
    }
    public static class EpgMemberName implements PropertyGateway {
        public Object read(Entity et) { return ((SummaryWithdrawal)et).getMemberName(); }
        public void write(Entity et, Object vl) { ((SummaryWithdrawal)et).setMemberName((String)vl); }
    }
    public static class EpgWithdrawalReasonCode implements PropertyGateway {
        public Object read(Entity et) { return ((SummaryWithdrawal)et).getWithdrawalReasonCode(); }
        public void write(Entity et, Object vl) { ((SummaryWithdrawal)et).setWithdrawalReasonCode((String)vl); }
    }
    public static class EpgWithdrawalReasonText implements PropertyGateway {
        public Object read(Entity et) { return ((SummaryWithdrawal)et).getWithdrawalReasonText(); }
        public void write(Entity et, Object vl) { ((SummaryWithdrawal)et).setWithdrawalReasonText((String)vl); }
    }
    public static class EpgWithdrawalReasonInputText implements PropertyGateway {
        public Object read(Entity et) { return ((SummaryWithdrawal)et).getWithdrawalReasonInputText(); }
        public void write(Entity et, Object vl) { ((SummaryWithdrawal)et).setWithdrawalReasonInputText((String)vl); }
    }
    public static class EpgWithdrawalDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((SummaryWithdrawal)et).getWithdrawalDatetime(); }
        public void write(Entity et, Object vl) { ((SummaryWithdrawal)et).setWithdrawalDatetime((org.joda.time.LocalDateTime)vl); }
    }
    public static class EpgMemberStatusCode implements PropertyGateway {
        public Object read(Entity et) { return ((SummaryWithdrawal)et).getMemberStatusCode(); }
        public void write(Entity et, Object vl) { ((SummaryWithdrawal)et).setMemberStatusCode((String)vl); }
    }
    public static class EpgMemberStatusName implements PropertyGateway {
        public Object read(Entity et) { return ((SummaryWithdrawal)et).getMemberStatusName(); }
        public void write(Entity et, Object vl) { ((SummaryWithdrawal)et).setMemberStatusName((String)vl); }
    }
    public static class EpgMaxPurchasePrice implements PropertyGateway {
        public Object read(Entity et) { return ((SummaryWithdrawal)et).getMaxPurchasePrice(); }
        public void write(Entity et, Object vl) { ((SummaryWithdrawal)et).setMaxPurchasePrice(cti(vl)); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SUMMARY_WITHDRAWAL";
    protected final String _tablePropertyName = "summaryWithdrawal";
    protected final TableSqlName _tableSqlName = new TableSqlName("EXAMPLEDB.PUBLIC.SUMMARY_WITHDRAWAL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, null, Integer.class, "memberId", null, false, false, false, "INTEGER", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMemberName = cci("MEMBER_NAME", "MEMBER_NAME", null, null, String.class, "memberName", null, false, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnWithdrawalReasonCode = cci("WITHDRAWAL_REASON_CODE", "WITHDRAWAL_REASON_CODE", null, null, String.class, "withdrawalReasonCode", null, false, false, false, "CHAR", 3, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnWithdrawalReasonText = cci("WITHDRAWAL_REASON_TEXT", "WITHDRAWAL_REASON_TEXT", null, null, String.class, "withdrawalReasonText", null, false, false, false, "CLOB", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnWithdrawalReasonInputText = cci("WITHDRAWAL_REASON_INPUT_TEXT", "WITHDRAWAL_REASON_INPUT_TEXT", null, null, String.class, "withdrawalReasonInputText", null, false, false, false, "CLOB", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnWithdrawalDatetime = cci("WITHDRAWAL_DATETIME", "WITHDRAWAL_DATETIME", null, null, org.joda.time.LocalDateTime.class, "withdrawalDatetime", null, false, false, false, "TIMESTAMP", 23, 10, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMemberStatusCode = cci("MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", null, null, String.class, "memberStatusCode", null, false, false, false, "CHAR", 3, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMemberStatusName = cci("MEMBER_STATUS_NAME", "MEMBER_STATUS_NAME", null, null, String.class, "memberStatusName", null, false, false, false, "VARCHAR", 50, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMaxPurchasePrice = cci("MAX_PURCHASE_PRICE", "MAX_PURCHASE_PRICE", null, null, Integer.class, "maxPurchasePrice", null, false, false, false, "INTEGER", 10, 0, null, false, null, null, null, null, null);

    /**
     * MEMBER_ID: {INTEGER(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    /**
     * MEMBER_NAME: {VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberName() { return _columnMemberName; }
    /**
     * WITHDRAWAL_REASON_CODE: {CHAR(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWithdrawalReasonCode() { return _columnWithdrawalReasonCode; }
    /**
     * WITHDRAWAL_REASON_TEXT: {CLOB(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWithdrawalReasonText() { return _columnWithdrawalReasonText; }
    /**
     * WITHDRAWAL_REASON_INPUT_TEXT: {CLOB(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWithdrawalReasonInputText() { return _columnWithdrawalReasonInputText; }
    /**
     * WITHDRAWAL_DATETIME: {TIMESTAMP(23, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWithdrawalDatetime() { return _columnWithdrawalDatetime; }
    /**
     * MEMBER_STATUS_CODE: {CHAR(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberStatusCode() { return _columnMemberStatusCode; }
    /**
     * MEMBER_STATUS_NAME: {VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberStatusName() { return _columnMemberStatusName; }
    /**
     * MAX_PURCHASE_PRICE: {INTEGER(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMaxPurchasePrice() { return _columnMaxPurchasePrice; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberId());
        ls.add(columnMemberName());
        ls.add(columnWithdrawalReasonCode());
        ls.add(columnWithdrawalReasonText());
        ls.add(columnWithdrawalReasonInputText());
        ls.add(columnWithdrawalDatetime());
        ls.add(columnMemberStatusCode());
        ls.add(columnMemberStatusName());
        ls.add(columnMaxPurchasePrice());
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
    public String getEntityTypeName() { return "com.example.dbflute.guice.dbflute.exentity.SummaryWithdrawal"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.guice.dbflute.cbean.SummaryWithdrawalCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.guice.dbflute.exbhv.SummaryWithdrawalBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SummaryWithdrawal> getEntityType() { return SummaryWithdrawal.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SummaryWithdrawal newEntity() { return new SummaryWithdrawal(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SummaryWithdrawal)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SummaryWithdrawal)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
