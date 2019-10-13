package com.jontromanob.app.mvvm_retrofit.retrofit.login.call;

import com.facebook.stetho.server.http.HttpStatus;
import com.jontromanob.app.mvvm_retrofit.retrofit.ApiClient;
import com.jontromanob.app.mvvm_retrofit.retrofit.login.LoginApiInterface;
import com.jontromanob.app.mvvm_retrofit.retrofit.login.model.LogInResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Hi on 1/5/2018.
 */

public class CallLogIn {

    public static void call(String username, String password, String grant_type, Integer companyId, final CallLogIn.LogInCallBack callback) {
        LoginApiInterface apiInterface = ApiClient.getClient().create(LoginApiInterface.class);
        Call<LogInResponse> call = apiInterface.postLoginInfo(username, password, grant_type,companyId);
        call.enqueue(new Callback<LogInResponse>() {
            @Override
            public void onResponse(Call<LogInResponse> call, Response<LogInResponse> response) {
                if (response.code() == HttpStatus.HTTP_INTERNAL_SERVER_ERROR) {
                    callback.onServerFailure();
                } else if (response.body() != null) {
                    callback.onLogInSuccess(response.body());
                } else {
                    callback.onLogInFailure();
                }
            }

            @Override
            public void onFailure(Call<LogInResponse> call, Throwable t) {
                callback.onLogInFailure();
            }
        });
    }


    public interface LogInCallBack {
        void onLogInSuccess(LogInResponse logInResponse);

        void onLogInFailure();

        void onServerFailure();
    }
}
