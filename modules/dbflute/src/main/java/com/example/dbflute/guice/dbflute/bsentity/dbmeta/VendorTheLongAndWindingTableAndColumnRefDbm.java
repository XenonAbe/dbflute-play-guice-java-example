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
 * The DB meta of VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class VendorTheLongAndWindingTableAndColumnRefDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final VendorTheLongAndWindingTableAndColumnRefDbm _instance = new VendorTheLongAndWindingTableAndColumnRefDbm();
    private VendorTheLongAndWindingTableAndColumnRefDbm() {}
    public static VendorTheLongAndWindingTableAndColumnRefDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgTheLongAndWindingTableAndColumnRefId(), "theLongAndWindingTableAndColumnRefId");
        setupEpg(_epgMap, new EpgTheLongAndWindingTableAndColumnId(), "theLongAndWindingTableAndColumnId");
        setupEpg(_epgMap, new EpgTheLongAndWindingTableAndColumnRefDate(), "theLongAndWindingTableAndColumnRefDate");
        setupEpg(_epgMap, new EpgShortDate(), "shortDate");
    }
    public static class EpgTheLongAndWindingTableAndColumnRefId implements PropertyGateway {
        public Object read(Entity et) { return ((VendorTheLongAndWindingTableAndColumnRef)et).getTheLongAndWindingTableAndColumnRefId(); }
        public void write(Entity et, Object vl) { ((VendorTheLongAndWindingTableAndColumnRef)et).setTheLongAndWindingTableAndColumnRefId(ctl(vl)); }
    }
    public static class EpgTheLongAndWindingTableAndColumnId implements PropertyGateway {
        public Object read(Entity et) { return ((VendorTheLongAndWindingTableAndColumnRef)et).getTheLongAndWindingTableAndColumnId(); }
        public void write(Entity et, Object vl) { ((VendorTheLongAndWindingTableAndColumnRef)et).setTheLongAndWindingTableAndColumnId(ctl(vl)); }
    }
    public static class EpgTheLongAndWindingTableAndColumnRefDate implements PropertyGateway {
        public Object read(Entity et) { return ((VendorTheLongAndWindingTableAndColumnRef)et).getTheLongAndWindingTableAndColumnRefDate(); }
        public void write(Entity et, Object vl) { ((VendorTheLongAndWindingTableAndColumnRef)et).setTheLongAndWindingTableAndColumnRefDate((org.joda.time.LocalDate)vl); }
    }
    public static class EpgShortDate implements PropertyGateway {
        public Object read(Entity et) { return ((VendorTheLongAndWindingTableAndColumnRef)et).getShortDate(); }
        public void write(Entity et, Object vl) { ((VendorTheLongAndWindingTableAndColumnRef)et).setShortDate((org.joda.time.LocalDate)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgVendorTheLongAndWindingTableAndColumn(), "vendorTheLongAndWindingTableAndColumn");
    }
    public class EfpgVendorTheLongAndWindingTableAndColumn implements PropertyGateway {
        public Object read(Entity et) { return ((VendorTheLongAndWindingTableAndColumnRef)et).getVendorTheLongAndWindingTableAndColumn(); }
        @SuppressWarnings("unchecked")
        public void write(Entity et, Object vl) { ((VendorTheLongAndWindingTableAndColumnRef)et).setVendorTheLongAndWindingTableAndColumn((OptionalEntity<VendorTheLongAndWindingTableAndColumn>)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF";
    protected final String _tablePropertyName = "vendorTheLongAndWindingTableAndColumnRef";
    protected final TableSqlName _tableSqlName = new TableSqlName("EXAMPLEDB.PUBLIC.VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTheLongAndWindingTableAndColumnRefId = cci("THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID", "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID", null, null, Long.class, "theLongAndWindingTableAndColumnRefId", null, true, false, true, "BIGINT", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTheLongAndWindingTableAndColumnId = cci("THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID", "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID", null, null, Long.class, "theLongAndWindingTableAndColumnId", null, false, false, true, "BIGINT", 19, 0, null, false, null, null, "vendorTheLongAndWindingTableAndColumn", null, null);
    protected final ColumnInfo _columnTheLongAndWindingTableAndColumnRefDate = cci("THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE", "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE", null, null, org.joda.time.LocalDate.class, "theLongAndWindingTableAndColumnRefDate", null, false, false, true, "DATE", 8, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnShortDate = cci("SHORT_DATE", "SHORT_DATE", null, null, org.joda.time.LocalDate.class, "shortDate", null, false, false, true, "DATE", 8, 0, null, false, null, null, null, null, null);

    /**
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID: {PK, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTheLongAndWindingTableAndColumnRefId() { return _columnTheLongAndWindingTableAndColumnRefId; }
    /**
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {IX, NotNull, BIGINT(19), FK to VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTheLongAndWindingTableAndColumnId() { return _columnTheLongAndWindingTableAndColumnId; }
    /**
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE: {NotNull, DATE(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTheLongAndWindingTableAndColumnRefDate() { return _columnTheLongAndWindingTableAndColumnRefDate; }
    /**
     * SHORT_DATE: {NotNull, DATE(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShortDate() { return _columnShortDate; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnTheLongAndWindingTableAndColumnRefId());
        ls.add(columnTheLongAndWindingTableAndColumnId());
        ls.add(columnTheLongAndWindingTableAndColumnRefDate());
        ls.add(columnShortDate());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnTheLongAndWindingTableAndColumnRefId()); }
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
     * VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN by my THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID, named 'vendorTheLongAndWindingTableAndColumn'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignVendorTheLongAndWindingTableAndColumn() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTheLongAndWindingTableAndColumnId(), VendorTheLongAndWindingTableAndColumnDbm.getInstance().columnTheLongAndWindingTableAndColumnId());
        return cfi("FK_VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF", "vendorTheLongAndWindingTableAndColumn", this, VendorTheLongAndWindingTableAndColumnDbm.getInstance(), mp, 0, org.seasar.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "vendorTheLongAndWindingTableAndColumnRefList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.guice.dbflute.exentity.VendorTheLongAndWindingTableAndColumnRef"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.guice.dbflute.cbean.VendorTheLongAndWindingTableAndColumnRefCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.guice.dbflute.exbhv.VendorTheLongAndWindingTableAndColumnRefBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<VendorTheLongAndWindingTableAndColumnRef> getEntityType() { return VendorTheLongAndWindingTableAndColumnRef.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public VendorTheLongAndWindingTableAndColumnRef newEntity() { return new VendorTheLongAndWindingTableAndColumnRef(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((VendorTheLongAndWindingTableAndColumnRef)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((VendorTheLongAndWindingTableAndColumnRef)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
