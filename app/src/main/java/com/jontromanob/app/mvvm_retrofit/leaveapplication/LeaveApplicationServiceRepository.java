package com.jontromanob.app.mvvm_retrofit.leaveapplication;

import com.jontromanob.app.mvvm_retrofit.retrofit.leaveapplication.model.LeaveApplicationDetails;
import com.jontromanob.app.mvvm_retrofit.retrofit.leaveapplication.model.LeaveApplicationPolicy;
import com.jontromanob.app.mvvm_retrofit.retrofit.leaveapplication.model.LeaveType;

import java.util.List;

import io.reactivex.Single;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface LeaveApplicationServiceRepository {

    @Headers({
            "Content-Type: application/json"
    })
    @GET("api/LeaveApi/GetAll")
    Single<List<LeaveApplicationDetails>> getAllLeaveApplicationList(
            @Header("Authorization") String authorization
    );

    @Headers({
            "Content-Type: application/json"
    })
    @GET("api/LeaveApi/LeaveTypeSli")
    Single<List<LeaveType>> leaveTypeList(
            @Header("Authorization") String authorization
    );

    @Headers({
            "Content-Type: application/json"
    })
    @GET("api/LeaveApi/GetPolicy")
    Single<LeaveApplicationPolicy> getPolicy(
            @Header("Authorization") String authorization,
            @Query("LeaveTypeId") Integer leaveTypeId
    );

}
