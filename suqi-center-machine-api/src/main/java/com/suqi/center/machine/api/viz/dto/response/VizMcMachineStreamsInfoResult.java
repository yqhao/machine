package com.suqi.center.machine.api.viz.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @version 1.0
 * @date 2023/10/10 18:30
 */
@Data
public class VizMcMachineStreamsInfoResult implements Serializable {

    private Long id;

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

    @ApiModelProperty("创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;

    @ApiModelProperty("最后修改时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date lastUpdateTime;
}
