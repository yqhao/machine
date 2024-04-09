package com.suqi.center.machine.dao.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 华为smn消息记录
 * </p>
 *
 * @author PC001
 * @since 2023-04-19
 */
@Data
@TableName("mc_smn_record")
@ApiModel(value = "McSmnRecord对象", description = "华为smn消息记录")
public class McSmnRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("message_id")
    private String messageId;

    @TableField("topic_urn")
    private String topicUrn;

    @TableField("msg")
    private String msg;

    @ApiModelProperty("处理状态（0：待处理，-1：处理失败，1：处理中，2：处理成功")
    @TableField("process_status")
    private Integer processStatus;

    @ApiModelProperty("重试次数")
    @TableField("retry_count")
    private Long retryCount;

    @TableField("create_time")
    private Date createTime;

    @TableField("last_update_time")
    private Date lastUpdateTime;

    @TableField("version_id")
    private Long versionId;

    @TableField("fail_message")
    private String failMessage;
}
