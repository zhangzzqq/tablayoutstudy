package com.databox.tablayoutstudy;

import com.databox.tablayoutstudy.fragment.HomeFragment;
import com.databox.tablayoutstudy.fragment.MineFragment;
import com.databox.tablayoutstudy.fragment.NoticeFragment;
import com.databox.tablayoutstudy.fragment.OrderFragment;

/**
 * Date：2021/8/9
 * Time：15:07
 * author:Stenven
 **/
public class HomeFragmentFactory {
    static HomeFragmentFactory mInstance;
    private HomeFragment mHomeFragment;
    private OrderFragment mOrderFragment;
    private NoticeFragment mNoticeFragment;
    private MineFragment mMineFragment;


    public HomeFragmentFactory() {
    }

    public static HomeFragmentFactory getInstance() {
        if (mInstance == null) {
            synchronized (HomeFragmentFactory.class) {
                if (mInstance == null) {
                    mInstance = new HomeFragmentFactory();
                }
            }
        }
        return mInstance;
    }

    /**
     * 首页
     *
     * @return
     */
    public HomeFragment getHomeFragment() {
        if (mHomeFragment == null) {
            synchronized (HomeFragment.class) {
                if (mHomeFragment == null) {
                    mHomeFragment = new HomeFragment();
                }
            }
        }
        return mHomeFragment;
    }

    /**
     * 工单
     *
     * @return
     */
    public OrderFragment getOrderFragment() {
        if (mOrderFragment == null) {
            synchronized (OrderFragment.class) {
                if (mOrderFragment == null) {
                    mOrderFragment = new OrderFragment();
                }
            }
        }
        return mOrderFragment;
    }

    /**
     * 通知
     *
     * @return
     */
    public NoticeFragment getNoticeFragment() {
        if (mNoticeFragment == null) {
            synchronized (NoticeFragment.class) {
                if (mNoticeFragment == null) {
                    mNoticeFragment = new NoticeFragment();
                }
            }
        }
        return mNoticeFragment;
    }

    /**
     * 我的
     *
     * @return
     */
    public MineFragment getMineFragment() {
        if (mMineFragment == null) {
            synchronized (MineFragment.class) {
                if (mMineFragment == null) {
                    mMineFragment = new MineFragment();
                }
            }
        }
        return mMineFragment;
    }

}
