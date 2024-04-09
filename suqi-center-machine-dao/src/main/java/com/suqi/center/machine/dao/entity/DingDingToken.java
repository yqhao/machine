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
 * 
 * </p>
 *
 * @author PC001
 * @since 2023-04-20
 */
@Data
@TableName("ding_ding_token")
@ApiModel(value = "DingDingToken对象", description = "")
public class DingDingToken implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("业务类型（expire,stock,offline）")
    @TableField("biz_type")
    private String bizType;

    @ApiModelProperty("推送地址")
    @TableField("url")
    private String url;

    @ApiModelProperty("消息标题")
    @TableField("tilte")
    private String tilte;

    @ApiModelProperty("消息内容")
    @TableField("content")
    private String content;

    @ApiModelProperty("芯片（多个芯片型号用;分割）")
    @TableField("chip")
    private String chip;

    @TableField("create_time")
    private Date createTime;

    @TableField("last_update_time")
    private Date lastUpdateTime;

    @TableField("create_admin_id")
    private Long createAdminId;

    @TableField("last_update_admin_id")
    private Long lastUpdateAdminId;

    @TableField("status")
    private Integer status;
}
