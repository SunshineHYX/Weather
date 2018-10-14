package com.example.weather.db;

import org.litepal.crud.DataSupport;

/**
 * 存放城市的数据
 * LitePal的每个实体类必须继承DataSupport
 * Created by Administrator on 2018/10/14.
 */

public class City extends DataSupport {

    private int id;
    private String cityName;
    private int cityCode;
    private int privateId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getPrivateId() {
        return privateId;
    }

    public void setPrivateId(int privateId) {
        this.privateId = privateId;
    }
}
