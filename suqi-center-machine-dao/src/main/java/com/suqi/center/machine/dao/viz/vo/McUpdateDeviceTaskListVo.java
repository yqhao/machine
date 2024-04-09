package com.suqi.center.machine.dao.viz.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @version 1.0
 * @date 2023/8/11 11:44
 */
@Data
@ApiModel("查询主任务列表返回数据")
public class McUpdateDeviceTaskListVo implements Serializable {

    @ApiModelProperty("记录id自动增长")
    private Long id;

    @ApiModelProperty("云机端软件包记录Id")
    private Long fkMcServerSoftwarePackageId;

    @ApiModelProperty("主任务名称")
    private String name;

    @ApiModelProperty("供应商类型（1：华为，2：腾讯，3：百度）")
    private Integer supplierType;

    @ApiModelProperty("云机端软件包名称")
    private String serviceSoftwarePackageName;

    @ApiModelProperty("云机端软件包类型名称")
    private String serviceSoftwarePackageTypeName;

    @ApiModelProperty("任务开始时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date startTime;

    @ApiModelProperty("任务开始后超时时间单位（时）（设置为0则不超时）")
    private Integer overtimeTime;

    @ApiModelProperty("等待开始执行超时时间单位（时）（设置为0则不超时）")
    private Integer waitStartOverTime;

    @ApiModelProperty("创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;

    @ApiModelProperty("修改时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date lastUpdateTime;

}
