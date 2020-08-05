package com.example.shopping;

import com.example.mylibrary.callback.BaseCallBack;
import com.google.gson.JsonElement;

public abstract class ShopCallBack<T> extends BaseCallBack<T> {
    ShopResponse shopResponse;
    @Override
    protected T onConvert(String result) {
        T t=null;
        JsonElement data = shopResponse.getData();
        String message = shopResponse.getMessage();
        int status = shopResponse.getStatus();
        switch (status){
            case 1:
                break;
            default:
                if(isCodeSuccess()){
                   t= convert(data);
                }
                break;
        }
        return t;
    }

    @Override
    public boolean isCodeSuccess() {
        if(shopResponse!=null){
            return shopResponse.getStatus()==0;
        }
        return false;
    }
}
