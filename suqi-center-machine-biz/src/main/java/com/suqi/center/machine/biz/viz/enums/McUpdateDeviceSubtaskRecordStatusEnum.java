package com.suqi.center.machine.biz.viz.enums;

/**
 * @version 1.0
 * @date 2023/8/23 12:06
 */
public enum McUpdateDeviceSubtaskRecordStatusEnum {

    DELETE(-50, "删除"),

    STOP_TASK(-20, "停止任务"),

    TASK_EXECUTION_FAILURE(-10, "任务执行失败"),

    TASK_EXECUTION(10, "任务执行中"),

    NORMAL(50, "正常"),
            ;

    private final Integer value;

    private final String info;

    McUpdateDeviceSubtaskRecordStatusEnum(Integer value, String info) {
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
