package com.suqi.center.machine.api.dto.request;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 云机告警规则模板相关参数
 * @version 1.0
 * @date 2023/4/19 15:14
 */
@Data
@ApiModel("云机告警规则模板相关参数")
public class CloudMachineAlarmRuleTemplateParam implements Serializable {

    @ApiModelProperty("主键Id")
    private Long id;

    @ApiModelProperty("标题")
    private String title;

    @ApiModelProperty("类型（1：云机空间不足告警、2：gpu 显存告警）")
    private Integer type;

    @ApiModelProperty("告警最小值")
    private Integer minimum;

    @ApiModelProperty("告警最大值")
    private Integer maximum;

    @ApiModelProperty("发送给用户的消息模板")
    private String messageTemplate;

    @ApiModelProperty("发送给云机的命令模板")
    private String commandTemplate;

    @ApiModelProperty("状态(-50：删除，0：未启用，50：启用)")
    private Integer status;

    @ApiModelProperty("是否通知用户（0：不需要通知，1：需要通知）")
    private Boolean isNoticeUser;

    @ApiModelProperty("是否通知租户（0：不需要通知，1：需要通知）")
    private Boolean isNoticeTenant;

    @ApiModelProperty("是否通知飞书（0：不需要通知，1：需要通知）")
    private Boolean isNoticeFeishu;

    @ApiModelProperty("是否需要重启（0：不需要重启，1：需要重启）")
    private Boolean isRestart;

    @ApiModelProperty("延迟 restartDelaySeconds 秒后重启")
    private Integer restartDelaySeconds;

    @ApiModelProperty("需要重启的商户手机号，使用,号隔开")
    @TableField("enable_restart_phone")
    private String enableRestartPhone;
}
