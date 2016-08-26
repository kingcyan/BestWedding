package com.qf.bestwedding;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Luckey on 2016/8/25.
 */
public class GuideActivity extends AppCompatActivity {
    private ViewPager viewpager;
    private List<Fragment> list;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        init();
    }

    private void init() {
        viewpager = (ViewPager) findViewById(R.id.guide_vp);
        list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            getFragment(i);
        }

        GuideAdapter adapter = new GuideAdapter(getSupportFragmentManager(),list);
        viewpager.setAdapter(adapter);


    }

    private void getFragment(int i) {
        GuideFragment fragment = new GuideFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("luck",i);

        fragment.setArguments(bundle);
        list.add(fragment);
    }
}
