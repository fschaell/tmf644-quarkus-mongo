package com.telekom.sep.tmf644.api.impl;

import com.telekom.sep.tmf644.mapper.PartyPrivacyProfileMapper;
import com.telekom.sep.tmf644.mapper.PartyPrivacyProfileSpecificationMapper;
import com.telekom.sep.tmf644.repository.entity.PartyPrivacyProfileEntity;
import com.telekom.sep.tmf644.repository.entity.PartyPrivacyProfileSpecificationEntity;
import org.bson.types.ObjectId;
import org.openapitools.api.PartyPrivacyProfileApi;
import org.openapitools.api.PartyPrivacyProfileSpecificationApi;
import org.openapitools.model.*;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

public class PartyPrivacyProfileSpecificationApiImpl implements PartyPrivacyProfileSpecificationApi {

    @Inject
    private PartyPrivacyProfileSpecificationMapper privacyProfileSpecificationMapper;

    @Context
    private UriInfo urlInfo;


    @Override
    public Response createPartyPrivacyProfileSpecification(@Valid PartyPrivacyProfileSpecificationCreate partyPrivacyProfileSpecification) {
        PartyPrivacyProfileSpecificationEntity partyPrivacyProfileSpecificationEntity = privacyProfileSpecificationMapper.map(partyPrivacyProfileSpecification);
        partyPrivacyProfileSpecificationEntity.persist();

        UriBuilder uriBuilder = urlInfo.getAbsolutePathBuilder();
        uriBuilder.path(partyPrivacyProfileSpecificationEntity.id.toString());  // determine id of created PartyPrivacyProfile and append it to path
        // not set in DB but in GET request too
        partyPrivacyProfileSpecificationEntity.href = uriBuilder.build().toString();


        return Response.created(uriBuilder.build()).entity(privacyProfileSpecificationMapper.map(partyPrivacyProfileSpecificationEntity)).build();

    }

    @Override
    public Response deletePartyPrivacyProfileSpecification(String id) {

        PartyPrivacyProfileSpecificationEntity entity = PartyPrivacyProfileSpecificationEntity.findById(new ObjectId(id));
        if (entity == null)
            return Response.status(Response.Status.NOT_FOUND).build();

        entity.delete();

        return Response.status(Response.Status.NO_CONTENT).build();
    }

    @Override
    public Response listPartyPrivacyProfileSpecification(String fields, Integer offset, Integer limit) {


        return Response.ok().entity(privacyProfileSpecificationMapper.map(PartyPrivacyProfileSpecificationEntity.listAll())).build();

    }

    @Override
    public Response patchPartyPrivacyProfileSpecification(String id, @Valid PartyPrivacyProfileSpecificationUpdate partyPrivacyProfileSpecification) {
        PartyPrivacyProfileSpecificationEntity updateEntity = privacyProfileSpecificationMapper.map(partyPrivacyProfileSpecification);
        updateEntity.id = new ObjectId(id);
        PartyPrivacyProfileSpecificationEntity entity = PartyPrivacyProfileSpecificationEntity.findById(updateEntity.id);
        if (entity == null)
            return Response.status(Response.Status.NOT_FOUND).build();

        updateEntity.update();
        return Response.ok().entity(updateEntity).build();
    }

    @Override
    public Response retrievePartyPrivacyProfileSpecification(@PathParam("id") String id, @QueryParam("fields") String fields) {
        PartyPrivacyProfileSpecificationEntity entity = PartyPrivacyProfileSpecificationEntity.findById(new ObjectId(id));

        if (entity == null)
            return Response.status(Response.Status.NOT_FOUND).build();

        PartyPrivacyProfileSpecification specification = privacyProfileSpecificationMapper.map(entity);

        UriBuilder uriBuilder = urlInfo.getAbsolutePathBuilder();


        // not set in DB but in GET request too
        specification.setHref(uriBuilder.build().toString());

        return Response.ok().entity(specification).build();


    }
}
