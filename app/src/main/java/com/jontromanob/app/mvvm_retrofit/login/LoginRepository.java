package com.jontromanob.app.mvvm_retrofit.login;

import com.jontromanob.app.mvvm_retrofit.retrofit.login.model.LogInResponse;

import io.reactivex.Single;

public class LoginRepository {


    private LoginServiceRepository loginServiceRepository;

    public LoginRepository(LoginServiceRepository loginServiceRepository) {
        this.loginServiceRepository = loginServiceRepository;
    }

    public Single<LogInResponse> getLoginInfo(String username, String password, String grant_type, Integer companyId) {

        return loginServiceRepository.postLoginInfo(username, password, "password", 2);
    }

}
