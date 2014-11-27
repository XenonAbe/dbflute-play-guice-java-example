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
 * The DB meta of VENDOR_PRIMARY_KEY_ONLY. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class VendorPrimaryKeyOnlyDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final VendorPrimaryKeyOnlyDbm _instance = new VendorPrimaryKeyOnlyDbm();
    private VendorPrimaryKeyOnlyDbm() {}
    public static VendorPrimaryKeyOnlyDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgPrimaryKeyOnlyId(), "primaryKeyOnlyId");
    }
    public static class EpgPrimaryKeyOnlyId implements PropertyGateway {
        public Object read(Entity et) { return ((VendorPrimaryKeyOnly)et).getPrimaryKeyOnlyId(); }
        public void write(Entity et, Object vl) { ((VendorPrimaryKeyOnly)et).setPrimaryKeyOnlyId(ctl(vl)); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "VENDOR_PRIMARY_KEY_ONLY";
    protected final String _tablePropertyName = "vendorPrimaryKeyOnly";
    protected final TableSqlName _tableSqlName = new TableSqlName("EXAMPLEDB.PUBLIC.VENDOR_PRIMARY_KEY_ONLY", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPrimaryKeyOnlyId = cci("PRIMARY_KEY_ONLY_ID", "PRIMARY_KEY_ONLY_ID", null, null, Long.class, "primaryKeyOnlyId", null, true, false, true, "BIGINT", 19, 0, null, false, null, null, null, null, null);

    /**
     * PRIMARY_KEY_ONLY_ID: {PK, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrimaryKeyOnlyId() { return _columnPrimaryKeyOnlyId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnPrimaryKeyOnlyId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnPrimaryKeyOnlyId()); }
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

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.guice.dbflute.exentity.VendorPrimaryKeyOnly"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.guice.dbflute.cbean.VendorPrimaryKeyOnlyCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.guice.dbflute.exbhv.VendorPrimaryKeyOnlyBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<VendorPrimaryKeyOnly> getEntityType() { return VendorPrimaryKeyOnly.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public VendorPrimaryKeyOnly newEntity() { return new VendorPrimaryKeyOnly(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((VendorPrimaryKeyOnly)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((VendorPrimaryKeyOnly)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
