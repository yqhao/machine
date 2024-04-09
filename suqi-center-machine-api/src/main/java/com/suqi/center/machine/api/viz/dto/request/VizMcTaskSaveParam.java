package com.suqi.center.machine.api.viz.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @version 1.0
 * @date 2023/10/20 17:27
 */
@Data
@ApiModel("保存任务 请求参数")
public class VizMcTaskSaveParam implements Serializable {

    @ApiModelProperty("租户id")
    private Long fkTenantId;

    @ApiModelProperty("任务类型ID")
    @NotNull
    private Long fkVizMcTaskTypeId;

    @ApiModelProperty("任务名称")
    private String name;

    @ApiModelProperty("任务描述")
    private String taskDescription;

    @ApiModelProperty("执行命令")
    private String command;

    @ApiModelProperty("扩展外键ID")
    private Long fkExtendId;

    @ApiModelProperty("操作人员")
    private Long operateSysUserId;
}
