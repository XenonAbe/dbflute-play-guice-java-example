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
 * The DTO mapper of SUMMARY_PRODUCT as VIEW. <br />
 * <pre>
 * [primary-key]
 *     PRODUCT_ID
 * 
 * [column]
 *     PRODUCT_ID, PRODUCT_NAME, PRODUCT_HANDLE_CODE, PRODUCT_STATUS_CODE, LATEST_PURCHASE_DATETIME
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
 *     PRODUCT_STATUS
 * 
 * [referrer-table]
 *     PURCHASE
 * 
 * [foreign-property]
 *     productStatus
 * 
 * [referrer-property]
 *     purchaseList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSummaryProductDtoMapper implements DtoMapper<SummaryProduct, SummaryProductDto>, Serializable {

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
    protected boolean _suppressProductStatus;
    protected boolean _suppressPurchaseList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSummaryProductDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsSummaryProductDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public SummaryProductDto mappingToDto(SummaryProduct entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (SummaryProductDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        SummaryProductDto dto = new SummaryProductDto();
        dto.setProductId(entity.getProductId());
        dto.setProductName(entity.getProductName());
        dto.setProductHandleCode(entity.getProductHandleCode());
        dto.setProductStatusCode(entity.getProductStatusCode());
        dto.setLatestPurchaseDatetime(entity.getLatestPurchaseDatetime());
        reflectDerivedProperty(entity, dto, true);
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only a DTO that has a primary key value
            _relationDtoMap.put(localKey, dto);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressProductStatus && entity.getProductStatus().isPresent()) {
            ProductStatus relationEntity = entity.getProductStatus().get();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                ProductStatusDto relationDto = (ProductStatusDto)cachedDto;
                dto.setProductStatus(relationDto);
                if (reverseReference) {
                    relationDto.getSummaryProductList().add(dto);
                }
            } else {
                ProductStatusDtoMapper mapper = new ProductStatusDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressSummaryProductList();
                ProductStatusDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setProductStatus(relationDto);
                if (reverseReference) {
                    relationDto.getSummaryProductList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getProductStatus());
                }
            }
        };
        if (!_suppressPurchaseList && !entity.getPurchaseList().isEmpty()) {
            PurchaseDtoMapper mapper = new PurchaseDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressSummaryProduct();
            List<PurchaseDto> relationDtoList = mapper.mappingToDtoList(entity.getPurchaseList());
            dto.setPurchaseList(relationDtoList);
            if (reverseReference) {
                for (PurchaseDto relationDto : relationDtoList) {
                    relationDto.setSummaryProduct(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<SummaryProductDto> mappingToDtoList(List<SummaryProduct> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<SummaryProductDto> dtoList = new ArrayList<SummaryProductDto>();
        for (SummaryProduct entity : entityList) {
            SummaryProductDto dto = mappingToDto(entity);
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
    public SummaryProduct mappingToEntity(SummaryProductDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (SummaryProduct)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        SummaryProduct entity = new SummaryProduct();
        if (needsMapping(dto, dto.getProductId(), "productId")) {
            entity.setProductId(dto.getProductId());
        }
        if (needsMapping(dto, dto.getProductName(), "productName")) {
            entity.setProductName(dto.getProductName());
        }
        if (needsMapping(dto, dto.getProductHandleCode(), "productHandleCode")) {
            entity.setProductHandleCode(dto.getProductHandleCode());
        }
        if (needsMapping(dto, dto.getProductStatusCode(), "productStatusCode")) {
            entity.setProductStatusCodeAsProductStatus(CDef.ProductStatus.codeOf(dto.getProductStatusCode()));
        }
        if (needsMapping(dto, dto.getLatestPurchaseDatetime(), "latestPurchaseDatetime")) {
            entity.setLatestPurchaseDatetime(dto.getLatestPurchaseDatetime());
        }
        reflectDerivedProperty(entity, dto, false);
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only an entity that has a primary key value
            _relationEntityMap.put(localKey, entity);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressProductStatus && dto.getProductStatus() != null) {
            ProductStatusDto relationDto = dto.getProductStatus();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                ProductStatus relationEntity = (ProductStatus)cachedEntity;
                entity.setProductStatus(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.getSummaryProductList().add(entity);
                }
            } else {
                ProductStatusDtoMapper mapper = new ProductStatusDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressSummaryProductList();
                ProductStatus relationEntity = mapper.mappingToEntity(relationDto);
                entity.setProductStatus(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.getSummaryProductList().add(entity);
                }
                if (instanceCache && entity.getProductStatus().get().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getProductStatus().get());
                }
            }
        };
        if (!_suppressPurchaseList && !dto.getPurchaseList().isEmpty()) {
            PurchaseDtoMapper mapper = new PurchaseDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressSummaryProduct();
            List<Purchase> relationEntityList = mapper.mappingToEntityList(dto.getPurchaseList());
            entity.setPurchaseList(relationEntityList);
            if (reverseReference) {
                for (Purchase relationEntity : relationEntityList) {
                    relationEntity.setSummaryProduct(OptionalEntity.of(entity));
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
    protected boolean needsMapping(SummaryProductDto dto, Object value, String propName) {
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
    public List<SummaryProduct> mappingToEntityList(List<SummaryProductDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<SummaryProduct> entityList = new ArrayList<SummaryProduct>();
        for (SummaryProductDto dto : dtoList) {
            SummaryProduct entity = mappingToEntity(dto);
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
    public void suppressProductStatus() {
        _suppressProductStatus = true;
    }
    public void suppressPurchaseList() {
        _suppressPurchaseList = true;
    }
    protected void doSuppressAll() { // internal
        suppressProductStatus();
        suppressPurchaseList();
    }
    protected void doSuppressClear() { // internal
        _suppressProductStatus = false;
        _suppressPurchaseList = false;
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
    public SummaryProductDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (SummaryProductDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public SummaryProductDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (SummaryProductDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public SummaryProductDtoMapper reverseReference() {
        setReverseReference(true);
        return (SummaryProductDtoMapper)this;
    }
}
