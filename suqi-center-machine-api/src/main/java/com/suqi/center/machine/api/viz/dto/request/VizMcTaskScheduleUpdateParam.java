package com.suqi.center.machine.api.viz.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0
 * @date 2023/10/24 14:31
 */
@Data
@ApiModel("定时任务修改任务 请求参数")
public class VizMcTaskScheduleUpdateParam implements Serializable {

    @ApiModelProperty("记录id雪花算法")
    private Long id;

    @ApiModelProperty("状态（-50：失败，0：等待中，10：运行中，50：成功）")
    private Integer status;

}
