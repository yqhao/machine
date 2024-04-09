package com.suqi.center.machine.api.viz.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * @version 1.0
 * @date 2023/10/20 17:55
 */
@Data
@ApiModel("保存机器任务 请求参数")
public class VizDeviceTaskSaveParam implements Serializable {

    @ApiModelProperty("任务表记录id")
    @NotNull
    private Long fkVizMcTaskId;

    @ApiModelProperty("操作人员")
    private Long operateSysUserId;

    @ApiModelProperty("机器列表")
    @NotEmpty
    private List<DeviceTaskSaveParam> deviceTaskSaveParamList;

    @Data
    @ApiModel("机器列表")
    public static class DeviceTaskSaveParam{

        @ApiModelProperty("机器基础信息表记录id")
        private Long fkMcMachineId;

        @ApiModelProperty("实例Id")
        private String instanceId;

        @ApiModelProperty("设备唯一码")
        private String deviceId;
    }

}
