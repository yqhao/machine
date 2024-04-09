package com.suqi.center.machine.dao.service;

import com.suqi.center.machine.dao.entity.YunMemberDeviceLabelInventory;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 商户设备标签库存表 服务类
 * </p>
 *
 * @author PC001
 * @since 2023-09-04
 */
public interface IYunMemberDeviceLabelInventoryService extends IService<YunMemberDeviceLabelInventory> {

    /**
     * 初始化 标签库存
     * @param fkMemberId
     * @param fkSysDeviceLabelId
     * @param productStock
     * @return
     */
    Boolean initMemberDeviceLabelInventory(Long fkMemberId, Long fkSysDeviceLabelId, Integer productStock);

    /**
     * 修改或者添加库存
     * @param fkMemberId
     * @param fkSysDeviceLabelId
     * @param productStock
     * @return
     */
    Boolean updateInventory(Long fkMemberId, Long fkSysDeviceLabelId, Integer productStock);

    /**
     * 添加或者删减商户设备标签库存
     * @param fkMemberId
     * @param fkSysDeviceLabelId
     * @param inventory
     * @return
     */
    Boolean addOrDel(Long fkMemberId, Long fkSysDeviceLabelId, Integer inventory);

    /**
     * 校准当前商户设备标签库存
     * @param fkMemberId
     * @param fkSysDeviceLabelId
     * @return
     */
    Boolean calibrate(Long fkMemberId, Long fkSysDeviceLabelId);


}
