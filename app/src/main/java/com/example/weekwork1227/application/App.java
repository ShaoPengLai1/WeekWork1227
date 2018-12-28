package com.example.weekwork1227.application;

import android.app.Application;
import android.graphics.Bitmap;

import com.example.weekwork1227.R;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ImageLoader.getInstance().init(new ImageLoaderConfiguration.Builder(this)
                //配置缓存内存
                .memoryCacheSizePercentage(10)
                //配置缓存数量
                .diskCacheFileCount(10)
                .diskCacheSize(50*1024*1024)
                .defaultDisplayImageOptions(new DisplayImageOptions.Builder()
                        .bitmapConfig(Bitmap.Config.RGB_565)
                        .cacheOnDisk(true)
                        .cacheInMemory(true)
                        .showImageOnLoading(R.mipmap.ic_launcher)
                        .showImageOnFail(R.mipmap.ic_launcher)
                        .showImageForEmptyUri(R.mipmap.ic_launcher)
                        .build())
                .build());
    }
}
