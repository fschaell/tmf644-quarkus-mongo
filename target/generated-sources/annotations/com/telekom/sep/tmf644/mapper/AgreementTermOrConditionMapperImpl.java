package com.telekom.sep.tmf644.mapper;

import com.telekom.sep.tmf644.repository.entity.AgreementTermOrConditionEntity;
import javax.annotation.Generated;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import org.openapitools.model.AgreementTermOrCondition;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-04-03T09:14:18+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.6 (JetBrains s.r.o)"
)
@ApplicationScoped
public class AgreementTermOrConditionMapperImpl implements AgreementTermOrConditionMapper {

    @Inject
    private TimePeriodMapper timePeriodMapper;

    @Override
    public AgreementTermOrCondition map(AgreementTermOrConditionEntity agreementTermOrConditionEntity) {
        if ( agreementTermOrConditionEntity == null ) {
            return null;
        }

        AgreementTermOrCondition agreementTermOrCondition = new AgreementTermOrCondition();

        agreementTermOrCondition.setId( agreementTermOrConditionEntity.id );
        agreementTermOrCondition.setDescription( agreementTermOrConditionEntity.description );
        agreementTermOrCondition.setValidFor( timePeriodMapper.map( agreementTermOrConditionEntity.validFor ) );
        agreementTermOrCondition.setAtBaseType( agreementTermOrConditionEntity.atBaseType );
        agreementTermOrCondition.setAtSchemaLocation( agreementTermOrConditionEntity.atSchemaLocation );
        agreementTermOrCondition.setAtType( agreementTermOrConditionEntity.atType );

        return agreementTermOrCondition;
    }

    @Override
    public AgreementTermOrConditionEntity map(AgreementTermOrCondition agreementTermOrCondition) {
        if ( agreementTermOrCondition == null ) {
            return null;
        }

        AgreementTermOrConditionEntity agreementTermOrConditionEntity = new AgreementTermOrConditionEntity();

        agreementTermOrConditionEntity.id = agreementTermOrCondition.getId();
        agreementTermOrConditionEntity.description = agreementTermOrCondition.getDescription();
        agreementTermOrConditionEntity.validFor = timePeriodMapper.map( agreementTermOrCondition.getValidFor() );
        agreementTermOrConditionEntity.atBaseType = agreementTermOrCondition.getAtBaseType();
        agreementTermOrConditionEntity.atSchemaLocation = agreementTermOrCondition.getAtSchemaLocation();
        agreementTermOrConditionEntity.atType = agreementTermOrCondition.getAtType();

        return agreementTermOrConditionEntity;
    }
}
