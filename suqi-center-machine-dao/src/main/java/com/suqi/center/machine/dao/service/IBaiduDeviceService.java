package com.suqi.center.machine.dao.service;

import com.suqi.center.machine.dao.entity.BaiduDevice;
import com.suqi.center.machine.dao.wrapper.BaiduDeviceQueryWrapper;
import com.suqi.center.machine.dao.wrapper.BaiduDeviceUpdateWrapper;
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
 * 百度云机 服务类
 * </p>
 *
 * @author PC001
 * @since 2023-08-25
 */
public interface IBaiduDeviceService extends IService<BaiduDevice> {

    default long count(Consumer<BaiduDeviceQueryWrapper> wrapperConsumer) {
        BaiduDeviceQueryWrapper queryWrapper = BaiduDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return count(queryWrapper);
    }

    default public BaiduDevice selectOne(Consumer<BaiduDeviceQueryWrapper> wrapperConsumer) {
        BaiduDeviceQueryWrapper queryWrapper = BaiduDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        queryWrapper.last(" limit 1 ");
        return getOne(queryWrapper, false);
    }

    default public List<BaiduDevice> select(Consumer<BaiduDeviceQueryWrapper> wrapperConsumer) {
        BaiduDeviceQueryWrapper queryWrapper = BaiduDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public List<BaiduDevice> list(Consumer<BaiduDeviceQueryWrapper> wrapperConsumer) {
        BaiduDeviceQueryWrapper queryWrapper = BaiduDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public boolean update(Consumer<BaiduDeviceUpdateWrapper> wrapper) {
        BaiduDeviceUpdateWrapper updateWrapper = BaiduDeviceUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(updateWrapper);
    }

    default public boolean update(BaiduDevice up, Consumer<BaiduDeviceUpdateWrapper> wrapper) {
        BaiduDeviceUpdateWrapper updateWrapper = BaiduDeviceUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean update(Consumer<BaiduDevice> setUp, Consumer<BaiduDeviceUpdateWrapper> wrapper) {
        BaiduDevice up = new BaiduDevice();
        setUp.accept(up);
        BaiduDeviceUpdateWrapper updateWrapper = BaiduDeviceUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean remove(Consumer<BaiduDeviceQueryWrapper> wrapper) {
        BaiduDeviceQueryWrapper removeWrapper = BaiduDeviceQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return remove(removeWrapper);
    }

    default public Page<BaiduDevice> page(Page<BaiduDevice> page, Consumer<BaiduDeviceQueryWrapper> wrapperConsumer) {
        BaiduDeviceQueryWrapper queryWrapper = BaiduDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default Page<BaiduDevice> quickPageById(Page<BaiduDevice> page, long lastId, QueryWrapper<BaiduDevice> wrapper) {
        return quickPageById(true, page, lastId, wrapper);
    }

    default Page<BaiduDevice> quickPageById(Page<BaiduDevice> page, long lastId, Consumer<BaiduDeviceQueryWrapper> wrapperConsumer) {
        BaiduDeviceQueryWrapper queryWrapper = BaiduDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPageById(true, page, lastId, queryWrapper);
    }

    default Page<BaiduDevice> quickPageById(boolean queryTotals, Page<BaiduDevice> page, long lastId, QueryWrapper<BaiduDevice> wrapper) {
        return page(page, wrapper);
    }

    default Page<BaiduDevice> quickPage(Page<BaiduDevice> page, QueryWrapper<BaiduDevice> wrapper) {
        return IService.super.page(page, wrapper);
    }

    default Page<BaiduDevice> page(Page<BaiduDevice> page, QueryWrapper<BaiduDevice> wrapper) {
        return quickPage(page, wrapper);
    }

    default Page<BaiduDevice> quickPage(Page<BaiduDevice> page, Consumer<BaiduDeviceQueryWrapper> wrapperConsumer) {
        BaiduDeviceQueryWrapper queryWrapper = BaiduDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default public void pageConsumerByWrapper(Consumer<BaiduDeviceQueryWrapper> wrapperConsumer, Consumer<BaiduDevice> consumer) {
        BaiduDeviceQueryWrapper queryWrapper = BaiduDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumerByWrapper(int pageSize, Consumer<BaiduDeviceQueryWrapper> wrapperConsumer, Consumer<BaiduDevice> consumer) {
        BaiduDeviceQueryWrapper queryWrapper = BaiduDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(QueryWrapper<BaiduDevice> queryWrapper, Consumer<BaiduDevice> consumer) {
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(int pageSize, QueryWrapper<BaiduDevice> queryWrapper, Consumer<BaiduDevice> consumer) {
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(Function<Page<BaiduDevice>, Page<BaiduDevice>> consumerSupplier, Consumer<BaiduDevice> consumer) {
        pageConsumer(1000, consumerSupplier, consumer);
    }

    default public void pageConsumer(int pageSize, Function<Page<BaiduDevice>, Page<BaiduDevice>> consumerSupplier, Consumer<BaiduDevice> consumer) {
        Page<BaiduDevice> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<BaiduDevice> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    for (BaiduDevice t : result) {
                        consumer.accept(t);
                    }
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public void pageConsumersByWrapper(Consumer<BaiduDeviceQueryWrapper> wrapperConsumer, Consumer<List<BaiduDevice>> consumerList) {
        BaiduDeviceQueryWrapper queryWrapper = BaiduDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumersByWrapper(int pageSize, Consumer<BaiduDeviceQueryWrapper> wrapperConsumer, Consumer<List<BaiduDevice>> consumerList) {
        BaiduDeviceQueryWrapper queryWrapper = BaiduDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(QueryWrapper<BaiduDevice> queryWrapper, Consumer<List<BaiduDevice>> consumerList) {
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(int pageSize, QueryWrapper<BaiduDevice> queryWrapper, Consumer<List<BaiduDevice>> consumerList) {
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(Function<Page<BaiduDevice>, Page<BaiduDevice>> consumerSupplier, Consumer<List<BaiduDevice>> consumerList) {
        pageConsumers(1000, consumerSupplier, consumerList);
    }

    default public void pageConsumers(int pageSize, Function<Page<BaiduDevice>, Page<BaiduDevice>> consumerSupplier, Consumer<List<BaiduDevice>> consumerList) {
        Page<BaiduDevice> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<BaiduDevice> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    consumerList.accept(result);
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public boolean queryAndUpdateById(QueryWrapper<BaiduDevice> wrapper, BaiduDevice up) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<BaiduDevice> wrapper, BaiduDevice up) {
        return queryAndUpdateById(pageSize, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<BaiduDevice> wrapper, BaiduDevice up, BiPredicate<BaiduDevice, BaiduDevice> updateFilter) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<BaiduDevice> wrapper, BaiduDevice up, BiPredicate<BaiduDevice, BaiduDevice> updateFilter) {
        return queryAndUpdateById(pageSize, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<BaiduDevice> wrapper, BaiduDevice up, BiConsumer<BaiduDevice, BaiduDeviceUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, whereSet);
    }

    default public boolean queryAndUpdateById(QueryWrapper<BaiduDevice> wrapper, BaiduDevice up, BiPredicate<BaiduDevice, BaiduDevice> updateFilter, BiConsumer<BaiduDevice, BaiduDeviceUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, whereSet);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<BaiduDevice> wrapper, BaiduDevice up, BiPredicate<BaiduDevice, BaiduDevice> updateFilter, BiConsumer<BaiduDevice, BaiduDeviceUpdateWrapper> whereSet) {
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

    default public boolean removeByIds(Consumer<BaiduDeviceQueryWrapper> wrapper) {
        return removeByIds(1000, wrapper);
    }

    default public boolean removeByIds(int pageSize, Consumer<BaiduDeviceQueryWrapper> wrapper) {
        BaiduDeviceQueryWrapper removeWrapper = BaiduDeviceQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return removeByIds(pageSize, removeWrapper);
    }

    default public boolean removeByIds(BaiduDeviceQueryWrapper removeWrapper) {
        return removeByIds(1000, removeWrapper);
    }

    default public boolean removeByIds(int pageSize, BaiduDeviceQueryWrapper removeWrapper) {
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
