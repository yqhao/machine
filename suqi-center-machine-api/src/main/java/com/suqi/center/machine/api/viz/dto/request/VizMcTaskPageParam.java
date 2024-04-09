package com.suqi.center.machine.api.viz.dto.request;

import com.baomidou.mybatisplus.annotation.TableField;
import com.suqi.center.common.dto.PageSet;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0
 * @date 2023/10/20 16:50
 */
@Data
@ApiModel("分页查询任务列表 请求参数")
public class VizMcTaskPageParam extends PageSet implements Serializable {

    @ApiModelProperty("记录id雪花算法")
    private Long id;

    @ApiModelProperty("租户id")
    private Long fkTenantId;

    @ApiModelProperty("任务类型ID")
    private Long fkVizMcTaskTypeId;

    @ApiModelProperty("任务名称")
    private String name;

    @ApiModelProperty("扩展外键ID")
    private Long fkExtendId;

    @ApiModelProperty("状态（-50：失败，0：等待中，10：运行中，50：成功）")
    @TableField("status")
    private Integer status;

}
