package com.example.weekwork1227.callback;

public interface MyCallBack<T> {
    void onSuccess(T data);
    void onFail(String error);
}
