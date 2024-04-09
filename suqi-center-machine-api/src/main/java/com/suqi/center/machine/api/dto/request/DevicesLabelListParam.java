package com.suqi.center.machine.api.dto.request;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 分页获取设备标签 参数
 * @version 1.0
 * @date 2023/3/30 15:48
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel("分页获取设备标签参数")
public class DevicesLabelListParam extends Page implements Serializable {

    @ApiModelProperty("设备Id")
    private String deviceId;

    @ApiModelProperty("公网IP")
    private String externalAddr;

    @ApiModelProperty("状态(50：正常，-50：删除)")
    private Integer status;

}
