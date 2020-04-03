package com.telekom.sep.tmf644.mapper;

import com.telekom.sep.tmf644.repository.entity.TimePeriodEntity;
import javax.annotation.Generated;
import javax.enterprise.context.ApplicationScoped;
import org.openapitools.model.TimePeriod;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-04-03T09:14:18+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.6 (JetBrains s.r.o)"
)
@ApplicationScoped
public class TimePeriodMapperImpl implements TimePeriodMapper {

    @Override
    public TimePeriod map(TimePeriodEntity timePeriodEntity) {
        if ( timePeriodEntity == null ) {
            return null;
        }

        TimePeriod timePeriod = new TimePeriod();

        timePeriod.setEndDateTime( timePeriodEntity.endDateTime );
        timePeriod.setStartDateTime( timePeriodEntity.startDateTime );

        return timePeriod;
    }

    @Override
    public TimePeriodEntity map(TimePeriod timePeriod) {
        if ( timePeriod == null ) {
            return null;
        }

        TimePeriodEntity timePeriodEntity = new TimePeriodEntity();

        timePeriodEntity.endDateTime = timePeriod.getEndDateTime();
        timePeriodEntity.startDateTime = timePeriod.getStartDateTime();

        return timePeriodEntity;
    }
}
