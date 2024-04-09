package com.suqi.center.machine.dao.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.machine.dao.entity.YunMemberHangUp;
import com.suqi.center.machine.dao.mapper.YunMemberHangUpMapper;
import com.suqi.center.machine.dao.service.IYunMemberHangUpService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Primary;

/**
 * <p>
 * 商户挂机时长表 服务实现类
 * </p>
 *
 * @author PC001
 * @since 2023-08-29
 */
@Service
@Primary
public class YunMemberHangUpServiceImpl extends ServiceImpl<YunMemberHangUpMapper, YunMemberHangUp> implements IYunMemberHangUpService {

    @Override
    public Page<YunMemberHangUp> quickPageById(boolean queryTotals, Page<YunMemberHangUp> page, long lastId, QueryWrapper<YunMemberHangUp> wrapper) {
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
    public Page<YunMemberHangUp> quickPage(Page<YunMemberHangUp> page, QueryWrapper<YunMemberHangUp> wrapper) {
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
