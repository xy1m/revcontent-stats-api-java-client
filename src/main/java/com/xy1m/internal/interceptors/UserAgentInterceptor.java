package com.xy1m.internal.interceptors;

import okhttp3.Interceptor;
import okhttp3.Response;

import java.io.IOException;

public class UserAgentInterceptor implements Interceptor {

    private final String userAgent;

    public UserAgentInterceptor(String userAgent) {
        this.userAgent = userAgent;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        return chain.proceed(chain.request().newBuilder().header("User-Agent", userAgent).build());
    }
}
