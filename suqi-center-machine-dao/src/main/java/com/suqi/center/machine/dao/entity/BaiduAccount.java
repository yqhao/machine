package com.suqi.center.machine.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.suqi.center.machine.dao.wrapper.BaiduAccountQueryEntityWrapper;
import com.suqi.center.machine.dao.wrapper.BaiduAccountQueryWrapper;
import com.suqi.center.machine.dao.wrapper.BaiduAccountUpdateEntityWrapper;
import com.suqi.center.machine.dao.wrapper.BaiduAccountUpdateWrapper;
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
 * 百度账号表
 * </p>
 *
 * @author PC001
 * @since 2023-08-25
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("baidu_account")
@ApiModel(value = "BaiduAccount对象", description = "百度账号表")
public class BaiduAccount implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("mobile")
    private String mobile;

    @TableField("account_name")
    private String accountName;

    @TableField("host")
    private String host;

    @TableField("bearer_token")
    private String bearerToken;

    @ApiModelProperty("token过期时间")
    @TableField("token_expire")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date tokenExpire;

    @ApiModelProperty("根分组")
    @TableField("root_group_code")
    private String rootGroupCode;

    @TableField("create_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;

    @TableField("last_update_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date lastUpdateTime;

    @ApiModelProperty("刷新token")
    @TableField("refreshToken")
    private String refreshToken;

    @ApiModelProperty("刷新token过期时间")
    @TableField("refreshToken_expire")
    private String refreshtokenExpire;

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
    public String getMobile() {
        return mobile;
    }

    /**
     * 
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    /**
     * 
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * 
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    /**
     * 
     */
    public String getHost() {
        return host;
    }

    /**
     * 
     */
    public void setHost(String host) {
        this.host = host;
    }
    /**
     * 
     */
    public String getBearerToken() {
        return bearerToken;
    }

    /**
     * 
     */
    public void setBearerToken(String bearerToken) {
        this.bearerToken = bearerToken;
    }
    /**
     * token过期时间
     */
    public Date getTokenExpire() {
        return tokenExpire;
    }

    /**
     * token过期时间
     */
    public void setTokenExpire(Date tokenExpire) {
        this.tokenExpire = tokenExpire;
    }
    /**
     * 根分组
     */
    public String getRootGroupCode() {
        return rootGroupCode;
    }

    /**
     * 根分组
     */
    public void setRootGroupCode(String rootGroupCode) {
        this.rootGroupCode = rootGroupCode;
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
     * 刷新token
     */
    public String getRefreshToken() {
        return refreshToken;
    }

    /**
     * 刷新token
     */
    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }
    /**
     * 刷新token过期时间
     */
    public String getRefreshtokenExpire() {
        return refreshtokenExpire;
    }

    /**
     * 刷新token过期时间
     */
    public void setRefreshtokenExpire(String refreshtokenExpire) {
        this.refreshtokenExpire = refreshtokenExpire;
    }

    /**
     * 
     */
    public static final String ID = "id";

    /**
     * 
     */
    public static final String MOBILE = "mobile";

    /**
     * 
     */
    public static final String ACCOUNT_NAME = "account_name";

    /**
     * 
     */
    public static final String HOST = "host";

    /**
     * 
     */
    public static final String BEARER_TOKEN = "bearer_token";

    /**
     * token过期时间
     */
    public static final String TOKEN_EXPIRE = "token_expire";

    /**
     * 根分组
     */
    public static final String ROOT_GROUP_CODE = "root_group_code";

    /**
     * 
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 
     */
    public static final String LAST_UPDATE_TIME = "last_update_time";

    /**
     * 刷新token
     */
    public static final String REFRESHTOKEN = "refreshToken";

    /**
     * 刷新token过期时间
     */
    public static final String REFRESHTOKEN_EXPIRE = "refreshToken_expire";

    @Override
    public String toString() {
        return "BaiduAccount{" +
            "id=" + id +
            ", mobile=" + mobile +
            ", accountName=" + accountName +
            ", host=" + host +
            ", bearerToken=" + bearerToken +
            ", tokenExpire=" + tokenExpire +
            ", rootGroupCode=" + rootGroupCode +
            ", createTime=" + createTime +
            ", lastUpdateTime=" + lastUpdateTime +
            ", refreshToken=" + refreshToken +
            ", refreshtokenExpire=" + refreshtokenExpire +
        "}";
    }

    public BaiduAccountQueryEntityWrapper queryWrapper(){
        return BaiduAccountQueryEntityWrapper.wrapper(this);
    }

    public BaiduAccountUpdateEntityWrapper updateWrapper(){
        return BaiduAccountUpdateEntityWrapper.wrapper(this);
    }

    public static BaiduAccountQueryWrapper qWrapper(){
        return BaiduAccountQueryWrapper.wrapper();
    }

    public static BaiduAccountUpdateWrapper uWrapper(){
        return BaiduAccountUpdateWrapper.wrapper();
    }

}
