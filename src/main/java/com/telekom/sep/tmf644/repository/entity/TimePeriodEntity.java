package com.telekom.sep.tmf644.repository.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import java.util.Date;
import java.util.Objects;


/**
 * A period of time, either as a deadline (endDateTime only) a startDateTime only, or both
 **/
public class TimePeriodEntity {
  
  public Date endDateTime;
  public Date startDateTime;
}

