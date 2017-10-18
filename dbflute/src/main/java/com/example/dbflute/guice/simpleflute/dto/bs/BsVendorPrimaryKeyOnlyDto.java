package com.example.dbflute.guice.simpleflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of VENDOR_PRIMARY_KEY_ONLY as TABLE. <br />
 * <pre>
 * [primary-key]
 *     PRIMARY_KEY_ONLY_ID
 * 
 * [column]
 *     PRIMARY_KEY_ONLY_ID
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
public abstract class BsVendorPrimaryKeyOnlyDto implements Serializable {

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
    /** PRIMARY_KEY_ONLY_ID: {PK, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _primaryKeyOnlyId;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsVendorPrimaryKeyOnlyDto() {
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
        if (other == null || !(other instanceof BsVendorPrimaryKeyOnlyDto)) { return false; }
        final BsVendorPrimaryKeyOnlyDto otherEntity = (BsVendorPrimaryKeyOnlyDto)other;
        if (!helpComparingValue(getPrimaryKeyOnlyId(), otherEntity.getPrimaryKeyOnlyId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "VENDOR_PRIMARY_KEY_ONLY");
        result = xCH(result, getPrimaryKeyOnlyId());
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
        sb.append(c).append(getPrimaryKeyOnlyId());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRIMARY_KEY_ONLY_ID: {PK, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'PRIMARY_KEY_ONLY_ID'. (NullAllowed)
     */
    public Long getPrimaryKeyOnlyId() {
        return _primaryKeyOnlyId;
    }

    /**
     * [set] PRIMARY_KEY_ONLY_ID: {PK, NotNull, BIGINT(19)} <br />
     * @param primaryKeyOnlyId The value of the column 'PRIMARY_KEY_ONLY_ID'. (NullAllowed)
     */
    public void setPrimaryKeyOnlyId(Long primaryKeyOnlyId) {
        __modifiedProperties.add("primaryKeyOnlyId");
        this._primaryKeyOnlyId = primaryKeyOnlyId;
    }

}
