package com.telekom.sep.tmf644.mapper;

import com.telekom.sep.tmf644.repository.entity.ProductOfferingRefEntity;
import org.mapstruct.Mapper;
import org.openapitools.model.ProductOfferingRef;

@Mapper(componentModel = "cdi")
public interface ProductRefMapper {
    ProductOfferingRef map(ProductOfferingRefEntity referenceEntity);

    ProductOfferingRefEntity map(ProductOfferingRef productOfferingRef);
}
