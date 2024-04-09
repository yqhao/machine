package com.suqi.center.machine.api.viz.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @version 1.0
 * @date 2023/10/10 18:04
 */
@Data
public class MachineStatusInfoResult implements Serializable {

    @ApiModelProperty("记录id自动增长")
    private Long id;

    @ApiModelProperty("机器基础信息表记录id")
    private Long fkMcMachineId;

    @ApiModelProperty("设备唯一码")
    private String deviceId;

    @ApiModelProperty("实例Id")
    private String instanceId;

    @ApiModelProperty("运行状态(0：空闲，1：运行中)")
    private Integer runningStatus;

    @ApiModelProperty("健康状态(1：在线，0:故障)")
    private Integer healthStatus;

    @ApiModelProperty("streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）")
    private Integer streamingStatus;

    @ApiModelProperty("维护模式状态（0：非维护模式，1：维护模式）")
    private Integer maintStatus;

    @ApiModelProperty("是否重置中（0：未重置，1：重置中）")
    private Integer isReseting;

    @ApiModelProperty("是否在保存app用户数据(0：否，1：是)")
    private Integer isUserSave;

    @ApiModelProperty("是升级中（0：未升级，1：升级中）")
    private Integer isOtaUpgrade;

    @ApiModelProperty("挂机状态(0：未挂机，1：挂机中)")
    private Integer hangUpStatus;

    @ApiModelProperty("重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）")
    private Integer restartStatus;

    @ApiModelProperty("是否存在root权限(1；是，0：否)")
    private Integer rootAccess;

    @ApiModelProperty("版本id")
    private Long versionId;

    @ApiModelProperty("创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;

    @ApiModelProperty("最后修改时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date lastUpdateTime;

}
