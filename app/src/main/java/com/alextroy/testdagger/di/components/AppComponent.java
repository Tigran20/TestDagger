package com.alextroy.testdagger.di.components;

import com.alextroy.testdagger.di.modules.AppModule;
import com.alextroy.testdagger.view.MainActivity;
import com.alextroy.testdagger.di.modules.NetworkModule;
import com.alextroy.testdagger.di.modules.StorageModule;

import dagger.Component;

@Component(modules = {AppModule.class, StorageModule.class, NetworkModule.class})
public interface AppComponent {
    void inject(MainActivity mainActivity);
}
