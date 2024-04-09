package com.suqi.center.machine.dao.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.machine.dao.dto.DevicesLabelListDto;
import com.suqi.center.machine.dao.entity.EmSocDevicesLabel;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 设备标签表 Mapper 接口
 * </p>
 *
 * @author PC001
 * @since 2023-03-29
 */
public interface EmSocDevicesLabelMapper extends BaseMapper<EmSocDevicesLabel> {

    Page list(@Param("param") DevicesLabelListDto paramDto, @Param("page") Page page);


    Long saveOrUpdate(@Param("updateList") List<EmSocDevicesLabel> updateList);
}
