package com.suqi.center.machine.api.viz.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0
 * @date 2023/10/24 14:34
 */
@Data
@ApiModel("定时任务根据任务ID获取任务 请求参数")
public class VizMcTaskScheduleGetTaskParam implements Serializable {

    @ApiModelProperty("记录id雪花算法")
    private Long id;

    @ApiModelProperty("任务ID")
    private Long vizMcTaskId;

}
