package com.xy1m.internal;

import com.xy1m.exceptions.APIClientException;
import com.xy1m.exceptions.APIServerException;
import com.xy1m.exceptions.APIUnauthorizedException;
import com.xy1m.model.ResultCampaign;
import com.xy1m.model.ResultsData;
import com.xy1m.model.boost.Boost;
import com.xy1m.model.boost.BoostStats;
import com.xy1m.model.boost.WidgetStats;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

import java.util.Map;

public interface BoostEndpoint {

    @POST(Paths.BACKSTAGE_API_PATH_PREFIX + "/boosts/add")
    @Headers("ContentAddRequest-Type: application/json")
    ResultCampaign<Boost> addBoost(@Header("Authorization") String authToken,
                                   @Body Boost boost)
            throws APIUnauthorizedException, APIServerException, APIClientException;

    @POST(Paths.BACKSTAGE_API_PATH_PREFIX + "/boosts/{boost_id}/settings")
    @Headers("ContentAddRequest-Type: application/json")
    Boost updateBoost(@Header("Authorization") String authToken,
                      @Path("boost_id") String boostId,
                      @Body Boost boost)
            throws APIUnauthorizedException, APIServerException, APIClientException;

    @POST(Paths.BACKSTAGE_API_PATH_PREFIX + "/boosts")
    @Headers("ContentAddRequest-Type: application/json")
    Boost updateBoostStatus(@Header("Authorization") String authToken,
                            @Body Boost boost)
            throws APIUnauthorizedException, APIServerException, APIClientException;

    @GET(Paths.BACKSTAGE_API_PATH_PREFIX + "/boosts")
    @Headers("ContentAddRequest-Type: application/json")
    ResultsData<Boost> listBoosts(@Header("Authorization") String authToken,
                                  @QueryMap Map<String, String> filter)
            throws APIUnauthorizedException, APIServerException, APIClientException;

    @GET(Paths.BACKSTAGE_API_PATH_PREFIX + "/boosts/performance")
    @Headers("ContentAddRequest-Type: application/json")
    ResultsData<BoostStats> getBoostPerformance(@Header("Authorization") String authToken,
                                                @QueryMap Map<String, String> filter)
            throws APIUnauthorizedException, APIServerException, APIClientException;

    @GET(Paths.BACKSTAGE_API_PATH_PREFIX + "/boosts/{boost_id}/widgets/stats")
    @Headers("ContentAddRequest-Type: application/json")
    ResultsData<WidgetStats> getWidgetStats(@Header("Authorization") String authToken,
                                            @Path("boost_id") String boostId,
                                            @QueryMap Map<String, String> filter)
            throws APIUnauthorizedException, APIServerException, APIClientException;

}
