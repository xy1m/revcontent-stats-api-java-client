package com.xy1m.model;

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
public class CampaignResult<T> {

    private boolean success;
    private T campaign;

    public CampaignResult() {
        //for serialization
    }

    public CampaignResult(boolean success, T campaign) {
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
        if (!(o instanceof CampaignResult)) return false;
        CampaignResult<?> that = (CampaignResult<?>) o;
        return isSuccess() == that.isSuccess() &&
                Objects.equals(getCampaign(), that.getCampaign());
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSuccess(), getCampaign());
    }

    @Override
    public String toString() {
        return "CampaignResult{" +
                "success=" + success +
                ", campaign=" + campaign +
                '}';
    }
}
