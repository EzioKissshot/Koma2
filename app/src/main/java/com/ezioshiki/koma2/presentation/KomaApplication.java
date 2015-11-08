package com.ezioshiki.koma2.presentation;

import android.app.Application;
import android.content.Context;

import com.ezioshiki.koma2.presentation.di.components.ApplicationComponent;
import com.ezioshiki.koma2.presentation.di.components.DaggerApplicationComponent;
import com.ezioshiki.koma2.presentation.di.modules.ApplicationModule;

import timber.log.Timber;

/**
 * Created by EzioShiki on 15/11/7.
 */
public class KomaApplication extends Application {
    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        buildComponent();

        Timber.plant(new Timber.DebugTree());
    }

    public static ApplicationComponent getComponent(Context context){
        return ((KomaApplication)context.getApplicationContext()).applicationComponent;
    }

    private void buildComponent() {
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }
}
