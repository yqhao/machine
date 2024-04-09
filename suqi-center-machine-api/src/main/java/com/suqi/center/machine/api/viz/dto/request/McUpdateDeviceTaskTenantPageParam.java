package com.suqi.center.machine.api.viz.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0
 * @date 2023/8/16 10:44
 */
@Data
@ApiModel("分页查询租户更新任务列表参数")
public class McUpdateDeviceTaskTenantPageParam implements Serializable {

    @ApiModelProperty("租户Id")
    private Long fkTenantId;

    @ApiModelProperty("当前页")
    private long current = 1;

    @ApiModelProperty("每页显示条数，默认 10")
    private long size = 10;
}
