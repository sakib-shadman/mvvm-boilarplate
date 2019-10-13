package com.jontromanob.app.mvvm_retrofit.login;

import com.jontromanob.app.mvvm_retrofit.retrofit.login.model.LogInResponse;

import io.reactivex.Single;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface LoginServiceRepository {

    @FormUrlEncoded
    @POST("token")
    Single<LogInResponse> postLoginInfo(

            @Field("username") String username,
            @Field("password") String password,
            @Field("grant_type") String grant_type,
            @Field("companyId") Integer companyId

    );
}
