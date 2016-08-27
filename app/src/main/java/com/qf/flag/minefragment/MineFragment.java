package com.qf.flag.minefragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.qf.bestwedding.FinancialActivity;
import com.qf.bestwedding.R;
import com.qf.utillibary.base.BaseFragment;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by King
 * 2016/8/19
 */
public class MineFragment extends BaseFragment {


    @Bind(R.id.mine_setting)
    ImageView mineSetting;
    @Bind(R.id.mine_bind_phone)
    ImageView mineBindPhone;
    @Bind(R.id.rl_mine_account)
    RelativeLayout rlMineAccount;
    @Bind(R.id.my_reservation)
    TextView myReservation;
    @Bind(R.id.my_order)
    TextView myOrder;
    @Bind(R.id.my_shopping_cart)
    TextView myShoppingCart;
    @Bind(R.id.my_sign)
    TextView mySign;
    @Bind(R.id.relative_money)
    RelativeLayout relativeMoney;
    @Bind(R.id.relative_financial)
    RelativeLayout relativeFinancial;
    @Bind(R.id.relative_collect)
    RelativeLayout relativeCollect;
    @Bind(R.id.relative_focus)
    RelativeLayout relativeFocus;
    @Bind(R.id.relative_topic)
    RelativeLayout relativeTopic;
    @Bind(R.id.relative_activity)
    RelativeLayout relativeActivity;
    @Bind(R.id.relative_imMerchant)
    RelativeLayout relativeImMerchant;
    @Bind(R.id.relative_contactService)
    RelativeLayout relativeContactService;
    //WebView
    private WebView webView;
    private WebSettings settings;

    @Override
    protected int getContentView() {
        return R.layout.fragment_mine;
    }


    //初始化
    @Override
    protected void init(View view) {
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        ButterKnife.bind(this, rootView);
        return rootView;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @OnClick({R.id.mine_setting, R.id.mine_bind_phone, R.id.rl_mine_account, R.id.my_reservation, R.id.my_order, R.id.my_shopping_cart, R.id.my_sign, R.id.relative_money, R.id.relative_financial, R.id.relative_collect, R.id.relative_focus, R.id.relative_topic, R.id.relative_activity, R.id.relative_imMerchant, R.id.relative_contactService})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.mine_setting:
//                Toast.makeText(getActivity(), "请完善设置", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getActivity(),SettingActivity.class));
                break;
            case R.id.mine_bind_phone:
                Toast.makeText(getActivity(), "请绑定手机", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rl_mine_account:
                Toast.makeText(getActivity(), "跳转到用户信息界面", Toast.LENGTH_SHORT).show();
                break;
            case R.id.my_reservation:
                Toast.makeText(getActivity(),"我的预约", Toast.LENGTH_SHORT).show();
                break;
            case R.id.my_order:
                Toast.makeText(getActivity(),"我的订单", Toast.LENGTH_SHORT).show();
                break;
            case R.id.my_shopping_cart:
                Toast.makeText(getActivity(),"购物车", Toast.LENGTH_SHORT).show();
                break;
            case R.id.my_sign:
                Toast.makeText(getActivity(),"签到", Toast.LENGTH_SHORT).show();
                break;
            case R.id.relative_money:
                Toast.makeText(getActivity(),"钱包栏", Toast.LENGTH_SHORT).show();
                break;
            case R.id.relative_financial:
                startActivity(new Intent(getActivity(), FinancialActivity.class));
                break;
            case R.id.relative_collect:
                Toast.makeText(getActivity(),"收藏栏", Toast.LENGTH_SHORT).show();
                break;
            case R.id.relative_focus:
                Toast.makeText(getActivity(),"关注栏", Toast.LENGTH_SHORT).show();
                break;
            case R.id.relative_topic:
                Toast.makeText(getActivity(),"话题栏", Toast.LENGTH_SHORT).show();
                break;
            case R.id.relative_activity:
                Toast.makeText(getActivity(),"活动栏", Toast.LENGTH_SHORT).show();
                break;
            case R.id.relative_imMerchant:
                Toast.makeText(getActivity(),"我是商家", Toast.LENGTH_SHORT).show();
                break;
            case R.id.relative_contactService:
                Toast.makeText(getActivity(),"婚礼纪客服", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
