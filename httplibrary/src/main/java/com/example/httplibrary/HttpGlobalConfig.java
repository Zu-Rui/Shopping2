package com.example.httplibrary;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

import java.util.ArrayList;
import java.util.Map;

import okhttp3.Interceptor;

public class HttpGlobalConfig {

    private String baseUrl;
    private long timeout;
    //公共的请求参数
    private Map<String,Object>baseparams;
    //公共的请求头信息
    private Map<String,Object>baseHeades;
    //公共的拦截器
    private ArrayList<Interceptor> interceptors;
    //日志开关
    private boolean isShowLog;


    private Context context;
    private Handler handler;
    private HttpGlobalConfig(){

    }

    //静态内部类
    private static final class HttpGlobalConfigHolder{
        private static HttpGlobalConfig INSTANCE = new HttpGlobalConfig();
    }

    public static HttpGlobalConfig getInstance(){
        return HttpGlobalConfigHolder.INSTANCE;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public HttpGlobalConfig setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return HttpGlobalConfig.getInstance();
    }

    public long getTimeout() {
        return timeout;
    }

    public HttpGlobalConfig setTimeout(long timeout) {
        this.timeout = timeout;
        return HttpGlobalConfig.getInstance();
    }

    public Map<String, Object> getBaseparams() {
        return baseparams;
    }

    public HttpGlobalConfig setBaseparams(Map<String, Object> baseparams) {
        this.baseparams = baseparams;
        return HttpGlobalConfig.getInstance();
    }

    public Map<String, Object> getBaseHeades() {
        return baseHeades;
    }

    public HttpGlobalConfig setBaseHeades(Map<String, Object> baseHeades) {
        this.baseHeades = baseHeades;
        return HttpGlobalConfig.getInstance();
    }

    public ArrayList<Interceptor> getInterceptors() {
        return interceptors;
    }

    public HttpGlobalConfig setInterceptors(ArrayList<Interceptor> interceptors) {
        this.interceptors = interceptors;
        return HttpGlobalConfig.getInstance();
    }

    public boolean isShowLog() {
        return isShowLog;
    }

    public HttpGlobalConfig setShowLog(boolean showLog) {
        isShowLog = showLog;
        return HttpGlobalConfig.getInstance();
    }

    public HttpGlobalConfig initReady(Context context){
        this.context=context.getApplicationContext();
        handler = new Handler(Looper.getMainLooper());
        return HttpGlobalConfig.getInstance();
    }
}
