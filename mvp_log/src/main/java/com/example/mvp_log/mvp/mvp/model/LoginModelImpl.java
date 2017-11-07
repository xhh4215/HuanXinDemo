package com.example.mvp_log.mvp.mvp.model;

import com.example.mvp_log.mvp.mvp.bean.User;

/**
 * Created by Administrator on 2017/11/7.
 * 实现登陆的接口进行登陆的逻辑的具体的实现
 */

public class LoginModelImpl implements LoginModel
{
    /**
     *
     * @param username  用户名
     * @param password  用户户密码
     * @param onLoginListener  登陆的状态的回调
     */
    @Override
    public void login(final String username, final String password, final OnLoginListener onLoginListener) {
          new Thread(){
              @Override
              public void run() {
                  super.run();
                  try{
                      Thread.sleep(3000);
                      if(username.equals("xiaohei")&&password.equals("123456")){
                          onLoginListener.loginSuccess(new User(username,password));
                      }else
                          onLoginListener.loginFailed("sorry login failed");
                  }catch (Exception e){
                      e.printStackTrace();
                  }
              }
          }.start();
    }
}
