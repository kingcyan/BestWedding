package com.qf.flag.homefragment;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.qf.adapter.HomeAdapter1;
import com.qf.bestwedding.MyApplication;
import com.qf.bestwedding.R;
import com.qf.entity.HomeAllEntity;
import com.qf.utillibary.base.BaseFragment;

import java.util.List;

import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Administrator on 2016/8/20 0020. on 15:49
 * xiaohl_902
 */
public class HomeFragmentAll extends BaseFragment {

    //数据源
    private List<HomeAllEntity.DataBean.ListBean> list;
    //适配器
    private HomeAdapter1 adapter1;
    //

    //  @BindView(R.id.home_fgm_listview)
    ListView listview;
    private int pageType;//当前页的类型
    private Call<HomeAllEntity> call_all;

    @Override
    protected int getContentView() {
        return R.layout.home_fragment;
    }

    @Override
    protected void init(View view) {
        ButterKnife.bind(getActivity(), view);
        listview = (ListView) view.findViewById(R.id.home_fgm_listview);
    //    listview.addHeaderView(LayoutInflater.from(getContext()).inflate(R.layout.fragment_home_head, null));
        adapter1 = new HomeAdapter1(getActivity());
        listview.setAdapter(adapter1);
        aa(listview);
    }

    @Override
    protected void loadDatas() {

        pageType = getArguments().getInt("key");

        switch (pageType) {
            case 0:
                call_all = MyApplication.utils.getHomeAllData();//首页Fragment全部
                break;
            case 1:
                call_all = MyApplication.utils.getHomeWeddingPlannerData();  //婚礼策划
                break;
            case 2:
                call_all = MyApplication.utils.getHomeWeddingPhotoData(); //婚纱摄影
                break;
            case 3:
                call_all = MyApplication.utils.getHomeWeddingDressesData(); //婚纱礼服
                break;
            case 4:
                call_all = MyApplication.utils.getHomeWeddingPhotographyData(); //婚礼摄影
                break;
            case 5:
                call_all = MyApplication.utils.getHomeWeddingCameraData(); //婚礼摄像
                break;
            case 6:
                call_all = MyApplication.utils.getHomeWeddingMakeupData();//婚礼跟妆
                break;
            case 7:
                call_all = MyApplication.utils.getHomeWeddingEmceeData();//婚礼司仪
                break;
        }


        call_all.enqueue(new Callback<HomeAllEntity>() {

            @Override
            public void onResponse(Call<HomeAllEntity> call, Response<HomeAllEntity> response) {
                list = response.body().getData().getList();
                adapter1.setDatas(list);
            }

            @Override
            public void onFailure(Call<HomeAllEntity> call, Throwable t) {

            }
        });
    }


    public void aa(ListView listViews){
       int a =  listViews.getCount()*9/10;
        int h =  getActivity().getWindowManager().getDefaultDisplay().getHeight()*a;
        ViewGroup.LayoutParams layoutParams = listview.getLayoutParams();
        layoutParams.height = h;
        listview.setLayoutParams(layoutParams);
    }
}
