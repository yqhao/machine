package com.suqi.center.machine.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.suqi.center.machine.dao.wrapper.TencentAccountQueryEntityWrapper;
import com.suqi.center.machine.dao.wrapper.TencentAccountQueryWrapper;
import com.suqi.center.machine.dao.wrapper.TencentAccountUpdateEntityWrapper;
import com.suqi.center.machine.dao.wrapper.TencentAccountUpdateWrapper;
import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * <p>
 * 腾讯账号表
 * </p>
 *
 * @author PC001
 * @since 2023-06-14
 */
@TableName("tencent_account")
@ApiModel(value = "TencentAccount对象", description = "腾讯账号表")
public class TencentAccount implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("账号唯一标识")
    @TableField("uuid")
    private String uuid;

    @ApiModelProperty("腾讯云密钥Id")
    @TableField("secret_id")
    private String secretId;

    @ApiModelProperty("腾讯云秘钥key")
    @TableField("secret_key")
    private String secretKey;

    @ApiModelProperty("腾讯云请求地址")
    @TableField("endpoint")
    private String endpoint;

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

    @ApiModelProperty("box_soc的表的主键ID[用这个id做关联]")
    @TableField("fk_account_id")
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

    /**
     * 
     */
    public static final String ID = "id";

    /**
     * 账号唯一标识
     */
    public static final String UUID = "uuid";

    /**
     * 腾讯云密钥Id
     */
    public static final String SECRET_ID = "secret_id";

    /**
     * 腾讯云秘钥key
     */
    public static final String SECRET_KEY = "secret_key";

    /**
     * 腾讯云请求地址
     */
    public static final String ENDPOINT = "endpoint";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 最后修改时间
     */
    public static final String LAST_UPDATE_TIME = "last_update_time";

    /**
     * box_soc的表的主键ID[用这个id做关联]
     */
    public static final String FK_ACCOUNT_ID = "fk_account_id";

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

    public TencentAccountQueryEntityWrapper queryWrapper(){
        return TencentAccountQueryEntityWrapper.wrapper(this);
    }

    public TencentAccountUpdateEntityWrapper updateWrapper(){
        return TencentAccountUpdateEntityWrapper.wrapper(this);
    }

    public static TencentAccountQueryWrapper qWrapper(){
        return TencentAccountQueryWrapper.wrapper();
    }

    public static TencentAccountUpdateWrapper uWrapper(){
        return TencentAccountUpdateWrapper.wrapper();
    }

}
