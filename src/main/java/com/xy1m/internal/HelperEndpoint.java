package com.xy1m.internal;

import com.xy1m.exceptions.APIException;
import com.xy1m.model.DataResults;
import com.xy1m.model.Interest;
import com.xy1m.model.Resource;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface HelperEndpoint {
    @GET(Paths.BACKSTAGE_API_PATH_PREFIX + "/boosts/brands")
    @Headers("Content-Type: application/json")
    DataResults<Resource> getBrandTargets(@Header("Authorization") String authToken) throws APIException;

    @GET(Paths.BACKSTAGE_API_PATH_PREFIX + "/boosts/targets")
    @Headers("Content-Type: application/json")
    DataResults<Resource> getTopicargets(@Header("Authorization") String authToken) throws APIException;

    @GET(Paths.BACKSTAGE_API_PATH_PREFIX + "/countries")
    @Headers("Content-Type: application/json")
    DataResults<Resource> getCountries(@Header("Authorization") String authToken) throws APIException;

    @GET(Paths.BACKSTAGE_API_PATH_PREFIX + "/devices")
    @Headers("Content-Type: application/json")
    DataResults<Resource> getDevices(@Header("Authorization") String authToken) throws APIException;

    @GET(Paths.BACKSTAGE_API_PATH_PREFIX + "/languages")
    @Headers("Content-Type: application/json")
    DataResults<Resource> getLanguages(@Header("Authorization") String authToken) throws APIException;

    @GET(Paths.BACKSTAGE_API_PATH_PREFIX + "/interests")
    @Headers("Content-Type: application/json")
    DataResults<Interest> getInterests(@Header("Authorization") String authToken) throws APIException;

    @GET(Paths.BACKSTAGE_API_PATH_PREFIX + "/regions")
    @Headers("Content-Type: application/json")
    DataResults<Resource> getRegions(@Header("Authorization") String authToken,
                                     @Query("country") String country) throws APIException;

}
