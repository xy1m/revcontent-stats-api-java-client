package com.xy1m.internal;

import com.xy1m.exceptions.APIException;
import com.xy1m.model.Boost;
import com.xy1m.model.CampaignResult;
import com.xy1m.model.DataResults;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface BoostEndpoint {
    @GET(Paths.BACKSTAGE_API_PATH_PREFIX + "/boosts")
    @Headers("Content-Type: application/json")
    DataResults<Boost> getAllBoosts(@Header("Authorization") String authToken) throws APIException;

    @POST(Paths.BACKSTAGE_API_PATH_PREFIX + "/boosts/add")
    @Headers("Content-Type: application/json")
    CampaignResult<Boost> createCpc(@Header("Authorization") String authToken,
                                    @Body Boost boost) throws APIException;

    @POST(Paths.BACKSTAGE_API_PATH_PREFIX + "/boosts/add")
    @Headers("Content-Type: application/json")
    CampaignResult<Boost> createCpa(@Header("Authorization") String authToken,
                                    @Body Boost boost) throws APIException;

    @POST(Paths.BACKSTAGE_API_PATH_PREFIX + "/boosts/{boost_id}/settings")
    @Headers("Content-Type: application/json")
    Boost update(@Header("Authorization") String authToken,
                 @Path("boost_id") String boostId,
                 @Body Boost boost) throws APIException;

    @POST(Paths.BACKSTAGE_API_PATH_PREFIX + "/boosts")
    @Headers("Content-Type: application/json")
    Boost updateStatus(@Header("Authorization") String authToken,
                       @Body Boost boost) throws APIException;
}
