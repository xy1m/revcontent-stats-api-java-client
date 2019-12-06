package com.xy1m.model.boost;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.xy1m.model.conversion.Conversion;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BoostUpdateRequest {
    private String name;
    private Double defaultBid;
    private String budgetType;
    private Double budgetAmount;
    private String pacing;
    private String optimize;
    private Conversion conversion;
    private String startDateTime;
    private String hasEndDate;
    private String endDateTime;
    private String countryTargeting;
    private List<String> countryCodes;
    private String regionTargeting;
    private List<String> regionCodes;
    private List<String> mobileTraffic;
    private List<String> languageTraffic;
    private String utmCodes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDefaultBid() {
        return defaultBid;
    }

    public void setDefaultBid(Double defaultBid) {
        this.defaultBid = defaultBid;
    }

    public String getBudgetType() {
        return budgetType;
    }

    public void setBudgetType(String budgetType) {
        this.budgetType = budgetType;
    }

    public Double getBudgetAmount() {
        return budgetAmount;
    }

    public void setBudgetAmount(Double budgetAmount) {
        this.budgetAmount = budgetAmount;
    }

    public String getPacing() {
        return pacing;
    }

    public void setPacing(String pacing) {
        this.pacing = pacing;
    }

    public String getOptimize() {
        return optimize;
    }

    public void setOptimize(String optimize) {
        this.optimize = optimize;
    }

    public Conversion getConversion() {
        return conversion;
    }

    public void setConversion(Conversion conversion) {
        this.conversion = conversion;
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

    @Override
    public String toString() {
        return "BoostUpdateRequest{" +
                "name='" + name + '\'' +
                ", defaultBid=" + defaultBid +
                ", budgetType='" + budgetType + '\'' +
                ", budgetAmount=" + budgetAmount +
                ", pacing='" + pacing + '\'' +
                ", optimize='" + optimize + '\'' +
                ", conversion=" + conversion +
                ", startDateTime='" + startDateTime + '\'' +
                ", hasEndDate='" + hasEndDate + '\'' +
                ", endDateTime='" + endDateTime + '\'' +
                ", countryTargeting='" + countryTargeting + '\'' +
                ", countryCodes=" + countryCodes +
                ", regionTargeting='" + regionTargeting + '\'' +
                ", regionCodes=" + regionCodes +
                ", mobileTraffic=" + mobileTraffic +
                ", languageTraffic=" + languageTraffic +
                ", utmCodes='" + utmCodes + '\'' +
                '}';
    }


    public static final class BoostUpdateRequestBuilder {
        private String name;
        private Double defaultBid;
        private String budgetType;
        private Double budgetAmount;
        private String pacing;
        private String optimize;
        private Conversion conversion;
        private String startDateTime;
        private String hasEndDate;
        private String endDateTime;
        private String countryTargeting;
        private List<String> countryCodes;
        private String regionTargeting;
        private List<String> regionCodes;
        private List<String> mobileTraffic;
        private List<String> languageTraffic;
        private String utmCodes;

        private BoostUpdateRequestBuilder() {
        }

        public static BoostUpdateRequestBuilder builder() {
            return new BoostUpdateRequestBuilder();
        }

        public BoostUpdateRequestBuilder name(String name) {
            this.name = name;
            return this;
        }

        public BoostUpdateRequestBuilder defaultBid(Double defaultBid) {
            this.defaultBid = defaultBid;
            return this;
        }

        public BoostUpdateRequestBuilder budgetType(String budgetType) {
            this.budgetType = budgetType;
            return this;
        }

        public BoostUpdateRequestBuilder budgetAmount(Double budgetAmount) {
            this.budgetAmount = budgetAmount;
            return this;
        }

        public BoostUpdateRequestBuilder pacing(String pacing) {
            this.pacing = pacing;
            return this;
        }

        public BoostUpdateRequestBuilder optimize(String optimize) {
            this.optimize = optimize;
            return this;
        }

        public BoostUpdateRequestBuilder conversion(Conversion conversion) {
            this.conversion = conversion;
            return this;
        }

        public BoostUpdateRequestBuilder startDateTime(String startDateTime) {
            this.startDateTime = startDateTime;
            return this;
        }

        public BoostUpdateRequestBuilder hasEndDate(String hasEndDate) {
            this.hasEndDate = hasEndDate;
            return this;
        }

        public BoostUpdateRequestBuilder endDateTime(String endDateTime) {
            this.endDateTime = endDateTime;
            return this;
        }

        public BoostUpdateRequestBuilder countryTargeting(String countryTargeting) {
            this.countryTargeting = countryTargeting;
            return this;
        }

        public BoostUpdateRequestBuilder countryCodes(List<String> countryCodes) {
            this.countryCodes = countryCodes;
            return this;
        }

        public BoostUpdateRequestBuilder regionTargeting(String regionTargeting) {
            this.regionTargeting = regionTargeting;
            return this;
        }

        public BoostUpdateRequestBuilder regionCodes(List<String> regionCodes) {
            this.regionCodes = regionCodes;
            return this;
        }

        public BoostUpdateRequestBuilder mobileTraffic(List<String> mobileTraffic) {
            this.mobileTraffic = mobileTraffic;
            return this;
        }

        public BoostUpdateRequestBuilder languageTraffic(List<String> languageTraffic) {
            this.languageTraffic = languageTraffic;
            return this;
        }

        public BoostUpdateRequestBuilder utmCodes(String utmCodes) {
            this.utmCodes = utmCodes;
            return this;
        }

        public BoostUpdateRequest build() {
            BoostUpdateRequest boostUpdateRequest = new BoostUpdateRequest();
            boostUpdateRequest.setName(name);
            boostUpdateRequest.setDefaultBid(defaultBid);
            boostUpdateRequest.setBudgetType(budgetType);
            boostUpdateRequest.setBudgetAmount(budgetAmount);
            boostUpdateRequest.setPacing(pacing);
            boostUpdateRequest.setOptimize(optimize);
            boostUpdateRequest.setConversion(conversion);
            boostUpdateRequest.setStartDateTime(startDateTime);
            boostUpdateRequest.setHasEndDate(hasEndDate);
            boostUpdateRequest.setEndDateTime(endDateTime);
            boostUpdateRequest.setCountryTargeting(countryTargeting);
            boostUpdateRequest.setCountryCodes(countryCodes);
            boostUpdateRequest.setRegionTargeting(regionTargeting);
            boostUpdateRequest.setRegionCodes(regionCodes);
            boostUpdateRequest.setMobileTraffic(mobileTraffic);
            boostUpdateRequest.setLanguageTraffic(languageTraffic);
            boostUpdateRequest.setUtmCodes(utmCodes);
            return boostUpdateRequest;
        }
    }
}
