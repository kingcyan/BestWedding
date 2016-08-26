package com.qf.bestwedding;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Luckey on 2016/8/14.
 */
public class GuideFragment extends Fragment{

    @Bind(R.id.ivbg_guidefrag)
    ImageView ivbgGuidefrag;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View viewf = inflater.inflate(R.layout.fragment_guide, container, false);
        ButterKnife.bind(this, viewf);

        int key = getArguments().getInt("luck");
        switch (key) {
            case 0:
                ivbgGuidefrag.setImageResource(R.drawable.img_login_item_img1);
                break;
            case 1:
                ivbgGuidefrag.setImageResource(R.drawable.img_login_item_img2);
                break;
            case 2:
                ivbgGuidefrag.setImageResource(R.drawable.img_login_item_img3);


                break;
        }
        return viewf;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }


}
