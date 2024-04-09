package com.suqi.center.machine.api.viz.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @version 1.0
 * @date 2023/8/14 16:53
 */
@Data
public class McUpdateDeviceTaskSaveOrUpdateParam implements Serializable {

    @ApiModelProperty("记录id自动增长")
    private Long id;

    @ApiModelProperty("云机端软件包记录Id")
    private Long fkMcServerSoftwarePackageId;

    @ApiModelProperty("任务名称")
    private String name;

    @ApiModelProperty("华为镜像Id")
    private String imageId;

    @ApiModelProperty("云机属性")
    private String property;

    @ApiModelProperty("chmod命令")
    private String chmod;

    @ApiModelProperty("命令")
    private String command;

    @ApiModelProperty("状态（-50：删除，50：正常）")
    private Integer status;

    @ApiModelProperty("任务开始时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date startTime;

    @ApiModelProperty("任务开始后超时时间单位（时）（设置为0则不超时）")
    private Integer overtimeTime;

    @ApiModelProperty("等待开始执行超时时间单位（时）（设置为0则不超时）")
    private Integer waitStartOverTime;
}
