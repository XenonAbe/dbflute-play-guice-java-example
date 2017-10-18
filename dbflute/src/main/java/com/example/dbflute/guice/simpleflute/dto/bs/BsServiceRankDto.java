package com.example.dbflute.guice.simpleflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;
import com.example.dbflute.guice.simpleflute.AppCDef;
import com.example.dbflute.guice.simpleflute.dto.*;

/**
 * The simple DTO of (サービスランク)SERVICE_RANK as TABLE. <br />
 * <pre>
 * [primary-key]
 *     SERVICE_RANK_CODE
 * 
 * [column]
 *     SERVICE_RANK_CODE, SERVICE_RANK_NAME, SERVICE_POINT_INCIDENCE, NEW_ACCEPTABLE_FLG, DESCRIPTION, DISPLAY_ORDER
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
 *     MEMBER_SERVICE
 * 
 * [foreign-property]
 *     
 * 
 * [referrer-property]
 *     memberServiceList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsServiceRankDto implements Serializable {

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
    /** (サービスランクコード)SERVICE_RANK_CODE: {PK, NotNull, CHAR(3), classification=ServiceRank} */
    @JsonKey
    protected String _serviceRankCode;

    /** (サービスランク名称)SERVICE_RANK_NAME: {NotNull, VARCHAR(50)} */
    @JsonKey
    protected String _serviceRankName;

    /** (サービスポイント発生率)SERVICE_POINT_INCIDENCE: {NotNull, DECIMAL(5, 3)} */
    @JsonKey
    protected java.math.BigDecimal _servicePointIncidence;

    /** (新規受け入れ可能フラグ)NEW_ACCEPTABLE_FLG: {NotNull, INTEGER(10), classification=Flg} */
    @JsonKey
    protected Integer _newAcceptableFlg;

    /** (説明)DESCRIPTION: {NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _description;

    /** (表示順)DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)} */
    @JsonKey
    protected Integer _displayOrder;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsServiceRankDto() {
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Set the value of serviceRankCode as the classification of ServiceRank. <br />
     * rank of service member gets
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed)
     */
    public void setServiceRankCodeAsServiceRank(AppCDef.ServiceRank cdef) {
        setServiceRankCode(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of serviceRankCode as the classification of ServiceRank. <br />
     * rank of service member gets
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed)
     */
    public AppCDef.ServiceRank getServiceRankCodeAsServiceRank() {
        return AppCDef.ServiceRank.codeOf(getServiceRankCode());
    }

    /**
     * Set the value of newAcceptableFlg as the classification of Flg. <br />
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed)
     */
    public void setNewAcceptableFlgAsFlg(AppCDef.Flg cdef) {
        setNewAcceptableFlg(cdef != null ? Integer.valueOf(cdef.code()) : null);
    }

    /**
     * Get the value of newAcceptableFlg as the classification of Flg. <br />
     * general boolean classification for every flg-column
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed)
     */
    public AppCDef.Flg getNewAcceptableFlgAsFlg() {
        return AppCDef.Flg.codeOf(getNewAcceptableFlg());
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of serviceRankCode as Platinum. <br />
     * PLATINUM: platinum rank
     */
    public void setServiceRankCode_Platinum() {
        setServiceRankCodeAsServiceRank(AppCDef.ServiceRank.Platinum);
    }

    /**
     * Set the value of serviceRankCode as Gold. <br />
     * GOLD: gold rank
     */
    public void setServiceRankCode_Gold() {
        setServiceRankCodeAsServiceRank(AppCDef.ServiceRank.Gold);
    }

    /**
     * Set the value of serviceRankCode as Silver. <br />
     * SILVER: silver rank
     */
    public void setServiceRankCode_Silver() {
        setServiceRankCodeAsServiceRank(AppCDef.ServiceRank.Silver);
    }

    /**
     * Set the value of serviceRankCode as Bronze. <br />
     * BRONZE: bronze rank
     */
    public void setServiceRankCode_Bronze() {
        setServiceRankCodeAsServiceRank(AppCDef.ServiceRank.Bronze);
    }

    /**
     * Set the value of serviceRankCode as Plastic. <br />
     * PLASTIC: plastic rank
     */
    public void setServiceRankCode_Plastic() {
        setServiceRankCodeAsServiceRank(AppCDef.ServiceRank.Plastic);
    }

    /**
     * Set the value of newAcceptableFlg as True. <br />
     * Yes: means valid
     */
    public void setNewAcceptableFlg_True() {
        setNewAcceptableFlgAsFlg(AppCDef.Flg.True);
    }

    /**
     * Set the value of newAcceptableFlg as False. <br />
     * No: means invalid
     */
    public void setNewAcceptableFlg_False() {
        setNewAcceptableFlgAsFlg(AppCDef.Flg.False);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of serviceRankCode 'Platinum'? <br />
     * PLATINUM: platinum rank
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isServiceRankCodePlatinum() {
        AppCDef.ServiceRank cdef = getServiceRankCodeAsServiceRank();
        return cdef != null ? cdef.equals(AppCDef.ServiceRank.Platinum) : false;
    }

    /**
     * Is the value of serviceRankCode 'Gold'? <br />
     * GOLD: gold rank
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isServiceRankCodeGold() {
        AppCDef.ServiceRank cdef = getServiceRankCodeAsServiceRank();
        return cdef != null ? cdef.equals(AppCDef.ServiceRank.Gold) : false;
    }

    /**
     * Is the value of serviceRankCode 'Silver'? <br />
     * SILVER: silver rank
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isServiceRankCodeSilver() {
        AppCDef.ServiceRank cdef = getServiceRankCodeAsServiceRank();
        return cdef != null ? cdef.equals(AppCDef.ServiceRank.Silver) : false;
    }

    /**
     * Is the value of serviceRankCode 'Bronze'? <br />
     * BRONZE: bronze rank
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isServiceRankCodeBronze() {
        AppCDef.ServiceRank cdef = getServiceRankCodeAsServiceRank();
        return cdef != null ? cdef.equals(AppCDef.ServiceRank.Bronze) : false;
    }

    /**
     * Is the value of serviceRankCode 'Plastic'? <br />
     * PLASTIC: plastic rank
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isServiceRankCodePlastic() {
        AppCDef.ServiceRank cdef = getServiceRankCodeAsServiceRank();
        return cdef != null ? cdef.equals(AppCDef.ServiceRank.Plastic) : false;
    }

    /**
     * Is the value of newAcceptableFlg 'True'? <br />
     * Yes: means valid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isNewAcceptableFlgTrue() {
        AppCDef.Flg cdef = getNewAcceptableFlgAsFlg();
        return cdef != null ? cdef.equals(AppCDef.Flg.True) : false;
    }

    /**
     * Is the value of newAcceptableFlg 'False'? <br />
     * No: means invalid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isNewAcceptableFlgFalse() {
        AppCDef.Flg cdef = getNewAcceptableFlgAsFlg();
        return cdef != null ? cdef.equals(AppCDef.Flg.False) : false;
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<MemberServiceDto> _memberServiceList;

    public List<MemberServiceDto> getMemberServiceList() {
        if (_memberServiceList == null) { _memberServiceList = new ArrayList<MemberServiceDto>(); }
        return _memberServiceList;
    }

    public void setMemberServiceList(List<MemberServiceDto> memberServiceList) {
        this._memberServiceList = memberServiceList;
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
        if (other == null || !(other instanceof BsServiceRankDto)) { return false; }
        final BsServiceRankDto otherEntity = (BsServiceRankDto)other;
        if (!helpComparingValue(getServiceRankCode(), otherEntity.getServiceRankCode())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SERVICE_RANK");
        result = xCH(result, getServiceRankCode());
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
        sb.append(c).append(getServiceRankCode());
        sb.append(c).append(getServiceRankName());
        sb.append(c).append(getServicePointIncidence());
        sb.append(c).append(getNewAcceptableFlg());
        sb.append(c).append(getDescription());
        sb.append(c).append(getDisplayOrder());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (サービスランクコード)SERVICE_RANK_CODE: {PK, NotNull, CHAR(3), classification=ServiceRank} <br />
     * @return The value of the column 'SERVICE_RANK_CODE'. (NullAllowed)
     */
    public String getServiceRankCode() {
        return _serviceRankCode;
    }

    /**
     * [set] (サービスランクコード)SERVICE_RANK_CODE: {PK, NotNull, CHAR(3), classification=ServiceRank} <br />
     * @param serviceRankCode The value of the column 'SERVICE_RANK_CODE'. (NullAllowed)
     */
    public void setServiceRankCode(String serviceRankCode) {
        __modifiedProperties.add("serviceRankCode");
        this._serviceRankCode = serviceRankCode;
    }

    /**
     * [get] (サービスランク名称)SERVICE_RANK_NAME: {NotNull, VARCHAR(50)} <br />
     * @return The value of the column 'SERVICE_RANK_NAME'. (NullAllowed)
     */
    public String getServiceRankName() {
        return _serviceRankName;
    }

    /**
     * [set] (サービスランク名称)SERVICE_RANK_NAME: {NotNull, VARCHAR(50)} <br />
     * @param serviceRankName The value of the column 'SERVICE_RANK_NAME'. (NullAllowed)
     */
    public void setServiceRankName(String serviceRankName) {
        __modifiedProperties.add("serviceRankName");
        this._serviceRankName = serviceRankName;
    }

    /**
     * [get] (サービスポイント発生率)SERVICE_POINT_INCIDENCE: {NotNull, DECIMAL(5, 3)} <br />
     * @return The value of the column 'SERVICE_POINT_INCIDENCE'. (NullAllowed)
     */
    public java.math.BigDecimal getServicePointIncidence() {
        return _servicePointIncidence;
    }

    /**
     * [set] (サービスポイント発生率)SERVICE_POINT_INCIDENCE: {NotNull, DECIMAL(5, 3)} <br />
     * @param servicePointIncidence The value of the column 'SERVICE_POINT_INCIDENCE'. (NullAllowed)
     */
    public void setServicePointIncidence(java.math.BigDecimal servicePointIncidence) {
        __modifiedProperties.add("servicePointIncidence");
        this._servicePointIncidence = servicePointIncidence;
    }

    /**
     * [get] (新規受け入れ可能フラグ)NEW_ACCEPTABLE_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * @return The value of the column 'NEW_ACCEPTABLE_FLG'. (NullAllowed)
     */
    public Integer getNewAcceptableFlg() {
        return _newAcceptableFlg;
    }

    /**
     * [set] (新規受け入れ可能フラグ)NEW_ACCEPTABLE_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * @param newAcceptableFlg The value of the column 'NEW_ACCEPTABLE_FLG'. (NullAllowed)
     */
    public void setNewAcceptableFlg(Integer newAcceptableFlg) {
        __modifiedProperties.add("newAcceptableFlg");
        this._newAcceptableFlg = newAcceptableFlg;
    }

    /**
     * [get] (説明)DESCRIPTION: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'DESCRIPTION'. (NullAllowed)
     */
    public String getDescription() {
        return _description;
    }

    /**
     * [set] (説明)DESCRIPTION: {NotNull, VARCHAR(200)} <br />
     * @param description The value of the column 'DESCRIPTION'. (NullAllowed)
     */
    public void setDescription(String description) {
        __modifiedProperties.add("description");
        this._description = description;
    }

    /**
     * [get] (表示順)DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)} <br />
     * @return The value of the column 'DISPLAY_ORDER'. (NullAllowed)
     */
    public Integer getDisplayOrder() {
        return _displayOrder;
    }

    /**
     * [set] (表示順)DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)} <br />
     * @param displayOrder The value of the column 'DISPLAY_ORDER'. (NullAllowed)
     */
    public void setDisplayOrder(Integer displayOrder) {
        __modifiedProperties.add("displayOrder");
        this._displayOrder = displayOrder;
    }

}
