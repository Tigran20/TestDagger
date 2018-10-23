package com.alextroy.testdagger.di.modules;

import com.alextroy.testdagger.objects.NetworkUtils;

import dagger.Module;
import dagger.Provides;

@Module
public class NetworkModule {

    @Provides
    NetworkUtils provideNetworkutils() {
        return new NetworkUtils();
    }
}
