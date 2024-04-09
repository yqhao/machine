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
 * 
 * </p>
 *
 * @author PC001
 * @since 2023-09-25
 */
@ApiModel(value = "McMoveObsConfig对象", description = "")
public class McMoveObsConfigParam implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull(groups = ValidationGroups.Update.class,message = "id 不能为null")
    private Long id;


    @ApiModelProperty("商户id(0：系统，其它商户自定义）")
    @NotNull(groups = ValidationGroups.Insert.class,message = "商户id(0：系统，其它商户自定义）不能为null")
    private Long fkMemberId;


    @ApiModelProperty("区域id")
    private Long fkPcpAreaId;


    @ApiModelProperty("区域名称")
    private String areaName;


    @ApiModelProperty("桶名称")
    @NotEmpty(groups = ValidationGroups.Insert.class,message = "桶名称不能为空")
    private String bucketName;


    @ApiModelProperty("包含路径")
    private String moveIncludeFiles;


    @ApiModelProperty("排除路径")
    private String moveExcludeFiles;


    @ApiModelProperty("状态(-50：删除，50：正常)")
    private Integer status;


    @ApiModelProperty("创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date queryEndCreateTime;


    @ApiModelProperty("修改时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date lastUpdateTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date queryEndLastUpdateTime;


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
     * 商户id(0：系统，其它商户自定义）
     */
    public Long getFkMemberId() {
        return fkMemberId;
    }

    /**
     * 商户id(0：系统，其它商户自定义）
     */
    public void setFkMemberId(Long fkMemberId) {
        this.fkMemberId = fkMemberId;
    }

    /**
     * 区域id
     */
    public Long getFkPcpAreaId() {
        return fkPcpAreaId;
    }

    /**
     * 区域id
     */
    public void setFkPcpAreaId(Long fkPcpAreaId) {
        this.fkPcpAreaId = fkPcpAreaId;
    }

    /**
     * 区域名称
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * 区域名称
     */
    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    /**
     * 桶名称
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * 桶名称
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * 包含路径
     */
    public String getMoveIncludeFiles() {
        return moveIncludeFiles;
    }

    /**
     * 包含路径
     */
    public void setMoveIncludeFiles(String moveIncludeFiles) {
        this.moveIncludeFiles = moveIncludeFiles;
    }

    /**
     * 排除路径
     */
    public String getMoveExcludeFiles() {
        return moveExcludeFiles;
    }

    /**
     * 排除路径
     */
    public void setMoveExcludeFiles(String moveExcludeFiles) {
        this.moveExcludeFiles = moveExcludeFiles;
    }

    /**
     * 状态(-50：删除，50：正常)
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态(-50：删除，50：正常)
     */
    public void setStatus(Integer status) {
        this.status = status;
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
     * 修改时间
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * 修改时间
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * 修改时间
     */
    public Date getQueryEndLastUpdateTime() {
        return queryEndLastUpdateTime;
    }

    /**
     * 修改时间
     */
    public void setQueryEndLastUpdateTime(Date queryEndLastUpdateTime) {
        this.queryEndLastUpdateTime = queryEndLastUpdateTime;
    }

    @Override
    public String toString() {
        return "McMoveObsConfig{" +
            "id=" + id +
            ", fkMemberId=" + fkMemberId +
            ", fkPcpAreaId=" + fkPcpAreaId +
            ", areaName=" + areaName +
            ", bucketName=" + bucketName +
            ", moveIncludeFiles=" + moveIncludeFiles +
            ", moveExcludeFiles=" + moveExcludeFiles +
            ", status=" + status +
            ", createTime=" + createTime +
            ", lastUpdateTime=" + lastUpdateTime +
        "}";
    }



}
