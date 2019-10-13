package com.jontromanob.app.mvvm_retrofit.retrofit.leaveapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Data;

/**
 * Created by Hi on 6/13/2019.
 */

public class LeaveApplication {

    @SerializedName("LeaveApplicationId")
    @Expose
    public Integer leaveApplicationId;
    @SerializedName("CompanyId")
    @Expose
    public Integer companyId;
    @SerializedName("EmployeeId")
    @Expose
    public Integer employeeId;
    @SerializedName("LeaveTypeId")
    @Expose
    public Integer leaveTypeId;
    @SerializedName("FromDate")
    @Expose
    public String fromDate;
    @SerializedName("LeaveStartDayType")
    @Expose
    public String leaveStartDayType;
    @SerializedName("ToDate")
    @Expose
    public String toDate;
    @SerializedName("LeaveEndDayType")
    @Expose
    public String leaveEndDayType;
    @SerializedName("DayCount")
    @Expose
    public Integer dayCount;
    @SerializedName("ApplyDate")
    @Expose
    public String applyDate;
    @SerializedName("Notes")
    @Expose
    public String notes;
    @SerializedName("LeaveStatus")
    @Expose
    public String leaveStatus;
    @SerializedName("IsMandatory")
    @Expose
    public Object isMandatory;
    @SerializedName("IsForeign")
    @Expose
    public Boolean isForeign;
    @SerializedName("CountryId")
    @Expose
    public Object countryId;
    @SerializedName("PassportNo")
    @Expose
    public Object passportNo;
    @SerializedName("IsOnlineLeaveYN")
    @Expose
    public Boolean isOnlineLeaveYN;
    @SerializedName("SupervisorId")
    @Expose
    public Integer supervisorId;
    @SerializedName("appplicationType")
    @Expose
    public Integer appplicationType;
    @SerializedName("FromDateString")
    @Expose
    public String fromDateString;
    @SerializedName("ToDateString")
    @Expose
    public String toDateString;
    @SerializedName("ApplyDateString")
    @Expose
    public String applyDateString;
    @SerializedName("CurrentDateString")
    @Expose
    public Object currentDateString;
    @SerializedName("EmployeeName")
    @Expose
    public String employeeName;
    @SerializedName("EmployeeCode")
    @Expose
    public String employeeCode;
    @SerializedName("JoinDate")
    @Expose
    public String joinDate;
    @SerializedName("JobStatus")
    @Expose
    public Object jobStatus;
    @SerializedName("Designation")
    @Expose
    public Object designation;
    @SerializedName("BranchName")
    @Expose
    public Object branchName;
    @SerializedName("BranchId")
    @Expose
    public Object branchId;
    @SerializedName("DivisionName")
    @Expose
    public Object divisionName;
    @SerializedName("DepartmentName")
    @Expose
    public Object departmentName;
    @SerializedName("DepartmentId")
    @Expose
    public Object departmentId;
    @SerializedName("ApplicationId")
    @Expose
    public Integer applicationId;
    @SerializedName("employeeStatus")
    @Expose
    public Object employeeStatus;
    @SerializedName("LeaveProcessPolicy")
    @Expose
    public Object leaveProcessPolicy;
    @SerializedName("EmployeeSupervisor")
    @Expose
    public Object employeeSupervisor;
    @SerializedName("LeaveName")
    @Expose
    public String leaveName;
    @SerializedName("IsApproved")
    @Expose
    public Boolean isApproved;
    @SerializedName("ApplicationSerial")
    @Expose
    public Integer applicationSerial;
    @SerializedName("SelfService")
    @Expose
    public Boolean selfService;
    @SerializedName("NotUpdatable")
    @Expose
    public Boolean notUpdatable;
    @SerializedName("IsHalfDayAllowed")
    @Expose
    public Boolean isHalfDayAllowed;
    @SerializedName("RelieverId")
    @Expose
    public Integer relieverId;
    @SerializedName("RelieverName")
    @Expose
    public String relieverName;
    @SerializedName("CurrentHeirarchy")
    @Expose
    public Integer currentHeirarchy;
    @SerializedName("DisableRelieverList")
    @Expose
    public Boolean disableRelieverList;
    @SerializedName("HasAttachment")
    @Expose
    public Boolean hasAttachment;
    @SerializedName("CD")
    @Expose
    public String cD;
    @SerializedName("MD")
    @Expose
    public String mD;
    @SerializedName("CB")
    @Expose
    public Integer cB;
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
    @SerializedName("attachment")
    @Expose
    public Attachment attachment;

    public Integer getLeaveApplicationId() {
        return leaveApplicationId;
    }

    public void setLeaveApplicationId(Integer leaveApplicationId) {
        this.leaveApplicationId = leaveApplicationId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
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

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getLeaveStartDayType() {
        return leaveStartDayType;
    }

    public void setLeaveStartDayType(String leaveStartDayType) {
        this.leaveStartDayType = leaveStartDayType;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public String getLeaveEndDayType() {
        return leaveEndDayType;
    }

    public void setLeaveEndDayType(String leaveEndDayType) {
        this.leaveEndDayType = leaveEndDayType;
    }

    public Integer getDayCount() {
        return dayCount;
    }

    public void setDayCount(Integer dayCount) {
        this.dayCount = dayCount;
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getLeaveStatus() {
        return leaveStatus;
    }

    public void setLeaveStatus(String leaveStatus) {
        this.leaveStatus = leaveStatus;
    }

    public Object getIsMandatory() {
        return isMandatory;
    }

    public void setIsMandatory(Object isMandatory) {
        this.isMandatory = isMandatory;
    }

    public Boolean getForeign() {
        return isForeign;
    }

    public void setForeign(Boolean foreign) {
        isForeign = foreign;
    }

    public Object getCountryId() {
        return countryId;
    }

    public void setCountryId(Object countryId) {
        this.countryId = countryId;
    }

    public Object getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(Object passportNo) {
        this.passportNo = passportNo;
    }

    public Boolean getOnlineLeaveYN() {
        return isOnlineLeaveYN;
    }

    public void setOnlineLeaveYN(Boolean onlineLeaveYN) {
        isOnlineLeaveYN = onlineLeaveYN;
    }

    public Integer getSupervisorId() {
        return supervisorId;
    }

    public void setSupervisorId(Integer supervisorId) {
        this.supervisorId = supervisorId;
    }

    public Integer getAppplicationType() {
        return appplicationType;
    }

    public void setAppplicationType(Integer appplicationType) {
        this.appplicationType = appplicationType;
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

    public String getApplyDateString() {
        return applyDateString;
    }

    public void setApplyDateString(String applyDateString) {
        this.applyDateString = applyDateString;
    }

    public Object getCurrentDateString() {
        return currentDateString;
    }

    public void setCurrentDateString(Object currentDateString) {
        this.currentDateString = currentDateString;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public Object getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(Object jobStatus) {
        this.jobStatus = jobStatus;
    }

    public Object getDesignation() {
        return designation;
    }

    public void setDesignation(Object designation) {
        this.designation = designation;
    }

    public Object getBranchName() {
        return branchName;
    }

    public void setBranchName(Object branchName) {
        this.branchName = branchName;
    }

    public Object getBranchId() {
        return branchId;
    }

    public void setBranchId(Object branchId) {
        this.branchId = branchId;
    }

    public Object getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(Object divisionName) {
        this.divisionName = divisionName;
    }

    public Object getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(Object departmentName) {
        this.departmentName = departmentName;
    }

    public Object getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Object departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }

    public Object getEmployeeStatus() {
        return employeeStatus;
    }

    public void setEmployeeStatus(Object employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    public Object getLeaveProcessPolicy() {
        return leaveProcessPolicy;
    }

    public void setLeaveProcessPolicy(Object leaveProcessPolicy) {
        this.leaveProcessPolicy = leaveProcessPolicy;
    }

    public Object getEmployeeSupervisor() {
        return employeeSupervisor;
    }

    public void setEmployeeSupervisor(Object employeeSupervisor) {
        this.employeeSupervisor = employeeSupervisor;
    }

    public String getLeaveName() {
        return leaveName;
    }

    public void setLeaveName(String leaveName) {
        this.leaveName = leaveName;
    }

    public Boolean getApproved() {
        return isApproved;
    }

    public void setApproved(Boolean approved) {
        isApproved = approved;
    }

    public Integer getApplicationSerial() {
        return applicationSerial;
    }

    public void setApplicationSerial(Integer applicationSerial) {
        this.applicationSerial = applicationSerial;
    }

    public Boolean getSelfService() {
        return selfService;
    }

    public void setSelfService(Boolean selfService) {
        this.selfService = selfService;
    }

    public Boolean getNotUpdatable() {
        return notUpdatable;
    }

    public void setNotUpdatable(Boolean notUpdatable) {
        this.notUpdatable = notUpdatable;
    }

    public Boolean getHalfDayAllowed() {
        return isHalfDayAllowed;
    }

    public void setHalfDayAllowed(Boolean halfDayAllowed) {
        isHalfDayAllowed = halfDayAllowed;
    }

    public Integer getRelieverId() {
        return relieverId;
    }

    public void setRelieverId(Integer relieverId) {
        this.relieverId = relieverId;
    }

    public String getRelieverName() {
        return relieverName;
    }

    public void setRelieverName(String relieverName) {
        this.relieverName = relieverName;
    }

    public Integer getCurrentHeirarchy() {
        return currentHeirarchy;
    }

    public void setCurrentHeirarchy(Integer currentHeirarchy) {
        this.currentHeirarchy = currentHeirarchy;
    }

    public Boolean getDisableRelieverList() {
        return disableRelieverList;
    }

    public void setDisableRelieverList(Boolean disableRelieverList) {
        this.disableRelieverList = disableRelieverList;
    }

    public Boolean getHasAttachment() {
        return hasAttachment;
    }

    public void setHasAttachment(Boolean hasAttachment) {
        this.hasAttachment = hasAttachment;
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

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }
}
