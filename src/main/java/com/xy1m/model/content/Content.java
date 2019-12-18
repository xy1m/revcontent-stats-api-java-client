package com.xy1m.model.content;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.xy1m.model.EnumAdminStatus;
import com.xy1m.model.EnumContentType;
import com.xy1m.model.EnumEnabled;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Content {
    private String id;
    private String boostId;
    private String contentId;
    private String headline; // 80
    private String targetUrl; // 255
    private String image; // 8MB
    private String imageUrl;
    private String brandName; // 30
    private EnumAdminStatus adminStatus;
    private String creativeDenialReason;
    private EnumEnabled enabled;
    private String status;
    private EnumContentType contentType;
    private String utmCodes;
    private String avgPosition;
    private String impressions;
    private String clicks;
    private String conversions;
    private String ctr;
    private String avgCpc;
    private String cost;
    @JsonProperty("return")
    private String valueReturn;
    private String profit;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBoostId() {
        return boostId;
    }

    public void setBoostId(String boostId) {
        this.boostId = boostId;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public EnumAdminStatus getAdminStatus() {
        return adminStatus;
    }

    public void setAdminStatus(EnumAdminStatus adminStatus) {
        this.adminStatus = adminStatus;
    }

    public String getCreativeDenialReason() {
        return creativeDenialReason;
    }

    public void setCreativeDenialReason(String creativeDenialReason) {
        this.creativeDenialReason = creativeDenialReason;
    }

    public EnumEnabled getEnabled() {
        return enabled;
    }

    public void setEnabled(EnumEnabled enabled) {
        this.enabled = enabled;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public EnumContentType getContentType() {
        return contentType;
    }

    public void setContentType(EnumContentType contentType) {
        this.contentType = contentType;
    }

    public String getUtmCodes() {
        return utmCodes;
    }

    public void setUtmCodes(String utmCodes) {
        this.utmCodes = utmCodes;
    }

    public String getAvgPosition() {
        return avgPosition;
    }

    public void setAvgPosition(String avgPosition) {
        this.avgPosition = avgPosition;
    }

    public String getImpressions() {
        return impressions;
    }

    public void setImpressions(String impressions) {
        this.impressions = impressions;
    }

    public String getClicks() {
        return clicks;
    }

    public void setClicks(String clicks) {
        this.clicks = clicks;
    }

    public String getConversions() {
        return conversions;
    }

    public void setConversions(String conversions) {
        this.conversions = conversions;
    }

    public String getCtr() {
        return ctr;
    }

    public void setCtr(String ctr) {
        this.ctr = ctr;
    }

    public String getAvgCpc() {
        return avgCpc;
    }

    public void setAvgCpc(String avgCpc) {
        this.avgCpc = avgCpc;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getValueReturn() {
        return valueReturn;
    }

    public void setValueReturn(String valueReturn) {
        this.valueReturn = valueReturn;
    }

    public String getProfit() {
        return profit;
    }

    public void setProfit(String profit) {
        this.profit = profit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Content)) return false;
        Content content = (Content) o;
        return Objects.equals(getId(), content.getId()) &&
                Objects.equals(getBoostId(), content.getBoostId()) &&
                Objects.equals(getContentId(), content.getContentId()) &&
                Objects.equals(getHeadline(), content.getHeadline()) &&
                Objects.equals(getTargetUrl(), content.getTargetUrl()) &&
                Objects.equals(getImage(), content.getImage()) &&
                Objects.equals(getImageUrl(), content.getImageUrl()) &&
                Objects.equals(getBrandName(), content.getBrandName()) &&
                getAdminStatus() == content.getAdminStatus() &&
                Objects.equals(getCreativeDenialReason(), content.getCreativeDenialReason()) &&
                getEnabled() == content.getEnabled() &&
                Objects.equals(getStatus(), content.getStatus()) &&
                getContentType() == content.getContentType() &&
                Objects.equals(getUtmCodes(), content.getUtmCodes()) &&
                Objects.equals(getAvgPosition(), content.getAvgPosition()) &&
                Objects.equals(getImpressions(), content.getImpressions()) &&
                Objects.equals(getClicks(), content.getClicks()) &&
                Objects.equals(getConversions(), content.getConversions()) &&
                Objects.equals(getCtr(), content.getCtr()) &&
                Objects.equals(getAvgCpc(), content.getAvgCpc()) &&
                Objects.equals(getCost(), content.getCost()) &&
                Objects.equals(getValueReturn(), content.getValueReturn()) &&
                Objects.equals(getProfit(), content.getProfit());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getBoostId(), getContentId(), getHeadline(), getTargetUrl(), getImage(), getImageUrl(), getBrandName(), getAdminStatus(), getCreativeDenialReason(), getEnabled(), getStatus(), getContentType(), getUtmCodes(), getAvgPosition(), getImpressions(), getClicks(), getConversions(), getCtr(), getAvgCpc(), getCost(), getValueReturn(), getProfit());
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Content{");
        sb.append("id='").append(id).append('\'');
        sb.append(", boostId='").append(boostId).append('\'');
        sb.append(", contentId='").append(contentId).append('\'');
        sb.append(", headline='").append(headline).append('\'');
        sb.append(", targetUrl='").append(targetUrl).append('\'');
        sb.append(", image='").append(image).append('\'');
        sb.append(", imageUrl='").append(imageUrl).append('\'');
        sb.append(", brandName='").append(brandName).append('\'');
        sb.append(", adminStatus=").append(adminStatus);
        sb.append(", creativeDenialReason='").append(creativeDenialReason).append('\'');
        sb.append(", enabled=").append(enabled);
        sb.append(", status='").append(status).append('\'');
        sb.append(", contentType=").append(contentType);
        sb.append(", utmCodes='").append(utmCodes).append('\'');
        sb.append(", avgPosition='").append(avgPosition).append('\'');
        sb.append(", impressions='").append(impressions).append('\'');
        sb.append(", clicks='").append(clicks).append('\'');
        sb.append(", conversions='").append(conversions).append('\'');
        sb.append(", ctr='").append(ctr).append('\'');
        sb.append(", avgCpc='").append(avgCpc).append('\'');
        sb.append(", cost='").append(cost).append('\'');
        sb.append(", valueReturn='").append(valueReturn).append('\'');
        sb.append(", profit='").append(profit).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static class APIRequestAddBuilder {
        // 255
        private String targetUrl;
        // 8MB
        private String image;
        // 80
        private String headline;
        // 30
        private String brandName;
        private EnumContentType contentType;

        private APIRequestAddBuilder() {
        }

        public static APIRequestAddBuilder builder() {
            return new APIRequestAddBuilder();
        }

        public APIRequestAddBuilder targetUrl(String targetUrl) {
            this.targetUrl = targetUrl;
            return this;
        }

        public APIRequestAddBuilder image(String image) {
            this.image = image;
            return this;
        }

        public APIRequestAddBuilder headline(String headline) {
            this.headline = headline;
            return this;
        }

        public APIRequestAddBuilder brandName(String brandName) {
            this.brandName = brandName;
            return this;
        }

        public APIRequestAddBuilder contentType(EnumContentType contentType) {
            this.contentType = contentType;
            return this;
        }

        public Content build() {
            Content content = new Content();
            content.targetUrl = this.targetUrl;
            content.image = this.image;
            content.headline = this.headline;
            content.brandName = this.brandName;
            content.contentType = this.contentType;
            return content;
        }
    }

    public static class APIRequestUpdateBuilder {
        private String id;
        // 255
        private String targetUrl;
        // 8MB
        private String image;
        // 80
        private String headline;
        // 30
        private String brandName;
        private EnumContentType contentType;
        private EnumEnabled enabled;

        private APIRequestUpdateBuilder() {
        }

        public static APIRequestUpdateBuilder builder() {
            return new APIRequestUpdateBuilder();
        }

        public APIRequestUpdateBuilder id(String id) {
            this.id = id;
            return this;
        }

        public APIRequestUpdateBuilder targetUrl(String targetUrl) {
            this.targetUrl = targetUrl;
            return this;
        }

        public APIRequestUpdateBuilder image(String image) {
            this.image = image;
            return this;
        }

        public APIRequestUpdateBuilder headline(String headline) {
            this.headline = headline;
            return this;
        }

        public APIRequestUpdateBuilder brandName(String brandName) {
            this.brandName = brandName;
            return this;
        }

        public APIRequestUpdateBuilder contentType(EnumContentType contentType) {
            this.contentType = contentType;
            return this;
        }

        public APIRequestUpdateBuilder enabled(EnumEnabled enabled) {
            this.enabled = enabled;
            return this;
        }

        public Content build() {
            Content content = new Content();
            content.id = this.id;
            content.targetUrl = this.targetUrl;
            content.image = this.image;
            content.headline = this.headline;
            content.brandName = this.brandName;
            content.contentType = this.contentType;
            content.enabled = enabled;
            return content;
        }
    }
}
