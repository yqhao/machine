package com.suqi.center.machine.dao.viz.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.suqi.center.machine.dao.viz.wrapper.VizMcTaskTypeEoQueryEntityWrapper;
import com.suqi.center.machine.dao.viz.wrapper.VizMcTaskTypeEoQueryWrapper;
import com.suqi.center.machine.dao.viz.wrapper.VizMcTaskTypeEoUpdateEntityWrapper;
import com.suqi.center.machine.dao.viz.wrapper.VizMcTaskTypeEoUpdateWrapper;
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
 * 任务类型表
 * </p>
 *
 * @author 18374
 * @since 2023-10-20
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("viz_mc_task_type")
@ApiModel(value = "VizMcTaskTypeEo对象", description = "任务类型表")
public class VizMcTaskTypeEo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("记录id自动增长")
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    @ApiModelProperty("任务类型名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("创建时间")
    @TableField("create_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;

    @ApiModelProperty("修改时间")
    @TableField("last_update_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date lastUpdateTime;

    @ApiModelProperty("逻辑删除-默认dr=0")
    @TableField("dr")
    private Integer dr;

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
     * 任务类型名称
     */
    public String getName() {
        return name;
    }

    /**
     * 任务类型名称
     */
    public void setName(String name) {
        this.name = name;
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
     * 逻辑删除-默认dr=0
     */
    public Integer getDr() {
        return dr;
    }

    /**
     * 逻辑删除-默认dr=0
     */
    public void setDr(Integer dr) {
        this.dr = dr;
    }

    /**
     * 记录id自动增长
     */
    public static final String ID = "id";

    /**
     * 任务类型名称
     */
    public static final String NAME = "name";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 修改时间
     */
    public static final String LAST_UPDATE_TIME = "last_update_time";

    /**
     * 逻辑删除-默认dr=0
     */
    public static final String DR = "dr";

    @Override
    public String toString() {
        return "VizMcTaskTypeEo{" +
            "id=" + id +
            ", name=" + name +
            ", createTime=" + createTime +
            ", lastUpdateTime=" + lastUpdateTime +
            ", dr=" + dr +
        "}";
    }

    public VizMcTaskTypeEoQueryEntityWrapper queryWrapper(){
        return VizMcTaskTypeEoQueryEntityWrapper.wrapper(this);
    }

    public VizMcTaskTypeEoUpdateEntityWrapper updateWrapper(){
        return VizMcTaskTypeEoUpdateEntityWrapper.wrapper(this);
    }

    public static VizMcTaskTypeEoQueryWrapper qWrapper(){
        return VizMcTaskTypeEoQueryWrapper.wrapper();
    }

    public static VizMcTaskTypeEoUpdateWrapper uWrapper(){
        return VizMcTaskTypeEoUpdateWrapper.wrapper();
    }

}
