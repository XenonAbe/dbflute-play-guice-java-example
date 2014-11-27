package com.example.dbflute.guice.simpleflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;
import com.example.dbflute.guice.simpleflute.AppCDef;
import com.example.dbflute.guice.simpleflute.dto.*;

/**
 * The simple DTO of (地域)REGION as TABLE. <br />
 * <pre>
 * [primary-key]
 *     REGION_ID
 * 
 * [column]
 *     REGION_ID, REGION_NAME
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
 *     MEMBER_ADDRESS
 * 
 * [foreign-property]
 *     
 * 
 * [referrer-property]
 *     memberAddressList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsRegionDto implements Serializable {

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
    /** (地域ID)REGION_ID: {PK, NotNull, INTEGER(10), classification=Region} */
    @JsonKey
    protected Integer _regionId;

    /** (地域名称)REGION_NAME: {NotNull, VARCHAR(50)} */
    @JsonKey
    protected String _regionName;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsRegionDto() {
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Set the value of regionId as the classification of Region. <br />
     * mainly region of member address
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed)
     */
    public void setRegionIdAsRegion(AppCDef.Region cdef) {
        setRegionId(cdef != null ? Integer.valueOf(cdef.code()) : null);
    }

    /**
     * Get the value of regionId as the classification of Region. <br />
     * mainly region of member address
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed)
     */
    public AppCDef.Region getRegionIdAsRegion() {
        return AppCDef.Region.codeOf(getRegionId());
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of regionId as America. <br />
     * AMERICA
     */
    public void setRegionId_America() {
        setRegionIdAsRegion(AppCDef.Region.America);
    }

    /**
     * Set the value of regionId as Canada. <br />
     * CANADA
     */
    public void setRegionId_Canada() {
        setRegionIdAsRegion(AppCDef.Region.Canada);
    }

    /**
     * Set the value of regionId as China. <br />
     * CHINA
     */
    public void setRegionId_China() {
        setRegionIdAsRegion(AppCDef.Region.China);
    }

    /**
     * Set the value of regionId as Chiba. <br />
     * CHIBA
     */
    public void setRegionId_Chiba() {
        setRegionIdAsRegion(AppCDef.Region.Chiba);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of regionId 'America'? <br />
     * AMERICA
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isRegionIdAmerica() {
        AppCDef.Region cdef = getRegionIdAsRegion();
        return cdef != null ? cdef.equals(AppCDef.Region.America) : false;
    }

    /**
     * Is the value of regionId 'Canada'? <br />
     * CANADA
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isRegionIdCanada() {
        AppCDef.Region cdef = getRegionIdAsRegion();
        return cdef != null ? cdef.equals(AppCDef.Region.Canada) : false;
    }

    /**
     * Is the value of regionId 'China'? <br />
     * CHINA
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isRegionIdChina() {
        AppCDef.Region cdef = getRegionIdAsRegion();
        return cdef != null ? cdef.equals(AppCDef.Region.China) : false;
    }

    /**
     * Is the value of regionId 'Chiba'? <br />
     * CHIBA
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isRegionIdChiba() {
        AppCDef.Region cdef = getRegionIdAsRegion();
        return cdef != null ? cdef.equals(AppCDef.Region.Chiba) : false;
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<MemberAddressDto> _memberAddressList;

    public List<MemberAddressDto> getMemberAddressList() {
        if (_memberAddressList == null) { _memberAddressList = new ArrayList<MemberAddressDto>(); }
        return _memberAddressList;
    }

    public void setMemberAddressList(List<MemberAddressDto> memberAddressList) {
        this._memberAddressList = memberAddressList;
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
        if (other == null || !(other instanceof BsRegionDto)) { return false; }
        final BsRegionDto otherEntity = (BsRegionDto)other;
        if (!helpComparingValue(getRegionId(), otherEntity.getRegionId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "REGION");
        result = xCH(result, getRegionId());
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
        sb.append(c).append(getRegionId());
        sb.append(c).append(getRegionName());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (地域ID)REGION_ID: {PK, NotNull, INTEGER(10), classification=Region} <br />
     * @return The value of the column 'REGION_ID'. (NullAllowed)
     */
    public Integer getRegionId() {
        return _regionId;
    }

    /**
     * [set] (地域ID)REGION_ID: {PK, NotNull, INTEGER(10), classification=Region} <br />
     * @param regionId The value of the column 'REGION_ID'. (NullAllowed)
     */
    public void setRegionId(Integer regionId) {
        __modifiedProperties.add("regionId");
        this._regionId = regionId;
    }

    /**
     * [get] (地域名称)REGION_NAME: {NotNull, VARCHAR(50)} <br />
     * @return The value of the column 'REGION_NAME'. (NullAllowed)
     */
    public String getRegionName() {
        return _regionName;
    }

    /**
     * [set] (地域名称)REGION_NAME: {NotNull, VARCHAR(50)} <br />
     * @param regionName The value of the column 'REGION_NAME'. (NullAllowed)
     */
    public void setRegionName(String regionName) {
        __modifiedProperties.add("regionName");
        this._regionName = regionName;
    }

}
