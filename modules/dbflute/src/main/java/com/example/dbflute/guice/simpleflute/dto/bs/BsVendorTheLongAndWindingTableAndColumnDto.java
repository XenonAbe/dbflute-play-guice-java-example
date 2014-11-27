package com.example.dbflute.guice.simpleflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;
import com.example.dbflute.guice.simpleflute.dto.*;

/**
 * The simple DTO of VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN as TABLE. <br />
 * <pre>
 * [primary-key]
 *     THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID
 * 
 * [column]
 *     THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID, THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME, SHORT_NAME, SHORT_SIZE
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
 *     VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF
 * 
 * [foreign-property]
 *     
 * 
 * [referrer-property]
 *     vendorTheLongAndWindingTableAndColumnRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsVendorTheLongAndWindingTableAndColumnDto implements Serializable {

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
    /** THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _theLongAndWindingTableAndColumnId;

    /** THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME: {UQ, NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _theLongAndWindingTableAndColumnName;

    /** SHORT_NAME: {NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _shortName;

    /** SHORT_SIZE: {NotNull, INTEGER(10)} */
    @JsonKey
    protected Integer _shortSize;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsVendorTheLongAndWindingTableAndColumnDto() {
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<VendorTheLongAndWindingTableAndColumnRefDto> _vendorTheLongAndWindingTableAndColumnRefList;

    public List<VendorTheLongAndWindingTableAndColumnRefDto> getVendorTheLongAndWindingTableAndColumnRefList() {
        if (_vendorTheLongAndWindingTableAndColumnRefList == null) { _vendorTheLongAndWindingTableAndColumnRefList = new ArrayList<VendorTheLongAndWindingTableAndColumnRefDto>(); }
        return _vendorTheLongAndWindingTableAndColumnRefList;
    }

    public void setVendorTheLongAndWindingTableAndColumnRefList(List<VendorTheLongAndWindingTableAndColumnRefDto> vendorTheLongAndWindingTableAndColumnRefList) {
        this._vendorTheLongAndWindingTableAndColumnRefList = vendorTheLongAndWindingTableAndColumnRefList;
    }

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
        if (other == null || !(other instanceof BsVendorTheLongAndWindingTableAndColumnDto)) { return false; }
        final BsVendorTheLongAndWindingTableAndColumnDto otherEntity = (BsVendorTheLongAndWindingTableAndColumnDto)other;
        if (!helpComparingValue(getTheLongAndWindingTableAndColumnId(), otherEntity.getTheLongAndWindingTableAndColumnId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN");
        result = xCH(result, getTheLongAndWindingTableAndColumnId());
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
        sb.append(c).append(getTheLongAndWindingTableAndColumnId());
        sb.append(c).append(getTheLongAndWindingTableAndColumnName());
        sb.append(c).append(getShortName());
        sb.append(c).append(getShortSize());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID'. (NullAllowed)
     */
    public Long getTheLongAndWindingTableAndColumnId() {
        return _theLongAndWindingTableAndColumnId;
    }

    /**
     * [set] THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)} <br />
     * @param theLongAndWindingTableAndColumnId The value of the column 'THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID'. (NullAllowed)
     */
    public void setTheLongAndWindingTableAndColumnId(Long theLongAndWindingTableAndColumnId) {
        __modifiedProperties.add("theLongAndWindingTableAndColumnId");
        this._theLongAndWindingTableAndColumnId = theLongAndWindingTableAndColumnId;
    }

    /**
     * [get] THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME: {UQ, NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME'. (NullAllowed)
     */
    public String getTheLongAndWindingTableAndColumnName() {
        return _theLongAndWindingTableAndColumnName;
    }

    /**
     * [set] THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME: {UQ, NotNull, VARCHAR(200)} <br />
     * @param theLongAndWindingTableAndColumnName The value of the column 'THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME'. (NullAllowed)
     */
    public void setTheLongAndWindingTableAndColumnName(String theLongAndWindingTableAndColumnName) {
        __modifiedProperties.add("theLongAndWindingTableAndColumnName");
        this._theLongAndWindingTableAndColumnName = theLongAndWindingTableAndColumnName;
    }

    /**
     * [get] SHORT_NAME: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'SHORT_NAME'. (NullAllowed)
     */
    public String getShortName() {
        return _shortName;
    }

    /**
     * [set] SHORT_NAME: {NotNull, VARCHAR(200)} <br />
     * @param shortName The value of the column 'SHORT_NAME'. (NullAllowed)
     */
    public void setShortName(String shortName) {
        __modifiedProperties.add("shortName");
        this._shortName = shortName;
    }

    /**
     * [get] SHORT_SIZE: {NotNull, INTEGER(10)} <br />
     * @return The value of the column 'SHORT_SIZE'. (NullAllowed)
     */
    public Integer getShortSize() {
        return _shortSize;
    }

    /**
     * [set] SHORT_SIZE: {NotNull, INTEGER(10)} <br />
     * @param shortSize The value of the column 'SHORT_SIZE'. (NullAllowed)
     */
    public void setShortSize(Integer shortSize) {
        __modifiedProperties.add("shortSize");
        this._shortSize = shortSize;
    }

}
