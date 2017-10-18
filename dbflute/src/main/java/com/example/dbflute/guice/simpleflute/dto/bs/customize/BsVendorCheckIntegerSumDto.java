package com.example.dbflute.guice.simpleflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of VendorCheckIntegerSum. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     INTEGER_NON_DIGIT_SUM
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
public abstract class BsVendorCheckIntegerSumDto implements Serializable {

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
    /** INTEGER_NON_DIGIT_SUM: {DECIMAL(5)} */
    @JsonKey
    protected Integer _integerNonDigitSum;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsVendorCheckIntegerSumDto() {
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
        if (other == null || !(other instanceof BsVendorCheckIntegerSumDto)) { return false; }
        final BsVendorCheckIntegerSumDto otherEntity = (BsVendorCheckIntegerSumDto)other;
        if (!helpComparingValue(getIntegerNonDigitSum(), otherEntity.getIntegerNonDigitSum())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "VendorCheckIntegerSum");
        result = xCH(result, getIntegerNonDigitSum());
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
        sb.append(c).append(getIntegerNonDigitSum());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] INTEGER_NON_DIGIT_SUM: {DECIMAL(5)} <br />
     * @return The value of the column 'INTEGER_NON_DIGIT_SUM'. (NullAllowed)
     */
    public Integer getIntegerNonDigitSum() {
        return _integerNonDigitSum;
    }

    /**
     * [set] INTEGER_NON_DIGIT_SUM: {DECIMAL(5)} <br />
     * @param integerNonDigitSum The value of the column 'INTEGER_NON_DIGIT_SUM'. (NullAllowed)
     */
    public void setIntegerNonDigitSum(Integer integerNonDigitSum) {
        __modifiedProperties.add("integerNonDigitSum");
        this._integerNonDigitSum = integerNonDigitSum;
    }

}
