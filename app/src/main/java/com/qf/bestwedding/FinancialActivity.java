package com.qf.bestwedding;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.qf.entity.FinancialEntity1;
import com.qf.entity.FinancialEntity2;
import com.qf.utillibary.base.BaseActivity;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Administrator on 2016/8/23 0023. on 20:47
 * xiaohl_902       金融超市
 */
public class FinancialActivity extends BaseActivity {

    @Bind(R.id.global1_img1)
    ImageView global1Img1;
    @Bind(R.id.global2_img1)
    ImageView global2Img1;
    @Bind(R.id.global2_img2)
    ImageView global2Img2;
    @Bind(R.id.global2_img3)
    ImageView global2Img3;
    @Bind(R.id.global1_img2)
    ImageView global1Img2;
    @Bind(R.id.global2_img4)
    ImageView global2Img4;
    @Bind(R.id.global2_img5)
    ImageView global2Img5;
    @Bind(R.id.global2_img6)
    ImageView global2Img6;
    @Bind(R.id.financial_finish)
    ImageView financialFinish;
    private Call<FinancialEntity1> finEntityCall1;
    private Call<FinancialEntity2> finEntityCall2;
    private FinancialEntity1.DataBean.FloorsBean datas1;
    private WebView webView;
    private WebSettings settings;
    private List<FinancialEntity2.DataBean> datas2;

    @Override
    public int getContentViewId() {
        return R.layout.activity_financial;
    }

    @Override
    protected void init() {

        finEntityCall1 = MyApplication.utils.getFinancial1();//首页Fragment全部
        finEntityCall1.enqueue(new Callback<FinancialEntity1>() {

            @Override
            public void onResponse(Call<FinancialEntity1> call, Response<FinancialEntity1> response) {
                datas1 = response.body().getData().getFloors();
                Glide.with(FinancialActivity.this).load(datas1.getSITE_FINANCIAL_TOP_BANNER().getHoles().get(0).getPosters().getImage_path()).into(global1Img1);
                Glide.with(FinancialActivity.this).load(datas1.getSITE_FINANCIAL_MIDDLE_BANNER().getHoles().get(0).getPosters().getImage_path()).into(global1Img2);
            }

            @Override
            public void onFailure(Call<FinancialEntity1> call, Throwable t) {

            }
        });

        finEntityCall2 = MyApplication.utils.getFinancial2();//首页Fragment全部
        finEntityCall2.enqueue(new Callback<FinancialEntity2>() {
            @Override
            public void onResponse(Call<FinancialEntity2> call, Response<FinancialEntity2> response) {
                datas2 = response.body().getData();
                Glide.with(FinancialActivity.this).load(datas2.get(0).getFinancial_product().get(0).getImg()).into(global2Img1);
                Glide.with(FinancialActivity.this).load(datas2.get(0).getFinancial_product().get(1).getImg()).into(global2Img2);
                Glide.with(FinancialActivity.this).load(datas2.get(0).getFinancial_product().get(2).getImg()).into(global2Img3);
                Glide.with(FinancialActivity.this).load(datas2.get(1).getFinancial_product().get(0).getImg()).into(global2Img4);
                Glide.with(FinancialActivity.this).load(datas2.get(1).getFinancial_product().get(1).getImg()).into(global2Img5);
                Glide.with(FinancialActivity.this).load(datas2.get(1).getFinancial_product().get(2).getImg()).into(global2Img6);
            }

            @Override
            public void onFailure(Call<FinancialEntity2> call, Throwable t) {

            }
        });

        webView = new WebView(FinancialActivity.this);
        settings = webView.getSettings();

        //设置webview可支持js脚本
        settings.setJavaScriptEnabled(true);
        //设置超链接能响应
        webView.setWebViewClient(new WebViewClient() {
            /**
             * 重定向
             * @param view
             * @param url
             * @return
             */
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);  //将该url重定向到app里面，这样就不再是去浏览器中打开该网页了
                return super.shouldOverrideUrlLoading(view, url);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick({R.id.financial_finish, R.id.global1_img1, R.id.global2_img1, R.id.global2_img2, R.id.global2_img3, R.id.global1_img2, R.id.global2_img4, R.id.global2_img5, R.id.global2_img6})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.global1_img1:
                setContentView(webView);
                webView.loadUrl(datas1.getSITE_FINANCIAL_TOP_BANNER().getHoles().get(0).getPosters().getTarget_url());
                break;
            case R.id.global2_img1:
                setContentView(webView);
                webView.loadUrl(datas2.get(0).getFinancial_product().get(0).getUrl());

                break;
            case R.id.global2_img2:
                setContentView(webView);
                webView.loadUrl(datas2.get(0).getFinancial_product().get(1).getUrl());
                break;
            case R.id.global2_img3:
                setContentView(webView);
                webView.loadUrl(datas2.get(0).getFinancial_product().get(2).getUrl());
                break;
            case R.id.global1_img2:

                setContentView(webView);
                webView.loadUrl(datas1.getSITE_FINANCIAL_MIDDLE_BANNER().getHoles().get(0).getPosters().getTarget_url());
                break;
            case R.id.global2_img4:
                setContentView(webView);
                webView.loadUrl(datas2.get(1).getFinancial_product().get(0).getUrl());
                break;
            case R.id.global2_img5:
                setContentView(webView);
                webView.loadUrl(datas2.get(1).getFinancial_product().get(1).getUrl());
                break;
            case R.id.global2_img6:
                setContentView(webView);
                webView.loadUrl(datas2.get(1).getFinancial_product().get(2).getUrl());
                break;
            case R.id.financial_finish:
                finish();
                break;
        }
    }

}
