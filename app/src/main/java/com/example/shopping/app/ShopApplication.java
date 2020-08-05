package com.example.shopping.app;

import android.app.Application;

import com.example.mylibrary.HttpConstant;
import com.example.mylibrary.HttpGlobalConfig;

public class ShopApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        HttpGlobalConfig.getInsance()
//                .setBaseUrl("https://wanandroid.com/")
//                .setBaseUrl("https://www.wanandroid.com/")
                .setBaseUrl("http://api.ergedd.com/")
//                .setBaseUrl("http://test.erge123.xyz/api?")
                .setTimeout(HttpConstant.TIME_OUT)
                .setShowLog(true)//日志开关
                .setTimeUnit(HttpConstant.TIME_UNIT)
                .initReady(this);
    }
}
