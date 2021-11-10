package com.example.yangutil.mvp.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.yangutil.mvp.presenter.IPresenter;

/**
 * Date:2021/11/10
 * Time:16:09
 * author:yanghaoyang
 */
public abstract class BaseFragment<P extends IPresenter> extends Fragment implements IFragment {
    protected P pFragment;
    protected View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull  LayoutInflater inflater, @Nullable  ViewGroup container, @Nullable  Bundle savedInstanceState) {
        return view =  inflater.inflate(bindLayout(),container,false);
    }

    @Override
    public void onViewCreated(@NonNull  View view, @Nullable  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        initData();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (pFragment!=null){
            pFragment.destroy();
        }
    }

    @Override
    public <T extends View> T findViewById(int id) {
        return view.findViewById(id);
    }

    @Override
    public int bindLayout() {
        return 0;
    }

    @Override
    public void initData() {

    }

    @Override
    public void initView() {

    }
}
