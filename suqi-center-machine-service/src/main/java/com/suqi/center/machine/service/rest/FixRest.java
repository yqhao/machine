package com.suqi.center.machine.service.rest;

import com.suqi.center.common.dto.Result;
import com.suqi.center.common.exception.ExceptionCode;
import com.suqi.center.machine.api.dto.reponse.ReserveNumberResult;
import com.suqi.center.machine.api.dto.request.ReserveNumberParam;
import com.suqi.center.machine.api.query.IFixApi;
import com.suqi.center.machine.biz.service.FixService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 开放式云手机独有接口控制层
 * @version 1.0
 * @date 2023/5/19 11:47
 */
@RestController
@RequestMapping("/v1/machine/fix")
public class FixRest extends BaseApiController implements IFixApi {

    @Resource
    FixService fixService;

    @Override
    public Result<ReserveNumberResult> reserveNumber(ReserveNumberParam param) {
        return rest(()->{
            if(param == null || param.getFkMemberId() == null){
                ExceptionCode.INVALID_PARAM.throwBizException();
            }
            return fixService.reserveNumber(param);
        });
    }
}
