package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.PartyPrivacyProfileSpecification;
import org.openapitools.model.PartyPrivacyProfileSpecificationCreate;
import org.openapitools.model.PartyPrivacyProfileSpecificationUpdate;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/partyPrivacyProfileSpecification")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2020-03-24T20:10:32.539+01:00[Europe/Berlin]")
public interface PartyPrivacyProfileSpecificationApi {

    @POST
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    Response createPartyPrivacyProfileSpecification(@Valid PartyPrivacyProfileSpecificationCreate partyPrivacyProfileSpecification);

    @DELETE
    @Path("/{id}")
    @Produces({ "application/json;charset=utf-8" })
    Response deletePartyPrivacyProfileSpecification(@PathParam("id") String id);

    @GET
    @Produces({ "application/json;charset=utf-8" })
    Response listPartyPrivacyProfileSpecification(@QueryParam("fields")    String fields,@QueryParam("offset")    Integer offset,@QueryParam("limit")    Integer limit);

    @PATCH
    @Path("/{id}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    Response patchPartyPrivacyProfileSpecification(@PathParam("id") String id,@Valid PartyPrivacyProfileSpecificationUpdate partyPrivacyProfileSpecification);

    @GET
    @Path("/{id}")
    @Produces({ "application/json;charset=utf-8" })
    Response retrievePartyPrivacyProfileSpecification(@PathParam("id") String id,@QueryParam("fields")    String fields);
}
