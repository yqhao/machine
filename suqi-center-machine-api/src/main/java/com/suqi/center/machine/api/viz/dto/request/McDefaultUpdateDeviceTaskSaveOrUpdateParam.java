package com.suqi.center.machine.api.viz.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0
 * @date 2023/8/16 15:06
 */
@Data
@ApiModel("保存或者修改更新机器默认任务参数")
public class McDefaultUpdateDeviceTaskSaveOrUpdateParam implements Serializable {

    @ApiModelProperty("记录id自动增长")
    private Long id;

    @ApiModelProperty("更新机器任务表记录Id")
    private Long fkMcUpdateDeviceTaskId;

    @ApiModelProperty("状态（-50：删除，50：正常）")
    private Integer status;

}
