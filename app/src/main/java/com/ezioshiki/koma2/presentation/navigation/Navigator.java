package com.ezioshiki.koma2.presentation.navigation;

import android.content.Context;
import android.content.Intent;

import com.ezioshiki.koma2.presentation.view.activity.LoginActivity;
import com.ezioshiki.koma2.presentation.view.activity.ProjDetailActivity;
import com.ezioshiki.koma2.presentation.view.activity.ProjListActivity;

import javax.inject.Singleton;

/**
 * Created by EzioShiki on 15/11/7.
 */
@Singleton
public class Navigator {

    /**
     * Goes to the user list screen.
     *
     * @param context A Context needed to open the destiny activity.
     */
    public void navigateToProjList(Context context) {
        if (context != null) {
            Intent intentToLaunch = ProjListActivity.getCallingIntent(context);
            context.startActivity(intentToLaunch);
        }
    }

    /**
     * Goes to the user details screen.
     *
     * @param context A Context needed to open the destiny activity.
     */
    public void navigateToProjDetails(Context context, int projId) {
        if (context != null) {
            Intent intentToLaunch = ProjDetailActivity.getCallingIntent(context, projId);
            context.startActivity(intentToLaunch);
        }
    }

    /**
     * Goes to the user login screen
     *
     * @param context A context needed to open the destiny activity
     * */
    public void navigateToLogin(Context context){
        if (context!=null){
            Intent intentToLaunch = LoginActivity.getCallingIntent(context);
            context.startActivity(intentToLaunch);
        }
    }


}
