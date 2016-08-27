package com.qf.flag.minefragment;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.qf.bestwedding.R;
import com.qf.utillibary.base.BaseActivity;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * Created by Luckey on 2016/8/26.
 */
public class SettingActivity extends BaseActivity {
    @Bind(R.id.setting_back)
    ImageView settingBack;
    @Bind(R.id.rl_account_safety)
    RelativeLayout rlAccountSafety;
    @Bind(R.id.rl_opinion_feedback)
    RelativeLayout rlOpinionFeedback;
    @Bind(R.id.rl_give_reputation)
    RelativeLayout rlGiveReputation;
    @Bind(R.id.rl_about_us)
    RelativeLayout rlAboutUs;
    @Bind(R.id.rl_clear_cache)
    RelativeLayout rlClearCache;
    @Bind(R.id.rl_exit)
    RelativeLayout rlExit;

    @Override
    public int getContentViewId() {
        return R.layout.activity_setting;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick({R.id.setting_back, R.id.rl_account_safety, R.id.rl_opinion_feedback, R.id.rl_give_reputation, R.id.rl_about_us, R.id.rl_clear_cache, R.id.rl_exit})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.setting_back:
                SettingActivity.this.finish();
                break;
            case R.id.rl_account_safety:

                break;
            case R.id.rl_opinion_feedback:
                break;
            case R.id.rl_give_reputation:
                break;
            case R.id.rl_about_us:
                break;
            case R.id.rl_clear_cache:
                break;
            case R.id.rl_exit:
                break;
        }
    }
}
