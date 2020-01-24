package com.xy1m.internal;

import com.xy1m.exceptions.APIException;
import com.xy1m.model.ResultsData;
import com.xy1m.model.targeting.BoostTarget;
import com.xy1m.model.targeting.WidgetTarget;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;

public interface TargetEndpoint {
    /**
     * @param authToken Authorization token
     * @param boostId Boost id
     * @return Boost targets
     * @throws APIException
     */
    @GET(Paths.BACKSTAGE_API_PATH_PREFIX + "/boosts/{boost_id}/targets")
    @Headers("ContentAddRequest-Type: application/json")
    ResultsData<BoostTarget> listBoostTargets(@Header("Authorization") String authToken,
                                              @Path("boost_id") String boostId,
                                              @QueryMap Map<String, String> filter) throws APIException;

    /**
     * @param authToken Authorization token
     * @param boostId Boost id
     * @param payload {id, bid enabled}
     * @return succeed response { "success": true }
     * @throws APIException
     */
    @POST(Paths.BACKSTAGE_API_PATH_PREFIX + "/boosts/{boost_id}/targets")
    @Headers("ContentAddRequest-Type: application/json")
    ResultsData<BoostTarget> updateBoostTarget(@Header("Authorization") String authToken,
                                               @Path("boost_id") String boostId,
                                               @Body BoostTarget payload) throws APIException;

    /**
     * @param authToken Authorization token
     * @param boostId Boost id
     * @return Widget targets
     * @throws APIException
     */
    @GET(Paths.BACKSTAGE_API_PATH_PREFIX + "/boosts/{boost_id}/widgets")
    @Headers("ContentAddRequest-Type: application/json")
    ResultsData<WidgetTarget> listWidgetTargets(@Header("Authorization") String authToken,
                                                @Path("boost_id") String boostId,
                                                @QueryMap Map<String, String> filter) throws APIException;

    /**
     * @param authToken Authorization token
     * @param boostId Boost id
     * @param payload {id, bid enabled}
     * @return succeed response { "success": true }
     * @throws APIException
     */
    @POST(Paths.BACKSTAGE_API_PATH_PREFIX + "/boosts/{boost_id}/widgets")
    @Headers("ContentAddRequest-Type: application/json")
    ResultsData<WidgetTarget> updateWidgetTarget(@Header("Authorization") String authToken,
                                                 @Path("boost_id") String boostId,
                                                 @Body List<WidgetTarget> payload) throws APIException;


}
