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
public class DiscoverJumpAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int TYPE_HEADER = 0;  //说明是带有Header的
    public static final int TYPE_FOOTER = 1;  //说明是带有Footer的
    public static final int TYPE_NORMAL = 2;  //说明是不带有header和footer的

    //HeaderView, FooterView
    private View mHeaderView;
    private View mFooterView;


    private Context context;
    //获取从Activity中传递过来每个item的数据集合
    private List<DiscoverJumpRVEntity.DataBean.ListBean> data;

    public DiscoverJumpAdapter(Context context, List<DiscoverJumpRVEntity.DataBean.ListBean> data) {
        this.context = context;
        this.data = data;
    }

    //HeaderView和FooterView的get和set函数
    public View getHeaderView() {
        return mHeaderView;
    }
    public void setHeaderView(View headerView) {
        mHeaderView = headerView;
        notifyItemInserted(0);
    }
    public View getFooterView() {
        return mFooterView;
    }
    public void setFooterView(View footerView) {
        mFooterView = footerView;
        notifyItemInserted(getItemCount()-1);
    }

    /** 重写这个方法，很重要，是加入Header和Footer的关键，我们通过判断item的类型，从而绑定不同的view    * */
    @Override
    public int getItemViewType(int position) {
        if (mHeaderView == null && mFooterView == null){
            return TYPE_NORMAL;
        }
        if (position == 0){
            //第一个item应该加载Header
            return TYPE_HEADER;
        }
        if (position == getItemCount()-1){
            //最后一个,应该加载Footer
            return TYPE_FOOTER;
        }
        return TYPE_NORMAL;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(mHeaderView != null && viewType == TYPE_HEADER) {
            return new JumpHolder(mHeaderView);
        }
        if(mFooterView != null && viewType == TYPE_FOOTER){
            return new JumpHolder(mFooterView);
        }
        View view = LayoutInflater.from(context).inflate(R.layout.fragment_jump_recycleview,parent,false);

        return new JumpHolder(view);

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if(getItemViewType(position) == TYPE_NORMAL){
            if(holder instanceof JumpHolder) {
                //这里加载数据的时候要注意，是从position-1开始，因为position==0已经被header占用了
                ((JumpHolder)holder).title.setText(data.get(position-1).getTitle());
                ((JumpHolder)holder).summy.setText(data.get(position-1).getMerchant().getName());
                ((JumpHolder)holder).baoming.setText(data.get(position-1).getJoin_num()+"");
                ((JumpHolder)holder).focus.setText(data.get(position-1).getWatch_count()+"");
                Glide.with(context).load(data.get(position-1).getSurface_img()).into(((JumpHolder)holder).jumpimg);

                return;
            }
            return;
        }else if(getItemViewType(position) == TYPE_HEADER){
            return;
        }else{
            return;
        }


//        ((JumpHolder)holder).title.setText(data.get(position).getTitle());
//        ((JumpHolder)holder).summy.setText(data.get(position).getMerchant().getName());
//        ((JumpHolder)holder).baoming.setText(data.get(position).getJoin_num()+"");
//        ((JumpHolder)holder).focus.setText(data.get(position).getWatch_count()+"");
//        Glide.with(context).load(data.get(position).getSurface_img()).into(((JumpHolder)holder).jumpimg);

    }

    /**
     * 建造一个viewholder,加载RecyclerView中的每个item的布局
     */
    class JumpHolder extends RecyclerView.ViewHolder{
        TextView title,summy,baoming,focus;
        ImageView jumpimg;

        public JumpHolder(View itemView) {
            super(itemView);
            //如果是headerview或者是footerview,直接返回
            if (itemView == mHeaderView){
                return;
            }
            if (itemView == mFooterView){
                return;
            }
            jumpimg = (ImageView) itemView.findViewById(R.id.jump_img);
            title = (TextView) itemView.findViewById(R.id.jump_news_title);
            summy = (TextView) itemView.findViewById(R.id.jump_news_summy);
            baoming = (TextView) itemView.findViewById(R.id.jump_baoming_count);
            focus = (TextView) itemView.findViewById(R.id.jump_focus_count);
        }
    }

    @Override
    public int getItemCount() {
        if(mHeaderView == null && mFooterView == null){
            return data.size();
        }else if(mHeaderView == null && mFooterView != null){
            return data.size() + 1;
        }else if (mHeaderView != null && mFooterView == null){
            return data.size() + 1;
        }else {
            return data.size() + 2;
        }
    }

}
