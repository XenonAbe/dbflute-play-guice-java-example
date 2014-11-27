package com.example.dbflute.guice.freeflute.mongodb.bean.bs;

import java.io.Serializable;
import com.example.dbflute.guice.freeflute.mongodb.bean.ex.*;

/**
 * purchase table
 * @author FreeGen
 */
public class BsJsonPurchase implements Serializable {

    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PURCHASE_ID: ${column.comment} */
    protected Integer purchaseId;

    /** MEMBER_ID: ${column.comment} */
    protected Integer memberId;

    /** JSON_MEMBER: ${column.comment} */
    protected JsonMember jsonMember;

    // [Referrers] *comment only

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public Integer getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Integer value) {
        purchaseId = value;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer value) {
        memberId = value;
    }

    public JsonMember getJsonMember() {
        return jsonMember;
    }

    public void setJsonMember(JsonMember value) {
        jsonMember = value;
    }

}
