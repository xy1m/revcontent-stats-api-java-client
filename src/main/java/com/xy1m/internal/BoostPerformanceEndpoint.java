package com.xy1m.internal;

import com.xy1m.exceptions.APIException;
import com.xy1m.model.ResultsData;
import com.xy1m.model.boost.BoostPerformance;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.QueryMap;

import java.util.Map;

public interface BoostPerformanceEndpoint {
    @GET(Paths.BACKSTAGE_API_PATH_PREFIX + "/boosts/performance")
    @Headers("ContentAddRequest-Type: application/json")
    ResultsData<BoostPerformance> getBoostPerformance(@Header("Authorization") String authToken,
                                                      @QueryMap(encoded = true) Map<String, String> queryMap) throws APIException;
}
