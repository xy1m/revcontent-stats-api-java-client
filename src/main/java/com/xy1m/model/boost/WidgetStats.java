package com.xy1m.model.boost;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class WidgetStats {
    private String id;
    private String domain;
    private String impressions;
    private String viewableImpressions;
    private String clicks;
    private String ctr;
    private String avgCpc;
    private String spend;
    private String conversion;
    private String profit;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
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

    public String getSpend() {
        return spend;
    }

    public void setSpend(String spend) {
        this.spend = spend;
    }

    public String getConversion() {
        return conversion;
    }

    public void setConversion(String conversion) {
        this.conversion = conversion;
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
        if (!(o instanceof WidgetStats)) return false;
        WidgetStats that = (WidgetStats) o;
        return Objects.equals(getId(), that.getId()) &&
                Objects.equals(getDomain(), that.getDomain()) &&
                Objects.equals(getImpressions(), that.getImpressions()) &&
                Objects.equals(getViewableImpressions(), that.getViewableImpressions()) &&
                Objects.equals(getClicks(), that.getClicks()) &&
                Objects.equals(getCtr(), that.getCtr()) &&
                Objects.equals(getAvgCpc(), that.getAvgCpc()) &&
                Objects.equals(getSpend(), that.getSpend()) &&
                Objects.equals(getConversion(), that.getConversion()) &&
                Objects.equals(getProfit(), that.getProfit());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDomain(), getImpressions(), getViewableImpressions(), getClicks(), getCtr(), getAvgCpc(), getSpend(), getConversion(), getProfit());
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("WidgetStats{");
        sb.append("id='").append(id).append('\'');
        sb.append(", domain='").append(domain).append('\'');
        sb.append(", impressions='").append(impressions).append('\'');
        sb.append(", viewableImpressions='").append(viewableImpressions).append('\'');
        sb.append(", clicks='").append(clicks).append('\'');
        sb.append(", ctr='").append(ctr).append('\'');
        sb.append(", avgCpc='").append(avgCpc).append('\'');
        sb.append(", spend='").append(spend).append('\'');
        sb.append(", conversion='").append(conversion).append('\'');
        sb.append(", profit='").append(profit).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
