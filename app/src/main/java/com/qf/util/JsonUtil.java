package com.qf.util;

import com.qf.entity.BrideEntity;
import com.qf.entity.DiscoverEntity;
import com.qf.entity.Discover_head_img;
import com.qf.entity.ToolEntity;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by King
 * 2016/8/19
 */
public interface JsonUtil {
    //工具页面头部图片
    @GET(Contants.TOOL_HEAD_IMG)
    Call<ToolEntity> getToolIMG();


    //新娘说页面数据
    @GET(Contants.BRIDE_URL)
    Call<BrideEntity> getBrideUrl();

    //发现页面头部的图片
    @GET(Contants.DIS_HEADIMG)
    Call<Discover_head_img> getDisImg();

    //发现页面推荐数据
    @GET(Contants.DIS_LIST)
    Call<DiscoverEntity> getDisDatas();
}
