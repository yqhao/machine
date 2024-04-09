package com.suqi.center.machine.api.viz.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0
 * @date 2023/8/22 15:48
 */
@Data
@ApiModel("批量执行任务操作返回数据")
public class BatchTaskResult implements Serializable {

    @ApiModelProperty("设备唯一码")
    private String deviceId;

    @ApiModelProperty("实例Id")
    private String instanceId;

    @ApiModelProperty("失败消息")
    private String failureMessage;

}
