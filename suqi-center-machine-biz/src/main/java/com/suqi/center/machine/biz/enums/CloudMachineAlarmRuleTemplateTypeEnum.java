package com.suqi.center.machine.biz.enums;

/**
 * 云机告警规则模板类型
 *
 * @version 1.0
 * @date 2023/4/20 16:38
 */
public enum CloudMachineAlarmRuleTemplateTypeEnum {
    INSUFFICIENT_CLOUD_MACHINE_SPACE_ALARM(1, "云机空间不足告警"),

    CPU_GRAPHICS_MEMORY_REACHES_THRESHOLD_ALARM(2, "CPU 显现不足"),
    RUN_MEMORY_REACHES_THRESHOLD_ALARM(3, "云机运行内存不足告警");

    private final Integer value;

    private final String info;


    CloudMachineAlarmRuleTemplateTypeEnum(Integer value, String info) {
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
