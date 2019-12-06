package com.xy1m.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Collection;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "error",
        "errorDescription",
        "success",
        "errors"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class APIError {

    public static final APIError EMPTY = new APIError();

    private String error;
    private String errorDescription;

    private boolean success;
    private Collection<APIErrorDetail> errors;

    public APIError() {
        //for jackson
    }

    public APIError(boolean success, Collection<APIErrorDetail> errors) {
        this.success = success;
        this.errors = errors;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Collection<APIErrorDetail> getErrors() {
        return errors;
    }

    public void setErrors(Collection<APIErrorDetail> errors) {
        this.errors = errors;
    }

    @Override
    public String toString() {
        return "APIError{" +
                "error='" + error + '\'' +
                ", errorDescription='" + errorDescription + '\'' +
                ", success=" + success +
                ", errors=" + errors +
                '}';
    }
}
