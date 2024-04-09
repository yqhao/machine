package com.suqi.center.machine.api.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class DeviceUseRecord implements Serializable {

    String deviceId;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    Date loginTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    Date logoutTime;

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Date getLogoutTime() {
        return logoutTime;
    }

    public void setLogoutTime(Date logoutTime) {
        this.logoutTime = logoutTime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"deviceId\":\"").append(deviceId).append('\"');
        sb.append(", \"loginTime\":\"").append(loginTime).append('\"');
        sb.append(", \"logoutTime\":\"").append(logoutTime).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
