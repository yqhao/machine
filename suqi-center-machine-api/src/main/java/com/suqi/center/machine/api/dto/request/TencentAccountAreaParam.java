package com.suqi.center.machine.api.dto.request;

import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import com.suqi.center.common.dto.ValidationGroups;

/**
 * <p>
 * 腾讯账号区域表
 * </p>
 *
 * @author PC001
 * @since 2023-06-12
 */
@ApiModel(value = "TencentAccountArea对象", description = "腾讯账号区域表")
public class TencentAccountAreaParam implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull(groups = ValidationGroups.Update.class, message = "id不能为空")
    private Long id;

    @ApiModelProperty("腾讯账号Id")
    private Long fkTencentAccountId;

    @ApiModelProperty("box_soc的表的主键ID[用这个id做关联]")
    private Long fkAccountAreaId;

    @ApiModelProperty("腾讯区域")
    private String region;

    @ApiModelProperty("创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")    private Date createTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date queryEndCreateTime;
    @ApiModelProperty("最后修改时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")    private Date lastUpdateTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date queryEndLastUpdateTime;
    @ApiModelProperty("区域表ID")
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
     * 创建时间
     */
    public Date getQueryEndCreateTime() {
        return queryEndCreateTime;
    }

    /**
     * 创建时间
     */
    public void setQueryEndCreateTime(Date queryEndCreateTime) {
        this.queryEndCreateTime = queryEndCreateTime;
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
     * 最后修改时间
     */
    public Date getQueryEndLastUpdateTime() {
        return queryEndLastUpdateTime;
    }

    /**
     * 最后修改时间
     */
    public void setQueryEndLastUpdateTime(Date queryEndLastUpdateTime) {
        this.queryEndLastUpdateTime = queryEndLastUpdateTime;
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



}
