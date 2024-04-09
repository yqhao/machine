package com.suqi.center.machine.dao.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.entity.BaiduAccount;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * <p>
 * 百度账号表 Mapper 接口
 * </p>
 *
 * @author PC001
 * @since 2023-08-25
 */
public interface BaiduAccountMapper extends BaseMapper<BaiduAccount> {

    List<BaiduAccount> quickPageById(@Param("pageSize") long pageSize, @Param("lastId") long lastId, @Param("ew") QueryWrapper<BaiduAccount> wrapper);

    List<BaiduAccount> quickPage(@Param("pageNo") long pageNo, @Param("pageSize") long pageSize, @Param("ew") QueryWrapper<BaiduAccount> wrapper);
}
