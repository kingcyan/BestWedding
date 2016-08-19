package com.qf.bestwedding;

import android.widget.RadioGroup;

import com.qf.flag.bridefragment.BrideFragment;
import com.qf.flag.discoverfragment.DiscoverFragment;
import com.qf.flag.homefragment.HomeFragment;
import com.qf.flag.minefragment.MineFragment;
import com.qf.flag.toolsfragment.ToolsFragment;
import com.qf.utillibary.base.BaseActivity;

public class MainActivity extends BaseActivity implements RadioGroup.OnCheckedChangeListener {


    RadioGroup rgTab;

    @Override
    public int getContentViewId() {
        return R.layout.activity_main;
    }

    /**
     * 初始化代码
     */
    @Override
    protected void init() {
        rgTab = findViewByIds(R.id.rg_tab);
        rgTab.setOnCheckedChangeListener(this);
        rgTab.getChildAt(0).performClick();//模拟点击方法
    }


    /**
     * RadioGroup监听回调方法
     *
     * @param group
     * @param checkedId
     */
    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.rb_home:
                //点击首页
                fragmentManager(R.id.fl_fragment, new HomeFragment(), "home");
                break;
            case R.id.rb_discover:
                //点击发现
                fragmentManager(R.id.fl_fragment, new DiscoverFragment(), "discover");
                break;
            case R.id.rb_bride:
                //点击新娘说
                fragmentManager(R.id.fl_fragment, new BrideFragment(), "bride");
                break;
            case R.id.rb_msg:
                //点击工具
                fragmentManager(R.id.fl_fragment, new ToolsFragment(), "tools");
                break;
            case R.id.rb_mime:
                //点击我的
                fragmentManager(R.id.fl_fragment, new MineFragment(), "mine");
                break;
        }
    }


}
