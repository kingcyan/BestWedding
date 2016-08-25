package com.qf.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

import com.qf.flag.homefragment.HomeFragmentAll;

import java.util.List;

/**
 * Created by Administrator on 2016/8/20 0020. on 18:57
 * xiaohl_902
 */
public class HomeAllAdapter extends FragmentPagerAdapter{

    List<HomeFragmentAll> data;

    public HomeAllAdapter(FragmentManager fm, List<HomeFragmentAll> data) {
        super(fm);
        this.data = data;
    }

    @Override
    public Fragment getItem(int position) {
        return data.get(position);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
       // super.destroyItem(container, position, object);
    }
}
