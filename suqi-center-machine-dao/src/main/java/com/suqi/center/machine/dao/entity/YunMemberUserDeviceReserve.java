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
 * 商户用户设备库存表（yun_member_user_device_reserve）
 * </p>
 *
 * @author PC001
 * @since 2023-05-19
 */
@Data
@TableName("yun_member_user_device_reserve")
@ApiModel(value = "YunMemberUserDeviceReserve对象", description = "商户用户设备库存表（yun_member_user_device_reserve）")
public class YunMemberUserDeviceReserve implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("商户id")
    @TableField("fk_member_id")
    private Long fkMemberId;

    @ApiModelProperty("总库存")
    @TableField("product_stock")
    private Integer productStock;

    @ApiModelProperty("剩余库存")
    @TableField("last_stock")
    private Integer lastStock;

    @ApiModelProperty("创建时间")
    @TableField("create_time")
    private Date createTime;

    @ApiModelProperty("最近修改时间")
    @TableField("last_update_time")
    private Date lastUpdateTime;

    @TableField("version_id")
    private Long versionId;
}
