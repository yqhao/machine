package com.suqi.center.machine.dao.service;

import com.suqi.center.machine.dao.entity.TencentDeviceAccessInfo;
import com.suqi.center.machine.dao.wrapper.TencentDeviceAccessInfoQueryWrapper;
import com.suqi.center.machine.dao.wrapper.TencentDeviceAccessInfoUpdateWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * <p>
 * 腾讯设备公网映射表 服务类
 * </p>
 *
 * @author PC001
 * @since 2023-06-14
 */
public interface ITencentDeviceAccessInfoService extends IService<TencentDeviceAccessInfo> {

    default long count(Consumer<TencentDeviceAccessInfoQueryWrapper> wrapperConsumer) {
        TencentDeviceAccessInfoQueryWrapper queryWrapper = TencentDeviceAccessInfoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return count(queryWrapper);
    }

    default public TencentDeviceAccessInfo selectOne(Consumer<TencentDeviceAccessInfoQueryWrapper> wrapperConsumer) {
        TencentDeviceAccessInfoQueryWrapper queryWrapper = TencentDeviceAccessInfoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        queryWrapper.last(" limit 1 ");
        return getOne(queryWrapper, false);
    }

    default public List<TencentDeviceAccessInfo> select(Consumer<TencentDeviceAccessInfoQueryWrapper> wrapperConsumer) {
        TencentDeviceAccessInfoQueryWrapper queryWrapper = TencentDeviceAccessInfoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public List<TencentDeviceAccessInfo> list(Consumer<TencentDeviceAccessInfoQueryWrapper> wrapperConsumer) {
        TencentDeviceAccessInfoQueryWrapper queryWrapper = TencentDeviceAccessInfoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public boolean update(Consumer<TencentDeviceAccessInfoUpdateWrapper> wrapper) {
        TencentDeviceAccessInfoUpdateWrapper updateWrapper = TencentDeviceAccessInfoUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(updateWrapper);
    }

    default public boolean update(TencentDeviceAccessInfo up, Consumer<TencentDeviceAccessInfoUpdateWrapper> wrapper) {
        TencentDeviceAccessInfoUpdateWrapper updateWrapper = TencentDeviceAccessInfoUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean update(Consumer<TencentDeviceAccessInfo> setUp, Consumer<TencentDeviceAccessInfoUpdateWrapper> wrapper) {
        TencentDeviceAccessInfo up = new TencentDeviceAccessInfo();
        setUp.accept(up);
        TencentDeviceAccessInfoUpdateWrapper updateWrapper = TencentDeviceAccessInfoUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean remove(Consumer<TencentDeviceAccessInfoQueryWrapper> wrapper) {
        TencentDeviceAccessInfoQueryWrapper removeWrapper = TencentDeviceAccessInfoQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return remove(removeWrapper);
    }

    default public Page<TencentDeviceAccessInfo> page(Page<TencentDeviceAccessInfo> page, Consumer<TencentDeviceAccessInfoQueryWrapper> wrapperConsumer) {
        TencentDeviceAccessInfoQueryWrapper queryWrapper = TencentDeviceAccessInfoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default Page<TencentDeviceAccessInfo> quickPageById(Page<TencentDeviceAccessInfo> page, long lastId, QueryWrapper<TencentDeviceAccessInfo> wrapper) {
        return quickPageById(true, page, lastId, wrapper);
    }

    default Page<TencentDeviceAccessInfo> quickPageById(Page<TencentDeviceAccessInfo> page, long lastId, Consumer<TencentDeviceAccessInfoQueryWrapper> wrapperConsumer) {
        TencentDeviceAccessInfoQueryWrapper queryWrapper = TencentDeviceAccessInfoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPageById(true, page, lastId, queryWrapper);
    }

    default Page<TencentDeviceAccessInfo> quickPageById(boolean queryTotals, Page<TencentDeviceAccessInfo> page, long lastId, QueryWrapper<TencentDeviceAccessInfo> wrapper) {
        return page(page, wrapper);
    }

    default Page<TencentDeviceAccessInfo> quickPage(Page<TencentDeviceAccessInfo> page, QueryWrapper<TencentDeviceAccessInfo> wrapper) {
        return IService.super.page(page, wrapper);
    }

    default Page<TencentDeviceAccessInfo> page(Page<TencentDeviceAccessInfo> page, QueryWrapper<TencentDeviceAccessInfo> wrapper) {
        return quickPage(page, wrapper);
    }

    default Page<TencentDeviceAccessInfo> quickPage(Page<TencentDeviceAccessInfo> page, Consumer<TencentDeviceAccessInfoQueryWrapper> wrapperConsumer) {
        TencentDeviceAccessInfoQueryWrapper queryWrapper = TencentDeviceAccessInfoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default public void pageConsumerByWrapper(Consumer<TencentDeviceAccessInfoQueryWrapper> wrapperConsumer, Consumer<TencentDeviceAccessInfo> consumer) {
        TencentDeviceAccessInfoQueryWrapper queryWrapper = TencentDeviceAccessInfoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumerByWrapper(int pageSize, Consumer<TencentDeviceAccessInfoQueryWrapper> wrapperConsumer, Consumer<TencentDeviceAccessInfo> consumer) {
        TencentDeviceAccessInfoQueryWrapper queryWrapper = TencentDeviceAccessInfoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(QueryWrapper<TencentDeviceAccessInfo> queryWrapper, Consumer<TencentDeviceAccessInfo> consumer) {
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(int pageSize, QueryWrapper<TencentDeviceAccessInfo> queryWrapper, Consumer<TencentDeviceAccessInfo> consumer) {
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(Function<Page<TencentDeviceAccessInfo>, Page<TencentDeviceAccessInfo>> consumerSupplier, Consumer<TencentDeviceAccessInfo> consumer) {
        pageConsumer(1000, consumerSupplier, consumer);
    }

    default public void pageConsumer(int pageSize, Function<Page<TencentDeviceAccessInfo>, Page<TencentDeviceAccessInfo>> consumerSupplier, Consumer<TencentDeviceAccessInfo> consumer) {
        Page<TencentDeviceAccessInfo> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<TencentDeviceAccessInfo> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    for (TencentDeviceAccessInfo t : result) {
                        consumer.accept(t);
                    }
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public void pageConsumersByWrapper(Consumer<TencentDeviceAccessInfoQueryWrapper> wrapperConsumer, Consumer<List<TencentDeviceAccessInfo>> consumerList) {
        TencentDeviceAccessInfoQueryWrapper queryWrapper = TencentDeviceAccessInfoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumersByWrapper(int pageSize, Consumer<TencentDeviceAccessInfoQueryWrapper> wrapperConsumer, Consumer<List<TencentDeviceAccessInfo>> consumerList) {
        TencentDeviceAccessInfoQueryWrapper queryWrapper = TencentDeviceAccessInfoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(QueryWrapper<TencentDeviceAccessInfo> queryWrapper, Consumer<List<TencentDeviceAccessInfo>> consumerList) {
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(int pageSize, QueryWrapper<TencentDeviceAccessInfo> queryWrapper, Consumer<List<TencentDeviceAccessInfo>> consumerList) {
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(Function<Page<TencentDeviceAccessInfo>, Page<TencentDeviceAccessInfo>> consumerSupplier, Consumer<List<TencentDeviceAccessInfo>> consumerList) {
        pageConsumers(1000, consumerSupplier, consumerList);
    }

    default public void pageConsumers(int pageSize, Function<Page<TencentDeviceAccessInfo>, Page<TencentDeviceAccessInfo>> consumerSupplier, Consumer<List<TencentDeviceAccessInfo>> consumerList) {
        Page<TencentDeviceAccessInfo> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<TencentDeviceAccessInfo> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    consumerList.accept(result);
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public boolean queryAndUpdateById(QueryWrapper<TencentDeviceAccessInfo> wrapper, TencentDeviceAccessInfo up) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<TencentDeviceAccessInfo> wrapper, TencentDeviceAccessInfo up) {
        return queryAndUpdateById(pageSize, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<TencentDeviceAccessInfo> wrapper, TencentDeviceAccessInfo up, BiPredicate<TencentDeviceAccessInfo, TencentDeviceAccessInfo> updateFilter) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<TencentDeviceAccessInfo> wrapper, TencentDeviceAccessInfo up, BiPredicate<TencentDeviceAccessInfo, TencentDeviceAccessInfo> updateFilter) {
        return queryAndUpdateById(pageSize, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<TencentDeviceAccessInfo> wrapper, TencentDeviceAccessInfo up, BiConsumer<TencentDeviceAccessInfo, TencentDeviceAccessInfoUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, whereSet);
    }

    default public boolean queryAndUpdateById(QueryWrapper<TencentDeviceAccessInfo> wrapper, TencentDeviceAccessInfo up, BiPredicate<TencentDeviceAccessInfo, TencentDeviceAccessInfo> updateFilter, BiConsumer<TencentDeviceAccessInfo, TencentDeviceAccessInfoUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, whereSet);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<TencentDeviceAccessInfo> wrapper, TencentDeviceAccessInfo up, BiPredicate<TencentDeviceAccessInfo, TencentDeviceAccessInfo> updateFilter, BiConsumer<TencentDeviceAccessInfo, TencentDeviceAccessInfoUpdateWrapper> whereSet) {
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

    default public boolean removeByIds(Consumer<TencentDeviceAccessInfoQueryWrapper> wrapper) {
        return removeByIds(1000, wrapper);
    }

    default public boolean removeByIds(int pageSize, Consumer<TencentDeviceAccessInfoQueryWrapper> wrapper) {
        TencentDeviceAccessInfoQueryWrapper removeWrapper = TencentDeviceAccessInfoQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return removeByIds(pageSize, removeWrapper);
    }

    default public boolean removeByIds(TencentDeviceAccessInfoQueryWrapper removeWrapper) {
        return removeByIds(1000, removeWrapper);
    }

    default public boolean removeByIds(int pageSize, TencentDeviceAccessInfoQueryWrapper removeWrapper) {
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
