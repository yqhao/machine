package com.suqi.center.machine.api.viz.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @version 1.0
 * @date 2023/10/20 16:49
 */
@Data
@ApiModel("分页查询任务列表 返回参数")
public class VizMcTaskPageResult implements Serializable {

    @ApiModelProperty("记录id雪花算法")
    private Long id;

    @ApiModelProperty("任务类型ID")
    private Long fkVizMcTaskTypeId;

    @ApiModelProperty("任务名称")
    private String name;

    @ApiModelProperty("任务描述")
    private String taskDescription;

    @ApiModelProperty("执行命令")
    private String command;

    @ApiModelProperty("状态（-50：失败，0：等待中，10：运行中，50：成功）")
    private Integer status;

    @ApiModelProperty("扩展外键ID")
    private Long fkExtendId;

    @ApiModelProperty("操作人员")
    private Long operateSysUserId;

    @ApiModelProperty("创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;

    @ApiModelProperty("修改时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date lastUpdateTime;
}
