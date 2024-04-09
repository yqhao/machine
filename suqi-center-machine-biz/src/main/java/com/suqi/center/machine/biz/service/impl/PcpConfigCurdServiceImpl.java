package com.suqi.center.machine.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.common.dto.PageSet;
import com.suqi.center.machine.dao.entity.McMoveDevice;
import com.suqi.center.machine.dao.entity.PcpConfig;
import com.suqi.center.biz.service.CurdService;
import com.suqi.center.machine.dao.entity.PcpDevice;
import com.suqi.center.machine.dao.service.IPcpConfigService;
import com.suqi.center.machine.dao.service.impl.PcpConfigServiceImpl;
import com.suqi.center.machine.dao.service.impl.PcpDeviceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.Date;

/**
 * <p>
 * 华为云配置表 接口
 * </p>
 *
 * @author PC001
 * @since 2023-08-29
 */
@Service
public class PcpConfigCurdServiceImpl extends CurdService<PcpConfig, Long,IPcpConfigService> {

    @Autowired
    PcpDeviceServiceImpl pcpDeviceService;

    @Autowired
    PcpConfigServiceImpl pcpConfigService;


    public Long getFkPcpAreaId(McMoveDevice mcMoveDevice) {
        Long fkPcpAreaId=null;
        PcpDevice fromPcpDeviceId = pcpDeviceService.getPcpDeviceByDeviceId(mcMoveDevice.getFromDeviceId());
        if(fromPcpDeviceId!=null) {
            String projectId = fromPcpDeviceId.getProjectId();
            if(!ObjectUtils.isEmpty(projectId)) {
                PcpConfig pcpConfig = pcpConfigService.getPcpConfigByProjectId(projectId);
                if(pcpConfig!=null) {
                    fkPcpAreaId = pcpConfig.getFkPcpAreaId();
                }
            }
        }
        return fkPcpAreaId;
    }
    public PcpConfigCurdServiceImpl() {
        super((e, id) -> {
            e.setId(id);
            e.setStatus(-50);
            e.setLastUpdateTime(new Date());
        });
    }

    @Override
    protected QueryWrapper<PcpConfig> queryPageWrapper(PcpConfig q) {
        return q.queryWrapper()
                    .idEq()//
                    .projectIdEq()//华为项目id
                    .domainNameEq()//
                    .iamUsrEq()//iam用户名
                    .iamPwdEq()//iam密码
                    .endpointTokenUrlLike()//获取token地址
                    .endpointPhonesUrlLike()//api调用地址
                    .endpointUrlPatternLike()//接口url地址模板
                    .accessKeyIdEq()//access_key_id
                    .secretAccessKeyEq()//secret_access_key
                    .tokenLike()//token
                    .expiredDateGe()//token 过期时间
                    .bucketNameEq()//obs存储桶名称
                    .objectPathEq()//obs存储桶路径
                    .statusEq()//状态（0：关闭，1：启用）
                    .createTimeGe()//创建时间
                    .lastUpdateTimeGe()//最后修改时间
                    .versionIdEq()//
                    .fkPcpAreaIdEq()//pcp区域表（pcp_area）id
                ;
    }

    @Override
    protected Page<PcpConfig> pageQuery(PageSet pageSet, QueryWrapper<PcpConfig> queryWrapper) {
        return daoService.quickPage(new Page<>(pageSet.getPageNo(), pageSet.getPageSize()),queryWrapper);
    }
}