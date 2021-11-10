package com.example.yangutil.mvp.presenter;

import com.example.yangutil.mvp.model.IModel;
import com.example.yangutil.mvp.view.IView;

/**
 * Date:2021/11/10
 * Time:16:06
 * author:yanghaoyang
 */
public class BasePresenter<M extends IModel, V extends IView> implements IPresenter {
    protected M mPresenter;
    protected V vPresenter;

    public BasePresenter(M mPresenter, V vPresenter) {
        this.mPresenter = mPresenter;
        this.vPresenter = vPresenter;
    }

    @Override
    public void destroy() {
        if (mPresenter != null) {
            mPresenter.destroy();
            mPresenter = null;
        }
        if (vPresenter != null) {
            vPresenter = null;
        }
    }
}
