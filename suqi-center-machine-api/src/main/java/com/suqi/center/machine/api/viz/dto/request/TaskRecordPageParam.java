package com.suqi.center.machine.api.viz.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0
 * @date 2023/8/14 18:24
 */
@Data
@ApiModel("推送任务记录分页查询参数")
public class TaskRecordPageParam implements Serializable {

    @ApiModelProperty("更新机器任务表Id")
    private Long fkMcUpdateDeviceTaskId;

    @ApiModelProperty("设备唯一码")
    private String deviceId;

    @ApiModelProperty("公网IP")
    private String externalAddr;

    @ApiModelProperty("内网IP")
    private String internalAddr;

    @ApiModelProperty("状态（-50：删除，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）")
    private Integer status;

    @ApiModelProperty("当前页")
    private long current = 1;

    @ApiModelProperty("每页显示条数，默认 10")
    private long size = 10;

}
