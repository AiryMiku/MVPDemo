package com.airy.mvpdemo.model.imples;

import com.airy.mvpdemo.model.UserBean;

/**
 * Created by Airy on 2017/10/19.
 */

//这里注意一下，IUser里面主要是接口，
// 首先，要想好在Presenter中要实现哪些逻辑，
// 要用到哪些方法，然后就在这里定义哪些方法。
// User主要是IUser的实现，返回一些数据，具体返回那些数据，就根据实际情况而定了。

public interface IUser {

    void SaveUserInfo(UserBean user);
    UserBean LoadUserInfo();

}
