package com.jontromanob.app.mvvm_retrofit.retrofit.leaveapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Data;

/**
 * Created by Hi on 6/12/2019.
 */

public class Msg {

    @SerializedName("MessageType")
    @Expose
    public Integer messageType;
    @SerializedName("MessageString")
    @Expose
    public String messageString;
    @SerializedName("MessageDetails")
    @Expose
    public Object messageDetails;

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

    public Object getMessageDetails() {
        return messageDetails;
    }

    public void setMessageDetails(Object messageDetails) {
        this.messageDetails = messageDetails;
    }
}
