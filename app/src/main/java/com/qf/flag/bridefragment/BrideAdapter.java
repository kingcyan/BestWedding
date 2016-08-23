package com.qf.flag.bridefragment;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.qf.bestwedding.R;
import com.qf.entity.BrideEntity;

import java.util.List;

/**
 * Created by King
 * 2016/8/22
 */
public class BrideAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    private List<BrideEntity.DataBean.ListBean> datas;
    private Context context;

    public BrideAdapter(List<BrideEntity.DataBean.ListBean> datas, Context context) {
        this.datas = datas;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.bride_item1,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((MyViewHolder)holder).tv_title.setText(datas.get(position).getEntity().getTitle());
        ((MyViewHolder)holder).tv_content.setText(datas.get(position).getEntity().getPost().getMessage());
        ((MyViewHolder)holder).tv_idName.setText(datas.get(position).getEntity().getAuthor_nick());
//        ((MyViewHolder)holder).tv_Thumb.setText(datas.get(position).getEntity().getPost().getPraised_count());
//        ((MyViewHolder)holder).tv_comments.setText(datas.get(position).getEntity().getPost().getPraised_count());

//        Glide.with(context).load(datas.get(position).getEntity().getPost().getPics().get(0).getPath()).into((((MyViewHolder) holder).iv_left));
//        Glide.with(context).load(datas.get(position).getEntity().getPost().getPics().get(1).getPath()).into((((MyViewHolder) holder).iv_center));
//        Glide.with(context).load(datas.get(position).getEntity().getPost().getPics().get(2).getPath()).into((((MyViewHolder) holder).iv_right));
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tv_title,tv_content,tv_idName,tv_Thumb,tv_comments;
        ImageView iv_left,iv_center,iv_right;
        public MyViewHolder(View itemView) {
            super(itemView);
            tv_title = (TextView) itemView.findViewById(R.id.tv_title);
            tv_content = (TextView) itemView.findViewById(R.id.tv_content);
            tv_idName = (TextView) itemView.findViewById(R.id.tv_Name);
            tv_Thumb = (TextView) itemView.findViewById(R.id.Thumb_up);
            tv_comments = (TextView) itemView.findViewById(R.id.tv_comments);

            iv_left = (ImageView) itemView.findViewById(R.id.iv_left);
            iv_center = (ImageView) itemView.findViewById(R.id.iv_content);
            iv_right = (ImageView) itemView.findViewById(R.id.iv_right);
        }
    }
}
