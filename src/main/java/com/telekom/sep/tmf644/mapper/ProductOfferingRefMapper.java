package com.telekom.sep.tmf644.mapper;

import com.telekom.sep.tmf644.repository.entity.ProductOfferingRefEntity;
import org.mapstruct.Mapper;
import org.openapitools.model.ProductOfferingRef;

import java.util.List;

@Mapper(componentModel = "cdi")
public interface ProductOfferingRefMapper {

    ProductOfferingRef map(ProductOfferingRefEntity referenceEntity);
    ProductOfferingRefEntity map(ProductOfferingRef productOfferingRef);

    List<ProductOfferingRef> map(List<ProductOfferingRefEntity> referenceEntities);
    List<ProductOfferingRefEntity> mapList(List<ProductOfferingRef> referenceEntities);

}
