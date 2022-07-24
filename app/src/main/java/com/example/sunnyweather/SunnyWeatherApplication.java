package com.example.sunnyweather;

import android.app.Application;
import android.content.Context;
import android.util.Log;

public class SunnyWeatherApplication extends Application {

    private static Context context;

    private static final String TOKEN = "opCAlyTFY0IgoG9G";

    public static Context getContext() {
        return context;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        Log.d("TAG", "onCreate: this is merge.");
    }
}
