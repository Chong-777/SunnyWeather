package com.example.sunnyweather;

import android.app.Application;
import android.content.Context;

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
    }
}
