package com.suqi.center.machine.api.dto.request;

import java.io.Serializable;
import java.math.BigDecimal;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import com.suqi.center.common.dto.ValidationGroups;

/**
 * <p>
 * pcp区域表（pcp_area）
 * </p>
 *
 * @author PC001
 * @since 2023-06-12
 */
@ApiModel(value = "PcpArea对象", description = "pcp区域表（pcp_area）")
public class PcpAreaParam implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull(groups = ValidationGroups.Update.class, message = "id不能为空")
    private Long id;

    private String name;

    @ApiModelProperty("经度")
    private BigDecimal lng;

    @ApiModelProperty("纬度")
    private BigDecimal lat;

    private String code;

    @ApiModelProperty("区域")
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
        return "PcpArea{" +
            "id=" + id +
            ", name=" + name +
            ", lng=" + lng +
            ", lat=" + lat +
            ", code=" + code +
            ", region=" + region +
        "}";
    }



}
