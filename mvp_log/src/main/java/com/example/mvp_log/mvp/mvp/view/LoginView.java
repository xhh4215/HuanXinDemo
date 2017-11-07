package com.example.mvp_log.mvp.mvp.view;

/**
 * Created by Administrator on 2017/11/7.
 * view界面的数据的处理的逻辑
 */

public interface LoginView {
    //    获取用户添加的信息
    String getUsername();

    String getPassword();

    //    显示和隐藏进度条
    void showLoading();

    void hideloading();

    //    处理登陆成功和失败的数据
    void showSuccessMeg();

    void showFailedMsg();

    //  清除数据
    void clearEdit();

}
