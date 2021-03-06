package com.example.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 数组类
 * Created by Administrator on 2018/10/24.
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{

        public String max;

        public String min;

    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }


}
