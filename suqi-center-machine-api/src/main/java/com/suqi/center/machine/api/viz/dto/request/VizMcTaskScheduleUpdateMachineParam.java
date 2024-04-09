package com.suqi.center.machine.api.viz.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @version 1.0
 * @date 2023/10/24 14:33
 */
@Data
@ApiModel("定时任务修改云机任务 请求参数")
public class VizMcTaskScheduleUpdateMachineParam implements Serializable {

    @ApiModelProperty("记录id雪花算法")
    private Long id;

    @ApiModelProperty("任务ID")
    private Long vizMcTaskId;

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


}
