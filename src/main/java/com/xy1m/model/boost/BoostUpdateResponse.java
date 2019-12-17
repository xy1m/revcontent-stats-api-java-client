package com.xy1m.model.boost;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.xy1m.model.EnumActiveInactive;
import com.xy1m.model.EnumEnabled;
import com.xy1m.model.EnumOptimize;
import com.xy1m.model.EnumStatus;

import java.util.List;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BoostUpdateResponse {
    private Long id;
    private String name;
    private String startDate;
    private String endDate;
    private String targetingType;
    private EnumActiveInactive enabled;
    private EnumStatus status;
    private Double defaultBid;
    private Double minBid;
    private Double maxBid;
    private String budget;
    private EnumEnabled pacing;
    private Double cost;
    private Double ctr;
    private String utmCodes;
    private List<String> countryCodes;
    private String countryTargeting;
    private EnumOptimize optimize;
    private List<String> languageTargeting;
    private List<Pixel> pixels;
    private boolean success;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getTargetingType() {
        return targetingType;
    }

    public void setTargetingType(String targetingType) {
        this.targetingType = targetingType;
    }

    public EnumActiveInactive getEnabled() {
        return enabled;
    }

    public void setEnabled(EnumActiveInactive enabled) {
        this.enabled = enabled;
    }

    public EnumStatus getStatus() {
        return status;
    }

    public void setStatus(EnumStatus status) {
        this.status = status;
    }

    public Double getDefaultBid() {
        return defaultBid;
    }

    public void setDefaultBid(Double defaultBid) {
        this.defaultBid = defaultBid;
    }

    public Double getMinBid() {
        return minBid;
    }

    public void setMinBid(Double minBid) {
        this.minBid = minBid;
    }

    public Double getMaxBid() {
        return maxBid;
    }

    public void setMaxBid(Double maxBid) {
        this.maxBid = maxBid;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public EnumEnabled getPacing() {
        return pacing;
    }

    public void setPacing(EnumEnabled pacing) {
        this.pacing = pacing;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getCtr() {
        return ctr;
    }

    public void setCtr(Double ctr) {
        this.ctr = ctr;
    }

    public String getUtmCodes() {
        return utmCodes;
    }

    public void setUtmCodes(String utmCodes) {
        this.utmCodes = utmCodes;
    }

    public List<String> getCountryCodes() {
        return countryCodes;
    }

    public void setCountryCodes(List<String> countryCodes) {
        this.countryCodes = countryCodes;
    }

    public String getCountryTargeting() {
        return countryTargeting;
    }

    public void setCountryTargeting(String countryTargeting) {
        this.countryTargeting = countryTargeting;
    }

    public EnumOptimize getOptimize() {
        return optimize;
    }

    public void setOptimize(EnumOptimize optimize) {
        this.optimize = optimize;
    }

    public List<String> getLanguageTargeting() {
        return languageTargeting;
    }

    public void setLanguageTargeting(List<String> languageTargeting) {
        this.languageTargeting = languageTargeting;
    }

    public List<Pixel> getPixels() {
        return pixels;
    }

    public void setPixels(List<Pixel> pixels) {
        this.pixels = pixels;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BoostUpdateResponse)) return false;
        BoostUpdateResponse that = (BoostUpdateResponse) o;
        return isSuccess() == that.isSuccess() &&
                Objects.equals(getId(), that.getId()) &&
                Objects.equals(getName(), that.getName()) &&
                Objects.equals(getStartDate(), that.getStartDate()) &&
                Objects.equals(getEndDate(), that.getEndDate()) &&
                Objects.equals(getTargetingType(), that.getTargetingType()) &&
                getEnabled() == that.getEnabled() &&
                getStatus() == that.getStatus() &&
                Objects.equals(getDefaultBid(), that.getDefaultBid()) &&
                Objects.equals(getMinBid(), that.getMinBid()) &&
                Objects.equals(getMaxBid(), that.getMaxBid()) &&
                Objects.equals(getBudget(), that.getBudget()) &&
                getPacing() == that.getPacing() &&
                Objects.equals(getCost(), that.getCost()) &&
                Objects.equals(getCtr(), that.getCtr()) &&
                Objects.equals(getUtmCodes(), that.getUtmCodes()) &&
                Objects.equals(getCountryCodes(), that.getCountryCodes()) &&
                Objects.equals(getCountryTargeting(), that.getCountryTargeting()) &&
                getOptimize() == that.getOptimize() &&
                Objects.equals(getLanguageTargeting(), that.getLanguageTargeting()) &&
                Objects.equals(getPixels(), that.getPixels());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getStartDate(), getEndDate(), getTargetingType(), getEnabled(), getStatus(), getDefaultBid(), getMinBid(), getMaxBid(), getBudget(), getPacing(), getCost(), getCtr(), getUtmCodes(), getCountryCodes(), getCountryTargeting(), getOptimize(), getLanguageTargeting(), getPixels(), isSuccess());
    }

    @Override
    public String toString() {
        return "BoostUpdateResponse{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", targetingType='" + targetingType + '\'' +
                ", enabled=" + enabled +
                ", status=" + status +
                ", defaultBid=" + defaultBid +
                ", minBid=" + minBid +
                ", maxBid=" + maxBid +
                ", budget='" + budget + '\'' +
                ", pacing=" + pacing +
                ", cost=" + cost +
                ", ctr=" + ctr +
                ", utmCodes='" + utmCodes + '\'' +
                ", countryCodes=" + countryCodes +
                ", countryTargeting='" + countryTargeting + '\'' +
                ", optimize=" + optimize +
                ", languageTargeting=" + languageTargeting +
                ", pixels=" + pixels +
                ", success=" + success +
                '}';
    }
}
