package com.tangce.mvpdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tangce.mvpdemo.presenter.MainPresenter;
import com.tangce.mvpdemo.view.MainView;

public class MainActivity extends BaseActivity {
    private MainPresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        presenter = new MainPresenter(this);
        presenter.getData();
    }

    @Override
    public void onDataSuccess(String msg) {
        super.onDataSuccess(msg);
        // TODO update ui.
    }
}
