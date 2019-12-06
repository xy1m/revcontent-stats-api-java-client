package com.xy1m.model.content;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.xy1m.model.EnumAdminStatus;
import com.xy1m.model.EnumContentType;
import com.xy1m.model.EnumActiveInactive;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentGetResponse {
    private String contentId;
    private String headline;
    private String targetUrl;
    private String imageUrl;
    private String brandName;
    private EnumAdminStatus adminStatus;
    private String creativeDenialReason;
    private EnumActiveInactive enabled;
    private EnumContentType contentType;
    private String avgPosition;
    private String impressions;
    private String viewableImpressions;
    private String clicks;
    private String conversions;
    private String ctr;
    private String avgCpc;
    private String cost;
    @JsonProperty("return")
    private String valueReturn;
    private String profit;

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

    public EnumActiveInactive getEnabled() {
        return enabled;
    }

    public void setEnabled(EnumActiveInactive enabled) {
        this.enabled = enabled;
    }

    public EnumContentType getContentType() {
        return contentType;
    }

    public void setContentType(EnumContentType contentType) {
        this.contentType = contentType;
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

    public String getViewableImpressions() {
        return viewableImpressions;
    }

    public void setViewableImpressions(String viewableImpressions) {
        this.viewableImpressions = viewableImpressions;
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
        if (!(o instanceof ContentGetResponse)) return false;
        ContentGetResponse that = (ContentGetResponse) o;
        return Objects.equals(getContentId(), that.getContentId()) &&
                Objects.equals(getHeadline(), that.getHeadline()) &&
                Objects.equals(getTargetUrl(), that.getTargetUrl()) &&
                Objects.equals(getImageUrl(), that.getImageUrl()) &&
                Objects.equals(getBrandName(), that.getBrandName()) &&
                getAdminStatus() == that.getAdminStatus() &&
                Objects.equals(getCreativeDenialReason(), that.getCreativeDenialReason()) &&
                getEnabled() == that.getEnabled() &&
                getContentType() == that.getContentType() &&
                Objects.equals(getAvgPosition(), that.getAvgPosition()) &&
                Objects.equals(getImpressions(), that.getImpressions()) &&
                Objects.equals(getViewableImpressions(), that.getViewableImpressions()) &&
                Objects.equals(getClicks(), that.getClicks()) &&
                Objects.equals(getConversions(), that.getConversions()) &&
                Objects.equals(getCtr(), that.getCtr()) &&
                Objects.equals(getAvgCpc(), that.getAvgCpc()) &&
                Objects.equals(getCost(), that.getCost()) &&
                Objects.equals(getValueReturn(), that.getValueReturn()) &&
                Objects.equals(getProfit(), that.getProfit());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getContentId(), getHeadline(), getTargetUrl(), getImageUrl(), getBrandName(), getAdminStatus(), getCreativeDenialReason(), getEnabled(), getContentType(), getAvgPosition(), getImpressions(), getViewableImpressions(), getClicks(), getConversions(), getCtr(), getAvgCpc(), getCost(), getValueReturn(), getProfit());
    }

    @Override
    public String toString() {
        return "ContentGetResponse{" +
                "contentId='" + contentId + '\'' +
                ", headline='" + headline + '\'' +
                ", targetUrl='" + targetUrl + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", brandName='" + brandName + '\'' +
                ", adminStatus=" + adminStatus +
                ", creativeDenialReason='" + creativeDenialReason + '\'' +
                ", enabled=" + enabled +
                ", contentType=" + contentType +
                ", avgPosition='" + avgPosition + '\'' +
                ", impressions='" + impressions + '\'' +
                ", viewableImpressions='" + viewableImpressions + '\'' +
                ", clicks='" + clicks + '\'' +
                ", conversions='" + conversions + '\'' +
                ", ctr='" + ctr + '\'' +
                ", avgCpc='" + avgCpc + '\'' +
                ", cost='" + cost + '\'' +
                ", valueReturn='" + valueReturn + '\'' +
                ", profit='" + profit + '\'' +
                '}';
    }
}
