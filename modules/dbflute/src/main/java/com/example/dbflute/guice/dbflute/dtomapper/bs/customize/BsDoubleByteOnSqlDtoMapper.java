package com.example.dbflute.guice.dbflute.dtomapper.bs.customize;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.bhv.DtoMapper;
import org.seasar.dbflute.bhv.InstanceKeyDto;
import org.seasar.dbflute.bhv.InstanceKeyEntity;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.helper.beans.DfBeanDesc;
import org.seasar.dbflute.helper.beans.DfPropertyDesc;
import org.seasar.dbflute.helper.beans.factory.DfBeanDescFactory;
import org.seasar.dbflute.jdbc.Classification;
import com.example.dbflute.guice.dbflute.exentity.customize.*;
import com.example.dbflute.guice.simpleflute.dto.customize.*;
import com.example.dbflute.guice.dbflute.dtomapper.customize.*;

/**
 * The DTO mapper of DoubleByteOnSql. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     MEMBER_ID, MEMBER_NAME_WITH_SPACE, MEMBER_STATUS_NAME
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     
 * 
 * [foreign-table]
 *     
 * 
 * [referrer-table]
 *     
 * 
 * [foreign-property]
 *     
 * 
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsDoubleByteOnSqlDtoMapper implements DtoMapper<DoubleByteOnSql, DoubleByteOnSqlDto>, Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final Map<Entity, Object> _relationDtoMap;
    protected final Map<Object, Entity> _relationEntityMap;
    protected boolean _exceptCommonColumn;
    protected boolean _reverseReference; // default: one-way reference
    protected boolean _instanceCache = true; // default: cached

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsDoubleByteOnSqlDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsDoubleByteOnSqlDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        _relationDtoMap = relationDtoMap;
        _relationEntityMap = relationEntityMap;
    }

    // ===================================================================================
    //                                                                             Mapping
    //                                                                             =======
    // -----------------------------------------------------
    //                                                to DTO
    //                                                ------
    /**
     * {@inheritDoc}
     */
    public DoubleByteOnSqlDto mappingToDto(DoubleByteOnSql entity) {
        if (entity == null) {
            return null;
        }
        DoubleByteOnSqlDto dto = new DoubleByteOnSqlDto();
        dto.setMemberId(entity.getMemberId());
        dto.setMemberNameWithSpace(entity.getMemberNameWithSpace());
        dto.setMemberStatusName(entity.getMemberStatusName());
        reflectDerivedProperty(entity, dto, true);
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<DoubleByteOnSqlDto> mappingToDtoList(List<DoubleByteOnSql> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<DoubleByteOnSqlDto> dtoList = new ArrayList<DoubleByteOnSqlDto>();
        for (DoubleByteOnSql entity : entityList) {
            DoubleByteOnSqlDto dto = mappingToDto(entity);
            if (dto != null) {
                dtoList.add(dto);
            } else {
                if (isAcceptNullElementOnList()) {
                    dtoList.add(null);
                }
            }
        }
        return dtoList;
    }

    // -----------------------------------------------------
    //                                             to Entity
    //                                             ---------
    /**
     * {@inheritDoc}
     */
    public DoubleByteOnSql mappingToEntity(DoubleByteOnSqlDto dto) {
        if (dto == null) {
            return null;
        }
        DoubleByteOnSql entity = new DoubleByteOnSql();
        if (needsMapping(dto, dto.getMemberId(), "memberId")) {
            entity.setMemberId(dto.getMemberId());
        }
        if (needsMapping(dto, dto.getMemberNameWithSpace(), "memberNameWithSpace")) {
            entity.setMemberNameWithSpace(dto.getMemberNameWithSpace());
        }
        if (needsMapping(dto, dto.getMemberStatusName(), "memberStatusName")) {
            entity.setMemberStatusName(dto.getMemberStatusName());
        }
        reflectDerivedProperty(entity, dto, false);
        return entity;
    }

    /**
     * Does the property need to be mapped to an entity? <br />
     * If modified info of DTO has at least one property, only modified properties are mapped.
     * And if no property is modified, all properties are mapped (but the other option exists).
     * @param dto The instance of DTO. (NotNull)
     * @param value The value of DTO's property. (NotNull)
     * @param propName The property name of DTO. (NotNull)
     * @return The determination, true or false.
     */
    protected boolean needsMapping(DoubleByteOnSqlDto dto, Object value, String propName) {
        Set<String> modifiedProperties = dto.mymodifiedProperties();
        if (modifiedProperties.isEmpty()) {
            return isMappingToEntityContainsNull() || value != null;
        }
        return modifiedProperties.contains(propName);
    }

    /**
     * Does the mapping to an entity contain null values? (when no property is modified) <br />
     * Default is true that means a setter is called if the value is null.
     * But this method is valid only when no property is modified. 
     * @return The determination, true or false.
     */
    protected boolean isMappingToEntityContainsNull() { // for extension
        return true; // as default
    }

    /**
     * {@inheritDoc}
     */
    public List<DoubleByteOnSql> mappingToEntityList(List<DoubleByteOnSqlDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<DoubleByteOnSql> entityList = new ArrayList<DoubleByteOnSql>();
        for (DoubleByteOnSqlDto dto : dtoList) {
            DoubleByteOnSql entity = mappingToEntity(dto);
            if (entity != null) {
                entityList.add(entity);
            } else {
                if (isAcceptNullElementOnList()) {
                    entityList.add(null);
                }
            }
        }
        return entityList;
    }

    protected boolean isAcceptNullElementOnList() {
        return true; // as default
    }

    // -----------------------------------------------------
    //                                          Instance Key
    //                                          ------------
    protected Object createInstanceKeyDto(final Object dto, final int instanceHash) {
        return new InstanceKeyDto(dto, instanceHash);
    }

    protected InstanceKeyEntity createInstanceKeyEntity(Entity entity) {
        return new InstanceKeyEntity(entity);
    }

    public void disableInstanceCache() { // internal option
        _instanceCache = false;
    }

    // -----------------------------------------------------
    //                                      Derived Property
    //                                      ----------------
    protected void reflectDerivedProperty(Entity entity, Object dto, boolean toDto) {
        DfBeanDesc entityDesc = DfBeanDescFactory.getBeanDesc(entity.getClass());
        DfBeanDesc dtoDesc = DfBeanDescFactory.getBeanDesc(dto.getClass());
        DBMeta dbmeta = entity.getDBMeta();
        for (String propertyName : entityDesc.getProppertyNameList()) {
            if (isOutOfDerivedPropertyName(entity, dto, toDto, dbmeta, entityDesc, dtoDesc, propertyName)) {
                continue;
            }
            DfPropertyDesc entityProp = entityDesc.getPropertyDesc(propertyName);
            Class<?> propertyType = entityProp.getPropertyType();
            if (isOutOfDerivedPropertyType(entity, dto, toDto, propertyName, propertyType)) {
                continue;
            }
            if (entityProp.isReadable() && entityProp.isWritable()) {
                DfPropertyDesc dtoProp = dtoDesc.getPropertyDesc(propertyName);
                if (dtoProp.isReadable() && dtoProp.isWritable()) {
                    if (toDto) {
                        dtoProp.setValue(dto, entityProp.getValue(entity));
                    } else {
                        entityProp.setValue(entity, dtoProp.getValue(dto));
                    }
                }
            }
        }
    }

    protected boolean isOutOfDerivedPropertyName(Entity entity, Object dto, boolean toDto
                                               , DBMeta dbmeta, DfBeanDesc entityDesc, DfBeanDesc dtoDesc
                                               , String propertyName) {
        return dbmeta.hasColumn(propertyName)
                    || dbmeta.hasForeign(propertyName) || dbmeta.hasReferrer(propertyName)
                    || !dtoDesc.hasPropertyDesc(propertyName);
    }

    protected boolean isOutOfDerivedPropertyType(Entity entity, Object dto, boolean toDto
                                               , String propertyName, Class<?> propertyType) {
        return List.class.isAssignableFrom(propertyType)
                || Entity.class.isAssignableFrom(propertyType)
                || Classification.class.isAssignableFrom(propertyType);
    }

    // ===================================================================================
    //                                                                   Suppress Relation
    //                                                                   =================
    // (basically) to suppress infinity loop
    protected void doSuppressAll() { // internal
    }
    protected void doSuppressClear() { // internal
    }

    // ===================================================================================
    //                                                                      Mapping Option
    //                                                                      ==============
    /**
     * {@inheritDoc}
     */
    public void setBaseOnlyMapping(boolean baseOnlyMapping) {
        if (baseOnlyMapping) {
            doSuppressAll();
        } else {
            doSuppressClear();
        }
    }

    protected boolean isExceptCommonColumn() {
        return _exceptCommonColumn;
    }

    /**
     * {@inheritDoc}
     */
    public void setExceptCommonColumn(boolean exceptCommonColumn) {
        _exceptCommonColumn = exceptCommonColumn;
    }

    protected boolean isReverseReference() {
        return _reverseReference;
    }

    /**
     * {@inheritDoc}
     */
    public void setReverseReference(boolean reverseReference) {
        _reverseReference = reverseReference;
    }

    // -----------------------------------------------------
    //                                           Easy-to-Use
    //                                           -----------
    /**
     * Enable base-only mapping that means the mapping ignores all references.
     * @return this. (NotNull)
     */
    public DoubleByteOnSqlDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (DoubleByteOnSqlDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public DoubleByteOnSqlDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (DoubleByteOnSqlDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public DoubleByteOnSqlDtoMapper reverseReference() {
        setReverseReference(true);
        return (DoubleByteOnSqlDtoMapper)this;
    }
}
