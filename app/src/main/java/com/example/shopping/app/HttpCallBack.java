package com.example.shopping.app;

import android.util.Log;

import com.example.mylibrary.callback.BaseCallBack;
import com.example.mylibrary.demo.Response;
import com.google.gson.Gson;
import com.google.gson.JsonElement;

public abstract class HttpCallBack<T> extends BaseCallBack<T> {
    ShopDemo response;

    @Override
    protected T onConvert(String result) {
        T t = null;
        response = new Gson().fromJson(result, ShopDemo.class);
        JsonElement data = response.getRecord();
        int errorCode = response.getStatus();
        ShopDemo.MessagesBean messages = response.getMessages();
        switch (errorCode) {
            case -1:
                onError(messages.toString(), errorCode);
                break;
            default:
                if (isCodeSuccess()) {
                    t = convert(data);
                }
                break;
        }
        Log.e("111", "onConvert: " + t.toString());
        return t;
    }


    @Override
    public boolean isCodeSuccess() {
        if (response != null) {
            return response.getStatus() == 200;
        }
        return false;
    }

}
