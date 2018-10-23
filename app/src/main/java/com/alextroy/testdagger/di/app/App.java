package com.alextroy.testdagger.di.app;

import android.app.Application;

import com.alextroy.testdagger.di.components.AppComponent;
import com.alextroy.testdagger.di.components.DaggerAppComponent;

public class App extends Application {

    private static AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.create();
    }

    public static AppComponent getComponent() {
        return component;
    }
}
