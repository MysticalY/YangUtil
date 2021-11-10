package com.example.yangutil.mvp.view;

import android.view.View;

import androidx.annotation.IdRes;

/**
 * Date:2021/11/10
 * Time:16:07
 * author:yanghaoyang
 */
public interface IFragment extends IActivity {
    <T extends View> T findViewById(@IdRes int id);
}
