package com.suqi.center.machine.dao.viz.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.suqi.center.machine.dao.viz.wrapper.McUpdateDeviceTaskQueryEntityWrapper;
import com.suqi.center.machine.dao.viz.wrapper.McUpdateDeviceTaskQueryWrapper;
import com.suqi.center.machine.dao.viz.wrapper.McUpdateDeviceTaskUpdateEntityWrapper;
import com.suqi.center.machine.dao.viz.wrapper.McUpdateDeviceTaskUpdateWrapper;
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
 * 更新机器任务表
 * </p>
 *
 * @author 18374
 * @since 2023-08-14
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("viz_mc_update_device_task")
@ApiModel(value = "McUpdateDeviceTask对象", description = "更新机器任务表")
public class McUpdateDeviceTask implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("记录id自动增长")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("云机端软件包记录Id")
    @TableField("fk_mc_server_software_package_id")
    private Long fkMcServerSoftwarePackageId;

    @ApiModelProperty("任务名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("华为镜像Id")
    @TableField("image_id")
    private String imageId;

    @ApiModelProperty("云机属性")
    @TableField("property")
    private String property;

    @ApiModelProperty("chmod命令")
    @TableField("chmod")
    private String chmod;

    @ApiModelProperty("命令")
    @TableField("command")
    private String command;

    @ApiModelProperty("任务开始时间")
    @TableField("start_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date startTime;

    @ApiModelProperty("任务开始后超时时间单位（时）（设置为0则不超时）")
    @TableField("overtime_time")
    private Integer overtimeTime;

    @ApiModelProperty("等待开始执行超时时间单位（时）（设置为0则不超时）")
    @TableField("wait_start_over_time")
    private Integer waitStartOverTime;

    @ApiModelProperty("状态（-50：删除，50：正常）")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("版本Id")
    @TableField("version_id")
    private Long versionId;

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
     * 云机端软件包记录Id
     */
    public Long getFkMcServerSoftwarePackageId() {
        return fkMcServerSoftwarePackageId;
    }

    /**
     * 云机端软件包记录Id
     */
    public void setFkMcServerSoftwarePackageId(Long fkMcServerSoftwarePackageId) {
        this.fkMcServerSoftwarePackageId = fkMcServerSoftwarePackageId;
    }
    /**
     * 任务名称
     */
    public String getName() {
        return name;
    }

    /**
     * 任务名称
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * 华为镜像Id
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * 华为镜像Id
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
    /**
     * 云机属性
     */
    public String getProperty() {
        return property;
    }

    /**
     * 云机属性
     */
    public void setProperty(String property) {
        this.property = property;
    }
    /**
     * chmod命令
     */
    public String getChmod() {
        return chmod;
    }

    /**
     * chmod命令
     */
    public void setChmod(String chmod) {
        this.chmod = chmod;
    }
    /**
     * 命令
     */
    public String getCommand() {
        return command;
    }

    /**
     * 命令
     */
    public void setCommand(String command) {
        this.command = command;
    }
    /**
     * 任务开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 任务开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
    /**
     * 任务开始后超时时间单位（时）（设置为0则不超时）
     */
    public Integer getOvertimeTime() {
        return overtimeTime;
    }

    /**
     * 任务开始后超时时间单位（时）（设置为0则不超时）
     */
    public void setOvertimeTime(Integer overtimeTime) {
        this.overtimeTime = overtimeTime;
    }
    /**
     * 等待开始执行超时时间单位（时）（设置为0则不超时）
     */
    public Integer getWaitStartOverTime() {
        return waitStartOverTime;
    }

    /**
     * 等待开始执行超时时间单位（时）（设置为0则不超时）
     */
    public void setWaitStartOverTime(Integer waitStartOverTime) {
        this.waitStartOverTime = waitStartOverTime;
    }
    /**
     * 状态（-50：删除，50：正常）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态（-50：删除，50：正常）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
    /**
     * 版本Id
     */
    public Long getVersionId() {
        return versionId;
    }

    /**
     * 版本Id
     */
    public void setVersionId(Long versionId) {
        this.versionId = versionId;
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
     * 记录id自动增长
     */
    public static final String ID = "id";

    /**
     * 云机端软件包记录Id
     */
    public static final String FK_MC_SERVER_SOFTWARE_PACKAGE_ID = "fk_mc_server_software_package_id";

    /**
     * 任务名称
     */
    public static final String NAME = "name";

    /**
     * 华为镜像Id
     */
    public static final String IMAGE_ID = "image_id";

    /**
     * 云机属性
     */
    public static final String PROPERTY = "property";

    /**
     * chmod命令
     */
    public static final String CHMOD = "chmod";

    /**
     * 命令
     */
    public static final String COMMAND = "command";

    /**
     * 任务开始时间
     */
    public static final String START_TIME = "start_time";

    /**
     * 任务开始后超时时间单位（时）（设置为0则不超时）
     */
    public static final String OVERTIME_TIME = "overtime_time";

    /**
     * 等待开始执行超时时间单位（时）（设置为0则不超时）
     */
    public static final String WAIT_START_OVER_TIME = "wait_start_over_time";

    /**
     * 状态（-50：删除，50：正常）
     */
    public static final String STATUS = "status";

    /**
     * 版本Id
     */
    public static final String VERSION_ID = "version_id";

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
        return "McUpdateDeviceTask{" +
            "id=" + id +
            ", fkMcServerSoftwarePackageId=" + fkMcServerSoftwarePackageId +
            ", name=" + name +
            ", imageId=" + imageId +
            ", property=" + property +
            ", chmod=" + chmod +
            ", command=" + command +
            ", startTime=" + startTime +
            ", overtimeTime=" + overtimeTime +
            ", waitStartOverTime=" + waitStartOverTime +
            ", status=" + status +
            ", versionId=" + versionId +
            ", createTime=" + createTime +
            ", lastUpdateTime=" + lastUpdateTime +
        "}";
    }

    public McUpdateDeviceTaskQueryEntityWrapper queryWrapper(){
        return McUpdateDeviceTaskQueryEntityWrapper.wrapper(this);
    }

    public McUpdateDeviceTaskUpdateEntityWrapper updateWrapper(){
        return McUpdateDeviceTaskUpdateEntityWrapper.wrapper(this);
    }

    public static McUpdateDeviceTaskQueryWrapper qWrapper(){
        return McUpdateDeviceTaskQueryWrapper.wrapper();
    }

    public static McUpdateDeviceTaskUpdateWrapper uWrapper(){
        return McUpdateDeviceTaskUpdateWrapper.wrapper();
    }

}
