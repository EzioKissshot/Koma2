package com.ezioshiki.koma2.presentation.di.modules;

import android.app.Activity;

import com.ezioshiki.koma2.presentation.di.PerActivity;

import dagger.Provides;

/**
 * Created by EzioShiki on 15/11/8.
 */
public class ActivityModule {

    private final Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }


    @Provides
    @PerActivity
    public Activity activity(){
        return activity;
    }
}
