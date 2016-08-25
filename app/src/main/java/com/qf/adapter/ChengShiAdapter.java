package com.qf.adapter;

import android.content.Context;

import com.qf.bestwedding.R;
import com.qf.entity.CityEntity;
import com.qf.entity.CityEntity2;
import com.qf.utillibary.base.AbsMoreItemBaseAdapter;

/**
 * Created by Administrator on 2016/7/30 0030.
 */
//public class ChengShiAdapter extends AbsBaseAdapter <TityEntity>{
//
//    public ChengShiAdapter(Context context) {
//        super(context, R.layout.item_chengshi);
//    }
//
//    @Override
//    public void bindDatas(ViewHodler viewHodler, TityEntity data) {
//        viewHodler.setTextView(R.id.it_textView,data.getTityName());
//    }
//}


public class ChengShiAdapter extends AbsMoreItemBaseAdapter<CityEntity2> {

    public ChengShiAdapter(Context context) {
        super(context, R.layout.item_cszimu,R.layout.item_chengshi);
    }

    @Override
    public void bindDatas(ViewHodler viewHodler, CityEntity2 data, int position) {
        //分情况布局

        if(getItemViewType(position) == 1){
                viewHodler.setTextView(R.id.item_ch,data.getName());
        }else {
            viewHodler.setTextView(R.id.item_zm,data.getZm());
        }

    }

    /**
     * 判断Item是否可点击
     * @param position
     * @return
     */
    @Override
    public boolean isEnabled(int position) {
        return datas.get(position).getType()==1;
    }

    /**
     * 判断多布局有几个
     */
    @Override
    public int getItemViewType(int position) {
        return datas.get(position).getType();
    }

    /**
     * 查询标签在数据源中的位置
     */
//    public int queryLabelIndex(String str){
//
//        for(int x = 0;x<datas.size();x++){
//            if(datas.get(x).getTityName().equals(str)){
//                return x;
//            }
//        }
//        return -1;
//    }

}
