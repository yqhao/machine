package com.suqi.center.machine.dao.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 分页获取设备标签 Dao 层 DTO
 * @version 1.0
 * @date 2023/3/30 16:48
 */
@Data
public class DevicesLabelListDto implements Serializable {

    @ApiModelProperty("设备Id")
    private String deviceId;

    @ApiModelProperty("公网IP")
    private String externalAddr;

    @ApiModelProperty("状态(50：正常，-50：删除)")
    private Integer status;

}
