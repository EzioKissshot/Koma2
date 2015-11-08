package com.ezioshiki.koma2.domain.interactor;

/**
 * Created by EzioShiki on 15/11/8.
 */
public interface UserState {
    boolean isUserLogined();
    void setUserLoginState(boolean isLogin);
    String getUsername();
    void setUsername(String username);
    String getUserToken();
    void setUserToken(String token);
    String getUserDbTableName();
    String getUserId();
    void setUserId(String userId);
}
