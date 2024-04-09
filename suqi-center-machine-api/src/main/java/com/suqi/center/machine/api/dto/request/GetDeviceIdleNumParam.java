package com.suqi.center.machine.api.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0
 * @date 2023/7/19 14:58
 */
@Data
public class GetDeviceIdleNumParam implements Serializable {

    @ApiModelProperty("租户编号")
    private Long tenantId;

    @ApiModelProperty("设备标签Id")
    private Long deviceLabelId;

}
