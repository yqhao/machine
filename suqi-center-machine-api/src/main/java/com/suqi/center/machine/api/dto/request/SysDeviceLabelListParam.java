package com.suqi.center.machine.api.dto.request;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 获取设备系统标签 参数
 * @version 1.0
 * @date 2023/3/29 19:18
 */
@Data
public class SysDeviceLabelListParam extends Page implements Serializable {

    @ApiModelProperty("标签名称，不得超过64byte。")
    private String labelName;

    @ApiModelProperty("状态(50：正常，0：停用，-50：删除)")
    private Integer status;

}
