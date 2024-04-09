package com.suqi.center.machine.dao.viz.dto;

import com.suqi.center.common.dto.PageSet;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @version 1.0
 * @date 2023/8/21 15:56
 */
@Data
public class MachinePageDto extends PageSet {

    @ApiModelProperty("租户编号")
    private Long tenantId;

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

    @ApiModelProperty("供应商类型[1:huawei 2:tencent 3: baidu 4: etc]")
    private Integer supplierType;

    @ApiModelProperty("是否存在root权限(1；是，0：否)")
    private Integer rootAccess;

    @ApiModelProperty("设备状态(-50：删除，0：暂停使用，50：正常)")
    private Integer status;

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


}
