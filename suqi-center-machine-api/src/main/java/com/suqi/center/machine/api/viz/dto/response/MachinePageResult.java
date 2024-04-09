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
 * @date 2023/8/21 15:42
 */
@Data
@ApiModel("根据条件分页查询设备列表返回参数")
public class MachinePageResult implements Serializable {

    @ApiModelProperty("记录id自动增长")
    private Long id;

    @ApiModelProperty("机房id【区域ID】")
    private Long fkExtCloudRegionId;
    @ApiModelProperty("机房名称【区域名称】")
    private String extCloudRegionName;
    @ApiModelProperty("外网ip地址")
    private String externalAddr;

    @ApiModelProperty("内网ip地址")
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

    @ApiModelProperty("创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    @ApiModelProperty("最后修改时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date lastUpdateTime;

    @ApiModelProperty("物理规格型号")
    private String specificationModel;

    @ApiModelProperty("内存配额，单位为MB")
    private Long memoryLimit;

}
