package com.telekom.sep.tmf644.mapper;

import com.telekom.sep.tmf644.repository.entity.ReferenceEntity;
import javax.annotation.Generated;
import javax.enterprise.context.ApplicationScoped;
import org.openapitools.model.ProductOfferingRef;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-04-03T09:14:18+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.6 (JetBrains s.r.o)"
)
@ApplicationScoped
public class ProductOfferingRefMapperImpl implements ProductOfferingRefMapper {

    @Override
    public ProductOfferingRef map(ReferenceEntity referenceEntity) {
        if ( referenceEntity == null ) {
            return null;
        }

        ProductOfferingRef productOfferingRef = new ProductOfferingRef();

        productOfferingRef.setId( referenceEntity.id );
        productOfferingRef.setHref( referenceEntity.href );
        productOfferingRef.setName( referenceEntity.name );
        productOfferingRef.setAtBaseType( referenceEntity.atBaseType );
        productOfferingRef.setAtSchemaLocation( referenceEntity.atSchemaLocation );
        productOfferingRef.setAtType( referenceEntity.atType );
        productOfferingRef.setAtReferredType( referenceEntity.atReferredType );

        return productOfferingRef;
    }

    @Override
    public ReferenceEntity map(ProductOfferingRef productOfferingRef) {
        if ( productOfferingRef == null ) {
            return null;
        }

        ReferenceEntity referenceEntity = new ReferenceEntity();

        referenceEntity.id = productOfferingRef.getId();
        referenceEntity.href = productOfferingRef.getHref();
        referenceEntity.name = productOfferingRef.getName();
        referenceEntity.atBaseType = productOfferingRef.getAtBaseType();
        referenceEntity.atSchemaLocation = productOfferingRef.getAtSchemaLocation();
        referenceEntity.atType = productOfferingRef.getAtType();
        referenceEntity.atReferredType = productOfferingRef.getAtReferredType();

        return referenceEntity;
    }
}
