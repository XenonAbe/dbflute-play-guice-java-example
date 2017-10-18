package com.example.dbflute.guice.dbflute.dtomapper;

import java.util.Map;
import org.seasar.dbflute.Entity;
import com.example.dbflute.guice.dbflute.dtomapper.bs.BsVendorPrimaryKeyOnlyDtoMapper;

/**
 * The DTO mapper of VENDOR_PRIMARY_KEY_ONLY.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class VendorPrimaryKeyOnlyDtoMapper extends BsVendorPrimaryKeyOnlyDtoMapper {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public VendorPrimaryKeyOnlyDtoMapper() {
    }

    public VendorPrimaryKeyOnlyDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }
}
