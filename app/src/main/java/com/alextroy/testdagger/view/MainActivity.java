package com.alextroy.testdagger.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.alextroy.testdagger.R;
import com.alextroy.testdagger.di.app.App;
import com.alextroy.testdagger.objects.DatabaseHelper;
import com.alextroy.testdagger.objects.NetworkUtils;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    DatabaseHelper databaseHelper;

    @Inject
    NetworkUtils networkUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        App.getComponent().inject(this);
    }
}
