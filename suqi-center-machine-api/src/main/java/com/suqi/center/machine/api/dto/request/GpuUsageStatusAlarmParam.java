package com.suqi.center.machine.api.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0
 * @date 2023/7/6 12:33
 */
@Data
public class GpuUsageStatusAlarmParam implements Serializable {

    @ApiModelProperty("gpu名称")
    private String gpuIndex;

    @ApiModelProperty("服务器ID")
    private String serverId;

    @ApiModelProperty("当前值")
    private String currentData;


}
