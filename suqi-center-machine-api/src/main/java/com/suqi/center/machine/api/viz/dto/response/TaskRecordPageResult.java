package com.suqi.center.machine.api.viz.dto.response;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @version 1.0
 * @date 2023/8/14 18:38
 */
@Data
@ApiModel("分页查询推送记录返回")
public class TaskRecordPageResult implements Serializable {

    @ApiModelProperty("记录id自动增长")
    private Long id;

    @ApiModelProperty("当前执行子任务类型（1：重置机器并安装服务）")
    private Integer mcUpdateDeviceSubtaskType;

    @ApiModelProperty("任务类型（1：系统任务，2：用户任务）")
    private Integer type;

    @ApiModelProperty("设备唯一码")
    private String deviceId;

    @ApiModelProperty("公网IP")
    private String externalAddr;

    @ApiModelProperty("内网IP")
    private String internalAddr;

    @ApiModelProperty("设备实例Id")
    private String instanceId;

    @ApiModelProperty("执行任务消息")
    private String executeMsg;

    @ApiModelProperty("任务开始执行时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date taskStartTime;

    @ApiModelProperty("等待执行开始超时时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date waitOverStartDate;

    @ApiModelProperty("任务开始时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date startTime;

    @ApiModelProperty("状态（-50：删除，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）")
    @TableField("status")
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
