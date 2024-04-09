package com.suqi.center.machine.api.viz.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0
 * @date 2023/10/20 16:01
 */
@Data
@ApiModel("查询任务类型列表 返回数据")
public class VizTaskTypeListResult implements Serializable {

    @ApiModelProperty("记录id自动增长")
    private Long id;

    @ApiModelProperty("任务类型名称")
    private String name;

}
