package com.suqi.center.machine.api.viz.dto.mq;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0
 * @date 2023/9/11 17:52
 */
@Data
public class SubtaskCompletionNotification implements Serializable {

    @ApiModelProperty("机器更新任务记录表Id")
    private Long fkMcUpdateDeviceTaskRecordId;

    @ApiModelProperty("更新机器子任务表Id")
    private Long fkMcUpdateDeviceSubtaskId;

    @ApiModelProperty("执行顺序")
    private Integer executionFlow;

    @ApiModelProperty("状态：-50：主任务执行失败，0：执行下一个子任务，，50：主任务执行成功")
    private Integer status;
}
