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
 * 【可视化】机器回收任务表
 * </p>
 *
 * @author Administrator
 * @since 2023-10-17
 */
@Data
@ApiModel(value = "VizMcMachineRecycleTaskEo对象", description = "【可视化】机器回收任务表")
public class VizMcMachineRecycleTaskReqDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键ID")
    @NotNull(groups = ValidationGroups.Update.class,message = "id 主键ID不能为null")
    private Long id;


    @ApiModelProperty("任务批次号")
    @NotEmpty(groups = ValidationGroups.Insert.class,message = "任务批次号不能为空")
    private String batchNo;


    @ApiModelProperty("商户ID")
    @NotNull(groups = ValidationGroups.Insert.class,message = "商户ID不能为null")
    private Long tenantId;


    @ApiModelProperty("商户名称")
    @NotEmpty(groups = ValidationGroups.Insert.class,message = "商户名称不能为空")
    private String tenantName;


    @ApiModelProperty("内网ip地址")
    private String externalAddr;


    @ApiModelProperty("外网ip地址")
    private String internalAddr;


    @ApiModelProperty("机器基础信息表记录id")
    @NotNull(groups = ValidationGroups.Insert.class,message = "机器基础信息表记录id不能为null")
    private Long fkMcMachineId;


    @ApiModelProperty("租户设备表记录id")
    @NotNull(groups = ValidationGroups.Insert.class,message = "租户设备表记录id不能为null")
    private Long fkVizTnMachineId;


    @ApiModelProperty("设备唯一码")
    @NotEmpty(groups = ValidationGroups.Insert.class,message = "设备唯一码不能为空")
    private String deviceId;


    @ApiModelProperty("实例Id")
    private String instanceId;


    @ApiModelProperty("回收状态(10：待回收，20：已回收, 30:回收失败)")
    private Integer recycleStatus;


    @ApiModelProperty("操作人用户ID")
    @NotNull(groups = ValidationGroups.Insert.class,message = "操作人用户ID不能为null")
    private Long operateUserId;


    @ApiModelProperty("回收时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date recycleTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date queryEndRecycleTime;


    @ApiModelProperty("版本id")
    private Long versionId;


    @ApiModelProperty("创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date queryEndCreateTime;


    @ApiModelProperty("创建人")
    private String createPerson;


    @ApiModelProperty("最后修改时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date updateTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date queryEndUpdateTime;


    @ApiModelProperty("是否删除")
    private Integer dr;


    @ApiModelProperty("执行结果")
    private String msg;


    @ApiModelProperty("链路ID")
    private String traceId;


}
