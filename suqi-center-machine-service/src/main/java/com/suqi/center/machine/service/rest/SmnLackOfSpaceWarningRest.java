package com.suqi.center.machine.service.rest;

import com.suqi.center.common.dto.Result;
import com.suqi.center.machine.api.dto.request.SmnLackOfSpaceWarningParam;
import com.suqi.center.machine.api.query.ISmnLackOfSpaceWarningApi;
import com.suqi.center.machine.biz.service.SmnLackOfSpaceWarningService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * SMN 云机空间不足告警控制层
 * @version 1.0
 * @date 2023/4/20 15:35
 */
@RestController
@RequestMapping("/v1/machine/smn/lack/space/warning")
public class SmnLackOfSpaceWarningRest extends BaseApiController implements ISmnLackOfSpaceWarningApi {

    @Resource
    SmnLackOfSpaceWarningService smnLackOfSpaceWarningService;

    @Override
    public Result<Boolean> smnLackOfSpaceWarning(SmnLackOfSpaceWarningParam param) {
        return rest(()->{
            return smnLackOfSpaceWarningService.smnLackOfSpaceWarning(param);
        });
    }


}
