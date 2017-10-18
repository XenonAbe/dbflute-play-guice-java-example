package com.example.dbflute.guice.freeflute.mongodb.bean.bs;

import java.io.Serializable;
import com.example.dbflute.guice.freeflute.mongodb.bean.ex.*;

/**
 * member table
 * @author FreeGen
 */
public class BsJsonMember implements Serializable {

    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MEMBER_ID: identity */
    protected Integer memberId;

    /** MEMBER_NAME: ${column.comment} */
    protected String memberName;

    /** MEMBER_STATUS_CODE: ${column.comment} */
    protected String memberStatusCode;

    /** JSON_MEMBER_STATUS: ${column.comment} */
    protected JsonMemberStatus jsonMemberStatus;

    // [Referrers] *comment only
    // o JSON_PURCHASE

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer value) {
        memberId = value;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String value) {
        memberName = value;
    }

    public String getMemberStatusCode() {
        return memberStatusCode;
    }

    public void setMemberStatusCode(String value) {
        memberStatusCode = value;
    }

    public JsonMemberStatus getJsonMemberStatus() {
        return jsonMemberStatus;
    }

    public void setJsonMemberStatus(JsonMemberStatus value) {
        jsonMemberStatus = value;
    }

}
