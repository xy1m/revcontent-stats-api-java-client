package com.xy1m.model.targeting;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.xy1m.model.EnumEnabled;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class WidgetTarget {
    private String id;
    private String widgetId;
    private String domain;
    private EnumEnabled enabled;
    private String bidType;
    private String bid;
    private String avgCpc;
    private String impressions;
    private String viewableImpressions;
    private String clicks;
    private String conversions;
    private String ctr;
    private String pvs;
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

    public String getWidgetId() {
        return widgetId;
    }

    public void setWidgetId(String widgetId) {
        this.widgetId = widgetId;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
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

    public String getAvgCpc() {
        return avgCpc;
    }

    public void setAvgCpc(String avgCpc) {
        this.avgCpc = avgCpc;
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

    public String getPvs() {
        return pvs;
    }

    public void setPvs(String pvs) {
        this.pvs = pvs;
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
        if (!(o instanceof WidgetTarget)) return false;
        WidgetTarget that = (WidgetTarget) o;
        return Objects.equals(getId(), that.getId()) &&
                Objects.equals(getWidgetId(), that.getWidgetId()) &&
                Objects.equals(getDomain(), that.getDomain()) &&
                getEnabled() == that.getEnabled() &&
                Objects.equals(getBidType(), that.getBidType()) &&
                Objects.equals(getBid(), that.getBid()) &&
                Objects.equals(getAvgCpc(), that.getAvgCpc()) &&
                Objects.equals(getImpressions(), that.getImpressions()) &&
                Objects.equals(getViewableImpressions(), that.getViewableImpressions()) &&
                Objects.equals(getClicks(), that.getClicks()) &&
                Objects.equals(getConversions(), that.getConversions()) &&
                Objects.equals(getCtr(), that.getCtr()) &&
                Objects.equals(getPvs(), that.getPvs()) &&
                Objects.equals(getCost(), that.getCost()) &&
                Objects.equals(getValueReturn(), that.getValueReturn()) &&
                Objects.equals(getProfit(), that.getProfit());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getWidgetId(), getDomain(), getEnabled(), getBidType(), getBid(), getAvgCpc(), getImpressions(), getViewableImpressions(), getClicks(), getConversions(), getCtr(), getPvs(), getCost(), getValueReturn(), getProfit());
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("WidgetTarget{");
        sb.append("id='").append(id).append('\'');
        sb.append(", widgetId='").append(widgetId).append('\'');
        sb.append(", domain='").append(domain).append('\'');
        sb.append(", enabled=").append(enabled);
        sb.append(", bidType='").append(bidType).append('\'');
        sb.append(", bid='").append(bid).append('\'');
        sb.append(", avgCpc='").append(avgCpc).append('\'');
        sb.append(", impressions='").append(impressions).append('\'');
        sb.append(", viewableImpressions='").append(viewableImpressions).append('\'');
        sb.append(", clicks='").append(clicks).append('\'');
        sb.append(", conversions='").append(conversions).append('\'');
        sb.append(", ctr='").append(ctr).append('\'');
        sb.append(", pvs='").append(pvs).append('\'');
        sb.append(", cost='").append(cost).append('\'');
        sb.append(", valueReturn='").append(valueReturn).append('\'');
        sb.append(", profit='").append(profit).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
