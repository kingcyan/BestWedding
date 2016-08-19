package com.qf.flag.toolsfragment;

import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.qf.bestwedding.MyApplication;
import com.qf.bestwedding.R;
import com.qf.entity.ToolEntity;
import com.qf.utillibary.base.BaseFragment;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by King
 * 2016/8/19
 */
public class ToolsFragment extends BaseFragment {
    ImageView ToolHeadIMG;
    @Override
    protected int getContentView() {
        return R.layout.fragment_tools;
    }

    @Override
    protected void init(View view) {
        ToolHeadIMG = (ImageView) view.findViewById(R.id.tool_head_img);
        Call<ToolEntity> call = MyApplication.utils.getToolIMG();
        call.enqueue(new Callback<ToolEntity>() {
            @Override
            public void onResponse(Call<ToolEntity> call, Response<ToolEntity> response) {
//                Glide.with(getActivity())
//                        .load(response.body().getData()
//                                .getFloors().getTOOLS_BANNER().getHoles().get(0).
//                                        getPosters().getImage_path())
//                        .into(ToolHeadIMG);
                Log.e("TAG", response.body().getData()
                        .getFloors().getTOOLS_BANNER().getHoles().get(0).
                                getPosters().getImage_path() );
            }

            @Override
            public void onFailure(Call<ToolEntity> call, Throwable t) {

            }
        });
    }
}
