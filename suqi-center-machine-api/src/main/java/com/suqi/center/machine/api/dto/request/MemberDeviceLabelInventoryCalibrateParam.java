package com.suqi.center.machine.api.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0
 * @date 2023/9/7 11:41
 */
@Data
@ApiModel("校准当前商户设备标签库存 参数")
public class MemberDeviceLabelInventoryCalibrateParam implements Serializable {

    @ApiModelProperty("商户设备标签库存id")
    private Long fkYunMemberDeviceLabelInventoryId;
}
