package com.example.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 根据天气情况的建议提示信息
 * Created by Administrator on 2018/10/24.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class  Comfort{
        @SerializedName("txt")
        public String info;
    }

    public class CarWash{
        @SerializedName("txt")
        public String info;
    }

    public class Sport{
        @SerializedName("txt")
        public String info;
    }


}
