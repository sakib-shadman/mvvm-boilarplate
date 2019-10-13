package com.jontromanob.app.mvvm_retrofit.retrofit.leaveapplication.model;

import com.google.gson.annotations.SerializedName;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by ankon on 3/30/2018.
 */


public class LeaveType {

    @SerializedName("Text")
    public String text;
    @SerializedName("Value")
    public String value;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
