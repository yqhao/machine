package com.suqi.center.machine.api.viz.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0
 * @date 2023/10/10 19:11
 */
@Data
public class VizMcMachineStreamsSaveOrUpdateParam implements Serializable {

    @ApiModelProperty("机器基础信息表记录id")
    private Long fkMcMachineId;

    @ApiModelProperty("设备唯一码")
    private String deviceId;

    @ApiModelProperty("实例Id")
    private String instanceId;

    @ApiModelProperty("状态：idle、busy")
    private String status;

    @ApiModelProperty("内网ip")
    private String internalAddress;

    @ApiModelProperty("内网音频端口")
    private Integer internalAport;

    @ApiModelProperty("内网音频端口类型")
    private Integer internalAtype;

    @ApiModelProperty("内网视频端口")
    private Integer internalVport;

    @ApiModelProperty("外网ip")
    private String externalAddress;

    @ApiModelProperty("外网音频端口")
    private Integer externalAport;

    @ApiModelProperty("外网音频端口类型")
    private Integer externalAtype;

    @ApiModelProperty("外网视频端口")
    private Integer externalVport;
}
