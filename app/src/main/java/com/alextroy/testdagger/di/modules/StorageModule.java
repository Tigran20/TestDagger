package com.alextroy.testdagger.di.modules;

import com.alextroy.testdagger.objects.DatabaseHelper;

import dagger.Module;
import dagger.Provides;

@Module
public class StorageModule {

    @Provides
    DatabaseHelper provideDatabaseHelper() {
        return new DatabaseHelper();
    }
}
