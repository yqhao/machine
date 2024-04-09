package com.suqi.center.machine.dao.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "云机公网信息", description = "云机公网信息")
public class TencentDeviceIpInfoDto {

    @ApiModelProperty("实例 ID")
    @TableField("instance_id")
    private String instanceId;

    @ApiModelProperty("运营商（CTCC：电信，CMCC：移动，CUCC：联通）")
    @TableField("isp")
    String isp;

    @ApiModelProperty("公网IP")
    @TableField("public_ip")
    String publicIp;

    @ApiModelProperty("端口")
    @TableField("public_port")
    Integer publicPort;

}
