package com.qf.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.qf.bestwedding.R;
import com.qf.entity.DiscoverEntity;

import java.util.List;

/**
 * Created by King
 * 2016/8/23
 */
public class RecommendedAdapter extends RecyclerView.Adapter {

    Context context;
    List<DiscoverEntity.DataBean.ListBean> datas;
    View view;

    public RecommendedAdapter(Context context, List<DiscoverEntity.DataBean.ListBean> datas) {
        this.context = context;
        this.datas = datas;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (getItemViewType(viewType) == 0) {
            View view = LayoutInflater.from(context).inflate(R.layout.dis_item1, parent, false);
            return new MyViewHolder(view);
        } else {
            View view = LayoutInflater.from(context).inflate(R.layout.dis_item2, parent, false);
            return new MyViewHolder2(view);
        }


    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof MyViewHolder) {
            Glide.with(context).load(datas.get(position).getList_img())
                    .centerCrop()
                    .into(((MyViewHolder) holder).iv);
            ((MyViewHolder) holder).tv_title.setText(datas.get(position).getGood_title());
            ((MyViewHolder) holder).tv_content.setText(datas.get(position).getSummary());
            ((MyViewHolder) holder).tv_ids_watch_count.setText(datas.get(position).getWatch_count() + "");
        } else if (holder instanceof MyViewHolder2) {
            Glide.with(context).load(datas.get(position).getList_img())
                    .centerCrop()
                    .into(((MyViewHolder2) holder).iv);
            ((MyViewHolder2) holder).tv_title.setText(datas.get(position).getGood_title());
            ((MyViewHolder2) holder).tv_ids_watch_count.setText(datas.get(position).getWatch_count() + "");
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (position % 5 == 0 || position % 5 == 1) {
            return 0;
        }
        return 1;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView iv;
        TextView tv_title, tv_ids_watch_count, tv_content;

        public MyViewHolder(View itemView) {
            super(itemView);
            iv = (ImageView) itemView.findViewById(R.id.dis_iv_title);
            tv_title = (TextView) itemView.findViewById(R.id.dis_tv_title);
            tv_ids_watch_count = (TextView) itemView.findViewById(R.id.ids_watch_count);
            tv_content = (TextView) itemView.findViewById(R.id.dis_tv_content);
        }
    }

    public static class MyViewHolder2 extends RecyclerView.ViewHolder {
        ImageView iv;
        TextView tv_title, tv_ids_watch_count;

        public MyViewHolder2(View itemView) {
            super(itemView);
            iv = (ImageView) itemView.findViewById(R.id.dis_iv_title2);
            tv_title = (TextView) itemView.findViewById(R.id.dis_tv_title2);
            tv_ids_watch_count = (TextView) itemView.findViewById(R.id.ids_watch_count2);
        }
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }


}
