package com.example.dbflute.guice.dbflute.dtomapper;

import java.util.Map;
import org.seasar.dbflute.Entity;
import com.example.dbflute.guice.dbflute.dtomapper.bs.BsWithdrawalReasonDtoMapper;

/**
 * The DTO mapper of WITHDRAWAL_REASON.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class WithdrawalReasonDtoMapper extends BsWithdrawalReasonDtoMapper {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public WithdrawalReasonDtoMapper() {
    }

    public WithdrawalReasonDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }
}
