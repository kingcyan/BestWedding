package com.qf.flag.discoverfragment;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.qf.bestwedding.R;
import com.qf.entity.DiscoverJumpRVEntity;

import java.util.List;

/**
 * Created by Administrator on 2016/8/21.
 */
public class DiscoverJumpAdapter extends RecyclerView.Adapter {
    private Context context;
    private List<DiscoverJumpRVEntity.DataBean.ListBean> data;

    public DiscoverJumpAdapter(Context context, List<DiscoverJumpRVEntity.DataBean.ListBean> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.fragment_jump_recycleview,parent,false);

        return new JumpHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((JumpHolder)holder).title.setText(data.get(position).getTitle());
        ((JumpHolder)holder).summy.setText(data.get(position).getMerchant().getName());
        ((JumpHolder)holder).baoming.setText(data.get(position).getJoin_num()+"");
        ((JumpHolder)holder).focus.setText(data.get(position).getWatch_count()+"");
        Glide.with(context).load(data.get(position).getSurface_img()).into(((JumpHolder)holder).jumpimg);
    }

    /**
     * 建造一个viewholder
     */
    static class JumpHolder extends RecyclerView.ViewHolder{
        TextView title,summy,baoming,focus;
        ImageView jumpimg;

        public JumpHolder(View itemView) {
            super(itemView);
            jumpimg = (ImageView) itemView.findViewById(R.id.jump_img);
            title = (TextView) itemView.findViewById(R.id.jump_news_title);
            summy = (TextView) itemView.findViewById(R.id.jump_news_summy);
            baoming = (TextView) itemView.findViewById(R.id.jump_baoming_count);
            focus = (TextView) itemView.findViewById(R.id.jump_focus_count);
        }
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
