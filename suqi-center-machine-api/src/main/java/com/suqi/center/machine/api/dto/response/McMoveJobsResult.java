package com.suqi.center.machine.api.dto.response;

import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * <p>
 * 
 * </p>
 *
 * @author PC001
 * @since 2023-08-24
 */
@ApiModel(value = "McMoveJobs对象", description = "")
public class McMoveJobsResult implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long fkMcMoveDeviceId;

    private String exportRequestParam;

    private String exportJobId;

    private String exportJobResult;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date exportStartTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date exportEndTime;

    private String importRequestParam;

    private String importJobId;

    private String importJobResult;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date importStartTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date importEndTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;
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



}
