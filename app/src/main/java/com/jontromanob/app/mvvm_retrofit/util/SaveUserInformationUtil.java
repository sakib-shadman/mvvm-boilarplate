package com.jontromanob.app.mvvm_retrofit.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.Gson;
import com.jontromanob.app.mvvm_retrofit.retrofit.login.model.LogInResponse;


/**
 * Created by Hi on 1/5/2018.
 */

public class SaveUserInformationUtil {

    public static final String USER_INFORMATION_CONSTANT = "userinformation";

    public static void saveUserInfo(Context context, LogInResponse logInResponse){

        try {

            SharedPreferences mPrefs = PreferenceManager.getDefaultSharedPreferences (context);
            SharedPreferences.Editor prefsEditor = mPrefs.edit ();
            Gson gson = new Gson ();
            String json = gson.toJson (logInResponse);
            prefsEditor.putString (USER_INFORMATION_CONSTANT, json);
            prefsEditor.commit ();
        } catch (Exception ex){

        }
    }

    public static LogInResponse getUserInfo(Context context){

        try {
            SharedPreferences mPrefs = PreferenceManager.getDefaultSharedPreferences( context);
            Gson gson = new Gson();
            String json = mPrefs.getString(USER_INFORMATION_CONSTANT, "");
            if (json != null && json.length() > 1  ){
                return  gson.fromJson(json, LogInResponse.class);
            }
            return null ;
        } catch (Exception ex){
            return null;
        }

    }

    public static void clearUserInfo(Context context){

        try{
            SharedPreferences mPrefs = PreferenceManager.getDefaultSharedPreferences( context);
            SharedPreferences.Editor prefsEditor = mPrefs.edit();
            prefsEditor.remove(USER_INFORMATION_CONSTANT);
            prefsEditor.commit();
        } catch (Exception ex){

        }

    }
}
