package org.levintech.heatmapdemo.model;

/**
 * Created by levinliu on 2020/6/15
 * GitHub: https://github.com/levinliu
 * (Change file header on Settings -> Editor -> File and Code Templates)
 */
public class HeatMapPoint {

    private final Double longtitude;
    private final Double latitude;
    private final Integer hits;

    public HeatMapPoint(double longtitude, double latitude, int hits) {
        this.longtitude = longtitude;
        this.latitude = latitude;
        this.hits = hits;
    }

    public Double getLongtitude() {
        return longtitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Integer getHits() {
        return hits;
    }
}
