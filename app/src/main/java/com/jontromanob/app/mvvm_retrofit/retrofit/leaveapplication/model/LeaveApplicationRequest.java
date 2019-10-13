package com.jontromanob.app.mvvm_retrofit.retrofit.leaveapplication.model;

import com.google.gson.annotations.SerializedName;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by ankon on 3/30/2018.
 */


public class LeaveApplicationRequest {

    @SerializedName("LeaveApplicationId")
    private Integer leaveApplicationId;
    @SerializedName("CompanyId")
    private String companyId;
    @SerializedName("EmployeeId")
    private Integer employeeId;

    public Integer getLeaveApplicationId() {
        return leaveApplicationId;
    }

    public void setLeaveApplicationId(Integer leaveApplicationId) {
        this.leaveApplicationId = leaveApplicationId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getLeaveTypeId() {
        return leaveTypeId;
    }

    public void setLeaveTypeId(Integer leaveTypeId) {
        this.leaveTypeId = leaveTypeId;
    }

    public String getFromDateString() {
        return fromDateString;
    }

    public void setFromDateString(String fromDateString) {
        this.fromDateString = fromDateString;
    }

    public String getToDateString() {
        return toDateString;
    }

    public void setToDateString(String toDateString) {
        this.toDateString = toDateString;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getLeaveStartDayType() {
        return leaveStartDayType;
    }

    public void setLeaveStartDayType(String leaveStartDayType) {
        this.leaveStartDayType = leaveStartDayType;
    }

    public String getLeaveEndDayType() {
        return leaveEndDayType;
    }

    public void setLeaveEndDayType(String leaveEndDayType) {
        this.leaveEndDayType = leaveEndDayType;
    }

    public String getLeaveStatus() {
        return leaveStatus;
    }

    public void setLeaveStatus(String leaveStatus) {
        this.leaveStatus = leaveStatus;
    }

    public Integer getRelieverId() {
        return relieverId;
    }

    public void setRelieverId(Integer relieverId) {
        this.relieverId = relieverId;
    }

    public Boolean getHasAttachment() {
        return hasAttachment;
    }

    public void setHasAttachment(Boolean hasAttachment) {
        this.hasAttachment = hasAttachment;
    }

    @SerializedName("LeaveTypeId")
    private Integer leaveTypeId;
    @SerializedName("FromDateString")
    private String fromDateString;
    @SerializedName("ToDateString")
    private String toDateString;
    @SerializedName("Notes")
    private String notes;
    @SerializedName("LeaveStartDayType")
    private String leaveStartDayType;
    @SerializedName("LeaveEndDayType")
    private String leaveEndDayType;
    @SerializedName("LeaveStatus")
    private String leaveStatus;
    @SerializedName("RelieverId")
    private Integer relieverId;
    @SerializedName("HasAttachment")
    private Boolean hasAttachment;


}
