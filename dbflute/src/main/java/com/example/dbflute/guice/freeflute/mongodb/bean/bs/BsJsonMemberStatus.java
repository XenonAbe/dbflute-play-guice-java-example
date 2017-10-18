package com.example.dbflute.guice.freeflute.mongodb.bean.bs;

import java.io.Serializable;

/**
 * member table
 * @author FreeGen
 */
public class BsJsonMemberStatus implements Serializable {

    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MEMBER_STATUS_CODE: code */
    protected String memberStatusCode;

    /** MEMBER_STATUS_NAME: ${column.comment} */
    protected String memberStatusName;

    // [Referrers] *comment only
    // o JSON_MEMBER

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public String getMemberStatusCode() {
        return memberStatusCode;
    }

    public void setMemberStatusCode(String value) {
        memberStatusCode = value;
    }

    public String getMemberStatusName() {
        return memberStatusName;
    }

    public void setMemberStatusName(String value) {
        memberStatusName = value;
    }

}
