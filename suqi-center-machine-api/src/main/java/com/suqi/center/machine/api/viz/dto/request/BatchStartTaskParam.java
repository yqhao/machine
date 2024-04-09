package com.suqi.center.machine.api.viz.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @version 1.0
 * @date 2023/8/22 14:43
 */
@Data
@ApiModel("批量开始任务参数")
public class BatchStartTaskParam implements Serializable {

    @ApiModelProperty("任务记录id")
    private List<Long> ids;

}