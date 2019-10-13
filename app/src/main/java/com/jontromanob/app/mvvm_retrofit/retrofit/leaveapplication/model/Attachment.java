package com.jontromanob.app.mvvm_retrofit.retrofit.leaveapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Data;

/**
 * Created by Hi on 6/13/2019.
 */

public class Attachment {

    @SerializedName("LeaveAttachmentId")
    @Expose
    public Integer leaveAttachmentId;
    @SerializedName("LeaveApplicationId")
    @Expose
    public Integer leaveApplicationId;
    @SerializedName("FileName")
    @Expose
    public String fileName;
    @SerializedName("OriginalFileName")
    @Expose
    public String originalFileName;
    @SerializedName("FilePath")
    @Expose
    public String filePath;
    @SerializedName("CD")
    @Expose
    public String cD;
    @SerializedName("MD")
    @Expose
    public String mD;
    @SerializedName("CB")
    @Expose
    public Integer cB;

    public Integer getLeaveAttachmentId() {
        return leaveAttachmentId;
    }

    public void setLeaveAttachmentId(Integer leaveAttachmentId) {
        this.leaveAttachmentId = leaveAttachmentId;
    }

    public Integer getLeaveApplicationId() {
        return leaveApplicationId;
    }

    public void setLeaveApplicationId(Integer leaveApplicationId) {
        this.leaveApplicationId = leaveApplicationId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getOriginalFileName() {
        return originalFileName;
    }

    public void setOriginalFileName(String originalFileName) {
        this.originalFileName = originalFileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getcD() {
        return cD;
    }

    public void setcD(String cD) {
        this.cD = cD;
    }

    public String getmD() {
        return mD;
    }

    public void setmD(String mD) {
        this.mD = mD;
    }

    public Integer getcB() {
        return cB;
    }

    public void setcB(Integer cB) {
        this.cB = cB;
    }

    public Integer getmB() {
        return mB;
    }

    public void setmB(Integer mB) {
        this.mB = mB;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getMessageType() {
        return messageType;
    }

    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }

    public Object getMessageString() {
        return messageString;
    }

    public void setMessageString(Object messageString) {
        this.messageString = messageString;
    }

    public Object getMessageDetails() {
        return messageDetails;
    }

    public void setMessageDetails(Object messageDetails) {
        this.messageDetails = messageDetails;
    }

    @SerializedName("MB")
    @Expose
    public Integer mB;
    @SerializedName("Rows")
    @Expose
    public Integer rows;
    @SerializedName("MessageType")
    @Expose
    public Integer messageType;
    @SerializedName("MessageString")
    @Expose
    public Object messageString;
    @SerializedName("MessageDetails")
    @Expose
    public Object messageDetails;
}
