package com.suqi.center.machine.dao.mapper;

import com.suqi.center.machine.dao.dto.StatisticsDistributableNumDto;
import com.suqi.center.machine.dao.vo.StatisticsDistributableNumVo;
import org.apache.ibatis.annotations.Param;

/**
 * @version 1.0
 * @date 2023/9/6 17:45
 */
public interface MachineStatisticsMapper {

    /**
     * 获取
     * @param param
     * @return
     */
    StatisticsDistributableNumVo getDistributableNum(@Param("param") StatisticsDistributableNumDto param);

}
