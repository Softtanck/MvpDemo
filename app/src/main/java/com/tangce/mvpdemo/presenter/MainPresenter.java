package com.tangce.mvpdemo.presenter;

import android.app.Activity;

import com.tangce.mvpdemo.BaseActivity;

/**
 * Created by Tanck on 11/2/2016.
 * <p/>
 * Describe:
 */
public class MainPresenter {

    private BaseActivity activity;

    public MainPresenter(BaseActivity activity) {
        this.activity = activity;
    }


    public void getData() {
        // TODO do something...
        activity.onDataSuccess("success");
    }


    public void getDataFail() {
        activity.onDataFailed("faild");
    }

}
