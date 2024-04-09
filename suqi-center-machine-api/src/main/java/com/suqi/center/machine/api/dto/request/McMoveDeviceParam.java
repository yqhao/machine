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
@ApiModel(value = "McMoveDevice对象", description = "")
public class McMoveDeviceParam implements Serializable {

    @ApiModelProperty("重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）")
    private Boolean release;

    /**
     * 重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）
     */
    public Boolean getRelease() {
        return release;
    }

    /**
     * 重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）
     */
    public void setRelease(Boolean release) {
        this.release = release;
    }

    private static final long serialVersionUID = 1L;

    @NotNull(groups = ValidationGroups.Update.class, message = "id 不能为null")
    private Long id;

    @ApiModelProperty("商户id")
    private Long fkMemberId;

    @NotEmpty(groups = ValidationGroups.Insert.class, message = "不能为空")
    private String userPhoneId;

    @ApiModelProperty("旧设备id")
    private String fromDeviceId;

    @ApiModelProperty("旧云手机ID")
    private String fromPhoneId;

    @ApiModelProperty("新设备id")
    private String toDeviceId;

    @ApiModelProperty("新设备云手机ID")
    private String toPhoneId;

    @ApiModelProperty("需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。")
    private String includeFiles;

    @ApiModelProperty("不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。")
    private String excludeFiles;

    @ApiModelProperty("导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。")
    private String bucketName;

    @ApiModelProperty("导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。")
    private String objectPath;

    @ApiModelProperty("申请换机时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date queryEndCreateTime;

    @ApiModelProperty("换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成")
    private Integer status;

    @ApiModelProperty("最后任务id")
    private String jobId;

    @ApiModelProperty("最后修改时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date lastUpdateTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date queryEndLastUpdateTime;

    @ApiModelProperty(value = "云机规格，不得超过64byte")
    private String specCode;

    @ApiModelProperty("重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）")
    private Boolean releaseUse;

    @ApiModelProperty("是否迁移数据（false：不迁移，true：迁移）默认不迁移")
    private Boolean dataMigration;

    private String taskId;

    /**
     */
    public Long getId() {
        return id;
    }

    /**
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 商户id
     */
    public Long getFkMemberId() {
        return fkMemberId;
    }

    /**
     * 商户id
     */
    public void setFkMemberId(Long fkMemberId) {
        this.fkMemberId = fkMemberId;
    }

    /**
     */
    public String getUserPhoneId() {
        return userPhoneId;
    }

    /**
     */
    public void setUserPhoneId(String userPhoneId) {
        this.userPhoneId = userPhoneId;
    }

    /**
     * 旧设备id
     */
    public String getFromDeviceId() {
        return fromDeviceId;
    }

    /**
     * 旧设备id
     */
    public void setFromDeviceId(String fromDeviceId) {
        this.fromDeviceId = fromDeviceId;
    }

    /**
     * 旧云手机ID
     */
    public String getFromPhoneId() {
        return fromPhoneId;
    }

    /**
     * 旧云手机ID
     */
    public void setFromPhoneId(String fromPhoneId) {
        this.fromPhoneId = fromPhoneId;
    }

    /**
     * 新设备id
     */
    public String getToDeviceId() {
        return toDeviceId;
    }

    /**
     * 新设备id
     */
    public void setToDeviceId(String toDeviceId) {
        this.toDeviceId = toDeviceId;
    }

    /**
     * 新设备云手机ID
     */
    public String getToPhoneId() {
        return toPhoneId;
    }

    /**
     * 新设备云手机ID
     */
    public void setToPhoneId(String toPhoneId) {
        this.toPhoneId = toPhoneId;
    }

    /**
     * 需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。
     */
    public String getIncludeFiles() {
        return includeFiles;
    }

    /**
     * 需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。
     */
    public void setIncludeFiles(String includeFiles) {
        this.includeFiles = includeFiles;
    }

    /**
     * 不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。
     */
    public String getExcludeFiles() {
        return excludeFiles;
    }

    /**
     * 不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。
     */
    public void setExcludeFiles(String excludeFiles) {
        this.excludeFiles = excludeFiles;
    }

    /**
     * 导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * 导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * 导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。
     */
    public String getObjectPath() {
        return objectPath;
    }

    /**
     * 导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。
     */
    public void setObjectPath(String objectPath) {
        this.objectPath = objectPath;
    }

    /**
     * 申请换机时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 申请换机时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 申请换机时间
     */
    public Date getQueryEndCreateTime() {
        return queryEndCreateTime;
    }

    /**
     * 申请换机时间
     */
    public void setQueryEndCreateTime(Date queryEndCreateTime) {
        this.queryEndCreateTime = queryEndCreateTime;
    }

    /**
     * 换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 最后任务id
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * 最后任务id
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
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
     * 最后修改时间
     */
    public Date getQueryEndLastUpdateTime() {
        return queryEndLastUpdateTime;
    }

    /**
     * 最后修改时间
     */
    public void setQueryEndLastUpdateTime(Date queryEndLastUpdateTime) {
        this.queryEndLastUpdateTime = queryEndLastUpdateTime;
    }

    /**
     */
    public String getSpecCode() {
        return specCode;
    }

    /**
     */
    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    /**
     * 重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）
     */
    public Boolean getReleaseUse() {
        return releaseUse;
    }

    /**
     * 重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）
     */
    public void setReleaseUse(Boolean releaseUse) {
        this.releaseUse = releaseUse;
    }

    /**
     * 是否迁移数据（false：不迁移，true：迁移）默认不迁移
     */
    public Boolean getDataMigration() {
        return dataMigration;
    }

    /**
     * 是否迁移数据（false：不迁移，true：迁移）默认不迁移
     */
    public void setDataMigration(Boolean dataMigration) {
        this.dataMigration = dataMigration;
    }

    /**
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    @Override
    public String toString() {
        return "McMoveDevice{" + "id=" + id + ", fkMemberId=" + fkMemberId + ", userPhoneId=" + userPhoneId + ", fromDeviceId=" + fromDeviceId + ", fromPhoneId=" + fromPhoneId + ", toDeviceId=" + toDeviceId + ", toPhoneId=" + toPhoneId + ", includeFiles=" + includeFiles + ", excludeFiles=" + excludeFiles + ", bucketName=" + bucketName + ", objectPath=" + objectPath + ", createTime=" + createTime + ", status=" + status + ", jobId=" + jobId + ", lastUpdateTime=" + lastUpdateTime + ", specCode=" + specCode + ", releaseUse=" + releaseUse + ", dataMigration=" + dataMigration + ", taskId=" + taskId + "}";
    }
}
