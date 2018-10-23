package com.alextroy.testdagger.di.modules;

import com.alextroy.testdagger.objects.NetworkUtils;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class NetworkModule {

    @Singleton
    @Provides
    NetworkUtils provideNetworkutils() {
        return new NetworkUtils();
    }
}
