package org.levintech.heatmapdemo.util;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by levinliu on 2020/6/13
 * GitHub: https://github.com/levinliu
 * (Change file header on Settings -> Editor -> File and Code Templates)
 */
public class BaiduMapUtil {
    private static final String BD_APP_KEY = "BDXDKKKKKyou bd app key";

    public static GPS getGPS(String address) {
        JsonParser parser = new JsonParser();
        JsonObject obj = (JsonObject) parser.parse(callMapApi(address));
        if (obj.get("status").toString().equals("0")) {
            double lng = obj.getAsJsonObject("result").getAsJsonObject("location").get("lng").getAsDouble();//obj.getJSONObject("result").getJSONObject("location").getDouble("lng");
            double lat = obj.getAsJsonObject("result").getAsJsonObject("location").get("lat").getAsDouble();
            return new GPS(lng, lat);
        }
        throw new IllegalStateException("Fail to get GPS for address " + address);
    }

    public static String callMapApi(String address) {
        try {
            address = java.net.URLEncoder.encode(address, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String url = "http://api.map.baidu.com/geocoder/v2/?address=" + address + "&output=json&ak=" + BD_APP_KEY;
        String json = loadJSON(url);
        return json;
    }

    public static String loadJSON(String url) {
        StringBuilder json = new StringBuilder();
        try {
            URL oracle = new URL(url);
            URLConnection yc = oracle.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
            String inputLine = null;
            while ((inputLine = in.readLine()) != null) {
                json.append(inputLine);
            }
            in.close();
        } catch (MalformedURLException e) {
        } catch (IOException e) {
        }
        return json.toString();
    }

    public static class GPS {

        //WeiDu
        private double latitude;
        //JingDu
        private double longtitude;

        public double getLatitude() {
            return latitude;
        }

        public double getLongtitude() {
            return longtitude;
        }

        public GPS(double latitude, double longtitude) {
            this.latitude = latitude;
            this.longtitude = longtitude;
        }
    }

}
