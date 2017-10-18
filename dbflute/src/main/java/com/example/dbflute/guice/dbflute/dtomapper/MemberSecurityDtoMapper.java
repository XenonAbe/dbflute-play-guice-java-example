package com.example.dbflute.guice.dbflute.dtomapper;

import java.util.Map;
import org.seasar.dbflute.Entity;
import com.example.dbflute.guice.dbflute.dtomapper.bs.BsMemberSecurityDtoMapper;

/**
 * The DTO mapper of MEMBER_SECURITY.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MemberSecurityDtoMapper extends BsMemberSecurityDtoMapper {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public MemberSecurityDtoMapper() {
    }

    public MemberSecurityDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }
}
