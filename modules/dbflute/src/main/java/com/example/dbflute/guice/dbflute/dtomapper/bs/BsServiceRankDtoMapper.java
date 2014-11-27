package com.example.dbflute.guice.dbflute.dtomapper.bs;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.optional.OptionalEntity;
import org.seasar.dbflute.bhv.DtoMapper;
import org.seasar.dbflute.bhv.InstanceKeyDto;
import org.seasar.dbflute.bhv.InstanceKeyEntity;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.helper.beans.DfBeanDesc;
import org.seasar.dbflute.helper.beans.DfPropertyDesc;
import org.seasar.dbflute.helper.beans.factory.DfBeanDescFactory;
import org.seasar.dbflute.jdbc.Classification;
import com.example.dbflute.guice.dbflute.allcommon.CDef;
import com.example.dbflute.guice.dbflute.exentity.*;
import com.example.dbflute.guice.simpleflute.dto.*;
import com.example.dbflute.guice.dbflute.dtomapper.*;

/**
 * The DTO mapper of (サービスランク)SERVICE_RANK as TABLE. <br />
 * <pre>
 * [primary-key]
 *     SERVICE_RANK_CODE
 * 
 * [column]
 *     SERVICE_RANK_CODE, SERVICE_RANK_NAME, SERVICE_POINT_INCIDENCE, NEW_ACCEPTABLE_FLG, DESCRIPTION, DISPLAY_ORDER
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
 *     MEMBER_SERVICE
 * 
 * [foreign-property]
 *     
 * 
 * [referrer-property]
 *     memberServiceList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsServiceRankDtoMapper implements DtoMapper<ServiceRank, ServiceRankDto>, Serializable {

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
    protected boolean _suppressMemberServiceList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsServiceRankDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsServiceRankDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public ServiceRankDto mappingToDto(ServiceRank entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (ServiceRankDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        ServiceRankDto dto = new ServiceRankDto();
        dto.setServiceRankCode(entity.getServiceRankCode());
        dto.setServiceRankName(entity.getServiceRankName());
        dto.setServicePointIncidence(entity.getServicePointIncidence());
        dto.setNewAcceptableFlg(entity.getNewAcceptableFlg());
        dto.setDescription(entity.getDescription());
        dto.setDisplayOrder(entity.getDisplayOrder());
        reflectDerivedProperty(entity, dto, true);
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only a DTO that has a primary key value
            _relationDtoMap.put(localKey, dto);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressMemberServiceList && !entity.getMemberServiceList().isEmpty()) {
            MemberServiceDtoMapper mapper = new MemberServiceDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressServiceRank();
            List<MemberServiceDto> relationDtoList = mapper.mappingToDtoList(entity.getMemberServiceList());
            dto.setMemberServiceList(relationDtoList);
            if (reverseReference) {
                for (MemberServiceDto relationDto : relationDtoList) {
                    relationDto.setServiceRank(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<ServiceRankDto> mappingToDtoList(List<ServiceRank> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<ServiceRankDto> dtoList = new ArrayList<ServiceRankDto>();
        for (ServiceRank entity : entityList) {
            ServiceRankDto dto = mappingToDto(entity);
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
    public ServiceRank mappingToEntity(ServiceRankDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (ServiceRank)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        ServiceRank entity = new ServiceRank();
        if (needsMapping(dto, dto.getServiceRankCode(), "serviceRankCode")) {
            entity.setServiceRankCodeAsServiceRank(CDef.ServiceRank.codeOf(dto.getServiceRankCode()));
        }
        if (needsMapping(dto, dto.getServiceRankName(), "serviceRankName")) {
            entity.setServiceRankName(dto.getServiceRankName());
        }
        if (needsMapping(dto, dto.getServicePointIncidence(), "servicePointIncidence")) {
            entity.setServicePointIncidence(dto.getServicePointIncidence());
        }
        if (needsMapping(dto, dto.getNewAcceptableFlg(), "newAcceptableFlg")) {
            entity.setNewAcceptableFlgAsFlg(CDef.Flg.codeOf(dto.getNewAcceptableFlg()));
        }
        if (needsMapping(dto, dto.getDescription(), "description")) {
            entity.setDescription(dto.getDescription());
        }
        if (needsMapping(dto, dto.getDisplayOrder(), "displayOrder")) {
            entity.setDisplayOrder(dto.getDisplayOrder());
        }
        reflectDerivedProperty(entity, dto, false);
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only an entity that has a primary key value
            _relationEntityMap.put(localKey, entity);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressMemberServiceList && !dto.getMemberServiceList().isEmpty()) {
            MemberServiceDtoMapper mapper = new MemberServiceDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressServiceRank();
            List<MemberService> relationEntityList = mapper.mappingToEntityList(dto.getMemberServiceList());
            entity.setMemberServiceList(relationEntityList);
            if (reverseReference) {
                for (MemberService relationEntity : relationEntityList) {
                    relationEntity.setServiceRank(OptionalEntity.of(entity));
                }
            }
        };
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
    protected boolean needsMapping(ServiceRankDto dto, Object value, String propName) {
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
    public List<ServiceRank> mappingToEntityList(List<ServiceRankDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<ServiceRank> entityList = new ArrayList<ServiceRank>();
        for (ServiceRankDto dto : dtoList) {
            ServiceRank entity = mappingToEntity(dto);
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
    public void suppressMemberServiceList() {
        _suppressMemberServiceList = true;
    }
    protected void doSuppressAll() { // internal
        suppressMemberServiceList();
    }
    protected void doSuppressClear() { // internal
        _suppressMemberServiceList = false;
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
    public ServiceRankDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (ServiceRankDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public ServiceRankDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (ServiceRankDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public ServiceRankDtoMapper reverseReference() {
        setReverseReference(true);
        return (ServiceRankDtoMapper)this;
    }
}
