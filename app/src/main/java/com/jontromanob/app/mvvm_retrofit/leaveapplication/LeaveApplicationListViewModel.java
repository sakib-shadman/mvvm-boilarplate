package com.jontromanob.app.mvvm_retrofit.leaveapplication;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.jontromanob.app.mvvm_retrofit.retrofit.ApiClient;
import com.jontromanob.app.mvvm_retrofit.retrofit.leaveapplication.model.LeaveApplicationDetails;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

public class LeaveApplicationListViewModel extends ViewModel {

    private LeaveApplicationRepository leaveApplicationRepository = new LeaveApplicationRepository(ApiClient.getClient()
    .create(LeaveApplicationServiceRepository.class));

    private MutableLiveData<List<LeaveApplicationDetails>> leaveAppList = new MutableLiveData<>();
    private CompositeDisposable compositeDisposable = new CompositeDisposable();

    public LiveData<List<LeaveApplicationDetails>> getAllLeaveApp(){

        return leaveAppList;
    }

    public void fetchAllLeaveApp(String auth){

        compositeDisposable.add(leaveApplicationRepository.getAllLeaveApplications(auth)
                .subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSingleObserver<List<LeaveApplicationDetails>>() {
                    @Override
                    public void onSuccess(List<LeaveApplicationDetails> leaveApplicationDetails) {

                        leaveAppList.setValue(leaveApplicationDetails);
                    }

                    @Override
                    public void onError(Throwable e) {


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
