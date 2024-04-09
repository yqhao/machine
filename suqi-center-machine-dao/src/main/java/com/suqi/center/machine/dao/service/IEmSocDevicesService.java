package com.suqi.center.machine.dao.service;

import com.suqi.center.machine.dao.entity.EmSocDevices;
import com.baomidou.mybatisplus.extension.service.IService;
import com.suqi.center.machine.dao.wrapper.EmSocDevicesQueryWrapper;
import com.suqi.center.machine.dao.wrapper.EmSocDevicesUpdateWrapper;
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
 * 设备（em_soc_devices） 服务类
 * </p>
 *
 * @author PC001
 * @since 2022-11-16
 */
public interface IEmSocDevicesService extends IService<EmSocDevices> {

    default long count(Consumer<EmSocDevicesQueryWrapper> wrapperConsumer) {
        EmSocDevicesQueryWrapper queryWrapper = EmSocDevicesQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return count(queryWrapper);
    }

    default public EmSocDevices selectOne(Consumer<EmSocDevicesQueryWrapper> wrapperConsumer) {
        EmSocDevicesQueryWrapper queryWrapper = EmSocDevicesQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        queryWrapper.last(" limit 1 ");
        return getOne(queryWrapper, false);
    }

    default public List<EmSocDevices> select(Consumer<EmSocDevicesQueryWrapper> wrapperConsumer) {
        EmSocDevicesQueryWrapper queryWrapper = EmSocDevicesQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public List<EmSocDevices> list(Consumer<EmSocDevicesQueryWrapper> wrapperConsumer) {
        EmSocDevicesQueryWrapper queryWrapper = EmSocDevicesQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public boolean update(Consumer<EmSocDevicesUpdateWrapper> wrapper) {
        EmSocDevicesUpdateWrapper updateWrapper = EmSocDevicesUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(updateWrapper);
    }

    default public boolean update(EmSocDevices up, Consumer<EmSocDevicesUpdateWrapper> wrapper) {
        EmSocDevicesUpdateWrapper updateWrapper = EmSocDevicesUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean update(Consumer<EmSocDevices> setUp, Consumer<EmSocDevicesUpdateWrapper> wrapper) {
        EmSocDevices up = new EmSocDevices();
        setUp.accept(up);
        EmSocDevicesUpdateWrapper updateWrapper = EmSocDevicesUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean remove(Consumer<EmSocDevicesQueryWrapper> wrapper) {
        EmSocDevicesQueryWrapper removeWrapper = EmSocDevicesQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return remove(removeWrapper);
    }

    default public Page<EmSocDevices> page(Page<EmSocDevices> page, Consumer<EmSocDevicesQueryWrapper> wrapperConsumer) {
        EmSocDevicesQueryWrapper queryWrapper = EmSocDevicesQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default Page<EmSocDevices> quickPageById(Page<EmSocDevices> page, long lastId, QueryWrapper<EmSocDevices> wrapper) {
        return quickPageById(true, page, lastId, wrapper);
    }

    default Page<EmSocDevices> quickPageById(Page<EmSocDevices> page, long lastId, Consumer<EmSocDevicesQueryWrapper> wrapperConsumer) {
        EmSocDevicesQueryWrapper queryWrapper = EmSocDevicesQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPageById(true, page, lastId, queryWrapper);
    }

    default Page<EmSocDevices> quickPageById(boolean queryTotals, Page<EmSocDevices> page, long lastId, QueryWrapper<EmSocDevices> wrapper) {
        return page(page, wrapper);
    }

    default Page<EmSocDevices> quickPage(Page<EmSocDevices> page, QueryWrapper<EmSocDevices> wrapper) {
        return IService.super.page(page, wrapper);
    }

    default Page<EmSocDevices> page(Page<EmSocDevices> page, QueryWrapper<EmSocDevices> wrapper) {
        return quickPage(page, wrapper);
    }

    default Page<EmSocDevices> quickPage(Page<EmSocDevices> page, Consumer<EmSocDevicesQueryWrapper> wrapperConsumer) {
        EmSocDevicesQueryWrapper queryWrapper = EmSocDevicesQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default public void pageConsumerByWrapper(Consumer<EmSocDevicesQueryWrapper> wrapperConsumer, Consumer<EmSocDevices> consumer) {
        EmSocDevicesQueryWrapper queryWrapper = EmSocDevicesQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumerByWrapper(int pageSize, Consumer<EmSocDevicesQueryWrapper> wrapperConsumer, Consumer<EmSocDevices> consumer) {
        EmSocDevicesQueryWrapper queryWrapper = EmSocDevicesQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(QueryWrapper<EmSocDevices> queryWrapper, Consumer<EmSocDevices> consumer) {
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(int pageSize, QueryWrapper<EmSocDevices> queryWrapper, Consumer<EmSocDevices> consumer) {
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(Function<Page<EmSocDevices>, Page<EmSocDevices>> consumerSupplier, Consumer<EmSocDevices> consumer) {
        pageConsumer(1000, consumerSupplier, consumer);
    }

    default public void pageConsumer(int pageSize, Function<Page<EmSocDevices>, Page<EmSocDevices>> consumerSupplier, Consumer<EmSocDevices> consumer) {
        Page<EmSocDevices> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<EmSocDevices> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    for (EmSocDevices t : result) {
                        consumer.accept(t);
                    }
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public void pageConsumersByWrapper(Consumer<EmSocDevicesQueryWrapper> wrapperConsumer, Consumer<List<EmSocDevices>> consumerList) {
        EmSocDevicesQueryWrapper queryWrapper = EmSocDevicesQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumersByWrapper(int pageSize, Consumer<EmSocDevicesQueryWrapper> wrapperConsumer, Consumer<List<EmSocDevices>> consumerList) {
        EmSocDevicesQueryWrapper queryWrapper = EmSocDevicesQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(QueryWrapper<EmSocDevices> queryWrapper, Consumer<List<EmSocDevices>> consumerList) {
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(int pageSize, QueryWrapper<EmSocDevices> queryWrapper, Consumer<List<EmSocDevices>> consumerList) {
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(Function<Page<EmSocDevices>, Page<EmSocDevices>> consumerSupplier, Consumer<List<EmSocDevices>> consumerList) {
        pageConsumers(1000, consumerSupplier, consumerList);
    }

    default public void pageConsumers(int pageSize, Function<Page<EmSocDevices>, Page<EmSocDevices>> consumerSupplier, Consumer<List<EmSocDevices>> consumerList) {
        Page<EmSocDevices> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<EmSocDevices> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    consumerList.accept(result);
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public boolean queryAndUpdateById(QueryWrapper<EmSocDevices> wrapper, EmSocDevices up) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<EmSocDevices> wrapper, EmSocDevices up) {
        return queryAndUpdateById(pageSize, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<EmSocDevices> wrapper, EmSocDevices up, BiPredicate<EmSocDevices, EmSocDevices> updateFilter) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<EmSocDevices> wrapper, EmSocDevices up, BiPredicate<EmSocDevices, EmSocDevices> updateFilter) {
        return queryAndUpdateById(pageSize, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<EmSocDevices> wrapper, EmSocDevices up, BiConsumer<EmSocDevices, EmSocDevicesUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, whereSet);
    }

    default public boolean queryAndUpdateById(QueryWrapper<EmSocDevices> wrapper, EmSocDevices up, BiPredicate<EmSocDevices, EmSocDevices> updateFilter, BiConsumer<EmSocDevices, EmSocDevicesUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, whereSet);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<EmSocDevices> wrapper, EmSocDevices up, BiPredicate<EmSocDevices, EmSocDevices> updateFilter, BiConsumer<EmSocDevices, EmSocDevicesUpdateWrapper> whereSet) {
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

    default public boolean removeByIds(Consumer<EmSocDevicesQueryWrapper> wrapper) {
        return removeByIds(1000, wrapper);
    }

    default public boolean removeByIds(int pageSize, Consumer<EmSocDevicesQueryWrapper> wrapper) {
        EmSocDevicesQueryWrapper removeWrapper = EmSocDevicesQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return removeByIds(pageSize, removeWrapper);
    }

    default public boolean removeByIds(EmSocDevicesQueryWrapper removeWrapper) {
        return removeByIds(1000, removeWrapper);
    }

    default public boolean removeByIds(int pageSize, EmSocDevicesQueryWrapper removeWrapper) {
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
