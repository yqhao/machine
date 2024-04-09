package com.suqi.center.machine.api.viz.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.suqi.center.common.dto.ValidationGroups;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 云机端软件包类型表
 * </p>
 *
 * @author 18374
 * @since 2023-07-25
 */
@ApiModel(value = "McServiceSoftwarePackageType对象", description = "云机端软件包类型表")
public class McServiceSoftwarePackageTypeParam implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("记录id自动增长")
    private Long id;

    @ApiModelProperty("类型名称")
    @NotEmpty(groups = ValidationGroups.Insert.class,message = "类型名称不能为空")
    private String name;

    @NotNull(groups = ValidationGroups.Insert.class,message = "状态不能为空")
    @ApiModelProperty("状态(-50：删除，50：正常)")
    private Integer status;

    @ApiModelProperty("创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date queryEndCreateTime;

    @ApiModelProperty("最后修改时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date lastUpdateTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date queryEndLastUpdateTime;

    /**
     * 记录id自动增长
     */
    public Long getId() {
        return id;
    }

    /**
     * 记录id自动增长
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 类型名称
     */
    public String getName() {
        return name;
    }

    /**
     * 类型名称
     */
    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "McServiceSoftwarePackageType{" +
            "id=" + id +
            ", name=" + name +
            ", status=" + status +
            ", createTime=" + createTime +
            ", lastUpdateTime=" + lastUpdateTime +
        "}";
    }



}
