package com.airy.mvpdemo.view;

import com.airy.mvpdemo.model.UserBean;

/**
 * Created by Airy on 2017/10/19.
 */

//
//Presenter与View交互是通过接口,定义一个IUserView

public interface IUserView {

    UserBean getUser();
    void setUser(UserBean bean);

}
