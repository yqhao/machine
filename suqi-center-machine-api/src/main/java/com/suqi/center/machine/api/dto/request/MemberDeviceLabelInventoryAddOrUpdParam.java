package com.suqi.center.machine.api.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0
 * @date 2023/9/4 17:11
 */
@Data
@ApiModel("添加或者修改商户设备标签库存 参数")
public class MemberDeviceLabelInventoryAddOrUpdParam implements Serializable {

    @ApiModelProperty("商户设备标签库存ID")
    private Long id;

    @ApiModelProperty("会员id")
    private Long fkMemberId;

    @ApiModelProperty("设备系统标签Id")
    private Long fkSysDeviceLabelId;

    @ApiModelProperty("总库存")
    private Integer productStock;
}
