package com.suqi.center.machine.biz.viz.enums;

/**
 * @version 1.0
 * @date 2023/8/22 15:21
 */
public enum McMachineStatusEnum {

    DELETE(-50, "删除"),

    SUSPEND_USE(0, "暂停使用"),

    NORMAL(50, "正常"),
    ;

    private final Integer value;

    private final String info;

    McMachineStatusEnum(Integer value, String info) {
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
