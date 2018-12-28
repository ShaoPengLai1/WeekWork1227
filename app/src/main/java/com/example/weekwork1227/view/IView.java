package com.example.weekwork1227.view;

public interface IView<T> {
    void getDataSuccess(T data);
    void getDataFail(String error);
}
