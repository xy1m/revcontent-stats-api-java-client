package com.xy1m.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Collection;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "success",
        "data"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class DataResults<T> {

    private boolean success;
    private Collection<T> data;

    public DataResults() {
        //for serialization
    }

    public DataResults(boolean success, Collection<T> data) {
        this.success = success;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Collection<T> getData() {
        return data;
    }

    public void setData(Collection<T> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "DataResults{" +
                "success=" + success +
                ", data=" + data +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DataResults)) return false;
        DataResults<?> dataResults = (DataResults<?>) o;
        return isSuccess() == dataResults.isSuccess() &&
                Objects.equals(getData(), dataResults.getData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSuccess(), getData());
    }
}
