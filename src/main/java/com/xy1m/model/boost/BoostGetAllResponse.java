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
public class BoostGetAllResponse {
    private Long id;
    private String name;
    private String startDate;
    private String endDate;
    private String targetingType;
    private EnumActiveInactive enabled;
    private EnumStatus status;
    private String bidType;
    private Double defaultBid;
    private String minBid;
    private String maxBid;
    private String budget;
    private EnumEnabled pacing;
    private String cost;
    private String ctr;
    private String utmCodes;
    private EnumOptimize optimize;
    private List<String> countryCodes;
    private List<String> deviceTargeting;
    private List<String> regionCodes;
    private String regionTargeting;
    private List<String> languageTargeting;
    private List<Pixel> pixels;

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

    public String getBidType() {
        return bidType;
    }

    public void setBidType(String bidType) {
        this.bidType = bidType;
    }

    public Double getDefaultBid() {
        return defaultBid;
    }

    public void setDefaultBid(Double defaultBid) {
        this.defaultBid = defaultBid;
    }

    public String getMinBid() {
        return minBid;
    }

    public void setMinBid(String minBid) {
        this.minBid = minBid;
    }

    public String getMaxBid() {
        return maxBid;
    }

    public void setMaxBid(String maxBid) {
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

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getCtr() {
        return ctr;
    }

    public void setCtr(String ctr) {
        this.ctr = ctr;
    }

    public String getUtmCodes() {
        return utmCodes;
    }

    public void setUtmCodes(String utmCodes) {
        this.utmCodes = utmCodes;
    }

    public EnumOptimize getOptimize() {
        return optimize;
    }

    public void setOptimize(EnumOptimize optimize) {
        this.optimize = optimize;
    }

    public List<String> getCountryCodes() {
        return countryCodes;
    }

    public void setCountryCodes(List<String> countryCodes) {
        this.countryCodes = countryCodes;
    }

    public List<String> getDeviceTargeting() {
        return deviceTargeting;
    }

    public void setDeviceTargeting(List<String> deviceTargeting) {
        this.deviceTargeting = deviceTargeting;
    }

    public List<String> getRegionCodes() {
        return regionCodes;
    }

    public void setRegionCodes(List<String> regionCodes) {
        this.regionCodes = regionCodes;
    }

    public String getRegionTargeting() {
        return regionTargeting;
    }

    public void setRegionTargeting(String regionTargeting) {
        this.regionTargeting = regionTargeting;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BoostGetAllResponse)) return false;
        BoostGetAllResponse that = (BoostGetAllResponse) o;
        return Objects.equals(getId(), that.getId()) &&
                Objects.equals(getName(), that.getName()) &&
                Objects.equals(getStartDate(), that.getStartDate()) &&
                Objects.equals(getEndDate(), that.getEndDate()) &&
                Objects.equals(getTargetingType(), that.getTargetingType()) &&
                getEnabled() == that.getEnabled() &&
                getStatus() == that.getStatus() &&
                Objects.equals(getBidType(), that.getBidType()) &&
                Objects.equals(getDefaultBid(), that.getDefaultBid()) &&
                Objects.equals(getMinBid(), that.getMinBid()) &&
                Objects.equals(getMaxBid(), that.getMaxBid()) &&
                Objects.equals(getBudget(), that.getBudget()) &&
                getPacing() == that.getPacing() &&
                Objects.equals(getCost(), that.getCost()) &&
                Objects.equals(getCtr(), that.getCtr()) &&
                Objects.equals(getUtmCodes(), that.getUtmCodes()) &&
                getOptimize() == that.getOptimize() &&
                Objects.equals(getCountryCodes(), that.getCountryCodes()) &&
                Objects.equals(getDeviceTargeting(), that.getDeviceTargeting()) &&
                Objects.equals(getRegionCodes(), that.getRegionCodes()) &&
                Objects.equals(getRegionTargeting(), that.getRegionTargeting()) &&
                Objects.equals(getLanguageTargeting(), that.getLanguageTargeting()) &&
                Objects.equals(getPixels(), that.getPixels());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getStartDate(), getEndDate(), getTargetingType(), getEnabled(), getStatus(), getBidType(), getDefaultBid(), getMinBid(), getMaxBid(), getBudget(), getPacing(), getCost(), getCtr(), getUtmCodes(), getOptimize(), getCountryCodes(), getDeviceTargeting(), getRegionCodes(), getRegionTargeting(), getLanguageTargeting(), getPixels());
    }

    @Override
    public String toString() {
        return "BoostGetAllResponse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", targetingType='" + targetingType + '\'' +
                ", enabled=" + enabled +
                ", status=" + status +
                ", bidType='" + bidType + '\'' +
                ", defaultBid=" + defaultBid +
                ", minBid='" + minBid + '\'' +
                ", maxBid='" + maxBid + '\'' +
                ", budget='" + budget + '\'' +
                ", pacing=" + pacing +
                ", cost='" + cost + '\'' +
                ", ctr='" + ctr + '\'' +
                ", utmCodes='" + utmCodes + '\'' +
                ", optimize=" + optimize +
                ", countryCodes=" + countryCodes +
                ", deviceTargeting=" + deviceTargeting +
                ", regionCodes=" + regionCodes +
                ", regionTargeting=" + regionTargeting +
                ", languageTargeting=" + languageTargeting +
                ", pixels=" + pixels +
                '}';
    }
}
