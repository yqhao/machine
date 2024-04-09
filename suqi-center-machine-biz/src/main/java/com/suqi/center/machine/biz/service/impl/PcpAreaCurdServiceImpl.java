package com.suqi.center.machine.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.biz.service.CurdService;
import com.suqi.center.common.dto.Result;
import com.suqi.center.machine.dao.entity.PcpArea;
import com.suqi.center.machine.dao.service.IPcpAreaService;
import org.springframework.stereotype.Service;

@Service
public class PcpAreaCurdServiceImpl extends CurdService<PcpArea, Long, IPcpAreaService> {

    public PcpAreaCurdServiceImpl() {
        this.logicDelete = false;
    }

    @Override
    public Result<Boolean> remove(Long id) {
        throw new UnsupportedOperationException("不允许执行删除操作");
    }

    @Override
    protected QueryWrapper<PcpArea> queryPageWrapper(PcpArea q) {
        return q.queryWrapper()
                .idEq()
                .nameLike()
                .codeLike()
                .regionLike()
                ;
    }
}
