package com.suqi.center.machine.api.dto.reponse;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 设备系统标签列表
 *
 * @version 1.0
 * @date 2023/3/29 19:21
 */
@Data
public class SysDeviceLabelListResult implements Serializable {

    @ApiModelProperty("标签Id")
    private Long id;

    @ApiModelProperty("标签名称，不得超过64byte。")
    private String labelName;

    @ApiModelProperty("状态(50：正常，0：停用，-50：删除)")
    private Integer status;

    @ApiModelProperty("协议（0：自由选择，1：自研协议，2：RTSA）")
    private Integer protocol;

    @ApiModelProperty("创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    @ApiModelProperty("修改时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date lastUpdateTime;
}
