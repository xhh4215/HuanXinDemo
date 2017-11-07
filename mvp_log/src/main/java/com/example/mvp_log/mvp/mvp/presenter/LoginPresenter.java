package com.example.mvp_log.mvp.mvp.presenter;

import android.os.Handler;

import com.example.mvp_log.mvp.mvp.bean.User;
import com.example.mvp_log.mvp.mvp.model.LoginModel;
import com.example.mvp_log.mvp.mvp.model.LoginModelImpl;
import com.example.mvp_log.mvp.mvp.view.LoginView;

/**
 * Created by Administrator on 2017/11/7.
 */

public class LoginPresenter {
    private LoginView loginView;
    private LoginModel loginModel;
    private Handler handler;
     public LoginPresenter(LoginView loginView){
       this.loginView = loginView;
         loginModel = new LoginModelImpl();
         handler = new Handler();
     }
     public void login(){
         loginView.showLoading();
         loginModel.login(loginView.getUsername(), loginView.getPassword(), new LoginModel.OnLoginListener() {
             @Override
             public void loginSuccess(User user) {
                     handler.post(new Runnable() {
                         @Override
                         public void run() {
                             loginView.showSuccessMeg();
                         }
                     });
             }

             @Override
             public void loginFailed(String s) {
                       handler.post(new Runnable() {
                           @Override
                           public void run() {
                               loginView.showFailedMsg();
                           }
                       });
             }
         });
     }
     public void clear(){
         loginView.clearEdit();
     }
}
