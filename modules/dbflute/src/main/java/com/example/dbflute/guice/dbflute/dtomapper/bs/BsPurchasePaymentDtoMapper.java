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
 * The DTO mapper of (購入支払)PURCHASE_PAYMENT as TABLE. <br />
 * <pre>
 * [primary-key]
 *     PURCHASE_PAYMENT_ID
 * 
 * [column]
 *     PURCHASE_PAYMENT_ID, PURCHASE_ID, PAYMENT_AMOUNT, PAYMENT_DATETIME, PAYMENT_METHOD_CODE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     PURCHASE_PAYMENT_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign-table]
 *     PURCHASE
 * 
 * [referrer-table]
 *     
 * 
 * [foreign-property]
 *     purchase
 * 
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsPurchasePaymentDtoMapper implements DtoMapper<PurchasePayment, PurchasePaymentDto>, Serializable {

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
    protected boolean _suppressPurchase;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsPurchasePaymentDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsPurchasePaymentDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public PurchasePaymentDto mappingToDto(PurchasePayment entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (PurchasePaymentDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        PurchasePaymentDto dto = new PurchasePaymentDto();
        dto.setPurchasePaymentId(entity.getPurchasePaymentId());
        dto.setPurchaseId(entity.getPurchaseId());
        dto.setPaymentAmount(entity.getPaymentAmount());
        dto.setPaymentDatetime(entity.getPaymentDatetime());
        dto.setPaymentMethodCode(entity.getPaymentMethodCode());
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
        reflectDerivedProperty(entity, dto, true);
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only a DTO that has a primary key value
            _relationDtoMap.put(localKey, dto);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressPurchase && entity.getPurchase().isPresent()) {
            Purchase relationEntity = entity.getPurchase().get();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                PurchaseDto relationDto = (PurchaseDto)cachedDto;
                dto.setPurchase(relationDto);
                if (reverseReference) {
                    relationDto.getPurchasePaymentList().add(dto);
                }
            } else {
                PurchaseDtoMapper mapper = new PurchaseDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressPurchasePaymentList();
                PurchaseDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setPurchase(relationDto);
                if (reverseReference) {
                    relationDto.getPurchasePaymentList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getPurchase());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<PurchasePaymentDto> mappingToDtoList(List<PurchasePayment> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<PurchasePaymentDto> dtoList = new ArrayList<PurchasePaymentDto>();
        for (PurchasePayment entity : entityList) {
            PurchasePaymentDto dto = mappingToDto(entity);
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
    public PurchasePayment mappingToEntity(PurchasePaymentDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (PurchasePayment)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        PurchasePayment entity = new PurchasePayment();
        if (needsMapping(dto, dto.getPurchasePaymentId(), "purchasePaymentId")) {
            entity.setPurchasePaymentId(dto.getPurchasePaymentId());
        }
        if (needsMapping(dto, dto.getPurchaseId(), "purchaseId")) {
            entity.setPurchaseId(dto.getPurchaseId());
        }
        if (needsMapping(dto, dto.getPaymentAmount(), "paymentAmount")) {
            entity.setPaymentAmount(dto.getPaymentAmount());
        }
        if (needsMapping(dto, dto.getPaymentDatetime(), "paymentDatetime")) {
            entity.setPaymentDatetime(dto.getPaymentDatetime());
        }
        if (needsMapping(dto, dto.getPaymentMethodCode(), "paymentMethodCode")) {
            entity.setPaymentMethodCodeAsPaymentMethod(CDef.PaymentMethod.codeOf(dto.getPaymentMethodCode()));
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
        reflectDerivedProperty(entity, dto, false);
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only an entity that has a primary key value
            _relationEntityMap.put(localKey, entity);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressPurchase && dto.getPurchase() != null) {
            PurchaseDto relationDto = dto.getPurchase();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                Purchase relationEntity = (Purchase)cachedEntity;
                entity.setPurchase(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.getPurchasePaymentList().add(entity);
                }
            } else {
                PurchaseDtoMapper mapper = new PurchaseDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressPurchasePaymentList();
                Purchase relationEntity = mapper.mappingToEntity(relationDto);
                entity.setPurchase(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.getPurchasePaymentList().add(entity);
                }
                if (instanceCache && entity.getPurchase().get().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getPurchase().get());
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
    protected boolean needsMapping(PurchasePaymentDto dto, Object value, String propName) {
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
    public List<PurchasePayment> mappingToEntityList(List<PurchasePaymentDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<PurchasePayment> entityList = new ArrayList<PurchasePayment>();
        for (PurchasePaymentDto dto : dtoList) {
            PurchasePayment entity = mappingToEntity(dto);
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
    public void suppressPurchase() {
        _suppressPurchase = true;
    }
    protected void doSuppressAll() { // internal
        suppressPurchase();
    }
    protected void doSuppressClear() { // internal
        _suppressPurchase = false;
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
    public PurchasePaymentDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (PurchasePaymentDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public PurchasePaymentDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (PurchasePaymentDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public PurchasePaymentDtoMapper reverseReference() {
        setReverseReference(true);
        return (PurchasePaymentDtoMapper)this;
    }
}
