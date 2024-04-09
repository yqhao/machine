package com.suqi.center.machine.dao.service;

import com.suqi.center.machine.dao.entity.PcpDevice;
import com.baomidou.mybatisplus.extension.service.IService;
import com.suqi.center.machine.dao.wrapper.PcpDeviceQueryWrapper;
import com.suqi.center.machine.dao.wrapper.PcpDeviceUpdateWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * <p>
 * 云机id对照表 服务类
 * </p>
 *
 * @author PC001
 * @since 2023-04-20
 */
public interface IPcpDeviceService extends IService<PcpDevice> {

    /**
     * 检查当前设备是否存在于当前环境
     * @param cphPhoneId
     * @param cphServerId
     * @return
     */
    PcpDevice checkMachineExistEnv(String cphPhoneId, String cphServerId);

    /**
     * 根据设备ID获取对应关系
     * @param deviceId
     * @return
     */
    PcpDevice getPcpDeviceByDeviceId(String deviceId);

    /**
     * 根据 phoneId 查询 pcpDevice
     *
     * @param phoneId    会员主键
     * @param serverId   设备主键
     * @return PcpDevice
     */
    PcpDevice selectByPhoneIdAndServerId(String phoneId, String serverId);

    /**
     * 根据 serverId 查询 pcpDevice
     * @param serverId
     * @return
     */
    PcpDevice getPcpDeviceByServerId(String serverId);

    default long count(Consumer<PcpDeviceQueryWrapper> wrapperConsumer) {
        PcpDeviceQueryWrapper queryWrapper = PcpDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return count(queryWrapper);
    }

    default public PcpDevice selectOne(Consumer<PcpDeviceQueryWrapper> wrapperConsumer) {
        PcpDeviceQueryWrapper queryWrapper = PcpDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        queryWrapper.last(" limit 1 ");
        return getOne(queryWrapper, false);
    }

    default public List<PcpDevice> select(Consumer<PcpDeviceQueryWrapper> wrapperConsumer) {
        PcpDeviceQueryWrapper queryWrapper = PcpDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public List<PcpDevice> list(Consumer<PcpDeviceQueryWrapper> wrapperConsumer) {
        PcpDeviceQueryWrapper queryWrapper = PcpDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public boolean update(Consumer<PcpDeviceUpdateWrapper> wrapper) {
        PcpDeviceUpdateWrapper updateWrapper = PcpDeviceUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(updateWrapper);
    }

    default public boolean update(PcpDevice up, Consumer<PcpDeviceUpdateWrapper> wrapper) {
        PcpDeviceUpdateWrapper updateWrapper = PcpDeviceUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean update(Consumer<PcpDevice> setUp, Consumer<PcpDeviceUpdateWrapper> wrapper) {
        PcpDevice up = new PcpDevice();
        setUp.accept(up);
        PcpDeviceUpdateWrapper updateWrapper = PcpDeviceUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean remove(Consumer<PcpDeviceQueryWrapper> wrapper) {
        PcpDeviceQueryWrapper removeWrapper = PcpDeviceQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return remove(removeWrapper);
    }

    default public Page<PcpDevice> page(Page<PcpDevice> page, Consumer<PcpDeviceQueryWrapper> wrapperConsumer) {
        PcpDeviceQueryWrapper queryWrapper = PcpDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default Page<PcpDevice> quickPageById(Page<PcpDevice> page, long lastId, QueryWrapper<PcpDevice> wrapper) {
        return quickPageById(true, page, lastId, wrapper);
    }

    default Page<PcpDevice> quickPageById(Page<PcpDevice> page, long lastId, Consumer<PcpDeviceQueryWrapper> wrapperConsumer) {
        PcpDeviceQueryWrapper queryWrapper = PcpDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPageById(true, page, lastId, queryWrapper);
    }

    default Page<PcpDevice> quickPageById(boolean queryTotals, Page<PcpDevice> page, long lastId, QueryWrapper<PcpDevice> wrapper) {
        return page(page, wrapper);
    }

    default Page<PcpDevice> quickPage(Page<PcpDevice> page, QueryWrapper<PcpDevice> wrapper) {
        return IService.super.page(page, wrapper);
    }

    default Page<PcpDevice> page(Page<PcpDevice> page, QueryWrapper<PcpDevice> wrapper) {
        return quickPage(page, wrapper);
    }

    default Page<PcpDevice> quickPage(Page<PcpDevice> page, Consumer<PcpDeviceQueryWrapper> wrapperConsumer) {
        PcpDeviceQueryWrapper queryWrapper = PcpDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default public void pageConsumerByWrapper(Consumer<PcpDeviceQueryWrapper> wrapperConsumer, Consumer<PcpDevice> consumer) {
        PcpDeviceQueryWrapper queryWrapper = PcpDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumerByWrapper(int pageSize, Consumer<PcpDeviceQueryWrapper> wrapperConsumer, Consumer<PcpDevice> consumer) {
        PcpDeviceQueryWrapper queryWrapper = PcpDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(QueryWrapper<PcpDevice> queryWrapper, Consumer<PcpDevice> consumer) {
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(int pageSize, QueryWrapper<PcpDevice> queryWrapper, Consumer<PcpDevice> consumer) {
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(Function<Page<PcpDevice>, Page<PcpDevice>> consumerSupplier, Consumer<PcpDevice> consumer) {
        pageConsumer(1000, consumerSupplier, consumer);
    }

    default public void pageConsumer(int pageSize, Function<Page<PcpDevice>, Page<PcpDevice>> consumerSupplier, Consumer<PcpDevice> consumer) {
        Page<PcpDevice> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<PcpDevice> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    for (PcpDevice t : result) {
                        consumer.accept(t);
                    }
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public void pageConsumersByWrapper(Consumer<PcpDeviceQueryWrapper> wrapperConsumer, Consumer<List<PcpDevice>> consumerList) {
        PcpDeviceQueryWrapper queryWrapper = PcpDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumersByWrapper(int pageSize, Consumer<PcpDeviceQueryWrapper> wrapperConsumer, Consumer<List<PcpDevice>> consumerList) {
        PcpDeviceQueryWrapper queryWrapper = PcpDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(QueryWrapper<PcpDevice> queryWrapper, Consumer<List<PcpDevice>> consumerList) {
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(int pageSize, QueryWrapper<PcpDevice> queryWrapper, Consumer<List<PcpDevice>> consumerList) {
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(Function<Page<PcpDevice>, Page<PcpDevice>> consumerSupplier, Consumer<List<PcpDevice>> consumerList) {
        pageConsumers(1000, consumerSupplier, consumerList);
    }

    default public void pageConsumers(int pageSize, Function<Page<PcpDevice>, Page<PcpDevice>> consumerSupplier, Consumer<List<PcpDevice>> consumerList) {
        Page<PcpDevice> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<PcpDevice> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    consumerList.accept(result);
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public boolean queryAndUpdateById(QueryWrapper<PcpDevice> wrapper, PcpDevice up) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<PcpDevice> wrapper, PcpDevice up) {
        return queryAndUpdateById(pageSize, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<PcpDevice> wrapper, PcpDevice up, BiPredicate<PcpDevice, PcpDevice> updateFilter) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<PcpDevice> wrapper, PcpDevice up, BiPredicate<PcpDevice, PcpDevice> updateFilter) {
        return queryAndUpdateById(pageSize, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<PcpDevice> wrapper, PcpDevice up, BiConsumer<PcpDevice, PcpDeviceUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, whereSet);
    }

    default public boolean queryAndUpdateById(QueryWrapper<PcpDevice> wrapper, PcpDevice up, BiPredicate<PcpDevice, PcpDevice> updateFilter, BiConsumer<PcpDevice, PcpDeviceUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, whereSet);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<PcpDevice> wrapper, PcpDevice up, BiPredicate<PcpDevice, PcpDevice> updateFilter, BiConsumer<PcpDevice, PcpDeviceUpdateWrapper> whereSet) {
        AtomicBoolean rs = new AtomicBoolean(false);
        pageConsumer(pageSize, wrapper, t -> {
            if (updateFilter.test(t, up)) {
                boolean r = update(up, e -> {
                    e.idEq(t.getId());
                    if (whereSet != null) {
                        whereSet.accept(t, e);
                    }
                });
                if (r && !rs.get()) {
                    rs.set(r);
                }
            }
        });
        return rs.get();
    }

    default public boolean removeByIds(Consumer<PcpDeviceQueryWrapper> wrapper) {
        return removeByIds(1000, wrapper);
    }

    default public boolean removeByIds(int pageSize, Consumer<PcpDeviceQueryWrapper> wrapper) {
        PcpDeviceQueryWrapper removeWrapper = PcpDeviceQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return removeByIds(pageSize, removeWrapper);
    }

    default public boolean removeByIds(PcpDeviceQueryWrapper removeWrapper) {
        return removeByIds(1000, removeWrapper);
    }

    default public boolean removeByIds(int pageSize, PcpDeviceQueryWrapper removeWrapper) {
        AtomicBoolean rs = new AtomicBoolean(false);
        pageConsumer(pageSize, removeWrapper, t -> {
            boolean r = removeById(t.getId());
            if (r && !rs.get()) {
                rs.set(r);
            }
        });
        return rs.get();
    }
}
