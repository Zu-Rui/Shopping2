package com.example.httplibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;

import com.example.httplibrary.utils.LogUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class HttpManager {
    private static volatile HttpManager instance;
    private HttpManager(){

    }
    private static HttpManager getInstance(){
        if (instance == null) {
            synchronized (HttpManager.class){
                if (instance == null) {
                    instance =new HttpManager();
                }
            }
        }
        return instance;
    }

    public Retrofit getRetrofit(String baseUrl, long timeout, TimeUnit timeUnit){

        return new Retrofit.Builder()
                .client(getBaseOkhttpClient(timeout,timeUnit))
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

    }

    private OkHttpClient getBaseOkhttpClient(long timeout, TimeUnit timeUnit) {

        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
                LogUtils.e("Okhttp=====" + message);
            }
        });

        Interceptor interceptor = new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request request = chain.request();
                Response proceed = chain.proceed(request);
                return proceed;
            }
        };

        Interceptor[] interceptors={httpLoggingInterceptor,interceptor};
        return getCliect(timeout,timeUnit,interceptors);

    }

    public OkHttpClient getCliect(long timeout, TimeUnit timeUnit,Interceptor ...interceptors){

        OkHttpClient.Builder builder = new OkHttpClient.Builder();

        builder.connectTimeout(timeout,timeUnit);//连接超时
        builder.writeTimeout(timeout,timeUnit);//写超时
        builder.readTimeout(timeout,timeUnit);//读取超时

        for (Interceptor interceptor : interceptors) {
            builder.addInterceptor(interceptor);
        }

        ArrayList<Interceptor> baseIntercepts = HttpGlobalConfig.getInstance().getInterceptors();

        if (baseIntercepts != null) {
            for (Interceptor baseIntercept : baseIntercepts) {
                builder.addInterceptor(baseIntercept);
            }
        }



        return builder
                .build();
    }

}
