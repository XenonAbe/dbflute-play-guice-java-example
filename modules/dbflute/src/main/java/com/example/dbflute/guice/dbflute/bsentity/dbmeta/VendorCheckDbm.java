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
 * The DB meta of VENDOR_CHECK. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class VendorCheckDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final VendorCheckDbm _instance = new VendorCheckDbm();
    private VendorCheckDbm() {}
    public static VendorCheckDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgVendorCheckId(), "vendorCheckId");
        setupEpg(_epgMap, new EpgTypeOfChar(), "typeOfChar");
        setupEpg(_epgMap, new EpgTypeOfVarchar(), "typeOfVarchar");
        setupEpg(_epgMap, new EpgTypeOfClob(), "typeOfClob");
        setupEpg(_epgMap, new EpgTypeOfText(), "typeOfText");
        setupEpg(_epgMap, new EpgTypeOfNumericInteger(), "typeOfNumericInteger");
        setupEpg(_epgMap, new EpgTypeOfNumericBigint(), "typeOfNumericBigint");
        setupEpg(_epgMap, new EpgTypeOfNumericDecimal(), "typeOfNumericDecimal");
        setupEpg(_epgMap, new EpgTypeOfNumericIntegerMin(), "typeOfNumericIntegerMin");
        setupEpg(_epgMap, new EpgTypeOfNumericIntegerMax(), "typeOfNumericIntegerMax");
        setupEpg(_epgMap, new EpgTypeOfNumericBigintMin(), "typeOfNumericBigintMin");
        setupEpg(_epgMap, new EpgTypeOfNumericBigintMax(), "typeOfNumericBigintMax");
        setupEpg(_epgMap, new EpgTypeOfNumericSuperintMin(), "typeOfNumericSuperintMin");
        setupEpg(_epgMap, new EpgTypeOfNumericSuperintMax(), "typeOfNumericSuperintMax");
        setupEpg(_epgMap, new EpgTypeOfNumericMaxdecimal(), "typeOfNumericMaxdecimal");
        setupEpg(_epgMap, new EpgTypeOfInteger(), "typeOfInteger");
        setupEpg(_epgMap, new EpgTypeOfBigint(), "typeOfBigint");
        setupEpg(_epgMap, new EpgTypeOfDate(), "typeOfDate");
        setupEpg(_epgMap, new EpgTypeOfTimestamp(), "typeOfTimestamp");
        setupEpg(_epgMap, new EpgTypeOfTime(), "typeOfTime");
        setupEpg(_epgMap, new EpgTypeOfBoolean(), "typeOfBoolean");
        setupEpg(_epgMap, new EpgTypeOfBinary(), "typeOfBinary");
        setupEpg(_epgMap, new EpgTypeOfBlob(), "typeOfBlob");
        setupEpg(_epgMap, new EpgTypeOfUuid(), "typeOfUuid");
        setupEpg(_epgMap, new EpgTypeOfArray(), "typeOfArray");
        setupEpg(_epgMap, new EpgTypeOfOther(), "typeOfOther");
        setupEpg(_epgMap, new EpgJAVABeansProperty(), "JAVABeansProperty");
        setupEpg(_epgMap, new EpgJPopBeansProperty(), "JPopBeansProperty");
    }
    public static class EpgVendorCheckId implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getVendorCheckId(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setVendorCheckId(ctl(vl)); }
    }
    public static class EpgTypeOfChar implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfChar(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfChar((String)vl); }
    }
    public static class EpgTypeOfVarchar implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfVarchar(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfVarchar((String)vl); }
    }
    public static class EpgTypeOfClob implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfClob(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfClob((String)vl); }
    }
    public static class EpgTypeOfText implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfText(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfText((String)vl); }
    }
    public static class EpgTypeOfNumericInteger implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfNumericInteger(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfNumericInteger(cti(vl)); }
    }
    public static class EpgTypeOfNumericBigint implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfNumericBigint(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfNumericBigint(ctl(vl)); }
    }
    public static class EpgTypeOfNumericDecimal implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfNumericDecimal(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfNumericDecimal(ctb(vl)); }
    }
    public static class EpgTypeOfNumericIntegerMin implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfNumericIntegerMin(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfNumericIntegerMin(cti(vl)); }
    }
    public static class EpgTypeOfNumericIntegerMax implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfNumericIntegerMax(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfNumericIntegerMax(cti(vl)); }
    }
    public static class EpgTypeOfNumericBigintMin implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfNumericBigintMin(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfNumericBigintMin(ctl(vl)); }
    }
    public static class EpgTypeOfNumericBigintMax implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfNumericBigintMax(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfNumericBigintMax(ctl(vl)); }
    }
    public static class EpgTypeOfNumericSuperintMin implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfNumericSuperintMin(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfNumericSuperintMin(ctb(vl)); }
    }
    public static class EpgTypeOfNumericSuperintMax implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfNumericSuperintMax(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfNumericSuperintMax(ctb(vl)); }
    }
    public static class EpgTypeOfNumericMaxdecimal implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfNumericMaxdecimal(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfNumericMaxdecimal(ctb(vl)); }
    }
    public static class EpgTypeOfInteger implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfInteger(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfInteger(cti(vl)); }
    }
    public static class EpgTypeOfBigint implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfBigint(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfBigint(ctl(vl)); }
    }
    public static class EpgTypeOfDate implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfDate(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfDate((org.joda.time.LocalDate)vl); }
    }
    public static class EpgTypeOfTimestamp implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfTimestamp(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfTimestamp((org.joda.time.LocalDateTime)vl); }
    }
    public static class EpgTypeOfTime implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfTime(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfTime((org.joda.time.LocalTime)vl); }
    }
    public static class EpgTypeOfBoolean implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfBoolean(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfBoolean((Boolean)vl); }
    }
    public static class EpgTypeOfBinary implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfBinary(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfBinary((byte[])vl); }
    }
    public static class EpgTypeOfBlob implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfBlob(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfBlob((byte[])vl); }
    }
    public static class EpgTypeOfUuid implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfUuid(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfUuid((byte[])vl); }
    }
    public static class EpgTypeOfArray implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfArray(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfArray((String)vl); }
    }
    public static class EpgTypeOfOther implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getTypeOfOther(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setTypeOfOther((String)vl); }
    }
    public static class EpgJAVABeansProperty implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getJAVABeansProperty(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setJAVABeansProperty((String)vl); }
    }
    public static class EpgJPopBeansProperty implements PropertyGateway {
        public Object read(Entity et) { return ((VendorCheck)et).getJPopBeansProperty(); }
        public void write(Entity et, Object vl) { ((VendorCheck)et).setJPopBeansProperty((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "VENDOR_CHECK";
    protected final String _tablePropertyName = "vendorCheck";
    protected final TableSqlName _tableSqlName = new TableSqlName("EXAMPLEDB.PUBLIC.VENDOR_CHECK", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnVendorCheckId = cci("VENDOR_CHECK_ID", "VENDOR_CHECK_ID", null, null, Long.class, "vendorCheckId", null, true, false, true, "DECIMAL", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfChar = cci("TYPE_OF_CHAR", "TYPE_OF_CHAR", null, null, String.class, "typeOfChar", null, false, false, false, "CHAR", 3, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfVarchar = cci("TYPE_OF_VARCHAR", "TYPE_OF_VARCHAR", null, null, String.class, "typeOfVarchar", null, false, false, false, "VARCHAR", 32, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfClob = cci("TYPE_OF_CLOB", "TYPE_OF_CLOB", null, null, String.class, "typeOfClob", null, false, false, false, "CLOB", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfText = cci("TYPE_OF_TEXT", "TYPE_OF_TEXT", null, null, String.class, "typeOfText", null, false, false, false, "CLOB", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNumericInteger = cci("TYPE_OF_NUMERIC_INTEGER", "TYPE_OF_NUMERIC_INTEGER", null, null, Integer.class, "typeOfNumericInteger", null, false, false, false, "DECIMAL", 5, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNumericBigint = cci("TYPE_OF_NUMERIC_BIGINT", "TYPE_OF_NUMERIC_BIGINT", null, null, Long.class, "typeOfNumericBigint", null, false, false, false, "DECIMAL", 12, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNumericDecimal = cci("TYPE_OF_NUMERIC_DECIMAL", "TYPE_OF_NUMERIC_DECIMAL", null, null, java.math.BigDecimal.class, "typeOfNumericDecimal", null, false, false, false, "DECIMAL", 5, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNumericIntegerMin = cci("TYPE_OF_NUMERIC_INTEGER_MIN", "TYPE_OF_NUMERIC_INTEGER_MIN", null, null, Integer.class, "typeOfNumericIntegerMin", null, false, false, false, "DECIMAL", 1, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNumericIntegerMax = cci("TYPE_OF_NUMERIC_INTEGER_MAX", "TYPE_OF_NUMERIC_INTEGER_MAX", null, null, Integer.class, "typeOfNumericIntegerMax", null, false, false, false, "DECIMAL", 9, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNumericBigintMin = cci("TYPE_OF_NUMERIC_BIGINT_MIN", "TYPE_OF_NUMERIC_BIGINT_MIN", null, null, Long.class, "typeOfNumericBigintMin", null, false, false, false, "DECIMAL", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNumericBigintMax = cci("TYPE_OF_NUMERIC_BIGINT_MAX", "TYPE_OF_NUMERIC_BIGINT_MAX", null, null, Long.class, "typeOfNumericBigintMax", null, false, false, false, "DECIMAL", 18, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNumericSuperintMin = cci("TYPE_OF_NUMERIC_SUPERINT_MIN", "TYPE_OF_NUMERIC_SUPERINT_MIN", null, null, java.math.BigDecimal.class, "typeOfNumericSuperintMin", null, false, false, false, "DECIMAL", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNumericSuperintMax = cci("TYPE_OF_NUMERIC_SUPERINT_MAX", "TYPE_OF_NUMERIC_SUPERINT_MAX", null, null, java.math.BigDecimal.class, "typeOfNumericSuperintMax", null, false, false, false, "DECIMAL", 38, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfNumericMaxdecimal = cci("TYPE_OF_NUMERIC_MAXDECIMAL", "TYPE_OF_NUMERIC_MAXDECIMAL", null, null, java.math.BigDecimal.class, "typeOfNumericMaxdecimal", null, false, false, false, "DECIMAL", 38, 38, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfInteger = cci("TYPE_OF_INTEGER", "TYPE_OF_INTEGER", null, null, Integer.class, "typeOfInteger", null, false, false, false, "INTEGER", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfBigint = cci("TYPE_OF_BIGINT", "TYPE_OF_BIGINT", null, null, Long.class, "typeOfBigint", null, false, false, false, "BIGINT", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfDate = cci("TYPE_OF_DATE", "TYPE_OF_DATE", null, null, org.joda.time.LocalDate.class, "typeOfDate", null, false, false, false, "DATE", 8, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfTimestamp = cci("TYPE_OF_TIMESTAMP", "TYPE_OF_TIMESTAMP", null, null, org.joda.time.LocalDateTime.class, "typeOfTimestamp", null, false, false, false, "TIMESTAMP", 23, 10, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfTime = cci("TYPE_OF_TIME", "TYPE_OF_TIME", null, null, org.joda.time.LocalTime.class, "typeOfTime", null, false, false, false, "TIME", 6, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfBoolean = cci("TYPE_OF_BOOLEAN", "TYPE_OF_BOOLEAN", null, null, Boolean.class, "typeOfBoolean", null, false, false, false, "BOOLEAN", 1, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfBinary = cci("TYPE_OF_BINARY", "TYPE_OF_BINARY", null, null, byte[].class, "typeOfBinary", null, false, false, false, "VARBINARY", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfBlob = cci("TYPE_OF_BLOB", "TYPE_OF_BLOB", null, null, byte[].class, "typeOfBlob", null, false, false, false, "BLOB", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfUuid = cci("TYPE_OF_UUID", "TYPE_OF_UUID", null, null, byte[].class, "typeOfUuid", null, false, false, false, "UUID", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfArray = cci("TYPE_OF_ARRAY", "TYPE_OF_ARRAY", null, null, String.class, "typeOfArray", null, false, false, false, "ARRAY", null, null, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfOther = cci("TYPE_OF_OTHER", "TYPE_OF_OTHER", null, null, String.class, "typeOfOther", null, false, false, false, "OTHER", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnJAVABeansProperty = cci("J_A_V_A_BEANS_PROPERTY", "J_A_V_A_BEANS_PROPERTY", null, null, String.class, "JAVABeansProperty", null, false, false, false, "VARCHAR", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnJPopBeansProperty = cci("J_POP_BEANS_PROPERTY", "J_POP_BEANS_PROPERTY", null, null, String.class, "JPopBeansProperty", null, false, false, false, "VARCHAR", 10, 0, null, false, null, null, null, null, null);

    /**
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVendorCheckId() { return _columnVendorCheckId; }
    /**
     * TYPE_OF_CHAR: {CHAR(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfChar() { return _columnTypeOfChar; }
    /**
     * TYPE_OF_VARCHAR: {VARCHAR(32)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfVarchar() { return _columnTypeOfVarchar; }
    /**
     * TYPE_OF_CLOB: {CLOB(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfClob() { return _columnTypeOfClob; }
    /**
     * TYPE_OF_TEXT: {CLOB(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfText() { return _columnTypeOfText; }
    /**
     * TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumericInteger() { return _columnTypeOfNumericInteger; }
    /**
     * TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumericBigint() { return _columnTypeOfNumericBigint; }
    /**
     * TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumericDecimal() { return _columnTypeOfNumericDecimal; }
    /**
     * TYPE_OF_NUMERIC_INTEGER_MIN: {DECIMAL(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumericIntegerMin() { return _columnTypeOfNumericIntegerMin; }
    /**
     * TYPE_OF_NUMERIC_INTEGER_MAX: {DECIMAL(9)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumericIntegerMax() { return _columnTypeOfNumericIntegerMax; }
    /**
     * TYPE_OF_NUMERIC_BIGINT_MIN: {DECIMAL(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumericBigintMin() { return _columnTypeOfNumericBigintMin; }
    /**
     * TYPE_OF_NUMERIC_BIGINT_MAX: {DECIMAL(18)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumericBigintMax() { return _columnTypeOfNumericBigintMax; }
    /**
     * TYPE_OF_NUMERIC_SUPERINT_MIN: {DECIMAL(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumericSuperintMin() { return _columnTypeOfNumericSuperintMin; }
    /**
     * TYPE_OF_NUMERIC_SUPERINT_MAX: {DECIMAL(38)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumericSuperintMax() { return _columnTypeOfNumericSuperintMax; }
    /**
     * TYPE_OF_NUMERIC_MAXDECIMAL: {DECIMAL(38, 38)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumericMaxdecimal() { return _columnTypeOfNumericMaxdecimal; }
    /**
     * TYPE_OF_INTEGER: {INTEGER(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfInteger() { return _columnTypeOfInteger; }
    /**
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfBigint() { return _columnTypeOfBigint; }
    /**
     * TYPE_OF_DATE: {DATE(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfDate() { return _columnTypeOfDate; }
    /**
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(23, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfTimestamp() { return _columnTypeOfTimestamp; }
    /**
     * TYPE_OF_TIME: {TIME(6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfTime() { return _columnTypeOfTime; }
    /**
     * TYPE_OF_BOOLEAN: {BOOLEAN(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfBoolean() { return _columnTypeOfBoolean; }
    /**
     * TYPE_OF_BINARY: {VARBINARY(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfBinary() { return _columnTypeOfBinary; }
    /**
     * TYPE_OF_BLOB: {BLOB(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfBlob() { return _columnTypeOfBlob; }
    /**
     * TYPE_OF_UUID: {UUID(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfUuid() { return _columnTypeOfUuid; }
    /**
     * TYPE_OF_ARRAY: {ARRAY}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfArray() { return _columnTypeOfArray; }
    /**
     * TYPE_OF_OTHER: {OTHER(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfOther() { return _columnTypeOfOther; }
    /**
     * J_A_V_A_BEANS_PROPERTY: {VARCHAR(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJAVABeansProperty() { return _columnJAVABeansProperty; }
    /**
     * J_POP_BEANS_PROPERTY: {VARCHAR(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJPopBeansProperty() { return _columnJPopBeansProperty; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnVendorCheckId());
        ls.add(columnTypeOfChar());
        ls.add(columnTypeOfVarchar());
        ls.add(columnTypeOfClob());
        ls.add(columnTypeOfText());
        ls.add(columnTypeOfNumericInteger());
        ls.add(columnTypeOfNumericBigint());
        ls.add(columnTypeOfNumericDecimal());
        ls.add(columnTypeOfNumericIntegerMin());
        ls.add(columnTypeOfNumericIntegerMax());
        ls.add(columnTypeOfNumericBigintMin());
        ls.add(columnTypeOfNumericBigintMax());
        ls.add(columnTypeOfNumericSuperintMin());
        ls.add(columnTypeOfNumericSuperintMax());
        ls.add(columnTypeOfNumericMaxdecimal());
        ls.add(columnTypeOfInteger());
        ls.add(columnTypeOfBigint());
        ls.add(columnTypeOfDate());
        ls.add(columnTypeOfTimestamp());
        ls.add(columnTypeOfTime());
        ls.add(columnTypeOfBoolean());
        ls.add(columnTypeOfBinary());
        ls.add(columnTypeOfBlob());
        ls.add(columnTypeOfUuid());
        ls.add(columnTypeOfArray());
        ls.add(columnTypeOfOther());
        ls.add(columnJAVABeansProperty());
        ls.add(columnJPopBeansProperty());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnVendorCheckId()); }
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
    public String getEntityTypeName() { return "com.example.dbflute.guice.dbflute.exentity.VendorCheck"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.guice.dbflute.cbean.VendorCheckCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.guice.dbflute.exbhv.VendorCheckBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<VendorCheck> getEntityType() { return VendorCheck.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public VendorCheck newEntity() { return new VendorCheck(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((VendorCheck)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((VendorCheck)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
