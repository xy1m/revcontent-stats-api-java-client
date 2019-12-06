package com.xy1m.internal;

import com.xy1m.exceptions.APIException;
import com.xy1m.model.auth.Token;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface AuthenticationEndpoint {

    @POST("oauth/token")
    @FormUrlEncoded
    Token getAuthToken(@Field("client_id") String clientId,
                       @Field("client_secret") String clientSecret,
                       @Field("grant_type") String grantType) throws APIException;
}
