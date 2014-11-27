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
 * The DTO mapper of (商品ステータス)PRODUCT_STATUS as TABLE. <br />
 * <pre>
 * [primary-key]
 *     PRODUCT_STATUS_CODE
 * 
 * [column]
 *     PRODUCT_STATUS_CODE, PRODUCT_STATUS_NAME, DISPLAY_ORDER
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
 *     PRODUCT, SUMMARY_PRODUCT
 * 
 * [foreign-property]
 *     
 * 
 * [referrer-property]
 *     productList, summaryProductList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsProductStatusDtoMapper implements DtoMapper<ProductStatus, ProductStatusDto>, Serializable {

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
    protected boolean _suppressProductList;
    protected boolean _suppressSummaryProductList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsProductStatusDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsProductStatusDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public ProductStatusDto mappingToDto(ProductStatus entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (ProductStatusDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        ProductStatusDto dto = new ProductStatusDto();
        dto.setProductStatusCode(entity.getProductStatusCode());
        dto.setProductStatusName(entity.getProductStatusName());
        dto.setDisplayOrder(entity.getDisplayOrder());
        reflectDerivedProperty(entity, dto, true);
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only a DTO that has a primary key value
            _relationDtoMap.put(localKey, dto);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressProductList && !entity.getProductList().isEmpty()) {
            ProductDtoMapper mapper = new ProductDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressProductStatus();
            List<ProductDto> relationDtoList = mapper.mappingToDtoList(entity.getProductList());
            dto.setProductList(relationDtoList);
            if (reverseReference) {
                for (ProductDto relationDto : relationDtoList) {
                    relationDto.setProductStatus(dto);
                }
            }
        };
        if (!_suppressSummaryProductList && !entity.getSummaryProductList().isEmpty()) {
            SummaryProductDtoMapper mapper = new SummaryProductDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressProductStatus();
            List<SummaryProductDto> relationDtoList = mapper.mappingToDtoList(entity.getSummaryProductList());
            dto.setSummaryProductList(relationDtoList);
            if (reverseReference) {
                for (SummaryProductDto relationDto : relationDtoList) {
                    relationDto.setProductStatus(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<ProductStatusDto> mappingToDtoList(List<ProductStatus> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<ProductStatusDto> dtoList = new ArrayList<ProductStatusDto>();
        for (ProductStatus entity : entityList) {
            ProductStatusDto dto = mappingToDto(entity);
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
    public ProductStatus mappingToEntity(ProductStatusDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (ProductStatus)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        ProductStatus entity = new ProductStatus();
        if (needsMapping(dto, dto.getProductStatusCode(), "productStatusCode")) {
            entity.setProductStatusCodeAsProductStatus(CDef.ProductStatus.codeOf(dto.getProductStatusCode()));
        }
        if (needsMapping(dto, dto.getProductStatusName(), "productStatusName")) {
            entity.setProductStatusName(dto.getProductStatusName());
        }
        if (needsMapping(dto, dto.getDisplayOrder(), "displayOrder")) {
            entity.setDisplayOrder(dto.getDisplayOrder());
        }
        reflectDerivedProperty(entity, dto, false);
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only an entity that has a primary key value
            _relationEntityMap.put(localKey, entity);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressProductList && !dto.getProductList().isEmpty()) {
            ProductDtoMapper mapper = new ProductDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressProductStatus();
            List<Product> relationEntityList = mapper.mappingToEntityList(dto.getProductList());
            entity.setProductList(relationEntityList);
            if (reverseReference) {
                for (Product relationEntity : relationEntityList) {
                    relationEntity.setProductStatus(OptionalEntity.of(entity));
                }
            }
        };
        if (!_suppressSummaryProductList && !dto.getSummaryProductList().isEmpty()) {
            SummaryProductDtoMapper mapper = new SummaryProductDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressProductStatus();
            List<SummaryProduct> relationEntityList = mapper.mappingToEntityList(dto.getSummaryProductList());
            entity.setSummaryProductList(relationEntityList);
            if (reverseReference) {
                for (SummaryProduct relationEntity : relationEntityList) {
                    relationEntity.setProductStatus(OptionalEntity.of(entity));
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
    protected boolean needsMapping(ProductStatusDto dto, Object value, String propName) {
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
    public List<ProductStatus> mappingToEntityList(List<ProductStatusDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<ProductStatus> entityList = new ArrayList<ProductStatus>();
        for (ProductStatusDto dto : dtoList) {
            ProductStatus entity = mappingToEntity(dto);
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
    public void suppressProductList() {
        _suppressProductList = true;
    }
    public void suppressSummaryProductList() {
        _suppressSummaryProductList = true;
    }
    protected void doSuppressAll() { // internal
        suppressProductList();
        suppressSummaryProductList();
    }
    protected void doSuppressClear() { // internal
        _suppressProductList = false;
        _suppressSummaryProductList = false;
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
    public ProductStatusDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (ProductStatusDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public ProductStatusDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (ProductStatusDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public ProductStatusDtoMapper reverseReference() {
        setReverseReference(true);
        return (ProductStatusDtoMapper)this;
    }
}
