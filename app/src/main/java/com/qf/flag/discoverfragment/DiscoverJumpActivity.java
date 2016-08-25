package com.qf.flag.discoverfragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.qf.bestwedding.MyApplication;
import com.qf.bestwedding.R;
import com.qf.entity.DiscoverJumpRVEntity;
import com.qf.utillibary.base.BaseActivity;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by King
 * 2016/8/20
 */
public class DiscoverJumpActivity extends BaseActivity implements View.OnClickListener {

    //返回按钮
    private ImageView iv_back;
    //头部图片
    private ImageView jumpHeadimg;

    //发现页头部图片点击后跳转的url
//    private String headJumpUrl;

    private RecyclerView jumpRecycleView;
    private List<DiscoverJumpRVEntity.DataBean.ListBean> data = new ArrayList<>();

    @Override
    public int getContentViewId() {
        return R.layout.activity_discover_headjump_vp;
    }



    /**
     * 初始化方法
     */
    @Override
    protected void init() {


        //返回控件
        iv_back = findViewByIds(R.id.Header_back);
        //设置点击事件
        iv_back.setOnClickListener(this);

        jumpHeadimg = findViewByIds(R.id.head_afterjump_img);
        Log.e("TAG", "init: "+getIntent().getStringExtra("key"));
        Glide.with(this).load(getIntent().getStringExtra("key")).into(jumpHeadimg);



        jumpRecycleView = findViewByIds(R.id.head_afterjump_cv);

        getJumpRecycleview();

        DiscoverJumpAdapter adapter = new DiscoverJumpAdapter(this,data);
        jumpRecycleView.setAdapter(adapter);

        LinearLayoutManager manager2 = new LinearLayoutManager(this);
        manager2.setOrientation(LinearLayoutManager.VERTICAL);
        jumpRecycleView.setLayoutManager(manager2);




    }

    private void getJumpRecycleview() {


        Call<DiscoverJumpRVEntity> call = MyApplication.utils.getJumpRVDatas();
        call.enqueue(new Callback<DiscoverJumpRVEntity>() {
            @Override
            public void onResponse(Call<DiscoverJumpRVEntity> call, Response<DiscoverJumpRVEntity> response) {
                List<DiscoverJumpRVEntity.DataBean.ListBean> da =  response.body().getData().getList();
                data.addAll(da);
                jumpRecycleView.getAdapter().notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<DiscoverJumpRVEntity> call, Throwable t) {

            }
        });
    }



    /**
     * FragmentStatePagerAdapter adapter = new FragmentStatePagerAdapter(getSupportFragmentManager()) {
    @Override
    public Fragment getItem(int position) {
    if (position == 1){
    //搭配页面
    return new HomeVpFitFragment();
    }
    return new HomeVpFragment();
    }

    @Override
    public int getCount() {
    return 3;
    }
    };
     homeVp.setAdapter(adapter);

     * @param v
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            //点击返回将页面finish掉
                   case R.id.Header_back:
                DiscoverJumpActivity.this.finish();
                break;

        }
    }


}
