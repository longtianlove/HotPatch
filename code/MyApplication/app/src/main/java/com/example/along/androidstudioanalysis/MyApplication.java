package com.example.along.androidstudioanalysis;

import android.app.Application;
import android.content.Context;
import android.util.Log;

/**
 * Created by long on 2016/7/4.
 */
public class MyApplication extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        Log.e("longtianlove","attachBaseContext");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("longtianlove","application---onCreate");
    }
}
