package com.qf.flag.discoverfragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
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
public class recommendedFragment extends BaseFragment {
    RecyclerView recyclerView;
    List<DiscoverEntity.DataBean.ListBean> datas;

    @Override
    protected int getContentView() {
        Log.e("TAG", "getContentView:" );
        return R.layout.fragment_recommended;

    }

    @Override
    protected void init(View view) {

        datas = new ArrayList<>();
        recyclerView = findViewByIds(R.id.recyclerview, view);

        RecommendedAdapter adapter = new RecommendedAdapter(getActivity(), datas);
        recyclerView.setAdapter(adapter);
        getDatas();
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    }

    private void getDatas() {
        Call<DiscoverEntity> call = MyApplication.utils.getDisDatas();
        call.enqueue(new Callback<DiscoverEntity>() {
            @Override
            public void onResponse(Call<DiscoverEntity> call, Response<DiscoverEntity> response) {
                List<DiscoverEntity.DataBean.ListBean> data = response.body().getData().getList();
                Log.e("TAG", "onResponse: " + data.size());
                datas.addAll(data);
                recyclerView.getAdapter().notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<DiscoverEntity> call, Throwable t) {

            }
        });
    }

}
