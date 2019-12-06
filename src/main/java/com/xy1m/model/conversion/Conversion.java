package com.xy1m.model.conversion;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Conversion {
    private String id;
    private String delete;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDelete() {
        return delete;
    }

    public void setDelete(String delete) {
        this.delete = delete;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Conversion)) return false;
        Conversion that = (Conversion) o;
        return Objects.equals(getId(), that.getId()) &&
                Objects.equals(getDelete(), that.getDelete());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDelete());
    }

    @Override
    public String toString() {
        return "Conversion{" +
                "id='" + id + '\'' +
                ", delete='" + delete + '\'' +
                '}';
    }
}
