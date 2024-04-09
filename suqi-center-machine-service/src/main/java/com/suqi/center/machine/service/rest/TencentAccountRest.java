package com.suqi.center.machine.service.rest;

import com.suqi.center.common.dto.Page;
import com.suqi.center.common.dto.PageSet;
import com.suqi.center.common.dto.Result;
import com.suqi.center.machine.dao.entity.TencentAccount;
import com.suqi.center.machine.api.dto.request.TencentAccountParam;
import com.suqi.center.machine.api.dto.reponse.TencentAccountResult;
import com.suqi.center.machine.api.query.ITencentAccountApi;
import com.suqi.center.machine.biz.service.impl.TencentAccountCurdServiceImpl;
import com.suqi.center.service.rest.BaseRest;
import io.swagger.annotations.Api;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import java.util.List;

/**
 * <p>
 * 腾讯账号表 接口
 * </p>
 *
 * @author PC001
 * @since 2023-06-12
 */
@Api(tags = {"腾讯账号表接口"})
@RestController
@RequestMapping("/v1/machine/TencentAccount")
@Validated
public class TencentAccountRest extends BaseRest<TencentAccountCurdServiceImpl, TencentAccount,Long, TencentAccountResult, TencentAccountParam, ITencentAccountApi> {


    @Override
    protected QueryWrapper<TencentAccount> queryWrapper(TencentAccountParam q) {
        return TencentAccount.qWrapper()
                    //
                    .idEq(q.getId())
                    //账号唯一标识
                    .uuidEq(q.getUuid())
                    //腾讯云密钥Id
                    .secretIdEq(q.getSecretId())
                    //腾讯云秘钥key
                    .secretKeyEq(q.getSecretKey())
                    //腾讯云请求地址
                    .endpointLike(q.getEndpoint())
                    //创建时间
                    .createTimeGe(q.getCreateTime())
                    //创建时间结束范围值
                    .createTimeLe(q.getQueryEndCreateTime())
                    //最后修改时间
                    .lastUpdateTimeGe(q.getLastUpdateTime())
                    //最后修改时间结束范围值
                    .lastUpdateTimeLe(q.getQueryEndLastUpdateTime())
                    //box_soc的表的主键ID[用这个id做关联]
                    .fkAccountIdEq(q.getFkAccountId())
                ;
    }
}