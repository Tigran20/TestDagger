package com.alextroy.testdagger.di.modules;

import com.alextroy.testdagger.objects.DatabaseHelper;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class StorageModule {

    @Singleton
    @Provides
    DatabaseHelper provideDatabaseHelper() {
        return new DatabaseHelper();
    }
}
