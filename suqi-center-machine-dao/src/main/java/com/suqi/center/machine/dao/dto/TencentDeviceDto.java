package com.suqi.center.machine.dao.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.suqi.center.machine.dao.entity.TencentDevice;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.util.List;

@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "云机公网信息", description = "云机公网信息")
public class TencentDeviceDto extends TencentDevice {

    @ApiModelProperty("公网信息")
    @TableField(exist = false)
    List<TencentDeviceIpInfoDto> publicIps;

}
