package com.example.dbflute.guice.dbflute.dtomapper;

import java.util.Map;
import org.seasar.dbflute.Entity;
import com.example.dbflute.guice.dbflute.dtomapper.bs.BsMemberFollowingDtoMapper;

/**
 * The DTO mapper of MEMBER_FOLLOWING.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MemberFollowingDtoMapper extends BsMemberFollowingDtoMapper {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public MemberFollowingDtoMapper() {
    }

    public MemberFollowingDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }
}
