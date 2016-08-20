package com.qf.bestwedding;

import android.app.Application;

import com.qf.util.Contants;
import com.qf.util.JsonUtil;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by King
 * 2016/8/19
 */
public class MyApplication extends Application{
    public static JsonUtil utils;
    @Override
    public void onCreate() {
        super.onCreate();
        utils = initRetrofit();
    }

    public JsonUtil initRetrofit(){
        /**得到Retrofit 对象*/
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Contants.HTTP_ROOT)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        /**得到刚刚写的方法*/
        return retrofit.create(JsonUtil.class);
    }
}
