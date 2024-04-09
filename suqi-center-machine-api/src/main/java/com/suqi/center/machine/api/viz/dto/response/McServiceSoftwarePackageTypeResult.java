package com.suqi.center.machine.api.viz.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

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
public class McServiceSoftwarePackageTypeResult implements Serializable {

    private static final long serialVersionUID = 1L;
    @ApiModelProperty("记录id自动增长")

    private Long id;
    @ApiModelProperty("类型名称")

    private String name;
    @ApiModelProperty("状态(-50：删除，50：正常)")

    private Integer status;
    @ApiModelProperty("创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;
    @ApiModelProperty("最后修改时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date lastUpdateTime;

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
