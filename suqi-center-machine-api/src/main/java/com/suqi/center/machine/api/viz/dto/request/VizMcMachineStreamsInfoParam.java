package com.suqi.center.machine.api.viz.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0
 * @date 2023/10/10 18:31
 */
@Data
public class VizMcMachineStreamsInfoParam implements Serializable {

    @ApiModelProperty("机器基础信息表记录id")
    private Long fkMcMachineId;

    @ApiModelProperty("设备唯一码")
    private String deviceId;

    @ApiModelProperty("实例Id")
    private String instanceId;

}
