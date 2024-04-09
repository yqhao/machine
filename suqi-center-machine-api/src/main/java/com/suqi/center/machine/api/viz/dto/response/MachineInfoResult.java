package com.suqi.center.machine.api.viz.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @version 1.0
 * @date 2023/10/10 17:48
 */
@Data
public class MachineInfoResult implements Serializable {

    @ApiModelProperty("记录id自动增长")
    private Long id;

    @ApiModelProperty("机房记录id")
    private Long fkExtCloudRegionId;

    @ApiModelProperty("内网ip地址")
    private String externalAddr;

    @ApiModelProperty("外网ip地址")
    private String internalAddr;

    @ApiModelProperty("设备唯一码")
    private String deviceId;

    @ApiModelProperty("实例Id")
    private String instanceId;

    @ApiModelProperty("设备唯一码macAddr")
    private String macAddr;

    @ApiModelProperty("云机端软件包版本")
    private String serviceSoftwarePackageVersion;

    @ApiModelProperty("设备型号")
    private String chipModel;

    @ApiModelProperty("系统版本")
    private String osVersion;

    @ApiModelProperty("销售状态(0：未售，1：已售)")
    private Integer salesStatus;

    @ApiModelProperty("3: 打开日志，127: 关闭日志")
    private Integer logLevel;

    @ApiModelProperty("日志包名")
    private String logPkg;

    @ApiModelProperty("供应商类型[1:huawei  2:tencent  3: baidu  4: etc]")
    private Integer supplierType;

    @ApiModelProperty("设备状态(-50：删除，0：暂停使用，50：正常)")
    private Integer status;

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

    @ApiModelProperty("物理规格型号")
    private String specificationModel;

    @ApiModelProperty("内存配额，单位为MB")
    private Long memoryLimit;

}
