package com.suqi.center.machine.dao.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.suqi.center.machine.dao.wrapper.McMoveObsConfigQueryEntityWrapper;
import com.suqi.center.machine.dao.wrapper.McMoveObsConfigQueryWrapper;
import com.suqi.center.machine.dao.wrapper.McMoveObsConfigUpdateEntityWrapper;
import com.suqi.center.machine.dao.wrapper.McMoveObsConfigUpdateWrapper;
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
 * 
 * </p>
 *
 * @author PC001
 * @since 2023-09-25
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("mc_move_obs_config")
@ApiModel(value = "McMoveObsConfig对象", description = "")
public class McMoveObsConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private Long id;

    @ApiModelProperty("商户id(0：系统，其它商户自定义）")
    @TableField("fk_member_id")
    private Long fkMemberId;

    @ApiModelProperty("区域id")
    @TableField("fk_pcp_area_id")
    private Long fkPcpAreaId;

    @ApiModelProperty("区域名称")
    @TableField("area_name")
    private String areaName;

    @ApiModelProperty("桶名称")
    @TableField("bucket_name")
    private String bucketName;

    @ApiModelProperty("包含路径")
    @TableField("move_include_files")
    private String moveIncludeFiles;

    @ApiModelProperty("排除路径")
    @TableField("move_exclude_files")
    private String moveExcludeFiles;

    @ApiModelProperty("状态(-50：删除，50：正常)")
    @TableField("status")
    private Integer status;

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
     * 
     */
    public static final String ID = "id";

    /**
     * 商户id(0：系统，其它商户自定义）
     */
    public static final String FK_MEMBER_ID = "fk_member_id";

    /**
     * 区域id
     */
    public static final String FK_PCP_AREA_ID = "fk_pcp_area_id";

    /**
     * 区域名称
     */
    public static final String AREA_NAME = "area_name";

    /**
     * 桶名称
     */
    public static final String BUCKET_NAME = "bucket_name";

    /**
     * 包含路径
     */
    public static final String MOVE_INCLUDE_FILES = "move_include_files";

    /**
     * 排除路径
     */
    public static final String MOVE_EXCLUDE_FILES = "move_exclude_files";

    /**
     * 状态(-50：删除，50：正常)
     */
    public static final String STATUS = "status";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 修改时间
     */
    public static final String LAST_UPDATE_TIME = "last_update_time";

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

    public McMoveObsConfigQueryEntityWrapper queryWrapper(){
        return McMoveObsConfigQueryEntityWrapper.wrapper(this);
    }

    public McMoveObsConfigUpdateEntityWrapper updateWrapper(){
        return McMoveObsConfigUpdateEntityWrapper.wrapper(this);
    }

    public static McMoveObsConfigQueryWrapper qWrapper(){
        return McMoveObsConfigQueryWrapper.wrapper();
    }

    public static McMoveObsConfigUpdateWrapper uWrapper(){
        return McMoveObsConfigUpdateWrapper.wrapper();
    }

}
