package com.example.dbflute.guice.simpleflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.example.dbflute.guice.simpleflute.dto.*;

/**
 * The simple DTO of VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF as TABLE. <br />
 * <pre>
 * [primary-key]
 *     THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID
 * 
 * [column]
 *     THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID, THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID, THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE, SHORT_DATE
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
 *     VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN
 * 
 * [referrer-table]
 *     
 * 
 * [foreign-property]
 *     vendorTheLongAndWindingTableAndColumn
 * 
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsVendorTheLongAndWindingTableAndColumnRefDto implements Serializable {

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
    /** THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID: {PK, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _theLongAndWindingTableAndColumnRefId;

    /** THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {IX, NotNull, BIGINT(19), FK to VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN} */
    @JsonKey
    protected Long _theLongAndWindingTableAndColumnId;

    /** THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE: {NotNull, DATE(8)} */
    @JsonKey
    protected org.joda.time.LocalDate _theLongAndWindingTableAndColumnRefDate;

    /** SHORT_DATE: {NotNull, DATE(8)} */
    @JsonKey
    protected org.joda.time.LocalDate _shortDate;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsVendorTheLongAndWindingTableAndColumnRefDto() {
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    protected VendorTheLongAndWindingTableAndColumnDto _vendorTheLongAndWindingTableAndColumn;

    public VendorTheLongAndWindingTableAndColumnDto getVendorTheLongAndWindingTableAndColumn() {
        return _vendorTheLongAndWindingTableAndColumn;
    }

    public void setVendorTheLongAndWindingTableAndColumn(VendorTheLongAndWindingTableAndColumnDto vendorTheLongAndWindingTableAndColumn) {
        this._vendorTheLongAndWindingTableAndColumn = vendorTheLongAndWindingTableAndColumn;
    }

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
        if (other == null || !(other instanceof BsVendorTheLongAndWindingTableAndColumnRefDto)) { return false; }
        final BsVendorTheLongAndWindingTableAndColumnRefDto otherEntity = (BsVendorTheLongAndWindingTableAndColumnRefDto)other;
        if (!helpComparingValue(getTheLongAndWindingTableAndColumnRefId(), otherEntity.getTheLongAndWindingTableAndColumnRefId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF");
        result = xCH(result, getTheLongAndWindingTableAndColumnRefId());
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
        sb.append(c).append(getTheLongAndWindingTableAndColumnRefId());
        sb.append(c).append(getTheLongAndWindingTableAndColumnId());
        sb.append(c).append(getTheLongAndWindingTableAndColumnRefDate());
        sb.append(c).append(getShortDate());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID: {PK, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID'. (NullAllowed)
     */
    public Long getTheLongAndWindingTableAndColumnRefId() {
        return _theLongAndWindingTableAndColumnRefId;
    }

    /**
     * [set] THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID: {PK, NotNull, BIGINT(19)} <br />
     * @param theLongAndWindingTableAndColumnRefId The value of the column 'THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID'. (NullAllowed)
     */
    public void setTheLongAndWindingTableAndColumnRefId(Long theLongAndWindingTableAndColumnRefId) {
        __modifiedProperties.add("theLongAndWindingTableAndColumnRefId");
        this._theLongAndWindingTableAndColumnRefId = theLongAndWindingTableAndColumnRefId;
    }

    /**
     * [get] THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {IX, NotNull, BIGINT(19), FK to VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN} <br />
     * @return The value of the column 'THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID'. (NullAllowed)
     */
    public Long getTheLongAndWindingTableAndColumnId() {
        return _theLongAndWindingTableAndColumnId;
    }

    /**
     * [set] THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {IX, NotNull, BIGINT(19), FK to VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN} <br />
     * @param theLongAndWindingTableAndColumnId The value of the column 'THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID'. (NullAllowed)
     */
    public void setTheLongAndWindingTableAndColumnId(Long theLongAndWindingTableAndColumnId) {
        __modifiedProperties.add("theLongAndWindingTableAndColumnId");
        this._theLongAndWindingTableAndColumnId = theLongAndWindingTableAndColumnId;
    }

    /**
     * [get] THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE: {NotNull, DATE(8)} <br />
     * @return The value of the column 'THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd")
    public org.joda.time.LocalDate getTheLongAndWindingTableAndColumnRefDate() {
        return _theLongAndWindingTableAndColumnRefDate;
    }

    /**
     * [set] THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE: {NotNull, DATE(8)} <br />
     * @param theLongAndWindingTableAndColumnRefDate The value of the column 'THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE'. (NullAllowed)
     */
    public void setTheLongAndWindingTableAndColumnRefDate(org.joda.time.LocalDate theLongAndWindingTableAndColumnRefDate) {
        __modifiedProperties.add("theLongAndWindingTableAndColumnRefDate");
        this._theLongAndWindingTableAndColumnRefDate = theLongAndWindingTableAndColumnRefDate;
    }

    /**
     * [get] SHORT_DATE: {NotNull, DATE(8)} <br />
     * @return The value of the column 'SHORT_DATE'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd")
    public org.joda.time.LocalDate getShortDate() {
        return _shortDate;
    }

    /**
     * [set] SHORT_DATE: {NotNull, DATE(8)} <br />
     * @param shortDate The value of the column 'SHORT_DATE'. (NullAllowed)
     */
    public void setShortDate(org.joda.time.LocalDate shortDate) {
        __modifiedProperties.add("shortDate");
        this._shortDate = shortDate;
    }

}
