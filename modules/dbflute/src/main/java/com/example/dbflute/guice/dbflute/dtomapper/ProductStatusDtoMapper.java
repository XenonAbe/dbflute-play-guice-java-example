package com.example.dbflute.guice.dbflute.dtomapper;

import java.util.Map;
import org.seasar.dbflute.Entity;
import com.example.dbflute.guice.dbflute.dtomapper.bs.BsProductStatusDtoMapper;

/**
 * The DTO mapper of PRODUCT_STATUS.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class ProductStatusDtoMapper extends BsProductStatusDtoMapper {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public ProductStatusDtoMapper() {
    }

    public ProductStatusDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }
}
