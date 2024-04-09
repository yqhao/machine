package com.suqi.center.machine.biz.service;

import java.util.Set;

public interface OverrideCacheService {

    /**
     * 新增userPhoneId重写/check/reconnect返回结果
     * @param userPhoneId
     * @return
     */
    boolean addPhoneId(String userPhoneId);

    /**
     * 删除userPhoneId重写/check/reconnect返回结果
     * @param userPhoneId
     * @return
     */
    boolean removePhoneId(String userPhoneId);

    /**
     * 检测userPhoneId是否需要重写/check/reconnect返回结果
     * @param userPhoneId
     * @return
     */
    boolean isOverrideResult(String userPhoneId);


    /**
     * 获取所有重写的userPhoneId列表
     * @return
     */
    Set<String> allOverridePhoneIds();


    boolean addPhoneIdMoveDeviceTaskRunning(String userPhoneId);

    boolean removePhoneIdMoveDeviceTaskRunning(String userPhoneId);

}
