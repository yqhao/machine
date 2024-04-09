package com.suqi.center.machine.biz.viz.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0
 * @date 2023/9/11 15:38
 */
@Data
public class SubtaskResult implements Serializable {

    @ApiModelProperty("状态：-50：失败，0：运行中，-50：成功")
    private Integer status;

    @ApiModelProperty("返回消息")
    String message;

    @ApiModelProperty("错误消息")
    String errorMsg;

    @ApiModelProperty("各平台错误码")
    String errorCode;
}
