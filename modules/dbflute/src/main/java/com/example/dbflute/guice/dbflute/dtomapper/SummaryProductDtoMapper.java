package com.example.dbflute.guice.dbflute.dtomapper;

import java.util.Map;
import org.seasar.dbflute.Entity;
import com.example.dbflute.guice.dbflute.dtomapper.bs.BsSummaryProductDtoMapper;

/**
 * The DTO mapper of SUMMARY_PRODUCT.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class SummaryProductDtoMapper extends BsSummaryProductDtoMapper {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public SummaryProductDtoMapper() {
    }

    public SummaryProductDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }
}
