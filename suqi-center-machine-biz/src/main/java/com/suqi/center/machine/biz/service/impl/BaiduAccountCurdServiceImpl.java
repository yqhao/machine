package com.suqi.center.machine.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.common.dto.PageSet;
import com.suqi.center.machine.dao.entity.BaiduAccount;
import com.suqi.center.biz.service.CurdService;
import com.suqi.center.machine.dao.service.IBaiduAccountService;
import org.springframework.stereotype.Service;
import java.util.Date;

/**
 * <p>
 * 百度账号表 接口
 * </p>
 *
 * @author PC001
 * @since 2023-08-25
 */
@Service
public class BaiduAccountCurdServiceImpl extends CurdService<BaiduAccount, Long, IBaiduAccountService> {

    @Override
    protected QueryWrapper<BaiduAccount> queryPageWrapper(BaiduAccount q) {
        return q.queryWrapper().//
        idEq().//
        mobileEq().//
        accountNameEq().//
        hostLike().//
        bearerTokenLike().//token过期时间
        tokenExpireGe().//根分组
        rootGroupCodeEq().//
        createTimeGe().//
        lastUpdateTimeGe().//刷新token
        refreshTokenLike().//刷新token过期时间
        refreshtokenExpireEq();
    }

    @Override
    protected Page<BaiduAccount> pageQuery(PageSet pageSet, QueryWrapper<BaiduAccount> queryWrapper) {
        return daoService.quickPage(new Page<>(pageSet.getPageNo(), pageSet.getPageSize()), queryWrapper);
    }
}
