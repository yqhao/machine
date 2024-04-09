package com.suqi.center.machine.dao.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.suqi.center.machine.dao.constants.DBConstants;
import com.suqi.center.machine.dao.entity.TencentImages;
import com.suqi.center.machine.dao.mapper.TencentImagesMapper;
import com.suqi.center.machine.dao.service.ITencentImagesService;
import com.suqi.center.machine.dao.wrapper.TencentImagesQueryWrapper;
import com.suqi.core.mybatis.utils.PageConsumerUtil;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import java.util.function.Consumer;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

/**
 * <p>
 * 腾讯镜像管理 服务实现类
 * </p>
 *
 * @author PC001
 * @since 2023-06-02
 */
@Service
@Primary
public class TencentImagesServiceImpl extends ServiceImpl<TencentImagesMapper, TencentImages> implements ITencentImagesService {

    @Override
    public void pageConsumer(int pageSize, TencentImagesQueryWrapper queryWrapper, Consumer<TencentImages> consumer) {
        PageConsumerUtil.pageConsumerSupplier(pageSize, p -> page(p, queryWrapper), null, consumer);
    }

    @Override
    public Page<TencentImages> quickPageById(boolean queryTotals, Page<TencentImages> page, long lastId, QueryWrapper<TencentImages> wrapper) {
        page.setCurrent(page.getCurrent());
        if (queryTotals) {
            long total = 0L;
            boolean overrideSelect = false;
            String sqlSelect = wrapper.getSqlSelect();
            if (sqlSelect != null && !"".equals(sqlSelect) && sqlSelect.indexOf(",") > 0) {
                wrapper.select("*");
                overrideSelect = true;
            }
            total = baseMapper.selectCount(wrapper);
            if (overrideSelect) {
                wrapper.select(sqlSelect);
            }
            page.setTotal(total);
            if (total == 0L) {
                return page;
            }
        }
        page.setRecords(baseMapper.quickPageById(page.getSize(), lastId, wrapper));
        return page;
    }

    @Override
    public Page<TencentImages> quickPage(Page<TencentImages> page, QueryWrapper<TencentImages> wrapper) {
        long total = 0L;
        boolean overrideSelect = false;
        String sqlSelect = wrapper.getSqlSelect();
        if (sqlSelect != null && !"".equals(sqlSelect) && sqlSelect.indexOf(",") > 0) {
            wrapper.select("*");
            overrideSelect = true;
        }
        total = baseMapper.selectCount(wrapper);
        if (overrideSelect) {
            wrapper.select(sqlSelect);
        }
        page.setTotal(total);
        if (total > 0L) {
            page.setRecords(baseMapper.quickPage(page.getCurrent(), page.getSize(), wrapper));
        }
        return page;
    }
}
