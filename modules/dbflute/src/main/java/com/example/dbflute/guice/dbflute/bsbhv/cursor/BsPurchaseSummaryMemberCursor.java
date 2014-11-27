package com.example.dbflute.guice.dbflute.bsbhv.cursor;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.seasar.dbflute.jdbc.ValueType;
import org.seasar.dbflute.s2dao.valuetype.TnValueTypes;

/**
 * The cursor of PurchaseSummaryMember. <br />
 * @author DBFlute(AutoGenerator)
 */
public class BsPurchaseSummaryMemberCursor {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    // -----------------------------------------------------
    //                                        Column DB Name
    //                                        --------------
    /** DB name of MEMBER_ID. */
    public static final String DB_NAME_MEMBER_ID = "MEMBER_ID";

    /** DB name of MEMBER_NAME. */
    public static final String DB_NAME_MEMBER_NAME = "MEMBER_NAME";

    /** DB name of BIRTHDATE. */
    public static final String DB_NAME_BIRTHDATE = "BIRTHDATE";

    /** DB name of FORMALIZED_DATETIME. */
    public static final String DB_NAME_FORMALIZED_DATETIME = "FORMALIZED_DATETIME";

    /** DB name of PURCHASE_SUMMARY. */
    public static final String DB_NAME_PURCHASE_SUMMARY = "PURCHASE_SUMMARY";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** Wrapped result set. */
    protected ResultSet _rs;

    protected ValueType _vtMemberId = vt(Integer.class);
    protected ValueType _vtMemberName = vt(String.class);
    protected ValueType _vtBirthdate = vt(org.joda.time.LocalDate.class);
    protected ValueType _vtFormalizedDatetime = vt(org.joda.time.LocalDateTime.class);
    protected ValueType _vtPurchaseSummary = vt(Long.class);

    protected ValueType vt(Class<?> type) {
        return TnValueTypes.getValueType(type);
    }

    protected ValueType vt(Class<?> type, String name) {
        ValueType valueType = TnValueTypes.getPluginValueType(name);
        return valueType != null ? valueType : vt(type);
    }

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsPurchaseSummaryMemberCursor() {
    }

    // ===================================================================================
    //                                                                             Prepare
    //                                                                             =======
    /**
     * Accept the result set.
     * @param rs The cursor (result set) for the query, which has first pointer. (NotNull)
     */
    public void accept(ResultSet rs) {
        this._rs = rs;
    }

    // ===================================================================================
    //                                                                              Direct
    //                                                                              ======
    /**
     * Get the wrapped cursor (result set).
     * @return The instance of result set. (NotNull)
     */
    public ResultSet cursor() {
        return _rs;
    }

    // ===================================================================================
    //                                                                            Delegate
    //                                                                            ========
    /**
     * Move to next result.
     * @return Is exist next result.
     * @throws SQLException
     */
    public boolean next() throws SQLException {
        return _rs.next();
    }

    // ===================================================================================
    //                                                                  Type Safe Accessor
    //                                                                  ==================
    /**
     * [get] (会員ID)MEMBER_ID: {INTEGER(10), refers to MEMBER.MEMBER_ID} <br />
     * @return The value of memberId. (NullAllowed)
     * @throws java.sql.SQLException
     */
    public Integer getMemberId() throws SQLException {
        return (Integer)_vtMemberId.getValue(_rs, DB_NAME_MEMBER_ID);
    }

    /**
     * [get] (会員名称)MEMBER_NAME: {VARCHAR(200), refers to MEMBER.MEMBER_NAME} <br />
     * @return The value of memberName. (NullAllowed)
     * @throws java.sql.SQLException
     */
    public String getMemberName() throws SQLException {
        return (String)_vtMemberName.getValue(_rs, DB_NAME_MEMBER_NAME);
    }

    /**
     * [get] (生年月日)BIRTHDATE: {DATE(8), refers to MEMBER.BIRTHDATE} <br />
     * @return The value of birthdate. (NullAllowed)
     * @throws java.sql.SQLException
     */
    public org.joda.time.LocalDate getBirthdate() throws SQLException {
        return (org.joda.time.LocalDate)_vtBirthdate.getValue(_rs, DB_NAME_BIRTHDATE);
    }

    /**
     * [get] (正式会員日時)FORMALIZED_DATETIME: {TIMESTAMP(23, 10), refers to MEMBER.FORMALIZED_DATETIME} <br />
     * @return The value of formalizedDatetime. (NullAllowed)
     * @throws java.sql.SQLException
     */
    public org.joda.time.LocalDateTime getFormalizedDatetime() throws SQLException {
        return (org.joda.time.LocalDateTime)_vtFormalizedDatetime.getValue(_rs, DB_NAME_FORMALIZED_DATETIME);
    }

    /**
     * [get] PURCHASE_SUMMARY: {BIGINT(10)} <br />
     * @return The value of purchaseSummary. (NullAllowed)
     * @throws java.sql.SQLException
     */
    public Long getPurchaseSummary() throws SQLException {
        return (Long)_vtPurchaseSummary.getValue(_rs, DB_NAME_PURCHASE_SUMMARY);
    }

}
