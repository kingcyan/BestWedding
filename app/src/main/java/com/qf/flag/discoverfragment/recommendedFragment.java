package com.qf.flag.discoverfragment;

import android.annotation.SuppressLint;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.qf.adapter.RecommendedAdapter;
import com.qf.bestwedding.MyApplication;
import com.qf.bestwedding.R;
import com.qf.entity.DiscoverEntity;
import com.qf.utillibary.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by King
 * 2016/8/23
 */
@SuppressLint("ValidFragment")
class RecommendedFragment extends BaseFragment {
    RecyclerView recyclerView;
    List<DiscoverEntity.DataBean.ListBean> datas;

    @Override
    protected int getContentView() {
        return R.layout.fragment_recommended;

    }

    /**
     * 初始化方法
     * @param view
     */
    @Override
    protected void init(View view) {
        //查找控件
        datas = new ArrayList<>();
        recyclerView = findViewByIds(R.id.recyclerview, view);


        //初始化Adapter
        RecommendedAdapter adapter = new RecommendedAdapter(getActivity(), datas);
        //设置Aadapter
        recyclerView.setAdapter(adapter);

        getDatas();
        //设置Manager
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    }

    //获取数据
    private void getDatas() {
        Call<DiscoverEntity> call = MyApplication.utils.getDisDatas(0,0);
        call.enqueue(new Callback<DiscoverEntity>() {
            @Override
            public void onResponse(Call<DiscoverEntity> call, Response<DiscoverEntity> response) {
                List<DiscoverEntity.DataBean.ListBean> data = response.body().getData().getList();
                //将获取到的数据放入list集合
                datas.addAll(data);

                //获取到数据后刷新
                recyclerView.getAdapter().notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<DiscoverEntity> call, Throwable t) {

            }
        });
    }

}
