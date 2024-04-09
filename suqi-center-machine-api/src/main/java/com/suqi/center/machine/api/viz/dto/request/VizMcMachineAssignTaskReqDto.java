package com.suqi.center.machine.api.viz.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.suqi.center.common.dto.ValidationGroups;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
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
public class VizMcMachineAssignTaskReqDto implements Serializable {

    private static final long serialVersionUID = 1L;
    @ApiModelProperty("机器基础信息表记录id")
    private Long fkMcMachineId;

    @ApiModelProperty("主键ID")
    @NotNull(groups = ValidationGroups.Update.class, message = "id 主键ID不能为null")
    private Long id;


    @ApiModelProperty("任务批次号")
    @NotEmpty(groups = ValidationGroups.Insert.class, message = "任务批次号不能为空")
    private String batchNo;

    @ApiModelProperty("执行结果")
    private String msg;

    @ApiModelProperty("商户ID")
    private Long tenantId;


    @ApiModelProperty(value = "app许可证id")
    private Long appLicenseId;

    @ApiModelProperty("app许可证类型（1：云应用，2：云手机，3：云游戏） 默认传4")
    private Integer appLicenseType;

    @ApiModelProperty("商户名称")
    @NotEmpty(groups = ValidationGroups.Insert.class, message = "商户名称不能为空")
    private String tenantName;


    @ApiModelProperty("内网ip地址")
    private String externalAddr;


    @ApiModelProperty("外网ip地址")
    private String internalAddr;


    @ApiModelProperty("设备唯一码")
    @NotEmpty(groups = ValidationGroups.Insert.class, message = "设备唯一码不能为空")
    private String deviceId;


    @ApiModelProperty("实例Id")
    private String instanceId;


    @ApiModelProperty("分配状态(10：待分配，20：已分配, 30:分配失败)")
    private Integer assignStatus;


    @ApiModelProperty("操作人用户ID")
    @NotNull(groups = ValidationGroups.Insert.class, message = "操作人用户ID不能为null")
    private Long operateUserId;


    @ApiModelProperty("版本id")
    private Long versionId;


    @ApiModelProperty("创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date queryEndCreateTime;


    @ApiModelProperty("创建人")
    private String createPerson;


    @ApiModelProperty("最后修改时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date queryEndUpdateTime;


    @ApiModelProperty("是否删除")
    private Integer dr;

    @ApiModelProperty("使用有效期开始时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date validStartTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date queryEndValidStartTime;


    @ApiModelProperty("使用有效期结束时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date validEndTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date queryEndValidEndTime;

    @ApiModelProperty("链路ID")

    private String traceId;
}
