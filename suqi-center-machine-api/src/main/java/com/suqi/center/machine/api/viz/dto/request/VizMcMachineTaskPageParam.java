package com.suqi.center.machine.api.viz.dto.request;

import com.suqi.center.common.dto.PageSet;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @version 1.0
 * @date 2023/10/23 10:16
 */
@Data
@ApiModel("分页查询机器子任务列表 请求参数")
public class VizMcMachineTaskPageParam extends PageSet implements Serializable {


    @ApiModelProperty("任务表记录id")
    @NotNull
    private Long fkVizMcTaskId;

    @ApiModelProperty("实例Id")
    private String instanceId;

    @ApiModelProperty("设备唯一码")
    private String deviceId;

    @ApiModelProperty("状态（-50：失败，0：等待中，10：运行中，50：成功）")
    private Integer status;

}
