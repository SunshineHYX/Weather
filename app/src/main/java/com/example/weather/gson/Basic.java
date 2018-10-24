package com.example.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 城市、天气id、天气的更新时间创建的类
 * @SerializedName 注解方式让JSON字段和Java字段之间简历映射关系
 * Created by Administrator on 2018/10/24.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }



}
