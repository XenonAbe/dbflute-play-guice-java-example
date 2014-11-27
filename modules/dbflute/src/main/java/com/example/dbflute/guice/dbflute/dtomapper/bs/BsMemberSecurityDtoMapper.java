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
import com.example.dbflute.guice.dbflute.exentity.*;
import com.example.dbflute.guice.simpleflute.dto.*;
import com.example.dbflute.guice.dbflute.dtomapper.*;

/**
 * The DTO mapper of (会員セキュリティ情報)MEMBER_SECURITY as TABLE. <br />
 * <pre>
 * [primary-key]
 *     MEMBER_ID
 * 
 * [column]
 *     MEMBER_ID, LOGIN_PASSWORD, REMINDER_QUESTION, REMINDER_ANSWER, REMINDER_USE_COUNT, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     VERSION_NO
 * 
 * [foreign-table]
 *     MEMBER
 * 
 * [referrer-table]
 *     
 * 
 * [foreign-property]
 *     member
 * 
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMemberSecurityDtoMapper implements DtoMapper<MemberSecurity, MemberSecurityDto>, Serializable {

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
    protected boolean _suppressMember;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMemberSecurityDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsMemberSecurityDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public MemberSecurityDto mappingToDto(MemberSecurity entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (MemberSecurityDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MemberSecurityDto dto = new MemberSecurityDto();
        dto.setMemberId(entity.getMemberId());
        dto.setLoginPassword(entity.getLoginPassword());
        dto.setReminderQuestion(entity.getReminderQuestion());
        dto.setReminderAnswer(entity.getReminderAnswer());
        dto.setReminderUseCount(entity.getReminderUseCount());
        if (!exceptCommonColumn) {
            dto.setRegisterDatetime(entity.getRegisterDatetime());
        }
        if (!exceptCommonColumn) {
            dto.setRegisterUser(entity.getRegisterUser());
        }
        if (!exceptCommonColumn) {
            dto.setUpdateDatetime(entity.getUpdateDatetime());
        }
        if (!exceptCommonColumn) {
            dto.setUpdateUser(entity.getUpdateUser());
        }
        dto.setVersionNo(entity.getVersionNo());
        reflectDerivedProperty(entity, dto, true);
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only a DTO that has a primary key value
            _relationDtoMap.put(localKey, dto);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressMember && entity.getMember().isPresent()) {
            Member relationEntity = entity.getMember().get();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MemberDto relationDto = (MemberDto)cachedDto;
                dto.setMember(relationDto);
                if (reverseReference) {
                    relationDto.setMemberSecurityAsOne(dto);
                }
            } else {
                MemberDtoMapper mapper = new MemberDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMemberSecurityAsOne();
                MemberDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMember(relationDto);
                if (reverseReference) {
                    relationDto.setMemberSecurityAsOne(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMember());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<MemberSecurityDto> mappingToDtoList(List<MemberSecurity> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<MemberSecurityDto> dtoList = new ArrayList<MemberSecurityDto>();
        for (MemberSecurity entity : entityList) {
            MemberSecurityDto dto = mappingToDto(entity);
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
    public MemberSecurity mappingToEntity(MemberSecurityDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (MemberSecurity)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MemberSecurity entity = new MemberSecurity();
        if (needsMapping(dto, dto.getMemberId(), "memberId")) {
            entity.setMemberId(dto.getMemberId());
        }
        if (needsMapping(dto, dto.getLoginPassword(), "loginPassword")) {
            entity.setLoginPassword(dto.getLoginPassword());
        }
        if (needsMapping(dto, dto.getReminderQuestion(), "reminderQuestion")) {
            entity.setReminderQuestion(dto.getReminderQuestion());
        }
        if (needsMapping(dto, dto.getReminderAnswer(), "reminderAnswer")) {
            entity.setReminderAnswer(dto.getReminderAnswer());
        }
        if (needsMapping(dto, dto.getReminderUseCount(), "reminderUseCount")) {
            entity.setReminderUseCount(dto.getReminderUseCount());
        }
        if (needsMapping(dto, dto.getRegisterDatetime(), "registerDatetime") && !exceptCommonColumn) {
            entity.setRegisterDatetime(dto.getRegisterDatetime());
        }
        if (needsMapping(dto, dto.getRegisterUser(), "registerUser") && !exceptCommonColumn) {
            entity.setRegisterUser(dto.getRegisterUser());
        }
        if (needsMapping(dto, dto.getUpdateDatetime(), "updateDatetime") && !exceptCommonColumn) {
            entity.setUpdateDatetime(dto.getUpdateDatetime());
        }
        if (needsMapping(dto, dto.getUpdateUser(), "updateUser") && !exceptCommonColumn) {
            entity.setUpdateUser(dto.getUpdateUser());
        }
        if (needsMapping(dto, dto.getVersionNo(), "versionNo")) {
            entity.setVersionNo(dto.getVersionNo());
        }
        reflectDerivedProperty(entity, dto, false);
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only an entity that has a primary key value
            _relationEntityMap.put(localKey, entity);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressMember && dto.getMember() != null) {
            MemberDto relationDto = dto.getMember();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                Member relationEntity = (Member)cachedEntity;
                entity.setMember(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.setMemberSecurityAsOne(OptionalEntity.of(entity));
                }
            } else {
                MemberDtoMapper mapper = new MemberDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMemberSecurityAsOne();
                Member relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMember(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.setMemberSecurityAsOne(OptionalEntity.of(entity));
                }
                if (instanceCache && entity.getMember().get().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMember().get());
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
    protected boolean needsMapping(MemberSecurityDto dto, Object value, String propName) {
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
    public List<MemberSecurity> mappingToEntityList(List<MemberSecurityDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<MemberSecurity> entityList = new ArrayList<MemberSecurity>();
        for (MemberSecurityDto dto : dtoList) {
            MemberSecurity entity = mappingToEntity(dto);
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
    public void suppressMember() {
        _suppressMember = true;
    }
    protected void doSuppressAll() { // internal
        suppressMember();
    }
    protected void doSuppressClear() { // internal
        _suppressMember = false;
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
    public MemberSecurityDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (MemberSecurityDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public MemberSecurityDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (MemberSecurityDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public MemberSecurityDtoMapper reverseReference() {
        setReverseReference(true);
        return (MemberSecurityDtoMapper)this;
    }
}
