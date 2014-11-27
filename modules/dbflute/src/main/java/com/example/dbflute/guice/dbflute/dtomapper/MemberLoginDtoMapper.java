package com.example.dbflute.guice.dbflute.dtomapper;

import java.util.Map;
import org.seasar.dbflute.Entity;
import com.example.dbflute.guice.dbflute.dtomapper.bs.BsMemberLoginDtoMapper;

/**
 * The DTO mapper of MEMBER_LOGIN.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MemberLoginDtoMapper extends BsMemberLoginDtoMapper {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public MemberLoginDtoMapper() {
    }

    public MemberLoginDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }
}
