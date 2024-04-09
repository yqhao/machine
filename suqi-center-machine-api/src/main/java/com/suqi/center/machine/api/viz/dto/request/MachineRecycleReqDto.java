package com.suqi.center.machine.api.viz.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Auther: chenbinhong
 * @Date: 2023/10/17 16:04
 * @Description: MachineRecycleReqDto
 * @Version 1.0.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Accessors(chain = true)
@ApiModel(value = "MachineRecycleReqDto", description = "MachineRecycleReqDto")
public class MachineRecycleReqDto implements Serializable {

    @ApiModelProperty("机器主键ID集合")
    private Long fkMcMachineId;

    @ApiModelProperty("租户设备表Id")
    private Long fkVizTnMachineId;

    @ApiModelProperty("设备唯一码")
    private String deviceId;

    @ApiModelProperty("租户id 原（fk_member_id）")
    private Long fkTenantId;
    @ApiModelProperty("当前操作人用户ID")
    private Long sysUserId;

    @ApiModelProperty("商户资源池ID【非必填】")
    private Long fkCpTnResourcePoolId;

    @ApiModelProperty("资源池名称【非必填】")
    private String resourcePoolName;
}
