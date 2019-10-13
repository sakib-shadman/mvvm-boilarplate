package com.jontromanob.app.mvvm_retrofit.retrofit.login.model;

import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


/**
 * Created by Hi on 1/5/2018.
 */

public class UserCredentials {

    @SerializedName("UserName")
    private String userName;
    @SerializedName("Password")
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
