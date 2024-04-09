package com.suqi.center.machine.api.viz.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @version 1.0
 * @date 2023/10/21 11:14
 */
@Data
@ApiModel("修改任务 请求参数")
public class VizMcTaskUpdateParam implements Serializable {

    @ApiModelProperty("任务记录ID")
    @NotNull
    private Long taskId;

    @ApiModelProperty("任务名称")
    private String name;

    @ApiModelProperty("任务描述")
    private String taskDescription;

    @ApiModelProperty("操作人员")
    private Long operateSysUserId;

}
