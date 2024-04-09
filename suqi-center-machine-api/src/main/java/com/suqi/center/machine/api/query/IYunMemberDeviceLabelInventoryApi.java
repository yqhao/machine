package com.suqi.center.machine.api.query;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.common.dto.Result;
import com.suqi.center.machine.api.dto.request.MemberDeviceLabelInventoryAddOrDelParam;
import com.suqi.center.machine.api.dto.request.MemberDeviceLabelInventoryAddOrUpdParam;
import com.suqi.center.machine.api.dto.request.MemberDeviceLabelInventoryCalibrateParam;
import com.suqi.center.machine.api.dto.request.MemberDeviceLabelInventoryPageParam;
import com.suqi.center.machine.api.dto.response.MemberDeviceLabelInventoryPageResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @version 1.0
 * @date 2023/9/4 15:55
 */
@Api(tags = {"商户设备标签库存管理"})
@FeignClient(
        name = "suqi-center-machine",
        path = "/v1/machine/member/device/label/inventory",
        url = ""
)
public interface IYunMemberDeviceLabelInventoryApi {

    @PostMapping("page")
    @ApiOperation(value = "分页查询商户设备标签库存", notes = "分页查询商户设备标签库存")
    Result<Page<MemberDeviceLabelInventoryPageResult>> page(@RequestBody MemberDeviceLabelInventoryPageParam params);

    @PostMapping("addOrUpd")
    @ApiOperation(value = "添加或者修改商户设备标签库存", notes = "添加或者修改商户设备标签库存")
    Result<Boolean> addOrUpd(@RequestBody MemberDeviceLabelInventoryAddOrUpdParam params);

    @PostMapping("addOrDel")
    @ApiOperation(value = "添加或者删减商户设备标签库存", notes = "添加或者删减商户设备标签库存")
    Result<Boolean> addOrDel(@RequestBody MemberDeviceLabelInventoryAddOrDelParam params);

    @PostMapping("calibrate")
    @ApiOperation(value = "校准当前商户设备标签库存", notes = "校准当前商户设备标签库存")
    Result<Boolean> calibrate(@RequestBody MemberDeviceLabelInventoryCalibrateParam params);
}
