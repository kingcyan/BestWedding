package com.qf.util;

import com.qf.entity.HomeAllEntity;
import com.qf.entity.HomeHeadEntity;
import com.qf.entity.BrideEntity;
import com.qf.entity.ToolEntity;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by King
 * 2016/8/19
 */
public interface JsonUtil {

    //首页
    //首页头部图片
    @GET(Contants.HOME_HEAD_IMG)
    Call<HomeHeadEntity> getHomeHeadIMG();

    //首页Fragment全部
    @GET(Contants.HOME_ALL)
    Call<HomeAllEntity> getHomeAllData();        //首页Fragment全部

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
    @GET(Contants.TOOL_HEAD_IMG)
    Call<ToolEntity> getToolIMG();



    @GET(Contants.BRIDE_URL)
    Call<BrideEntity> getBrideUrl();
}
