package com.qf.util;

import com.qf.entity.CityEntity;
import com.qf.entity.DiscoverEntity;
import com.qf.entity.Discover_head_img;
import com.qf.entity.FinancialEntity1;
import com.qf.entity.FinancialEntity2;
import com.qf.entity.HomeAllEntity;
import com.qf.entity.HomeHeadEntity;
import com.qf.entity.BrideEntity;
import com.qf.entity.ToolEntity;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by King
 * 2016/8/19
 */
public interface JsonUtil {

    //首页
    //首页头部图片
    @GET(Contants.HOME_CITY_SELECT)
    Call<CityEntity> getCityEntity();

    //金融超市1
    @GET(Contants.FINANCIAL1)
    Call<FinancialEntity1> getFinancial1();

    //金融超市2
    @GET(Contants.FINANCIAL2)
    Call<FinancialEntity2> getFinancial2();

    //首页Fragment全部
    @GET(Contants.HOME_ALL)
    Call<HomeAllEntity> getHomeAllData();        //首页Fragment全部

    //金融超市2
    @GET(Contants.HOME_HEAD_IMG)
    Call<HomeHeadEntity> getHomeHeadIMG();

    //首页    婚礼策划
    @GET(Contants.HOME_WEDDING_PLANNER)
    Call<HomeAllEntity> getHomeWeddingPlannerData();        //婚礼策划

    //首页    婚纱摄影
    @GET(Contants.HOME_WEDDING_PHOTO)
    Call<HomeAllEntity> getHomeWeddingPhotoData();        //婚纱摄影

    //首页    婚纱礼服
    @GET(Contants.HOME_WEDDING_DRESSES)
    Call<HomeAllEntity> getHomeWeddingDressesData();        //婚纱礼服

    //首页    婚礼摄影
    @GET(Contants.HOME_WEDDING_PHOTOGRAPHY)
    Call<HomeAllEntity> getHomeWeddingPhotographyData();        //婚礼摄影

    //首页    婚礼摄像
    @GET(Contants.HOME_WEDDING_CAMERA)
    Call<HomeAllEntity> getHomeWeddingCameraData();        //婚礼摄像

    //首页    婚礼跟妆
    @GET(Contants.HOME_WEDDING_MAKEUP)
    Call<HomeAllEntity> getHomeWeddingMakeupData();        //婚礼跟妆

    //首页    婚礼司仪
    @GET(Contants.HOME_WEDDING_EMCEE)
    Call<HomeAllEntity> getHomeWeddingEmceeData();      //婚礼司仪

    //工具
    //工具页面头部图片
    @GET(Contants.TOOL_HEAD_IMG)
    Call<ToolEntity> getToolIMG();


    //新娘说页面数据
    @GET(Contants.BRIDE_URL)
    Call<BrideEntity> getBrideUrl(@Query("cate_id") int cate_id,@Query("page") int page1);

    //发现页面头部的图片
    @GET(Contants.DIS_HEADIMG)
    Call<Discover_head_img> getDisImg();

    //发现页面推荐数据
    @GET(Contants.DIS_LIST)
    Call<DiscoverEntity> getDisDatas();
}
