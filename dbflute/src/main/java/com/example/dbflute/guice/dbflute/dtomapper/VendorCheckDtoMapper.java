package com.example.dbflute.guice.dbflute.dtomapper;

import java.util.Map;
import org.seasar.dbflute.Entity;
import com.example.dbflute.guice.dbflute.dtomapper.bs.BsVendorCheckDtoMapper;

/**
 * The DTO mapper of VENDOR_CHECK.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class VendorCheckDtoMapper extends BsVendorCheckDtoMapper {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public VendorCheckDtoMapper() {
    }

    public VendorCheckDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }
}
