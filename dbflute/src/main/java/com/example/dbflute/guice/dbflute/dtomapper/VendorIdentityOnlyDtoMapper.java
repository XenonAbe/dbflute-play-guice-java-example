package com.example.dbflute.guice.dbflute.dtomapper;

import java.util.Map;
import org.seasar.dbflute.Entity;
import com.example.dbflute.guice.dbflute.dtomapper.bs.BsVendorIdentityOnlyDtoMapper;

/**
 * The DTO mapper of VENDOR_IDENTITY_ONLY.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class VendorIdentityOnlyDtoMapper extends BsVendorIdentityOnlyDtoMapper {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public VendorIdentityOnlyDtoMapper() {
    }

    public VendorIdentityOnlyDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }
}
