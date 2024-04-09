package com.suqi.center.machine.biz.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.suqi.center.machine.api.dto.reponse.ReserveNumberResult;
import com.suqi.center.machine.api.dto.request.ReserveNumberParam;
import com.suqi.center.machine.biz.service.FixService;
import com.suqi.center.machine.dao.constants.DBConstants;
import com.suqi.center.machine.dao.entity.YunMemberUserDeviceReserve;
import com.suqi.center.machine.dao.service.IYunMemberUserDeviceReserveService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 开放式云手机独有接口接口层
 * @version 1.0
 * @date 2023/5/19 11:51
 */
@Service
@Slf4j
public class FixServiceImpl implements FixService {

    @Resource
    IYunMemberUserDeviceReserveService yunMemberUserDeviceReserveService;

    @Override
    @DS(DBConstants.POOL_SLAVE)
    public ReserveNumberResult reserveNumber(ReserveNumberParam param) {
        LambdaQueryWrapper<YunMemberUserDeviceReserve> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(YunMemberUserDeviceReserve::getFkMemberId, param.getFkMemberId())
                        .last("limit 1");
        YunMemberUserDeviceReserve one = yunMemberUserDeviceReserveService.getOne(lambdaQueryWrapper);
        ReserveNumberResult reserveNumberResult = new ReserveNumberResult();
        if(one != null){
            reserveNumberResult.setReserveNumber(one.getProductStock());
            reserveNumberResult.setLastStock(one.getLastStock());
        }
        return reserveNumberResult;
    }
}
