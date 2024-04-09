package com.suqi.center.machine.api.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0
 * @date 2023/9/5 14:29
 */
@Data
@ApiModel("添加或者删减商户设备标签库存 参数")
public class MemberDeviceLabelInventoryAddOrDelParam implements Serializable {

    @ApiModelProperty("会员id")
    private Long fkMemberId;

    @ApiModelProperty("设备系统标签Id")
    private Long fkSysDeviceLabelId;

    @ApiModelProperty("需要增加或者删减的库存")
    private Integer inventory;

}
