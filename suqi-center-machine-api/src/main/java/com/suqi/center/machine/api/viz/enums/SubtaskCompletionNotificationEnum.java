package com.suqi.center.machine.api.viz.enums;

/**
 * @version 1.0
 * @date 2023/9/12 14:44
 */
public enum SubtaskCompletionNotificationEnum {

    SUCCESS(50, "主任务执行成功"),

    PROCESSING(0, "执行下一个子任务"),

    FAILED(-50, "主任务执行失败"),

    ;

    private final Integer value;

    private final String info;

    SubtaskCompletionNotificationEnum(Integer value, String info) {
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
