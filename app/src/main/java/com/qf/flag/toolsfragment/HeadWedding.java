package com.qf.flag.toolsfragment;

import android.content.Intent;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import com.qf.bestwedding.R;
import com.qf.utillibary.base.BaseActivity;

/**
 * Created by King
 * 2016/8/20
 */
public class HeadWedding extends BaseActivity implements View.OnClickListener {

    //返回按钮
    private ImageView iv_back;

    //webview
    private WebView webView;

    //跳转下个页面按钮
    private TextView tv_btn;

    @Override
    public int getContentViewId() {
        return R.layout.activity_header;
    }

    /**
     * 初始化方法
     */
    @Override
    protected void init() {
        //查找控件
        webView = findViewByIds(R.id.webview);
        iv_back = findViewByIds(R.id.Header_back);
        tv_btn = findViewByIds(R.id.tv_btn);

        //设置点击事件
        iv_back.setOnClickListener(this);
        tv_btn.setOnClickListener(this);

        //获取Intent传来的Web页面URL并设置给webview
        webView.loadUrl(getIntent().getStringExtra("URL"));

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            //点击返回将页面finish掉
            case R.id.Header_back:
                this.finish();
                break;
            case R.id.tv_btn:
                // 跳转到电子请帖页面
                //                Toast.makeText(HeadWedding.this, "点击了按钮", Toast.LENGTH_SHORT).show();
                Intent in = new Intent(this, InvitationActivity.class);
                startActivity(in);
        }
    }
}
