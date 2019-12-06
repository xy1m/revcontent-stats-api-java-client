package com.xy1m.model.resource;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "parent_id",
        "people",
        "CPW",
        "targetable"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Interest {
    private String id;
    private String name;
    private String parentId;
    private String people;
    private String cPW;
    private String targetable;

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

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public String getcPW() {
        return cPW;
    }

    public void setcPW(String cPW) {
        this.cPW = cPW;
    }

    public String getTargetable() {
        return targetable;
    }

    public void setTargetable(String targetable) {
        this.targetable = targetable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Interest)) return false;
        Interest interest = (Interest) o;
        return Objects.equals(getId(), interest.getId()) &&
                Objects.equals(getName(), interest.getName()) &&
                Objects.equals(getParentId(), interest.getParentId()) &&
                Objects.equals(getPeople(), interest.getPeople()) &&
                Objects.equals(getcPW(), interest.getcPW()) &&
                Objects.equals(getTargetable(), interest.getTargetable());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getParentId(), getPeople(), getcPW(), getTargetable());
    }

    @Override
    public String toString() {
        return "Interest{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", parentId='" + parentId + '\'' +
                ", people='" + people + '\'' +
                ", cPW='" + cPW + '\'' +
                ", targetable='" + targetable + '\'' +
                '}';
    }
}
