package com.qf.bestwedding;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Luckey on 2016/8/25.
 */
public class WelcomeActivity extends AppCompatActivity{
    private SharedPreferences sp;
    private boolean isFirst;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        init();
    }

    private void init() {
        sp = getSharedPreferences("luckey",MODE_PRIVATE);
        isFirst = sp.getBoolean("First",true);
        //定义一个定时器，2秒后跳转
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                if (isFirst){
                    sp.edit().putBoolean("First",false).commit();
                    startActivity(new Intent(WelcomeActivity.this,GuideActivity.class));
                    finish();
                }else {
                    startActivity(new Intent(WelcomeActivity.this,MainActivity.class));
                    finish();
                }
            }
        },1500);
    }

}
