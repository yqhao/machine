package com.suqi.center.machine.biz.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zxx
 * @create 2020-08-13 19:56
 */
@Data
public class HuaWeiTaskParam implements Serializable {

    private String phoneId;
    private String deviceId;
    private String uId;
    private String pkg;

    public HuaWeiTaskParam(String phoneId, String deviceId, String uId, String pkg) {
        this.phoneId = phoneId;
        this.deviceId = deviceId;
        this.uId = uId;
        this.pkg = pkg;
    }

}