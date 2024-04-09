package com.suqi.center.machine.api.viz.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0
 * @date 2023/10/11 12:10
 */
@Data
public class MachineUpdateParam implements Serializable {

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

    @ApiModelProperty("是否存在root权限(1；是，0：否)")
    private Integer rootAccess;

    @ApiModelProperty("设备状态(-50：删除，0：暂停使用，50：正常)")
    private Integer status;

}
