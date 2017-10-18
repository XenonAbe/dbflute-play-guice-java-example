package com.example.dbflute.guice.dbflute.dtomapper.customize;

import java.util.Map;
import org.seasar.dbflute.Entity;
import com.example.dbflute.guice.dbflute.dtomapper.bs.customize.BsCommonColumnMemberDtoMapper;

/**
 * The DTO mapper of CommonColumnMember.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class CommonColumnMemberDtoMapper extends BsCommonColumnMemberDtoMapper {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public CommonColumnMemberDtoMapper() {
    }

    public CommonColumnMemberDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }
}
