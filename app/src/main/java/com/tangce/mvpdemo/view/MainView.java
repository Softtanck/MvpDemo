package com.tangce.mvpdemo.view;

/**
 * Created by Tanck on 11/2/2016.
 * <p/>
 * Describe:
 */
public interface MainView {
    void onDataSuccess(String msg);

    void showDialog();

    void dismissDialog();

    void onDataFailed(String msg);
}
