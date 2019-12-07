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
public class ResultsData<T> {

    private boolean success;
    private Collection<T> data;

    public ResultsData() {
        //for serialization
    }

    public ResultsData(boolean success, Collection<T> data) {
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
        return "ResultsData{" +
                "success=" + success +
                ", data=" + data +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ResultsData)) return false;
        ResultsData<?> resultsData = (ResultsData<?>) o;
        return isSuccess() == resultsData.isSuccess() &&
                Objects.equals(getData(), resultsData.getData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSuccess(), getData());
    }
}
