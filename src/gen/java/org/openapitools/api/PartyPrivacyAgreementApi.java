package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.PartyPrivacyAgreement;
import org.openapitools.model.PartyPrivacyAgreementCreate;
import org.openapitools.model.PartyPrivacyAgreementUpdate;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/partyPrivacyAgreement")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2020-03-24T20:10:32.539+01:00[Europe/Berlin]")
public interface PartyPrivacyAgreementApi {

    @POST
    //@Consumes({ "application/json;charset=utf-8" })
    //@Produces({ "application/json;charset=utf-8" })
    @Consumes( "application/json")
    @Produces( "application/json")
    Response createPartyPrivacyAgreement(@Valid PartyPrivacyAgreementCreate partyPrivacyAgreement);

    @DELETE
    @Path("/{id}")
    @Produces({ "application/json;charset=utf-8" })
    Response deletePartyPrivacyAgreement(@PathParam("id") String id);

    @GET
    @Produces({ "application/json;charset=utf-8" })
    Response listPartyPrivacyAgreement(@QueryParam("fields")    String fields,@QueryParam("offset")    Integer offset,@QueryParam("limit")    Integer limit);

    @PATCH
    @Path("/{id}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    Response patchPartyPrivacyAgreement(@PathParam("id") String id,@Valid PartyPrivacyAgreementUpdate partyPrivacyAgreement);

    @GET
    @Path("/{id}")
    @Produces({ "application/json;charset=utf-8" })
    Response retrievePartyPrivacyAgreement(@PathParam("id") String id,@QueryParam("fields")    String fields);
}
