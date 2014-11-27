package com.example.dbflute.guice.dbflute.dtomapper;

import java.util.Map;
import org.seasar.dbflute.Entity;
import com.example.dbflute.guice.dbflute.dtomapper.bs.BsProductCategoryDtoMapper;

/**
 * The DTO mapper of PRODUCT_CATEGORY.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class ProductCategoryDtoMapper extends BsProductCategoryDtoMapper {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public ProductCategoryDtoMapper() {
    }

    public ProductCategoryDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }
}
