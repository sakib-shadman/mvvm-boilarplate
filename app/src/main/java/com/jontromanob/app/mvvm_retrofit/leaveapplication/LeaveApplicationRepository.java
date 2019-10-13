package com.jontromanob.app.mvvm_retrofit.leaveapplication;

import com.jontromanob.app.mvvm_retrofit.retrofit.leaveapplication.model.LeaveApplicationDetails;
import com.jontromanob.app.mvvm_retrofit.retrofit.leaveapplication.model.LeaveApplicationPolicy;
import com.jontromanob.app.mvvm_retrofit.retrofit.leaveapplication.model.LeaveType;

import java.util.List;

import io.reactivex.Single;

public class LeaveApplicationRepository {


    private LeaveApplicationServiceRepository leaveApplicationServiceRepository;

    public LeaveApplicationRepository(LeaveApplicationServiceRepository leaveApplicationServiceRepository) {
        this.leaveApplicationServiceRepository = leaveApplicationServiceRepository;
    }

    public Single<List<LeaveApplicationDetails>> getAllLeaveApplications(String auth) {

        return leaveApplicationServiceRepository.getAllLeaveApplicationList(auth);
    }

    public Single<List<LeaveType>> getLeaveTypes(String auth){

        return leaveApplicationServiceRepository.leaveTypeList(auth);
    }

    public Single<LeaveApplicationPolicy> getLeaveTypePolicy(String auth,Integer id){

        return leaveApplicationServiceRepository.getPolicy(auth,id);
    }

    /*MutableLiveData<List<LeaveType>> getLeaveType(String authorization){

        final MutableLiveData<List<LeaveType>> mLeaveType = new MutableLiveData<List<LeaveType>>();

        CallLeaveType.leaveTypeList(authorization, new CallLeaveType.LeaveTypeListCallback() {
            @Override
            public void onSuccess(List<LeaveType> leaveTypes) {
                if(leaveTypes != null){
                    mLeaveType.setValue(leaveTypes);
                }
            }

            @Override
            public void onFailure() {

            }
        });
        return mLeaveType;

    }


    MutableLiveData<LeaveApplicationPolicy> getLeavePolicy(String authorization, Integer leaveTypeId){

        final MutableLiveData<LeaveApplicationPolicy> mLeavePolicy = new MutableLiveData<LeaveApplicationPolicy>();


        CallLeaveApplicationPolicy.getLeaveApplicationPolicy(authorization, leaveTypeId, new CallLeaveApplicationPolicy.LeaveApplicationPolicyCallback() {
            @Override
            public void onSuccess(LeaveApplicationPolicy applicationPolicy) {
                mLeavePolicy.setValue(applicationPolicy);
            }

            @Override
            public void onFailure() {

                mLeavePolicy.setValue(null);
            }
        });

        return mLeavePolicy;

    }
*/

}
