package com.ezioshiki.koma2.presentation.di.components;

import android.content.Context;

import com.ezioshiki.koma2.presentation.di.modules.ApplicationModule;
import com.ezioshiki.koma2.presentation.navigation.Navigator;
import com.ezioshiki.koma2.presentation.view.activity.ProjListActivity;
import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by EzioShiki on 15/11/7.
 */

@Component(modules = ApplicationModule.class)
@Singleton
public interface ApplicationComponent {

    void inject(ProjListActivity activity);

    Context context();
    Navigator navigator();
    Gson gson();


}
