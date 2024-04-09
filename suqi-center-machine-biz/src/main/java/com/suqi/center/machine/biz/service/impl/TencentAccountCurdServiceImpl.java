package com.suqi.center.machine.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.biz.service.CurdService;
import com.suqi.center.machine.dao.entity.TencentAccount;
import com.suqi.center.machine.dao.service.ITencentAccountService;
import org.springframework.stereotype.Service;


/**
 * <p>
 * 腾讯账号表 接口
 * </p>
 *
 * @author PC001
 * @since 2023-06-09
 */
@Service
public class TencentAccountCurdServiceImpl extends CurdService<TencentAccount, Long, ITencentAccountService> {


     @Override
    protected QueryWrapper<TencentAccount> queryPageWrapper(TencentAccount q) {
        return q.queryWrapper()
                    //
                    .idEq()
                    //账号唯一标识
                    .uuidEq()
                    //腾讯云密钥Id
                    .secretIdEq()
                    //腾讯云秘钥key
                    .secretKeyEq()
                    //腾讯云请求地址
                    .endpointLike()
                    //创建时间
                    .createTimeGe()
                    //最后修改时间
                    .lastUpdateTimeGe()
                    //box_soc的表的主键ID[用这个id做关联]
                    .fkAccountIdEq()
                ;
    }
}