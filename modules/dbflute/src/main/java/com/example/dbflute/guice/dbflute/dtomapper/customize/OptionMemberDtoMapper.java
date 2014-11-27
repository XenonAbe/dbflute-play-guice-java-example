package com.example.dbflute.guice.dbflute.dtomapper.customize;

import java.util.Map;
import org.seasar.dbflute.Entity;
import com.example.dbflute.guice.dbflute.dtomapper.bs.customize.BsOptionMemberDtoMapper;

/**
 * The DTO mapper of OptionMember.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class OptionMemberDtoMapper extends BsOptionMemberDtoMapper {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public OptionMemberDtoMapper() {
    }

    public OptionMemberDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }
}
