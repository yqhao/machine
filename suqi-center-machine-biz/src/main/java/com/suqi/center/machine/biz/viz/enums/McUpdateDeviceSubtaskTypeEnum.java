package com.suqi.center.machine.biz.viz.enums;

/**
 * @version 1.0
 * @date 2023/8/23 14:42
 */
public enum McUpdateDeviceSubtaskTypeEnum {

    RESET_THE_MACHINE_AND_INSTALL_THE_SERVICE(1, "重置机器并安装服务"),

    OTA_RESTART(2, "OTA重启"),

    VENDOR_RESTART(3, "服务商重启"),
    ;

    public final Integer value;

    public final String info;

    McUpdateDeviceSubtaskTypeEnum(Integer value, String info) {
        this.value = value;
        this.info = info;
    }

}
