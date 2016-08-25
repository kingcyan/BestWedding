package com.qf.bestwedding;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.qf.adapter.ChengShiAdapter;
import com.qf.adapter.CityAdapter;
import com.qf.entity.CityEntity2;
import com.qf.entity.CityEntity;
import com.qf.util.Contants;
import com.qf.utillibary.base.BaseActivity;
import com.qf.utillibary.util.HttpUtil;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Administrator on 2016/8/22 0022. on 20:35
 * xiaohl_902
 */
public class CitySelectActivity extends BaseActivity implements View.OnClickListener ,AdapterView.OnItemClickListener{

    @Bind(R.id.city_finish)
    ImageButton cityFinish;
    @Bind(R.id.zi_cityzi1)
    RelativeLayout ziCityzi1;
//    @Bind(R.id.city_recyclerView)
    RecyclerView cityRecyclerView;

    @Bind(R.id.city_listView)
    ListView cityListView;      //底部的listView
    private CityEntity.DataBean.ListBean botDatas;//底部的listView的数据源
    private List<CityEntity2> datas2;    //底部的listView的数据源
    private ChengShiAdapter chengShiAdapter;//底部的listView的适配器

    private Call<CityEntity> call_city;   //下载数据
    private CityAdapter adapter;   //适配器
    private List<CityEntity.DataBean.HotCityBean> datas; //数据源

    private View head_view;

    @Override
    public int getContentViewId() {
        return R.layout.acitivity_cityselect;
    }

    @Override
    protected void init() {
        head_view = LayoutInflater.from(CitySelectActivity.this).inflate(R.layout.city_centre,null);
        cityRecyclerView = (RecyclerView)head_view.findViewById(R.id.city_recyclerView);
        datas2 = new ArrayList<>();


        ButterKnife.bind(this);
    }

    @Override
    protected void loadDatas() {
        cityListView.addHeaderView(head_view);
        bottomListView();    //下面一部分listView
        topCityData();    //上面一部分的listView

        cityListView.setOnItemClickListener(this);
    }

    //上面一部分的listView
    private void topCityData() {


        call_city = MyApplication.utils.getCityEntity();//首页Fragment全部
        call_city.enqueue(new Callback<CityEntity>() {
            @Override
            public void onResponse(Call<CityEntity> call, Response<CityEntity> response) {
                datas = response.body().getData().getHot_city();

                if(datas!=null){
                    //对recyclerView设置适配器
                    adapter = new CityAdapter(CitySelectActivity.this, datas);
                    Log.d("print", "onResponse() ----->: " +cityRecyclerView);
                    cityRecyclerView.setLayoutManager(new GridLayoutManager(CitySelectActivity.this, 2));
                    cityRecyclerView.setAdapter(adapter);
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<CityEntity> call, Throwable t) {

            }
        });
    }
    //下面一部分listView
    private void bottomListView() {
        chengShiAdapter = new ChengShiAdapter(CitySelectActivity.this);
        cityListView.setAdapter(chengShiAdapter);

        final String[] str = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        final String[] str_zm = {"A", "B", "C", "D", "E", "F", "G", "H","I", "J", "K", "L", "M", "N","O", "P", "Q", "R", "S", "T","U","V", "W", "X", "Y", "Z"};
        HttpUtil.downJson(Contants.HOME_CITY_SELECT, new HttpUtil.DownLoadListener() {
            @Override
            public void downSucc(String url, String json) {
                try {
                    JSONObject jsob = new JSONObject(json);
                    JSONObject jsob2 = jsob.getJSONObject("data");
                    JSONObject jsob3 = jsob2.getJSONObject("list");

                    for (int x = 0; x < str.length; x++) {
                        JSONArray jsar = jsob3.optJSONArray(str[x]);

                        if(jsar!=null){
                            CityEntity2 entity2 = new CityEntity2();
                            entity2.setType(0);
                            entity2.setZm(str_zm[x]);
                            datas2.add(entity2);

                            for(int y = 0;y<jsar.length();y++){
                                JSONObject jsob4 = jsar.getJSONObject(y);
                                CityEntity2 cItyEntity2 = new CityEntity2();

                                cItyEntity2.setShort_py(jsob4.getString("short_py"));
                                cItyEntity2.setPinyin(jsob4.getString("pinyin"));
                                cItyEntity2.setCid(jsob4.getString("cid"));
                                cItyEntity2.setName(jsob4.getString("name"));
                                datas2.add(cItyEntity2);
                            }
                        }
                    }
                    chengShiAdapter.setDatas(datas2);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @OnClick({R.id.city_finish, R.id.zi_cityzi1})
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.city_finish:
                finish();
                return;
        }

        //recyclerView      Item的点击事件
        int position = cityRecyclerView.getChildAdapterPosition(view);
        Toast.makeText(CitySelectActivity.this, position+"", Toast.LENGTH_SHORT).show();
        CityEntity.DataBean.HotCityBean head_city = adapter.getIten(position);
        Intent   intent = getIntent();
        intent.putExtra("city1",head_city);
        setResult(111,intent);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }


    /**
     * listView的点击事件
     * @param parent
     * @param view
     * @param position
     * @param id
     */
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        CityEntity2 cityEntity2 = (CityEntity2) chengShiAdapter.getItem(position-1);
        Toast.makeText(CitySelectActivity.this, cityEntity2.getName(), Toast.LENGTH_SHORT).show();
        Intent   intent = getIntent();
        intent.putExtra("city",cityEntity2);
        setResult(11,intent);
        finish();
    }
}
