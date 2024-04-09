package com.suqi.center.machine.api.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 *
 * 添加设备系统标签 参数
 * @version 1.0
 * @date 2023/3/29 19:46
 */
@Data
public class SysDeviceLabelParam implements Serializable {

    @ApiModelProperty("设备系统标签Id，添加接口不用传入")
    private List<Long> ids;

    @ApiModelProperty("标签名称，不得超过64byte。")
    private String labelName;

    @ApiModelProperty("状态(50：正常，0：停用，-50：删除)")
    private Integer status;

    @ApiModelProperty("协议（0：自由选择，1：自研协议，2：RTSA）")
    private Integer protocol;
}
