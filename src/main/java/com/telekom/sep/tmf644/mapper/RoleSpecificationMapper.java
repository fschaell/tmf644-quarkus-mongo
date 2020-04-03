package com.telekom.sep.tmf644.mapper;

import com.telekom.sep.tmf644.repository.entity.RoleSpecificationEntity;
import org.mapstruct.Mapper;
import org.openapitools.model.RoleSpecification;

@Mapper(componentModel = "cdi")
public interface RoleSpecificationMapper {

    RoleSpecification map(RoleSpecificationEntity roleSpecificationEntity);
    RoleSpecificationEntity map(RoleSpecification roleSpecification);
}
