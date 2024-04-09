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
 * 商户设备标签库存表
 * </p>
 *
 * @author PC001
 * @since 2023-09-05
 */
@Data
@TableName("yun_member_device_label_inventory")
@ApiModel(value = "YunMemberDeviceLabelInventory对象", description = "商户设备标签库存表")
public class YunMemberDeviceLabelInventory implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("会员id")
    @TableField("fk_member_id")
    private Long fkMemberId;

    @ApiModelProperty("设备系统标签Id")
    @TableField("fk_sys_device_label_id")
    private Long fkSysDeviceLabelId;

    @ApiModelProperty("总库存")
    @TableField("product_stock")
    private Integer productStock;

    @ApiModelProperty("剩余库存")
    @TableField("last_stock")
    private Integer lastStock;

    @ApiModelProperty("创建时间")
    @TableField("create_time")
    private Date createTime;

    @ApiModelProperty("最后修改时间")
    @TableField("last_update_time")
    private Date lastUpdateTime;

    @TableField("version_id")
    private Long versionId;
}
