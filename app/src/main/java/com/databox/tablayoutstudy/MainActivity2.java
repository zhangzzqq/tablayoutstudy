package com.databox.tablayoutstudy;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.databox.tablayoutstudy.fragment.HomeFragment;
import com.databox.tablayoutstudy.fragment.MineFragment;
import com.databox.tablayoutstudy.fragment.NoticeFragment;
import com.databox.tablayoutstudy.fragment.OrderFragment;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Date：2021/8/9
 * Time：15:06
 * author:Stenven
 **/
public class MainActivity2 extends AppCompatActivity {

    @BindView(R.id.tab_layout)
    TabLayout mTabLayout;

    @BindView(R.id.viewPager)
    ViewPager mViewPager;

    private List<String> mTitles = new ArrayList<>();

    private List<Fragment> mFragments = new ArrayList<>();

    private HomeFragment mHomeFragment = HomeFragmentFactory.getInstance().getHomeFragment();
    private OrderFragment mOrderFragment = HomeFragmentFactory.getInstance().getOrderFragment();
    private NoticeFragment mNoticeFragment = HomeFragmentFactory.getInstance().getNoticeFragment();
    private MineFragment mMineFragment = HomeFragmentFactory.getInstance().getMineFragment();

    private HomeAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ButterKnife.bind(this);

        mTitles.add("首页");
        mTitles.add("工单");
        mTitles.add("通知");
        mTitles.add("我的");

        mFragments.add(mHomeFragment);
        mFragments.add(mOrderFragment);
        mFragments.add(mNoticeFragment);
        mFragments.add(mMineFragment);

        mAdapter = new HomeAdapter(getSupportFragmentManager(), mTitles, mFragments);

        mViewPager.setAdapter(mAdapter);

        mTabLayout.setupWithViewPager(mViewPager);
        mTabLayout.setTabsFromPagerAdapter(mAdapter);

    }


}
