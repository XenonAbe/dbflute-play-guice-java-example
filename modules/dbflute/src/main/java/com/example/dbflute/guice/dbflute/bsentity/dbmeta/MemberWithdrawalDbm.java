package com.example.dbflute.guice.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.optional.OptionalEntity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import org.seasar.dbflute.dbmeta.property.PropertyGateway;
import com.example.dbflute.guice.dbflute.allcommon.*;
import com.example.dbflute.guice.dbflute.exentity.*;

/**
 * The DB meta of MEMBER_WITHDRAWAL. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MemberWithdrawalDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MemberWithdrawalDbm _instance = new MemberWithdrawalDbm();
    private MemberWithdrawalDbm() {}
    public static MemberWithdrawalDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgWithdrawalReasonCode(), "withdrawalReasonCode");
        setupEpg(_epgMap, new EpgWithdrawalReasonInputText(), "withdrawalReasonInputText");
        setupEpg(_epgMap, new EpgWithdrawalDatetime(), "withdrawalDatetime");
        setupEpg(_epgMap, new EpgRegisterDatetime(), "registerDatetime");
        setupEpg(_epgMap, new EpgRegisterUser(), "registerUser");
        setupEpg(_epgMap, new EpgUpdateDatetime(), "updateDatetime");
        setupEpg(_epgMap, new EpgUpdateUser(), "updateUser");
        setupEpg(_epgMap, new EpgVersionNo(), "versionNo");
    }
    public static class EpgMemberId implements PropertyGateway {
        public Object read(Entity et) { return ((MemberWithdrawal)et).getMemberId(); }
        public void write(Entity et, Object vl) { ((MemberWithdrawal)et).setMemberId(cti(vl)); }
    }
    public class EpgWithdrawalReasonCode implements PropertyGateway {
        public Object read(Entity et) { return ((MemberWithdrawal)et).getWithdrawalReasonCode(); }
        public void write(Entity et, Object vl) {
            ColumnInfo col = columnWithdrawalReasonCode();
            CDef.WithdrawalReason cls = (CDef.WithdrawalReason)gcls(col, vl);
            if (cls != null) {
                ((MemberWithdrawal)et).setWithdrawalReasonCodeAsWithdrawalReason(cls);
            } else {
                ((MemberWithdrawal)et).mynativeMappingWithdrawalReasonCode((String)vl);
            }
        }
    }
    public static class EpgWithdrawalReasonInputText implements PropertyGateway {
        public Object read(Entity et) { return ((MemberWithdrawal)et).getWithdrawalReasonInputText(); }
        public void write(Entity et, Object vl) { ((MemberWithdrawal)et).setWithdrawalReasonInputText((String)vl); }
    }
    public static class EpgWithdrawalDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((MemberWithdrawal)et).getWithdrawalDatetime(); }
        public void write(Entity et, Object vl) { ((MemberWithdrawal)et).setWithdrawalDatetime((org.joda.time.LocalDateTime)vl); }
    }
    public static class EpgRegisterDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((MemberWithdrawal)et).getRegisterDatetime(); }
        public void write(Entity et, Object vl) { ((MemberWithdrawal)et).setRegisterDatetime((org.joda.time.LocalDateTime)vl); }
    }
    public static class EpgRegisterUser implements PropertyGateway {
        public Object read(Entity et) { return ((MemberWithdrawal)et).getRegisterUser(); }
        public void write(Entity et, Object vl) { ((MemberWithdrawal)et).setRegisterUser((String)vl); }
    }
    public static class EpgUpdateDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((MemberWithdrawal)et).getUpdateDatetime(); }
        public void write(Entity et, Object vl) { ((MemberWithdrawal)et).setUpdateDatetime((org.joda.time.LocalDateTime)vl); }
    }
    public static class EpgUpdateUser implements PropertyGateway {
        public Object read(Entity et) { return ((MemberWithdrawal)et).getUpdateUser(); }
        public void write(Entity et, Object vl) { ((MemberWithdrawal)et).setUpdateUser((String)vl); }
    }
    public static class EpgVersionNo implements PropertyGateway {
        public Object read(Entity et) { return ((MemberWithdrawal)et).getVersionNo(); }
        public void write(Entity et, Object vl) { ((MemberWithdrawal)et).setVersionNo(ctl(vl)); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgMember(), "member");
        setupEfpg(_efpgMap, new EfpgWithdrawalReason(), "withdrawalReason");
    }
    public class EfpgMember implements PropertyGateway {
        public Object read(Entity et) { return ((MemberWithdrawal)et).getMember(); }
        @SuppressWarnings("unchecked")
        public void write(Entity et, Object vl) { ((MemberWithdrawal)et).setMember((OptionalEntity<Member>)vl); }
    }
    public class EfpgWithdrawalReason implements PropertyGateway {
        public Object read(Entity et) { return ((MemberWithdrawal)et).getWithdrawalReason(); }
        @SuppressWarnings("unchecked")
        public void write(Entity et, Object vl) { ((MemberWithdrawal)et).setWithdrawalReason((OptionalEntity<WithdrawalReason>)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "MEMBER_WITHDRAWAL";
    protected final String _tablePropertyName = "memberWithdrawal";
    protected final TableSqlName _tableSqlName = new TableSqlName("EXAMPLEDB.PUBLIC.MEMBER_WITHDRAWAL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "会員退会情報";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, null, Integer.class, "memberId", null, true, false, true, "INTEGER", 10, 0, null, false, null, null, "member", null, null);
    protected final ColumnInfo _columnWithdrawalReasonCode = cci("WITHDRAWAL_REASON_CODE", "WITHDRAWAL_REASON_CODE", null, "退会理由コード", String.class, "withdrawalReasonCode", null, false, false, false, "CHAR", 3, 0, null, false, null, null, "withdrawalReason", null, CDef.DefMeta.WithdrawalReason);
    protected final ColumnInfo _columnWithdrawalReasonInputText = cci("WITHDRAWAL_REASON_INPUT_TEXT", "WITHDRAWAL_REASON_INPUT_TEXT", null, "退会理由入力テキスト", String.class, "withdrawalReasonInputText", null, false, false, false, "CLOB", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnWithdrawalDatetime = cci("WITHDRAWAL_DATETIME", "WITHDRAWAL_DATETIME", null, "退会日時", org.joda.time.LocalDateTime.class, "withdrawalDatetime", null, false, false, true, "TIMESTAMP", 23, 10, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, null, org.joda.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "TIMESTAMP", 23, 10, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, null, String.class, "registerUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, null, org.joda.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "TIMESTAMP", 23, 10, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, null, String.class, "updateUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, true, "BIGINT", 19, 0, null, false, OptimisticLockType.VERSION_NO, null, null, null, null);

    /**
     * MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    /**
     * (退会理由コード)WITHDRAWAL_REASON_CODE: {IX, CHAR(3), FK to WITHDRAWAL_REASON, classification=WithdrawalReason}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWithdrawalReasonCode() { return _columnWithdrawalReasonCode; }
    /**
     * (退会理由入力テキスト)WITHDRAWAL_REASON_INPUT_TEXT: {CLOB(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWithdrawalReasonInputText() { return _columnWithdrawalReasonInputText; }
    /**
     * (退会日時)WITHDRAWAL_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWithdrawalDatetime() { return _columnWithdrawalDatetime; }
    /**
     * REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    /**
     * REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterUser() { return _columnRegisterUser; }
    /**
     * UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }
    /**
     * UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateUser() { return _columnUpdateUser; }
    /**
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberId());
        ls.add(columnWithdrawalReasonCode());
        ls.add(columnWithdrawalReasonInputText());
        ls.add(columnWithdrawalDatetime());
        ls.add(columnRegisterDatetime());
        ls.add(columnRegisterUser());
        ls.add(columnUpdateDatetime());
        ls.add(columnUpdateUser());
        ls.add(columnVersionNo());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnMemberId()); }
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
    /**
     * (会員)MEMBER by my MEMBER_ID, named 'member'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMember() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_WITHDRAWAL_MEMBER", "member", this, MemberDbm.getInstance(), mp, 0, org.seasar.dbflute.optional.OptionalEntity.class, true, false, false, false, null, null, false, "memberWithdrawalAsOne");
    }
    /**
     * (退会理由)WITHDRAWAL_REASON by my WITHDRAWAL_REASON_CODE, named 'withdrawalReason'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWithdrawalReason() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnWithdrawalReasonCode(), WithdrawalReasonDbm.getInstance().columnWithdrawalReasonCode());
        return cfi("FK_MEMBER_WITHDRAWAL_WITHDRAWAL_REASON", "withdrawalReason", this, WithdrawalReasonDbm.getInstance(), mp, 1, org.seasar.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "memberWithdrawalList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnUpdateDatetime(), columnUpdateUser()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnUpdateDatetime(), columnUpdateUser()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdateDatetime(), columnUpdateUser()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.guice.dbflute.exentity.MemberWithdrawal"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.guice.dbflute.cbean.MemberWithdrawalCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.guice.dbflute.exbhv.MemberWithdrawalBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MemberWithdrawal> getEntityType() { return MemberWithdrawal.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MemberWithdrawal newEntity() { return new MemberWithdrawal(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MemberWithdrawal)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MemberWithdrawal)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
