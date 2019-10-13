package com.jontromanob.app.mvvm_retrofit.leaveapplication;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.jontromanob.app.mvvm_retrofit.retrofit.ApiClient;
import com.jontromanob.app.mvvm_retrofit.retrofit.leaveapplication.model.LeaveApplicationPolicy;
import com.jontromanob.app.mvvm_retrofit.retrofit.leaveapplication.model.LeaveType;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

public class LeaveApplicationViewModel extends ViewModel {

    private MutableLiveData<List<LeaveType>> leaveTypes = new MutableLiveData<>();
    private MutableLiveData<LeaveApplicationPolicy> leaveApplicationPolicy = new MutableLiveData<>();
    private LeaveApplicationRepository leaveApplicationRepository = new LeaveApplicationRepository(ApiClient.getClient().create(LeaveApplicationServiceRepository.class));
    private CompositeDisposable compositeDisposable = new CompositeDisposable();

    public MutableLiveData<List<LeaveType>> getLeaveType() {

        return leaveTypes;
    }

    public MutableLiveData<LeaveApplicationPolicy> getLeaveApplicationPolicy() {

        return leaveApplicationPolicy;
    }

    public void fetchLeaveTypes(String auth) {

        compositeDisposable.add(leaveApplicationRepository.getLeaveTypes(auth).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSingleObserver<List<LeaveType>>() {
                    @Override
                    public void onSuccess(List<LeaveType> leaveTypesList) {
                        leaveTypes.setValue(leaveTypesList);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }
                }));
    }

    public void fetchLeaveAppPolicy(String auth,Integer id){

        compositeDisposable.add(leaveApplicationRepository.getLeaveTypePolicy(auth,id).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSingleObserver<LeaveApplicationPolicy>() {
                    @Override
                    public void onSuccess(LeaveApplicationPolicy leaveAppPolicy) {
                        leaveApplicationPolicy.setValue(leaveAppPolicy);
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
