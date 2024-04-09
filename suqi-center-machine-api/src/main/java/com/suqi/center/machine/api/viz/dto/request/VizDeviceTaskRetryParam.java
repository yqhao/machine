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
 * @date 2023/10/21 11:25
 */
@Data
@ApiModel("重试任务机器 请求参数")
public class VizDeviceTaskRetryParam implements Serializable {

    @NotNull
    @ApiModelProperty("任务表记录id")
    private Long fkVizMcTaskId;

    @NotEmpty
    @ApiModelProperty("机器任务记录ID")
    private List<Long> deviceTaskIds;

    @ApiModelProperty("操作人员")
    private Long operateSysUserId;

}
