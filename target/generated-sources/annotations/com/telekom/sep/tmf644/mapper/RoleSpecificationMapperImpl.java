package com.telekom.sep.tmf644.mapper;

import com.telekom.sep.tmf644.repository.entity.RoleSpecificationEntity;
import javax.annotation.Generated;
import javax.enterprise.context.ApplicationScoped;
import org.openapitools.model.RoleSpecification;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-04-03T09:14:18+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.6 (JetBrains s.r.o)"
)
@ApplicationScoped
public class RoleSpecificationMapperImpl implements RoleSpecificationMapper {

    @Override
    public RoleSpecification map(RoleSpecificationEntity roleSpecificationEntity) {
        if ( roleSpecificationEntity == null ) {
            return null;
        }

        RoleSpecification roleSpecification = new RoleSpecification();

        roleSpecification.setDescription( roleSpecificationEntity.description );
        roleSpecification.setName( roleSpecificationEntity.name );
        roleSpecification.setAtBaseType( roleSpecificationEntity.atBaseType );
        roleSpecification.setAtSchemaLocation( roleSpecificationEntity.atSchemaLocation );
        roleSpecification.setAtType( roleSpecificationEntity.atType );

        return roleSpecification;
    }

    @Override
    public RoleSpecificationEntity map(RoleSpecification roleSpecification) {
        if ( roleSpecification == null ) {
            return null;
        }

        RoleSpecificationEntity roleSpecificationEntity = new RoleSpecificationEntity();

        roleSpecificationEntity.description = roleSpecification.getDescription();
        roleSpecificationEntity.name = roleSpecification.getName();
        roleSpecificationEntity.atBaseType = roleSpecification.getAtBaseType();
        roleSpecificationEntity.atSchemaLocation = roleSpecification.getAtSchemaLocation();
        roleSpecificationEntity.atType = roleSpecification.getAtType();

        return roleSpecificationEntity;
    }
}
