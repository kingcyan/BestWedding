package com.qf.flag.discoverfragment;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.widget.ImageView;

import com.qf.bestwedding.R;
import com.qf.utillibary.base.BaseActivity;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by King
 * 2016/8/23
 */
public class JumpAactivity extends BaseActivity{
    ImageView jump_title_img;
    Map<String, Bitmap> imgMap = new HashMap<>();
    WebView webview;
    @Override
    public int getContentViewId() {
        return R.layout.activity_jump;
    }

    @Override
    protected void init() {
        jump_title_img = findViewByIds(R.id.jump_title_img);

        //得到intent传递过来的顶部图片url
        String url = getIntent().getStringExtra("key") ;

//        Glide.with(this).load(webview).into(jump_title_img);
    }




}
