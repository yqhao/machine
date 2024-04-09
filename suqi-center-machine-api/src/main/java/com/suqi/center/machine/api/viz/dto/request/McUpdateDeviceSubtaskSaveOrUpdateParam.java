package com.suqi.center.machine.api.viz.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0
 * @date 2023/8/14 17:47
 */
@Data
@ApiModel("保存或者修改子任务参数")
public class McUpdateDeviceSubtaskSaveOrUpdateParam implements Serializable {

    @ApiModelProperty("记录id自动增长")
    private Long id;

    @ApiModelProperty("更新机器任务表Id")
    private Long fkMcUpdateDeviceTaskId;

    @ApiModelProperty("1：重置机器并安装服务")
    private Integer type;

    @ApiModelProperty("执行顺序")
    private Integer executionFlow;

    @ApiModelProperty("状态（-50：删除，50：正常）")
    private Integer status;
}
