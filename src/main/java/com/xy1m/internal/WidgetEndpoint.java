package com.xy1m.internal;

import com.xy1m.exceptions.APIException;
import com.xy1m.model.ResultsData;
import com.xy1m.model.widget.optimizer.Widget;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface WidgetEndpoint {
    /**
     * @param authToken Authorization token
     * @param boostId Boost id
     * @param payload Widget id listContents divided by commas
     * @return succeed response { "success": true }
     * @throws APIException
     */
    @POST(Paths.BACKSTAGE_API_PATH_PREFIX + "/boosts/{boost_id}/targets/blacklist/widgets/add")
    @Headers("ContentAddRequest-Type: application/json")
    ResultsData<Widget> addWidget(@Header("Authorization") String authToken,
                                  @Path("boost_id") String boostId,
                                  @Body Widget payload) throws APIException;

    /**
     * @param authToken Authorization token
     * @param boostId Boost id
     * @param payload Widget id listContents divided by commas
     * @return succeed response { "success": true }
     * @throws APIException
     */
    @POST(Paths.BACKSTAGE_API_PATH_PREFIX + "/boosts/{boost_id}/targets/blacklist/widgets/remove")
    @Headers("ContentAddRequest-Type: application/json")
    ResultsData<Widget> deleteWidget(@Header("Authorization") String authToken,
                                     @Path("boost_id") String boostId,
                                     @Body Widget payload) throws APIException;

    /**
     * @param authToken Authorization token
     * @param boostId Boost id
     * @return blacklisted widget ids, example: { "data":[{"id":"100"},{"id":"200"}]}
     * @throws APIException
     */
    @GET(Paths.BACKSTAGE_API_PATH_PREFIX + "/boosts/{boost_id}/targets/blacklist/widgets")
    @Headers("ContentAddRequest-Type: application/json")
    ResultsData<Widget> listWidgets(@Header("Authorization") String authToken,
                                    @Path("boost_id") String boostId) throws APIException;

}
