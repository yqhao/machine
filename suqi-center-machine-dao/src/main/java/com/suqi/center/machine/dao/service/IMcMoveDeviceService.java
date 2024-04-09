package com.suqi.center.machine.dao.service;

import com.suqi.center.machine.dao.entity.McMoveDevice;
import com.suqi.center.machine.dao.wrapper.McMoveDeviceQueryWrapper;
import com.suqi.center.machine.dao.wrapper.McMoveDeviceUpdateWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
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
 *  服务类
 * </p>
 *
 * @author PC001
 * @since 2023-08-24
 */
public interface IMcMoveDeviceService extends IService<McMoveDevice> {

    default long count(Consumer<McMoveDeviceQueryWrapper> wrapperConsumer) {
        McMoveDeviceQueryWrapper queryWrapper = McMoveDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return count(queryWrapper);
    }

    default public McMoveDevice selectOne(Consumer<McMoveDeviceQueryWrapper> wrapperConsumer) {
        McMoveDeviceQueryWrapper queryWrapper = McMoveDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        queryWrapper.last(" limit 1 ");
        return getOne(queryWrapper, false);
    }

    default public List<McMoveDevice> select(Consumer<McMoveDeviceQueryWrapper> wrapperConsumer) {
        McMoveDeviceQueryWrapper queryWrapper = McMoveDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public List<McMoveDevice> list(Consumer<McMoveDeviceQueryWrapper> wrapperConsumer) {
        McMoveDeviceQueryWrapper queryWrapper = McMoveDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public boolean update(Consumer<McMoveDeviceUpdateWrapper> wrapper) {
        McMoveDeviceUpdateWrapper updateWrapper = McMoveDeviceUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(updateWrapper);
    }

    default public boolean update(McMoveDevice up, Consumer<McMoveDeviceUpdateWrapper> wrapper) {
        McMoveDeviceUpdateWrapper updateWrapper = McMoveDeviceUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean update(Consumer<McMoveDevice> setUp, Consumer<McMoveDeviceUpdateWrapper> wrapper) {
        McMoveDevice up = new McMoveDevice();
        setUp.accept(up);
        McMoveDeviceUpdateWrapper updateWrapper = McMoveDeviceUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean remove(Consumer<McMoveDeviceQueryWrapper> wrapper) {
        McMoveDeviceQueryWrapper removeWrapper = McMoveDeviceQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return remove(removeWrapper);
    }

    default public Page<McMoveDevice> page(Page<McMoveDevice> page, Consumer<McMoveDeviceQueryWrapper> wrapperConsumer) {
        McMoveDeviceQueryWrapper queryWrapper = McMoveDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default Page<McMoveDevice> quickPageById(Page<McMoveDevice> page, long lastId, QueryWrapper<McMoveDevice> wrapper) {
        return quickPageById(true, page, lastId, wrapper);
    }

    default Page<McMoveDevice> quickPageById(Page<McMoveDevice> page, long lastId, Consumer<McMoveDeviceQueryWrapper> wrapperConsumer) {
        McMoveDeviceQueryWrapper queryWrapper = McMoveDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPageById(true, page, lastId, queryWrapper);
    }

    default Page<McMoveDevice> quickPageById(boolean queryTotals, Page<McMoveDevice> page, long lastId, QueryWrapper<McMoveDevice> wrapper) {
        return page(page, wrapper);
    }

    default Page<McMoveDevice> quickPage(Page<McMoveDevice> page, QueryWrapper<McMoveDevice> wrapper) {
        return IService.super.page(page, wrapper);
    }

    default Page<McMoveDevice> page(Page<McMoveDevice> page, QueryWrapper<McMoveDevice> wrapper) {
        return quickPage(page, wrapper);
    }

    default Page<McMoveDevice> quickPage(Page<McMoveDevice> page, Consumer<McMoveDeviceQueryWrapper> wrapperConsumer) {
        McMoveDeviceQueryWrapper queryWrapper = McMoveDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default public void pageConsumerByWrapper(Consumer<McMoveDeviceQueryWrapper> wrapperConsumer, Consumer<McMoveDevice> consumer) {
        McMoveDeviceQueryWrapper queryWrapper = McMoveDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumerByWrapper(int pageSize, Consumer<McMoveDeviceQueryWrapper> wrapperConsumer, Consumer<McMoveDevice> consumer) {
        McMoveDeviceQueryWrapper queryWrapper = McMoveDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(QueryWrapper<McMoveDevice> queryWrapper, Consumer<McMoveDevice> consumer) {
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(int pageSize, QueryWrapper<McMoveDevice> queryWrapper, Consumer<McMoveDevice> consumer) {
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(Function<Page<McMoveDevice>, Page<McMoveDevice>> consumerSupplier, Consumer<McMoveDevice> consumer) {
        pageConsumer(1000, consumerSupplier, consumer);
    }

    default public void pageConsumer(int pageSize, Function<Page<McMoveDevice>, Page<McMoveDevice>> consumerSupplier, Consumer<McMoveDevice> consumer) {
        Page<McMoveDevice> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<McMoveDevice> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    for (McMoveDevice t : result) {
                        consumer.accept(t);
                    }
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public void pageConsumersByWrapper(Consumer<McMoveDeviceQueryWrapper> wrapperConsumer, Consumer<List<McMoveDevice>> consumerList) {
        McMoveDeviceQueryWrapper queryWrapper = McMoveDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumersByWrapper(int pageSize, Consumer<McMoveDeviceQueryWrapper> wrapperConsumer, Consumer<List<McMoveDevice>> consumerList) {
        McMoveDeviceQueryWrapper queryWrapper = McMoveDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(QueryWrapper<McMoveDevice> queryWrapper, Consumer<List<McMoveDevice>> consumerList) {
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(int pageSize, QueryWrapper<McMoveDevice> queryWrapper, Consumer<List<McMoveDevice>> consumerList) {
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(Function<Page<McMoveDevice>, Page<McMoveDevice>> consumerSupplier, Consumer<List<McMoveDevice>> consumerList) {
        pageConsumers(1000, consumerSupplier, consumerList);
    }

    default public void pageConsumers(int pageSize, Function<Page<McMoveDevice>, Page<McMoveDevice>> consumerSupplier, Consumer<List<McMoveDevice>> consumerList) {
        Page<McMoveDevice> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<McMoveDevice> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    consumerList.accept(result);
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public boolean queryAndUpdateById(QueryWrapper<McMoveDevice> wrapper, McMoveDevice up) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<McMoveDevice> wrapper, McMoveDevice up) {
        return queryAndUpdateById(pageSize, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<McMoveDevice> wrapper, McMoveDevice up, BiPredicate<McMoveDevice, McMoveDevice> updateFilter) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<McMoveDevice> wrapper, McMoveDevice up, BiPredicate<McMoveDevice, McMoveDevice> updateFilter) {
        return queryAndUpdateById(pageSize, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<McMoveDevice> wrapper, McMoveDevice up, BiConsumer<McMoveDevice, McMoveDeviceUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, whereSet);
    }

    default public boolean queryAndUpdateById(QueryWrapper<McMoveDevice> wrapper, McMoveDevice up, BiPredicate<McMoveDevice, McMoveDevice> updateFilter, BiConsumer<McMoveDevice, McMoveDeviceUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, whereSet);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<McMoveDevice> wrapper, McMoveDevice up, BiPredicate<McMoveDevice, McMoveDevice> updateFilter, BiConsumer<McMoveDevice, McMoveDeviceUpdateWrapper> whereSet) {
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

    default public boolean removeByIds(Consumer<McMoveDeviceQueryWrapper> wrapper) {
        return removeByIds(1000, wrapper);
    }

    default public boolean removeByIds(int pageSize, Consumer<McMoveDeviceQueryWrapper> wrapper) {
        McMoveDeviceQueryWrapper removeWrapper = McMoveDeviceQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return removeByIds(pageSize, removeWrapper);
    }

    default public boolean removeByIds(McMoveDeviceQueryWrapper removeWrapper) {
        return removeByIds(1000, removeWrapper);
    }

    default public boolean removeByIds(int pageSize, McMoveDeviceQueryWrapper removeWrapper) {
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
