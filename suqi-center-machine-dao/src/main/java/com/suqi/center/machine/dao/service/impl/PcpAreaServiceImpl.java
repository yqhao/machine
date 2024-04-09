package com.suqi.center.machine.dao.service.impl;

import com.suqi.center.machine.dao.entity.PcpArea;
import com.suqi.center.machine.dao.mapper.PcpAreaMapper;
import com.suqi.center.machine.dao.service.IPcpAreaService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Primary;

/**
 * <p>
 * pcp区域表（pcp_area） 服务实现类
 * </p>
 *
 * @author PC001
 * @since 2023-06-02
 */
@Service
@Primary
public class PcpAreaServiceImpl extends ServiceImpl<PcpAreaMapper, PcpArea> implements IPcpAreaService {

}
