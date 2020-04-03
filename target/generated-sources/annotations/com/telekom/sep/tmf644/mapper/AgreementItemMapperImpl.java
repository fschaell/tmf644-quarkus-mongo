package com.telekom.sep.tmf644.mapper;

import com.telekom.sep.tmf644.repository.entity.AgreementItemEntity;
import com.telekom.sep.tmf644.repository.entity.AgreementTermOrConditionEntity;
import com.telekom.sep.tmf644.repository.entity.ProductRefEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import org.openapitools.model.AgreementItem;
import org.openapitools.model.AgreementTermOrCondition;
import org.openapitools.model.ProductRef;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-04-03T09:50:29+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 14 (AdoptOpenJDK)"
)
@ApplicationScoped
public class AgreementItemMapperImpl implements AgreementItemMapper {

    @Inject
    private ProductOfferingRefMapper productOfferingRefMapper;
    @Inject
    private AgreementTermOrConditionMapper agreementTermOrConditionMapper;

    @Override
    public AgreementItem map(AgreementItemEntity agreementItemEntity) {
        if ( agreementItemEntity == null ) {
            return null;
        }

        AgreementItem agreementItem = new AgreementItem();

        agreementItem.setProduct( productRefEntityListToProductRefList( agreementItemEntity.product ) );
        agreementItem.setProductOffering( productOfferingRefMapper.map( agreementItemEntity.productOffering ) );
        agreementItem.setTermOrCondition( agreementTermOrConditionEntityListToAgreementTermOrConditionList( agreementItemEntity.termOrCondition ) );
        agreementItem.setAtBaseType( agreementItemEntity.atBaseType );
        agreementItem.setAtSchemaLocation( agreementItemEntity.atSchemaLocation );
        agreementItem.setAtType( agreementItemEntity.atType );

        return agreementItem;
    }

    @Override
    public AgreementItemEntity map(AgreementItem agreementItem) {
        if ( agreementItem == null ) {
            return null;
        }

        AgreementItemEntity agreementItemEntity = new AgreementItemEntity();

        agreementItemEntity.product = productRefListToProductRefEntityList( agreementItem.getProduct() );
        agreementItemEntity.productOffering = productOfferingRefMapper.mapList( agreementItem.getProductOffering() );
        agreementItemEntity.termOrCondition = agreementTermOrConditionListToAgreementTermOrConditionEntityList( agreementItem.getTermOrCondition() );
        agreementItemEntity.atBaseType = agreementItem.getAtBaseType();
        agreementItemEntity.atSchemaLocation = agreementItem.getAtSchemaLocation();
        agreementItemEntity.atType = agreementItem.getAtType();

        return agreementItemEntity;
    }

    protected ProductRef productRefEntityToProductRef(ProductRefEntity productRefEntity) {
        if ( productRefEntity == null ) {
            return null;
        }

        ProductRef productRef = new ProductRef();

        productRef.setId( productRefEntity.id );
        productRef.setHref( productRefEntity.href );
        productRef.setName( productRefEntity.name );
        productRef.setAtBaseType( productRefEntity.atBaseType );
        productRef.setAtSchemaLocation( productRefEntity.atSchemaLocation );
        productRef.setAtType( productRefEntity.atType );
        productRef.setAtReferredType( productRefEntity.atReferredType );

        return productRef;
    }

    protected List<ProductRef> productRefEntityListToProductRefList(List<ProductRefEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<ProductRef> list1 = new ArrayList<ProductRef>( list.size() );
        for ( ProductRefEntity productRefEntity : list ) {
            list1.add( productRefEntityToProductRef( productRefEntity ) );
        }

        return list1;
    }

    protected List<AgreementTermOrCondition> agreementTermOrConditionEntityListToAgreementTermOrConditionList(List<AgreementTermOrConditionEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<AgreementTermOrCondition> list1 = new ArrayList<AgreementTermOrCondition>( list.size() );
        for ( AgreementTermOrConditionEntity agreementTermOrConditionEntity : list ) {
            list1.add( agreementTermOrConditionMapper.map( agreementTermOrConditionEntity ) );
        }

        return list1;
    }

    protected ProductRefEntity productRefToProductRefEntity(ProductRef productRef) {
        if ( productRef == null ) {
            return null;
        }

        ProductRefEntity productRefEntity = new ProductRefEntity();

        productRefEntity.id = productRef.getId();
        productRefEntity.href = productRef.getHref();
        productRefEntity.name = productRef.getName();
        productRefEntity.atBaseType = productRef.getAtBaseType();
        productRefEntity.atSchemaLocation = productRef.getAtSchemaLocation();
        productRefEntity.atType = productRef.getAtType();
        productRefEntity.atReferredType = productRef.getAtReferredType();

        return productRefEntity;
    }

    protected List<ProductRefEntity> productRefListToProductRefEntityList(List<ProductRef> list) {
        if ( list == null ) {
            return null;
        }

        List<ProductRefEntity> list1 = new ArrayList<ProductRefEntity>( list.size() );
        for ( ProductRef productRef : list ) {
            list1.add( productRefToProductRefEntity( productRef ) );
        }

        return list1;
    }

    protected List<AgreementTermOrConditionEntity> agreementTermOrConditionListToAgreementTermOrConditionEntityList(List<AgreementTermOrCondition> list) {
        if ( list == null ) {
            return null;
        }

        List<AgreementTermOrConditionEntity> list1 = new ArrayList<AgreementTermOrConditionEntity>( list.size() );
        for ( AgreementTermOrCondition agreementTermOrCondition : list ) {
            list1.add( agreementTermOrConditionMapper.map( agreementTermOrCondition ) );
        }

        return list1;
    }
}
