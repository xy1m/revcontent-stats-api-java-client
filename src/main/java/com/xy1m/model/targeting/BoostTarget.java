package com.xy1m.model.targeting;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.xy1m.model.EnumEnabled;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BoostTarget {
    private String tagId;
    private String tagName;
    private EnumEnabled enabled;
    private String bidType;
    private String bid;
    private String maxBid;
    private String minBid;
    private String avgPosition;
    private String clicksWeek;
    private String impressions;
    private String viewableImpressions;
    private String clicks;
    private String conversions;
    private String ctr;
    private String cost;
    @JsonProperty("return")
    private String valueReturn;
    private String profit;

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public EnumEnabled getEnabled() {
        return enabled;
    }

    public void setEnabled(EnumEnabled enabled) {
        this.enabled = enabled;
    }

    public String getBidType() {
        return bidType;
    }

    public void setBidType(String bidType) {
        this.bidType = bidType;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getMaxBid() {
        return maxBid;
    }

    public void setMaxBid(String maxBid) {
        this.maxBid = maxBid;
    }

    public String getMinBid() {
        return minBid;
    }

    public void setMinBid(String minBid) {
        this.minBid = minBid;
    }

    public String getAvgPosition() {
        return avgPosition;
    }

    public void setAvgPosition(String avgPosition) {
        this.avgPosition = avgPosition;
    }

    public String getClicksWeek() {
        return clicksWeek;
    }

    public void setClicksWeek(String clicksWeek) {
        this.clicksWeek = clicksWeek;
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
        if (!(o instanceof BoostTarget)) return false;
        BoostTarget boostTarget = (BoostTarget) o;
        return Objects.equals(getTagId(), boostTarget.getTagId()) &&
                Objects.equals(getTagName(), boostTarget.getTagName()) &&
                getEnabled() == boostTarget.getEnabled() &&
                Objects.equals(getBidType(), boostTarget.getBidType()) &&
                Objects.equals(getBid(), boostTarget.getBid()) &&
                Objects.equals(getMaxBid(), boostTarget.getMaxBid()) &&
                Objects.equals(getMinBid(), boostTarget.getMinBid()) &&
                Objects.equals(getAvgPosition(), boostTarget.getAvgPosition()) &&
                Objects.equals(getClicksWeek(), boostTarget.getClicksWeek()) &&
                Objects.equals(getImpressions(), boostTarget.getImpressions()) &&
                Objects.equals(getViewableImpressions(), boostTarget.getViewableImpressions()) &&
                Objects.equals(getClicks(), boostTarget.getClicks()) &&
                Objects.equals(getConversions(), boostTarget.getConversions()) &&
                Objects.equals(getCtr(), boostTarget.getCtr()) &&
                Objects.equals(getCost(), boostTarget.getCost()) &&
                Objects.equals(getValueReturn(), boostTarget.getValueReturn()) &&
                Objects.equals(getProfit(), boostTarget.getProfit());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTagId(), getTagName(), getEnabled(), getBidType(), getBid(), getMaxBid(), getMinBid(), getAvgPosition(), getClicksWeek(), getImpressions(), getViewableImpressions(), getClicks(), getConversions(), getCtr(), getCost(), getValueReturn(), getProfit());
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("BoostTarget{");
        sb.append("id='").append(tagId).append('\'');
        sb.append(", name='").append(tagName).append('\'');
        sb.append(", enabled=").append(enabled);
        sb.append(", bidType='").append(bidType).append('\'');
        sb.append(", bid='").append(bid).append('\'');
        sb.append(", maxBid='").append(maxBid).append('\'');
        sb.append(", minBid='").append(minBid).append('\'');
        sb.append(", avgPosition='").append(avgPosition).append('\'');
        sb.append(", clicksWeek='").append(clicksWeek).append('\'');
        sb.append(", impressions='").append(impressions).append('\'');
        sb.append(", viewableImpressions='").append(viewableImpressions).append('\'');
        sb.append(", clicks='").append(clicks).append('\'');
        sb.append(", conversions='").append(conversions).append('\'');
        sb.append(", ctr='").append(ctr).append('\'');
        sb.append(", cost='").append(cost).append('\'');
        sb.append(", valueReturn='").append(valueReturn).append('\'');
        sb.append(", profit='").append(profit).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
