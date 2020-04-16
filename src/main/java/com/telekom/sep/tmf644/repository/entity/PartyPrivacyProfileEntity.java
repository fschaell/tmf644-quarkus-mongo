package com.telekom.sep.tmf644.repository.entity;

import io.quarkus.mongodb.panache.MongoEntity;
import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.PanacheQuery;
import io.quarkus.panache.common.Page;
import io.quarkus.panache.common.Parameters;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;
import org.openapitools.model.*;

import javax.ws.rs.core.MultivaluedMap;
import java.net.URI;
import java.util.*;
import java.util.stream.Collectors;


/**
 * A Party Privacy Profile represents the set of Privacy settings defined for a Party
 **/
@MongoEntity(collection = "PartyPrivacyProfile")
public class PartyPrivacyProfileEntity extends PanacheMongoEntity {

    public String href;
    public Date creationDate;
    public String description;
    public String name;
    public String status;
    public RelatedPartyEntity agreedByParty;
    public AgreementRef agreement;
    public RelatedPartyEntity applicableForParty;
    public List<PartyPrivacyProfileCharacteristicEntity> partyPrivacyProfileCharacteristic = new ArrayList<PartyPrivacyProfileCharacteristicEntity>();
    public PartyPrivacyProfileSpecificationRef partyPrivacyProfileSpecification;
    public TimePeriod validFor;
    public String atBaseType;
    public URI atSchemaLocation;
    public String atType;

    public static List<PartyPrivacyProfileEntity> findByPartyPrivacySpecificationId(String partyPrivacySpecificationId) {
        PanacheQuery<PartyPrivacyProfileEntity> entities = PartyPrivacyProfileEntity
                .find("partyPrivacyProfileSpecification._id",partyPrivacySpecificationId);
        return entities.list();
    }
    public static List<PartyPrivacyProfileEntity> findByPartyPrivacyAgreementId(String partyPrivacyAgreementId) {
        PanacheQuery<PartyPrivacyProfileEntity> entities = PartyPrivacyProfileEntity
                .find("agreement._id",partyPrivacyAgreementId);
        return entities.list();
    }

        public static List<PartyPrivacyProfileEntity> findByQuery(MultivaluedMap<String, String> queryMap) {

        Map<String, Object> params = prepareParameters(queryMap);
        // create a query for all living persons
        PanacheQuery<PartyPrivacyProfileEntity> entities = PartyPrivacyProfileEntity.find(
                //         "atReferredType = :referredType " +
                // "and " +
                prepareQuery(params),//"agreedByParty.id = :id and status = :status",

                //replace . in QL parameters
                replaceKeys(params));


        //Parameters.with("status", "created").and("role","owner").map());

// make it use pages of 25 entries at a time

        entities.page(Page.ofSize(25));

// get the first page
        List<PartyPrivacyProfileEntity> firstPage = entities.list();

    /* return list("agreedByParty.id = :agreedByParty.id " +
            //"and referredType = :referredType " +
            "and status = :status",queryMap);
    */

        //return list("status = :status",queryMap);
        return firstPage;


    }

    private static Map<String, Object> prepareParameters(MultivaluedMap<String, String> queryParameters) {

        Map<String, Object> parameters = new HashMap<String, Object>();

        for (String str : queryParameters.keySet()) {
            parameters.put(str, queryParameters.getFirst(str));
        }
        return parameters;

    }

    private static String prepareQuery(Map<String, Object> queryParameters) {

        String mapAsString = queryParameters.keySet().stream()
                .filter(entry -> !"limit".equals(entry))
                .filter(entry -> !"offset".equals(entry))
                .filter(entry -> !"fields".equals(entry))
                .map(key -> key + " = :" + key.replaceAll("\\.", ""))
                .collect(Collectors.joining(" and "));

        return mapAsString;

    }

    private static Map<String, Object> replaceKeys(Map<String, Object> paramMap) {
        return paramMap.entrySet().stream()
                .filter(entry -> !"limit".equals(entry.getKey()))
                .filter(entry -> !"offset".equals(entry.getKey()))
                .filter(entry -> !"fields".equals(entry.getKey()))
                .collect(Collectors.toMap(x -> x.getKey()
                        .replaceAll("\\.", ""), x -> x.getValue()));

    }
}

