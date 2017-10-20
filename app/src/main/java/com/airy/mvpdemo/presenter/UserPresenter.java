package com.airy.mvpdemo.presenter;

import com.airy.mvpdemo.model.User;
import com.airy.mvpdemo.model.imples.IUser;
import com.airy.mvpdemo.view.IUserView;

/**
 * Created by Airy on 2017/10/19.
 */

public class UserPresenter {

    private IUserView userView;
    private IUser user;

    public UserPresenter(IUserView view){
        this.userView = view;
        user = new User();
    }

    public void saveUser(){
        user.SaveUserInfo(userView.getUser());
    }

    public void loadUser(){
        userView.setUser(user.LoadUserInfo());
    }

}
