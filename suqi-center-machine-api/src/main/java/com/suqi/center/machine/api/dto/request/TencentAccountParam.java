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
 * 腾讯账号表
 * </p>
 *
 * @author PC001
 * @since 2023-06-12
 */
@ApiModel(value = "TencentAccount对象", description = "腾讯账号表")
public class TencentAccountParam implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull(groups = ValidationGroups.Update.class, message = "id不能为空")
    private Long id;

    @ApiModelProperty("账号唯一标识")
    private String uuid;

    @ApiModelProperty("腾讯云密钥Id")

    @NotEmpty(groups = ValidationGroups.Insert.class,message = "腾讯云密钥Id不能为空")
    private String secretId;

    @ApiModelProperty("腾讯云秘钥key")

    @NotEmpty(groups = ValidationGroups.Insert.class,message = "腾讯云秘钥key不能为空")
    private String secretKey;

    @ApiModelProperty("腾讯云请求地址")

    @NotEmpty(groups = ValidationGroups.Insert.class,message = "腾讯云请求地址不能为空")
    private String endpoint;

    @ApiModelProperty("创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")    private Date createTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date queryEndCreateTime;
    @ApiModelProperty("最后修改时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")    private Date lastUpdateTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date queryEndLastUpdateTime;
    @ApiModelProperty("box_soc的表的主键ID[用这个id做关联]")
    private Long fkAccountId;


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
     * 账号唯一标识
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * 账号唯一标识
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * 腾讯云密钥Id
     */
    public String getSecretId() {
        return secretId;
    }

    /**
     * 腾讯云密钥Id
     */
    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    /**
     * 腾讯云秘钥key
     */
    public String getSecretKey() {
        return secretKey;
    }

    /**
     * 腾讯云秘钥key
     */
    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    /**
     * 腾讯云请求地址
     */
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * 腾讯云请求地址
     */
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
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
     * 创建时间
     */
    public Date getQueryEndCreateTime() {
        return queryEndCreateTime;
    }

    /**
     * 创建时间
     */
    public void setQueryEndCreateTime(Date queryEndCreateTime) {
        this.queryEndCreateTime = queryEndCreateTime;
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
     * box_soc的表的主键ID[用这个id做关联]
     */
    public Long getFkAccountId() {
        return fkAccountId;
    }

    /**
     * box_soc的表的主键ID[用这个id做关联]
     */
    public void setFkAccountId(Long fkAccountId) {
        this.fkAccountId = fkAccountId;
    }


    @Override
    public String toString() {
        return "TencentAccount{" +
            "id=" + id +
            ", uuid=" + uuid +
            ", secretId=" + secretId +
            ", secretKey=" + secretKey +
            ", endpoint=" + endpoint +
            ", createTime=" + createTime +
            ", lastUpdateTime=" + lastUpdateTime +
            ", fkAccountId=" + fkAccountId +
        "}";
    }



}
