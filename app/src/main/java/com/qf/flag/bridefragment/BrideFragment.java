package com.qf.flag.bridefragment;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import com.mylhyl.crlayout.SwipeRefreshAdapterView;
import com.mylhyl.crlayout.SwipeRefreshRecyclerView;
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
public class BrideFragment extends BaseFragment implements SwipeRefreshAdapterView.OnListLoadListener, SwipeRefreshLayout.OnRefreshListener {

    public static final int MID = 0;
    private SwipeRefreshRecyclerView recyclerView;
    private  List<BrideEntity.DataBean.ListBean> datas;
    private BrideAdapter adapter;
    int page = 1;
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
        recyclerView = findViewByIds(R.id.swipeRefresh,view);

        adapter = new BrideAdapter(datas,getActivity());
        recyclerView.setAdapter(adapter);

        getDatas();

        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        manager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(manager);


        recyclerView.setOnListLoadListener(this);
        recyclerView.setOnRefreshListener(this);


    }


    private void getDatas() {
        Call<BrideEntity> call =  MyApplication.utils.getBrideUrl(MID,page);
        call.enqueue(new Callback<BrideEntity>() {
            @Override
            public void onResponse(Call<BrideEntity> call, Response<BrideEntity> response) {
                List<BrideEntity.DataBean.ListBean> data= response.body().getData().getList();
                datas.clear();
                datas.addAll(data);
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<BrideEntity> call, Throwable t) {

            }
        });
    }


    @Override
    public void onListLoad() {
        page++;
        getDatas();
        recyclerView.setLoading(false);
    }

    @Override
    public void onRefresh() {
        page=1;
        getDatas();
        recyclerView.setRefreshing(false);
    }
}
