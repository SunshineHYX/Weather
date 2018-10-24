package com.example.weather.gson;

/**
 * 城市aqi与PM值
 * Created by Administrator on 2018/10/24.
 */

public class AQI {

    public AQICity city;

    public class AQICity{

        public String aqi;

        public String pm25;

    }

}
