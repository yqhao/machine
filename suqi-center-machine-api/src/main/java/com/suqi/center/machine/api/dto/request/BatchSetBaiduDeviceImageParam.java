package com.suqi.center.machine.api.dto.request;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;

public class BatchSetBaiduDeviceImageParam implements Serializable {

    @ApiModelProperty("百度云机编码code列表")
    List<String> codes;


    @ApiModelProperty("公网ip列表")
    List<String> publicIps;

    @ApiModelProperty("镜像版本id")
    @NotEmpty(message = "新镜像版本id不能为空")
    private String imageVersionId;


    public List<String> getCodes() {
        return codes;
    }

    public void setCodes(List<String> codes) {
        this.codes = codes;
    }

    public List<String> getPublicIps() {
        return publicIps;
    }

    public void setPublicIps(List<String> publicIps) {
        this.publicIps = publicIps;
    }

    public String getImageVersionId() {
        return imageVersionId;
    }

    public void setImageVersionId(String imageVersionId) {
        this.imageVersionId = imageVersionId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"codes\":").append(codes);
        sb.append(", \"publicIps\":").append(publicIps);
        sb.append(", \"imageVersionId\":\"").append(imageVersionId).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
