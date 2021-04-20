package com.xy1m.model.boost;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.xy1m.model.EnumEnabled;
import com.xy1m.model.EnumOptimize;
import com.xy1m.model.EnumStatus;
import com.xy1m.model.conversion.Conversion;

import java.util.List;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public
class Boost {
    // create
    private String id;
    private String name;
    private List<String> trafficTypes;
    // default 0.5
    private String bidAmount;
    // default unlimited
    private String budget;
    // If budget is set to 'unlimited', pacing will default to 'off'. Otherwise, default is 'on'.
    private EnumEnabled pacing;
    // default cpc
    private EnumOptimize optimize;
    private List<Conversion> conversion;
    // default immediately
    private String startDate;
    // default never
    private String endDate;
    private String targetType;
    private String targetTargeting;
    private List<String> targetCodes;
    private String countryTargeting;
    private List<String> countryCodes;
    private String regionTargeting;
    private List<String> regionCodes;
    private String zipcodeTargeting;
    private List<String> zipcodeCodes;
    private String dmaTargeting;
    private List<String> dmaCodes;
    private List<String> deviceTargeting;
    private List<String> osTargeting;
    private List<String> languageTargeting;
    private String trackingCode;
    // cpa
    private List<Pixel> pixels;
    // updateContent boost setting
    private String defaultBid;
    private String budgetType;
    private String budgetAmount;
    private String startDateTime;
    private String hasEndDate;
    private String endDateTime;
    private List<String> mobileTraffic;
    private List<String> languageTraffic;
    private String utmCodes;
    // updateContent boost status
    private EnumEnabled enabled;
    private EnumStatus status;
    // all boosts
    private String minBid;
    private String maxBid;
    private String cost;
    private String ctr;
    private String pixelUrl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBidAmount() {
        return bidAmount;
    }

    public void setBidAmount(String bidAmount) {
        this.bidAmount = bidAmount;
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

    public EnumOptimize getOptimize() {
        return optimize;
    }

    public void setOptimize(EnumOptimize optimize) {
        this.optimize = optimize;
    }

    public List<Conversion> getConversion() {
        return conversion;
    }

    public void setConversion(List<Conversion> conversion) {
        this.conversion = conversion;
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

    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public String getTargetTargeting() {
        return targetTargeting;
    }

    public void setTargetTargeting(String targetTargeting) {
        this.targetTargeting = targetTargeting;
    }

    public List<String> getTargetCodes() {
        return targetCodes;
    }

    public void setTargetCodes(List<String> targetCodes) {
        this.targetCodes = targetCodes;
    }

    public String getCountryTargeting() {
        return countryTargeting;
    }

    public void setCountryTargeting(String countryTargeting) {
        this.countryTargeting = countryTargeting;
    }

    public List<String> getCountryCodes() {
        return countryCodes;
    }

    public void setCountryCodes(List<String> countryCodes) {
        this.countryCodes = countryCodes;
    }

    public String getRegionTargeting() {
        return regionTargeting;
    }

    public void setRegionTargeting(String regionTargeting) {
        this.regionTargeting = regionTargeting;
    }

    public List<String> getRegionCodes() {
        return regionCodes;
    }

    public void setRegionCodes(List<String> regionCodes) {
        this.regionCodes = regionCodes;
    }

    public String getZipcodeTargeting() {
        return zipcodeTargeting;
    }

    public void setZipcodeTargeting(String zipcodeTargeting) {
        this.zipcodeTargeting = zipcodeTargeting;
    }

    public List<String> getZipcodeCodes() {
        return zipcodeCodes;
    }

    public void setZipcodeCodes(List<String> zipcodeCodes) {
        this.zipcodeCodes = zipcodeCodes;
    }

    public String getDmaTargeting() {
        return dmaTargeting;
    }

    public void setDmaTargeting(String dmaTargeting) {
        this.dmaTargeting = dmaTargeting;
    }

    public List<String> getDmaCodes() {
        return dmaCodes;
    }

    public void setDmaCodes(List<String> dmaCodes) {
        this.dmaCodes = dmaCodes;
    }

    public List<String> getDeviceTargeting() {
        return deviceTargeting;
    }

    public void setDeviceTargeting(List<String> deviceTargeting) {
        this.deviceTargeting = deviceTargeting;
    }

    public List<String> getOsTargeting() {
        return osTargeting;
    }

    public void setOsTargeting(List<String> osTargeting) {
        this.osTargeting = osTargeting;
    }

    public List<String> getLanguageTargeting() {
        return languageTargeting;
    }

    public void setLanguageTargeting(List<String> languageTargeting) {
        this.languageTargeting = languageTargeting;
    }

    public List<String> getTrafficTypes() {
        return trafficTypes;
    }

    public Boost trafficTypes(List<String> trafficTypes) {
        this.trafficTypes = trafficTypes;
        return this;
    }

    public String getTrackingCode() {
        return trackingCode;
    }

    public void setTrackingCode(String trackingCode) {
        this.trackingCode = trackingCode;
    }

    public List<Pixel> getPixels() {
        return pixels;
    }

    public void setPixels(List<Pixel> pixels) {
        this.pixels = pixels;
    }

    public String getDefaultBid() {
        return defaultBid;
    }

    public void setDefaultBid(String defaultBid) {
        this.defaultBid = defaultBid;
    }

    public String getBudgetType() {
        return budgetType;
    }

    public void setBudgetType(String budgetType) {
        this.budgetType = budgetType;
    }

    public String getBudgetAmount() {
        return budgetAmount;
    }

    public void setBudgetAmount(String budgetAmount) {
        this.budgetAmount = budgetAmount;
    }

    public String getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }

    public String getHasEndDate() {
        return hasEndDate;
    }

    public void setHasEndDate(String hasEndDate) {
        this.hasEndDate = hasEndDate;
    }

    public String getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
    }

    public List<String> getMobileTraffic() {
        return mobileTraffic;
    }

    public void setMobileTraffic(List<String> mobileTraffic) {
        this.mobileTraffic = mobileTraffic;
    }

    public List<String> getLanguageTraffic() {
        return languageTraffic;
    }

    public void setLanguageTraffic(List<String> languageTraffic) {
        this.languageTraffic = languageTraffic;
    }

    public String getUtmCodes() {
        return utmCodes;
    }

    public void setUtmCodes(String utmCodes) {
        this.utmCodes = utmCodes;
    }

    public EnumEnabled getEnabled() {
        return enabled;
    }

    public void setEnabled(EnumEnabled enabled) {
        this.enabled = enabled;
    }

    public EnumStatus getStatus() {
        return status;
    }

    public void setStatus(EnumStatus status) {
        this.status = status;
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

    public String getPixelUrl() {
        return pixelUrl;
    }

    public void setPixelUrl(String pixelUrl) {
        this.pixelUrl = pixelUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Boost)) return false;
        Boost boost = (Boost) o;
        return Objects.equals(getId(), boost.getId()) &&
                Objects.equals(getName(), boost.getName()) &&
                Objects.equals(getBidAmount(), boost.getBidAmount()) &&
                Objects.equals(getBudget(), boost.getBudget()) &&
                getPacing() == boost.getPacing() &&
                getOptimize() == boost.getOptimize() &&
                Objects.equals(getConversion(), boost.getConversion()) &&
                Objects.equals(getStartDate(), boost.getStartDate()) &&
                Objects.equals(getEndDate(), boost.getEndDate()) &&
                Objects.equals(getTargetType(), boost.getTargetType()) &&
                Objects.equals(getTargetTargeting(), boost.getTargetTargeting()) &&
                Objects.equals(getTargetCodes(), boost.getTargetCodes()) &&
                Objects.equals(getCountryTargeting(), boost.getCountryTargeting()) &&
                Objects.equals(getCountryCodes(), boost.getCountryCodes()) &&
                Objects.equals(getRegionTargeting(), boost.getRegionTargeting()) &&
                Objects.equals(getRegionCodes(), boost.getRegionCodes()) &&
                Objects.equals(getZipcodeTargeting(), boost.getZipcodeTargeting()) &&
                Objects.equals(getZipcodeCodes(), boost.getZipcodeCodes()) &&
                Objects.equals(getDmaTargeting(), boost.getDmaTargeting()) &&
                Objects.equals(getDmaCodes(), boost.getDmaCodes()) &&
                Objects.equals(getDeviceTargeting(), boost.getDeviceTargeting()) &&
                Objects.equals(getLanguageTargeting(), boost.getLanguageTargeting()) &&
                Objects.equals(getTrackingCode(), boost.getTrackingCode()) &&
                Objects.equals(getPixels(), boost.getPixels()) &&
                Objects.equals(getDefaultBid(), boost.getDefaultBid()) &&
                Objects.equals(getBudgetType(), boost.getBudgetType()) &&
                Objects.equals(getBudgetAmount(), boost.getBudgetAmount()) &&
                Objects.equals(getStartDateTime(), boost.getStartDateTime()) &&
                Objects.equals(getHasEndDate(), boost.getHasEndDate()) &&
                Objects.equals(getEndDateTime(), boost.getEndDateTime()) &&
                Objects.equals(getMobileTraffic(), boost.getMobileTraffic()) &&
                Objects.equals(getLanguageTraffic(), boost.getLanguageTraffic()) &&
                Objects.equals(getUtmCodes(), boost.getUtmCodes()) &&
                getEnabled() == boost.getEnabled() &&
                getStatus() == boost.getStatus() &&
                Objects.equals(getMinBid(), boost.getMinBid()) &&
                Objects.equals(getMaxBid(), boost.getMaxBid()) &&
                Objects.equals(getCost(), boost.getCost()) &&
                Objects.equals(getCtr(), boost.getCtr()) &&
                Objects.equals(getPixelUrl(), boost.getPixelUrl());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getBidAmount(), getBudget(), getPacing(), getOptimize(), getConversion(), getStartDate(), getEndDate(), getTargetType(), getTargetTargeting(), getTargetCodes(), getCountryTargeting(), getCountryCodes(), getRegionTargeting(), getRegionCodes(), getDeviceTargeting(), getOsTargeting(), getLanguageTargeting(), getTrackingCode(), getPixels(), getDefaultBid(), getBudgetType(), getBudgetAmount(), getStartDateTime(), getHasEndDate(), getEndDateTime(), getMobileTraffic(), getLanguageTraffic(), getUtmCodes(), getEnabled(), getStatus(), getMinBid(), getMaxBid(), getCost(), getCtr(), getPixelUrl());
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Boost{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", bidAmount='").append(bidAmount).append('\'');
        sb.append(", budget='").append(budget).append('\'');
        sb.append(", pacing=").append(pacing);
        sb.append(", optimize=").append(optimize);
        sb.append(", conversion=").append(conversion);
        sb.append(", startDate='").append(startDate).append('\'');
        sb.append(", endDate='").append(endDate).append('\'');
        sb.append(", targetType='").append(targetType).append('\'');
        sb.append(", targetTargeting='").append(targetTargeting).append('\'');
        sb.append(", targetCodes=").append(targetCodes);
        sb.append(", countryTargeting='").append(countryTargeting).append('\'');
        sb.append(", countryCodes=").append(countryCodes);
        sb.append(", regionTargeting='").append(regionTargeting).append('\'');
        sb.append(", regionCodes=").append(regionCodes);
        sb.append(", zipcodeTargeting='").append(zipcodeTargeting).append('\'');
        sb.append(", zipcodeCodes=").append(zipcodeCodes);
        sb.append(", dmaTargeting='").append(dmaTargeting).append('\'');
        sb.append(", dmaCodes=").append(dmaCodes);
        sb.append(", deviceTargeting=").append(deviceTargeting);
        sb.append(", osTargeting=").append(osTargeting);
        sb.append(", languageTargeting=").append(languageTargeting);
        sb.append(", trackingCode='").append(trackingCode).append('\'');
        sb.append(", pixels=").append(pixels);
        sb.append(", defaultBid='").append(defaultBid).append('\'');
        sb.append(", budgetType='").append(budgetType).append('\'');
        sb.append(", budgetAmount='").append(budgetAmount).append('\'');
        sb.append(", startDateTime='").append(startDateTime).append('\'');
        sb.append(", hasEndDate='").append(hasEndDate).append('\'');
        sb.append(", endDateTime='").append(endDateTime).append('\'');
        sb.append(", mobileTraffic=").append(mobileTraffic);
        sb.append(", languageTraffic=").append(languageTraffic);
        sb.append(", utmCodes='").append(utmCodes).append('\'');
        sb.append(", enabled=").append(enabled);
        sb.append(", status=").append(status);
        sb.append(", minBid='").append(minBid).append('\'');
        sb.append(", maxBid='").append(maxBid).append('\'');
        sb.append(", cost='").append(cost).append('\'');
        sb.append(", ctr='").append(ctr).append('\'');
        sb.append(", pixelUrl='").append(pixelUrl).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static class APIRequestAddBuilder {
        //Required
        private String name;
        //Required
        private List<String> trafficTypes;
        // default 0.5
        private String bidAmount;
        // default unlimited
        private String budget;
        // If budget is set to 'unlimited', pacing will default to 'off'. Otherwise, default is 'on'.
        private EnumEnabled pacing;
        //Campaign Scheduling Hours on
        private int[] schedule;
        // default cpc
        private EnumOptimize optimize;
        private List<Conversion> conversion;
        // default immediately
        private String startDate;
        // default never
        private String endDate;
        // default tag removed
        // private String targetType;
        // default all removed
        // private String targetTargeting;
        // removed
        // private List<String> targetCodes;
        // default all
        private String countryTargeting;
        private List<String> countryCodes;
        // default all
        private String regionTargeting;
        private List<String> regionCodes;
        // default all
        private List<String> deviceTargeting;
        private String zipcodeTargeting;
        private List<String> zipcodeCodes;
        // default all
        private String dmaTargeting;
        private List<String> dmaCodes;
        // default all
        private List<String> osTargeting;
        // default all
        private List<String> languageTargeting;
        // default all
        private List<String> browser_targeting;
        private String trackingCode;
        private String pixelUrl;

        private APIRequestAddBuilder() {
        }

        public static APIRequestAddBuilder builder() {
            return new APIRequestAddBuilder();
        }

        public APIRequestAddBuilder name(String name) {
            this.name = name;
            return this;
        }

        public APIRequestAddBuilder bidAmount(String bidAmount) {
            this.bidAmount = bidAmount;
            return this;
        }

        public APIRequestAddBuilder budget(String budget) {
            this.budget = budget;
            return this;
        }

        public APIRequestAddBuilder pacing(EnumEnabled pacing) {
            this.pacing = pacing;
            return this;
        }

        public APIRequestAddBuilder optimize(EnumOptimize optimize) {
            this.optimize = optimize;
            return this;
        }

        public APIRequestAddBuilder conversion(List<Conversion> conversion) {
            this.conversion = conversion;
            return this;
        }

        public APIRequestAddBuilder startDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        public APIRequestAddBuilder endDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        public APIRequestAddBuilder countryTargeting(String countryTargeting) {
            this.countryTargeting = countryTargeting;
            return this;
        }

        public APIRequestAddBuilder countryCodes(List<String> countryCodes) {
            this.countryCodes = countryCodes;
            return this;
        }

        public APIRequestAddBuilder regionTargeting(String regionTargeting) {
            this.regionTargeting = regionTargeting;
            return this;
        }

        public APIRequestAddBuilder regionCodes(List<String> regionCodes) {
            this.regionCodes = regionCodes;
            return this;
        }

        public APIRequestAddBuilder zipcodeTargeting(String zipcodeTargeting) {
            this.zipcodeTargeting = zipcodeTargeting;
            return this;
        }

        public APIRequestAddBuilder zipcodeCodes(List<String> zipcodeCodes) {
            this.zipcodeCodes = zipcodeCodes;
            return this;
        }

        public APIRequestAddBuilder dmaTargeting(String dmaTargeting) {
            this.dmaTargeting = dmaTargeting;
            return this;
        }

        public APIRequestAddBuilder dmaCodes(List<String> dmaCodes) {
            this.dmaCodes = dmaCodes;
            return this;
        }

        public APIRequestAddBuilder deviceTargeting(List<String> deviceTargeting) {
            this.deviceTargeting = deviceTargeting;
            return this;
        }

        public APIRequestAddBuilder osTargeting(List<String> osTargeting) {
            this.osTargeting = osTargeting;
            return this;
        }

        public APIRequestAddBuilder languageTargeting(List<String> languageTargeting) {
            this.languageTargeting = languageTargeting;
            return this;
        }

        public APIRequestAddBuilder trafficTypes(List<String> trafficTypes) {
            this.trafficTypes = trafficTypes;
            return this;
        }

        public APIRequestAddBuilder trackingCode(String trackingCode) {
            this.trackingCode = trackingCode;
            return this;
        }

        public APIRequestAddBuilder pixelUrl(String pixelUrl) {
            this.pixelUrl = pixelUrl;
            return this;
        }

        public Boost build() {
            Boost boost = new Boost();
            boost.name = this.name;
            boost.bidAmount = this.bidAmount;
            boost.budget = this.budget;
            boost.pacing = this.pacing;
            boost.optimize = this.optimize;
            boost.conversion = this.conversion;
            boost.startDate = this.startDate;
            boost.endDate = this.endDate;
            boost.countryTargeting = this.countryTargeting;
            boost.countryCodes = this.countryCodes;
            boost.regionTargeting = this.regionTargeting;
            boost.regionCodes = this.regionCodes;
            boost.zipcodeTargeting = this.zipcodeTargeting;
            boost.zipcodeCodes = this.zipcodeCodes;
            boost.dmaTargeting = this.dmaTargeting;
            boost.dmaCodes = this.dmaCodes;
            boost.deviceTargeting = this.deviceTargeting;
            boost.osTargeting = this.osTargeting;
            boost.languageTargeting = this.languageTargeting;
            boost.trackingCode = this.trackingCode;
            boost.trafficTypes = this.trafficTypes;
            boost.pixelUrl = this.pixelUrl;
            return boost;
        }
    }

    public static class APIRequestUpdateBuilder {
        private String id;
        private EnumEnabled enabled;
        private String name;
        private String defaultBid;
        private String budgetType;
        private String budgetAmount;
        private EnumEnabled pacing;
        private EnumOptimize optimize;
        private List<Conversion> conversion;
        private String startDateTime;
        private String hasEndDate;
        private String endDateTime;
        private String countryTargeting;
        private List<String> countryCodes;
        private String regionTargeting;
        private List<String> regionCodes;
        private List<String> deviceTargeting;
        private List<String> osTargeting;
        private List<String> mobileTraffic;
        private List<String> languageTraffic;
        private List<String> trafficTypes;
        private String utmCodes;
        private String pixelUrl;

        private APIRequestUpdateBuilder() {
        }

        public static APIRequestUpdateBuilder builder() {
            return new APIRequestUpdateBuilder();
        }

        public APIRequestUpdateBuilder id(String id) {
            this.id = id;
            return this;
        }

        public APIRequestUpdateBuilder enabled(EnumEnabled enabled) {
            this.enabled = enabled;
            return this;
        }

        public APIRequestUpdateBuilder name(String name) {
            this.name = name;
            return this;
        }

        public APIRequestUpdateBuilder defaultBid(String defaultBid) {
            this.defaultBid = defaultBid;
            return this;
        }

        public APIRequestUpdateBuilder budgetType(String budgetType) {
            this.budgetType = budgetType;
            return this;
        }

        public APIRequestUpdateBuilder budgetAmount(String budgetAmount) {
            this.budgetAmount = budgetAmount;
            return this;
        }

        public APIRequestUpdateBuilder pacing(EnumEnabled pacing) {
            this.pacing = pacing;
            return this;
        }

        public APIRequestUpdateBuilder optimize(EnumOptimize optimize) {
            this.optimize = optimize;
            return this;
        }

        public APIRequestUpdateBuilder conversion(List<Conversion> conversion) {
            this.conversion = conversion;
            return this;
        }

        public APIRequestUpdateBuilder startDateTime(String startDateTime) {
            this.startDateTime = startDateTime;
            return this;
        }

        public APIRequestUpdateBuilder hasEndDate(String hasEndDate) {
            this.hasEndDate = hasEndDate;
            return this;
        }

        public APIRequestUpdateBuilder endDateTime(String endDateTime) {
            this.endDateTime = endDateTime;
            return this;
        }

        public APIRequestUpdateBuilder countryTargeting(String countryTargeting) {
            this.countryTargeting = countryTargeting;
            return this;
        }

        public APIRequestUpdateBuilder countryCodes(List<String> countryCodes) {
            this.countryCodes = countryCodes;
            return this;
        }

        public APIRequestUpdateBuilder regionTargeting(String regionTargeting) {
            this.regionTargeting = regionTargeting;
            return this;
        }

        public APIRequestUpdateBuilder deviceTargeting(List<String> deviceTargeting) {
            this.deviceTargeting = deviceTargeting;
            return this;
        }

        public APIRequestUpdateBuilder osTargeting(List<String> osTargeting) {
            this.osTargeting = osTargeting;
            return this;
        }

        public APIRequestUpdateBuilder regionCodes(List<String> regionCodes) {
            this.regionCodes = regionCodes;
            return this;
        }

        public APIRequestUpdateBuilder mobileTraffic(List<String> mobileTraffic) {
            this.mobileTraffic = mobileTraffic;
            return this;
        }

        public APIRequestUpdateBuilder languageTraffic(List<String> languageTraffic) {
            this.languageTraffic = languageTraffic;
            return this;
        }

        public APIRequestUpdateBuilder trafficTypes(List<String> trafficTypes) {
            this.trafficTypes = trafficTypes;
            return this;
        }

        public APIRequestUpdateBuilder utmCodes(String utmCodes) {
            this.utmCodes = utmCodes;
            return this;
        }

        public APIRequestUpdateBuilder pixelUrl(String pixelUrl) {
            this.pixelUrl = pixelUrl;
            return this;
        }

        public Boost build() {
            Boost boost = new Boost();
            boost.id = this.id;
            boost.enabled = this.enabled;
            boost.name = this.name;
            boost.defaultBid = this.defaultBid;
            boost.budgetType = this.budgetType;
            boost.budgetAmount = this.budgetAmount;
            boost.pacing = this.pacing;
            boost.optimize = this.optimize;
            boost.conversion = this.conversion;
            boost.startDateTime = this.startDateTime;
            boost.hasEndDate = this.hasEndDate;
            boost.endDateTime = this.endDateTime;
            boost.countryTargeting = this.countryTargeting;
            boost.countryCodes = this.countryCodes;
            boost.regionTargeting = this.regionTargeting;
            boost.regionCodes = this.regionCodes;
            boost.deviceTargeting = this.deviceTargeting;
            boost.osTargeting = this.osTargeting;
            boost.mobileTraffic = this.mobileTraffic;
            boost.languageTargeting = this.languageTraffic;
            boost.utmCodes = this.utmCodes;
            boost.pixelUrl = this.pixelUrl;
            return boost;
        }
    }
}
