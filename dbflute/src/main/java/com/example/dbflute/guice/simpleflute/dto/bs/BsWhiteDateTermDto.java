package com.example.dbflute.guice.simpleflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * The simple DTO of WHITE_DATE_TERM as TABLE. <br />
 * <pre>
 * [primary-key]
 *     DATE_TERM_ID
 * 
 * [column]
 *     DATE_TERM_ID, DATE_TERM_VALUE, BEGIN_DATE, END_DATE
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
public abstract class BsWhiteDateTermDto implements Serializable {

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
    /** DATE_TERM_ID: {PK, NotNull, DECIMAL(16)} */
    @JsonKey
    protected Long _dateTermId;

    /** DATE_TERM_VALUE: {NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _dateTermValue;

    /** BEGIN_DATE: {NotNull, DATE(8)} */
    @JsonKey
    protected org.joda.time.LocalDate _beginDate;

    /** END_DATE: {NotNull, DATE(8)} */
    @JsonKey
    protected org.joda.time.LocalDate _endDate;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteDateTermDto() {
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
        if (other == null || !(other instanceof BsWhiteDateTermDto)) { return false; }
        final BsWhiteDateTermDto otherEntity = (BsWhiteDateTermDto)other;
        if (!helpComparingValue(getDateTermId(), otherEntity.getDateTermId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "WHITE_DATE_TERM");
        result = xCH(result, getDateTermId());
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
        sb.append(c).append(getDateTermId());
        sb.append(c).append(getDateTermValue());
        sb.append(c).append(getBeginDate());
        sb.append(c).append(getEndDate());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] DATE_TERM_ID: {PK, NotNull, DECIMAL(16)} <br />
     * @return The value of the column 'DATE_TERM_ID'. (NullAllowed)
     */
    public Long getDateTermId() {
        return _dateTermId;
    }

    /**
     * [set] DATE_TERM_ID: {PK, NotNull, DECIMAL(16)} <br />
     * @param dateTermId The value of the column 'DATE_TERM_ID'. (NullAllowed)
     */
    public void setDateTermId(Long dateTermId) {
        __modifiedProperties.add("dateTermId");
        this._dateTermId = dateTermId;
    }

    /**
     * [get] DATE_TERM_VALUE: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'DATE_TERM_VALUE'. (NullAllowed)
     */
    public String getDateTermValue() {
        return _dateTermValue;
    }

    /**
     * [set] DATE_TERM_VALUE: {NotNull, VARCHAR(200)} <br />
     * @param dateTermValue The value of the column 'DATE_TERM_VALUE'. (NullAllowed)
     */
    public void setDateTermValue(String dateTermValue) {
        __modifiedProperties.add("dateTermValue");
        this._dateTermValue = dateTermValue;
    }

    /**
     * [get] BEGIN_DATE: {NotNull, DATE(8)} <br />
     * @return The value of the column 'BEGIN_DATE'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd")
    public org.joda.time.LocalDate getBeginDate() {
        return _beginDate;
    }

    /**
     * [set] BEGIN_DATE: {NotNull, DATE(8)} <br />
     * @param beginDate The value of the column 'BEGIN_DATE'. (NullAllowed)
     */
    public void setBeginDate(org.joda.time.LocalDate beginDate) {
        __modifiedProperties.add("beginDate");
        this._beginDate = beginDate;
    }

    /**
     * [get] END_DATE: {NotNull, DATE(8)} <br />
     * @return The value of the column 'END_DATE'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd")
    public org.joda.time.LocalDate getEndDate() {
        return _endDate;
    }

    /**
     * [set] END_DATE: {NotNull, DATE(8)} <br />
     * @param endDate The value of the column 'END_DATE'. (NullAllowed)
     */
    public void setEndDate(org.joda.time.LocalDate endDate) {
        __modifiedProperties.add("endDate");
        this._endDate = endDate;
    }

}
