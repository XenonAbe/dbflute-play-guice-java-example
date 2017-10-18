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
 * The DTO mapper of (商品カテゴリ)PRODUCT_CATEGORY as TABLE. <br />
 * <pre>
 * [primary-key]
 *     PRODUCT_CATEGORY_CODE
 * 
 * [column]
 *     PRODUCT_CATEGORY_CODE, PRODUCT_CATEGORY_NAME, PARENT_CATEGORY_CODE
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
 *     PRODUCT_CATEGORY
 * 
 * [referrer-table]
 *     PRODUCT, PRODUCT_CATEGORY
 * 
 * [foreign-property]
 *     productCategorySelf
 * 
 * [referrer-property]
 *     productList, productCategorySelfList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsProductCategoryDtoMapper implements DtoMapper<ProductCategory, ProductCategoryDto>, Serializable {

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
    protected boolean _suppressProductCategorySelf;
    protected boolean _suppressProductList;
    protected boolean _suppressProductCategorySelfList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsProductCategoryDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsProductCategoryDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public ProductCategoryDto mappingToDto(ProductCategory entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (ProductCategoryDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        ProductCategoryDto dto = new ProductCategoryDto();
        dto.setProductCategoryCode(entity.getProductCategoryCode());
        dto.setProductCategoryName(entity.getProductCategoryName());
        dto.setParentCategoryCode(entity.getParentCategoryCode());
        reflectDerivedProperty(entity, dto, true);
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only a DTO that has a primary key value
            _relationDtoMap.put(localKey, dto);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressProductCategorySelf && entity.getProductCategorySelf().isPresent()) {
            ProductCategory relationEntity = entity.getProductCategorySelf().get();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                ProductCategoryDto relationDto = (ProductCategoryDto)cachedDto;
                dto.setProductCategorySelf(relationDto);
                if (reverseReference) {
                    relationDto.getProductCategorySelfList().add(dto);
                }
            } else {
                ProductCategoryDtoMapper mapper = new ProductCategoryDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressProductCategorySelfList();
                ProductCategoryDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setProductCategorySelf(relationDto);
                if (reverseReference) {
                    relationDto.getProductCategorySelfList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getProductCategorySelf());
                }
            }
        };
        if (!_suppressProductList && !entity.getProductList().isEmpty()) {
            ProductDtoMapper mapper = new ProductDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressProductCategory();
            List<ProductDto> relationDtoList = mapper.mappingToDtoList(entity.getProductList());
            dto.setProductList(relationDtoList);
            if (reverseReference) {
                for (ProductDto relationDto : relationDtoList) {
                    relationDto.setProductCategory(dto);
                }
            }
        };
        if (!_suppressProductCategorySelfList && !entity.getProductCategorySelfList().isEmpty()) {
            ProductCategoryDtoMapper mapper = new ProductCategoryDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressProductCategorySelf();
            List<ProductCategoryDto> relationDtoList = mapper.mappingToDtoList(entity.getProductCategorySelfList());
            dto.setProductCategorySelfList(relationDtoList);
            if (reverseReference) {
                for (ProductCategoryDto relationDto : relationDtoList) {
                    relationDto.setProductCategorySelf(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<ProductCategoryDto> mappingToDtoList(List<ProductCategory> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<ProductCategoryDto> dtoList = new ArrayList<ProductCategoryDto>();
        for (ProductCategory entity : entityList) {
            ProductCategoryDto dto = mappingToDto(entity);
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
    public ProductCategory mappingToEntity(ProductCategoryDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (ProductCategory)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        ProductCategory entity = new ProductCategory();
        if (needsMapping(dto, dto.getProductCategoryCode(), "productCategoryCode")) {
            entity.setProductCategoryCode(dto.getProductCategoryCode());
        }
        if (needsMapping(dto, dto.getProductCategoryName(), "productCategoryName")) {
            entity.setProductCategoryName(dto.getProductCategoryName());
        }
        if (needsMapping(dto, dto.getParentCategoryCode(), "parentCategoryCode")) {
            entity.setParentCategoryCode(dto.getParentCategoryCode());
        }
        reflectDerivedProperty(entity, dto, false);
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only an entity that has a primary key value
            _relationEntityMap.put(localKey, entity);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressProductCategorySelf && dto.getProductCategorySelf() != null) {
            ProductCategoryDto relationDto = dto.getProductCategorySelf();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                ProductCategory relationEntity = (ProductCategory)cachedEntity;
                entity.setProductCategorySelf(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.getProductCategorySelfList().add(entity);
                }
            } else {
                ProductCategoryDtoMapper mapper = new ProductCategoryDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressProductCategorySelfList();
                ProductCategory relationEntity = mapper.mappingToEntity(relationDto);
                entity.setProductCategorySelf(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.getProductCategorySelfList().add(entity);
                }
                if (instanceCache && entity.getProductCategorySelf().get().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getProductCategorySelf().get());
                }
            }
        };
        if (!_suppressProductList && !dto.getProductList().isEmpty()) {
            ProductDtoMapper mapper = new ProductDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressProductCategory();
            List<Product> relationEntityList = mapper.mappingToEntityList(dto.getProductList());
            entity.setProductList(relationEntityList);
            if (reverseReference) {
                for (Product relationEntity : relationEntityList) {
                    relationEntity.setProductCategory(OptionalEntity.of(entity));
                }
            }
        };
        if (!_suppressProductCategorySelfList && !dto.getProductCategorySelfList().isEmpty()) {
            ProductCategoryDtoMapper mapper = new ProductCategoryDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressProductCategorySelf();
            List<ProductCategory> relationEntityList = mapper.mappingToEntityList(dto.getProductCategorySelfList());
            entity.setProductCategorySelfList(relationEntityList);
            if (reverseReference) {
                for (ProductCategory relationEntity : relationEntityList) {
                    relationEntity.setProductCategorySelf(OptionalEntity.of(entity));
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
    protected boolean needsMapping(ProductCategoryDto dto, Object value, String propName) {
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
    public List<ProductCategory> mappingToEntityList(List<ProductCategoryDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<ProductCategory> entityList = new ArrayList<ProductCategory>();
        for (ProductCategoryDto dto : dtoList) {
            ProductCategory entity = mappingToEntity(dto);
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
    public void suppressProductCategorySelf() {
        _suppressProductCategorySelf = true;
    }
    public void suppressProductList() {
        _suppressProductList = true;
    }
    public void suppressProductCategorySelfList() {
        _suppressProductCategorySelfList = true;
    }
    protected void doSuppressAll() { // internal
        suppressProductCategorySelf();
        suppressProductList();
        suppressProductCategorySelfList();
    }
    protected void doSuppressClear() { // internal
        _suppressProductCategorySelf = false;
        _suppressProductList = false;
        _suppressProductCategorySelfList = false;
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
    public ProductCategoryDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (ProductCategoryDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public ProductCategoryDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (ProductCategoryDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public ProductCategoryDtoMapper reverseReference() {
        setReverseReference(true);
        return (ProductCategoryDtoMapper)this;
    }
}
