package com.qf.flag.homefragment;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bigkoo.convenientbanner.ConvenientBanner;
import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;
import com.bumptech.glide.Glide;
import com.nostra13.universalimageloader.cache.disc.naming.Md5FileNameGenerator;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;
import com.qf.bestwedding.MyApplication;
import com.qf.bestwedding.R;
import com.qf.entity.HomeHeadEntity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * 提取方法，设置首页顶部图片
 * Created by Administrator on 2016/8/20 0020. on 10:25
 * xiaohl_902
 */
public class HomeHeadSetImg {

    Context context;
    private final View view;

    public HomeHeadSetImg(final Context context, final View view) {
        this.context = context;
        this.view = view;
        setData();

    }

    private void setData() {

        Call<HomeHeadEntity> call = MyApplication.home_utils.getHomeHeadIMG();

        call.enqueue(new Callback<HomeHeadEntity>() {

            private List<HomeHeadEntity.DataBean.FloorsBean.MAINTOPBANNERBean.HolesBean> holes;
            private List<String> Lb_ing = new ArrayList<String>();
            @Override
            public void onResponse(Call<HomeHeadEntity> call, Response<HomeHeadEntity> response) {

                //得到图片轮播图片
                holes = response.body().getData().getFloors().getMAIN_TOP_BANNER().getHoles();
                for (HomeHeadEntity.DataBean.FloorsBean.MAINTOPBANNERBean.HolesBean a:holes) {
                    Lb_ing.add(a.getPosters().getImage_path());
                }

                new Carousel(context,Lb_ing).initView(view);
                //婚礼嘉年华
                Glide.with(context).load(response.body().getData().getFloors().getMAIN_ENTRY_BUTTON().getHoles().get(0).getPosters().getImage_path())
                        .into((ImageView) view.findViewById(R.id.hun));
                Glide.with(context).load(response.body().getData().getFloors().getMAIN_ENTRY_BUTTON().getHoles().get(1).getPosters().getImage_path())
                        .into((ImageView) view.findViewById(R.id.li));
                Glide.with(context).load(response.body().getData().getFloors().getMAIN_ENTRY_BUTTON().getHoles().get(2).getPosters().getImage_path())
                        .into((ImageView) view.findViewById(R.id.jia));
                Glide.with(context).load(response.body().getData().getFloors().getMAIN_ENTRY_BUTTON().getHoles().get(3).getPosters().getImage_path())
                        .into((ImageView) view.findViewById(R.id.nian));
                Glide.with(context).load(response.body().getData().getFloors().getMAIN_ENTRY_BUTTON().getHoles().get(4).getPosters().getImage_path())
                        .into((ImageView) view.findViewById(R.id.hua));
                ((TextView) view.findViewById(R.id.text_hun)).setText(response.body().getData().getFloors().getMAIN_ENTRY_BUTTON().getHoles().get(0).getPosters().getTitle());
                ((TextView) view.findViewById(R.id.text_li)).setText(response.body().getData().getFloors().getMAIN_ENTRY_BUTTON().getHoles().get(1).getPosters().getTitle());
                ((TextView) view.findViewById(R.id.text_jia)).setText(response.body().getData().getFloors().getMAIN_ENTRY_BUTTON().getHoles().get(2).getPosters().getTitle());
                ((TextView) view.findViewById(R.id.text_nian)).setText(response.body().getData().getFloors().getMAIN_ENTRY_BUTTON().getHoles().get(3).getPosters().getTitle());
                ((TextView) view.findViewById(R.id.text_hua)).setText(response.body().getData().getFloors().getMAIN_ENTRY_BUTTON().getHoles().get(4).getPosters().getTitle());


                //大图
                Glide.with(context).load(response.body().getData().getFloors().getSITE_DACU().getHoles().get(0).getPosters().getImage_path())
                        .into((ImageView) view.findViewById(R.id.head2_bigImg));


                //镶嵌图片
                Glide.with(context).load(response.body().getData().getFloors().getSITE_HOME_CHANNEL_NEW().getHoles().get(0).getPosters().getImage_path())
                        .into((ImageView) view.findViewById(R.id.head3_img1));
                Glide.with(context).load(response.body().getData().getFloors().getSITE_HOME_CHANNEL_NEW().getHoles().get(1).getPosters().getImage_path())
                        .into((ImageView) view.findViewById(R.id.head3_img2));
                Glide.with(context).load(response.body().getData().getFloors().getSITE_HOME_CHANNEL_NEW().getHoles().get(2).getPosters().getImage_path())
                        .into((ImageView) view.findViewById(R.id.head3_img3));
                Glide.with(context).load(response.body().getData().getFloors().getSITE_HOME_CHANNEL_NEW().getHoles().get(3).getPosters().getImage_path())
                        .into((ImageView) view.findViewById(R.id.head3_img4));
                Glide.with(context).load(response.body().getData().getFloors().getSITE_HOME_CHANNEL_NEW().getHoles().get(4).getPosters().getImage_path())
                        .into((ImageView) view.findViewById(R.id.head3_img5));



                //一行两张图片
                Glide.with(context).load(response.body().getData().getFloors().getSITE_FINANCIAL_HOTEL().getHoles().get(0).getPosters().getImage_path())
                        .into((ImageView) view.findViewById(R.id.head3_bigImg1));
                Glide.with(context).load(response.body().getData().getFloors().getSITE_FINANCIAL_HOTEL().getHoles().get(1).getPosters().getImage_path())
                        .into((ImageView) view.findViewById(R.id.head3_bigImg2));
            }

            @Override
            public void onFailure(Call<HomeHeadEntity> call, Throwable t) {

            }
        });
    }



}
