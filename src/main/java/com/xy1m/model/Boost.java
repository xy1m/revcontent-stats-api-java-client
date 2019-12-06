package com.xy1m.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.xy1m.RevContent;
import com.xy1m.model.auth.Authentication;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Boost {
    // create
    private String id;
    private String name;
    private BigDecimal bidAmount;
    private String budget;
    private String pacing;
    private String optimize;
    private Object conversion;
    private String startDate;
    private String endDate;
    private String targetType;
    private String targetTargeting;
    private String targetCodes;
    private String countryTargeting;
    private List<String> countryCodes;
    private String regionTargeting;
    private List<String> regionCodes;
    private List<String> deviceTargeting;
    private List<String> languageTargeting;
    private String trackingCode;
    // cpa
    private List<Pixel> pixels;
    // update boost setting
    private BigDecimal defaultBid;
    private String budgetType;
    private BigDecimal budgetAmount;
    private String startDateTime;
    private String hasEndDate;
    private String endDateTime;
    private List<String> mobileTraffic;
    private List<String> languageTraffic;
    private String utmCodes;
    // update boost status
    private String enabled;
    private String status;
    // all boosts
    private String minBid;
    private String maxBid;
    private String cost;
    private String ctr;

    public static DataResults<Boost> getAll(Authentication auth) {
        return RevContent.getInstance().campaignsService().getAll(auth);
    }

    public CampaignResult<Boost> createCpc(Authentication auth) {
        return RevContent.getInstance().campaignsService().createCpc(auth, this);
    }

    public CampaignResult<Boost> createCpa(Authentication auth) {
        return RevContent.getInstance().campaignsService().createCpa(auth, this);
    }

    public Boost update(Authentication auth, String id) {
        return RevContent.getInstance().campaignsService().update(auth, id, this);
    }

    public Boost updateStatus(Authentication auth) {
        return RevContent.getInstance().campaignsService().updateStatus(auth, this);
    }


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

    public BigDecimal getBidAmount() {
        return bidAmount;
    }

    public void setBidAmount(BigDecimal bidAmount) {
        this.bidAmount = bidAmount;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
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

    public Object getConversion() {
        return conversion;
    }

    public void setConversion(Object conversion) {
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

    public List<Pixel> getPixels() {
        return pixels;
    }

    public void setPixels(List<Pixel> pixels) {
        this.pixels = pixels;
    }

    public BigDecimal getDefaultBid() {
        return defaultBid;
    }

    public void setDefaultBid(BigDecimal defaultBid) {
        this.defaultBid = defaultBid;
    }

    public String getBudgetType() {
        return budgetType;
    }

    public void setBudgetType(String budgetType) {
        this.budgetType = budgetType;
    }

    public BigDecimal getBudgetAmount() {
        return budgetAmount;
    }

    public void setBudgetAmount(BigDecimal budgetAmount) {
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

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Boost)) return false;
        Boost boost = (Boost) o;
        return Objects.equals(getId(), boost.getId()) &&
                Objects.equals(getName(), boost.getName()) &&
                Objects.equals(getBidAmount(), boost.getBidAmount()) &&
                Objects.equals(getBudget(), boost.getBudget()) &&
                Objects.equals(getPacing(), boost.getPacing()) &&
                Objects.equals(getOptimize(), boost.getOptimize()) &&
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
                Objects.equals(getEnabled(), boost.getEnabled()) &&
                Objects.equals(getStatus(), boost.getStatus()) &&
                Objects.equals(getMinBid(), boost.getMinBid()) &&
                Objects.equals(getMaxBid(), boost.getMaxBid()) &&
                Objects.equals(getCost(), boost.getCost()) &&
                Objects.equals(getCtr(), boost.getCtr());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getBidAmount(), getBudget(), getPacing(), getOptimize(), getConversion(), getStartDate(), getEndDate(), getTargetType(), getTargetTargeting(), getTargetCodes(), getCountryTargeting(), getCountryCodes(), getRegionTargeting(), getRegionCodes(), getDeviceTargeting(), getLanguageTargeting(), getTrackingCode(), getPixels(), getDefaultBid(), getBudgetType(), getBudgetAmount(), getStartDateTime(), getHasEndDate(), getEndDateTime(), getMobileTraffic(), getLanguageTraffic(), getUtmCodes(), getEnabled(), getStatus(), getMinBid(), getMaxBid(), getCost(), getCtr());
    }

    @Override
    public String toString() {
        return "Boost{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", bidAmount=" + bidAmount +
                ", budget='" + budget + '\'' +
                ", pacing='" + pacing + '\'' +
                ", optimize='" + optimize + '\'' +
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
                ", pixels=" + pixels +
                ", defaultBid=" + defaultBid +
                ", budgetType='" + budgetType + '\'' +
                ", budgetAmount=" + budgetAmount +
                ", startDateTime='" + startDateTime + '\'' +
                ", hasEndDate='" + hasEndDate + '\'' +
                ", endDateTime='" + endDateTime + '\'' +
                ", mobileTraffic=" + mobileTraffic +
                ", languageTraffic=" + languageTraffic +
                ", utmCodes='" + utmCodes + '\'' +
                ", enabled='" + enabled + '\'' +
                ", status='" + status + '\'' +
                ", minBid='" + minBid + '\'' +
                ", maxBid='" + maxBid + '\'' +
                ", cost='" + cost + '\'' +
                ", ctr='" + ctr + '\'' +
                '}';
    }

    public static final class BoostBuilder {
        // create
        private String id;
        private String name;
        private BigDecimal bidAmount;
        private String budget;
        private String pacing;
        private String optimize;
        private Object conversion;
        private String startDate;
        private String endDate;
        private String targetType;
        private String targetTargeting;
        private String targetCodes;
        private String countryTargeting;
        private List<String> countryCodes;
        private String regionTargeting;
        private List<String> regionCodes;
        private List<String> deviceTargeting;
        private List<String> languageTargeting;
        private String trackingCode;
        // cpa
        private List<Pixel> pixels;
        // update boost setting
        private BigDecimal defaultBid;
        private String budgetType;
        private BigDecimal budgetAmount;
        private String startDateTime;
        private String hasEndDate;
        private String endDateTime;
        private List<String> mobileTraffic;
        private List<String> languageTraffic;
        private String utmCodes;
        // update boost status
        private String enabled;
        private String status;
        // all boosts
        private String minBid;
        private String maxBid;
        private String cost;
        private String ctr;

        private BoostBuilder() {
        }

        public static BoostBuilder builder() {
            return new BoostBuilder();
        }

        public BoostBuilder id(String id) {
            this.id = id;
            return this;
        }

        public BoostBuilder name(String name) {
            this.name = name;
            return this;
        }

        public BoostBuilder bidAmount(BigDecimal bidAmount) {
            this.bidAmount = bidAmount;
            return this;
        }

        public BoostBuilder budget(String budget) {
            this.budget = budget;
            return this;
        }

        public BoostBuilder pacing(String pacing) {
            this.pacing = pacing;
            return this;
        }

        public BoostBuilder optimize(String optimize) {
            this.optimize = optimize;
            return this;
        }

        public BoostBuilder conversion(Object conversion) {
            this.conversion = conversion;
            return this;
        }

        public BoostBuilder startDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        public BoostBuilder endDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        public BoostBuilder targetType(String targetType) {
            this.targetType = targetType;
            return this;
        }

        public BoostBuilder targetTargeting(String targetTargeting) {
            this.targetTargeting = targetTargeting;
            return this;
        }

        public BoostBuilder targetCodes(String targetCodes) {
            this.targetCodes = targetCodes;
            return this;
        }

        public BoostBuilder countryTargeting(String countryTargeting) {
            this.countryTargeting = countryTargeting;
            return this;
        }

        public BoostBuilder countryCodes(List<String> countryCodes) {
            this.countryCodes = countryCodes;
            return this;
        }

        public BoostBuilder regionTargeting(String regionTargeting) {
            this.regionTargeting = regionTargeting;
            return this;
        }

        public BoostBuilder regionCodes(List<String> regionCodes) {
            this.regionCodes = regionCodes;
            return this;
        }

        public BoostBuilder deviceTargeting(List<String> deviceTargeting) {
            this.deviceTargeting = deviceTargeting;
            return this;
        }

        public BoostBuilder languageTargeting(List<String> languageTargeting) {
            this.languageTargeting = languageTargeting;
            return this;
        }

        public BoostBuilder trackingCode(String trackingCode) {
            this.trackingCode = trackingCode;
            return this;
        }

        public BoostBuilder pixels(List<Pixel> pixels) {
            this.pixels = pixels;
            return this;
        }

        public BoostBuilder defaultBid(BigDecimal defaultBid) {
            this.defaultBid = defaultBid;
            return this;
        }

        public BoostBuilder budgetType(String budgetType) {
            this.budgetType = budgetType;
            return this;
        }

        public BoostBuilder budgetAmount(BigDecimal budgetAmount) {
            this.budgetAmount = budgetAmount;
            return this;
        }

        public BoostBuilder startDateTime(String startDateTime) {
            this.startDateTime = startDateTime;
            return this;
        }

        public BoostBuilder hasEndDate(String hasEndDate) {
            this.hasEndDate = hasEndDate;
            return this;
        }

        public BoostBuilder endDateTime(String endDateTime) {
            this.endDateTime = endDateTime;
            return this;
        }

        public BoostBuilder mobileTraffic(List<String> mobileTraffic) {
            this.mobileTraffic = mobileTraffic;
            return this;
        }

        public BoostBuilder languageTraffic(List<String> languageTraffic) {
            this.languageTraffic = languageTraffic;
            return this;
        }

        public BoostBuilder utmCodes(String utmCodes) {
            this.utmCodes = utmCodes;
            return this;
        }

        public BoostBuilder enabled(String enabled) {
            this.enabled = enabled;
            return this;
        }

        public BoostBuilder status(String status) {
            this.status = status;
            return this;
        }

        public BoostBuilder minBid(String minBid) {
            this.minBid = minBid;
            return this;
        }

        public BoostBuilder maxBid(String maxBid) {
            this.maxBid = maxBid;
            return this;
        }

        public BoostBuilder cost(String cost) {
            this.cost = cost;
            return this;
        }

        public BoostBuilder ctr(String ctr) {
            this.ctr = ctr;
            return this;
        }

        public Boost build() {
            Boost boost = new Boost();
            boost.setId(id);
            boost.setName(name);
            boost.setBidAmount(bidAmount);
            boost.setBudget(budget);
            boost.setPacing(pacing);
            boost.setOptimize(optimize);
            boost.setConversion(conversion);
            boost.setStartDate(startDate);
            boost.setEndDate(endDate);
            boost.setTargetType(targetType);
            boost.setTargetTargeting(targetTargeting);
            boost.setTargetCodes(targetCodes);
            boost.setCountryTargeting(countryTargeting);
            boost.setCountryCodes(countryCodes);
            boost.setRegionTargeting(regionTargeting);
            boost.setRegionCodes(regionCodes);
            boost.setDeviceTargeting(deviceTargeting);
            boost.setLanguageTargeting(languageTargeting);
            boost.setTrackingCode(trackingCode);
            boost.setPixels(pixels);
            boost.setDefaultBid(defaultBid);
            boost.setBudgetType(budgetType);
            boost.setBudgetAmount(budgetAmount);
            boost.setStartDateTime(startDateTime);
            boost.setHasEndDate(hasEndDate);
            boost.setEndDateTime(endDateTime);
            boost.setMobileTraffic(mobileTraffic);
            boost.setLanguageTraffic(languageTraffic);
            boost.setUtmCodes(utmCodes);
            boost.setEnabled(enabled);
            boost.setStatus(status);
            boost.setMinBid(minBid);
            boost.setMaxBid(maxBid);
            boost.setCost(cost);
            boost.setCtr(ctr);
            return boost;
        }
    }
}
