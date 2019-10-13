package com.jontromanob.app.mvvm_retrofit.login;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Toast;

import com.jontromanob.app.mvvm_retrofit.R;
import com.jontromanob.app.mvvm_retrofit.activity.HomeActivity;
import com.jontromanob.app.mvvm_retrofit.retrofit.login.model.LogInResponse;
import com.jontromanob.app.mvvm_retrofit.util.SaveUserInformationUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {


    @BindView(R.id.login_username)
    EditText login_username;
    @BindView(R.id.login_password)
    EditText login_password;

    LoginViewModel loginViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginViewModel = ViewModelProviders.of(this).get(LoginViewModel.class);
        observeLogin();
        observeError();
        ButterKnife.bind(this);
    }

    @OnClick(R.id.login_btn)
    public void onClickLogin(){
        postLogin(login_username.getText().toString(),login_password.getText().toString());
    }
    private void observeLogin() {

        loginViewModel.getLoginInfo().observe(this, new Observer<LogInResponse>() {
            @Override
            public void onChanged(@Nullable LogInResponse logInResponse) {
                if (logInResponse != null) {
                    SaveUserInformationUtil.saveUserInfo(LoginActivity.this, logInResponse);
                    startActivity(new Intent(LoginActivity.this, HomeActivity.class));
                    Toast.makeText(LoginActivity.this, "Success", Toast.LENGTH_SHORT).show();
                    finish();
                } else {
                    Toast.makeText(LoginActivity.this, "Failure", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private void observeError(){

        loginViewModel.getError().observe(this, new Observer<Boolean>() {
            @Override
            public void onChanged(@Nullable Boolean aBoolean) {
                if(aBoolean){
                    Toast.makeText(LoginActivity.this, "Failure", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void postLogin(String userName,String password){
        loginViewModel.postLogin(userName,password);
    }
}
