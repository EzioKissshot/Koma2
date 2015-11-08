package com.ezioshiki.koma2.presentation.presenter;

import com.ezioshiki.koma2.domain.interactor.UserState;
import com.ezioshiki.koma2.presentation.navigation.Navigator;
import com.ezioshiki.koma2.presentation.view.activity.ProjListActivity;

import javax.inject.Inject;

/**
 * Created by EzioShiki on 15/11/8.
 */
public class ProjListPresenter {

    private UserState mUserState;
    private Navigator mNavigator;

    @Inject
    public ProjListPresenter(UserState userState,Navigator navigator) {
        mUserState = userState;
        mNavigator = navigator;

    }

    public void checkNavigation(ProjListActivity activity) {
        if (!mUserState.isUserLogined()){
            mNavigator.navigateToLogin(activity);
            activity.finish();
        }
    }
}
