package com.suqi.center.machine.dao.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.suqi.center.machine.dao.constants.DBConstants;
import com.suqi.center.machine.dao.entity.DevRoomPlayer;
import com.suqi.center.machine.dao.mapper.DevRoomPlayerMapper;
import com.suqi.center.machine.dao.service.IDevRoomPlayerService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * <p>
 * 设备房间成员记录表（dev_room_player） 服务实现类
 * </p>
 *
 * @author PC001
 * @since 2022-11-11
 */
@Service
@Primary
@DS(DBConstants.SLAVE)
public class DevRoomPlayerServiceImpl extends ServiceImpl<DevRoomPlayerMapper, DevRoomPlayer> implements IDevRoomPlayerService {

    @Override
    public Page<DevRoomPlayer> quickPageById(boolean queryTotals, Page<DevRoomPlayer> page, long lastId, QueryWrapper<DevRoomPlayer> wrapper) {
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
    public Page<DevRoomPlayer> quickPage(Page<DevRoomPlayer> page, QueryWrapper<DevRoomPlayer> wrapper) {
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
