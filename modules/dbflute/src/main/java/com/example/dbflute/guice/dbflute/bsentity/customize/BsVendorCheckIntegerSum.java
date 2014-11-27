package com.example.dbflute.guice.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import org.seasar.dbflute.dbmeta.accessory.CustomizeEntity;
import com.example.dbflute.guice.dbflute.exentity.customize.*;

/**
 * The entity of VendorCheckIntegerSum. <br />
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
 * [foreign table]
 *     
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer integerNonDigitSum = entity.getIntegerNonDigitSum();
 * entity.setIntegerNonDigitSum(integerNonDigitSum);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorCheckIntegerSum extends AbstractEntity implements CustomizeEntity {

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
    protected Integer _integerNonDigitSum;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "VendorCheckIntegerSum";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "vendorCheckIntegerSum";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return com.example.dbflute.guice.dbflute.bsentity.customize.dbmeta.VendorCheckIntegerSumDbm.getInstance();
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /**
     * {@inheritDoc}
     */
    public boolean hasPrimaryKeyValue() {
        return false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsVendorCheckIntegerSum) {
            BsVendorCheckIntegerSum other = (BsVendorCheckIntegerSum)obj;
            if (!xSV(_integerNonDigitSum, other._integerNonDigitSum)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _integerNonDigitSum);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_integerNonDigitSum));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public VendorCheckIntegerSum clone() {
        return (VendorCheckIntegerSum)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] INTEGER_NON_DIGIT_SUM: {DECIMAL(5)} <br />
     * @return The value of the column 'INTEGER_NON_DIGIT_SUM'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getIntegerNonDigitSum() {
        checkSpecifiedProperty("integerNonDigitSum");
        return _integerNonDigitSum;
    }

    /**
     * [set] INTEGER_NON_DIGIT_SUM: {DECIMAL(5)} <br />
     * @param integerNonDigitSum The value of the column 'INTEGER_NON_DIGIT_SUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIntegerNonDigitSum(Integer integerNonDigitSum) {
        registerModifiedProperty("integerNonDigitSum");
        _integerNonDigitSum = integerNonDigitSum;
    }
}
