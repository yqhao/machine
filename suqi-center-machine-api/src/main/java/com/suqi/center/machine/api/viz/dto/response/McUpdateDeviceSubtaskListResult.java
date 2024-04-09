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
 * @date 2023/8/14 17:10
 */
@Data
@ApiModel("查询子任务列表返回")
public class McUpdateDeviceSubtaskListResult implements Serializable {

    @ApiModelProperty("记录id自动增长")
    private Long id;

    @ApiModelProperty("更新机器任务表Id")
    private Long fkMcUpdateDeviceTaskId;

    @ApiModelProperty("1：重置机器并安装服务")
    private Integer type;

    @ApiModelProperty("执行顺序")
    private Integer executionFlow;

    @ApiModelProperty("创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;

    @ApiModelProperty("修改时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date lastUpdateTime;
}
