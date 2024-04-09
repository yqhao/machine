package com.suqi.center.machine.service.rest.old;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.common.dto.Result;
import com.suqi.center.machine.api.dto.request.MemberDeviceLabelInventoryAddOrDelParam;
import com.suqi.center.machine.api.dto.request.MemberDeviceLabelInventoryAddOrUpdParam;
import com.suqi.center.machine.api.dto.request.MemberDeviceLabelInventoryCalibrateParam;
import com.suqi.center.machine.api.dto.request.MemberDeviceLabelInventoryPageParam;
import com.suqi.center.machine.api.dto.response.MemberDeviceLabelInventoryPageResult;
import com.suqi.center.machine.api.query.IYunMemberDeviceLabelInventoryApi;
import com.suqi.center.machine.biz.service.YunMemberDeviceLabelInventoryRestService;
import com.suqi.center.machine.service.rest.BaseApiController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @version 1.0
 * @date 2023/9/4 15:57
 */
@RestController
@RequestMapping("/v1/machine/member/device/label/inventory")
public class YunMemberDeviceLabelInventoryRest extends BaseApiController implements IYunMemberDeviceLabelInventoryApi {

    @Resource
    YunMemberDeviceLabelInventoryRestService yunMemberDeviceLabelInventoryRestService;

    @Override
    public Result<Page<MemberDeviceLabelInventoryPageResult>> page(MemberDeviceLabelInventoryPageParam params) {
        return rest(()->yunMemberDeviceLabelInventoryRestService.page(params));
    }

    @Override
    public Result<Boolean> addOrUpd(MemberDeviceLabelInventoryAddOrUpdParam params) {
        return rest(()->yunMemberDeviceLabelInventoryRestService.addOrUpd(params));
    }

    @Override
    public Result<Boolean> addOrDel(MemberDeviceLabelInventoryAddOrDelParam params) {
        return rest(()->yunMemberDeviceLabelInventoryRestService.addOrDel(params));
    }

    @Override
    public Result<Boolean> calibrate(MemberDeviceLabelInventoryCalibrateParam params) {
        return rest(()->yunMemberDeviceLabelInventoryRestService.calibrate(params));
    }
}
