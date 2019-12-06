package com.xy1m.internal.interceptors;

import okhttp3.logging.HttpLoggingInterceptor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CommunicationInterceptor implements HttpLoggingInterceptor.Logger {

    private static final Logger logger = LogManager.getLogger(CommunicationInterceptor.class);

    @Override
    public void log(String message) {
        logger.info(message);
    }
}
