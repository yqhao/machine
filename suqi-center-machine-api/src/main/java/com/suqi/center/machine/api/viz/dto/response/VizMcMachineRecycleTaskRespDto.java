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
 * 【可视化】机器回收任务表
 * </p>
 *
 * @author Administrator
 * @since 2023-10-17
 */
@Data
@ApiModel(value = "VizMcMachineRecycleTaskEo对象", description = "【可视化】机器回收任务表")
public class VizMcMachineRecycleTaskRespDto implements Serializable {

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
    @ApiModelProperty("租户设备表记录id")

    private Long fkVizTnMachineId;
    @ApiModelProperty("设备唯一码")

    private String deviceId;
    @ApiModelProperty("实例Id")

    private String instanceId;
    @ApiModelProperty("回收状态(10：待回收，20：已回收, 30:回收失败)")

    private Integer recycleStatus;
    @ApiModelProperty("操作人用户ID")

    private Long operateUserId;
    @ApiModelProperty("回收时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date recycleTime;
    @ApiModelProperty("版本id")

    private Long versionId;
    @ApiModelProperty("创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;
    @ApiModelProperty("创建人")

    private String createPerson;
    @ApiModelProperty("最后修改时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date updateTime;
    @ApiModelProperty("是否删除")

    private Boolean dr;
    @ApiModelProperty("执行结果")

    private String msg;
    @ApiModelProperty("链路ID")

    private String traceId;

    @ApiModelProperty("商户资源池ID【非必填】")
    private Long fkCpTnResourcePoolId;

    @ApiModelProperty("资源池名称【非必填】")
    private String resourcePoolName;
}
