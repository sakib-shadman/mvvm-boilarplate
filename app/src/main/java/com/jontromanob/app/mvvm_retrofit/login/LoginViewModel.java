package com.jontromanob.app.mvvm_retrofit.login;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;


import com.jontromanob.app.mvvm_retrofit.retrofit.ApiClient;
import com.jontromanob.app.mvvm_retrofit.retrofit.login.model.LogInResponse;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

public class LoginViewModel extends ViewModel {


    private MutableLiveData<LogInResponse> mutableLiveData = new MutableLiveData<>();
    private MutableLiveData<Boolean> isError = new MutableLiveData<>();
    private LoginRepository loginRepository = new LoginRepository(ApiClient.getClient().create(LoginServiceRepository.class));
    private CompositeDisposable compositeDisposable = new CompositeDisposable();

    public LiveData<LogInResponse> getLoginInfo() {

        return mutableLiveData;
    }

    public LiveData<Boolean> getError(){

        return isError;
    }


    public void postLogin(String username, String password){

        compositeDisposable.add(loginRepository.getLoginInfo(username, password, "password", 2)
                .subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSingleObserver<LogInResponse>() {
                    @Override
                    public void onSuccess(LogInResponse logInResponse) {
                        mutableLiveData.setValue(logInResponse);
                    }

                    @Override
                    public void onError(Throwable e) {

                        isError.setValue(true);
                    }

                }));

    }

    @Override
    protected void onCleared() {
        super.onCleared();
        if (compositeDisposable != null) {
            compositeDisposable.clear();
            compositeDisposable = null;
        }
    }
}
