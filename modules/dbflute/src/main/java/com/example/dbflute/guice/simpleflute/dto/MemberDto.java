package com.example.dbflute.guice.simpleflute.dto;

import org.joda.time.LocalDateTime;

import com.example.dbflute.guice.simpleflute.dto.bs.BsMemberDto;

/**
 * The entity of MEMBER.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 * @author jflute
 */
public class MemberDto extends BsMemberDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LocalDateTime _latestLoginDatetime;
    protected Integer _loginCount;
    protected Integer _productKindCount;

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public LocalDateTime getLatestLoginDatetime() {
        return _latestLoginDatetime;
    }

    public void setLatestLoginDatetime(LocalDateTime latestLoginDatetime) {
        _latestLoginDatetime = latestLoginDatetime;
    }

    public Integer getLoginCount() {
        return _loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this._loginCount = loginCount;
    }

    public Integer getProductKindCount() {
        return _productKindCount;
    }

    public void setProductKindCount(Integer productKindCount) {
        this._productKindCount = productKindCount;
    }
}
