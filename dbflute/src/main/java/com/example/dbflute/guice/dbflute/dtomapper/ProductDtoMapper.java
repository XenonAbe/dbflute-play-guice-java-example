package com.example.dbflute.guice.dbflute.dtomapper;

import java.util.Map;
import org.seasar.dbflute.Entity;
import com.example.dbflute.guice.dbflute.dtomapper.bs.BsProductDtoMapper;

/**
 * The DTO mapper of PRODUCT.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class ProductDtoMapper extends BsProductDtoMapper {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public ProductDtoMapper() {
    }

    public ProductDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }
}
