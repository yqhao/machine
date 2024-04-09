package com.suqi.center.machine.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 云机告警规则模板
 * </p>
 *
 * @author PC001
 * @since 2023-04-20
 */
@Data
@TableName("mc_cloud_machine_alarm_rule_template")
@ApiModel(value = "McCloudMachineAlarmRuleTemplate对象", description = "云机告警规则模板")
public class McCloudMachineAlarmRuleTemplate implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("标题")
    @TableField("title")
    private String title;

    @ApiModelProperty("类型（1：云机空间不足告警、2：gpu 显存告警）")
    @TableField("type")
    private Integer type;

    @ApiModelProperty("告警最小值")
    @TableField("minimum")
    private Integer minimum;

    @ApiModelProperty("告警最大值")
    @TableField("maximum")
    private Integer maximum;

    @ApiModelProperty("发送给用户的消息模板")
    @TableField("message_template")
    private String messageTemplate;

    @ApiModelProperty("发送给云机的命令模板")
    @TableField("command_template")
    private String commandTemplate;

    @ApiModelProperty("状态(-50：删除，0：未启用，50：启用)")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("是否通知用户（0：不需要通知，1：需要通知）")
    @TableField("is_notice_user")
    private Boolean isNoticeUser;

    @ApiModelProperty("是否通知租户（0：不需要通知，1：需要通知）")
    @TableField("is_notice_tenant")
    private Boolean isNoticeTenant;

    @ApiModelProperty("是否通知飞书（0：不需要通知，1：需要通知）")
    @TableField("is_notice_feishu")
    private Boolean isNoticeFeishu;

    @ApiModelProperty("是否需要重启（0：不需要重启，1：需要重启）2：gpu 显存告警需要重启的时候 restartDelaySeconds 是必填的")
    @TableField("is_restart")
    private Boolean isRestart;

    @ApiModelProperty("需要重启的商户手机号，使用,号隔开")
    @TableField("enable_restart_phone")
    private String enableRestartPhone;

    @ApiModelProperty("延迟 restartDelaySeconds 秒后重启，2：cpu 显存告警需要重启的时候 restartDelaySeconds 是必填的")
    @TableField("restart_delay_seconds")
    private Integer restartDelaySeconds;

    @TableField("create_time")
    private Date createTime;

    @TableField("last_update_time")
    private Date lastUpdateTime;

    @TableField("version_id")
    private Long versionId;
}
