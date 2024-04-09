package com.suqi.center.machine.biz.viz.enums;

/**
 * @version 1.0
 * @date 2023/8/22 15:28
 */
public enum McUpdateDeviceTaskRecordTypeEnum {

    SYSTEM_TASK(1, "系统任务"),

    USER_TASK(2, "用户任务"),
    ;

    private final Integer value;

    private final String info;

    McUpdateDeviceTaskRecordTypeEnum(Integer value, String info) {
        this.value = value;
        this.info = info;
    }

    public Integer getValue() {
        return value;
    }

    public String getInfo() {
        return info;
    }
}
