package com.suqi.center.machine.api.viz.dto.request;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0
 * @date 2023/9/12 11:45
 */
@Data
@ApiModel("执行下一个子任务 参数")
public class ExecuteTheNextSubtaskParam implements Serializable {

    @ApiModelProperty("机器更新任务记录表Id")
    @TableField("fk_mc_update_device_task_record_id")
    private Long fkMcUpdateDeviceTaskRecordId;

    @ApiModelProperty("更新机器子任务表Id")
    @TableField("fk_mc_update_device_subtask_id")
    private Long fkMcUpdateDeviceSubtaskId;

    @ApiModelProperty("执行顺序")
    @TableField("execution_flow")
    private Integer executionFlow;
}
