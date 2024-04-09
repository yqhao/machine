package com.suqi.center.machine.biz.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.suqi.center.machine.api.dto.request.StatisticsDistributableNumParam;
import com.suqi.center.machine.api.dto.response.StatisticsDistributableNumResult;
import com.suqi.center.machine.biz.service.MachineStatisticsService;
import com.suqi.center.machine.dao.constants.DBConstants;
import com.suqi.center.machine.dao.dto.StatisticsDistributableNumDto;
import com.suqi.center.machine.dao.mapper.MachineStatisticsMapper;
import com.suqi.center.machine.dao.vo.StatisticsDistributableNumVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @version 1.0
 * @date 2023/9/6 17:43
 */
@Service
public class MachineStatisticsServiceImpl implements MachineStatisticsService {

    @Resource
    MachineStatisticsMapper machineStatisticsMapper;

    @Override
    @DS(DBConstants.SLAVE)
    public StatisticsDistributableNumResult getDistributableNum(StatisticsDistributableNumParam param) {
        StatisticsDistributableNumDto statisticsGetStatusDto = statisticsGetStatusParamToDto(param);
        StatisticsDistributableNumVo statisticsGetStatusVo = machineStatisticsMapper.getDistributableNum(statisticsGetStatusDto);
        return statisticsGetStatusVoToResult(statisticsGetStatusVo);
    }

    private StatisticsDistributableNumDto statisticsGetStatusParamToDto(StatisticsDistributableNumParam param){
        StatisticsDistributableNumDto statisticsGetStatusDto = new StatisticsDistributableNumDto();
        statisticsGetStatusDto.setTenantId(param.getTenantId());
        statisticsGetStatusDto.setQueueType(param.getQueueType());
        return statisticsGetStatusDto;
    }

    private StatisticsDistributableNumResult statisticsGetStatusVoToResult(StatisticsDistributableNumVo statisticsGetStatusVo){
        StatisticsDistributableNumResult statisticsDistributableNumResult = new StatisticsDistributableNumResult();
        statisticsDistributableNumResult.setDistributableNum(statisticsGetStatusVo.getDistributableNum());
        return statisticsDistributableNumResult;
    }

}
