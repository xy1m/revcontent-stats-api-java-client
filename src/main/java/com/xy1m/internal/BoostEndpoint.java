package com.xy1m.internal;

import com.xy1m.exceptions.APIException;
import com.xy1m.model.ResultsData;
import com.xy1m.model.boost.BoostAddRequest;
import com.xy1m.model.boost.BoostAddResponse;
import com.xy1m.model.boost.BoostGetAllResponse;
import com.xy1m.model.boost.BoostUpdateRequest;
import com.xy1m.model.boost.BoostUpdateResponse;
import com.xy1m.model.boost.BoostUpdateStatusRequest;
import com.xy1m.model.boost.BoostUpdateStatusResponse;
import com.xy1m.model.boost.ResultCampaign;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface BoostEndpoint {
    @GET(Paths.BACKSTAGE_API_PATH_PREFIX + "/boosts")
    @Headers("ContentAddRequest-Type: application/json")
    ResultsData<BoostGetAllResponse> getAllBoosts(@Header("Authorization") String authToken) throws APIException;

    @POST(Paths.BACKSTAGE_API_PATH_PREFIX + "/boosts/add")
    @Headers("ContentAddRequest-Type: application/json")
    ResultCampaign<BoostAddResponse> createCpc(@Header("Authorization") String authToken,
                                               @Body BoostAddRequest boost) throws APIException;

    @POST(Paths.BACKSTAGE_API_PATH_PREFIX + "/boosts/add")
    @Headers("ContentAddRequest-Type: application/json")
    ResultCampaign<BoostAddResponse> createCpa(@Header("Authorization") String authToken,
                                               @Body BoostAddRequest boost) throws APIException;

    @POST(Paths.BACKSTAGE_API_PATH_PREFIX + "/boosts/{boost_id}/settings")
    @Headers("ContentAddRequest-Type: application/json")
    BoostUpdateResponse update(@Header("Authorization") String authToken,
                               @Path("boost_id") Long boostId,
                               @Body BoostUpdateRequest boost) throws APIException;

    @POST(Paths.BACKSTAGE_API_PATH_PREFIX + "/boosts")
    @Headers("ContentAddRequest-Type: application/json")
    BoostUpdateStatusResponse updateStatus(@Header("Authorization") String authToken,
                                           @Body BoostUpdateStatusRequest boost) throws APIException;
}
