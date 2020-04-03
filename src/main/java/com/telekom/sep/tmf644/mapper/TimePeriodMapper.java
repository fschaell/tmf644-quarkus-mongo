package com.telekom.sep.tmf644.mapper;

import com.telekom.sep.tmf644.repository.entity.TimePeriodEntity;
import org.mapstruct.Mapper;
import org.openapitools.model.TimePeriod;

@Mapper(componentModel = "cdi")
public interface TimePeriodMapper {


    TimePeriod map(TimePeriodEntity timePeriodEntity);

    TimePeriodEntity map(TimePeriod timePeriod);
}
