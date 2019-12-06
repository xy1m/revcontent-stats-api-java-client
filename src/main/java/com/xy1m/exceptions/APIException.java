package com.xy1m.exceptions;

import com.xy1m.model.APIError;

public abstract class APIException extends RuntimeException {

    private APIError error = APIError.EMPTY;

    public APIException(String message, Object... params) {
        super(String.format(message, params));
    }

    public APIException(APIError error, String message, Object... params) {
        super(String.format(message + parseError(error), params));
        this.error = error;
    }

    public APIException(APIError error, String message, Throwable t, Object... params) {
        super(String.format(message + parseError(error), params), t);
        this.error = error;
    }

    private static String parseError(APIError error) {
        if (error == null || APIError.EMPTY.equals(error)) {
            return "";
        }

        return String.format(". Response error empty: %s", error);
    }

    public APIError getError() {
        return error;
    }
}
