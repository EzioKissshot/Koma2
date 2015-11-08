package com.ezioshiki.koma2.data.cache;

import com.ezioshiki.koma2.domain.interactor.UserState;

/**
 * Created by EzioShiki on 15/11/8.
 */
public class UserStateImpl implements UserState {



    @Override
    public boolean isUserLogined() {
        return false;
    }

    @Override
    public void setUserLoginState(boolean isLogin) {

    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public void setUsername(String username) {

    }

    @Override
    public String getUserToken() {
        return null;
    }

    @Override
    public void setUserToken(String token) {

    }

    @Override
    public String getUserDbTableName() {
        return null;
    }

    @Override
    public String getUserId() {
        return null;
    }

    @Override
    public void setUserId(String userId) {

    }
}
