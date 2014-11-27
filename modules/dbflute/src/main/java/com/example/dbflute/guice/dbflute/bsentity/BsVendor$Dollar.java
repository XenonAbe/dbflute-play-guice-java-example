package com.example.dbflute.guice.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import org.seasar.dbflute.dbmeta.accessory.DomainEntity;
import com.example.dbflute.guice.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.guice.dbflute.exentity.*;

/**
 * The entity of VENDOR_$_DOLLAR as TABLE. <br />
 * <pre>
 * [primary-key]
 *     VENDOR_$_DOLLAR_ID
 * 
 * [column]
 *     VENDOR_$_DOLLAR_ID, VENDOR_$_DOLLAR_NAME
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
 * Integer vendor$DollarId = entity.getVendor$DollarId();
 * String vendor$DollarName = entity.getVendor$DollarName();
 * entity.setVendor$DollarId(vendor$DollarId);
 * entity.setVendor$DollarName(vendor$DollarName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendor$Dollar extends AbstractEntity implements DomainEntity {

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
    /** VENDOR_$_DOLLAR_ID: {PK, NotNull, INTEGER(10)} */
    protected Integer _vendor$DollarId;

    /** VENDOR_$_DOLLAR_NAME: {VARCHAR(32)} */
    protected String _vendor$DollarName;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "VENDOR_$_DOLLAR";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "vendor$Dollar";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(getTableDbName());
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /**
     * {@inheritDoc}
     */
    public boolean hasPrimaryKeyValue() {
        if (getVendor$DollarId() == null) { return false; }
        return true;
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
        if (obj instanceof BsVendor$Dollar) {
            BsVendor$Dollar other = (BsVendor$Dollar)obj;
            if (!xSV(_vendor$DollarId, other._vendor$DollarId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _vendor$DollarId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_vendor$DollarId));
        sb.append(dm).append(xfND(_vendor$DollarName));
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
    public Vendor$Dollar clone() {
        return (Vendor$Dollar)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] VENDOR_$_DOLLAR_ID: {PK, NotNull, INTEGER(10)} <br />
     * @return The value of the column 'VENDOR_$_DOLLAR_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getVendor$DollarId() {
        checkSpecifiedProperty("vendor$DollarId");
        return _vendor$DollarId;
    }

    /**
     * [set] VENDOR_$_DOLLAR_ID: {PK, NotNull, INTEGER(10)} <br />
     * @param vendor$DollarId The value of the column 'VENDOR_$_DOLLAR_ID'. (basically NotNull if update: for the constraint)
     */
    public void setVendor$DollarId(Integer vendor$DollarId) {
        registerModifiedProperty("vendor$DollarId");
        _vendor$DollarId = vendor$DollarId;
    }

    /**
     * [get] VENDOR_$_DOLLAR_NAME: {VARCHAR(32)} <br />
     * @return The value of the column 'VENDOR_$_DOLLAR_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getVendor$DollarName() {
        checkSpecifiedProperty("vendor$DollarName");
        return convertEmptyToNull(_vendor$DollarName);
    }

    /**
     * [set] VENDOR_$_DOLLAR_NAME: {VARCHAR(32)} <br />
     * @param vendor$DollarName The value of the column 'VENDOR_$_DOLLAR_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVendor$DollarName(String vendor$DollarName) {
        registerModifiedProperty("vendor$DollarName");
        _vendor$DollarName = vendor$DollarName;
    }
}
