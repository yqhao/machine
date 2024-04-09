package com.suqi.center.machine.biz.viz.enums;

/**
 * @version 1.0
 * @date 2023/8/22 14:37
 */
public enum McUpdateDeviceTaskRecordStatusEnum {

    DELETE(-50, "删除"),

    STOP_TASK(-20, "停止任务"),

    TASK_EXECUTION_FAILURE(-10, "任务执行失败"),

    PENDING_EXECUTION(0, "等待执行中"),

    TASK_EXECUTION(10, "任务执行中"),

    NORMAL(50, "正常"),
    ;

    private final Integer value;

    private final String info;

    McUpdateDeviceTaskRecordStatusEnum(Integer value, String info) {
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
