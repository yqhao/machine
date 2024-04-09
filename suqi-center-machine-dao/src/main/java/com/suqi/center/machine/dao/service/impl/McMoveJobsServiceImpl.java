package com.suqi.center.machine.dao.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.machine.dao.entity.McMoveJobs;
import com.suqi.center.machine.dao.mapper.McMoveJobsMapper;
import com.suqi.center.machine.dao.service.IMcMoveJobsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Primary;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.suqi.center.machine.dao.constants.DBConstants;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author PC001
 * @since 2023-08-24
 */
@Service
@Primary
@DS(DBConstants.SHARDING)
public class McMoveJobsServiceImpl extends ServiceImpl<McMoveJobsMapper, McMoveJobs> implements IMcMoveJobsService {

    @Override
    public Page<McMoveJobs> quickPageById(boolean queryTotals,Page<McMoveJobs> page,long lastId, QueryWrapper<McMoveJobs> wrapper){
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
    public Page<McMoveJobs> quickPage(Page<McMoveJobs> page,QueryWrapper<McMoveJobs> wrapper){
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
