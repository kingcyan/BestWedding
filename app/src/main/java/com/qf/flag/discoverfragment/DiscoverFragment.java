package com.qf.flag.discoverfragment;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.qf.bestwedding.MyApplication;
import com.qf.bestwedding.R;
import com.qf.entity.Discover_head_img;
import com.qf.utillibary.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by King
 * 2016/8/18
 */
public class DiscoverFragment extends BaseFragment implements View.OnClickListener {

    //发现页顶部图片
    String headIMG;
    ImageView headIV;

    //头部控件
    DiscoverTabView discoverTabView;

    //跳转后的顶部图片
    String toHeadImg;

    ViewPager dicover_viewpager;

    //数据
    String[] datas = {"推荐", "人气婚礼", "结婚经", "心机指南", "新风向"};


    @Override
    protected int getContentView() {
        return R.layout.fragment_discover;
    }


    /*8
    初始化方法
     */
    @Override
    protected void init(View view) {
        //查找控件
        headIV = findViewByIds(R.id.discover_head_pic, view);
        discoverTabView = findViewByIds(R.id.tabview, view);
        dicover_viewpager = findViewByIds(R.id.dicover_viewpager, view);

        headIV.setOnClickListener(this);

        //初始化头部组合控件
        discoverTabView.setTabs(datas);
        discoverTabView.setViewPager(dicover_viewpager);

        //设置Adapter
        MyAdapter adapter = new MyAdapter(getActivity(), datas);
        dicover_viewpager.setAdapter(adapter);


        FragmentStatePagerAdapter pagerAdapter = new FragmentStatePagerAdapter(getChildFragmentManager()) {

            @Override
            public int getCount() {
                return datas.length;
            }

            @Override
            public Fragment getItem(int position) {

                    return new recommendedFragment();

            }
        };
        dicover_viewpager.setAdapter(pagerAdapter);
    }


    //获取头部图片和跳转图片的URL
    @Override
    protected void loadDatas() {
        Call<Discover_head_img> call = MyApplication.utils.getDisImg();
        call.enqueue(new Callback<Discover_head_img>() {
            @Override
            public void onResponse(Call<Discover_head_img> call, Response<Discover_head_img> response) {
                //得到头部图片的URL
                headIMG = response.body().getData().getFloors().getSITE_FIND_TOP_BANNER().getHoles().get(0).getPosters().getImage_path();
                //将Url设置到图片
                if (headIMG != null) {
                    Glide.with(getActivity()).load(headIMG).into(headIV);
                }
                //得到跳转页面的头部图片URL
                toHeadImg = response.body().getData().getFloors()
                        .getSITE_FIND_TOP_BANNER().getHoles().get(0).getPosters().getTarget_url();
                //                Log.e("TAG", "onResponse: "+toHeadImg );
            }

            @Override
            public void onFailure(Call<Discover_head_img> call, Throwable t) {

            }
        });
    }


    // 点击图片跳转另一个Activity
    @Override
    public void onClick(View v) {
        Intent in = new Intent(getActivity(), JumpAactivity.class);
        in.putExtra("key", toHeadImg);
        startActivity(in);
    }


}

class MyAdapter extends PagerAdapter {

    private List<TextView> textViews;

    public MyAdapter(Context context, String[] datas) {
        this.textViews = new ArrayList<>();

        for (String data : datas) {
            TextView tv = new TextView(context);
            //            tv.setText(data);
            //            tv.setTextSize(50);
            //            tv.setGravity(Gravity.CENTER);
            textViews.add(tv);
        }
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(textViews.get(position));
        return textViews.get(position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(textViews.get(position));
        //            container.removeViewAt(position);
    }

    @Override
    public int getCount() {
        return textViews.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }
}
