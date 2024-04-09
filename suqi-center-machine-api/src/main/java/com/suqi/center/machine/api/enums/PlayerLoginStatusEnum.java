package com.suqi.center.machine.api.enums;

public enum PlayerLoginStatusEnum {
    EXITED(0, "用户已退出,设备已空闲"),
    TOBEENTERED(5, "待进入"),
    Entered(10, "已进入"),
    OUTER(-10, "用户已退出,设备未空闲"),
    ;
    private final Integer value;

    private final String info;

    PlayerLoginStatusEnum(int value, String info) {
        this.value = value;
        this.info = info;
    }

    public int value() {
        return value;
    }

    public String info() {
        return info;
    }


}
