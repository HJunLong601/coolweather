package com.coolweather.android.gson;

/**
 * Created by asus on 2018/7/7.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
