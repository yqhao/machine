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
 * 设备标签表
 * </p>
 *
 * @author PC001
 * @since 2023-03-30
 */
@Data
@TableName("em_soc_devices_label")
@ApiModel(value = "EmSocDevicesLabel对象", description = "设备标签表")
public class EmSocDevicesLabel implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("设备唯一码")
    @TableField("device_id")
    private String deviceId;

    @ApiModelProperty("设备系统标签Id")
    @TableField("fk_sys_device_label_id")
    private Long fkSysDeviceLabelId;

    @ApiModelProperty("状态(50：正常，-50：删除)")
    @TableField("status")
    private Integer status;

    @TableField("create_time")
    private Date createTime;

    @TableField("last_update_time")
    private Date lastUpdateTime;

    @TableField("version_id")
    private Long versionId;
}
