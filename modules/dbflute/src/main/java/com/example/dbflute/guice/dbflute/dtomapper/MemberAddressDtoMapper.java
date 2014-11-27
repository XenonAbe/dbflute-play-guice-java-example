package com.example.dbflute.guice.dbflute.dtomapper;

import java.util.Map;
import org.seasar.dbflute.Entity;
import com.example.dbflute.guice.dbflute.dtomapper.bs.BsMemberAddressDtoMapper;

/**
 * The DTO mapper of MEMBER_ADDRESS.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MemberAddressDtoMapper extends BsMemberAddressDtoMapper {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public MemberAddressDtoMapper() {
    }

    public MemberAddressDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }
}
