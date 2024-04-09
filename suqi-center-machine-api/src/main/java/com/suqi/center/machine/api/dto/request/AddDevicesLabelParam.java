package com.suqi.center.machine.api.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 批量添加设备标签
 *
 * @version 1.0
 * @date 2023/3/30 16:07
 */
@Data
@ApiModel("批量添加设备标签参数")
public class AddDevicesLabelParam implements Serializable {

    @ApiModelProperty("设备Id")
    private List<String> deviceIds;

    @ApiModelProperty("公网ip(如果传入该参数则deviceIds无效)")
    private List<String> externalAddrs;

    @ApiModelProperty("标签Id")
    private Long fkSysDeviceLabelId;

    @ApiModelProperty("状态(50：正常，-50：删除)")
    private Integer status;

}
