package com.qf.flag.homefragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.qf.adapter.HomeAllAdapter;
import com.qf.bestwedding.CitySelectActivity;
import com.qf.bestwedding.FinancialActivity;
import com.qf.bestwedding.R;
import com.qf.entity.CityEntity;
import com.qf.entity.CityEntity2;
import com.qf.util.Contants;
import com.qf.utillibary.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by King
 * 2016/8/18
 */
public class HomeFragment extends BaseFragment {
    //  @BindView(R.id.home_bottom_viewpager)
    ViewPager viewPager;

    List<HomeFragmentAll> fgmData;
    @Bind(R.id.home_head_text1)
    TextView homeHeadText1;
    @Bind(R.id.home_citySelect)
    LinearLayout homeCitySelect;
    @Bind(R.id.hun)
    ImageView hun;
    @Bind(R.id.text_hun)
    TextView textHun;
    @Bind(R.id.li)
    ImageView li;
    @Bind(R.id.text_li)
    TextView textLi;
    @Bind(R.id.jia)
    ImageView jia;
    @Bind(R.id.text_jia)
    TextView textJia;
    @Bind(R.id.nian)
    ImageView nian;
    @Bind(R.id.text_nian)
    TextView textNian;
    @Bind(R.id.hua)
    ImageView hua;
    @Bind(R.id.text_hua)
    TextView textHua;
    @Bind(R.id.head2_bigImg)
    ImageView head2BigImg;
    @Bind(R.id.head3_img1)
    ImageView head3Img1;
    @Bind(R.id.head3_img2)
    ImageView head3Img2;
    @Bind(R.id.head3_img3)
    ImageView head3Img3;
    @Bind(R.id.head3_img4)
    ImageView head3Img4;
    @Bind(R.id.head3_img5)
    ImageView head3Img5;
    @Bind(R.id.head3_bigImg1)
    ImageView head3BigImg1;
    @Bind(R.id.head3_bigImg2)
    ImageView head3BigImg2;
    @Bind(R.id.home_bottom_scrView)
    HorizontalScrollView homeBottomScrView;
    @Bind(R.id.home_bottom_viewpager)
    ViewPager homeBottomViewpager;
    @Bind(R.id.ll_hun)
    LinearLayout llHun;
    @Bind(R.id.ll_li)
    LinearLayout llLi;
    @Bind(R.id.ll_jia)
    LinearLayout llJia;
    @Bind(R.id.ll_nian)
    LinearLayout llNian;
    @Bind(R.id.ll_hua)
    LinearLayout llHua;
    private WebView webView;
    private WebSettings settings;


    @Override
    protected int getContentView() {
        return R.layout.fragment_home;
    }

    //初始化
    @Override
    protected void init(View view) {

        ButterKnife.bind(this, view);
        viewPager = (ViewPager) view.findViewById(R.id.home_bottom_viewpager);
        fgmData = new ArrayList<>();


        for (int x = 0; x < 8; x++) {
            HomeFragmentAll fragment = new HomeFragmentAll();
            Bundle bundle = new Bundle();
            bundle.putInt("key", x);
            fragment.setArguments(bundle);
            fgmData.add(fragment);
        }
        setHomeHeadImg(view);

        webView = new WebView(getContext());


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


    /**
     * 加载顶部图片
     *
     * @param view
     */
    private void setHomeHeadImg(View view) {
        new HomeHeadSetImg(getActivity(), view);
        HomeAllAdapter adapter = new HomeAllAdapter(getFragmentManager(), fgmData);
        viewPager.setAdapter(adapter);
    }

    /**
     * 所有的点击事件
     *
     * @param view
     */
    @OnClick({ R.id.home_citySelect, R.id.head2_bigImg, R.id.head3_img1, R.id.head3_img2, R.id.head3_img3, R.id.head3_img4, R.id.head3_img5, R.id.head3_bigImg1, R.id.head3_bigImg2, R.id.ll_hun,R.id.ll_li, R.id.ll_jia, R.id.ll_nian, R.id.ll_hua})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.home_citySelect:
                Toast.makeText(getActivity(), "点击了城市选择", Toast.LENGTH_SHORT).show();
                startActivityForResult(new Intent(getActivity(), CitySelectActivity.class),1);
                break;
            case R.id.head2_bigImg:
                Toast.makeText(getActivity(), "bigImg", Toast.LENGTH_SHORT).show();
                getActivity().setContentView(webView);
                webView.loadUrl(Contants.ASSEMBLY_ROOM);
                break;
            case R.id.head3_img1:
                Toast.makeText(getActivity(), "img1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.head3_img2:
                Toast.makeText(getActivity(), "img2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.head3_img3:
                Toast.makeText(getActivity(), "img3", Toast.LENGTH_SHORT).show();
                break;
            case R.id.head3_img4:
                Toast.makeText(getActivity(), "img4", Toast.LENGTH_SHORT).show();
                webView.loadUrl(Contants.GLOBAL_TRAVEL);
                break;
            case R.id.head3_img5:
                Toast.makeText(getActivity(), "img5", Toast.LENGTH_SHORT).show();
                break;
            case R.id.head3_bigImg1:
                Toast.makeText(getActivity(), "bigimg1", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getActivity(), FinancialActivity.class));
                break;
            case R.id.head3_bigImg2:
                Toast.makeText(getActivity(), "bigimg2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ll_hun:
                Toast.makeText(getActivity(), "婚", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ll_li:
                Toast.makeText(getActivity(), "礼", Toast.LENGTH_SHORT).show();
                getActivity().setContentView(webView);
                webView.loadUrl(Contants.Ask_Consultant);
                break;
            case R.id.ll_jia:
                Toast.makeText(getActivity(), "嘉", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ll_nian:
                Toast.makeText(getActivity(), "年", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ll_hua:
                Toast.makeText(getActivity(), "华", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {

        if(requestCode==1&&resultCode==11){
            CityEntity2 cityEntity2 = (CityEntity2) data.getSerializableExtra("city");
            homeHeadText1.setText(cityEntity2.getName());
        }else if(requestCode==1&&resultCode==111){
            CityEntity.DataBean.HotCityBean head_city = (CityEntity.DataBean.HotCityBean) data.getSerializableExtra("city1");
            homeHeadText1.setText(head_city.getName());
        }
        super.onActivityResult(requestCode, resultCode, data);

    }
}
