package com.example.mvp_log.mvp.mvp.model;

import com.example.mvp_log.mvp.mvp.bean.User;

/**
 * Created by xh on 2017/11/7.
 * 真正处理信息的操作
 */

public interface LoginModel {
//    登陆的逻辑
    void login(String username,String password,OnLoginListener onLoginListener);
//   对登陆的状态的判断的回调
    interface OnLoginListener{
           void loginSuccess(User user);
           void  loginFailed(String s);
    }
}
