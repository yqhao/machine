package com.suqi.center.machine.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.suqi.center.machine.dao.wrapper.TencentAccountAreaQueryEntityWrapper;
import com.suqi.center.machine.dao.wrapper.TencentAccountAreaQueryWrapper;
import com.suqi.center.machine.dao.wrapper.TencentAccountAreaUpdateEntityWrapper;
import com.suqi.center.machine.dao.wrapper.TencentAccountAreaUpdateWrapper;
import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/**
 * <p>
 * 腾讯账号区域表
 * </p>
 *
 * @author PC001
 * @since 2023-07-28
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("tencent_account_area")
@ApiModel(value = "TencentAccountArea对象", description = "腾讯账号区域表")
public class TencentAccountArea implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("腾讯账号Id")
    @TableField("fk_tencent_account_id")
    private Long fkTencentAccountId;

    @ApiModelProperty("box_soc的表的主键ID[用这个id做关联]")
    @TableField("fk_account_area_id")
    private Long fkAccountAreaId;

    @ApiModelProperty("腾讯区域")
    @TableField("region")
    private String region;

    @ApiModelProperty("创建时间")
    @TableField("create_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;

    @ApiModelProperty("最后修改时间")
    @TableField("last_update_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date lastUpdateTime;

    @ApiModelProperty("区域表ID")
    @TableField("fk_pcp_area_id")
    private Long fkPcpAreaId;

    /**
     * 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     */
    public void setId(Long id) {
        this.id = id;
    }
    /**
     * 腾讯账号Id
     */
    public Long getFkTencentAccountId() {
        return fkTencentAccountId;
    }

    /**
     * 腾讯账号Id
     */
    public void setFkTencentAccountId(Long fkTencentAccountId) {
        this.fkTencentAccountId = fkTencentAccountId;
    }
    /**
     * box_soc的表的主键ID[用这个id做关联]
     */
    public Long getFkAccountAreaId() {
        return fkAccountAreaId;
    }

    /**
     * box_soc的表的主键ID[用这个id做关联]
     */
    public void setFkAccountAreaId(Long fkAccountAreaId) {
        this.fkAccountAreaId = fkAccountAreaId;
    }
    /**
     * 腾讯区域
     */
    public String getRegion() {
        return region;
    }

    /**
     * 腾讯区域
     */
    public void setRegion(String region) {
        this.region = region;
    }
    /**
     * 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    /**
     * 最后修改时间
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * 最后修改时间
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
    /**
     * 区域表ID
     */
    public Long getFkPcpAreaId() {
        return fkPcpAreaId;
    }

    /**
     * 区域表ID
     */
    public void setFkPcpAreaId(Long fkPcpAreaId) {
        this.fkPcpAreaId = fkPcpAreaId;
    }

    /**
     * 
     */
    public static final String ID = "id";

    /**
     * 腾讯账号Id
     */
    public static final String FK_TENCENT_ACCOUNT_ID = "fk_tencent_account_id";

    /**
     * box_soc的表的主键ID[用这个id做关联]
     */
    public static final String FK_ACCOUNT_AREA_ID = "fk_account_area_id";

    /**
     * 腾讯区域
     */
    public static final String REGION = "region";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 最后修改时间
     */
    public static final String LAST_UPDATE_TIME = "last_update_time";

    /**
     * 区域表ID
     */
    public static final String FK_PCP_AREA_ID = "fk_pcp_area_id";

    @Override
    public String toString() {
        return "TencentAccountArea{" +
            "id=" + id +
            ", fkTencentAccountId=" + fkTencentAccountId +
            ", fkAccountAreaId=" + fkAccountAreaId +
            ", region=" + region +
            ", createTime=" + createTime +
            ", lastUpdateTime=" + lastUpdateTime +
            ", fkPcpAreaId=" + fkPcpAreaId +
        "}";
    }

    public TencentAccountAreaQueryEntityWrapper queryWrapper(){
        return TencentAccountAreaQueryEntityWrapper.wrapper(this);
    }

    public TencentAccountAreaUpdateEntityWrapper updateWrapper(){
        return TencentAccountAreaUpdateEntityWrapper.wrapper(this);
    }

    public static TencentAccountAreaQueryWrapper qWrapper(){
        return TencentAccountAreaQueryWrapper.wrapper();
    }

    public static TencentAccountAreaUpdateWrapper uWrapper(){
        return TencentAccountAreaUpdateWrapper.wrapper();
    }

}
