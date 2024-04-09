package com.suqi.center.machine.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.suqi.center.machine.dao.wrapper.SysOtaRecordQueryEntityWrapper;
import com.suqi.center.machine.dao.wrapper.SysOtaRecordQueryWrapper;
import com.suqi.center.machine.dao.wrapper.SysOtaRecordUpdateEntityWrapper;
import com.suqi.center.machine.dao.wrapper.SysOtaRecordUpdateWrapper;
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
 * @since 2023-10-31
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("sys_ota_record")
@ApiModel(value = "SysOtaRecord对象", description = "")
public class SysOtaRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("fk_sys_ota_id")
    private Long fkSysOtaId;

    @TableField("fk_sys_ota_obs_id")
    private Long fkSysOtaObsId;

    @TableField("fk_em_soc_devices_id")
    private Long fkEmSocDevicesId;

    @ApiModelProperty("1：系统调用，2：商户调用")
    @TableField("type")
    private Integer type;

    @TableField("device_id")
    private String deviceId;

    @ApiModelProperty("执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）")
    @TableField("status")
    private Integer status;

    @TableField("create_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;

    @TableField("last_update_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date lastUpdateTime;

    @TableField("version_id")
    private Long versionId;

    @TableField("execute_msg")
    private String executeMsg;

    @ApiModelProperty("任务开始时间")
    @TableField("task_start_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date taskStartTime;

    @ApiModelProperty("最后job_id")
    @TableField("job_id")
    private String jobId;

    @ApiModelProperty("ota更新预置应用ID")
    @TableField("fk_sys_ota_preinstalled_apps_id")
    private Long fkSysOtaPreinstalledAppsId;

    @ApiModelProperty("具体设备的开始执行时间")
    @TableField("start_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date startTime;

    @ApiModelProperty("等待执行开始时间")
    @TableField("wait_over_start_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date waitOverStartDate;

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
     * 
     */
    public Long getFkSysOtaId() {
        return fkSysOtaId;
    }

    /**
     * 
     */
    public void setFkSysOtaId(Long fkSysOtaId) {
        this.fkSysOtaId = fkSysOtaId;
    }
    /**
     * 
     */
    public Long getFkSysOtaObsId() {
        return fkSysOtaObsId;
    }

    /**
     * 
     */
    public void setFkSysOtaObsId(Long fkSysOtaObsId) {
        this.fkSysOtaObsId = fkSysOtaObsId;
    }
    /**
     * 
     */
    public Long getFkEmSocDevicesId() {
        return fkEmSocDevicesId;
    }

    /**
     * 
     */
    public void setFkEmSocDevicesId(Long fkEmSocDevicesId) {
        this.fkEmSocDevicesId = fkEmSocDevicesId;
    }
    /**
     * 1：系统调用，2：商户调用
     */
    public Integer getType() {
        return type;
    }

    /**
     * 1：系统调用，2：商户调用
     */
    public void setType(Integer type) {
        this.type = type;
    }
    /**
     * 
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * 
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
    /**
     * 执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
    /**
     * 
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    /**
     * 
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * 
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
    /**
     * 
     */
    public Long getVersionId() {
        return versionId;
    }

    /**
     * 
     */
    public void setVersionId(Long versionId) {
        this.versionId = versionId;
    }
    /**
     * 
     */
    public String getExecuteMsg() {
        return executeMsg;
    }

    /**
     * 
     */
    public void setExecuteMsg(String executeMsg) {
        this.executeMsg = executeMsg;
    }
    /**
     * 任务开始时间
     */
    public Date getTaskStartTime() {
        return taskStartTime;
    }

    /**
     * 任务开始时间
     */
    public void setTaskStartTime(Date taskStartTime) {
        this.taskStartTime = taskStartTime;
    }
    /**
     * 最后job_id
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * 最后job_id
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }
    /**
     * ota更新预置应用ID
     */
    public Long getFkSysOtaPreinstalledAppsId() {
        return fkSysOtaPreinstalledAppsId;
    }

    /**
     * ota更新预置应用ID
     */
    public void setFkSysOtaPreinstalledAppsId(Long fkSysOtaPreinstalledAppsId) {
        this.fkSysOtaPreinstalledAppsId = fkSysOtaPreinstalledAppsId;
    }
    /**
     * 具体设备的开始执行时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 具体设备的开始执行时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
    /**
     * 等待执行开始时间
     */
    public Date getWaitOverStartDate() {
        return waitOverStartDate;
    }

    /**
     * 等待执行开始时间
     */
    public void setWaitOverStartDate(Date waitOverStartDate) {
        this.waitOverStartDate = waitOverStartDate;
    }

    /**
     * 
     */
    public static final String ID = "id";

    /**
     * 
     */
    public static final String FK_SYS_OTA_ID = "fk_sys_ota_id";

    /**
     * 
     */
    public static final String FK_SYS_OTA_OBS_ID = "fk_sys_ota_obs_id";

    /**
     * 
     */
    public static final String FK_EM_SOC_DEVICES_ID = "fk_em_soc_devices_id";

    /**
     * 1：系统调用，2：商户调用
     */
    public static final String TYPE = "type";

    /**
     * 
     */
    public static final String DEVICE_ID = "device_id";

    /**
     * 执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）
     */
    public static final String STATUS = "status";

    /**
     * 
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 
     */
    public static final String LAST_UPDATE_TIME = "last_update_time";

    /**
     * 
     */
    public static final String VERSION_ID = "version_id";

    /**
     * 
     */
    public static final String EXECUTE_MSG = "execute_msg";

    /**
     * 任务开始时间
     */
    public static final String TASK_START_TIME = "task_start_time";

    /**
     * 最后job_id
     */
    public static final String JOB_ID = "job_id";

    /**
     * ota更新预置应用ID
     */
    public static final String FK_SYS_OTA_PREINSTALLED_APPS_ID = "fk_sys_ota_preinstalled_apps_id";

    /**
     * 具体设备的开始执行时间
     */
    public static final String START_TIME = "start_time";

    /**
     * 等待执行开始时间
     */
    public static final String WAIT_OVER_START_DATE = "wait_over_start_date";

    @Override
    public String toString() {
        return "SysOtaRecord{" +
            "id=" + id +
            ", fkSysOtaId=" + fkSysOtaId +
            ", fkSysOtaObsId=" + fkSysOtaObsId +
            ", fkEmSocDevicesId=" + fkEmSocDevicesId +
            ", type=" + type +
            ", deviceId=" + deviceId +
            ", status=" + status +
            ", createTime=" + createTime +
            ", lastUpdateTime=" + lastUpdateTime +
            ", versionId=" + versionId +
            ", executeMsg=" + executeMsg +
            ", taskStartTime=" + taskStartTime +
            ", jobId=" + jobId +
            ", fkSysOtaPreinstalledAppsId=" + fkSysOtaPreinstalledAppsId +
            ", startTime=" + startTime +
            ", waitOverStartDate=" + waitOverStartDate +
        "}";
    }

    public SysOtaRecordQueryEntityWrapper queryWrapper(){
        return SysOtaRecordQueryEntityWrapper.wrapper(this);
    }

    public SysOtaRecordUpdateEntityWrapper updateWrapper(){
        return SysOtaRecordUpdateEntityWrapper.wrapper(this);
    }

    public static SysOtaRecordQueryWrapper qWrapper(){
        return SysOtaRecordQueryWrapper.wrapper();
    }

    public static SysOtaRecordUpdateWrapper uWrapper(){
        return SysOtaRecordUpdateWrapper.wrapper();
    }

}
