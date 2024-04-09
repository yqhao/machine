package com.suqi.center.machine.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.suqi.center.machine.dao.wrapper.PcpAreaQueryEntityWrapper;
import com.suqi.center.machine.dao.wrapper.PcpAreaQueryWrapper;
import com.suqi.center.machine.dao.wrapper.PcpAreaUpdateEntityWrapper;
import com.suqi.center.machine.dao.wrapper.PcpAreaUpdateWrapper;
import java.io.Serializable;
import java.math.BigDecimal;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * pcp区域表（pcp_area）
 * </p>
 *
 * @author PC001
 * @since 2023-06-14
 */
@TableName("pcp_area")
@ApiModel(value = "PcpArea对象", description = "pcp区域表（pcp_area）")
public class PcpArea implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("name")
    private String name;

    @ApiModelProperty("经度")
    @TableField("lng")
    private BigDecimal lng;

    @ApiModelProperty("纬度")
    @TableField("lat")
    private BigDecimal lat;

    @TableField("code")
    private String code;

    @ApiModelProperty("区域")
    @TableField("region")
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

    /**
     * 
     */
    public static final String ID = "id";

    /**
     * 
     */
    public static final String NAME = "name";

    /**
     * 经度
     */
    public static final String LNG = "lng";

    /**
     * 纬度
     */
    public static final String LAT = "lat";

    /**
     * 
     */
    public static final String CODE = "code";

    /**
     * 区域
     */
    public static final String REGION = "region";

    @Override
    public String toString() {
        return "PcpArea{" +
            "id=" + id +
            ", name=" + name +
            ", lng=" + lng +
            ", lat=" + lat +
            ", code=" + code +
            ", region=" + region +
        "}";
    }

    public PcpAreaQueryEntityWrapper queryWrapper(){
        return PcpAreaQueryEntityWrapper.wrapper(this);
    }

    public PcpAreaUpdateEntityWrapper updateWrapper(){
        return PcpAreaUpdateEntityWrapper.wrapper(this);
    }

    public static PcpAreaQueryWrapper qWrapper(){
        return PcpAreaQueryWrapper.wrapper();
    }

    public static PcpAreaUpdateWrapper uWrapper(){
        return PcpAreaUpdateWrapper.wrapper();
    }

}
