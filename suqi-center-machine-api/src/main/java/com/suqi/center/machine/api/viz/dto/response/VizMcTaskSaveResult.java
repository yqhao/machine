package com.suqi.center.machine.api.viz.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0
 * @date 2023/10/20 18:02
 */
@Data
@ApiModel("保存任务 返回参数")
public class VizMcTaskSaveResult implements Serializable {

    @ApiModelProperty("记录id雪花算法")
    private Long id;

    @ApiModelProperty("调用结果")
    private Boolean status;

}
