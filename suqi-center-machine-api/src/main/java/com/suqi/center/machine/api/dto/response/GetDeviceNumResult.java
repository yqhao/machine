package com.suqi.center.machine.api.dto.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0
 * @date 2023/7/19 16:15
 */
@Data
public class GetDeviceNumResult implements Serializable {

    @ApiModelProperty("设备数量")
    private Integer deviceCount;
}
