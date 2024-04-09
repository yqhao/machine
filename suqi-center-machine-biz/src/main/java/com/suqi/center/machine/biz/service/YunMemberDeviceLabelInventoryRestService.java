package com.suqi.center.machine.biz.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.machine.api.dto.request.MemberDeviceLabelInventoryAddOrDelParam;
import com.suqi.center.machine.api.dto.request.MemberDeviceLabelInventoryAddOrUpdParam;
import com.suqi.center.machine.api.dto.request.MemberDeviceLabelInventoryCalibrateParam;
import com.suqi.center.machine.api.dto.request.MemberDeviceLabelInventoryPageParam;
import com.suqi.center.machine.api.dto.response.MemberDeviceLabelInventoryPageResult;

/**
 * @version 1.0
 * @date 2023/9/4 16:10
 */
public interface YunMemberDeviceLabelInventoryRestService {

    /**
     * 分页查询商户设备标签库存
     * @param params
     * @return
     */
    Page<MemberDeviceLabelInventoryPageResult> page(MemberDeviceLabelInventoryPageParam params);

    /**
     * 添加或者修改商户设备标签库存
     * @param params
     * @return
     */
    Boolean addOrUpd(MemberDeviceLabelInventoryAddOrUpdParam params);

    /**
     * 添加或者删减商户设备标签库存
     * @param params
     * @return
     */
    Boolean addOrDel(MemberDeviceLabelInventoryAddOrDelParam params);

    /**
     * 校准当前商户设备标签库存
     * @param params
     * @return
     */
    Boolean calibrate(MemberDeviceLabelInventoryCalibrateParam params);
}
