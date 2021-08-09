package com.databox.tablayoutstudy.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import butterknife.ButterKnife;

/**
 * Date：2021/8/9
 * Time：15:07
 * author:Stenven
 **/
public abstract class BaseFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(layoutId(),container,false);
        ButterKnife.bind(this,view);
        initData();
        initView(view);
        return view;

    }

    /**
     * 初始化布局
     * @return 布局id
     */
    protected abstract int layoutId();

    /**
     * 初始化控件
     * @param view 布局view
     */
    protected abstract void initView(View view);

    /**
     * 初始化，绑定数据
     */
    protected abstract void initData();

    /**
     * 不带参数的跳转
     *
     * @param clazz 跳转到的目标类
     */
    protected void readyGo(final Class<?> clazz) {
        Intent intent = new Intent(getActivity(), clazz);
        startActivity(intent);
    }

    /**
     * 带参数的跳转
     *
     * @param clazz  跳转到的目标类
     * @param bundle 参数
     */
    protected void readyGo(final Class<?> clazz, final Bundle bundle) {
        Intent intent = new Intent(getActivity(), clazz);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        startActivity(intent);
    }

    /**
     * 跳转且返回结果
     *
     * @param clazz       跳转到的目标类
     * @param requestCode 请求码
     */
    protected void readyGoForResult(final Class<?> clazz, final int requestCode) {
        Intent intent = new Intent(getActivity(), clazz);
        startActivityForResult(intent, requestCode);
    }

    /**
     * 带参数跳转且返回结果
     *
     * @param clazz       跳转到的目标类
     * @param requestCode 请求码
     * @param bundle      参数
     */
    protected void readyGoForResult(final Class<?> clazz, final int requestCode, final Bundle bundle) {
        Intent intent = new Intent(getActivity(), clazz);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        startActivityForResult(intent, requestCode);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
