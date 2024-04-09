package com.suqi.center.machine.dao.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.suqi.center.machine.dao.constants.DBConstants;
import com.suqi.center.machine.dao.entity.TencentAccount;
import com.suqi.center.machine.dao.mapper.TencentAccountMapper;
import com.suqi.center.machine.dao.service.ITencentAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Primary;

/**
 * <p>
 * 腾讯账号表 服务实现类
 * </p>
 *
 * @author PC001
 * @since 2023-06-02
 */
@Service
@Primary
public class TencentAccountServiceImpl extends ServiceImpl<TencentAccountMapper, TencentAccount> implements ITencentAccountService {

}
