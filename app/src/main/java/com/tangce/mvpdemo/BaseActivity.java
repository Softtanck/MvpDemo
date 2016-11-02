package com.tangce.mvpdemo;

import android.support.v7.app.AppCompatActivity;

import com.tangce.mvpdemo.view.MainView;

/**
 * Created by Tanck on 11/2/2016.
 * <p/>
 * Describe:
 */
public class BaseActivity extends AppCompatActivity implements MainView {
    @Override
    public void onDataSuccess(String msg) {

    }

    @Override
    public void showDialog() {

    }

    @Override
    public void dismissDialog() {

    }

    @Override
    public void onDataFailed(String msg) {

    }
}
