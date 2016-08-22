package com.qf.util;

import com.qf.entity.BrideEntity;
import com.qf.entity.ToolEntity;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by King
 * 2016/8/19
 */
public interface JsonUtil {
    @GET(Contants.TOOL_HEAD_IMG)
    Call<ToolEntity> getToolIMG();



    @GET(Contants.BRIDE_URL)
    Call<BrideEntity> getBrideUrl();
}
