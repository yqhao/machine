package com.suqi.center.machine.biz.service;

import com.suqi.center.machine.api.dto.request.StatisticsDistributableNumParam;
import com.suqi.center.machine.api.dto.response.StatisticsDistributableNumResult;

/**
 * @version 1.0
 * @date 2023/9/6 17:43
 */
public interface MachineStatisticsService {

    /**
     * 获取当前可分配云机数量
     * @param param
     * @return
     */
    StatisticsDistributableNumResult getDistributableNum(StatisticsDistributableNumParam param);
}
