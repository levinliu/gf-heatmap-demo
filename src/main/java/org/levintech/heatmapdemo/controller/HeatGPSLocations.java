package org.levintech.heatmapdemo.controller;

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
