package com.ezioshiki.koma2.presentation.di.modules;

import android.content.Context;

import com.ezioshiki.koma2.presentation.KomaApplication;
import com.ezioshiki.koma2.presentation.navigation.Navigator;
import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by EzioShiki on 15/11/7.
 */

@Module
public class ApplicationModule {

    private final KomaApplication application;

    public ApplicationModule(KomaApplication application) {
        this.application = application;
    }

    @Provides
    Context provideApplicationContext(){
        return this.application;
    }

    @Provides
    @Singleton
    Navigator provideNavigator(){
        return new Navigator();
    }
    @Provides
    @Singleton
    Gson provideGson(){
        return new Gson();
    }



    //todo: add more Provider
}
