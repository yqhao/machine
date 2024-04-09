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
 * @since 2023-08-24
 */
@ApiModel(value = "McMoveJobs对象", description = "")
public class McMoveJobsParam implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull(groups = ValidationGroups.Update.class,message = "id 不能为null")
    private Long id;


    private Long fkMcMoveDeviceId;


    private String exportRequestParam;


    private String exportJobId;


    private String exportJobResult;


    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date exportStartTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date queryEndExportStartTime;


    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date exportEndTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date queryEndExportEndTime;


    private String importRequestParam;


    private String importJobId;


    private String importJobResult;


    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date importStartTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date queryEndImportStartTime;


    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date importEndTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date queryEndImportEndTime;


    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date queryEndCreateTime;


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
    public Date getQueryEndExportStartTime() {
        return queryEndExportStartTime;
    }

    /**
     * 
     */
    public void setQueryEndExportStartTime(Date queryEndExportStartTime) {
        this.queryEndExportStartTime = queryEndExportStartTime;
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
    public Date getQueryEndExportEndTime() {
        return queryEndExportEndTime;
    }

    /**
     * 
     */
    public void setQueryEndExportEndTime(Date queryEndExportEndTime) {
        this.queryEndExportEndTime = queryEndExportEndTime;
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
    public Date getQueryEndImportStartTime() {
        return queryEndImportStartTime;
    }

    /**
     * 
     */
    public void setQueryEndImportStartTime(Date queryEndImportStartTime) {
        this.queryEndImportStartTime = queryEndImportStartTime;
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
    public Date getQueryEndImportEndTime() {
        return queryEndImportEndTime;
    }

    /**
     * 
     */
    public void setQueryEndImportEndTime(Date queryEndImportEndTime) {
        this.queryEndImportEndTime = queryEndImportEndTime;
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
    public Date getQueryEndCreateTime() {
        return queryEndCreateTime;
    }

    /**
     * 
     */
    public void setQueryEndCreateTime(Date queryEndCreateTime) {
        this.queryEndCreateTime = queryEndCreateTime;
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
    public Date getQueryEndLastUpdateTime() {
        return queryEndLastUpdateTime;
    }

    /**
     * 
     */
    public void setQueryEndLastUpdateTime(Date queryEndLastUpdateTime) {
        this.queryEndLastUpdateTime = queryEndLastUpdateTime;
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
