package com.qf.flag.discoverfragment;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.qf.bestwedding.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Luckey on 2016/8/20.
 */
public class DiscoverTabView extends HorizontalScrollView{

        //滑动小光标
        private View view;
        private LinearLayout.LayoutParams layoutParams;

        //tab选项卡的线性布局
        private LinearLayout tabLinearLayout;

        private String[] tabs;//选项卡内容
        private List<Integer> lengthList;//长度的集合

        public DiscoverTabView(Context context) {
            this(context,null);
        }

        public DiscoverTabView(Context context, AttributeSet attrs) {
            this(context, attrs,0);
        }

        public DiscoverTabView(Context context, AttributeSet attrs, int defStyleAttr) {
            super(context, attrs, defStyleAttr);
            init();
        }

        //初始化方法
        private void init() {
            LayoutInflater.from(getContext()).inflate(R.layout.discover_head_view, this, true);
            view = findViewById(R.id.view);
            layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
            tabLinearLayout = (LinearLayout) findViewById(R.id.ll);
        }

        //设置Tab选项卡的内容 tabs
        public void setTabs(String[] tabs){
            this.tabs = tabs;
            lengthList = new ArrayList<>();
            for (String tab : tabs){
                TextView tv = new TextView(getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams
                        (ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
                tv.setText(tab);
                tv.setTextSize(14);
                tv.setGravity(Gravity.CENTER);
                tv.setPadding(40,10,20,10);
                tv.setTextColor(Color.parseColor("#000000"));
                tv.setLayoutParams(layoutParams);

                //测量控件
                tv.measure(0,0);
                lengthList.add(tv.getMeasuredWidth());
                tabLinearLayout.addView(tv);

            }

            //把小光标的宽度设置为第一个TextView的宽度
            view.getLayoutParams().width = lengthList.get(0);
        }

        public void setViewPager(ViewPager viewPager){
            viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                    //计算光标需要走的距离
                    int length = 0;
                    for (int i = 0;i < position;i++){
                        length += lengthList.get(i);
                    }
                    layoutParams.leftMargin = (int) (length + lengthList.get(position)*positionOffset);
                    //光标的宽度
                    if(position != lengthList.size() - 1) {
                        layoutParams.width = (int) (lengthList.get(position) + (lengthList.get(position + 1) - lengthList.get(position)) * positionOffset);
                    } else {
                        layoutParams.width = lengthList.get(position);
                    }

                    view.setLayoutParams(layoutParams);
                    //smoothScrollTo方法带动画,而ScrollTo无动画
                    DiscoverTabView.this.smoothScrollTo(layoutParams.leftMargin - 90,0);

                }

                @Override
                public void onPageSelected(int position) {

                }

                @Override
                public void onPageScrollStateChanged(int state) {

                }
            });

    }
}
