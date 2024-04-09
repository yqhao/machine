package com.suqi.center.machine.api.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 华为smn消息记录参数
 * @version 1.0
 * @date 2023/4/19 16:24
 */
@Data
@ApiModel("华为smn消息记录参数")
public class McSmnRecordParam implements Serializable {

    @ApiModelProperty("消息Id")
    private String messageId;

    @ApiModelProperty("主题")
    private String topicUrn;

    @ApiModelProperty("消息内容")
    private String msg;

    @ApiModelProperty("处理状态（0：待处理，-1：处理失败，1：处理中，2：处理成功")
    private Integer processStatus;

    @ApiModelProperty("重试次数")
    private Long retryCount;

    @ApiModelProperty("失败消息")
    private String failMessage;
}
