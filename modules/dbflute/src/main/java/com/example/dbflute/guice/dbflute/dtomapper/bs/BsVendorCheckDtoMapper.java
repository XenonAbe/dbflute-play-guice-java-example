package com.example.dbflute.guice.dbflute.dtomapper.bs;

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
import com.example.dbflute.guice.dbflute.exentity.*;
import com.example.dbflute.guice.simpleflute.dto.*;
import com.example.dbflute.guice.dbflute.dtomapper.*;

/**
 * The DTO mapper of VENDOR_CHECK as TABLE. <br />
 * <pre>
 * [primary-key]
 *     VENDOR_CHECK_ID
 * 
 * [column]
 *     VENDOR_CHECK_ID, TYPE_OF_CHAR, TYPE_OF_VARCHAR, TYPE_OF_CLOB, TYPE_OF_TEXT, TYPE_OF_NUMERIC_INTEGER, TYPE_OF_NUMERIC_BIGINT, TYPE_OF_NUMERIC_DECIMAL, TYPE_OF_NUMERIC_INTEGER_MIN, TYPE_OF_NUMERIC_INTEGER_MAX, TYPE_OF_NUMERIC_BIGINT_MIN, TYPE_OF_NUMERIC_BIGINT_MAX, TYPE_OF_NUMERIC_SUPERINT_MIN, TYPE_OF_NUMERIC_SUPERINT_MAX, TYPE_OF_NUMERIC_MAXDECIMAL, TYPE_OF_INTEGER, TYPE_OF_BIGINT, TYPE_OF_DATE, TYPE_OF_TIMESTAMP, TYPE_OF_TIME, TYPE_OF_BOOLEAN, TYPE_OF_BINARY, TYPE_OF_BLOB, TYPE_OF_UUID, TYPE_OF_ARRAY, TYPE_OF_OTHER, J_A_V_A_BEANS_PROPERTY, J_POP_BEANS_PROPERTY
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
public abstract class BsVendorCheckDtoMapper implements DtoMapper<VendorCheck, VendorCheckDto>, Serializable {

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
    public BsVendorCheckDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsVendorCheckDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public VendorCheckDto mappingToDto(VendorCheck entity) {
        if (entity == null) {
            return null;
        }
        VendorCheckDto dto = new VendorCheckDto();
        dto.setVendorCheckId(entity.getVendorCheckId());
        dto.setTypeOfChar(entity.getTypeOfChar());
        dto.setTypeOfVarchar(entity.getTypeOfVarchar());
        dto.setTypeOfClob(entity.getTypeOfClob());
        dto.setTypeOfText(entity.getTypeOfText());
        dto.setTypeOfNumericInteger(entity.getTypeOfNumericInteger());
        dto.setTypeOfNumericBigint(entity.getTypeOfNumericBigint());
        dto.setTypeOfNumericDecimal(entity.getTypeOfNumericDecimal());
        dto.setTypeOfNumericIntegerMin(entity.getTypeOfNumericIntegerMin());
        dto.setTypeOfNumericIntegerMax(entity.getTypeOfNumericIntegerMax());
        dto.setTypeOfNumericBigintMin(entity.getTypeOfNumericBigintMin());
        dto.setTypeOfNumericBigintMax(entity.getTypeOfNumericBigintMax());
        dto.setTypeOfNumericSuperintMin(entity.getTypeOfNumericSuperintMin());
        dto.setTypeOfNumericSuperintMax(entity.getTypeOfNumericSuperintMax());
        dto.setTypeOfNumericMaxdecimal(entity.getTypeOfNumericMaxdecimal());
        dto.setTypeOfInteger(entity.getTypeOfInteger());
        dto.setTypeOfBigint(entity.getTypeOfBigint());
        dto.setTypeOfDate(entity.getTypeOfDate());
        dto.setTypeOfTimestamp(entity.getTypeOfTimestamp());
        dto.setTypeOfTime(entity.getTypeOfTime());
        dto.setTypeOfBoolean(entity.getTypeOfBoolean());
        dto.setTypeOfBinary(entity.getTypeOfBinary());
        dto.setTypeOfBlob(entity.getTypeOfBlob());
        dto.setTypeOfUuid(entity.getTypeOfUuid());
        dto.setTypeOfArray(entity.getTypeOfArray());
        dto.setTypeOfOther(entity.getTypeOfOther());
        dto.setJAVABeansProperty(entity.getJAVABeansProperty());
        dto.setJPopBeansProperty(entity.getJPopBeansProperty());
        reflectDerivedProperty(entity, dto, true);
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<VendorCheckDto> mappingToDtoList(List<VendorCheck> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<VendorCheckDto> dtoList = new ArrayList<VendorCheckDto>();
        for (VendorCheck entity : entityList) {
            VendorCheckDto dto = mappingToDto(entity);
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
    public VendorCheck mappingToEntity(VendorCheckDto dto) {
        if (dto == null) {
            return null;
        }
        VendorCheck entity = new VendorCheck();
        if (needsMapping(dto, dto.getVendorCheckId(), "vendorCheckId")) {
            entity.setVendorCheckId(dto.getVendorCheckId());
        }
        if (needsMapping(dto, dto.getTypeOfChar(), "typeOfChar")) {
            entity.setTypeOfChar(dto.getTypeOfChar());
        }
        if (needsMapping(dto, dto.getTypeOfVarchar(), "typeOfVarchar")) {
            entity.setTypeOfVarchar(dto.getTypeOfVarchar());
        }
        if (needsMapping(dto, dto.getTypeOfClob(), "typeOfClob")) {
            entity.setTypeOfClob(dto.getTypeOfClob());
        }
        if (needsMapping(dto, dto.getTypeOfText(), "typeOfText")) {
            entity.setTypeOfText(dto.getTypeOfText());
        }
        if (needsMapping(dto, dto.getTypeOfNumericInteger(), "typeOfNumericInteger")) {
            entity.setTypeOfNumericInteger(dto.getTypeOfNumericInteger());
        }
        if (needsMapping(dto, dto.getTypeOfNumericBigint(), "typeOfNumericBigint")) {
            entity.setTypeOfNumericBigint(dto.getTypeOfNumericBigint());
        }
        if (needsMapping(dto, dto.getTypeOfNumericDecimal(), "typeOfNumericDecimal")) {
            entity.setTypeOfNumericDecimal(dto.getTypeOfNumericDecimal());
        }
        if (needsMapping(dto, dto.getTypeOfNumericIntegerMin(), "typeOfNumericIntegerMin")) {
            entity.setTypeOfNumericIntegerMin(dto.getTypeOfNumericIntegerMin());
        }
        if (needsMapping(dto, dto.getTypeOfNumericIntegerMax(), "typeOfNumericIntegerMax")) {
            entity.setTypeOfNumericIntegerMax(dto.getTypeOfNumericIntegerMax());
        }
        if (needsMapping(dto, dto.getTypeOfNumericBigintMin(), "typeOfNumericBigintMin")) {
            entity.setTypeOfNumericBigintMin(dto.getTypeOfNumericBigintMin());
        }
        if (needsMapping(dto, dto.getTypeOfNumericBigintMax(), "typeOfNumericBigintMax")) {
            entity.setTypeOfNumericBigintMax(dto.getTypeOfNumericBigintMax());
        }
        if (needsMapping(dto, dto.getTypeOfNumericSuperintMin(), "typeOfNumericSuperintMin")) {
            entity.setTypeOfNumericSuperintMin(dto.getTypeOfNumericSuperintMin());
        }
        if (needsMapping(dto, dto.getTypeOfNumericSuperintMax(), "typeOfNumericSuperintMax")) {
            entity.setTypeOfNumericSuperintMax(dto.getTypeOfNumericSuperintMax());
        }
        if (needsMapping(dto, dto.getTypeOfNumericMaxdecimal(), "typeOfNumericMaxdecimal")) {
            entity.setTypeOfNumericMaxdecimal(dto.getTypeOfNumericMaxdecimal());
        }
        if (needsMapping(dto, dto.getTypeOfInteger(), "typeOfInteger")) {
            entity.setTypeOfInteger(dto.getTypeOfInteger());
        }
        if (needsMapping(dto, dto.getTypeOfBigint(), "typeOfBigint")) {
            entity.setTypeOfBigint(dto.getTypeOfBigint());
        }
        if (needsMapping(dto, dto.getTypeOfDate(), "typeOfDate")) {
            entity.setTypeOfDate(dto.getTypeOfDate());
        }
        if (needsMapping(dto, dto.getTypeOfTimestamp(), "typeOfTimestamp")) {
            entity.setTypeOfTimestamp(dto.getTypeOfTimestamp());
        }
        if (needsMapping(dto, dto.getTypeOfTime(), "typeOfTime")) {
            entity.setTypeOfTime(dto.getTypeOfTime());
        }
        if (needsMapping(dto, dto.getTypeOfBoolean(), "typeOfBoolean")) {
            entity.setTypeOfBoolean(dto.getTypeOfBoolean());
        }
        if (needsMapping(dto, dto.getTypeOfBinary(), "typeOfBinary")) {
            entity.setTypeOfBinary(dto.getTypeOfBinary());
        }
        if (needsMapping(dto, dto.getTypeOfBlob(), "typeOfBlob")) {
            entity.setTypeOfBlob(dto.getTypeOfBlob());
        }
        if (needsMapping(dto, dto.getTypeOfUuid(), "typeOfUuid")) {
            entity.setTypeOfUuid(dto.getTypeOfUuid());
        }
        if (needsMapping(dto, dto.getTypeOfArray(), "typeOfArray")) {
            entity.setTypeOfArray(dto.getTypeOfArray());
        }
        if (needsMapping(dto, dto.getTypeOfOther(), "typeOfOther")) {
            entity.setTypeOfOther(dto.getTypeOfOther());
        }
        if (needsMapping(dto, dto.getJAVABeansProperty(), "JAVABeansProperty")) {
            entity.setJAVABeansProperty(dto.getJAVABeansProperty());
        }
        if (needsMapping(dto, dto.getJPopBeansProperty(), "JPopBeansProperty")) {
            entity.setJPopBeansProperty(dto.getJPopBeansProperty());
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
    protected boolean needsMapping(VendorCheckDto dto, Object value, String propName) {
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
    public List<VendorCheck> mappingToEntityList(List<VendorCheckDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<VendorCheck> entityList = new ArrayList<VendorCheck>();
        for (VendorCheckDto dto : dtoList) {
            VendorCheck entity = mappingToEntity(dto);
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
    public VendorCheckDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (VendorCheckDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public VendorCheckDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (VendorCheckDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public VendorCheckDtoMapper reverseReference() {
        setReverseReference(true);
        return (VendorCheckDtoMapper)this;
    }
}
