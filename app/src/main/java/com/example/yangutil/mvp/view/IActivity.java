package com.example.yangutil.mvp.view;

import androidx.annotation.LayoutRes;

/**
 * Date:2021/11/10
 * Time:16:07
 * author:yanghaoyang
 */
public interface IActivity extends IView  {
    @LayoutRes
    int bindLayout();
    void initData();
    void initView();
}
