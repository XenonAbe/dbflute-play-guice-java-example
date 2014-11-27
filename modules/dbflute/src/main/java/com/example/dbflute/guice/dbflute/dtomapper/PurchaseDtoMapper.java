package com.example.dbflute.guice.dbflute.dtomapper;

import java.util.Map;
import org.seasar.dbflute.Entity;
import com.example.dbflute.guice.dbflute.dtomapper.bs.BsPurchaseDtoMapper;

/**
 * The DTO mapper of PURCHASE.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class PurchaseDtoMapper extends BsPurchaseDtoMapper {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public PurchaseDtoMapper() {
    }

    public PurchaseDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }
}
