package com.suqi.center.machine.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.biz.service.CurdService;
import com.suqi.center.machine.dao.entity.TencentAccountArea;
import com.suqi.center.machine.dao.service.ITencentAccountAreaService;
import org.springframework.stereotype.Service;


/**
 * <p>
 * 腾讯账号区域表 接口
 * </p>
 *
 * @author PC001
 * @since 2023-06-09
 */
@Service
public class TencentAccountAreaCurdServiceImpl extends CurdService<TencentAccountArea, Long, ITencentAccountAreaService> {


     @Override
    protected QueryWrapper<TencentAccountArea> queryPageWrapper(TencentAccountArea q) {
        return q.queryWrapper()
                    //
                    .idEq()
                    //腾讯账号Id
                    .fkTencentAccountIdEq()
                    //box_soc的表的主键ID[用这个id做关联]
                    .fkAccountAreaIdEq()
                    //腾讯区域
                    .regionEq()
                    //创建时间
                    .createTimeGe()
                    //最后修改时间
                    .lastUpdateTimeGe()
                    //区域表ID
                    .fkPcpAreaIdEq()
                ;
    }
}