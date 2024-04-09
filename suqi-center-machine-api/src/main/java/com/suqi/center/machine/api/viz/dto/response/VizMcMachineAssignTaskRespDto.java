package com.suqi.center.machine.api.viz.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 【可视化】机器分配任务表
 * </p>
 *
 * @author Administrator
 * @since 2023-10-16
 */
@Data
@ApiModel(value = "VizMcMachineAssignTask对象", description = "【可视化】机器分配任务表")
public class VizMcMachineAssignTaskRespDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键ID")
    private Long id;

    @ApiModelProperty("任务批次号")
    private String batchNo;

    @ApiModelProperty("商户ID")
    private Long tenantId;

    @ApiModelProperty("商户名称")
    private String tenantName;

    @ApiModelProperty("内网ip地址")
    private String externalAddr;

    @ApiModelProperty("外网ip地址")
    private String internalAddr;

    @ApiModelProperty("机器基础信息表记录id")
    private Long fkMcMachineId;

    @ApiModelProperty("设备唯一码")
    private String deviceId;

    @ApiModelProperty("实例Id")
    private String instanceId;

    @ApiModelProperty("分配状态(10：待分配，20：已分配, 30:分配失败)")
    private Integer assignStatus;

    @ApiModelProperty("操作人用户ID")
    private Long operateUserId;

    @ApiModelProperty("使用有效期开始时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date validStartTime;

    @ApiModelProperty("使用有效期结束时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date validEndTime;

    @ApiModelProperty("版本id")
    private Long versionId;


    @ApiModelProperty("创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    @ApiModelProperty("创建人")
    private String createPerson;

    @ApiModelProperty("最后修改时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;
    @ApiModelProperty("是否删除")
    private Boolean dr;

    @ApiModelProperty("执行结果")
    private String msg;

    @ApiModelProperty("app许可证id")
    private Long appLicenseId;

    @ApiModelProperty("app许可证类型（1：云应用，2：云手机，3：云游戏）")
    private Integer appLicenseType;

    @ApiModelProperty("机房id")
    private Long fkExtCloudRegionId;
    @ApiModelProperty("机房名称【区域名称】")
    private String extCloudRegionName;
    @ApiModelProperty("供应商类型[1:huawei  2:tencent  3: baidu  4: etc]")
    private Integer supplierType;

    @ApiModelProperty("链路ID")
    private String traceId;

    @ApiModelProperty("商户资源池ID【非必填】")
    private Long fkCpTnResourcePoolId;

    @ApiModelProperty("资源池名称【非必填】")
    private String resourcePoolName;

    @ApiModelProperty("物理规格型号")
    private String specificationModel;
    @ApiModelProperty("内存配额，单位为MB")
    private Long memoryLimit;
}
