package com.example.dbflute.guice.dbflute.dtomapper;

import java.util.Map;
import org.seasar.dbflute.Entity;
import com.example.dbflute.guice.dbflute.dtomapper.bs.BsRegionDtoMapper;

/**
 * The DTO mapper of REGION.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class RegionDtoMapper extends BsRegionDtoMapper {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public RegionDtoMapper() {
    }

    public RegionDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }
}
