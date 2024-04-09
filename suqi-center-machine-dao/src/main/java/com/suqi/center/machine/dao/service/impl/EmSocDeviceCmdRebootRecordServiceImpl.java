package com.suqi.center.machine.dao.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.suqi.center.machine.dao.constants.DBConstants;
import com.suqi.center.machine.dao.entity.EmSocDeviceCmdRebootRecord;
import com.suqi.center.machine.dao.mapper.EmSocDeviceCmdRebootRecordMapper;
import com.suqi.center.machine.dao.service.IEmSocDeviceCmdRebootRecordService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Administrator
 * @since 2023-12-20
 */
@Service
@Primary
@DS(DBConstants.SLAVE)
public class EmSocDeviceCmdRebootRecordServiceImpl extends ServiceImpl<EmSocDeviceCmdRebootRecordMapper, EmSocDeviceCmdRebootRecord> implements IEmSocDeviceCmdRebootRecordService {

    @Override
    public Page<EmSocDeviceCmdRebootRecord> quickPageById(boolean queryTotals,Page<EmSocDeviceCmdRebootRecord> page,long lastId, QueryWrapper<EmSocDeviceCmdRebootRecord> wrapper){
        page.setCurrent(page.getCurrent());
        if(queryTotals){
            long total = 0L;
            boolean overrideSelect=false;
            String sqlSelect = wrapper.getSqlSelect();
            if(sqlSelect!=null && !"".equals(sqlSelect) && sqlSelect.indexOf(",")>0){
                wrapper.select("*");
                overrideSelect=true;
            }
            total=baseMapper.selectCount(wrapper);
            if(overrideSelect){
                wrapper.select(sqlSelect);
            }
            page.setTotal(total);
            if(total==0L){
                return page;
            }
        }
        page.setRecords(baseMapper.quickPageById(page.getSize(),lastId,wrapper));
        return page;
    }

    @Override
    public Page<EmSocDeviceCmdRebootRecord> quickPage(Page<EmSocDeviceCmdRebootRecord> page,QueryWrapper<EmSocDeviceCmdRebootRecord> wrapper){
        long total = 0L;
        boolean overrideSelect=false;
        String sqlSelect = wrapper.getSqlSelect();
        if(sqlSelect!=null && !"".equals(sqlSelect) && sqlSelect.indexOf(",")>0){
            wrapper.select("*");
            overrideSelect=true;
        }
        total=baseMapper.selectCount(wrapper);
        if(overrideSelect){
            wrapper.select(sqlSelect);
        }
        page.setTotal(total);
        if(total>0L){
            page.setRecords(baseMapper.quickPage(page.getCurrent(),page.getSize(),wrapper));
        }
        return page;
    }
}
