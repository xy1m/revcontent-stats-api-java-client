package com.xy1m.model.boost;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.xy1m.model.EnumOnOff;
import com.xy1m.model.EnumOptimize;
import com.xy1m.model.conversion.Conversion;

import java.util.List;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BoostAddRequest {
    private String name;
    // default 0.5
    private Double bidAmount;
    // default unlimited
    private String budget;
    // If budget is set to 'unlimited', pacing will default to 'off'. Otherwise, default is 'on'.
    private EnumOnOff pacing;
    // default cpc
    private EnumOptimize optimize;
    private Conversion conversion;
    // default immediately
    private String startDate;
    // default never
    private String endDate;
    // default tag
    private String targetType;
    // default all
    private String targetTargeting;
    private String targetCodes;
    // default all
    private String countryTargeting;
    private List<String> countryCodes;
    // default all
    private String regionTargeting;
    private List<String> regionCodes;
    // default all
    private List<String> deviceTargeting;
    // default all
    private List<String> languageTargeting;
    private String trackingCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBidAmount() {
        return bidAmount;
    }

    public void setBidAmount(Double bidAmount) {
        this.bidAmount = bidAmount;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public EnumOnOff getPacing() {
        return pacing;
    }

    public void setPacing(EnumOnOff pacing) {
        this.pacing = pacing;
    }

    public EnumOptimize getOptimize() {
        return optimize;
    }

    public void setOptimize(EnumOptimize optimize) {
        this.optimize = optimize;
    }

    public Conversion getConversion() {
        return conversion;
    }

    public void setConversion(Conversion conversion) {
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

    public String getTargetCodes() {
        return targetCodes;
    }

    public void setTargetCodes(String targetCodes) {
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

    public List<String> getDeviceTargeting() {
        return deviceTargeting;
    }

    public void setDeviceTargeting(List<String> deviceTargeting) {
        this.deviceTargeting = deviceTargeting;
    }

    public List<String> getLanguageTargeting() {
        return languageTargeting;
    }

    public void setLanguageTargeting(List<String> languageTargeting) {
        this.languageTargeting = languageTargeting;
    }

    public String getTrackingCode() {
        return trackingCode;
    }

    public void setTrackingCode(String trackingCode) {
        this.trackingCode = trackingCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BoostAddRequest)) return false;
        BoostAddRequest that = (BoostAddRequest) o;
        return Objects.equals(getName(), that.getName()) &&
                Objects.equals(getBidAmount(), that.getBidAmount()) &&
                Objects.equals(getBudget(), that.getBudget()) &&
                getPacing() == that.getPacing() &&
                getOptimize() == that.getOptimize() &&
                Objects.equals(getConversion(), that.getConversion()) &&
                Objects.equals(getStartDate(), that.getStartDate()) &&
                Objects.equals(getEndDate(), that.getEndDate()) &&
                Objects.equals(getTargetType(), that.getTargetType()) &&
                Objects.equals(getTargetTargeting(), that.getTargetTargeting()) &&
                Objects.equals(getTargetCodes(), that.getTargetCodes()) &&
                Objects.equals(getCountryTargeting(), that.getCountryTargeting()) &&
                Objects.equals(getCountryCodes(), that.getCountryCodes()) &&
                Objects.equals(getRegionTargeting(), that.getRegionTargeting()) &&
                Objects.equals(getRegionCodes(), that.getRegionCodes()) &&
                Objects.equals(getDeviceTargeting(), that.getDeviceTargeting()) &&
                Objects.equals(getLanguageTargeting(), that.getLanguageTargeting()) &&
                Objects.equals(getTrackingCode(), that.getTrackingCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getBidAmount(), getBudget(), getPacing(), getOptimize(), getConversion(), getStartDate(), getEndDate(), getTargetType(), getTargetTargeting(), getTargetCodes(), getCountryTargeting(), getCountryCodes(), getRegionTargeting(), getRegionCodes(), getDeviceTargeting(), getLanguageTargeting(), getTrackingCode());
    }

    @Override
    public String toString() {
        return "BoostAddRequest{" +
                "name='" + name + '\'' +
                ", bidAmount=" + bidAmount +
                ", budget='" + budget + '\'' +
                ", pacing=" + pacing +
                ", optimize=" + optimize +
                ", conversion=" + conversion +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", targetType='" + targetType + '\'' +
                ", targetTargeting='" + targetTargeting + '\'' +
                ", targetCodes='" + targetCodes + '\'' +
                ", countryTargeting='" + countryTargeting + '\'' +
                ", countryCodes=" + countryCodes +
                ", regionTargeting='" + regionTargeting + '\'' +
                ", regionCodes=" + regionCodes +
                ", deviceTargeting=" + deviceTargeting +
                ", languageTargeting=" + languageTargeting +
                ", trackingCode='" + trackingCode + '\'' +
                '}';
    }


    public static final class BoostAddRequestBuilder {
        private String name;
        // default 0.5
        private Double bidAmount;
        // default unlimited
        private String budget;
        // If budget is set to 'unlimited', pacing will default to 'off'. Otherwise, default is 'on'.
        private EnumOnOff pacing;
        // default cpc
        private EnumOptimize optimize;
        private Conversion conversion;
        // default immediately
        private String startDate;
        // default never
        private String endDate;
        // default tag
        private String targetType;
        // default all
        private String targetTargeting;
        private String targetCodes;
        // default all
        private String countryTargeting;
        private List<String> countryCodes;
        // default all
        private String regionTargeting;
        private List<String> regionCodes;
        // default all
        private List<String> deviceTargeting;
        // default all
        private List<String> languageTargeting;
        private String trackingCode;

        private BoostAddRequestBuilder() {
        }

        public static BoostAddRequestBuilder builder() {
            return new BoostAddRequestBuilder();
        }

        public BoostAddRequestBuilder name(String name) {
            this.name = name;
            return this;
        }

        public BoostAddRequestBuilder bidAmount(Double bidAmount) {
            this.bidAmount = bidAmount;
            return this;
        }

        public BoostAddRequestBuilder budget(String budget) {
            this.budget = budget;
            return this;
        }

        public BoostAddRequestBuilder pacing(EnumOnOff pacing) {
            this.pacing = pacing;
            return this;
        }

        public BoostAddRequestBuilder optimize(EnumOptimize optimize) {
            this.optimize = optimize;
            return this;
        }

        public BoostAddRequestBuilder conversion(Conversion conversion) {
            this.conversion = conversion;
            return this;
        }

        public BoostAddRequestBuilder startDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        public BoostAddRequestBuilder endDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        public BoostAddRequestBuilder targetType(String targetType) {
            this.targetType = targetType;
            return this;
        }

        public BoostAddRequestBuilder targetTargeting(String targetTargeting) {
            this.targetTargeting = targetTargeting;
            return this;
        }

        public BoostAddRequestBuilder targetCodes(String targetCodes) {
            this.targetCodes = targetCodes;
            return this;
        }

        public BoostAddRequestBuilder countryTargeting(String countryTargeting) {
            this.countryTargeting = countryTargeting;
            return this;
        }

        public BoostAddRequestBuilder countryCodes(List<String> countryCodes) {
            this.countryCodes = countryCodes;
            return this;
        }

        public BoostAddRequestBuilder regionTargeting(String regionTargeting) {
            this.regionTargeting = regionTargeting;
            return this;
        }

        public BoostAddRequestBuilder regionCodes(List<String> regionCodes) {
            this.regionCodes = regionCodes;
            return this;
        }

        public BoostAddRequestBuilder deviceTargeting(List<String> deviceTargeting) {
            this.deviceTargeting = deviceTargeting;
            return this;
        }

        public BoostAddRequestBuilder languageTargeting(List<String> languageTargeting) {
            this.languageTargeting = languageTargeting;
            return this;
        }

        public BoostAddRequestBuilder trackingCode(String trackingCode) {
            this.trackingCode = trackingCode;
            return this;
        }

        public BoostAddRequest build() {
            BoostAddRequest boostAddRequest = new BoostAddRequest();
            boostAddRequest.setName(name);
            boostAddRequest.setBidAmount(bidAmount);
            boostAddRequest.setBudget(budget);
            boostAddRequest.setPacing(pacing);
            boostAddRequest.setOptimize(optimize);
            boostAddRequest.setConversion(conversion);
            boostAddRequest.setStartDate(startDate);
            boostAddRequest.setEndDate(endDate);
            boostAddRequest.setTargetType(targetType);
            boostAddRequest.setTargetTargeting(targetTargeting);
            boostAddRequest.setTargetCodes(targetCodes);
            boostAddRequest.setCountryTargeting(countryTargeting);
            boostAddRequest.setCountryCodes(countryCodes);
            boostAddRequest.setRegionTargeting(regionTargeting);
            boostAddRequest.setRegionCodes(regionCodes);
            boostAddRequest.setDeviceTargeting(deviceTargeting);
            boostAddRequest.setLanguageTargeting(languageTargeting);
            boostAddRequest.setTrackingCode(trackingCode);
            return boostAddRequest;
        }
    }
}
