package com.xy1m.exceptions;

import com.xy1m.model.APIError;

public class APIClientException extends APIException {

    public APIClientException(String message, Object ... params) {
        super(message, params);
    }

    public APIClientException(int responseCode, APIError error) {
        super(error, "Failed to perform API call with response code [%d]", responseCode);
    }
}
