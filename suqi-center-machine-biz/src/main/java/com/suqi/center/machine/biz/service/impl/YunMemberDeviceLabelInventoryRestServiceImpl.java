package com.suqi.center.machine.biz.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.common.exception.BizException;
import com.suqi.center.common.exception.ExceptionCode;
import com.suqi.center.machine.api.dto.request.MemberDeviceLabelInventoryAddOrDelParam;
import com.suqi.center.machine.api.dto.request.MemberDeviceLabelInventoryAddOrUpdParam;
import com.suqi.center.machine.api.dto.request.MemberDeviceLabelInventoryCalibrateParam;
import com.suqi.center.machine.api.dto.request.MemberDeviceLabelInventoryPageParam;
import com.suqi.center.machine.api.dto.response.MemberDeviceLabelInventoryPageResult;
import com.suqi.center.machine.biz.service.YunMemberDeviceLabelInventoryRestService;
import com.suqi.center.machine.dao.constants.DBConstants;
import com.suqi.center.machine.dao.entity.SysDeviceLabel;
import com.suqi.center.machine.dao.entity.YunMemberDeviceLabelInventory;
import com.suqi.center.machine.dao.entity.YunMemberUserDeviceReserve;
import com.suqi.center.machine.dao.service.ISysDeviceLabelService;
import com.suqi.center.machine.dao.service.IYunMemberDeviceLabelInventoryService;
import com.suqi.center.machine.dao.service.IYunMemberUserDeviceReserveService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @version 1.0
 * @date 2023/9/4 16:10
 */
@Service
public class YunMemberDeviceLabelInventoryRestServiceImpl implements YunMemberDeviceLabelInventoryRestService {

    @Resource
    IYunMemberDeviceLabelInventoryService yunMemberDeviceLabelInventoryService;

    @Resource
    ISysDeviceLabelService iSysDeviceLabelService;

    @Resource
    IYunMemberDeviceLabelInventoryService iYunMemberDeviceLabelInventoryService;

    @Resource
    IYunMemberUserDeviceReserveService iYunMemberUserDeviceReserveService;

    @Override
    @DS(DBConstants.POOL_SLAVE)
    public Page<MemberDeviceLabelInventoryPageResult> page(MemberDeviceLabelInventoryPageParam params) {
        Page<YunMemberDeviceLabelInventory> page = new Page<>(params.getCurrent(), params.getSize());
        LambdaQueryWrapper<YunMemberDeviceLabelInventory> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        if(params.getFkMemberId() != null) {
            lambdaQueryWrapper.eq(YunMemberDeviceLabelInventory::getFkMemberId, params.getFkMemberId());
        }
        if(params.getFkSysDeviceLabelId() != null) {
            lambdaQueryWrapper.eq(YunMemberDeviceLabelInventory::getFkSysDeviceLabelId, params.getFkSysDeviceLabelId());
        }
        Page<YunMemberDeviceLabelInventory> resultPage = yunMemberDeviceLabelInventoryService.page(page, lambdaQueryWrapper);
        Page<MemberDeviceLabelInventoryPageResult> result = new Page<>(resultPage.getCurrent(), resultPage.getSize(), resultPage.getTotal());
        if(resultPage.getRecords() != null && !resultPage.getRecords().isEmpty()){
            List<MemberDeviceLabelInventoryPageResult> records = new ArrayList<>();
            List<Long> fkSysDeviceLabelIds = resultPage.getRecords().stream().map(YunMemberDeviceLabelInventory::getFkSysDeviceLabelId).toList();
            Map<Long, SysDeviceLabel> mapByIds = iSysDeviceLabelService.getMapByIds(fkSysDeviceLabelIds);
            for(YunMemberDeviceLabelInventory yunMemberDeviceLabelInventory : resultPage.getRecords()){
                MemberDeviceLabelInventoryPageResult memberDeviceLabelInventoryPageResult = yunMemberDeviceLabelInventoryToPageResult(yunMemberDeviceLabelInventory);
                SysDeviceLabel sysDeviceLabel = mapByIds.get(yunMemberDeviceLabelInventory.getFkSysDeviceLabelId());
                if(sysDeviceLabel != null) {
                    memberDeviceLabelInventoryPageResult.setSysDeviceLabelName(sysDeviceLabel.getLabelName());
                }
                records.add(memberDeviceLabelInventoryPageResult);
            }
            result.setRecords(records);
        }
        return result;
    }

    private MemberDeviceLabelInventoryPageResult yunMemberDeviceLabelInventoryToPageResult(YunMemberDeviceLabelInventory yunMemberDeviceLabelInventory){
        MemberDeviceLabelInventoryPageResult memberDeviceLabelInventoryPageResult = new MemberDeviceLabelInventoryPageResult();
        memberDeviceLabelInventoryPageResult.setId(yunMemberDeviceLabelInventory.getId());
        memberDeviceLabelInventoryPageResult.setFkMemberId(yunMemberDeviceLabelInventory.getFkMemberId());
        memberDeviceLabelInventoryPageResult.setFkSysDeviceLabelId(yunMemberDeviceLabelInventory.getFkSysDeviceLabelId());
        memberDeviceLabelInventoryPageResult.setProductStock(yunMemberDeviceLabelInventory.getProductStock());
        memberDeviceLabelInventoryPageResult.setLastStock(yunMemberDeviceLabelInventory.getLastStock());
        memberDeviceLabelInventoryPageResult.setCreateTime(yunMemberDeviceLabelInventory.getCreateTime());
        memberDeviceLabelInventoryPageResult.setLastUpdateTime(yunMemberDeviceLabelInventory.getLastUpdateTime());
        return memberDeviceLabelInventoryPageResult;
    }

    @Override
    @DS(DBConstants.POOL_SLAVE)
    public Boolean addOrUpd(MemberDeviceLabelInventoryAddOrUpdParam params) {
        if(params.getFkSysDeviceLabelId() != null) {
            SysDeviceLabel one = iSysDeviceLabelService.getInfoById(params.getFkSysDeviceLabelId());
            if (one == null) {
                throw new BizException("标签记录不存在");
            }
        }
        LambdaQueryWrapper<YunMemberUserDeviceReserve> yunMemberUserDeviceReserveLambdaQueryWrapper = new LambdaQueryWrapper<>();
        yunMemberUserDeviceReserveLambdaQueryWrapper.eq(YunMemberUserDeviceReserve::getFkMemberId, params.getFkMemberId());
        YunMemberUserDeviceReserve yunMemberUserDeviceReserve = iYunMemberUserDeviceReserveService.getOne(yunMemberUserDeviceReserveLambdaQueryWrapper, false);
        if(yunMemberUserDeviceReserve == null){
            throw new BizException("总库存记录不存在");
        }
        LambdaQueryWrapper<YunMemberDeviceLabelInventory> yunMemberDeviceLabelInventoryLambdaQueryWrapper = new LambdaQueryWrapper<>();
        yunMemberDeviceLabelInventoryLambdaQueryWrapper.eq(YunMemberDeviceLabelInventory::getFkMemberId, params.getFkMemberId());
        List<YunMemberDeviceLabelInventory> list = iYunMemberDeviceLabelInventoryService.list(yunMemberDeviceLabelInventoryLambdaQueryWrapper);
        int collect = 0;
        // 判断标签库存是否超过总库存
        if(params.getId() != null){
            if(!list.isEmpty()){
                collect = list.stream().filter(e->!e.getId().equals(params.getId())).mapToInt(YunMemberDeviceLabelInventory::getProductStock).sum();
            }
            if((collect + params.getProductStock()) > yunMemberUserDeviceReserve.getProductStock()){
                throw new BizException("设置失败，所有标签库存大于总库存！");
            }
            LambdaQueryWrapper<YunMemberDeviceLabelInventory> lambdaQueryWrapper = new LambdaQueryWrapper<>();
            lambdaQueryWrapper.eq(YunMemberDeviceLabelInventory::getId, params.getId());
            YunMemberDeviceLabelInventory yunMemberDeviceLabelInventory = iYunMemberDeviceLabelInventoryService.getOne(lambdaQueryWrapper, false);
            if (yunMemberDeviceLabelInventory == null) {
                ExceptionCode.RECORD_DOES_NOT_EXIST.throwBizException();
            }
            // 修改
            return iYunMemberDeviceLabelInventoryService.updateInventory(yunMemberDeviceLabelInventory.getFkMemberId(), yunMemberDeviceLabelInventory.getFkSysDeviceLabelId(), params.getProductStock());
        }else {
            if(!list.isEmpty()){
                collect = list.stream().mapToInt(YunMemberDeviceLabelInventory::getProductStock).sum();
            }
            if((collect + params.getProductStock()) > yunMemberUserDeviceReserve.getProductStock()){
                throw new BizException("设置失败，所有标签库存大于总库存！");
            }
            // 添加
            LambdaQueryWrapper<YunMemberDeviceLabelInventory> lambdaQueryWrapper = new LambdaQueryWrapper<>();
            lambdaQueryWrapper.eq(YunMemberDeviceLabelInventory::getFkMemberId, params.getFkMemberId())
                    .eq(YunMemberDeviceLabelInventory::getFkSysDeviceLabelId, params.getFkSysDeviceLabelId());
            YunMemberDeviceLabelInventory yunMemberDeviceLabelInventory = iYunMemberDeviceLabelInventoryService.getOne(lambdaQueryWrapper, false);
            if(yunMemberDeviceLabelInventory != null){
                ExceptionCode.DUPLICATE_INSERTS_OF_DATA_ARE_NOT_ALLOWED.throwBizException();
            }
            return iYunMemberDeviceLabelInventoryService.initMemberDeviceLabelInventory(params.getFkMemberId(), params.getFkSysDeviceLabelId(), params.getProductStock());
        }
    }

    @Override
    public Boolean addOrDel(MemberDeviceLabelInventoryAddOrDelParam params) {
        return iYunMemberDeviceLabelInventoryService.addOrDel(params.getFkMemberId(), params.getFkSysDeviceLabelId(), params.getInventory());
    }

    @Override
    @DS(DBConstants.POOL_SLAVE)
    public Boolean calibrate(MemberDeviceLabelInventoryCalibrateParam params) {
        LambdaQueryWrapper<YunMemberDeviceLabelInventory> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(YunMemberDeviceLabelInventory::getId, params.getFkYunMemberDeviceLabelInventoryId());
        YunMemberDeviceLabelInventory yunMemberDeviceLabelInventory = iYunMemberDeviceLabelInventoryService.getOne(lambdaQueryWrapper, false);
        if (yunMemberDeviceLabelInventory == null) {
            ExceptionCode.RECORD_DOES_NOT_EXIST.throwBizException();
        }
        return iYunMemberDeviceLabelInventoryService.calibrate(yunMemberDeviceLabelInventory.getFkMemberId(), yunMemberDeviceLabelInventory.getFkSysDeviceLabelId());
    }


}
