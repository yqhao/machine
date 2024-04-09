package com.suqi.center.machine.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.suqi.center.machine.dao.wrapper.McMoveDeviceQueryEntityWrapper;
import com.suqi.center.machine.dao.wrapper.McMoveDeviceQueryWrapper;
import com.suqi.center.machine.dao.wrapper.McMoveDeviceUpdateEntityWrapper;
import com.suqi.center.machine.dao.wrapper.McMoveDeviceUpdateWrapper;
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
 * @since 2023-10-24
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("mc_move_device")
@ApiModel(value = "McMoveDevice对象", description = "")
public class McMoveDevice implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("商户id")
    @TableField("fk_member_id")
    private Long fkMemberId;

    @TableField("user_phone_id")
    private String userPhoneId;

    @ApiModelProperty("旧设备id")
    @TableField("from_device_id")
    private String fromDeviceId;

    @ApiModelProperty("旧云手机ID")
    @TableField("from_phone_id")
    private String fromPhoneId;

    @ApiModelProperty("新设备id")
    @TableField("to_device_id")
    private String toDeviceId;

    @ApiModelProperty("新设备云手机ID")
    @TableField("to_phone_id")
    private String toPhoneId;

    @ApiModelProperty("需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。")
    @TableField("include_files")
    private String includeFiles;

    @ApiModelProperty("不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。")
    @TableField("exclude_files")
    private String excludeFiles;

    @ApiModelProperty("导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。")
    @TableField("bucket_name")
    private String bucketName;

    @ApiModelProperty("导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。")
    @TableField("object_path")
    private String objectPath;

    @ApiModelProperty("申请换机时间")
    @TableField("create_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;

    @ApiModelProperty("换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("最后任务id")
    @TableField("job_id")
    private String jobId;

    @ApiModelProperty("最后修改时间")
    @TableField("last_update_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date lastUpdateTime;

    @TableField("spec_code")
    private String specCode;

    @ApiModelProperty("重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）")
    @TableField("release_use")
    private Boolean releaseUse;

    @ApiModelProperty("是否迁移数据（false：不迁移，true：迁移）默认不迁移")
    @TableField("data_migration")
    private Boolean dataMigration;

    @TableField("task_id")
    private String taskId;

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
     * 
     */
    public String getUserPhoneId() {
        return userPhoneId;
    }

    /**
     * 
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
     * 
     */
    public String getSpecCode() {
        return specCode;
    }

    /**
     * 
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
     * 
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * 
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * 
     */
    public static final String ID = "id";

    /**
     * 商户id
     */
    public static final String FK_MEMBER_ID = "fk_member_id";

    /**
     * 
     */
    public static final String USER_PHONE_ID = "user_phone_id";

    /**
     * 旧设备id
     */
    public static final String FROM_DEVICE_ID = "from_device_id";

    /**
     * 旧云手机ID
     */
    public static final String FROM_PHONE_ID = "from_phone_id";

    /**
     * 新设备id
     */
    public static final String TO_DEVICE_ID = "to_device_id";

    /**
     * 新设备云手机ID
     */
    public static final String TO_PHONE_ID = "to_phone_id";

    /**
     * 需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。
     */
    public static final String INCLUDE_FILES = "include_files";

    /**
     * 不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。
     */
    public static final String EXCLUDE_FILES = "exclude_files";

    /**
     * 导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。
     */
    public static final String BUCKET_NAME = "bucket_name";

    /**
     * 导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。
     */
    public static final String OBJECT_PATH = "object_path";

    /**
     * 申请换机时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成
     */
    public static final String STATUS = "status";

    /**
     * 最后任务id
     */
    public static final String JOB_ID = "job_id";

    /**
     * 最后修改时间
     */
    public static final String LAST_UPDATE_TIME = "last_update_time";

    /**
     * 
     */
    public static final String SPEC_CODE = "spec_code";

    /**
     * 重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）
     */
    public static final String RELEASE_USE = "release_use";

    /**
     * 是否迁移数据（false：不迁移，true：迁移）默认不迁移
     */
    public static final String DATA_MIGRATION = "data_migration";

    /**
     * 
     */
    public static final String TASK_ID = "task_id";

    @Override
    public String toString() {
        return "McMoveDevice{" +
            "id=" + id +
            ", fkMemberId=" + fkMemberId +
            ", userPhoneId=" + userPhoneId +
            ", fromDeviceId=" + fromDeviceId +
            ", fromPhoneId=" + fromPhoneId +
            ", toDeviceId=" + toDeviceId +
            ", toPhoneId=" + toPhoneId +
            ", includeFiles=" + includeFiles +
            ", excludeFiles=" + excludeFiles +
            ", bucketName=" + bucketName +
            ", objectPath=" + objectPath +
            ", createTime=" + createTime +
            ", status=" + status +
            ", jobId=" + jobId +
            ", lastUpdateTime=" + lastUpdateTime +
            ", specCode=" + specCode +
            ", releaseUse=" + releaseUse +
            ", dataMigration=" + dataMigration +
            ", taskId=" + taskId +
        "}";
    }

    public McMoveDeviceQueryEntityWrapper queryWrapper(){
        return McMoveDeviceQueryEntityWrapper.wrapper(this);
    }

    public McMoveDeviceUpdateEntityWrapper updateWrapper(){
        return McMoveDeviceUpdateEntityWrapper.wrapper(this);
    }

    public static McMoveDeviceQueryWrapper qWrapper(){
        return McMoveDeviceQueryWrapper.wrapper();
    }

    public static McMoveDeviceUpdateWrapper uWrapper(){
        return McMoveDeviceUpdateWrapper.wrapper();
    }

}
