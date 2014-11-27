package com.example.dbflute.guice.simpleflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * The simple DTO of VENDOR_CHECK as TABLE. <br />
 * <pre>
 * [primary-key]
 *     VENDOR_CHECK_ID
 * 
 * [column]
 *     VENDOR_CHECK_ID, TYPE_OF_CHAR, TYPE_OF_VARCHAR, TYPE_OF_CLOB, TYPE_OF_TEXT, TYPE_OF_NUMERIC_INTEGER, TYPE_OF_NUMERIC_BIGINT, TYPE_OF_NUMERIC_DECIMAL, TYPE_OF_NUMERIC_INTEGER_MIN, TYPE_OF_NUMERIC_INTEGER_MAX, TYPE_OF_NUMERIC_BIGINT_MIN, TYPE_OF_NUMERIC_BIGINT_MAX, TYPE_OF_NUMERIC_SUPERINT_MIN, TYPE_OF_NUMERIC_SUPERINT_MAX, TYPE_OF_NUMERIC_MAXDECIMAL, TYPE_OF_INTEGER, TYPE_OF_BIGINT, TYPE_OF_DATE, TYPE_OF_TIMESTAMP, TYPE_OF_TIME, TYPE_OF_BOOLEAN, TYPE_OF_BINARY, TYPE_OF_BLOB, TYPE_OF_UUID, TYPE_OF_ARRAY, TYPE_OF_OTHER, J_A_V_A_BEANS_PROPERTY, J_POP_BEANS_PROPERTY
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     
 * 
 * [foreign-table]
 *     
 * 
 * [referrer-table]
 *     
 * 
 * [foreign-property]
 *     
 * 
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsVendorCheckDto implements Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)} */
    @JsonKey
    protected Long _vendorCheckId;

    /** TYPE_OF_CHAR: {CHAR(3)} */
    @JsonKey
    protected String _typeOfChar;

    /** TYPE_OF_VARCHAR: {VARCHAR(32)} */
    @JsonKey
    protected String _typeOfVarchar;

    /** TYPE_OF_CLOB: {CLOB(2147483647)} */
    @JsonKey
    protected String _typeOfClob;

    /** TYPE_OF_TEXT: {CLOB(2147483647)} */
    @JsonKey
    protected String _typeOfText;

    /** TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)} */
    @JsonKey
    protected Integer _typeOfNumericInteger;

    /** TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)} */
    @JsonKey
    protected Long _typeOfNumericBigint;

    /** TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)} */
    @JsonKey
    protected java.math.BigDecimal _typeOfNumericDecimal;

    /** TYPE_OF_NUMERIC_INTEGER_MIN: {DECIMAL(1)} */
    @JsonKey
    protected Integer _typeOfNumericIntegerMin;

    /** TYPE_OF_NUMERIC_INTEGER_MAX: {DECIMAL(9)} */
    @JsonKey
    protected Integer _typeOfNumericIntegerMax;

    /** TYPE_OF_NUMERIC_BIGINT_MIN: {DECIMAL(10)} */
    @JsonKey
    protected Long _typeOfNumericBigintMin;

    /** TYPE_OF_NUMERIC_BIGINT_MAX: {DECIMAL(18)} */
    @JsonKey
    protected Long _typeOfNumericBigintMax;

    /** TYPE_OF_NUMERIC_SUPERINT_MIN: {DECIMAL(19)} */
    @JsonKey
    protected java.math.BigDecimal _typeOfNumericSuperintMin;

    /** TYPE_OF_NUMERIC_SUPERINT_MAX: {DECIMAL(38)} */
    @JsonKey
    protected java.math.BigDecimal _typeOfNumericSuperintMax;

    /** TYPE_OF_NUMERIC_MAXDECIMAL: {DECIMAL(38, 38)} */
    @JsonKey
    protected java.math.BigDecimal _typeOfNumericMaxdecimal;

    /** TYPE_OF_INTEGER: {INTEGER(10)} */
    @JsonKey
    protected Integer _typeOfInteger;

    /** TYPE_OF_BIGINT: {BIGINT(19)} */
    @JsonKey
    protected Long _typeOfBigint;

    /** TYPE_OF_DATE: {DATE(8)} */
    @JsonKey
    protected org.joda.time.LocalDate _typeOfDate;

    /** TYPE_OF_TIMESTAMP: {TIMESTAMP(23, 10)} */
    @JsonKey
    protected org.joda.time.LocalDateTime _typeOfTimestamp;

    /** TYPE_OF_TIME: {TIME(6)} */
    @JsonKey
    protected org.joda.time.LocalTime _typeOfTime;

    /** TYPE_OF_BOOLEAN: {BOOLEAN(1)} */
    @JsonKey
    protected Boolean _typeOfBoolean;

    /** TYPE_OF_BINARY: {VARBINARY(2147483647)} */
    @JsonKey
    protected byte[] _typeOfBinary;

    /** TYPE_OF_BLOB: {BLOB(2147483647)} */
    @JsonKey
    protected byte[] _typeOfBlob;

    /** TYPE_OF_UUID: {UUID(2147483647)} */
    @JsonKey
    protected byte[] _typeOfUuid;

    /** TYPE_OF_ARRAY: {ARRAY} */
    @JsonKey
    protected String _typeOfArray;

    /** TYPE_OF_OTHER: {OTHER(2147483647)} */
    @JsonKey
    protected String _typeOfOther;

    /** J_A_V_A_BEANS_PROPERTY: {VARCHAR(10)} */
    @JsonKey
    protected String _jAVABeansProperty;

    /** J_POP_BEANS_PROPERTY: {VARCHAR(10)} */
    @JsonKey
    protected String _jPopBeansProperty;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsVendorCheckDto() {
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    public Set<String> mymodifiedProperties() {
        return __modifiedProperties;
    }

    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsVendorCheckDto)) { return false; }
        final BsVendorCheckDto otherEntity = (BsVendorCheckDto)other;
        if (!helpComparingValue(getVendorCheckId(), otherEntity.getVendorCheckId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "VENDOR_CHECK");
        result = xCH(result, getVendorCheckId());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        if (value == null) {
            return result;
        }
        return (31 * result) + (value instanceof byte[] ? ((byte[]) value).length : value.hashCode());
    }

    public int instanceHash() {
        return super.hashCode();
    }

    public String toString() {
        String c = ", ";
        StringBuilder sb = new StringBuilder();
        sb.append(c).append(getVendorCheckId());
        sb.append(c).append(getTypeOfChar());
        sb.append(c).append(getTypeOfVarchar());
        sb.append(c).append(getTypeOfClob());
        sb.append(c).append(getTypeOfText());
        sb.append(c).append(getTypeOfNumericInteger());
        sb.append(c).append(getTypeOfNumericBigint());
        sb.append(c).append(getTypeOfNumericDecimal());
        sb.append(c).append(getTypeOfNumericIntegerMin());
        sb.append(c).append(getTypeOfNumericIntegerMax());
        sb.append(c).append(getTypeOfNumericBigintMin());
        sb.append(c).append(getTypeOfNumericBigintMax());
        sb.append(c).append(getTypeOfNumericSuperintMin());
        sb.append(c).append(getTypeOfNumericSuperintMax());
        sb.append(c).append(getTypeOfNumericMaxdecimal());
        sb.append(c).append(getTypeOfInteger());
        sb.append(c).append(getTypeOfBigint());
        sb.append(c).append(getTypeOfDate());
        sb.append(c).append(getTypeOfTimestamp());
        sb.append(c).append(getTypeOfTime());
        sb.append(c).append(getTypeOfBoolean());
        sb.append(c).append(xfBA(getTypeOfBinary()));
        sb.append(c).append(xfBA(getTypeOfBlob()));
        sb.append(c).append(xfBA(getTypeOfUuid()));
        sb.append(c).append(getTypeOfArray());
        sb.append(c).append(getTypeOfOther());
        sb.append(c).append(getJAVABeansProperty());
        sb.append(c).append(getJPopBeansProperty());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String xfBA(byte[] bytes) { // formatByteArray()
        return "byte[" + (bytes != null ? String.valueOf(bytes.length) : "null") + "]";
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)} <br />
     * @return The value of the column 'VENDOR_CHECK_ID'. (NullAllowed)
     */
    public Long getVendorCheckId() {
        return _vendorCheckId;
    }

    /**
     * [set] VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)} <br />
     * @param vendorCheckId The value of the column 'VENDOR_CHECK_ID'. (NullAllowed)
     */
    public void setVendorCheckId(Long vendorCheckId) {
        __modifiedProperties.add("vendorCheckId");
        this._vendorCheckId = vendorCheckId;
    }

    /**
     * [get] TYPE_OF_CHAR: {CHAR(3)} <br />
     * @return The value of the column 'TYPE_OF_CHAR'. (NullAllowed)
     */
    public String getTypeOfChar() {
        return _typeOfChar;
    }

    /**
     * [set] TYPE_OF_CHAR: {CHAR(3)} <br />
     * @param typeOfChar The value of the column 'TYPE_OF_CHAR'. (NullAllowed)
     */
    public void setTypeOfChar(String typeOfChar) {
        __modifiedProperties.add("typeOfChar");
        this._typeOfChar = typeOfChar;
    }

    /**
     * [get] TYPE_OF_VARCHAR: {VARCHAR(32)} <br />
     * @return The value of the column 'TYPE_OF_VARCHAR'. (NullAllowed)
     */
    public String getTypeOfVarchar() {
        return _typeOfVarchar;
    }

    /**
     * [set] TYPE_OF_VARCHAR: {VARCHAR(32)} <br />
     * @param typeOfVarchar The value of the column 'TYPE_OF_VARCHAR'. (NullAllowed)
     */
    public void setTypeOfVarchar(String typeOfVarchar) {
        __modifiedProperties.add("typeOfVarchar");
        this._typeOfVarchar = typeOfVarchar;
    }

    /**
     * [get] TYPE_OF_CLOB: {CLOB(2147483647)} <br />
     * @return The value of the column 'TYPE_OF_CLOB'. (NullAllowed)
     */
    public String getTypeOfClob() {
        return _typeOfClob;
    }

    /**
     * [set] TYPE_OF_CLOB: {CLOB(2147483647)} <br />
     * @param typeOfClob The value of the column 'TYPE_OF_CLOB'. (NullAllowed)
     */
    public void setTypeOfClob(String typeOfClob) {
        __modifiedProperties.add("typeOfClob");
        this._typeOfClob = typeOfClob;
    }

    /**
     * [get] TYPE_OF_TEXT: {CLOB(2147483647)} <br />
     * @return The value of the column 'TYPE_OF_TEXT'. (NullAllowed)
     */
    public String getTypeOfText() {
        return _typeOfText;
    }

    /**
     * [set] TYPE_OF_TEXT: {CLOB(2147483647)} <br />
     * @param typeOfText The value of the column 'TYPE_OF_TEXT'. (NullAllowed)
     */
    public void setTypeOfText(String typeOfText) {
        __modifiedProperties.add("typeOfText");
        this._typeOfText = typeOfText;
    }

    /**
     * [get] TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_INTEGER'. (NullAllowed)
     */
    public Integer getTypeOfNumericInteger() {
        return _typeOfNumericInteger;
    }

    /**
     * [set] TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)} <br />
     * @param typeOfNumericInteger The value of the column 'TYPE_OF_NUMERIC_INTEGER'. (NullAllowed)
     */
    public void setTypeOfNumericInteger(Integer typeOfNumericInteger) {
        __modifiedProperties.add("typeOfNumericInteger");
        this._typeOfNumericInteger = typeOfNumericInteger;
    }

    /**
     * [get] TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_BIGINT'. (NullAllowed)
     */
    public Long getTypeOfNumericBigint() {
        return _typeOfNumericBigint;
    }

    /**
     * [set] TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)} <br />
     * @param typeOfNumericBigint The value of the column 'TYPE_OF_NUMERIC_BIGINT'. (NullAllowed)
     */
    public void setTypeOfNumericBigint(Long typeOfNumericBigint) {
        __modifiedProperties.add("typeOfNumericBigint");
        this._typeOfNumericBigint = typeOfNumericBigint;
    }

    /**
     * [get] TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_DECIMAL'. (NullAllowed)
     */
    public java.math.BigDecimal getTypeOfNumericDecimal() {
        return _typeOfNumericDecimal;
    }

    /**
     * [set] TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)} <br />
     * @param typeOfNumericDecimal The value of the column 'TYPE_OF_NUMERIC_DECIMAL'. (NullAllowed)
     */
    public void setTypeOfNumericDecimal(java.math.BigDecimal typeOfNumericDecimal) {
        __modifiedProperties.add("typeOfNumericDecimal");
        this._typeOfNumericDecimal = typeOfNumericDecimal;
    }

    /**
     * [get] TYPE_OF_NUMERIC_INTEGER_MIN: {DECIMAL(1)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_INTEGER_MIN'. (NullAllowed)
     */
    public Integer getTypeOfNumericIntegerMin() {
        return _typeOfNumericIntegerMin;
    }

    /**
     * [set] TYPE_OF_NUMERIC_INTEGER_MIN: {DECIMAL(1)} <br />
     * @param typeOfNumericIntegerMin The value of the column 'TYPE_OF_NUMERIC_INTEGER_MIN'. (NullAllowed)
     */
    public void setTypeOfNumericIntegerMin(Integer typeOfNumericIntegerMin) {
        __modifiedProperties.add("typeOfNumericIntegerMin");
        this._typeOfNumericIntegerMin = typeOfNumericIntegerMin;
    }

    /**
     * [get] TYPE_OF_NUMERIC_INTEGER_MAX: {DECIMAL(9)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_INTEGER_MAX'. (NullAllowed)
     */
    public Integer getTypeOfNumericIntegerMax() {
        return _typeOfNumericIntegerMax;
    }

    /**
     * [set] TYPE_OF_NUMERIC_INTEGER_MAX: {DECIMAL(9)} <br />
     * @param typeOfNumericIntegerMax The value of the column 'TYPE_OF_NUMERIC_INTEGER_MAX'. (NullAllowed)
     */
    public void setTypeOfNumericIntegerMax(Integer typeOfNumericIntegerMax) {
        __modifiedProperties.add("typeOfNumericIntegerMax");
        this._typeOfNumericIntegerMax = typeOfNumericIntegerMax;
    }

    /**
     * [get] TYPE_OF_NUMERIC_BIGINT_MIN: {DECIMAL(10)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_BIGINT_MIN'. (NullAllowed)
     */
    public Long getTypeOfNumericBigintMin() {
        return _typeOfNumericBigintMin;
    }

    /**
     * [set] TYPE_OF_NUMERIC_BIGINT_MIN: {DECIMAL(10)} <br />
     * @param typeOfNumericBigintMin The value of the column 'TYPE_OF_NUMERIC_BIGINT_MIN'. (NullAllowed)
     */
    public void setTypeOfNumericBigintMin(Long typeOfNumericBigintMin) {
        __modifiedProperties.add("typeOfNumericBigintMin");
        this._typeOfNumericBigintMin = typeOfNumericBigintMin;
    }

    /**
     * [get] TYPE_OF_NUMERIC_BIGINT_MAX: {DECIMAL(18)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_BIGINT_MAX'. (NullAllowed)
     */
    public Long getTypeOfNumericBigintMax() {
        return _typeOfNumericBigintMax;
    }

    /**
     * [set] TYPE_OF_NUMERIC_BIGINT_MAX: {DECIMAL(18)} <br />
     * @param typeOfNumericBigintMax The value of the column 'TYPE_OF_NUMERIC_BIGINT_MAX'. (NullAllowed)
     */
    public void setTypeOfNumericBigintMax(Long typeOfNumericBigintMax) {
        __modifiedProperties.add("typeOfNumericBigintMax");
        this._typeOfNumericBigintMax = typeOfNumericBigintMax;
    }

    /**
     * [get] TYPE_OF_NUMERIC_SUPERINT_MIN: {DECIMAL(19)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_SUPERINT_MIN'. (NullAllowed)
     */
    public java.math.BigDecimal getTypeOfNumericSuperintMin() {
        return _typeOfNumericSuperintMin;
    }

    /**
     * [set] TYPE_OF_NUMERIC_SUPERINT_MIN: {DECIMAL(19)} <br />
     * @param typeOfNumericSuperintMin The value of the column 'TYPE_OF_NUMERIC_SUPERINT_MIN'. (NullAllowed)
     */
    public void setTypeOfNumericSuperintMin(java.math.BigDecimal typeOfNumericSuperintMin) {
        __modifiedProperties.add("typeOfNumericSuperintMin");
        this._typeOfNumericSuperintMin = typeOfNumericSuperintMin;
    }

    /**
     * [get] TYPE_OF_NUMERIC_SUPERINT_MAX: {DECIMAL(38)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_SUPERINT_MAX'. (NullAllowed)
     */
    public java.math.BigDecimal getTypeOfNumericSuperintMax() {
        return _typeOfNumericSuperintMax;
    }

    /**
     * [set] TYPE_OF_NUMERIC_SUPERINT_MAX: {DECIMAL(38)} <br />
     * @param typeOfNumericSuperintMax The value of the column 'TYPE_OF_NUMERIC_SUPERINT_MAX'. (NullAllowed)
     */
    public void setTypeOfNumericSuperintMax(java.math.BigDecimal typeOfNumericSuperintMax) {
        __modifiedProperties.add("typeOfNumericSuperintMax");
        this._typeOfNumericSuperintMax = typeOfNumericSuperintMax;
    }

    /**
     * [get] TYPE_OF_NUMERIC_MAXDECIMAL: {DECIMAL(38, 38)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_MAXDECIMAL'. (NullAllowed)
     */
    public java.math.BigDecimal getTypeOfNumericMaxdecimal() {
        return _typeOfNumericMaxdecimal;
    }

    /**
     * [set] TYPE_OF_NUMERIC_MAXDECIMAL: {DECIMAL(38, 38)} <br />
     * @param typeOfNumericMaxdecimal The value of the column 'TYPE_OF_NUMERIC_MAXDECIMAL'. (NullAllowed)
     */
    public void setTypeOfNumericMaxdecimal(java.math.BigDecimal typeOfNumericMaxdecimal) {
        __modifiedProperties.add("typeOfNumericMaxdecimal");
        this._typeOfNumericMaxdecimal = typeOfNumericMaxdecimal;
    }

    /**
     * [get] TYPE_OF_INTEGER: {INTEGER(10)} <br />
     * @return The value of the column 'TYPE_OF_INTEGER'. (NullAllowed)
     */
    public Integer getTypeOfInteger() {
        return _typeOfInteger;
    }

    /**
     * [set] TYPE_OF_INTEGER: {INTEGER(10)} <br />
     * @param typeOfInteger The value of the column 'TYPE_OF_INTEGER'. (NullAllowed)
     */
    public void setTypeOfInteger(Integer typeOfInteger) {
        __modifiedProperties.add("typeOfInteger");
        this._typeOfInteger = typeOfInteger;
    }

    /**
     * [get] TYPE_OF_BIGINT: {BIGINT(19)} <br />
     * @return The value of the column 'TYPE_OF_BIGINT'. (NullAllowed)
     */
    public Long getTypeOfBigint() {
        return _typeOfBigint;
    }

    /**
     * [set] TYPE_OF_BIGINT: {BIGINT(19)} <br />
     * @param typeOfBigint The value of the column 'TYPE_OF_BIGINT'. (NullAllowed)
     */
    public void setTypeOfBigint(Long typeOfBigint) {
        __modifiedProperties.add("typeOfBigint");
        this._typeOfBigint = typeOfBigint;
    }

    /**
     * [get] TYPE_OF_DATE: {DATE(8)} <br />
     * @return The value of the column 'TYPE_OF_DATE'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd")
    public org.joda.time.LocalDate getTypeOfDate() {
        return _typeOfDate;
    }

    /**
     * [set] TYPE_OF_DATE: {DATE(8)} <br />
     * @param typeOfDate The value of the column 'TYPE_OF_DATE'. (NullAllowed)
     */
    public void setTypeOfDate(org.joda.time.LocalDate typeOfDate) {
        __modifiedProperties.add("typeOfDate");
        this._typeOfDate = typeOfDate;
    }

    /**
     * [get] TYPE_OF_TIMESTAMP: {TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'TYPE_OF_TIMESTAMP'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
    public org.joda.time.LocalDateTime getTypeOfTimestamp() {
        return _typeOfTimestamp;
    }

    /**
     * [set] TYPE_OF_TIMESTAMP: {TIMESTAMP(23, 10)} <br />
     * @param typeOfTimestamp The value of the column 'TYPE_OF_TIMESTAMP'. (NullAllowed)
     */
    public void setTypeOfTimestamp(org.joda.time.LocalDateTime typeOfTimestamp) {
        __modifiedProperties.add("typeOfTimestamp");
        this._typeOfTimestamp = typeOfTimestamp;
    }

    /**
     * [get] TYPE_OF_TIME: {TIME(6)} <br />
     * @return The value of the column 'TYPE_OF_TIME'. (NullAllowed)
     */
    @JSONHint(format="HH:mm:ss")
    @JsonFormat(pattern="HH:mm:ss")
    public org.joda.time.LocalTime getTypeOfTime() {
        return _typeOfTime;
    }

    /**
     * [set] TYPE_OF_TIME: {TIME(6)} <br />
     * @param typeOfTime The value of the column 'TYPE_OF_TIME'. (NullAllowed)
     */
    public void setTypeOfTime(org.joda.time.LocalTime typeOfTime) {
        __modifiedProperties.add("typeOfTime");
        this._typeOfTime = typeOfTime;
    }

    /**
     * [get] TYPE_OF_BOOLEAN: {BOOLEAN(1)} <br />
     * @return The value of the column 'TYPE_OF_BOOLEAN'. (NullAllowed)
     */
    public Boolean getTypeOfBoolean() {
        return _typeOfBoolean;
    }

    /**
     * [set] TYPE_OF_BOOLEAN: {BOOLEAN(1)} <br />
     * @param typeOfBoolean The value of the column 'TYPE_OF_BOOLEAN'. (NullAllowed)
     */
    public void setTypeOfBoolean(Boolean typeOfBoolean) {
        __modifiedProperties.add("typeOfBoolean");
        this._typeOfBoolean = typeOfBoolean;
    }

    /**
     * [get] TYPE_OF_BINARY: {VARBINARY(2147483647)} <br />
     * @return The value of the column 'TYPE_OF_BINARY'. (NullAllowed)
     */
    public byte[] getTypeOfBinary() {
        return _typeOfBinary;
    }

    /**
     * [set] TYPE_OF_BINARY: {VARBINARY(2147483647)} <br />
     * @param typeOfBinary The value of the column 'TYPE_OF_BINARY'. (NullAllowed)
     */
    public void setTypeOfBinary(byte[] typeOfBinary) {
        __modifiedProperties.add("typeOfBinary");
        this._typeOfBinary = typeOfBinary;
    }

    /**
     * [get] TYPE_OF_BLOB: {BLOB(2147483647)} <br />
     * @return The value of the column 'TYPE_OF_BLOB'. (NullAllowed)
     */
    public byte[] getTypeOfBlob() {
        return _typeOfBlob;
    }

    /**
     * [set] TYPE_OF_BLOB: {BLOB(2147483647)} <br />
     * @param typeOfBlob The value of the column 'TYPE_OF_BLOB'. (NullAllowed)
     */
    public void setTypeOfBlob(byte[] typeOfBlob) {
        __modifiedProperties.add("typeOfBlob");
        this._typeOfBlob = typeOfBlob;
    }

    /**
     * [get] TYPE_OF_UUID: {UUID(2147483647)} <br />
     * @return The value of the column 'TYPE_OF_UUID'. (NullAllowed)
     */
    public byte[] getTypeOfUuid() {
        return _typeOfUuid;
    }

    /**
     * [set] TYPE_OF_UUID: {UUID(2147483647)} <br />
     * @param typeOfUuid The value of the column 'TYPE_OF_UUID'. (NullAllowed)
     */
    public void setTypeOfUuid(byte[] typeOfUuid) {
        __modifiedProperties.add("typeOfUuid");
        this._typeOfUuid = typeOfUuid;
    }

    /**
     * [get] TYPE_OF_ARRAY: {ARRAY} <br />
     * @return The value of the column 'TYPE_OF_ARRAY'. (NullAllowed)
     */
    public String getTypeOfArray() {
        return _typeOfArray;
    }

    /**
     * [set] TYPE_OF_ARRAY: {ARRAY} <br />
     * @param typeOfArray The value of the column 'TYPE_OF_ARRAY'. (NullAllowed)
     */
    public void setTypeOfArray(String typeOfArray) {
        __modifiedProperties.add("typeOfArray");
        this._typeOfArray = typeOfArray;
    }

    /**
     * [get] TYPE_OF_OTHER: {OTHER(2147483647)} <br />
     * @return The value of the column 'TYPE_OF_OTHER'. (NullAllowed)
     */
    public String getTypeOfOther() {
        return _typeOfOther;
    }

    /**
     * [set] TYPE_OF_OTHER: {OTHER(2147483647)} <br />
     * @param typeOfOther The value of the column 'TYPE_OF_OTHER'. (NullAllowed)
     */
    public void setTypeOfOther(String typeOfOther) {
        __modifiedProperties.add("typeOfOther");
        this._typeOfOther = typeOfOther;
    }

    /**
     * [get] J_A_V_A_BEANS_PROPERTY: {VARCHAR(10)} <br />
     * @return The value of the column 'J_A_V_A_BEANS_PROPERTY'. (NullAllowed)
     */
    public String getJAVABeansProperty() {
        return _jAVABeansProperty;
    }

    /**
     * [set] J_A_V_A_BEANS_PROPERTY: {VARCHAR(10)} <br />
     * @param jAVABeansProperty The value of the column 'J_A_V_A_BEANS_PROPERTY'. (NullAllowed)
     */
    public void setJAVABeansProperty(String jAVABeansProperty) {
        __modifiedProperties.add("JAVABeansProperty");
        this._jAVABeansProperty = jAVABeansProperty;
    }

    /**
     * [get] J_POP_BEANS_PROPERTY: {VARCHAR(10)} <br />
     * @return The value of the column 'J_POP_BEANS_PROPERTY'. (NullAllowed)
     */
    public String getJPopBeansProperty() {
        return _jPopBeansProperty;
    }

    /**
     * [set] J_POP_BEANS_PROPERTY: {VARCHAR(10)} <br />
     * @param jPopBeansProperty The value of the column 'J_POP_BEANS_PROPERTY'. (NullAllowed)
     */
    public void setJPopBeansProperty(String jPopBeansProperty) {
        __modifiedProperties.add("JPopBeansProperty");
        this._jPopBeansProperty = jPopBeansProperty;
    }

}
