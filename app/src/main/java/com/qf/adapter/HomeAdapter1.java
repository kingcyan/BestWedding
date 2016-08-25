package com.qf.adapter;

import android.content.Context;
import android.util.Log;

import com.qf.bestwedding.R;
import com.qf.entity.HomeAllEntity;
import com.qf.utillibary.base.AbsBaseAdapter;
import com.qf.utillibary.base.AbsMoreItemBaseAdapter;

/**
 * Created by Administrator on 2016/8/20 0020. on 16:55
 * xiaohl_902
 */
public class HomeAdapter1 extends AbsMoreItemBaseAdapter<HomeAllEntity.DataBean.ListBean> {

    public HomeAdapter1(Context context) {
        super(context, R.layout.item_home_bottom,R.layout.item2_home_bottom2);
    }

    @Override
    public void bindDatas(ViewHodler viewHodler, HomeAllEntity.DataBean.ListBean data, int position) {
        if(getItemViewType(position)==0) {
            viewHodler.setImageView(R.id.it1_home_img2, data.getEntity().getCover_path())
                    .setImageView(R.id.it1_home_img1, data.getEntity().getMerchant().getLogo_path())
                    .setTextView(R.id.it1_home_text1, data.getEntity().getMerchant().getName()+"")
                    .setTextView(R.id.it1_home_text2, data.getEntity().getMerchant().getProperty().getName()+"")
                    .setTextView(R.id.it1_home_text3, data.getEntity().getTitle()+"")
                    .setTextView(R.id.it1_home_text9, data.getEntity().getCollectors_count()+"");

            //标签
            if(data.getEntity().getMarks()!=null){
                viewHodler.setTextView(R.id.it1_home_text6, data.getEntity().getMarks().get(0).getName()+"");
            }
            if (data.getEntity().getMarks()!=null&&data.getEntity().getMarks().size()==2){
                viewHodler.setTextView(R.id.it1_home_text7, data.getEntity().getMarks().get(1).getName() + "");
            }
            if (data.getEntity().getMarks()!=null&&data.getEntity().getMarks().size()==3){
                viewHodler.setTextView(R.id.it1_home_text8, data.getEntity().getMarks().get(2).getName() + "");
            }

            //价格
            if (data.getEntity().getMarket_price()!=0){
                Log.d("prints", "bindDatas() ----->: " +data.getEntity().getMarket_price());
                viewHodler.setTextView(R.id.it1_home_text5,data.getEntity().getMarket_price()+"");
            }
            if(data.getEntity().getShow_price()!=0){
                viewHodler.setTextView(R.id.it1_home_text4,data.getEntity().getShow_price()+"");
            }

        }else if(getItemViewType(position)==1){//有三张图片的item
            viewHodler
                    //设置三张大图
                    .setImageView(R.id.it2_home_img2,data.getEntity().getContent().get(0).getImage_path())
                    .setImageView(R.id.it2_home_img3,data.getEntity().getContent().get(1).getImage_path())
                    .setImageView(R.id.it2_home_img4,data.getEntity().getContent().get(2).getImage_path())
                    //设置log
                    .setImageView(R.id.it2_home_img1,data.getEntity().getMerchant().getLogo_path())
                    //
                    .setTextView(R.id.it2_home_text1,data.getEntity().getMerchant().getName())
                    .setTextView(R.id.it2_home_text2,data.getEntity().getMerchant().getProperty().getName())
                    .setTextView(R.id.it2_home_text4,data.getEntity().getLikes_count());

        }
    }

    @Override
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
}
