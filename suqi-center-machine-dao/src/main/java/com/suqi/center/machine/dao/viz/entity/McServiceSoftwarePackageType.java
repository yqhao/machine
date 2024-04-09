package com.suqi.center.machine.dao.viz.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.suqi.center.machine.dao.viz.wrapper.McServiceSoftwarePackageTypeQueryEntityWrapper;
import com.suqi.center.machine.dao.viz.wrapper.McServiceSoftwarePackageTypeQueryWrapper;
import com.suqi.center.machine.dao.viz.wrapper.McServiceSoftwarePackageTypeUpdateEntityWrapper;
import com.suqi.center.machine.dao.viz.wrapper.McServiceSoftwarePackageTypeUpdateWrapper;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
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
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("viz_mc_service_software_package_type")
@ApiModel(value = "McServiceSoftwarePackageType对象", description = "云机端软件包类型表")
public class McServiceSoftwarePackageType implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("记录id自动增长")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("类型名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("状态(-50：删除，50：正常)")
    @TableField("status")
    private Integer status;

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

    /**
     * 记录id自动增长
     */
    public static final String ID = "id";

    /**
     * 类型名称
     */
    public static final String NAME = "name";

    /**
     * 状态(-50：删除，50：正常)
     */
    public static final String STATUS = "status";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 最后修改时间
     */
    public static final String LAST_UPDATE_TIME = "last_update_time";

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

    public McServiceSoftwarePackageTypeQueryEntityWrapper queryWrapper(){
        return McServiceSoftwarePackageTypeQueryEntityWrapper.wrapper(this);
    }

    public McServiceSoftwarePackageTypeUpdateEntityWrapper updateWrapper(){
        return McServiceSoftwarePackageTypeUpdateEntityWrapper.wrapper(this);
    }

    public static McServiceSoftwarePackageTypeQueryWrapper qWrapper(){
        return McServiceSoftwarePackageTypeQueryWrapper.wrapper();
    }

    public static McServiceSoftwarePackageTypeUpdateWrapper uWrapper(){
        return McServiceSoftwarePackageTypeUpdateWrapper.wrapper();
    }

}
