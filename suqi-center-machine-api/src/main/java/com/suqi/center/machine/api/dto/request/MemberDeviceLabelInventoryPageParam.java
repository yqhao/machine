package com.suqi.center.machine.api.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0
 * @date 2023/9/4 16:07
 */
@Data
@ApiModel("分页查询商户设备标签库存 参数")
public class MemberDeviceLabelInventoryPageParam implements Serializable {

    @ApiModelProperty("会员id")
    private Long fkMemberId;

    @ApiModelProperty("设备系统标签Id")
    private Long fkSysDeviceLabelId;

    @ApiModelProperty("当前页数")
    private long current = 1;

    @ApiModelProperty("每页条数")
    private long size = 10;

}
