package com.xy1m.model.boost;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BoostAddResponse {
    private Long id;
    private List<Pixel> pixels;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Pixel> getPixels() {
        return pixels;
    }

    public void setPixels(List<Pixel> pixels) {
        this.pixels = pixels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BoostAddResponse)) return false;
        BoostAddResponse that = (BoostAddResponse) o;
        return Objects.equals(getId(), that.getId()) &&
                Objects.equals(getPixels(), that.getPixels());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getPixels());
    }

    @Override
    public String toString() {
        return "BoostAddResponse{" +
                "id='" + id + '\'' +
                ", pixels=" + pixels +
                '}';
    }
}
