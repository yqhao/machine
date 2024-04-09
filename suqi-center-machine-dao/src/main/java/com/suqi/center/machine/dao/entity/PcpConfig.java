package com.suqi.center.machine.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.suqi.center.machine.dao.wrapper.PcpConfigQueryEntityWrapper;
import com.suqi.center.machine.dao.wrapper.PcpConfigQueryWrapper;
import com.suqi.center.machine.dao.wrapper.PcpConfigUpdateEntityWrapper;
import com.suqi.center.machine.dao.wrapper.PcpConfigUpdateWrapper;
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
 * 华为云配置表
 * </p>
 *
 * @author PC001
 * @since 2023-08-29
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("pcp_config")
@ApiModel(value = "PcpConfig对象", description = "华为云配置表")
public class PcpConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("华为项目id")
    @TableField("project_id")
    private String projectId;

    @TableField("domain_name")
    private String domainName;

    @ApiModelProperty("iam用户名")
    @TableField("iam_usr")
    private String iamUsr;

    @ApiModelProperty("iam密码")
    @TableField("iam_pwd")
    private String iamPwd;

    @ApiModelProperty("获取token地址")
    @TableField("endpoint_token_url")
    private String endpointTokenUrl;

    @ApiModelProperty("api调用地址")
    @TableField("endpoint_phones_url")
    private String endpointPhonesUrl;

    @ApiModelProperty("接口url地址模板")
    @TableField("endpoint_url_pattern")
    private String endpointUrlPattern;

    @ApiModelProperty("access_key_id")
    @TableField("access_key_id")
    private String accessKeyId;

    @ApiModelProperty("secret_access_key")
    @TableField("secret_access_key")
    private String secretAccessKey;

    @ApiModelProperty("token")
    @TableField("token")
    private String token;

    @ApiModelProperty("token 过期时间")
    @TableField("expired_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date expiredDate;

    @ApiModelProperty("obs存储桶名称")
    @TableField("bucket_name")
    private String bucketName;

    @ApiModelProperty("obs存储桶路径")
    @TableField("object_path")
    private String objectPath;

    @ApiModelProperty("状态（0：关闭，1：启用）")
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

    @TableField("version_id")
    private Long versionId;

    @ApiModelProperty("pcp区域表（pcp_area）id")
    @TableField("fk_pcp_area_id")
    private Long fkPcpAreaId;

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
     * 华为项目id
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * 华为项目id
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
    /**
     * 
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * 
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }
    /**
     * iam用户名
     */
    public String getIamUsr() {
        return iamUsr;
    }

    /**
     * iam用户名
     */
    public void setIamUsr(String iamUsr) {
        this.iamUsr = iamUsr;
    }
    /**
     * iam密码
     */
    public String getIamPwd() {
        return iamPwd;
    }

    /**
     * iam密码
     */
    public void setIamPwd(String iamPwd) {
        this.iamPwd = iamPwd;
    }
    /**
     * 获取token地址
     */
    public String getEndpointTokenUrl() {
        return endpointTokenUrl;
    }

    /**
     * 获取token地址
     */
    public void setEndpointTokenUrl(String endpointTokenUrl) {
        this.endpointTokenUrl = endpointTokenUrl;
    }
    /**
     * api调用地址
     */
    public String getEndpointPhonesUrl() {
        return endpointPhonesUrl;
    }

    /**
     * api调用地址
     */
    public void setEndpointPhonesUrl(String endpointPhonesUrl) {
        this.endpointPhonesUrl = endpointPhonesUrl;
    }
    /**
     * 接口url地址模板
     */
    public String getEndpointUrlPattern() {
        return endpointUrlPattern;
    }

    /**
     * 接口url地址模板
     */
    public void setEndpointUrlPattern(String endpointUrlPattern) {
        this.endpointUrlPattern = endpointUrlPattern;
    }
    /**
     * access_key_id
     */
    public String getAccessKeyId() {
        return accessKeyId;
    }

    /**
     * access_key_id
     */
    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }
    /**
     * secret_access_key
     */
    public String getSecretAccessKey() {
        return secretAccessKey;
    }

    /**
     * secret_access_key
     */
    public void setSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
    }
    /**
     * token
     */
    public String getToken() {
        return token;
    }

    /**
     * token
     */
    public void setToken(String token) {
        this.token = token;
    }
    /**
     * token 过期时间
     */
    public Date getExpiredDate() {
        return expiredDate;
    }

    /**
     * token 过期时间
     */
    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }
    /**
     * obs存储桶名称
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * obs存储桶名称
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }
    /**
     * obs存储桶路径
     */
    public String getObjectPath() {
        return objectPath;
    }

    /**
     * obs存储桶路径
     */
    public void setObjectPath(String objectPath) {
        this.objectPath = objectPath;
    }
    /**
     * 状态（0：关闭，1：启用）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态（0：关闭，1：启用）
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
     * pcp区域表（pcp_area）id
     */
    public Long getFkPcpAreaId() {
        return fkPcpAreaId;
    }

    /**
     * pcp区域表（pcp_area）id
     */
    public void setFkPcpAreaId(Long fkPcpAreaId) {
        this.fkPcpAreaId = fkPcpAreaId;
    }

    /**
     * 
     */
    public static final String ID = "id";

    /**
     * 华为项目id
     */
    public static final String PROJECT_ID = "project_id";

    /**
     * 
     */
    public static final String DOMAIN_NAME = "domain_name";

    /**
     * iam用户名
     */
    public static final String IAM_USR = "iam_usr";

    /**
     * iam密码
     */
    public static final String IAM_PWD = "iam_pwd";

    /**
     * 获取token地址
     */
    public static final String ENDPOINT_TOKEN_URL = "endpoint_token_url";

    /**
     * api调用地址
     */
    public static final String ENDPOINT_PHONES_URL = "endpoint_phones_url";

    /**
     * 接口url地址模板
     */
    public static final String ENDPOINT_URL_PATTERN = "endpoint_url_pattern";

    /**
     * access_key_id
     */
    public static final String ACCESS_KEY_ID = "access_key_id";

    /**
     * secret_access_key
     */
    public static final String SECRET_ACCESS_KEY = "secret_access_key";

    /**
     * token
     */
    public static final String TOKEN = "token";

    /**
     * token 过期时间
     */
    public static final String EXPIRED_DATE = "expired_date";

    /**
     * obs存储桶名称
     */
    public static final String BUCKET_NAME = "bucket_name";

    /**
     * obs存储桶路径
     */
    public static final String OBJECT_PATH = "object_path";

    /**
     * 状态（0：关闭，1：启用）
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

    /**
     * 
     */
    public static final String VERSION_ID = "version_id";

    /**
     * pcp区域表（pcp_area）id
     */
    public static final String FK_PCP_AREA_ID = "fk_pcp_area_id";

    @Override
    public String toString() {
        return "PcpConfig{" +
            "id=" + id +
            ", projectId=" + projectId +
            ", domainName=" + domainName +
            ", iamUsr=" + iamUsr +
            ", iamPwd=" + iamPwd +
            ", endpointTokenUrl=" + endpointTokenUrl +
            ", endpointPhonesUrl=" + endpointPhonesUrl +
            ", endpointUrlPattern=" + endpointUrlPattern +
            ", accessKeyId=" + accessKeyId +
            ", secretAccessKey=" + secretAccessKey +
            ", token=" + token +
            ", expiredDate=" + expiredDate +
            ", bucketName=" + bucketName +
            ", objectPath=" + objectPath +
            ", status=" + status +
            ", createTime=" + createTime +
            ", lastUpdateTime=" + lastUpdateTime +
            ", versionId=" + versionId +
            ", fkPcpAreaId=" + fkPcpAreaId +
        "}";
    }

    public PcpConfigQueryEntityWrapper queryWrapper(){
        return PcpConfigQueryEntityWrapper.wrapper(this);
    }

    public PcpConfigUpdateEntityWrapper updateWrapper(){
        return PcpConfigUpdateEntityWrapper.wrapper(this);
    }

    public static PcpConfigQueryWrapper qWrapper(){
        return PcpConfigQueryWrapper.wrapper();
    }

    public static PcpConfigUpdateWrapper uWrapper(){
        return PcpConfigUpdateWrapper.wrapper();
    }

}
