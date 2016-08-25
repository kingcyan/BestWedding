package com.qf.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.qf.bestwedding.R;
import com.qf.entity.CityEntity;

import java.util.List;

/**
 * Created by Administrator on 2016/8/23 0023. on 16:34
 * xiaohl_902       城市选择页   热门城市
 */
public class CityAdapter extends RecyclerView.Adapter{

    private Context context;
    private List<CityEntity.DataBean.HotCityBean> datas;

    public CityAdapter(Context context, List<CityEntity.DataBean.HotCityBean> datas) {
        this.context = context;
        this.datas = datas;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item1_city,null);
        view.setOnClickListener((View.OnClickListener) context);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((MyViewHolder)holder).textView.setText(datas.get(position).getName());
       // ((MyViewHolder)holder).textView.setOnClickListener((View.OnClickListener) context);
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }



    public CityEntity.DataBean.HotCityBean getIten(int position) {
        return datas.get(position);
    }

    static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView textView ;
        public MyViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.it1_city_text);
        }
    }
}
