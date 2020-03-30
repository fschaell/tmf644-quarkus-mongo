package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.EventSubscription;
import org.openapitools.model.PartyPrivacyAgreementAttributeValueChangeEvent;
import org.openapitools.model.PartyPrivacyAgreementCreateEvent;
import org.openapitools.model.PartyPrivacyAgreementDeleteEvent;
import org.openapitools.model.PartyPrivacyAgreementStatusChangeEvent;
import org.openapitools.model.PartyPrivacyProfileAttributeValueChangeEvent;
import org.openapitools.model.PartyPrivacyProfileCreateEvent;
import org.openapitools.model.PartyPrivacyProfileDeleteEvent;
import org.openapitools.model.PartyPrivacyProfileSpecificationAttributeValueChangeEvent;
import org.openapitools.model.PartyPrivacyProfileSpecificationCreateEvent;
import org.openapitools.model.PartyPrivacyProfileSpecificationDeleteEvent;
import org.openapitools.model.PartyPrivacyProfileSpecificationStatusChangeEvent;
import org.openapitools.model.PartyPrivacyProfileStatusChangeEvent;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/listener")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2020-03-24T20:10:32.539+01:00[Europe/Berlin]")
public interface ListenerApi {

    @POST
    @Path("/partyPrivacyAgreementAttributeValueChangeEvent")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    Response listenToPartyPrivacyAgreementAttributeValueChangeEvent(@Valid PartyPrivacyAgreementAttributeValueChangeEvent data);

    @POST
    @Path("/partyPrivacyAgreementCreateEvent")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    Response listenToPartyPrivacyAgreementCreateEvent(@Valid PartyPrivacyAgreementCreateEvent data);

    @POST
    @Path("/partyPrivacyAgreementDeleteEvent")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    Response listenToPartyPrivacyAgreementDeleteEvent(@Valid PartyPrivacyAgreementDeleteEvent data);

    @POST
    @Path("/partyPrivacyAgreementStatusChangeEvent")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    Response listenToPartyPrivacyAgreementStatusChangeEvent(@Valid PartyPrivacyAgreementStatusChangeEvent data);

    @POST
    @Path("/partyPrivacyProfileAttributeValueChangeEvent")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    Response listenToPartyPrivacyProfileAttributeValueChangeEvent(@Valid PartyPrivacyProfileAttributeValueChangeEvent data);

    @POST
    @Path("/partyPrivacyProfileCreateEvent")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    Response listenToPartyPrivacyProfileCreateEvent(@Valid PartyPrivacyProfileCreateEvent data);

    @POST
    @Path("/partyPrivacyProfileDeleteEvent")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    Response listenToPartyPrivacyProfileDeleteEvent(@Valid PartyPrivacyProfileDeleteEvent data);

    @POST
    @Path("/partyPrivacyProfileSpecificationAttributeValueChangeEvent")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    Response listenToPartyPrivacyProfileSpecificationAttributeValueChangeEvent(@Valid PartyPrivacyProfileSpecificationAttributeValueChangeEvent data);

    @POST
    @Path("/partyPrivacyProfileSpecificationCreateEvent")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    Response listenToPartyPrivacyProfileSpecificationCreateEvent(@Valid PartyPrivacyProfileSpecificationCreateEvent data);

    @POST
    @Path("/partyPrivacyProfileSpecificationDeleteEvent")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    Response listenToPartyPrivacyProfileSpecificationDeleteEvent(@Valid PartyPrivacyProfileSpecificationDeleteEvent data);

    @POST
    @Path("/partyPrivacyProfileSpecificationStatusChangeEvent")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    Response listenToPartyPrivacyProfileSpecificationStatusChangeEvent(@Valid PartyPrivacyProfileSpecificationStatusChangeEvent data);

    @POST
    @Path("/partyPrivacyProfileStatusChangeEvent")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    Response listenToPartyPrivacyProfileStatusChangeEvent(@Valid PartyPrivacyProfileStatusChangeEvent data);
}
