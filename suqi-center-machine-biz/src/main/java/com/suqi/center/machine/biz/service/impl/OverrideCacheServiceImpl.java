package com.suqi.center.machine.biz.service.impl;

import com.suqi.center.machine.biz.service.OverrideCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @author PC001
 */
@Service
public class OverrideCacheServiceImpl implements OverrideCacheService {
    static final String overridePhoneCacheKey = "override.move.device.list";

    static final String moveTaskPreFixKey = "override.move.device.task.";

    @Autowired
    RedisTemplate redisTemplate;

    /**
     * 新增phoneId重写/check/reconnect返回结果
     *
     * @param phoneId
     * @return
     */
    @Override
    public boolean addPhoneId(String phoneId) {
        addPhoneIdMoveDeviceTaskRunning(phoneId);
        Long rs = redisTemplate.opsForSet().add(overridePhoneCacheKey, phoneId);
        return rs != null && rs > 0L;
    }

    /**
     * 删除phoneId重写/check/reconnect返回结果
     *
     * @param phoneId
     * @return
     */
    @Override
    public boolean removePhoneId(String phoneId) {
        Long rs = redisTemplate.opsForSet().remove(overridePhoneCacheKey, phoneId);
        return rs != null && rs > 0L;
    }

    /**
     * 检测phoneId是否需要重写/check/reconnect返回结果
     *
     * @param phoneId
     * @return
     */
    @Override
    public boolean isOverrideResult(String phoneId) {
        Boolean member = redisTemplate.opsForSet().isMember(overridePhoneCacheKey, phoneId);
        return member != null && member;
    }

    /**
     * 获取所有重写的userPhoneId列表
     * @return
     */
    @Override
    public Set<String> allOverridePhoneIds() {
        return redisTemplate.opsForSet().members(overridePhoneCacheKey);
    }


    @Override
    public boolean addPhoneIdMoveDeviceTaskRunning(String userPhoneId) {
        redisTemplate.opsForValue().set(moveTaskPreFixKey+userPhoneId, true,48L, TimeUnit.HOURS);
        return true;
    }

    @Override
    public boolean removePhoneIdMoveDeviceTaskRunning(String userPhoneId) {
        redisTemplate.unlink(moveTaskPreFixKey+userPhoneId);
        return true;
    }
}
