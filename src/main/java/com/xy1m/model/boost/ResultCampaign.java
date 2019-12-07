package com.xy1m.model.boost;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "success",
        "campaign"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultCampaign<T> {

    private boolean success;
    private T campaign;

    public ResultCampaign() {
        //for serialization
    }

    public ResultCampaign(boolean success, T campaign) {
        this.success = success;
        this.campaign = campaign;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getCampaign() {
        return campaign;
    }

    public void setCampaign(T campaign) {
        this.campaign = campaign;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ResultCampaign)) return false;
        ResultCampaign<?> that = (ResultCampaign<?>) o;
        return isSuccess() == that.isSuccess() &&
                Objects.equals(getCampaign(), that.getCampaign());
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSuccess(), getCampaign());
    }

    @Override
    public String toString() {
        return "ResultCampaign{" +
                "success=" + success +
                ", campaign=" + campaign +
                '}';
    }
}
