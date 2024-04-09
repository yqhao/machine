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
 * @date 2023/8/15 12:08
 */
@Data
@ApiModel("查询推送记录子任务返回结果")
public class TaskRecordSubtaskResult implements Serializable {

    @ApiModelProperty("记录id自动增长")
    private Long id;

    @ApiModelProperty("机器更新任务记录表Id")
    private Long fkMcUpdateDeviceTaskRecordId;

    @ApiModelProperty("更新机器子任务表Id")
    private Long fkMcUpdateDeviceSubtaskId;

    @ApiModelProperty("1：重置机器并安装服务")
    private Integer type;

    @ApiModelProperty("执行顺序")
    private Integer executionFlow;

    @ApiModelProperty("状态（-50：删除，-10：任务执行失败，10：任务执行中，50：正常）")
    private Integer status;

    @ApiModelProperty("创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;

    @ApiModelProperty("修改时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date lastUpdateTime;
}
