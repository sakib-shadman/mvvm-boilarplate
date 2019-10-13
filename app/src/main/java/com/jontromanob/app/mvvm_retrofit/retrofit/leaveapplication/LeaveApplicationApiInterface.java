package com.jontromanob.app.mvvm_retrofit.retrofit.leaveapplication;



import com.jontromanob.app.mvvm_retrofit.retrofit.leaveapplication.model.LeaveApplicationDetails;
import com.jontromanob.app.mvvm_retrofit.retrofit.leaveapplication.model.LeaveApplicationPolicy;
import com.jontromanob.app.mvvm_retrofit.retrofit.leaveapplication.model.LeaveApplicationRequest;
import com.jontromanob.app.mvvm_retrofit.retrofit.leaveapplication.model.LeaveSaveResponse;
import com.jontromanob.app.mvvm_retrofit.retrofit.leaveapplication.model.LeaveType;
import com.jontromanob.app.mvvm_retrofit.retrofit.leaveapplication.model.ResponseMessage;

import java.util.List;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

/**
 * Created by ankon on 3/30/2018.
 */

public interface LeaveApplicationApiInterface {

    @Headers({
            "Content-Type: application/json"
    })
    @GET("api/LeaveApi/GetAll")
    Call<List<LeaveApplicationDetails>> getAllLeaveApplicationList(
            @Header("Authorization") String authorization
    );

    @Headers({
            "Content-Type: application/json"
    })
    @GET("api/LeaveApi/CheckLeaveConfiguration")
    Call<ResponseMessage> eligibleForLeaveApplication(
            @Header("Authorization") String authorization
    );

    @Headers({
            "Content-Type: application/json"
    })
    @GET("api/LeaveApi/GetPolicy")
    Call<LeaveApplicationPolicy> getPolicy(
            @Header("Authorization") String authorization,
            @Query("LeaveTypeId") Integer leaveTypeId
    );

    @Headers({
            "Content-Type: application/json"
    })
    @GET("api/LeaveApi/LeaveTypeSli")
    Call<List<LeaveType>> leaveTypeList(
            @Header("Authorization") String authorization
    );

    @Headers({
            "Content-Type: application/json"
    })
    @POST("api/LeaveApi/Save")
        //todo need to change the date
    Call<LeaveSaveResponse> saveLeaveApplication(
            @Header("Authorization") String authorization,
            @Body LeaveApplicationRequest LeaveApplicationRequest
    );


    @Multipart
    @POST("api/LeaveApi/SaveLeaveAttachments")
    Call<Object> saveLeaveAttachments(

            @Header("Authorization") String authorization,
            @Part("LeaveApplicationId") RequestBody leaveApplicationId,
            @Part MultipartBody.Part files,
            @Part("deletedLeaveAttachmentId") RequestBody deletedLeaveAttachmentId,
            @Part("IsNewApplication") RequestBody isNewApplication,
            @Part("Rejected") RequestBody rejected

    );

    @Headers({
            "Content-Type: application/json"
    })
    @GET("api/LeaveApi/Get")
    Call<LeaveApplicationDetails> callLeaveApplicationById(
            @Header("Authorization") String authorization,
            @Query("leaveApplicationId") Integer leaveApplicationId
    );
}
