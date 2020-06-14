package org.levintech.heatmapdemo.controller;

import org.levintech.heatmapdemo.model.HeatMapLabeledPoint;
import org.levintech.heatmapdemo.model.HeatMapPoint;
import org.levintech.heatmapdemo.util.BaiduMapUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by levinliu on 2020/6/13
 * GitHub: https://github.com/levinliu
 * (Change file header on Settings -> Editor -> File and Code Templates)
 */
@RestController
public class HeatGPSLocations {

    @GetMapping("/labelledGpsWithHeats")
    public List<HeatMapLabeledPoint> getLabelledHeatMapPoints() {
        return createLabelledHeatMapPoint();
    }

    private List<HeatMapLabeledPoint> createLabelledHeatMapPoint() {
        List<HeatMapLabeledPoint> hps = new LinkedList<>();
        hps.add(new HeatMapLabeledPoint("GZ", 113.23, 23.16, 185));
        hps.add(new HeatMapLabeledPoint("SZ", 114.07, 22.62, 115));
        hps.add(new HeatMapLabeledPoint("HZ", 120.03, 21.58, 85));
        return hps;
    }


    @GetMapping("/gpsWithHeats")
    public List<HeatMapPoint> getHeatMapPoints() {
        return createHeatMapPoint();
    }

    private List<HeatMapPoint> createHeatMapPoint() {
        List<HeatMapPoint> hps = new LinkedList<>();
        hps.add(new HeatMapPoint(113.23, 23.16, 185));
        hps.add(new HeatMapPoint(114.07, 22.62, 115));
        hps.add(new HeatMapPoint(120.03, 21.58, 85));
        return hps;
    }

    @GetMapping("/gps")
    public List<BaiduMapUtil.GPS> getGPSList() {
        return createMockGpsList();
    }

    private List<BaiduMapUtil.GPS> createMockGpsList() {
        List<BaiduMapUtil.GPS> gpsList = new LinkedList<>();
        //Shenzhen
        gpsList.add(new BaiduMapUtil.GPS(22.533, 114.133));
        gpsList.add(new BaiduMapUtil.GPS(22.533, 114.133));
        gpsList.add(new BaiduMapUtil.GPS(22.533, 114.133));
        gpsList.add(new BaiduMapUtil.GPS(22.533, 114.133));
        gpsList.add(new BaiduMapUtil.GPS(22.533, 114.133));
        //Chengdu
        gpsList.add(new BaiduMapUtil.GPS(30.667, 104.067));
        gpsList.add(new BaiduMapUtil.GPS(30.667, 104.067));
        //Hangzhou
        gpsList.add(new BaiduMapUtil.GPS(30.294, 120.161));
        gpsList.add(new BaiduMapUtil.GPS(30.294, 120.161));
        gpsList.add(new BaiduMapUtil.GPS(30.294, 120.161));
        return gpsList;
    }
}
