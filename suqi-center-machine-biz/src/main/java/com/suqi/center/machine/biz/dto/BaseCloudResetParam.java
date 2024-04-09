package com.suqi.center.machine.biz.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BaseCloudResetParam implements Serializable {

    private String deviceId;

    private String userPhoneId;

    private Long memberId;

    private Boolean isMaint = true;

    private Integer type = 1;

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getUserPhoneId() {
        return userPhoneId;
    }

    public void setUserPhoneId(String userPhoneId) {
        this.userPhoneId = userPhoneId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Boolean getIsMaint() {
        return isMaint;
    }

    public void setIsMaint(Boolean maint) {
        isMaint = maint;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"deviceId\":\"").append(deviceId).append('\"');
        sb.append(", \"userPhoneId\":\"").append(userPhoneId).append('\"');
        sb.append(", \"memberId\":").append(memberId);
        sb.append(", \"isMaint\":").append(isMaint);
        sb.append(", \"type\":").append(type);
        sb.append('}');
        return sb.toString();
    }
}
