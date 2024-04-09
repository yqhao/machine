package com.suqi.center.machine.api.viz.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0
 * @date 2023/9/12 15:03
 */
@Data
@ApiModel("修改当前主任务执行状态 参数")
public class ChangeMainStatusParam implements Serializable {

    @ApiModelProperty("机器更新任务记录表Id")
    private Long fkMcUpdateDeviceTaskRecordId;

    @ApiModelProperty("状态：-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常")
    private Integer status;
}
