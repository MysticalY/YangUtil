package com.example.yangutil.mvp.view;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.yangutil.mvp.presenter.IPresenter;

/**
 * Date:2021/11/10
 * Time:16:10
 * author:yanghaoyang
 */
public abstract class BaseActivity<P extends IPresenter> extends AppCompatActivity implements IActivity {
    protected  P pActivity;
    @Override
    protected void onCreate(@Nullable  Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(bindLayout());
        initView();
        initData();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (pActivity!=null){
            pActivity.destroy();
            pActivity = null;
        }
    }

    @Override
    public void showLogin() {

    }

    @Override
    public void hindLogin() {

    }

    @Override
    public void showToast(String msg) {

    }
}
