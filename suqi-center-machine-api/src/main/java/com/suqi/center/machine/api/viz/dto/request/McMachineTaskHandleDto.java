package com.suqi.center.machine.api.viz.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @Auther: chenbinhong
 * @Date: 2023/10/16 16:13
 * @Description: McMachineAssignMqDto
 * @Version 1.0.0
 */
@Data
public class McMachineTaskHandleDto implements Serializable {

    @ApiModelProperty("机器任务表的主键ID")
    private Long taskId;

    @ApiModelProperty("设备id")
    private String deviceId;

    @ApiModelProperty("任务批次号")
    private String batchNo;

    public McMachineTaskHandleDto() {
    }

    public McMachineTaskHandleDto(String batchNo, Long taskId, String deviceId) {
        this.taskId = taskId;
        this.deviceId = deviceId;
        this.batchNo = batchNo;
    }
}
