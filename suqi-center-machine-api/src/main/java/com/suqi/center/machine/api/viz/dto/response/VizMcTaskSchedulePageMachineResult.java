package com.suqi.center.machine.api.viz.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @version 1.0
 * @date 2023/10/24 14:28
 */
@Data
@ApiModel("定时任务分页查询需要执行的云机任务 返回参数")
public class VizMcTaskSchedulePageMachineResult implements Serializable {


    @ApiModelProperty("记录id雪花算法")
    private Long id;

    @ApiModelProperty("任务表记录id")
    private Long fkVizMcTaskId;

    @ApiModelProperty("机器基础信息表记录id")
    private Long fkMcMachineId;

    @ApiModelProperty("任务表Id")
    private String instanceId;

    @ApiModelProperty("设备唯一码")
    private String deviceId;

    @ApiModelProperty("执行任务消息")
    private String executeMsg;

    @ApiModelProperty("执行任务ID")
    private String jobId;

    @ApiModelProperty("任务处理开始时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date beginTime;

    @ApiModelProperty("任务处理结束时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date endTime;

    @ApiModelProperty("状态（-50：失败，0：等待中，10：运行中，50：成功）")
    private Integer status;

    @ApiModelProperty("操作人员")
    private Long operateSysUserId;

    @ApiModelProperty("版本Id")
    private Long versionId;

    @ApiModelProperty("创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;

    @ApiModelProperty("修改时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date lastUpdateTime;
}
