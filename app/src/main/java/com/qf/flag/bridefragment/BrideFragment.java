package com.qf.flag.bridefragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.qf.bestwedding.MyApplication;
import com.qf.bestwedding.R;
import com.qf.entity.BrideEntity;
import com.qf.utillibary.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by King
 * 2016/8/19
 */
public class BrideFragment extends BaseFragment{

   private  List<BrideEntity.DataBean.ListBean> datas;
    private RecyclerView recyclerView;
    private BrideAdapter adapter;
    @Override
    protected int getContentView() {
        return R.layout.fragment_bride;
    }

    /**
     *  初始化方法
     * @param view
     */
    @Override
    protected void init(View view) {

        datas = new ArrayList<>();
        recyclerView = findViewByIds(R.id.Brideview,view);

        adapter = new BrideAdapter(datas,getActivity());
        recyclerView.setAdapter(adapter);

        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        manager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(manager);

        Call<BrideEntity> call =  MyApplication.utils.getBrideUrl();
        call.enqueue(new Callback<BrideEntity>() {
            @Override
            public void onResponse(Call<BrideEntity> call, Response<BrideEntity> response) {
               List<BrideEntity.DataBean.ListBean> data= response.body().getData().getList();
                Log.e("TAG", "onResponse: "+response.body().getData().toString() );

                datas.addAll(data);
                recyclerView.getAdapter().notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<BrideEntity> call, Throwable t) {

            }
        });
    }
}
