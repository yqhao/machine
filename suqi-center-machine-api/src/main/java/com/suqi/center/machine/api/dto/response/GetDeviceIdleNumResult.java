package com.suqi.center.machine.api.dto.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0
 * @date 2023/7/19 14:56
 */
@Data
public class GetDeviceIdleNumResult implements Serializable {

    @ApiModelProperty("空闲设备数")
    private Integer idleDeviceCount;

}
