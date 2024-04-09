package com.suqi.center.machine.api.dto.request;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0
 * @date 2023/3/17 17:00
 */
@Data
public class QuerySysDevicesSpecParam extends Page implements Serializable {

    @ApiModelProperty("手机规格名称")
    private String phoneSpecifications;

}
