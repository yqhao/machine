package com.suqi.center.machine.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 设备系统标签表
 * </p>
 *
 * @author PC001
 * @since 2023-08-29
 */
@Data
@TableName("sys_device_label")
@ApiModel(value = "SysDeviceLabel对象", description = "设备系统标签表")
public class SysDeviceLabel implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("标签名称，不得超过64byte。")
    @TableField("label_name")
    private String labelName;

    @ApiModelProperty("状态(50：正常，0：停用，-50：删除)")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("协议（0：自由选择，1：自研协议，2：RTSA）")
    @TableField("protocol")
    private Integer protocol;

    @TableField("create_time")
    private Date createTime;

    @TableField("last_update_time")
    private Date lastUpdateTime;

    @TableField("version_id")
    private Long versionId;
}
