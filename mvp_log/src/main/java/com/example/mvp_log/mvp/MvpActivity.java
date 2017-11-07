package com.example.mvp_log.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.mvp_log.R;
import com.example.mvp_log.mvp.mvp.presenter.LoginPresenter;
import com.example.mvp_log.mvp.mvp.view.LoginView;

public class MvpActivity extends AppCompatActivity implements LoginView {
    private EditText et_username;
    private EditText et_password;
    private ProgressBar progressbar;
    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvp);
        initView();
        loginPresenter = new LoginPresenter(this);
    }

    private void initView() {
        et_password = (EditText) findViewById(R.id.main_et_password);
        et_username = (EditText) findViewById(R.id.main_et_username);
        progressbar = (ProgressBar) findViewById(R.id.main_progressBar);
    }

    public void LoginClick(View view) {
        loginPresenter.login();
    }

    public void ClearClick(View view) {
        loginPresenter.clear();
    }

    @Override
    public String getUsername() {
        return et_username.getText().toString();
    }

    @Override
    public String getPassword() {
        return et_password.getText().toString();
    }

    @Override
    public void showLoading() {
        progressbar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideloading() {
        progressbar.setVisibility(View.GONE);
    }

    @Override
    public void showSuccessMeg() {
        Toast.makeText(this, "success", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showFailedMsg() {
        Toast.makeText(this, "failed", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void clearEdit() {
        et_username.setText("");
        et_password.setText("");
    }
}
