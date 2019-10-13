package com.jontromanob.app.mvvm_retrofit.retrofit.leaveapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Data;

/**
 * Created by Hi on 6/12/2019.
 */

public class LeaveSaveResponse {

    public Integer getMessageType() {
        return messageType;
    }

    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }

    public String getMessageString() {
        return messageString;
    }

    public void setMessageString(String messageString) {
        this.messageString = messageString;
    }

    public String getMessageDetails() {
        return messageDetails;
    }

    public void setMessageDetails(String messageDetails) {
        this.messageDetails = messageDetails;
    }

    public Integer getLeaveApplicationId() {
        return leaveApplicationId;
    }

    public void setLeaveApplicationId(Integer leaveApplicationId) {
        this.leaveApplicationId = leaveApplicationId;
    }

    public Boolean getNewAppliction() {
        return isNewAppliction;
    }

    public void setNewAppliction(Boolean newAppliction) {
        isNewAppliction = newAppliction;
    }

    public Boolean getRejected() {
        return rejected;
    }

    public void setRejected(Boolean rejected) {
        this.rejected = rejected;
    }

    @SerializedName("MessageType")
    @Expose
    public Integer messageType;
    @SerializedName("MessageString")
    @Expose
    public String messageString;
    @SerializedName("MessageDetails")
    @Expose
    public String messageDetails;
    @SerializedName("LeaveApplicationId")
    @Expose
    public Integer leaveApplicationId;
    @SerializedName("isNewAppliction")
    @Expose
    public Boolean isNewAppliction;
    @SerializedName("rejected")
    @Expose
    public Boolean rejected;
}
