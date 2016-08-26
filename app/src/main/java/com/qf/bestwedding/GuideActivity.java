package com.qf.bestwedding;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Luckey on 2016/8/25.
 */
public class GuideActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.btn_login)
    Button btnLogin;
    @Bind(R.id.btn_regist)
    Button btnRegist;
    private ViewPager viewpager;
    private List<Fragment> list;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        ButterKnife.bind(this);
        init();
    }

    private void init() {
        viewpager = (ViewPager) findViewById(R.id.guide_vp);
        btnLogin.setOnClickListener(this);
        btnRegist.setOnClickListener(this);
        list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            getFragment(i);
        }

        GuideAdapter adapter = new GuideAdapter(getSupportFragmentManager(), list);
        viewpager.setAdapter(adapter);


    }

    private void getFragment(int i) {
        GuideFragment fragment = new GuideFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("luck", i);

        fragment.setArguments(bundle);
        list.add(fragment);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
