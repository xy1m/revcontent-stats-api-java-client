package com.xy1m.internal;

import com.xy1m.exceptions.APIException;
import com.xy1m.model.ResultsData;
import com.xy1m.model.content.ContentAddRequest;
import com.xy1m.model.content.ContentGetAllResponse;
import com.xy1m.model.content.ContentGetResponse;
import com.xy1m.model.content.ContentAddOrUpdateResponse;
import com.xy1m.model.content.ContentUpdateRequest;
import com.xy1m.model.content.ResultCreative;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ContentEndpoint {
    @POST(Paths.BACKSTAGE_API_PATH_PREFIX + "/boosts/{boost_id}/content/add")
    @Headers("ContentAddRequest-Type: application/json")
    ResultCreative<ContentAddOrUpdateResponse> add(@Header("Authorization") String authToken,
                                                   @Path("boost_id") Long boostId,
                                                   @Body ContentAddRequest payload) throws APIException;

    @POST(Paths.BACKSTAGE_API_PATH_PREFIX + "/boosts/{boost_id}/content")
    @Headers("ContentAddRequest-Type: application/json")
    ResultsData<ContentAddOrUpdateResponse> update(@Header("Authorization") String authToken,
                                                   @Path("boost_id") Long boostId,
                                                   @Body ContentUpdateRequest payload) throws APIException;

    @GET(Paths.BACKSTAGE_API_PATH_PREFIX + "/boosts/{boost_id}/content")
    @Headers("ContentAddRequest-Type: application/json")
    ResultsData<ContentGetResponse> getContentByBoostId(@Header("Authorization") String authToken,
                                                        @Path("boost_id") Long boostId) throws APIException;

    @GET(Paths.BACKSTAGE_API_PATH_PREFIX + "/boosts/content")
    @Headers("ContentAddRequest-Type: application/json")
    ResultsData<ContentGetAllResponse> getAllContents(@Header("Authorization") String authToken) throws APIException;
}
