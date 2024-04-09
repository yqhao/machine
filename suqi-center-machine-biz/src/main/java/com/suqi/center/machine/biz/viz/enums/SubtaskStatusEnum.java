package com.suqi.center.machine.biz.viz.enums;

/**
 * @version 1.0
 * @date 2023/9/11 16:38
 */
public enum SubtaskStatusEnum {
    SUCCESS(50, "成功"),

    PROCESSING(0, "运行中"),

    FAILED(-50, "失败"),

    ;

    private final Integer value;

    private final String info;

    SubtaskStatusEnum(Integer value, String info) {
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
