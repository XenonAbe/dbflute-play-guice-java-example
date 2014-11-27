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
 * The DB meta of REGION. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class RegionDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final RegionDbm _instance = new RegionDbm();
    private RegionDbm() {}
    public static RegionDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgRegionId(), "regionId");
        setupEpg(_epgMap, new EpgRegionName(), "regionName");
    }
    public static class EpgRegionId implements PropertyGateway {
        public Object read(Entity et) { return ((Region)et).getRegionId(); }
        public void write(Entity et, Object vl) { ((Region)et).setRegionId(cti(vl)); }
    }
    public static class EpgRegionName implements PropertyGateway {
        public Object read(Entity et) { return ((Region)et).getRegionName(); }
        public void write(Entity et, Object vl) { ((Region)et).setRegionName((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "REGION";
    protected final String _tablePropertyName = "region";
    protected final TableSqlName _tableSqlName = new TableSqlName("EXAMPLEDB.PUBLIC.REGION", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "地域";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnRegionId = cci("REGION_ID", "REGION_ID", null, "地域ID", Integer.class, "regionId", null, true, false, true, "INTEGER", 10, 0, null, false, null, null, null, "memberAddressList", CDef.DefMeta.Region);
    protected final ColumnInfo _columnRegionName = cci("REGION_NAME", "REGION_NAME", null, "地域名称", String.class, "regionName", null, false, false, true, "VARCHAR", 50, 0, null, false, null, null, null, null, null);

    /**
     * (地域ID)REGION_ID: {PK, NotNull, INTEGER(10), classification=Region}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegionId() { return _columnRegionId; }
    /**
     * (地域名称)REGION_NAME: {NotNull, VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegionName() { return _columnRegionName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnRegionId());
        ls.add(columnRegionName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnRegionId()); }
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
     * (会員住所情報)MEMBER_ADDRESS by REGION_ID, named 'memberAddressList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMemberAddressList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnRegionId(), MemberAddressDbm.getInstance().columnRegionId());
        return cri("FK_MEMBER_ADDRESS_REGION", "memberAddressList", this, MemberAddressDbm.getInstance(), mp, false, "region");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.guice.dbflute.exentity.Region"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.guice.dbflute.cbean.RegionCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.guice.dbflute.exbhv.RegionBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Region> getEntityType() { return Region.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Region newEntity() { return new Region(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Region)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Region)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
