package com.example.weekwork1227.presenter;

import com.example.weekwork1227.callback.MyCallBack;
import com.example.weekwork1227.model.IModelImpl;
import com.example.weekwork1227.network.RetrofitManager;
import com.example.weekwork1227.view.IView;
import com.google.gson.Gson;

import java.util.Map;

import okhttp3.RequestBody;

public class IPresenterImpl implements IPresenter {

    private IModelImpl model;
    private IView iView;
    public IPresenterImpl(IView iView) {
        this.iView = iView;
        model = new IModelImpl();
    }
    @Override
    public void startRequestGet(String url, String params, Class clazz) {
        model.requestDataGet(url, params, clazz, new MyCallBack() {
            @Override
            public void onSuccess(Object data) {
                iView.getDataSuccess(data);
            }

            @Override
            public void onFail(String error) {
                iView.getDataFail(error);
            }
        });
    }

    @Override
    public void startRequestPost(String url, Map<String, String> params, Class clazz) {
        model.requestDataPost(url, params, clazz, new MyCallBack() {
            @Override
            public void onSuccess(Object data) {
                iView.getDataSuccess(data);
            }

            @Override
            public void onFail(String error) {
                iView.getDataFail(error);
            }
        });
    }
    public void onDetach() {
        if (model != null) {
            model = null;
        }
        if (iView != null) {
            iView = null;
        }
    }
}
