package com.suqi.center.machine.dao.viz.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.suqi.center.machine.dao.viz.wrapper.McServiceSoftwarePackageOssRecordQueryEntityWrapper;
import com.suqi.center.machine.dao.viz.wrapper.McServiceSoftwarePackageOssRecordQueryWrapper;
import com.suqi.center.machine.dao.viz.wrapper.McServiceSoftwarePackageOssRecordUpdateEntityWrapper;
import com.suqi.center.machine.dao.viz.wrapper.McServiceSoftwarePackageOssRecordUpdateWrapper;
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
 * 云机端软件包对象存储记录表
 * </p>
 *
 * @author 18374
 * @since 2023-07-26
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("viz_mc_service_software_package_oss_record")
@ApiModel(value = "McServiceSoftwarePackageOssRecord对象", description = "云机端软件包对象存储记录表")
public class McServiceSoftwarePackageOssRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("记录id自动增长")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("软件包类型记录id")
    @TableField("fk_mc_service_software_package_id")
    private Long fkMcServiceSoftwarePackageId;

    @ApiModelProperty("对象存储服务记录Id")
    @TableField("oss_id")
    private Long ossId;

    @ApiModelProperty("对象存储服务类型（1：obs）")
    @TableField("oss_type")
    private Integer ossType;

    @ApiModelProperty("对象存储桶名")
    @TableField("bucket_name")
    private String bucketName;

    @ApiModelProperty("对象存储对象路径")
    @TableField("object_path")
    private String objectPath;

    @ApiModelProperty("状态(-50：删除，0：未上传，50：正常)")
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
     * 软件包类型记录id
     */
    public Long getFkMcServiceSoftwarePackageId() {
        return fkMcServiceSoftwarePackageId;
    }

    /**
     * 软件包类型记录id
     */
    public void setFkMcServiceSoftwarePackageId(Long fkMcServiceSoftwarePackageId) {
        this.fkMcServiceSoftwarePackageId = fkMcServiceSoftwarePackageId;
    }
    /**
     * 对象存储服务记录Id
     */
    public Long getOssId() {
        return ossId;
    }

    /**
     * 对象存储服务记录Id
     */
    public void setOssId(Long ossId) {
        this.ossId = ossId;
    }
    /**
     * 对象存储服务类型（1：obs）
     */
    public Integer getOssType() {
        return ossType;
    }

    /**
     * 对象存储服务类型（1：obs）
     */
    public void setOssType(Integer ossType) {
        this.ossType = ossType;
    }
    /**
     * 对象存储桶名
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * 对象存储桶名
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }
    /**
     * 对象存储对象路径
     */
    public String getObjectPath() {
        return objectPath;
    }

    /**
     * 对象存储对象路径
     */
    public void setObjectPath(String objectPath) {
        this.objectPath = objectPath;
    }
    /**
     * 状态(-50：删除，0：未上传，50：正常)
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态(-50：删除，0：未上传，50：正常)
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
     * 软件包类型记录id
     */
    public static final String FK_MC_SERVICE_SOFTWARE_PACKAGE_ID = "fk_mc_service_software_package_id";

    /**
     * 对象存储服务记录Id
     */
    public static final String OSS_ID = "oss_id";

    /**
     * 对象存储服务类型（1：obs）
     */
    public static final String OSS_TYPE = "oss_type";

    /**
     * 对象存储桶名
     */
    public static final String BUCKET_NAME = "bucket_name";

    /**
     * 对象存储对象路径
     */
    public static final String OBJECT_PATH = "object_path";

    /**
     * 状态(-50：删除，0：未上传，50：正常)
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
        return "McServiceSoftwarePackageOssRecord{" +
            "id=" + id +
            ", fkMcServiceSoftwarePackageId=" + fkMcServiceSoftwarePackageId +
            ", ossId=" + ossId +
            ", ossType=" + ossType +
            ", bucketName=" + bucketName +
            ", objectPath=" + objectPath +
            ", status=" + status +
            ", createTime=" + createTime +
            ", lastUpdateTime=" + lastUpdateTime +
        "}";
    }

    public McServiceSoftwarePackageOssRecordQueryEntityWrapper queryWrapper(){
        return McServiceSoftwarePackageOssRecordQueryEntityWrapper.wrapper(this);
    }

    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper updateWrapper(){
        return McServiceSoftwarePackageOssRecordUpdateEntityWrapper.wrapper(this);
    }

    public static McServiceSoftwarePackageOssRecordQueryWrapper qWrapper(){
        return McServiceSoftwarePackageOssRecordQueryWrapper.wrapper();
    }

    public static McServiceSoftwarePackageOssRecordUpdateWrapper uWrapper(){
        return McServiceSoftwarePackageOssRecordUpdateWrapper.wrapper();
    }

}
