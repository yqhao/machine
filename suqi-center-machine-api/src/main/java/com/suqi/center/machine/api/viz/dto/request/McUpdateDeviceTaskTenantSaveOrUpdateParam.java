package com.suqi.center.machine.api.viz.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0
 * @date 2023/8/16 11:12
 */
@Data
@ApiModel("保存或者修改租户更新任务参数")
public class McUpdateDeviceTaskTenantSaveOrUpdateParam implements Serializable {

    @ApiModelProperty("记录id自动增长")
    private Long id;

    @ApiModelProperty("更新机器任务表记录Id")
    private Long fkMcUpdateDeviceTaskId;

    @ApiModelProperty("租户Id")
    private Long fkTenantId;

    @ApiModelProperty("状态（-50：删除，50：正常）")
    private Integer status;

}
