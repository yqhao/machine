package com.suqi.center.machine.biz.service;

import com.suqi.center.machine.api.dto.reponse.ReserveNumberResult;
import com.suqi.center.machine.api.dto.request.ReserveNumberParam;

/**
 * 开放式云手机独有接口接口层
 * @version 1.0
 * @date 2023/5/19 11:51
 */
public interface FixService {

    /**
     * 用于查询当前商户剩余库存数和库存数量
     * @param param
     * @return
     */
    ReserveNumberResult reserveNumber(ReserveNumberParam param);

}
