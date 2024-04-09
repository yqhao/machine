package com.suqi.center.machine.api.dto.response;

import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * <p>
 * 百度账号表
 * </p>
 *
 * @author PC001
 * @since 2023-08-25
 */
@ApiModel(value = "BaiduAccount对象", description = "百度账号表")
public class BaiduAccountResult implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String mobile;

    private String accountName;

    private String host;

    private String bearerToken;

    @ApiModelProperty("token过期时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date tokenExpire;

    @ApiModelProperty("根分组")
    private String rootGroupCode;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date lastUpdateTime;

    @ApiModelProperty("刷新token")
    private String refreshToken;

    @ApiModelProperty("刷新token过期时间")
    private String refreshtokenExpire;

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
     */
    public String getMobile() {
        return mobile;
    }

    /**
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     */
    public String getHost() {
        return host;
    }

    /**
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     */
    public String getBearerToken() {
        return bearerToken;
    }

    /**
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
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
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

    @Override
    public String toString() {
        return "BaiduAccount{" + "id=" + id + ", mobile=" + mobile + ", accountName=" + accountName + ", host=" + host + ", bearerToken=" + bearerToken + ", tokenExpire=" + tokenExpire + ", rootGroupCode=" + rootGroupCode + ", createTime=" + createTime + ", lastUpdateTime=" + lastUpdateTime + ", refreshToken=" + refreshToken + ", refreshtokenExpire=" + refreshtokenExpire + "}";
    }
}
