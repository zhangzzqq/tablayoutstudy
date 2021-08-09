package com.databox.tablayoutstudy.activity;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.databox.tablayoutstudy.R;
import com.databox.tablayoutstudy.fragment.HomeFragment;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Date：2021/8/9
 * Time：15:45
 * author:Stenven
 **/
public class MainActivity4 extends AppCompatActivity {

    static final int NUM_ITEMS = 4;
    private List<Fragment> fragmentList = new ArrayList<Fragment>();
    private String[] strings = new String[]{"A","B","C","D"};
    private MyAdapter fragmentAdater;
    private TabLayout tab_layout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        fragmentList.add(new HomeFragment());
        fragmentList.add(new HomeFragment());
        fragmentList.add(new HomeFragment());
        fragmentList.add(new HomeFragment());
        initView();
    }

    private void initView(){
        tab_layout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.viewPager);
        fragmentAdater = new  MyAdapter(getSupportFragmentManager());
        viewPager.setAdapter(fragmentAdater);
        tab_layout.setupWithViewPager(viewPager);

    /**
     * @Author steven
     * @Description
     *
     * app:tabIndicatorColor ：指示线的颜色
     *
     * app:tabIndicatorHeight ： 指示线的高度
     *
     * app:tabIndicatorFullWidth="false" 指示线是否铺满宽度
     *
     * app:tabSelectedTextColor ： tab选中时的字体颜色
     *
     * app:tabTextColor="@color/colorPrimary" ：未选中字体颜色
     *
     * app:tabBackground="color" ： 整个tablayout颜色
     *
     * app:tabMode="scrollable" ： 默认是fixed，固定的；scrollable：可滚动的
     *
     * @Date  2021/8/9 15:52
     * @Param []
     * @return void
     **/
        tab_layout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                //选中某个tab
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                //当tab从选择到未选择
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                //已经选中tab后的重复点击tab
            }
        });


    }

    public class MyAdapter extends FragmentPagerAdapter {
        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return NUM_ITEMS;
        }

        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return strings[position];
        }
    }



}
