package com.jontromanob.app.mvvm_retrofit.retrofit.leaveapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Data;

/**
 * Created by Joy on 29-Jan-18.
 */

public class ResponseMessage {
    @SerializedName("MessageType")
    @Expose
    public Integer messageType;
    @SerializedName("MessageString")
    @Expose
    public String messageString;

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

    @SerializedName("MessageDetails")
    @Expose
    public String messageDetails;
}
