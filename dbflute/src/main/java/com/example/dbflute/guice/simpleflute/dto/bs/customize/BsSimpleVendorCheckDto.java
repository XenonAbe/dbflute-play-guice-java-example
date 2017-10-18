package com.example.dbflute.guice.simpleflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SimpleVendorCheck. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     VENDOR_CHECK_ID, TYPE_OF_TEXT, TYPE_OF_BOOLEAN, TYPE_OF_NUMERIC_INTEGER, TYPE_OF_NUMERIC_BIGINT, TYPE_OF_NUMERIC_DECIMAL, TYPE_OF_NUMERIC_INTEGER_MIN, TYPE_OF_NUMERIC_INTEGER_MAX, TYPE_OF_NUMERIC_BIGINT_MIN, TYPE_OF_NUMERIC_BIGINT_MAX, TYPE_OF_NUMERIC_SUPERINT_MIN, TYPE_OF_NUMERIC_SUPERINT_MAX, TYPE_OF_NUMERIC_MAXDECIMAL, TYPE_OF_BLOB
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
public abstract class BsSimpleVendorCheckDto implements Serializable {

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
    /** VENDOR_CHECK_ID: {DECIMAL(16), refers to VENDOR_CHECK.VENDOR_CHECK_ID} */
    @JsonKey
    protected Long _vendorCheckId;

    /** TYPE_OF_TEXT: {CLOB(2147483647), refers to VENDOR_CHECK.TYPE_OF_TEXT} */
    @JsonKey
    protected String _typeOfText;

    /** TYPE_OF_BOOLEAN: {BOOLEAN(1), refers to VENDOR_CHECK.TYPE_OF_BOOLEAN} */
    @JsonKey
    protected Boolean _typeOfBoolean;

    /** TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5), refers to VENDOR_CHECK.TYPE_OF_NUMERIC_INTEGER} */
    @JsonKey
    protected Integer _typeOfNumericInteger;

    /** TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12), refers to VENDOR_CHECK.TYPE_OF_NUMERIC_BIGINT} */
    @JsonKey
    protected Long _typeOfNumericBigint;

    /** TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3), refers to VENDOR_CHECK.TYPE_OF_NUMERIC_DECIMAL} */
    @JsonKey
    protected java.math.BigDecimal _typeOfNumericDecimal;

    /** TYPE_OF_NUMERIC_INTEGER_MIN: {DECIMAL(1), refers to VENDOR_CHECK.TYPE_OF_NUMERIC_INTEGER_MIN} */
    @JsonKey
    protected Integer _typeOfNumericIntegerMin;

    /** TYPE_OF_NUMERIC_INTEGER_MAX: {DECIMAL(9), refers to VENDOR_CHECK.TYPE_OF_NUMERIC_INTEGER_MAX} */
    @JsonKey
    protected Integer _typeOfNumericIntegerMax;

    /** TYPE_OF_NUMERIC_BIGINT_MIN: {DECIMAL(10), refers to VENDOR_CHECK.TYPE_OF_NUMERIC_BIGINT_MIN} */
    @JsonKey
    protected Long _typeOfNumericBigintMin;

    /** TYPE_OF_NUMERIC_BIGINT_MAX: {DECIMAL(18), refers to VENDOR_CHECK.TYPE_OF_NUMERIC_BIGINT_MAX} */
    @JsonKey
    protected Long _typeOfNumericBigintMax;

    /** TYPE_OF_NUMERIC_SUPERINT_MIN: {DECIMAL(19), refers to VENDOR_CHECK.TYPE_OF_NUMERIC_SUPERINT_MIN} */
    @JsonKey
    protected java.math.BigDecimal _typeOfNumericSuperintMin;

    /** TYPE_OF_NUMERIC_SUPERINT_MAX: {DECIMAL(38), refers to VENDOR_CHECK.TYPE_OF_NUMERIC_SUPERINT_MAX} */
    @JsonKey
    protected java.math.BigDecimal _typeOfNumericSuperintMax;

    /** TYPE_OF_NUMERIC_MAXDECIMAL: {DECIMAL(38, 38), refers to VENDOR_CHECK.TYPE_OF_NUMERIC_MAXDECIMAL} */
    @JsonKey
    protected java.math.BigDecimal _typeOfNumericMaxdecimal;

    /** TYPE_OF_BLOB: {BLOB(2147483647), refers to VENDOR_CHECK.TYPE_OF_BLOB} */
    @JsonKey
    protected byte[] _typeOfBlob;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSimpleVendorCheckDto() {
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
        if (other == null || !(other instanceof BsSimpleVendorCheckDto)) { return false; }
        final BsSimpleVendorCheckDto otherEntity = (BsSimpleVendorCheckDto)other;
        if (!helpComparingValue(getVendorCheckId(), otherEntity.getVendorCheckId())) { return false; }
        if (!helpComparingValue(getTypeOfText(), otherEntity.getTypeOfText())) { return false; }
        if (!helpComparingValue(getTypeOfBoolean(), otherEntity.getTypeOfBoolean())) { return false; }
        if (!helpComparingValue(getTypeOfNumericInteger(), otherEntity.getTypeOfNumericInteger())) { return false; }
        if (!helpComparingValue(getTypeOfNumericBigint(), otherEntity.getTypeOfNumericBigint())) { return false; }
        if (!helpComparingValue(getTypeOfNumericDecimal(), otherEntity.getTypeOfNumericDecimal())) { return false; }
        if (!helpComparingValue(getTypeOfNumericIntegerMin(), otherEntity.getTypeOfNumericIntegerMin())) { return false; }
        if (!helpComparingValue(getTypeOfNumericIntegerMax(), otherEntity.getTypeOfNumericIntegerMax())) { return false; }
        if (!helpComparingValue(getTypeOfNumericBigintMin(), otherEntity.getTypeOfNumericBigintMin())) { return false; }
        if (!helpComparingValue(getTypeOfNumericBigintMax(), otherEntity.getTypeOfNumericBigintMax())) { return false; }
        if (!helpComparingValue(getTypeOfNumericSuperintMin(), otherEntity.getTypeOfNumericSuperintMin())) { return false; }
        if (!helpComparingValue(getTypeOfNumericSuperintMax(), otherEntity.getTypeOfNumericSuperintMax())) { return false; }
        if (!helpComparingValue(getTypeOfNumericMaxdecimal(), otherEntity.getTypeOfNumericMaxdecimal())) { return false; }
        if (!helpComparingValue(getTypeOfBlob(), otherEntity.getTypeOfBlob())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SimpleVendorCheck");
        result = xCH(result, getVendorCheckId());
        result = xCH(result, getTypeOfText());
        result = xCH(result, getTypeOfBoolean());
        result = xCH(result, getTypeOfNumericInteger());
        result = xCH(result, getTypeOfNumericBigint());
        result = xCH(result, getTypeOfNumericDecimal());
        result = xCH(result, getTypeOfNumericIntegerMin());
        result = xCH(result, getTypeOfNumericIntegerMax());
        result = xCH(result, getTypeOfNumericBigintMin());
        result = xCH(result, getTypeOfNumericBigintMax());
        result = xCH(result, getTypeOfNumericSuperintMin());
        result = xCH(result, getTypeOfNumericSuperintMax());
        result = xCH(result, getTypeOfNumericMaxdecimal());
        result = xCH(result, getTypeOfBlob());
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
        sb.append(c).append(getTypeOfText());
        sb.append(c).append(getTypeOfBoolean());
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
        sb.append(c).append(xfBA(getTypeOfBlob()));
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
     * [get] VENDOR_CHECK_ID: {DECIMAL(16), refers to VENDOR_CHECK.VENDOR_CHECK_ID} <br />
     * @return The value of the column 'VENDOR_CHECK_ID'. (NullAllowed)
     */
    public Long getVendorCheckId() {
        return _vendorCheckId;
    }

    /**
     * [set] VENDOR_CHECK_ID: {DECIMAL(16), refers to VENDOR_CHECK.VENDOR_CHECK_ID} <br />
     * @param vendorCheckId The value of the column 'VENDOR_CHECK_ID'. (NullAllowed)
     */
    public void setVendorCheckId(Long vendorCheckId) {
        __modifiedProperties.add("vendorCheckId");
        this._vendorCheckId = vendorCheckId;
    }

    /**
     * [get] TYPE_OF_TEXT: {CLOB(2147483647), refers to VENDOR_CHECK.TYPE_OF_TEXT} <br />
     * @return The value of the column 'TYPE_OF_TEXT'. (NullAllowed)
     */
    public String getTypeOfText() {
        return _typeOfText;
    }

    /**
     * [set] TYPE_OF_TEXT: {CLOB(2147483647), refers to VENDOR_CHECK.TYPE_OF_TEXT} <br />
     * @param typeOfText The value of the column 'TYPE_OF_TEXT'. (NullAllowed)
     */
    public void setTypeOfText(String typeOfText) {
        __modifiedProperties.add("typeOfText");
        this._typeOfText = typeOfText;
    }

    /**
     * [get] TYPE_OF_BOOLEAN: {BOOLEAN(1), refers to VENDOR_CHECK.TYPE_OF_BOOLEAN} <br />
     * @return The value of the column 'TYPE_OF_BOOLEAN'. (NullAllowed)
     */
    public Boolean getTypeOfBoolean() {
        return _typeOfBoolean;
    }

    /**
     * [set] TYPE_OF_BOOLEAN: {BOOLEAN(1), refers to VENDOR_CHECK.TYPE_OF_BOOLEAN} <br />
     * @param typeOfBoolean The value of the column 'TYPE_OF_BOOLEAN'. (NullAllowed)
     */
    public void setTypeOfBoolean(Boolean typeOfBoolean) {
        __modifiedProperties.add("typeOfBoolean");
        this._typeOfBoolean = typeOfBoolean;
    }

    /**
     * [get] TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5), refers to VENDOR_CHECK.TYPE_OF_NUMERIC_INTEGER} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_INTEGER'. (NullAllowed)
     */
    public Integer getTypeOfNumericInteger() {
        return _typeOfNumericInteger;
    }

    /**
     * [set] TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5), refers to VENDOR_CHECK.TYPE_OF_NUMERIC_INTEGER} <br />
     * @param typeOfNumericInteger The value of the column 'TYPE_OF_NUMERIC_INTEGER'. (NullAllowed)
     */
    public void setTypeOfNumericInteger(Integer typeOfNumericInteger) {
        __modifiedProperties.add("typeOfNumericInteger");
        this._typeOfNumericInteger = typeOfNumericInteger;
    }

    /**
     * [get] TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12), refers to VENDOR_CHECK.TYPE_OF_NUMERIC_BIGINT} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_BIGINT'. (NullAllowed)
     */
    public Long getTypeOfNumericBigint() {
        return _typeOfNumericBigint;
    }

    /**
     * [set] TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12), refers to VENDOR_CHECK.TYPE_OF_NUMERIC_BIGINT} <br />
     * @param typeOfNumericBigint The value of the column 'TYPE_OF_NUMERIC_BIGINT'. (NullAllowed)
     */
    public void setTypeOfNumericBigint(Long typeOfNumericBigint) {
        __modifiedProperties.add("typeOfNumericBigint");
        this._typeOfNumericBigint = typeOfNumericBigint;
    }

    /**
     * [get] TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3), refers to VENDOR_CHECK.TYPE_OF_NUMERIC_DECIMAL} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_DECIMAL'. (NullAllowed)
     */
    public java.math.BigDecimal getTypeOfNumericDecimal() {
        return _typeOfNumericDecimal;
    }

    /**
     * [set] TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3), refers to VENDOR_CHECK.TYPE_OF_NUMERIC_DECIMAL} <br />
     * @param typeOfNumericDecimal The value of the column 'TYPE_OF_NUMERIC_DECIMAL'. (NullAllowed)
     */
    public void setTypeOfNumericDecimal(java.math.BigDecimal typeOfNumericDecimal) {
        __modifiedProperties.add("typeOfNumericDecimal");
        this._typeOfNumericDecimal = typeOfNumericDecimal;
    }

    /**
     * [get] TYPE_OF_NUMERIC_INTEGER_MIN: {DECIMAL(1), refers to VENDOR_CHECK.TYPE_OF_NUMERIC_INTEGER_MIN} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_INTEGER_MIN'. (NullAllowed)
     */
    public Integer getTypeOfNumericIntegerMin() {
        return _typeOfNumericIntegerMin;
    }

    /**
     * [set] TYPE_OF_NUMERIC_INTEGER_MIN: {DECIMAL(1), refers to VENDOR_CHECK.TYPE_OF_NUMERIC_INTEGER_MIN} <br />
     * @param typeOfNumericIntegerMin The value of the column 'TYPE_OF_NUMERIC_INTEGER_MIN'. (NullAllowed)
     */
    public void setTypeOfNumericIntegerMin(Integer typeOfNumericIntegerMin) {
        __modifiedProperties.add("typeOfNumericIntegerMin");
        this._typeOfNumericIntegerMin = typeOfNumericIntegerMin;
    }

    /**
     * [get] TYPE_OF_NUMERIC_INTEGER_MAX: {DECIMAL(9), refers to VENDOR_CHECK.TYPE_OF_NUMERIC_INTEGER_MAX} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_INTEGER_MAX'. (NullAllowed)
     */
    public Integer getTypeOfNumericIntegerMax() {
        return _typeOfNumericIntegerMax;
    }

    /**
     * [set] TYPE_OF_NUMERIC_INTEGER_MAX: {DECIMAL(9), refers to VENDOR_CHECK.TYPE_OF_NUMERIC_INTEGER_MAX} <br />
     * @param typeOfNumericIntegerMax The value of the column 'TYPE_OF_NUMERIC_INTEGER_MAX'. (NullAllowed)
     */
    public void setTypeOfNumericIntegerMax(Integer typeOfNumericIntegerMax) {
        __modifiedProperties.add("typeOfNumericIntegerMax");
        this._typeOfNumericIntegerMax = typeOfNumericIntegerMax;
    }

    /**
     * [get] TYPE_OF_NUMERIC_BIGINT_MIN: {DECIMAL(10), refers to VENDOR_CHECK.TYPE_OF_NUMERIC_BIGINT_MIN} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_BIGINT_MIN'. (NullAllowed)
     */
    public Long getTypeOfNumericBigintMin() {
        return _typeOfNumericBigintMin;
    }

    /**
     * [set] TYPE_OF_NUMERIC_BIGINT_MIN: {DECIMAL(10), refers to VENDOR_CHECK.TYPE_OF_NUMERIC_BIGINT_MIN} <br />
     * @param typeOfNumericBigintMin The value of the column 'TYPE_OF_NUMERIC_BIGINT_MIN'. (NullAllowed)
     */
    public void setTypeOfNumericBigintMin(Long typeOfNumericBigintMin) {
        __modifiedProperties.add("typeOfNumericBigintMin");
        this._typeOfNumericBigintMin = typeOfNumericBigintMin;
    }

    /**
     * [get] TYPE_OF_NUMERIC_BIGINT_MAX: {DECIMAL(18), refers to VENDOR_CHECK.TYPE_OF_NUMERIC_BIGINT_MAX} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_BIGINT_MAX'. (NullAllowed)
     */
    public Long getTypeOfNumericBigintMax() {
        return _typeOfNumericBigintMax;
    }

    /**
     * [set] TYPE_OF_NUMERIC_BIGINT_MAX: {DECIMAL(18), refers to VENDOR_CHECK.TYPE_OF_NUMERIC_BIGINT_MAX} <br />
     * @param typeOfNumericBigintMax The value of the column 'TYPE_OF_NUMERIC_BIGINT_MAX'. (NullAllowed)
     */
    public void setTypeOfNumericBigintMax(Long typeOfNumericBigintMax) {
        __modifiedProperties.add("typeOfNumericBigintMax");
        this._typeOfNumericBigintMax = typeOfNumericBigintMax;
    }

    /**
     * [get] TYPE_OF_NUMERIC_SUPERINT_MIN: {DECIMAL(19), refers to VENDOR_CHECK.TYPE_OF_NUMERIC_SUPERINT_MIN} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_SUPERINT_MIN'. (NullAllowed)
     */
    public java.math.BigDecimal getTypeOfNumericSuperintMin() {
        return _typeOfNumericSuperintMin;
    }

    /**
     * [set] TYPE_OF_NUMERIC_SUPERINT_MIN: {DECIMAL(19), refers to VENDOR_CHECK.TYPE_OF_NUMERIC_SUPERINT_MIN} <br />
     * @param typeOfNumericSuperintMin The value of the column 'TYPE_OF_NUMERIC_SUPERINT_MIN'. (NullAllowed)
     */
    public void setTypeOfNumericSuperintMin(java.math.BigDecimal typeOfNumericSuperintMin) {
        __modifiedProperties.add("typeOfNumericSuperintMin");
        this._typeOfNumericSuperintMin = typeOfNumericSuperintMin;
    }

    /**
     * [get] TYPE_OF_NUMERIC_SUPERINT_MAX: {DECIMAL(38), refers to VENDOR_CHECK.TYPE_OF_NUMERIC_SUPERINT_MAX} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_SUPERINT_MAX'. (NullAllowed)
     */
    public java.math.BigDecimal getTypeOfNumericSuperintMax() {
        return _typeOfNumericSuperintMax;
    }

    /**
     * [set] TYPE_OF_NUMERIC_SUPERINT_MAX: {DECIMAL(38), refers to VENDOR_CHECK.TYPE_OF_NUMERIC_SUPERINT_MAX} <br />
     * @param typeOfNumericSuperintMax The value of the column 'TYPE_OF_NUMERIC_SUPERINT_MAX'. (NullAllowed)
     */
    public void setTypeOfNumericSuperintMax(java.math.BigDecimal typeOfNumericSuperintMax) {
        __modifiedProperties.add("typeOfNumericSuperintMax");
        this._typeOfNumericSuperintMax = typeOfNumericSuperintMax;
    }

    /**
     * [get] TYPE_OF_NUMERIC_MAXDECIMAL: {DECIMAL(38, 38), refers to VENDOR_CHECK.TYPE_OF_NUMERIC_MAXDECIMAL} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_MAXDECIMAL'. (NullAllowed)
     */
    public java.math.BigDecimal getTypeOfNumericMaxdecimal() {
        return _typeOfNumericMaxdecimal;
    }

    /**
     * [set] TYPE_OF_NUMERIC_MAXDECIMAL: {DECIMAL(38, 38), refers to VENDOR_CHECK.TYPE_OF_NUMERIC_MAXDECIMAL} <br />
     * @param typeOfNumericMaxdecimal The value of the column 'TYPE_OF_NUMERIC_MAXDECIMAL'. (NullAllowed)
     */
    public void setTypeOfNumericMaxdecimal(java.math.BigDecimal typeOfNumericMaxdecimal) {
        __modifiedProperties.add("typeOfNumericMaxdecimal");
        this._typeOfNumericMaxdecimal = typeOfNumericMaxdecimal;
    }

    /**
     * [get] TYPE_OF_BLOB: {BLOB(2147483647), refers to VENDOR_CHECK.TYPE_OF_BLOB} <br />
     * @return The value of the column 'TYPE_OF_BLOB'. (NullAllowed)
     */
    public byte[] getTypeOfBlob() {
        return _typeOfBlob;
    }

    /**
     * [set] TYPE_OF_BLOB: {BLOB(2147483647), refers to VENDOR_CHECK.TYPE_OF_BLOB} <br />
     * @param typeOfBlob The value of the column 'TYPE_OF_BLOB'. (NullAllowed)
     */
    public void setTypeOfBlob(byte[] typeOfBlob) {
        __modifiedProperties.add("typeOfBlob");
        this._typeOfBlob = typeOfBlob;
    }

}
