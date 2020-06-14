package org.levintech.heatmapdemo.model;

/**
 * Created by levinliu on 2020/6/15
 * GitHub: https://github.com/levinliu
 * (Change file header on Settings -> Editor -> File and Code Templates)
 */
public class HeatMapLabeledPoint {
    private final String name;
    private final HeatMapPoint point;

    public HeatMapLabeledPoint(String name, HeatMapPoint heatMapPoint) {
        this.name = name;
        this.point = heatMapPoint;
    }

    public HeatMapLabeledPoint(String name, double longtitude, double latitude, int hits) {
        this.name = name;
        this.point = new HeatMapPoint(longtitude, latitude, hits);
    }

    public String getName() {
        return name;
    }

    public HeatMapPoint getPoint() {
        return point;
    }
}
