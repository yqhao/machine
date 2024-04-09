package com.suqi.center.machine.api.dto.request;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;

public class BatchSetTencentDeviceImageParam implements Serializable {

    @ApiModelProperty("实例 ID列表")
    List<String> instanceIds;


    @ApiModelProperty("公网ip列表")
    List<String> publicIps;

    @ApiModelProperty("新镜像Id")
    @NotEmpty(message = "新镜像Id不能为空")
    String imageId;

    public List<String> getInstanceIds() {
        return instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

    public List<String> getPublicIps() {
        return publicIps;
    }

    public void setPublicIps(List<String> publicIps) {
        this.publicIps = publicIps;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"instanceIds\":").append(instanceIds);
        sb.append(", \"publicIps\":").append(publicIps);
        sb.append(", \"imageId\":\"").append(imageId).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
