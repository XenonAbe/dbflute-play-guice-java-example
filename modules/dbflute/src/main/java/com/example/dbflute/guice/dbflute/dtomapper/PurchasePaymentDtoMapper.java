package com.example.dbflute.guice.dbflute.dtomapper;

import java.util.Map;
import org.seasar.dbflute.Entity;
import com.example.dbflute.guice.dbflute.dtomapper.bs.BsPurchasePaymentDtoMapper;

/**
 * The DTO mapper of PURCHASE_PAYMENT.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class PurchasePaymentDtoMapper extends BsPurchasePaymentDtoMapper {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public PurchasePaymentDtoMapper() {
    }

    public PurchasePaymentDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }
}
