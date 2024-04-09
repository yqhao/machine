package com.suqi.center.machine.api.viz.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0
 * @date 2023/8/16 15:48
 */
@Data
@ApiModel("查询主任务列表参数")
public class McUpdateDeviceTaskListParam implements Serializable {

    @ApiModelProperty("主任务名称")
    private String name;
}
