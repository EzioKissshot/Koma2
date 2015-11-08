package com.ezioshiki.koma2.presentation.view.activity;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.ezioshiki.koma2.presentation.KomaApplication;
import com.ezioshiki.koma2.presentation.di.components.ApplicationComponent;
import com.ezioshiki.koma2.presentation.di.modules.ActivityModule;
import com.ezioshiki.koma2.presentation.navigation.Navigator;

import javax.inject.Inject;

/**
 * Created by EzioShiki on 15/11/8.
 */
public abstract class BaseActivity extends AppCompatActivity{

    @Inject
    Navigator navigator;

    /**
     * Adds a {@link Fragment} to this activity's layout.
     *
     * @param containerViewId The container view to where add the fragment.
     * @param fragment The fragment to be added.
     */
    protected void addFragment(int containerViewId, Fragment fragment) {
        FragmentTransaction fragmentTransaction = this.getFragmentManager().beginTransaction();
        fragmentTransaction.add(containerViewId, fragment);
        fragmentTransaction.commit();
    }

    /**
     * Get the Main Application component for dependency injection.
     *
     * @return {@link com.ezioshiki.koma2.presentation.di.components.ApplicationComponent}
     */
    protected ApplicationComponent getApplicationComponent() {
        return KomaApplication.getComponent(getApplicationContext());
    }

    /**
     * Get an Activity module for dependency injection.
     *
     * @return {@link com.ezioshiki.koma2.presentation.di.modules.ActivityModule}
     */
    protected ActivityModule getActivityModule() {
        return new ActivityModule(this);
    }
}
