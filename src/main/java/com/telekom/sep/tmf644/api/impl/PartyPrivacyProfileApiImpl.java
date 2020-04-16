package com.telekom.sep.tmf644.api.impl;

import com.telekom.sep.tmf644.mapper.PartyPrivacyProfileMapper;
import com.telekom.sep.tmf644.repository.entity.PartyPrivacyAgreementEntity;
import com.telekom.sep.tmf644.repository.entity.PartyPrivacyProfileEntity;
import com.telekom.sep.tmf644.repository.entity.PartyPrivacyProfileSpecificationEntity;
import org.bson.types.ObjectId;
import org.openapitools.api.PartyPrivacyProfileApi;
import org.openapitools.model.*;
import org.openapitools.model.Error;


import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.*;
import java.util.List;

public class PartyPrivacyProfileApiImpl implements PartyPrivacyProfileApi {

    @Inject
    private PartyPrivacyProfileMapper privacyProfileMapper;

    @Context
    private UriInfo info;

    public Response createPartyPrivacyProfile(@Valid PartyPrivacyProfileCreate partyPrivacyProfile) {


        PartyPrivacyProfileEntity partyPrivacyProfileEntity = privacyProfileMapper.map(partyPrivacyProfile);

        //test if specification exists
        if (partyPrivacyProfileEntity.partyPrivacyProfileSpecification == null) {
            Error noSpecError = new Error();
            noSpecError.setCode(Response.Status.BAD_REQUEST.toString());
            noSpecError.setMessage("there are not partyPrivacySpecification is referred in request");
            return Response.status(Response.Status.BAD_REQUEST).entity(noSpecError).build();
        }

        //test is specification is available
        PartyPrivacyProfileSpecificationEntity specificationEntity = PartyPrivacyProfileSpecificationEntity.findById(new ObjectId(partyPrivacyProfileEntity.partyPrivacyProfileSpecification.getId()));
        if (specificationEntity == null) {
            Error notFoundSpecError = new Error();
            notFoundSpecError.setCode(Response.Status.BAD_REQUEST.toString());
            notFoundSpecError.setMessage("there are not partyPrivacySpecification with id available");
            return Response.status(Response.Status.BAD_REQUEST).entity(notFoundSpecError).build();
        }


        //Test if agreement exists
        if (partyPrivacyProfileEntity.agreement != null) {

            PartyPrivacyAgreementEntity partyPrivacyAgreementEntity = PartyPrivacyAgreementEntity.findById(new ObjectId(partyPrivacyProfileEntity.agreement.getId()));
            if (partyPrivacyAgreementEntity == null) {
                Error notFoundAgreementError = new Error();
                notFoundAgreementError.setCode(Response.Status.BAD_REQUEST.toString());
                notFoundAgreementError.setMessage("the specified agreement doesn't exists");
                return Response.status(Response.Status.BAD_REQUEST).entity(notFoundAgreementError).build();
            }
        }
        partyPrivacyProfileEntity.persist();

        UriBuilder uriBuilder = info.getAbsolutePathBuilder();
        uriBuilder.path(partyPrivacyProfileEntity.id.toString());  // determine id of created PartyPrivacyProfile and append it to path
        // not set in DB but in GET request too
        partyPrivacyProfileEntity.href = uriBuilder.build().toString();

        return Response.created(uriBuilder.build()).entity(privacyProfileMapper.map(partyPrivacyProfileEntity)).build();
    }

    public Response deletePartyPrivacyProfile(@PathParam("id") String id) {

        PartyPrivacyProfileEntity entity = PartyPrivacyProfileEntity.findById(new ObjectId(id));
        if (entity == null)
            return Response.status(Response.Status.NOT_FOUND).build();

        entity.delete();

        return Response.status(Response.Status.NO_CONTENT).build();
    }

    public Response listPartyPrivacyProfile(@QueryParam("fields") String fields, @QueryParam("offset") Integer
            offset, @QueryParam("limit") Integer limit) {

        MultivaluedMap<String, String> queryParams = info.getQueryParameters();

        List<PartyPrivacyProfileEntity> entities = PartyPrivacyProfileEntity.findByQuery(queryParams);

        return Response.ok().entity(privacyProfileMapper.map(entities)).build();
        //     return Response.ok().entity(privacyProfileMapper.map(PartyPrivacyProfileEntity.listAll())).build();
    }

    public Response patchPartyPrivacyProfile(@PathParam("id") String id, @Valid PartyPrivacyProfileUpdate
            partyPrivacyProfile) {

        PartyPrivacyProfileEntity updateEntity = privacyProfileMapper.map(partyPrivacyProfile);
        updateEntity.id = new ObjectId(id);
        PartyPrivacyProfileEntity entity = PartyPrivacyProfileEntity.findById(updateEntity.id);
        if (entity == null)
            return Response.status(Response.Status.NOT_FOUND).build();

        updateEntity.update();
        return Response.ok().entity(updateEntity).build();
    }

    public Response retrievePartyPrivacyProfile(@PathParam("id") String id, @QueryParam("fields") String fields) {
        PartyPrivacyProfileEntity entity = PartyPrivacyProfileEntity.findById(new ObjectId(id));

        if (entity == null)
            return Response.status(Response.Status.NOT_FOUND).build();

        PartyPrivacyProfile profile = privacyProfileMapper.map(entity);

        UriBuilder uriBuilder = info.getAbsolutePathBuilder();


        // not set in DB but in GET request too
        profile.setHref(uriBuilder.build().toString());


        return Response.ok(uriBuilder.build()).entity(profile).build();

    }


}
