package com.example.shopping;

import android.os.Bundle;
import android.util.Log;

import com.example.mylibrary.client.HttpClient;
import com.example.shopping.app.Demo;
import com.example.shopping.app.Egdd;
import com.example.shopping.app.HttpCallBack;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;

import java.util.HashMap;

import io.reactivex.disposables.Disposable;

public class MainActivity extends RxAppCompatActivity {

    private Disposable disposable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //调用HttpClient
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        stringObjectHashMap.put("limit", 2);
        HashMap<String, Object> stringObjectHashMap2 = new HashMap<>();
        stringObjectHashMap2.put("Cache-Control", "public");
        stringObjectHashMap2.put("max-age", "28800");

        new HttpClient.Builder()
                .setApiUrl("getVideoSearchKeyword")
                .setHeadres(stringObjectHashMap2)
                .setParamser(stringObjectHashMap)
                .post()
                .build()
                .request(new HttpCallBack<Egdd>() {
                    @Override
                    public void onSuccess(Egdd demo) {
                        Log.e("111", "onSuccess:88888 " + demo.toString());
                    }

                    @Override
                    public Egdd convert(JsonElement result) {
                        return new Gson().fromJson(new Gson().toJson(result), Egdd.class);
                    }

                    @Override
                    public void onError(String message, int code) {
                        Log.e("111", "onError: " + message);
                    }

                    @Override
                    public void cancle() {

                    }
                });
        //调用HttpClient
//        new HttpClient.Builder()
////                .setApiUrl("article/listproject/0/json")
////                .setApiUrl("project/list/1/json?cid=294")
////                .setApiUrl("app=bbvideo_android")
////                .get()
////                .setJsonBody("",true)
//                .setApiUrl("api/v1/home_items?type=1&channel=new&offset=0&limit=20&sensitive=7")
//                .post()
//                .setJsonBody("",true)
//                .build()
//                .request(new HttpCallBack<Demo>() {
//                    @Override
//                    public void onSuccess(Demo demo) {
//                        Log.e("111", "onSuccess:88888 "+demo.toString() );
//                    }
//                    @Override
//                    public Demo convert(JsonElement result) {
//                        return new Gson().fromJson(new Gson().toJson(result),Demo.class);
//                    }
//
//                    @Override
//                    public void onError(String message, int code) {
//                        Log.e("111", "onError: "+message );
//                    }
//                    @Override
//                    public void cancle() {
//
//                    }
//                });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
