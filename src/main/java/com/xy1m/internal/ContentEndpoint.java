package com.xy1m.internal;

import com.xy1m.exceptions.APIClientException;
import com.xy1m.exceptions.APIServerException;
import com.xy1m.exceptions.APIUnauthorizedException;
import com.xy1m.model.ResultCreative;
import com.xy1m.model.ResultsData;
import com.xy1m.model.content.Content;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

import java.util.Map;

public interface ContentEndpoint {

    @POST(Paths.BACKSTAGE_API_PATH_PREFIX + "/boosts/{boost_id}/content/addContent")
    @Headers("ContentAddRequest-Type: application/json")
    ResultCreative<Content> addContent(@Header("Authorization") String authToken,
                                       @Path("boost_id") String boostId,
                                       @Body Content payload)
            throws APIUnauthorizedException, APIServerException, APIClientException;

    @POST(Paths.BACKSTAGE_API_PATH_PREFIX + "/boosts/{boost_id}/content")
    @Headers("ContentAddRequest-Type: application/json")
    ResultsData<Content> updateContent(@Header("Authorization") String authToken,
                                       @Path("boost_id") String boostId,
                                       @Body Content payload)
            throws APIUnauthorizedException, APIServerException, APIClientException;

    @GET(Paths.BACKSTAGE_API_PATH_PREFIX + "/boosts/content")
    @Headers("ContentAddRequest-Type: application/json")
    ResultsData<Content> listContents(@Header("Authorization") String authToken,
                                      @QueryMap Map<String, String> filter)
            throws APIUnauthorizedException, APIServerException, APIClientException;

    @GET(Paths.BACKSTAGE_API_PATH_PREFIX + "/boosts/{boost_id}/content")
    @Headers("ContentAddRequest-Type: application/json")
    ResultsData<Content> getContent(@Header("Authorization") String authToken,
                                    @Path("boost_id") String boostId,
                                    @QueryMap Map<String, String> filter)
            throws APIUnauthorizedException, APIServerException, APIClientException;

}
