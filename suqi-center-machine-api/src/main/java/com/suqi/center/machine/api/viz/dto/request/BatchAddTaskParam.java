package com.suqi.center.machine.api.viz.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @version 1.0
 * @date 2023/8/22 14:46
 */
@Data
@ApiModel("批量添加设备参数")
public class BatchAddTaskParam implements Serializable {

    @ApiModelProperty("机器基础信息ID")
    private List<Long> mcMachineIds;

    @ApiModelProperty("任务开始时间（格式为：yyyy-MM-dd HH:mm:ss）")
    private String startTime;

    @ApiModelProperty("更新机器任务Id")
    private Long mcUpdateDeviceTaskId;

}
