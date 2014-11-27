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
 * The DB meta of VENDOR_$_DOLLAR. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class Vendor$DollarDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final Vendor$DollarDbm _instance = new Vendor$DollarDbm();
    private Vendor$DollarDbm() {}
    public static Vendor$DollarDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgVendor$DollarId(), "vendor$DollarId");
        setupEpg(_epgMap, new EpgVendor$DollarName(), "vendor$DollarName");
    }
    public static class EpgVendor$DollarId implements PropertyGateway {
        public Object read(Entity et) { return ((Vendor$Dollar)et).getVendor$DollarId(); }
        public void write(Entity et, Object vl) { ((Vendor$Dollar)et).setVendor$DollarId(cti(vl)); }
    }
    public static class EpgVendor$DollarName implements PropertyGateway {
        public Object read(Entity et) { return ((Vendor$Dollar)et).getVendor$DollarName(); }
        public void write(Entity et, Object vl) { ((Vendor$Dollar)et).setVendor$DollarName((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "VENDOR_$_DOLLAR";
    protected final String _tablePropertyName = "vendor$Dollar";
    protected final TableSqlName _tableSqlName = new TableSqlName("EXAMPLEDB.PUBLIC.VENDOR_$_DOLLAR", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnVendor$DollarId = cci("VENDOR_$_DOLLAR_ID", "VENDOR_$_DOLLAR_ID", null, null, Integer.class, "vendor$DollarId", null, true, false, true, "INTEGER", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnVendor$DollarName = cci("VENDOR_$_DOLLAR_NAME", "VENDOR_$_DOLLAR_NAME", null, null, String.class, "vendor$DollarName", null, false, false, false, "VARCHAR", 32, 0, null, false, null, null, null, null, null);

    /**
     * VENDOR_$_DOLLAR_ID: {PK, NotNull, INTEGER(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVendor$DollarId() { return _columnVendor$DollarId; }
    /**
     * VENDOR_$_DOLLAR_NAME: {VARCHAR(32)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVendor$DollarName() { return _columnVendor$DollarName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnVendor$DollarId());
        ls.add(columnVendor$DollarName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnVendor$DollarId()); }
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
    public String getEntityTypeName() { return "com.example.dbflute.guice.dbflute.exentity.Vendor$Dollar"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.guice.dbflute.cbean.Vendor$DollarCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.guice.dbflute.exbhv.Vendor$DollarBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Vendor$Dollar> getEntityType() { return Vendor$Dollar.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Vendor$Dollar newEntity() { return new Vendor$Dollar(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Vendor$Dollar)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Vendor$Dollar)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
