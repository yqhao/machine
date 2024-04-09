package com.suqi.center.machine.biz.viz.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.suqi.center.common.constant.RedissonLockKeyConstants;
import com.suqi.center.common.utils.AssertUtil;
import com.suqi.center.common.utils.SystemClock;
import com.suqi.center.machine.api.viz.dto.request.VizMcMachineStreamsInfoParam;
import com.suqi.center.machine.api.viz.dto.request.VizMcMachineStreamsSaveOrUpdateParam;
import com.suqi.center.machine.api.viz.dto.response.VizMcMachineStreamsInfoResult;
import com.suqi.center.machine.biz.viz.service.VizMcMachineStreamsRestService;
import com.suqi.center.machine.dao.constants.DBConstants;
import com.suqi.center.machine.dao.viz.entity.VizMcMachineStreams;
import com.suqi.center.machine.dao.viz.service.IVizMcMachineStreamsService;
import com.suqi.core.lock.RedissonLock;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @version 1.0
 * @date 2023/10/10 19:13
 */
@Slf4j
@Service
public class VizMcMachineStreamsRestServiceImpl implements VizMcMachineStreamsRestService {

    @Resource
    IVizMcMachineStreamsService iVizMcMachineStreamsService;

    @Resource
    RedissonLock redissonLock;

    private VizMcMachineStreamsInfoResult vizMcMachineStreamsToInfoResult(VizMcMachineStreams vizMcMachineStreams){
        if(vizMcMachineStreams == null){
            return null;
        }
        VizMcMachineStreamsInfoResult vizMcMachineStreamsInfoResult = new VizMcMachineStreamsInfoResult();
        vizMcMachineStreamsInfoResult.setId(vizMcMachineStreams.getId());
        vizMcMachineStreamsInfoResult.setFkMcMachineId(vizMcMachineStreams.getFkMcMachineId());
        vizMcMachineStreamsInfoResult.setDeviceId(vizMcMachineStreams.getDeviceId());
        vizMcMachineStreamsInfoResult.setInstanceId(vizMcMachineStreams.getInstanceId());
        vizMcMachineStreamsInfoResult.setStatus(vizMcMachineStreams.getStatus());
        vizMcMachineStreamsInfoResult.setInternalAddress(vizMcMachineStreams.getInternalAddress());
        vizMcMachineStreamsInfoResult.setInternalAport(vizMcMachineStreams.getInternalAport());
        vizMcMachineStreamsInfoResult.setInternalAtype(vizMcMachineStreams.getInternalAtype());
        vizMcMachineStreamsInfoResult.setInternalVport(vizMcMachineStreams.getInternalVport());
        vizMcMachineStreamsInfoResult.setExternalAddress(vizMcMachineStreams.getExternalAddress());
        vizMcMachineStreamsInfoResult.setExternalAport(vizMcMachineStreams.getExternalAport());
        vizMcMachineStreamsInfoResult.setExternalAtype(vizMcMachineStreams.getExternalAtype());
        vizMcMachineStreamsInfoResult.setExternalVport(vizMcMachineStreams.getExternalVport());
        vizMcMachineStreamsInfoResult.setCreateTime(vizMcMachineStreams.getCreateTime());
        vizMcMachineStreamsInfoResult.setLastUpdateTime(vizMcMachineStreams.getLastUpdateTime());
        return vizMcMachineStreamsInfoResult;
    }

    @Override
    @DS(DBConstants.SHARDING)
    public VizMcMachineStreamsInfoResult info(VizMcMachineStreamsInfoParam param) {
        VizMcMachineStreams vizMcMachineStreams = iVizMcMachineStreamsService.selectOne(e -> e.fkMcMachineIdEq(param.getFkMcMachineId())
                .deviceIdEq(param.getDeviceId())
                .instanceIdEq(param.getInstanceId()));
        return vizMcMachineStreamsToInfoResult(vizMcMachineStreams);
    }

    private void saveOrUpdateParamToVizMcMachineStreams(VizMcMachineStreams vizMcMachineStreams, VizMcMachineStreamsSaveOrUpdateParam param){
        vizMcMachineStreams.setFkMcMachineId(param.getFkMcMachineId());
        vizMcMachineStreams.setDeviceId(param.getDeviceId());
        vizMcMachineStreams.setInstanceId(param.getInstanceId());
        vizMcMachineStreams.setStatus(param.getStatus());
        vizMcMachineStreams.setInternalAddress(param.getInternalAddress());
        vizMcMachineStreams.setInternalAport(param.getInternalAport());
        vizMcMachineStreams.setInternalAtype(param.getInternalAtype());
        vizMcMachineStreams.setInternalVport(param.getInternalVport());
        vizMcMachineStreams.setExternalAddress(param.getExternalAddress());
        vizMcMachineStreams.setExternalAport(param.getExternalAport());
        vizMcMachineStreams.setExternalAtype(param.getExternalAtype());
        vizMcMachineStreams.setExternalVport(param.getExternalVport());
    }

    @Override
    @DS(DBConstants.SHARDING)
    public Boolean saveOrUpdate(VizMcMachineStreamsSaveOrUpdateParam param) {
        String lockKey = RedissonLockKeyConstants.SAVE_UPDATE_VIZ_MC_MACHINE_STREAMS + "." + param.getDeviceId();
        try {
            // 加锁
            boolean lock = redissonLock.lock(lockKey, 5, 3);
            AssertUtil.isTrue(lock, "保存或者修改机器streaming端口映射#获取锁失败!");
            VizMcMachineStreams vizMcMachineStreams = iVizMcMachineStreamsService.selectOne(e -> e.fkMcMachineIdEq(param.getFkMcMachineId())
                    .deviceIdEq(param.getDeviceId())
                    .instanceIdEq(param.getInstanceId()));
            if(vizMcMachineStreams == null){
                vizMcMachineStreams = new VizMcMachineStreams();
                vizMcMachineStreams.setCreateTime(SystemClock.date());
            }
            vizMcMachineStreams.setLastUpdateTime(SystemClock.date());
            saveOrUpdateParamToVizMcMachineStreams(vizMcMachineStreams, param);
            return iVizMcMachineStreamsService.saveOrUpdate(vizMcMachineStreams);
        }finally {
            // 释放锁
            redissonLock.unlock(lockKey);
        }
    }
}
