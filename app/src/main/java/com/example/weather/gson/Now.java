package com.example.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 目前的温度情况
 * Created by Administrator on 2018/10/24.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;

    }


}
