package com.suqi.center.machine.api.viz.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @version 1.0
 * @date 2023/10/11 12:10
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Accessors(chain = true)
@ApiModel(value = "MachineSaleStatusReqDto", description = "MachineSaleStatusReqDto")
public class MachineSaleStatusReqDto implements Serializable {
    @ApiModelProperty("机器分配任务表的主键ID")
    private Long taskId;

    @ApiModelProperty("全量未售机器分配按钮 传递true 就会忽略【前端传入的machineList集合参数】")
    private Boolean fullUnSoldFlag = false;

    @ApiModelProperty("机器主键ID集合")
    private Set<Long> fkMcMachineIds = new HashSet<>();

    @ApiModelProperty("销售状态(0：未售，1：已售)")
    private Integer salesStatus;

    @ApiModelProperty("租户id")
    private Long fkTenantId;
    @ApiModelProperty("当前操作人用户ID")
    private Long sysUserId;

    @ApiModelProperty("使用有效期开始时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date validStartTime;

    @ApiModelProperty("使用有效期结束时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date validEndTime;

    @ApiModelProperty("app许可证id")
    private Long appLicenseId;

    @ApiModelProperty("app许可证类型（1：云应用，2：云手机，3：云游戏）")
    private Integer appLicenseType;

    @ApiModelProperty("分配状态(10：待分配，20：已分配, 30:分配失败)")
    private Integer assignStatus;

    @ApiModelProperty("商户资源池ID【非必填】")
    private Long fkCpTnResourcePoolId;

    @ApiModelProperty("资源池名称【非必填】")
    private String resourcePoolName;
    private String msg;


    @ApiModelProperty("物理规格型号")
    private String specificationModel;
}
