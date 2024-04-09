package com.suqi.center.machine.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.suqi.center.machine.dao.wrapper.McMoveJobsQueryEntityWrapper;
import com.suqi.center.machine.dao.wrapper.McMoveJobsQueryWrapper;
import com.suqi.center.machine.dao.wrapper.McMoveJobsUpdateEntityWrapper;
import com.suqi.center.machine.dao.wrapper.McMoveJobsUpdateWrapper;
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
 * @since 2023-08-24
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("mc_move_jobs")
@ApiModel(value = "McMoveJobs对象", description = "")
public class McMoveJobs implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("fk_mc_move_device_id")
    private Long fkMcMoveDeviceId;

    @TableField("export_request_param")
    private String exportRequestParam;

    @TableField("export_job_id")
    private String exportJobId;

    @TableField("export_job_result")
    private String exportJobResult;

    @TableField("export_start_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date exportStartTime;

    @TableField("export_end_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date exportEndTime;

    @TableField("import_request_param")
    private String importRequestParam;

    @TableField("import_job_id")
    private String importJobId;

    @TableField("import_job_result")
    private String importJobResult;

    @TableField("import_start_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date importStartTime;

    @TableField("import_end_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date importEndTime;

    @TableField("create_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;

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
     * 
     */
    public Long getFkMcMoveDeviceId() {
        return fkMcMoveDeviceId;
    }

    /**
     * 
     */
    public void setFkMcMoveDeviceId(Long fkMcMoveDeviceId) {
        this.fkMcMoveDeviceId = fkMcMoveDeviceId;
    }
    /**
     * 
     */
    public String getExportRequestParam() {
        return exportRequestParam;
    }

    /**
     * 
     */
    public void setExportRequestParam(String exportRequestParam) {
        this.exportRequestParam = exportRequestParam;
    }
    /**
     * 
     */
    public String getExportJobId() {
        return exportJobId;
    }

    /**
     * 
     */
    public void setExportJobId(String exportJobId) {
        this.exportJobId = exportJobId;
    }
    /**
     * 
     */
    public String getExportJobResult() {
        return exportJobResult;
    }

    /**
     * 
     */
    public void setExportJobResult(String exportJobResult) {
        this.exportJobResult = exportJobResult;
    }
    /**
     * 
     */
    public Date getExportStartTime() {
        return exportStartTime;
    }

    /**
     * 
     */
    public void setExportStartTime(Date exportStartTime) {
        this.exportStartTime = exportStartTime;
    }
    /**
     * 
     */
    public Date getExportEndTime() {
        return exportEndTime;
    }

    /**
     * 
     */
    public void setExportEndTime(Date exportEndTime) {
        this.exportEndTime = exportEndTime;
    }
    /**
     * 
     */
    public String getImportRequestParam() {
        return importRequestParam;
    }

    /**
     * 
     */
    public void setImportRequestParam(String importRequestParam) {
        this.importRequestParam = importRequestParam;
    }
    /**
     * 
     */
    public String getImportJobId() {
        return importJobId;
    }

    /**
     * 
     */
    public void setImportJobId(String importJobId) {
        this.importJobId = importJobId;
    }
    /**
     * 
     */
    public String getImportJobResult() {
        return importJobResult;
    }

    /**
     * 
     */
    public void setImportJobResult(String importJobResult) {
        this.importJobResult = importJobResult;
    }
    /**
     * 
     */
    public Date getImportStartTime() {
        return importStartTime;
    }

    /**
     * 
     */
    public void setImportStartTime(Date importStartTime) {
        this.importStartTime = importStartTime;
    }
    /**
     * 
     */
    public Date getImportEndTime() {
        return importEndTime;
    }

    /**
     * 
     */
    public void setImportEndTime(Date importEndTime) {
        this.importEndTime = importEndTime;
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
    public static final String ID = "id";

    /**
     * 
     */
    public static final String FK_MC_MOVE_DEVICE_ID = "fk_mc_move_device_id";

    /**
     * 
     */
    public static final String EXPORT_REQUEST_PARAM = "export_request_param";

    /**
     * 
     */
    public static final String EXPORT_JOB_ID = "export_job_id";

    /**
     * 
     */
    public static final String EXPORT_JOB_RESULT = "export_job_result";

    /**
     * 
     */
    public static final String EXPORT_START_TIME = "export_start_time";

    /**
     * 
     */
    public static final String EXPORT_END_TIME = "export_end_time";

    /**
     * 
     */
    public static final String IMPORT_REQUEST_PARAM = "import_request_param";

    /**
     * 
     */
    public static final String IMPORT_JOB_ID = "import_job_id";

    /**
     * 
     */
    public static final String IMPORT_JOB_RESULT = "import_job_result";

    /**
     * 
     */
    public static final String IMPORT_START_TIME = "import_start_time";

    /**
     * 
     */
    public static final String IMPORT_END_TIME = "import_end_time";

    /**
     * 
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 
     */
    public static final String LAST_UPDATE_TIME = "last_update_time";

    @Override
    public String toString() {
        return "McMoveJobs{" +
            "id=" + id +
            ", fkMcMoveDeviceId=" + fkMcMoveDeviceId +
            ", exportRequestParam=" + exportRequestParam +
            ", exportJobId=" + exportJobId +
            ", exportJobResult=" + exportJobResult +
            ", exportStartTime=" + exportStartTime +
            ", exportEndTime=" + exportEndTime +
            ", importRequestParam=" + importRequestParam +
            ", importJobId=" + importJobId +
            ", importJobResult=" + importJobResult +
            ", importStartTime=" + importStartTime +
            ", importEndTime=" + importEndTime +
            ", createTime=" + createTime +
            ", lastUpdateTime=" + lastUpdateTime +
        "}";
    }

    public McMoveJobsQueryEntityWrapper queryWrapper(){
        return McMoveJobsQueryEntityWrapper.wrapper(this);
    }

    public McMoveJobsUpdateEntityWrapper updateWrapper(){
        return McMoveJobsUpdateEntityWrapper.wrapper(this);
    }

    public static McMoveJobsQueryWrapper qWrapper(){
        return McMoveJobsQueryWrapper.wrapper();
    }

    public static McMoveJobsUpdateWrapper uWrapper(){
        return McMoveJobsUpdateWrapper.wrapper();
    }

}
