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
 * The DB meta of WHITE_DATE_TERM. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteDateTermDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteDateTermDbm _instance = new WhiteDateTermDbm();
    private WhiteDateTermDbm() {}
    public static WhiteDateTermDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgDateTermId(), "dateTermId");
        setupEpg(_epgMap, new EpgDateTermValue(), "dateTermValue");
        setupEpg(_epgMap, new EpgBeginDate(), "beginDate");
        setupEpg(_epgMap, new EpgEndDate(), "endDate");
    }
    public static class EpgDateTermId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteDateTerm)et).getDateTermId(); }
        public void write(Entity et, Object vl) { ((WhiteDateTerm)et).setDateTermId(ctl(vl)); }
    }
    public static class EpgDateTermValue implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteDateTerm)et).getDateTermValue(); }
        public void write(Entity et, Object vl) { ((WhiteDateTerm)et).setDateTermValue((String)vl); }
    }
    public static class EpgBeginDate implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteDateTerm)et).getBeginDate(); }
        public void write(Entity et, Object vl) { ((WhiteDateTerm)et).setBeginDate((org.joda.time.LocalDate)vl); }
    }
    public static class EpgEndDate implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteDateTerm)et).getEndDate(); }
        public void write(Entity et, Object vl) { ((WhiteDateTerm)et).setEndDate((org.joda.time.LocalDate)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_DATE_TERM";
    protected final String _tablePropertyName = "whiteDateTerm";
    protected final TableSqlName _tableSqlName = new TableSqlName("EXAMPLEDB.PUBLIC.WHITE_DATE_TERM", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnDateTermId = cci("DATE_TERM_ID", "DATE_TERM_ID", null, null, Long.class, "dateTermId", null, true, false, true, "DECIMAL", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnDateTermValue = cci("DATE_TERM_VALUE", "DATE_TERM_VALUE", null, null, String.class, "dateTermValue", null, false, false, true, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBeginDate = cci("BEGIN_DATE", "BEGIN_DATE", null, null, org.joda.time.LocalDate.class, "beginDate", null, false, false, true, "DATE", 8, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnEndDate = cci("END_DATE", "END_DATE", null, null, org.joda.time.LocalDate.class, "endDate", null, false, false, true, "DATE", 8, 0, null, false, null, null, null, null, null);

    /**
     * DATE_TERM_ID: {PK, NotNull, DECIMAL(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDateTermId() { return _columnDateTermId; }
    /**
     * DATE_TERM_VALUE: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDateTermValue() { return _columnDateTermValue; }
    /**
     * BEGIN_DATE: {NotNull, DATE(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBeginDate() { return _columnBeginDate; }
    /**
     * END_DATE: {NotNull, DATE(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEndDate() { return _columnEndDate; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnDateTermId());
        ls.add(columnDateTermValue());
        ls.add(columnBeginDate());
        ls.add(columnEndDate());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnDateTermId()); }
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
    public String getEntityTypeName() { return "com.example.dbflute.guice.dbflute.exentity.WhiteDateTerm"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.guice.dbflute.cbean.WhiteDateTermCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.guice.dbflute.exbhv.WhiteDateTermBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteDateTerm> getEntityType() { return WhiteDateTerm.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteDateTerm newEntity() { return new WhiteDateTerm(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteDateTerm)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteDateTerm)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
