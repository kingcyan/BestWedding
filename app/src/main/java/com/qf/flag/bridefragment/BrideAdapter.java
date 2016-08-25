package com.qf.flag.bridefragment;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.qf.bestwedding.R;
import com.qf.entity.BrideEntity;

import java.util.List;

/**
 * Created by King
 * 2016/8/22
 */
public class BrideAdapter extends RecyclerView.Adapter {

    private List<BrideEntity.DataBean.ListBean> datas;
    private Context context;
    View view;

    public BrideAdapter(List<BrideEntity.DataBean.ListBean> datas, Context context) {
        this.datas = datas;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //三张小图图片
        if (getItemViewType(viewType) == 1) {
            view = LayoutInflater.from(context).inflate(R.layout.wedding_threeimg, parent, false);
            return new threeViewHolder(view);
        }
        //1张大图
        else if (getItemViewType(viewType) == 3) {
            view = LayoutInflater.from(context).inflate(R.layout.wedding_maximg, parent, false);
            return new onemaxViewHolder(view);
        }
        //一张小图
        else if (getItemViewType(viewType) == 2) {
            view = LayoutInflater.from(context).inflate(R.layout.wedding_oneimg, parent, false);
            return new oneminViewHolder(view);
        }
        //没有图
        view = LayoutInflater.from(context).inflate(R.layout.wedding_threeimg, parent, false);
        return new noimgViewHolder(view);

    }

    @Override
    public int getItemViewType(int position) {
        //三张小图图片
        if (datas.get(position).getEntity().getPost().getPics().size() > 1) {
            return 1;
        }

        //一张大图
        if (datas.get(position).getEntity().getPages().getImg_path() != null) {
            return 3;
        }
        //没有图的
        if (datas.get(position).getEntity().getPages().equals("null")
                && datas.get(position).getEntity().getPost().getPics().size() == 0) {
            return 4;
        }
        if (datas.get(position).getEntity().getPost().getPics().size() == 1) {
            return 2;
        }
        return 0;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        switch (getItemViewType(position)) {
//            case 1:
//                ((threeViewHolder) holder).tv_title.setText(datas.get(position).getEntity().getTitle());
//                ((threeViewHolder) holder).tv_content.setText(datas.get(position).getEntity().getPost().getMessage());
//                ((threeViewHolder) holder).tv_idName.setText(datas.get(position).getEntity().getAuthor().getNick());
//                ((threeViewHolder) holder).tv_Thumb.setText(datas.get(position).getEntity().getPost_count());
//                ((threeViewHolder) holder).tv_comments.setText(datas.get(position).getEntity().getPost().getPraised_count());
//                if (datas.get(position).getEntity().getPost().getPics().size() == 2) {
//                    Glide.with(context).load(datas.get(position).getEntity().getPost().getPics().get(0).getPath()).into((((threeViewHolder) holder).iv_left));
//                    Glide.with(context).load(datas.get(position).getEntity().getPost().getPics().get(1).getPath()).into((((threeViewHolder) holder).iv_center));
//                }
//                if (datas.get(position).getEntity().getPost().getPics().size() == 3) {
//                    Glide.with(context).load(datas.get(position).getEntity().getPost().getPics().get(0).getPath()).into((((threeViewHolder) holder).iv_left));
//                    Glide.with(context).load(datas.get(position).getEntity().getPost().getPics().get(1).getPath()).into((((threeViewHolder) holder).iv_center));
//                    Glide.with(context).load(datas.get(position).getEntity().getPost().getPics().get(2).getPath()).into((((threeViewHolder) holder).iv_center));
//
//                }
//                break;
            case 2:
                ((oneminViewHolder) holder).tv_title.setText(datas.get(position).getEntity().getTitle());
                ((oneminViewHolder) holder).tv_content.setText(datas.get(position).getEntity().getPost().getMessage());
                ((oneminViewHolder) holder).tv_idName.setText(datas.get(position).getEntity().getAuthor().getNick());
                ((oneminViewHolder) holder).tv_Thumb.setText(datas.get(position).getEntity().getPost_count());
                ((oneminViewHolder) holder).tv_comments.setText(datas.get(position).getEntity().getPost().getPraised_count());
                Glide.with(context).load(datas.get(position).getEntity().getAuthor().getImg()).into((((oneminViewHolder) holder).ivid));
                Glide.with(context).load(datas.get(position).getEntity().getPost().getPics().get(0).getPath()).into((((oneminViewHolder) holder).iv_left));
                break;
            case 3:
                ((onemaxViewHolder) holder).tv_title.setText(datas.get(position).getEntity().getTitle());
                ((onemaxViewHolder) holder).tv_content.setText(datas.get(position).getEntity().getPost().getMessage());
                Glide.with(context).load(datas.get(position).getEntity().getPages().getImg_path()).into((((onemaxViewHolder) holder).contentimg));
                break;
            case 4:
                ((noimgViewHolder) holder).tv_title.setText(datas.get(position).getEntity().getTitle());
                ((noimgViewHolder) holder).tv_content.setText(datas.get(position).getEntity().getPost().getMessage());
                ((noimgViewHolder) holder).tv_idName.setText(datas.get(position).getEntity().getAuthor().getNick());
                ((noimgViewHolder) holder).tv_Thumb.setText(datas.get(position).getEntity().getPost_count());
                ((noimgViewHolder) holder).tv_comments.setText(datas.get(position).getEntity().getPost().getPraised_count());
                Glide.with(context).load(datas.get(position).getEntity().getAuthor().getImg()).into((((noimgViewHolder) holder).iv));
                break;
        }

    }

    @Override
    public int getItemCount() {
        return datas.size();
    }


    //一张小图
    public static class oneminViewHolder extends RecyclerView.ViewHolder {
        TextView tv_title, tv_content, tv_idName, tv_Thumb, tv_comments;
        ImageView iv_left, ivid;

        public oneminViewHolder(View itemView) {
            super(itemView);
            tv_title = (TextView) itemView.findViewById(R.id.tv_title);
            tv_content = (TextView) itemView.findViewById(R.id.tv_content);
            tv_idName = (TextView) itemView.findViewById(R.id.idName);
            tv_Thumb = (TextView) itemView.findViewById(R.id.comment);
            tv_comments = (TextView) itemView.findViewById(R.id.Good);

            iv_left = (ImageView) itemView.findViewById(R.id.contentImg);
            ivid = (ImageView) itemView.findViewById(R.id.idImg);

        }
    }

    //一张大图
    public static class onemaxViewHolder extends RecyclerView.ViewHolder {
        TextView tv_title, tv_content;
        ImageView contentimg;

        //                ImageView iv_left, iv_center, iv_right;
        public onemaxViewHolder(View itemView1) {
            super(itemView1);
            tv_title = (TextView) itemView1.findViewById(R.id.tv_content);
            tv_content = (TextView) itemView1.findViewById(R.id.tv_bottom);
            contentimg = (ImageView) itemView1.findViewById(R.id.title_img);

            //                        iv_left = (ImageView) itemView.findViewById(R.id.iv_left);
            //                        iv_center = (ImageView) itemView.findViewById(R.id.iv_content);
            //                        iv_right = (ImageView) itemView.findViewById(R.id.iv_right);
        }
    }

    //三张小图
    public static class threeViewHolder extends RecyclerView.ViewHolder {
        TextView tv_title, tv_content, tv_idName, tv_Thumb, tv_comments;
        ImageView iv_left, iv_center, iv_right, id_img;

        public threeViewHolder(View itemView) {
            super(itemView);
            tv_title = (TextView) itemView.findViewById(R.id.tv_title);
            tv_content = (TextView) itemView.findViewById(R.id.tv_content);
            tv_idName = (TextView) itemView.findViewById(R.id.tv_Name);
            tv_Thumb = (TextView) itemView.findViewById(R.id.Good);
            tv_comments = (TextView) itemView.findViewById(R.id.comment);

            iv_left = (ImageView) itemView.findViewById(R.id.iv_left);
            iv_center = (ImageView) itemView.findViewById(R.id.iv_content);
            iv_right = (ImageView) itemView.findViewById(R.id.iv_right);
            id_img = (ImageView) itemView.findViewById(R.id.idImg);
        }
    }

    //没有图
    public static class noimgViewHolder extends RecyclerView.ViewHolder {
        TextView tv_title, tv_content, tv_idName, tv_Thumb, tv_comments;
        ImageView iv;

        public noimgViewHolder(View itemView) {
            super(itemView);
            tv_title = (TextView) itemView.findViewById(R.id.tv_title);
            tv_content = (TextView) itemView.findViewById(R.id.tv_content);
            tv_idName = (TextView) itemView.findViewById(R.id.idName);
            tv_Thumb = (TextView) itemView.findViewById(R.id.Good);
            tv_comments = (TextView) itemView.findViewById(R.id.comment);
            iv = (ImageView) itemView.findViewById(R.id.idImg);

        }
    }
}
