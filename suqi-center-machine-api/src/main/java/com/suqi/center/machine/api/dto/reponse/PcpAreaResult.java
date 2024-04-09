package com.suqi.center.machine.api.dto.reponse;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

public class PcpAreaResult implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    @ApiModelProperty("区域名称")
    private String name;

    @ApiModelProperty("经度")
    private BigDecimal lng;

    @ApiModelProperty("纬度")
    private BigDecimal lat;

    @ApiModelProperty("区域编码")
    private String code;

    @ApiModelProperty("腾讯区域列表多个用,分割")
    private String region;

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
    public String getName() {
        return name;
    }

    /**
     *
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * 经度
     */
    public BigDecimal getLng() {
        return lng;
    }

    /**
     * 经度
     */
    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }
    /**
     * 纬度
     */
    public BigDecimal getLat() {
        return lat;
    }

    /**
     * 纬度
     */
    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }
    /**
     *
     */
    public String getCode() {
        return code;
    }

    /**
     *
     */
    public void setCode(String code) {
        this.code = code;
    }
    /**
     * 区域
     */
    public String getRegion() {
        return region;
    }

    /**
     * 区域
     */
    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":").append(id);
        sb.append(", \"name\":\"").append(name).append('\"');
        sb.append(", \"lng\":").append(lng);
        sb.append(", \"lat\":").append(lat);
        sb.append(", \"code\":\"").append(code).append('\"');
        sb.append(", \"region\":\"").append(region).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
