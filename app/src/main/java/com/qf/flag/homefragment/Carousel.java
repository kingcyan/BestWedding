package com.qf.flag.homefragment;

import android.content.Context;
import android.view.View;

import com.bigkoo.convenientbanner.ConvenientBanner;
import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;
import com.nostra13.universalimageloader.cache.disc.naming.Md5FileNameGenerator;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;
import com.qf.bestwedding.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2016/8/26 0026. on 21:04
 * xiaohl_902
 */
public class Carousel {

    //头部广告栏
    private ConvenientBanner convenientBanner;
    private ArrayList<Integer> localImages = new ArrayList<>();
    private List<String> networkImages;
    private List<String> Lb_ing;
    private Context context;

    public Carousel(Context context,List<String> Lb_ing) {
        this.context = context;
        this.Lb_ing = Lb_ing;
    }

    //    private String[] banPics = {"http://idoimg.3mt.com.cn/Article/upload/201109/110908172721220.jpg",
//            "http://i.zeze.com/attachment/forum/201508/17/060647osvswirx2wsv5hii.jpg",
//            "http://pics.sc.chinaz.com/files/pic/pic9/201509/apic14816.jpg",
//            "http://d36lyudx79hk0a.cloudfront.net/p0/mn/p4/98c54dc6aa267cae.jpg"
//    };


    //初始化网络图片缓存库(广告轮播)
    private void initImageLoader() {
        //网络图片例子,结合常用的图片缓存库UIL,你可以根据自己需求自己换其他网络图片库
        DisplayImageOptions defaultOptions = new DisplayImageOptions.Builder().
                showImageForEmptyUri(R.mipmap.ic_launcher)
                .cacheInMemory(true).cacheOnDisk(true).build();

        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(
                context).defaultDisplayImageOptions(defaultOptions)
                .threadPriority(Thread.NORM_PRIORITY - 2)
                .denyCacheImageMultipleSizesInMemory()
                .diskCacheFileNameGenerator(new Md5FileNameGenerator())
                .tasksProcessingOrder(QueueProcessingType.LIFO).build();
        ImageLoader.getInstance().init(config);
    }
    //图片轮播
    public void initView(View view) {

        initImageLoader();

        convenientBanner = (ConvenientBanner)
                view.findViewById(R.id.convenientBanner_showGoods);
        //本地图片例子
        convenientBanner.setPages(
                new CBViewHolderCreator<LocalImageHolderView>() {
                    @Override
                    public LocalImageHolderView createHolder() {
                        return new LocalImageHolderView();
                    }
                }, localImages)
                //设置两个点图片作为翻页指示器，不设置则没有指示器，可以根据自己需求
                // 自行配合自己的指示器,不需要圆点指示器可用不设
                .setPageIndicator(new int[]{R.drawable.abc_btn_radio_to_on_mtrl_000,
                        R.drawable.abc_btn_radio_to_on_mtrl_015});
        //设置翻页的效果，不需要翻页效果可用不设
        //     .setPageTransformer(Transformer.DefaultTransformer);
        //        convenientBanner.setManualPageable(false);设置不能手动影响
        //  网络加载例子
        //        for (int i = 0; i < banPics.length(); i++) {
        //            banPics[i] = basePicUrl + list_banners.get(i).getImg();
        //        }
        if(Lb_ing.size()!=0){
            String[] banPics = new String[Lb_ing.size()];
            for(int x = 0 ;x<Lb_ing.size();x++){
                banPics[x] = Lb_ing.get(x);
            }
            networkImages = Arrays.asList(banPics);
            convenientBanner.setPages(new CBViewHolderCreator<NetworkImageHolderView>() {
                @Override
                public NetworkImageHolderView createHolder() {
                    return new NetworkImageHolderView();
                }
            }, networkImages);
            convenientBanner.startTurning(2000);
        }

    }
}
