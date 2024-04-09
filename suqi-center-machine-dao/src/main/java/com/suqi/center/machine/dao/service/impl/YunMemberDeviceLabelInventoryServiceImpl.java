package com.suqi.center.machine.dao.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.suqi.center.common.constant.RedisKeyNameConstants;
import com.suqi.center.common.constant.RedissonLockKeyConstants;
import com.suqi.center.common.exception.BizException;
import com.suqi.center.common.exception.ExceptionCode;
import com.suqi.center.common.utils.AssertUtil;
import com.suqi.center.common.utils.SystemClock;
import com.suqi.center.machine.dao.constants.DBConstants;
import com.suqi.center.machine.dao.entity.YunMemberDeviceLabelInventory;
import com.suqi.center.machine.dao.entity.YunMemberUserDevice;
import com.suqi.center.machine.dao.mapper.YunMemberDeviceLabelInventoryMapper;
import com.suqi.center.machine.dao.service.IYunMemberDeviceLabelInventoryService;
import com.suqi.center.machine.dao.service.IYunMemberUserDeviceService;
import com.suqi.core.lock.RedissonLock;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 商户设备标签库存表 服务实现类
 * </p>
 *
 * @author PC001
 * @since 2023-09-04
 */
@Service
@Slf4j
public class YunMemberDeviceLabelInventoryServiceImpl extends ServiceImpl<YunMemberDeviceLabelInventoryMapper, YunMemberDeviceLabelInventory> implements IYunMemberDeviceLabelInventoryService {
    @Resource
    RedissonLock redissonLock;

    @Resource
    RedisTemplate<String,Object> redisTemplate;

    @Resource
    IYunMemberUserDeviceService iYunMemberUserDeviceService;

    @Override
    @DS(DBConstants.POOL_MASTER)
    public Boolean initMemberDeviceLabelInventory(Long fkMemberId, Long fkSysDeviceLabelId, Integer productStock) {
        YunMemberDeviceLabelInventory yunMemberDeviceLabelInventory = new YunMemberDeviceLabelInventory();
        yunMemberDeviceLabelInventory.setFkSysDeviceLabelId(fkSysDeviceLabelId);
        yunMemberDeviceLabelInventory.setFkMemberId(fkMemberId);
        yunMemberDeviceLabelInventory.setProductStock(productStock);
        yunMemberDeviceLabelInventory.setLastStock(productStock);
        yunMemberDeviceLabelInventory.setCreateTime(SystemClock.date());
        yunMemberDeviceLabelInventory.setLastUpdateTime(SystemClock.date());
        yunMemberDeviceLabelInventory.setVersionId(0L);
        boolean save = save(yunMemberDeviceLabelInventory);
        if(save){
            // 开始更新库存缓存
            String inventoryKey = RedisKeyNameConstants.MEMBER_DEVICE_LABEL_INVENTORY + "." + fkMemberId + "." + fkSysDeviceLabelId;
            log.info("开始更新redis缓存key：{}，lastStock：{}", inventoryKey, yunMemberDeviceLabelInventory.getLastStock());
            redisTemplate.opsForValue().set(inventoryKey, yunMemberDeviceLabelInventory.getLastStock());
        }
        return save;
    }

    @Override
    @DS(DBConstants.POOL_MASTER)
    public Boolean updateInventory(Long fkMemberId, Long fkSysDeviceLabelId, Integer productStock) {
        String lockKey = RedissonLockKeyConstants.MEMBER_DEVICE_LABEL_INVENTORY_LOCK + "." + fkMemberId + "." + fkSysDeviceLabelId;
        try {
            // 加锁
            boolean lock = redissonLock.lock(lockKey, 5, 3);
            AssertUtil.isTrue(lock, "checkLicence#获取锁失败!");
            LambdaQueryWrapper<YunMemberDeviceLabelInventory> lambdaQueryWrapper = new LambdaQueryWrapper<>();
            lambdaQueryWrapper.eq(YunMemberDeviceLabelInventory::getFkMemberId, fkMemberId)
                    .eq(YunMemberDeviceLabelInventory::getFkSysDeviceLabelId, fkSysDeviceLabelId);
            YunMemberDeviceLabelInventory yunMemberDeviceLabelInventory = this.getOne(lambdaQueryWrapper, false);
            if (yunMemberDeviceLabelInventory == null) {
                ExceptionCode.RECORD_DOES_NOT_EXIST.throwBizException();
            }
            Integer oldProductStock = yunMemberDeviceLabelInventory.getProductStock();
            Integer addStock = productStock - oldProductStock;
            if(addStock < 0){
                if((yunMemberDeviceLabelInventory.getLastStock() + addStock) < 0){
                    throw new  BizException("当前可用库存不满足缩减库存！");
                }
            }
            LambdaUpdateWrapper<YunMemberDeviceLabelInventory> lambdaUpdateWrapper = new LambdaUpdateWrapper<>();
            lambdaUpdateWrapper.eq(YunMemberDeviceLabelInventory::getId, yunMemberDeviceLabelInventory.getId())
                    .eq(YunMemberDeviceLabelInventory::getVersionId, yunMemberDeviceLabelInventory.getVersionId());
            YunMemberDeviceLabelInventory up = new YunMemberDeviceLabelInventory();
            up.setProductStock(productStock);
            up.setLastStock(yunMemberDeviceLabelInventory.getLastStock() + addStock);
            up.setVersionId(yunMemberDeviceLabelInventory.getVersionId() + 1);
            up.setLastUpdateTime(SystemClock.date());
            boolean update = this.update(up, lambdaUpdateWrapper);
            if(update){
                // 开始更新库存缓存
                String inventoryKey = RedisKeyNameConstants.MEMBER_DEVICE_LABEL_INVENTORY + "." + fkMemberId + "." + fkSysDeviceLabelId;
                log.info("开始更新redis缓存key：{}，lastStock：{}", inventoryKey, up.getLastStock());
                redisTemplate.opsForValue().set(inventoryKey, up.getLastStock());
            }
            return update;
        }finally {
            // 释放锁
            redissonLock.unlock(lockKey);
        }
    }

    @Override
    @DS(DBConstants.POOL_MASTER)
    public Boolean addOrDel(Long fkMemberId, Long fkSysDeviceLabelId, Integer inventory) {
        String lockKey = RedissonLockKeyConstants.MEMBER_DEVICE_LABEL_INVENTORY_LOCK + "." + fkMemberId + "." + fkSysDeviceLabelId;
        try {
            // 加锁
            boolean lock = redissonLock.lock(lockKey, 5, 3);
            AssertUtil.isTrue(lock, "checkLicence#获取锁失败!");
            LambdaQueryWrapper<YunMemberDeviceLabelInventory> lambdaQueryWrapper = new LambdaQueryWrapper<>();
            lambdaQueryWrapper.eq(YunMemberDeviceLabelInventory::getFkMemberId, fkMemberId)
                    .eq(YunMemberDeviceLabelInventory::getFkSysDeviceLabelId, fkSysDeviceLabelId);
            YunMemberDeviceLabelInventory yunMemberDeviceLabelInventory = this.getOne(lambdaQueryWrapper, false);
            if (yunMemberDeviceLabelInventory == null) {
                ExceptionCode.RECORD_DOES_NOT_EXIST.throwBizException();
            }
            int addStock = yunMemberDeviceLabelInventory.getLastStock() + inventory;
            if(addStock < 0){
                throw new BizException("库存不足！");
            }
            if(addStock > yunMemberDeviceLabelInventory.getProductStock()){
                throw new BizException("剩余库存大于总库存！");
            }
            LambdaUpdateWrapper<YunMemberDeviceLabelInventory> lambdaUpdateWrapper = new LambdaUpdateWrapper<>();
            lambdaUpdateWrapper.eq(YunMemberDeviceLabelInventory::getId, yunMemberDeviceLabelInventory.getId())
                    .eq(YunMemberDeviceLabelInventory::getVersionId, yunMemberDeviceLabelInventory.getVersionId());
            YunMemberDeviceLabelInventory up = new YunMemberDeviceLabelInventory();
            up.setLastStock(addStock);
            up.setVersionId(yunMemberDeviceLabelInventory.getVersionId() + 1);
            up.setLastUpdateTime(SystemClock.date());
            boolean update = this.update(up, lambdaUpdateWrapper);
            if(update){
                // 开始更新库存缓存
                String inventoryKey = RedisKeyNameConstants.MEMBER_DEVICE_LABEL_INVENTORY + "." + fkMemberId + "." + fkSysDeviceLabelId;
                log.info("开始更新redis缓存key：{}，lastStock：{}", inventoryKey, up.getLastStock());
                redisTemplate.opsForValue().set(inventoryKey, up.getLastStock());
            }
            return update;
        }finally {
            // 释放锁
            redissonLock.unlock(lockKey);
        }
    }

    @Override
    @DS(DBConstants.POOL_MASTER)
    public Boolean calibrate(Long fkMemberId, Long fkSysDeviceLabelId) {
        String lockKey = RedissonLockKeyConstants.MEMBER_DEVICE_LABEL_INVENTORY_LOCK + "." + fkMemberId + "." + fkSysDeviceLabelId;
        try {
            // 加锁
            boolean lock = redissonLock.lock(lockKey, 5, 3);
            AssertUtil.isTrue(lock, "checkLicence#获取锁失败!");
            LambdaQueryWrapper<YunMemberDeviceLabelInventory> lambdaQueryWrapper = new LambdaQueryWrapper<>();
            lambdaQueryWrapper.eq(YunMemberDeviceLabelInventory::getFkMemberId, fkMemberId)
                    .eq(YunMemberDeviceLabelInventory::getFkSysDeviceLabelId, fkSysDeviceLabelId);
            YunMemberDeviceLabelInventory yunMemberDeviceLabelInventory = this.getOne(lambdaQueryWrapper, false);
            if (yunMemberDeviceLabelInventory == null) {
                ExceptionCode.RECORD_DOES_NOT_EXIST.throwBizException();
            }
            LambdaQueryWrapper<YunMemberUserDevice> yunMemberUserDeviceLambdaQueryWrapper = new LambdaQueryWrapper<>();
            yunMemberUserDeviceLambdaQueryWrapper.eq(YunMemberUserDevice::getFkMemberId, yunMemberDeviceLabelInventory.getFkMemberId())
                    .eq(YunMemberUserDevice::getFkSysDeviceLabelId, yunMemberDeviceLabelInventory.getFkSysDeviceLabelId())
                    .eq(YunMemberUserDevice::getStatus, 50);
            Long count = iYunMemberUserDeviceService.count(yunMemberUserDeviceLambdaQueryWrapper);
            Integer inventory = yunMemberDeviceLabelInventory.getProductStock();
            if(count != 0){
                if(yunMemberDeviceLabelInventory.getProductStock() < count){
                    throw new BizException("已分配数量大于设置总库存！");
                }
                inventory = yunMemberDeviceLabelInventory.getProductStock() - count.intValue();
            }
            LambdaUpdateWrapper<YunMemberDeviceLabelInventory> lambdaUpdateWrapper = new LambdaUpdateWrapper<>();
            lambdaUpdateWrapper.eq(YunMemberDeviceLabelInventory::getId, yunMemberDeviceLabelInventory.getId())
                    .eq(YunMemberDeviceLabelInventory::getVersionId, yunMemberDeviceLabelInventory.getVersionId());
            YunMemberDeviceLabelInventory up = new YunMemberDeviceLabelInventory();
            up.setLastStock(inventory);
            up.setVersionId(yunMemberDeviceLabelInventory.getVersionId() + 1);
            up.setLastUpdateTime(SystemClock.date());
            boolean update = this.update(up, lambdaUpdateWrapper);
            if(update){
                // 开始更新库存缓存
                String inventoryKey = RedisKeyNameConstants.MEMBER_DEVICE_LABEL_INVENTORY + "." + fkMemberId + "." + fkSysDeviceLabelId;
                log.info("开始更新redis缓存key：{}，lastStock：{}", inventoryKey, up.getLastStock());
                redisTemplate.opsForValue().set(inventoryKey, up.getLastStock());
            }
            return update;

        }finally {
            // 释放锁
            redissonLock.unlock(lockKey);
        }
    }
}
