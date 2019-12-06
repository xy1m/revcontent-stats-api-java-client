package com.xy1m.model.content;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "success",
        "creative"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreativeResult<T> {

    private boolean success;
    private T creative;

    public CreativeResult() {
        //for serialization
    }

    public CreativeResult(boolean success, T creative) {
        this.success = success;
        this.creative = creative;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getCreative() {
        return creative;
    }

    public void setCreative(T creative) {
        this.creative = creative;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CreativeResult)) return false;
        CreativeResult<?> that = (CreativeResult<?>) o;
        return isSuccess() == that.isSuccess() &&
                Objects.equals(getCreative(), that.getCreative());
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSuccess(), getCreative());
    }

    @Override
    public String toString() {
        return "CampaignResult{" +
                "success=" + success +
                ", creative=" + creative +
                '}';
    }
}
