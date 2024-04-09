package com.suqi.center.machine.api.viz.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0
 * @date 2023/10/24 14:53
 */
@Data
@ApiModel("检查当前任务是否还存在等待中或者执行中的任务 请求参数")
public class VizMcTaskScheduleIncompleteParam implements Serializable {

    @ApiModelProperty("任务记录ID")
    private Long vizMcTaskId;

}
