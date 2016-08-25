package com.qf.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
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
    List<DiscoverEntity.DataBean.ListBean> data;

    private LayoutInflater mLayoutInflater;
    //建立枚举 2个item 类型
    public enum ITEM_TYPE {
        ITEM1,
        ITEM2
    }

    public RecommendedAdapter(Context context, List<DiscoverEntity.DataBean.ListBean> data) {
        this.context = context;
        this.data = data;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        if (viewType == ITEM_TYPE.ITEM1.ordinal()) {
            return new Item1BigPicViewHolder(mLayoutInflater.inflate(R.layout.dis_item1, parent,false));
        }
        //        else(viewType == ITEM_TYPE.ITEM2.ordinal()){
        return new Item2SmallPicViewHolder(mLayoutInflater.inflate(R.layout.dis_item2, parent,false));
        //         }


    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof Item1BigPicViewHolder) {
            Glide.with(context).load(data.get(position).getList_img())
                    .centerCrop()
                    .into( ((Item1BigPicViewHolder) holder).recommendNewsBigpic);
            ((Item1BigPicViewHolder)holder).recommendNewsTitle.setText(data.get(position).getGood_title());
            ((Item1BigPicViewHolder)holder).recommendNewsSummy.setText(data.get(position).getSummary());
            ((Item1BigPicViewHolder)holder).recommendNewsCommentCount.setText(data.get(position).getWatch_count()+"");

        }else if(holder instanceof Item2SmallPicViewHolder){
            Glide.with(context).load(data.get(position).getList_img())
                    .centerCrop()
                    .into( ((Item2SmallPicViewHolder) holder).recommendNewsSmallpic);
            ((Item2SmallPicViewHolder)holder).recommendNewsTitle.setText(data.get(position).getGood_title());
            ((Item2SmallPicViewHolder)holder).recommendNewsCommentCount.setText(data.get(position).getWatch_count()+"");
        }
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    /**
     * @Override
    public int getItemViewType(int position) {
    if (datas.get(position).getEntity_type().equals("MerchantFeed")) {//三张图片
    return 1;
    } else if(datas.get(position).getEntity_type().equals("Package")){//全部
    return 0;
    }else if (datas.get(position).getEntity_type().equals("Example")){
    return 0;//没有价格
    }
    return 0;
    }
     * @param position
     * @return
     */
    @Override
    public int getItemViewType(int position) {

        Log.e("TAG", "getItemViewType: "+position );
        if (position % 5 == 0 ||position % 5 == 1){
            return ITEM_TYPE.ITEM1.ordinal();
        }
        return ITEM_TYPE.ITEM2.ordinal();

        //Enum类提供了一个ordinal()方法，返回枚举类型的序数，这里ITEM_TYPE.ITEM1.ordinal()代表0， ITEM_TYPE.ITEM2.ordinal()代表1
        //        return position % 2 == 0 ? ITEM_TYPE.ITEM1.ordinal() : ITEM_TYPE.ITEM2.ordinal();
    }

    //布局1 的ViewHolder
    static class Item1BigPicViewHolder extends RecyclerView.ViewHolder {
        ImageView recommendNewsBigpic;

        TextView recommendNewsTitle;

        TextView recommendNewsSummy;

        TextView recommendNewsCommentCount;


        public Item1BigPicViewHolder(View itemView) {
            super(itemView);
            //            mTextView = (TextView) itemView.findViewById(R.id.tv_name);
            recommendNewsBigpic = (ImageView) itemView.findViewById(R.id.dis_iv_title);
            recommendNewsTitle = (TextView) itemView.findViewById(R.id.dis_tv_title);
            recommendNewsSummy = (TextView) itemView.findViewById(R.id.dis_tv_content);
            recommendNewsCommentCount = (TextView) itemView.findViewById(R.id.ids_watch_count);

        }
    }

    //布局2 的ViewHolder
    static class Item2SmallPicViewHolder extends RecyclerView.ViewHolder {
        TextView recommendNewsTitle;

        TextView recommendNewsCommentCount;

        ImageView recommendNewsSmallpic;

        public Item2SmallPicViewHolder(View itemView) {
            super(itemView);
            recommendNewsSmallpic = (ImageView) itemView.findViewById(R.id.dis_iv_title2);
            recommendNewsTitle = (TextView) itemView.findViewById(R.id.dis_tv_title2);
            recommendNewsCommentCount = (TextView) itemView.findViewById(R.id.ids_watch_count2);
        }
    }
}
