package com.databox.tablayoutstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {


    TabLayout mTabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTabLayout =  findViewById(R.id.tab_layout);


        mTabLayout.addTab(mTabLayout.newTab().setText("全部"));
        mTabLayout.addTab(mTabLayout.newTab().setText("完赛"));
        mTabLayout.addTab(mTabLayout.newTab().setText("专家"));
        mTabLayout.addTab(mTabLayout.newTab().setText("装备"));
        mTabLayout.addTab(mTabLayout.newTab().setText("NBA"));

//        mTabLayout.addTab(mTabLayout.newTab().setText("完赛").setIcon(R.mipmap.ic_favorite_end));


        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }
}