package com.telekom.sep.tmf644.api.impl;

import com.telekom.sep.tmf644.mapper.PartyPrivacyProfileMapper;
import com.telekom.sep.tmf644.mapper.PartyPrivacyProfileSpecificationMapper;
import com.telekom.sep.tmf644.repository.entity.PartyPrivacyProfileEntity;
import org.bson.types.ObjectId;
import org.openapitools.api.PartyPrivacyProfileApi;
import org.openapitools.api.PartyPrivacyProfileSpecificationApi;
import org.openapitools.model.*;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

public class PartyPrivacyProfileSpecificationApiImpl implements PartyPrivacyProfileSpecificationApi {

    @Inject
    private PartyPrivacyProfileSpecificationMapper privacyProfileSpecificationMapper;


    @Override
    public Response createPartyPrivacyProfileSpecification(@Valid PartyPrivacyProfileSpecificationCreate partyPrivacyProfileSpecification) {
        return null;
    }

    @Override
    public Response deletePartyPrivacyProfileSpecification(String id) {
        return null;
    }

    @Override
    public Response listPartyPrivacyProfileSpecification(String fields, Integer offset, Integer limit) {
        return null;
    }

    @Override
    public Response patchPartyPrivacyProfileSpecification(String id, @Valid PartyPrivacyProfileSpecificationUpdate partyPrivacyProfileSpecification) {
        return null;
    }

    @Override
    public Response retrievePartyPrivacyProfileSpecification(@PathParam("id") String id, @QueryParam("fields") String fields) {
        //Part


        return null;
    }
}
