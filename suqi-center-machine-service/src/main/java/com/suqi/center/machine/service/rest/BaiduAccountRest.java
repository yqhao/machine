package com.suqi.center.machine.service.rest;

import com.suqi.center.machine.dao.entity.BaiduAccount;
import com.suqi.center.machine.api.dto.request.BaiduAccountParam;
import com.suqi.center.machine.api.dto.response.BaiduAccountResult;
import com.suqi.center.machine.api.query.IBaiduAccountApi;
import com.suqi.center.machine.biz.service.impl.BaiduAccountCurdServiceImpl;
import com.suqi.center.service.rest.BaseRest;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.validation.annotation.Validated;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import java.util.List;

/**
 * <p>
 * 百度账号表 接口
 * </p>
 *
 * @author PC001
 * @since 2023-08-25
 */
@Api(tags = {"百度账号表接口"})
@RestController
@Validated
@RequestMapping("/v1/machine/BaiduAccount")
public class BaiduAccountRest extends BaseRest<BaiduAccountCurdServiceImpl, BaiduAccount,Long, BaiduAccountResult, BaiduAccountParam, IBaiduAccountApi> implements IBaiduAccountApi{


    @Override
    protected QueryWrapper<BaiduAccount> queryWrapper(BaiduAccountParam q) {
        return BaiduAccount.qWrapper()
                    //
                    .idEq(q.getId())
                    //
                    .mobileEq(q.getMobile())
                    //
                    .accountNameEq(q.getAccountName())
                    //
                    .hostLike(q.getHost())
                    //
                    .bearerTokenLike(q.getBearerToken())
                    //token过期时间
                    .tokenExpireGe(q.getTokenExpire())
                    //token过期时间结束范围值
                    .tokenExpireLe(q.getQueryEndTokenExpire())
                    //根分组
                    .rootGroupCodeEq(q.getRootGroupCode())
                    //
                    .createTimeGe(q.getCreateTime())
                    //结束范围值
                    .createTimeLe(q.getQueryEndCreateTime())
                    //
                    .lastUpdateTimeGe(q.getLastUpdateTime())
                    //结束范围值
                    .lastUpdateTimeLe(q.getQueryEndLastUpdateTime())
                    //刷新token
                    .refreshTokenLike(q.getRefreshToken())
                    //刷新token过期时间
                    .refreshtokenExpireEq(q.getRefreshtokenExpire())
                ;
    }
}