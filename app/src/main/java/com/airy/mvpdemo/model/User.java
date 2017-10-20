package com.airy.mvpdemo.model;

import com.airy.mvpdemo.model.imples.IUser;

/**
 * Created by Airy on 2017/10/19.
 */

public class User implements IUser {

    private UserBean bean;

    @Override
    public void SaveUserInfo(UserBean user) {
        this.bean = user;
    }

    @Override
    public UserBean LoadUserInfo() {
        if (bean != null){
            return bean;
        }
        return null;
    }
}
