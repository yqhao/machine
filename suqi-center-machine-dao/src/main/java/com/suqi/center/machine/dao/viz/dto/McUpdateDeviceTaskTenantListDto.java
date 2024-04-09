package com.suqi.center.machine.dao.viz.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0
 * @date 2023/8/16 10:50
 */
@Data
public class McUpdateDeviceTaskTenantListDto implements Serializable {

    @ApiModelProperty("租户Id")
    private Long fkTenantId;

    @ApiModelProperty("当前页")
    private long current = 1;

    @ApiModelProperty("每页显示条数，默认 10")
    private long size = 10;

}
