package com.suqi.center.machine.biz.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0
 * @date 2023/4/20 17:45
 */
@Data
public class SmnLackOfSpaceWarningNotice implements Serializable {

    @ApiModelProperty(value="发生时间时间戳")
    Long event_time;

    @ApiModelProperty(value="事件类型：【DeviceSetMaintain(云机故障进入维护模式)】")
    String event_type;

    @ApiModelProperty(value="用户id")
    String phoneId;

    @ApiModelProperty(value="预警阈值 cpu和运行内存")
    String alarmThreshold;

    @ApiModelProperty(value="重启类型：【（内存告警/cpu告警）】")
    String restartType;
}
