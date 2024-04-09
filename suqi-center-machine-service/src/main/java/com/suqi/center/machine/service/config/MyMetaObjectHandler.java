package com.suqi.center.machine.service.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.suqi.center.common.dto.VizSysUserLoginInfoDto;
import com.suqi.center.common.utils.ServiceContextOrgUtils;
import com.suqi.center.common.utils.StringUtil;
import com.suqi.center.common.utils.VizInfoUtil;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Optional;

/**
 * @创建人 binhong
 * @创建时间 2023/2/1
 * @描述 自动填充处理器类
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    /**
     * 插入时的填充策略
     *
     * @param metaObject
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("createTime", new Date(), metaObject);
        this.setFieldValByName("updateTime", new Date(), metaObject);
        String currentUserId = ServiceContextOrgUtils.getCurrentUserId();
        if (StringUtil.isNotBlank(currentUserId)) {
            this.setFieldValByName("createPerson", currentUserId, metaObject);
            this.setFieldValByName("updatePerson", currentUserId, metaObject);
        }
        String vizUserName = Optional.ofNullable(VizInfoUtil.getVizUserInfo(false)).map(VizSysUserLoginInfoDto::getUserName).orElseGet(() -> "");
        if (StringUtil.isNotBlank(vizUserName)) {
            this.setFieldValByName("createPerson", vizUserName, metaObject);
            this.setFieldValByName("updatePerson", vizUserName, metaObject);
        }
    }

    /**
     * 更新时的填充策略
     *
     * @param metaObject
     */
    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("updateTime", new Date(), metaObject);
        String currentUserId = ServiceContextOrgUtils.getCurrentUserId();
        if (StringUtil.isNotBlank(currentUserId)) {
            this.setFieldValByName("updatePerson", currentUserId, metaObject);
        }
        String vizUserName = Optional.ofNullable(VizInfoUtil.getVizUserInfo(false)).map(VizSysUserLoginInfoDto::getUserName).orElseGet(() -> "");
        if (StringUtil.isNotBlank(vizUserName)) {
            this.setFieldValByName("updatePerson", vizUserName, metaObject);
        }
    }
}