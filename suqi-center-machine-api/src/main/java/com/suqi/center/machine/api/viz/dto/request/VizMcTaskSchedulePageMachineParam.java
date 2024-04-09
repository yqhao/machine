package com.suqi.center.machine.api.viz.dto.request;

import com.suqi.center.common.dto.PageSet;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;

/**
 * @version 1.0
 * @date 2023/10/24 12:19
 */
@Data
@ApiModel("定时任务分页查询需要执行的云机任务 请求参数")
public class VizMcTaskSchedulePageMachineParam extends PageSet implements Serializable {

    @ApiModelProperty("任务ID")
    private Long vizMcTaskId;

    @ApiModelProperty("需要查询的状态（-50：失败，0：等待中，10：运行中，50：成功）")
    @NotEmpty
    private List<Integer> status;
}
