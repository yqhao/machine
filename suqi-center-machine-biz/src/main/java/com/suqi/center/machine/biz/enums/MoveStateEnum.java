package com.suqi.center.machine.biz.enums;

public enum MoveStateEnum {

    //@formatter:off
    /**
     * -50：取消
     */
    step_cancel(-50,"取消"),

    /**
     * -40：超时
     */
    step_timeout(-40,"超时"),

    /**
     * 0：申请换机
     */
    step_0_apply(0,"申请换机"),

    /**
     * 1：获取空闲云机失败
     */
    step_1_fetch_idle_device_fail(1,"获取空闲云机失败"),

    /**
     * 2：获取空闲云机成功
     */
    step_2_fetch_idle_device_succeed(2,"获取空闲云机成功"),

    /**
     * 3：旧机器进入维护模式和排队模式失败
     */
    step_3_old_device_before_status_fail(3,"旧机器进入维护模式和排队模式失败"),

    /**
     * 4：旧机器进入维护模式和排队模式成功
     */
    step_4_old_device_before_status_succeed(4,"旧机器进入维护模式和排队模式成功"),

    /**
     * 5：旧云机关机中
     * @NOTE 需要定时器触发当前状态
     */
    step_5_old_device_shutdown(5,"旧云机关机中"),

    /**
     * 6：旧云机关机失败
     */
    step_6_old_device_shutdown_fail(6,"旧云机关机失败"),

    /**
     * 7：旧云机关机成功
     */
    step_7_old_device_shutdown_succeed(7,"7：旧云机关机成功"),

    /**
     * 8：导出旧云机数据中
     * @NOTE 需要定时器触发当前状态
     */
    step_8_old_device_export_data(8,"导出旧云机数据中"),

    /**
     * 9：导出就云机数据失败
     */
    step_9_old_device_export_data_fail(9,"导出就云机数据失败"),

    /**
     * 10：导出旧云机数据成功
     */
    step_10_old_device_export_data_succeed(10,"导出旧云机数据成功"),

    /**
     * 11：恢复数据中
     * @NOTE 需要定时器触发当前状态
     */
    step_11_new_device_import_data(11,"恢复数据中"),

    /**
     * 12：恢复数据失败
     */
    step_12_new_device_import_data_fail(12,"恢复数据失败"),

    /**
     * 13：恢复成功
     */
    step_13_new_device_import_data_succeed(13,"恢复成功"),

    /**
     * 14：恢复关系数据失败
     */
    step_14_recovery_data_relation_fail(14,"恢复关系数据失败"),

    /**
     * 15：恢复关系数据成功
     */
    step_15_recovery_data_relation_succeed(15,"恢复关系数据成功"),

    /**
     * 16：新云机重启中
     */
    step_16_new_device_reboot(16,"新云机重启中"),

    /**
     * 17：新云机重启失败
     */
    step_17_new_device_reboot_fail(17,"新云机重启失败"),

    /**
     * 18：新云机退出维护模式成功
     */
    step_18_new_device_reboot_succeed(18,"新云机重启成功"),


    /**
     * 19：开始重设置旧云机中
     */
    step_19_old_device_reboot(19,"开始重设置旧云机中"),

    /**
     * 20：重置旧云机失败
     */
    step_20_old_device_reboot_fail(20,"重置旧云机失败"),

    /**
     * 21：重启旧云机成功
     */
    step_21_old_device_reboot_succeed(21,"重启旧云机成功"),
    /**
     * 22：开始重设置旧云机中
     */
    step_22_old_device_reset(22,"开始重置旧云机中"),

    /**
     * 23：重置旧云机失败
     */
    step_23_old_device_reset_fail(23,"重置旧云机失败"),

    /**
     * 50：换机完成
     */
    step_50_complete(50,"换机完成"),

    ;
    //@formatter:on
    private final int value;

    private final String info;

    MoveStateEnum(int value, String info) {
        this.value = value;
        this.info = info;
    }


    public int value() {
        return value;
    }


    public String info() {
        return info;
    }

    public MoveStateEnum[] enums() {
        return values();
    }

    public static MoveStateEnum valueOf(int i) {
        for (MoveStateEnum t : values()) {
            if (t.value() == i) {
                return t;
            }
        }
        return null;
    }

}
