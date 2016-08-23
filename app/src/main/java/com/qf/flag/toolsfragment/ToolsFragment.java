package com.qf.flag.toolsfragment;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.qf.bestwedding.MyApplication;
import com.qf.bestwedding.R;
import com.qf.entity.ToolEntity;
import com.qf.utillibary.base.BaseFragment;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by King
 * 2016/8/19
 */
public class ToolsFragment extends BaseFragment implements View.OnClickListener {

    //头部图片
    private ImageView ToolHeadIMG;
    private String ToolHeadIMGURL;

    //头部图片跳转后的url
    private String mURL;

    //结婚任务和电子请帖按钮
    private RelativeLayout relativeLayoutleft, relativeLayoutright;

    //底部按钮
    private RelativeLayout budget,plan,wechat,seat,luckly_day,register,story,account;

    @Override
    protected int getContentView() {
        return R.layout.fragment_tools;
    }

    /**
     * 初始化方法
     *
     * @param view
     */
    @Override
    protected void init(View view) {
        initView(view);
        setToolIMG(view);
    }

    private void initView(View view) {
        //查找控件
        ToolHeadIMG = findViewByIds(R.id.tool_head_img,view);
        relativeLayoutleft = findViewByIds(R.id.tool_left,view);
        relativeLayoutright = findViewByIds(R.id.tool_right,view);
        budget = findViewByIds(R.id.budget,view);
        plan = findViewByIds(R.id.plan,view);
        wechat = findViewByIds(R.id.wechat,view);
        seat = findViewByIds(R.id.seat,view);
        luckly_day = findViewByIds(R.id.luckly_day,view);
        register = findViewByIds(R.id.regist,view);
        story = findViewByIds(R.id.story,view);
        account = findViewByIds(R.id.amounts,view);


        //设置点击事件
        account.setOnClickListener(this);
        story.setOnClickListener(this);
        register.setOnClickListener(this);
        luckly_day.setOnClickListener(this);
        seat.setOnClickListener(this);
        wechat.setOnClickListener(this);
        plan.setOnClickListener(this);
        budget.setOnClickListener(this);
        relativeLayoutright.setOnClickListener(this);
        relativeLayoutleft.setOnClickListener(this);
        ToolHeadIMG.setOnClickListener(this);
    }

    /**
     * 联网获取下载的头部图片，并设置给ToolHeadIMG
     * @param view
     */
    private void setToolIMG(View view) {
        Call<ToolEntity> call = MyApplication.utils.getToolIMG();
        call.enqueue(new Callback<ToolEntity>() {
            @Override
            public void onResponse(Call<ToolEntity> call, Response<ToolEntity> response) {
               // 得到头部的图片地址
                ToolHeadIMGURL = response.body().getData()
                        .getFloors().getTOOLS_BANNER().getHoles().get(0).
                                getPosters().getImage_path();
                //点击头部图片跳转页面的图片url

                mURL = response.body().getData()
                        .getFloors().getTOOLS_BANNER().getHoles().get(0).
                                getPosters().getTarget_url();

//                Log.e("TAG", ToolHeadIMGURL );

                //将图片设置给控件
                Glide.with(getActivity())
                        .load(ToolHeadIMGURL)
                        .into(ToolHeadIMG);
            }

            @Override
            public void onFailure(Call<ToolEntity> call, Throwable t) {

            }
        });
    }


    //点击事件的跳转
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tool_left:
                //跳转到结婚任务
                Toast.makeText(getActivity(), "点击了结婚任务", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tool_right:
                //跳转到电子请帖
                Toast.makeText(getActivity(), "点击了电子请帖", Toast.LENGTH_SHORT).show();
                Intent in = new Intent(getActivity(), InvitationActivity.class);
                startActivity(in);
                break;
            case R.id.tool_head_img:
                //点击了头部图片
//                Toast.makeText(getActivity(), "点击了头部图片", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(),HeadWedding.class);
                intent.putExtra("URL",mURL);
                startActivity(intent);
//                WebView webView = new WebView(getActivity());
//                webView.loadUrl(mURL);
//                webView.getSettings().setJavaScriptEnabled(true);
//                getActivity().setContentView(webView);
                break;
        }
    }
}
