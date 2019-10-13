package com.jontromanob.app.mvvm_retrofit.retrofit.leaveapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Data;

/**
 * Created by shafiulhasan on 7/30/18.
 */


public class LeaveApplicationPolicy {
    public Integer getLeaveGroupDetailsId() {
        return leaveGroupDetailsId;
    }

    public void setLeaveGroupDetailsId(Integer leaveGroupDetailsId) {
        this.leaveGroupDetailsId = leaveGroupDetailsId;
    }

    public Integer getLeaveGroupId() {
        return leaveGroupId;
    }

    public void setLeaveGroupId(Integer leaveGroupId) {
        this.leaveGroupId = leaveGroupId;
    }

    public Integer getLeaveTypeId() {
        return leaveTypeId;
    }

    public void setLeaveTypeId(Integer leaveTypeId) {
        this.leaveTypeId = leaveTypeId;
    }

    public Object getIsServiceLengthPolicy() {
        return isServiceLengthPolicy;
    }

    public void setIsServiceLengthPolicy(Object isServiceLengthPolicy) {
        this.isServiceLengthPolicy = isServiceLengthPolicy;
    }

    public Object getIsBalanceForwardWhenGroupChange() {
        return isBalanceForwardWhenGroupChange;
    }

    public void setIsBalanceForwardWhenGroupChange(Object isBalanceForwardWhenGroupChange) {
        this.isBalanceForwardWhenGroupChange = isBalanceForwardWhenGroupChange;
    }

    public Object getAppliedInMultipleYear() {
        return appliedInMultipleYear;
    }

    public void setAppliedInMultipleYear(Object appliedInMultipleYear) {
        this.appliedInMultipleYear = appliedInMultipleYear;
    }

    public Object getIsBalanceForwarded() {
        return isBalanceForwarded;
    }

    public void setIsBalanceForwarded(Object isBalanceForwarded) {
        this.isBalanceForwarded = isBalanceForwarded;
    }

    public Object getIsEarnedLeave() {
        return isEarnedLeave;
    }

    public void setIsEarnedLeave(Object isEarnedLeave) {
        this.isEarnedLeave = isEarnedLeave;
    }

    public Object getAllowEncashment() {
        return allowEncashment;
    }

    public void setAllowEncashment(Object allowEncashment) {
        this.allowEncashment = allowEncashment;
    }

    public Object getIsUnpaidLeave() {
        return isUnpaidLeave;
    }

    public void setIsUnpaidLeave(Object isUnpaidLeave) {
        this.isUnpaidLeave = isUnpaidLeave;
    }

    public Boolean getRelieverMandatory() {
        return isRelieverMandatory;
    }

    public void setRelieverMandatory(Boolean relieverMandatory) {
        isRelieverMandatory = relieverMandatory;
    }

    public Object getIsAllowedForNonConfirmEmployee() {
        return isAllowedForNonConfirmEmployee;
    }

    public void setIsAllowedForNonConfirmEmployee(Object isAllowedForNonConfirmEmployee) {
        this.isAllowedForNonConfirmEmployee = isAllowedForNonConfirmEmployee;
    }

    public Integer getAllowedBalance() {
        return allowedBalance;
    }

    public void setAllowedBalance(Integer allowedBalance) {
        this.allowedBalance = allowedBalance;
    }

    public Integer getMaxForwardedBalance() {
        return maxForwardedBalance;
    }

    public void setMaxForwardedBalance(Integer maxForwardedBalance) {
        this.maxForwardedBalance = maxForwardedBalance;
    }

    public Integer getContinuousSanction() {
        return continuousSanction;
    }

    public void setContinuousSanction(Integer continuousSanction) {
        this.continuousSanction = continuousSanction;
    }

    public Integer getMaxSantionInYear() {
        return maxSantionInYear;
    }

    public void setMaxSantionInYear(Integer maxSantionInYear) {
        this.maxSantionInYear = maxSantionInYear;
    }

    public Object getIsNegativeAllowed() {
        return isNegativeAllowed;
    }

    public void setIsNegativeAllowed(Object isNegativeAllowed) {
        this.isNegativeAllowed = isNegativeAllowed;
    }

    public Boolean getHalfDayAllowed() {
        return isHalfDayAllowed;
    }

    public void setHalfDayAllowed(Boolean halfDayAllowed) {
        isHalfDayAllowed = halfDayAllowed;
    }

    public Integer getMaxSanctServiceLife() {
        return maxSanctServiceLife;
    }

    public void setMaxSanctServiceLife(Integer maxSanctServiceLife) {
        this.maxSanctServiceLife = maxSanctServiceLife;
    }

    public Integer getIntervalDaysInSameLeave() {
        return intervalDaysInSameLeave;
    }

    public void setIntervalDaysInSameLeave(Integer intervalDaysInSameLeave) {
        this.intervalDaysInSameLeave = intervalDaysInSameLeave;
    }

    public Boolean getContinuous() {
        return isContinuous;
    }

    public void setContinuous(Boolean continuous) {
        isContinuous = continuous;
    }

    public Boolean getPrefix() {
        return isPrefix;
    }

    public void setPrefix(Boolean prefix) {
        isPrefix = prefix;
    }

    public Boolean getSuffix() {
        return isSuffix;
    }

    public void setSuffix(Boolean suffix) {
        isSuffix = suffix;
    }

    public Boolean getRequiresLeaveAttachment() {
        return requiresLeaveAttachment;
    }

    public void setRequiresLeaveAttachment(Boolean requiresLeaveAttachment) {
        this.requiresLeaveAttachment = requiresLeaveAttachment;
    }

    public Integer getMinDaysForAttachment() {
        return minDaysForAttachment;
    }

    public void setMinDaysForAttachment(Integer minDaysForAttachment) {
        this.minDaysForAttachment = minDaysForAttachment;
    }

    public Integer getMaxPastApplyDayLimit() {
        return maxPastApplyDayLimit;
    }

    public void setMaxPastApplyDayLimit(Integer maxPastApplyDayLimit) {
        this.maxPastApplyDayLimit = maxPastApplyDayLimit;
    }

    public Object getLeaveTypeName() {
        return leaveTypeName;
    }

    public void setLeaveTypeName(Object leaveTypeName) {
        this.leaveTypeName = leaveTypeName;
    }

    public Integer getStatusAllowedBalance() {
        return statusAllowedBalance;
    }

    public void setStatusAllowedBalance(Integer statusAllowedBalance) {
        this.statusAllowedBalance = statusAllowedBalance;
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

    @SerializedName("LeaveGroupDetailsId")
    @Expose
    public Integer leaveGroupDetailsId;
    @SerializedName("LeaveGroupId")
    @Expose
    public Integer leaveGroupId;
    @SerializedName("LeaveTypeId")
    @Expose
    public Integer leaveTypeId;
    @SerializedName("IsServiceLengthPolicy")
    @Expose
    public Object isServiceLengthPolicy;
    @SerializedName("IsBalanceForwardWhenGroupChange")
    @Expose
    public Object isBalanceForwardWhenGroupChange;
    @SerializedName("AppliedInMultipleYear")
    @Expose
    public Object appliedInMultipleYear;
    @SerializedName("IsBalanceForwarded")
    @Expose
    public Object isBalanceForwarded;
    @SerializedName("IsEarnedLeave")
    @Expose
    public Object isEarnedLeave;
    @SerializedName("AllowEncashment")
    @Expose
    public Object allowEncashment;
    @SerializedName("IsUnpaidLeave")
    @Expose
    public Object isUnpaidLeave;
    @SerializedName("IsRelieverMandatory")
    @Expose
    public Boolean isRelieverMandatory;
    @SerializedName("IsAllowedForNonConfirmEmployee")
    @Expose
    public Object isAllowedForNonConfirmEmployee;
    @SerializedName("AllowedBalance")
    @Expose
    public Integer allowedBalance;
    @SerializedName("MaxForwardedBalance")
    @Expose
    public Integer maxForwardedBalance;
    @SerializedName("ContinuousSanction")
    @Expose
    public Integer continuousSanction;
    @SerializedName("MaxSantionInYear")
    @Expose
    public Integer maxSantionInYear;
    @SerializedName("IsNegativeAllowed")
    @Expose
    public Object isNegativeAllowed;
    @SerializedName("IsHalfDayAllowed")
    @Expose
    public Boolean isHalfDayAllowed;
    @SerializedName("MaxSanctServiceLife")
    @Expose
    public Integer maxSanctServiceLife;
    @SerializedName("IntervalDaysInSameLeave")
    @Expose
    public Integer intervalDaysInSameLeave;
    @SerializedName("IsContinuous")
    @Expose
    public Boolean isContinuous;
    @SerializedName("IsPrefix")
    @Expose
    public Boolean isPrefix;
    @SerializedName("IsSuffix")
    @Expose
    public Boolean isSuffix;
    @SerializedName("RequiresLeaveAttachment")
    @Expose
    public Boolean requiresLeaveAttachment;
    @SerializedName("MinDaysForAttachment")
    @Expose
    public Integer minDaysForAttachment;
    @SerializedName("MaxPastApplyDayLimit")
    @Expose
    public Integer maxPastApplyDayLimit;
    @SerializedName("LeaveTypeName")
    @Expose
    public Object leaveTypeName;
    @SerializedName("StatusAllowedBalance")
    @Expose
    public Integer statusAllowedBalance;
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

}
