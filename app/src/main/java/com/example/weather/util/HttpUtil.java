package com.example.weather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Administrator on 2018/10/14.
 * OkHttp封装很完善：仅需以下三条解决与服务器进行交互的问题
 * 发起一条HTTP请求仅需调用sendOkHttpRequest(）方法，传入请求地址，并注册一个回调来处理服务器响应
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }

}
