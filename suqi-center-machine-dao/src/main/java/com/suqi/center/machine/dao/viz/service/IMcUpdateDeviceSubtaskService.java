package com.suqi.center.machine.dao.viz.service;

import com.suqi.center.machine.dao.viz.entity.McUpdateDeviceSubtask;
import com.suqi.center.machine.dao.viz.wrapper.McUpdateDeviceSubtaskQueryWrapper;
import com.suqi.center.machine.dao.viz.wrapper.McUpdateDeviceSubtaskUpdateWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * <p>
 * 更新机器子任务表 服务类
 * </p>
 *
 * @author 18374
 * @since 2023-08-14
 */
public interface IMcUpdateDeviceSubtaskService extends IService<McUpdateDeviceSubtask> {

    default long count(Consumer<McUpdateDeviceSubtaskQueryWrapper> wrapperConsumer) {
        McUpdateDeviceSubtaskQueryWrapper queryWrapper = McUpdateDeviceSubtaskQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return count(queryWrapper);
    }

    default public McUpdateDeviceSubtask selectOne(Consumer<McUpdateDeviceSubtaskQueryWrapper> wrapperConsumer) {
        McUpdateDeviceSubtaskQueryWrapper queryWrapper = McUpdateDeviceSubtaskQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        queryWrapper.last(" limit 1 ");
        return getOne(queryWrapper, false);
    }

    default public List<McUpdateDeviceSubtask> select(Consumer<McUpdateDeviceSubtaskQueryWrapper> wrapperConsumer) {
        McUpdateDeviceSubtaskQueryWrapper queryWrapper = McUpdateDeviceSubtaskQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public List<McUpdateDeviceSubtask> list(Consumer<McUpdateDeviceSubtaskQueryWrapper> wrapperConsumer) {
        McUpdateDeviceSubtaskQueryWrapper queryWrapper = McUpdateDeviceSubtaskQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public boolean update(Consumer<McUpdateDeviceSubtaskUpdateWrapper> wrapper) {
        McUpdateDeviceSubtaskUpdateWrapper updateWrapper = McUpdateDeviceSubtaskUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(updateWrapper);
    }

    default public boolean update(McUpdateDeviceSubtask up, Consumer<McUpdateDeviceSubtaskUpdateWrapper> wrapper) {
        McUpdateDeviceSubtaskUpdateWrapper updateWrapper = McUpdateDeviceSubtaskUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean update(Consumer<McUpdateDeviceSubtask> setUp, Consumer<McUpdateDeviceSubtaskUpdateWrapper> wrapper) {
        McUpdateDeviceSubtask up = new McUpdateDeviceSubtask();
        setUp.accept(up);
        McUpdateDeviceSubtaskUpdateWrapper updateWrapper = McUpdateDeviceSubtaskUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean remove(Consumer<McUpdateDeviceSubtaskQueryWrapper> wrapper) {
        McUpdateDeviceSubtaskQueryWrapper removeWrapper = McUpdateDeviceSubtaskQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return remove(removeWrapper);
    }

    default public Page<McUpdateDeviceSubtask> page(Page<McUpdateDeviceSubtask> page, Consumer<McUpdateDeviceSubtaskQueryWrapper> wrapperConsumer) {
        McUpdateDeviceSubtaskQueryWrapper queryWrapper = McUpdateDeviceSubtaskQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default Page<McUpdateDeviceSubtask> quickPageById(Page<McUpdateDeviceSubtask> page, long lastId, QueryWrapper<McUpdateDeviceSubtask> wrapper) {
        return quickPageById(true, page, lastId, wrapper);
    }

    default Page<McUpdateDeviceSubtask> quickPageById(Page<McUpdateDeviceSubtask> page, long lastId, Consumer<McUpdateDeviceSubtaskQueryWrapper> wrapperConsumer) {
        McUpdateDeviceSubtaskQueryWrapper queryWrapper = McUpdateDeviceSubtaskQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPageById(true, page, lastId, queryWrapper);
    }

    default Page<McUpdateDeviceSubtask> quickPageById(boolean queryTotals, Page<McUpdateDeviceSubtask> page, long lastId, QueryWrapper<McUpdateDeviceSubtask> wrapper) {
        return page(page, wrapper);
    }

    default Page<McUpdateDeviceSubtask> quickPage(Page<McUpdateDeviceSubtask> page, QueryWrapper<McUpdateDeviceSubtask> wrapper) {
        return IService.super.page(page, wrapper);
    }

    default Page<McUpdateDeviceSubtask> page(Page<McUpdateDeviceSubtask> page, QueryWrapper<McUpdateDeviceSubtask> wrapper) {
        return quickPage(page, wrapper);
    }

    default Page<McUpdateDeviceSubtask> quickPage(Page<McUpdateDeviceSubtask> page, Consumer<McUpdateDeviceSubtaskQueryWrapper> wrapperConsumer) {
        McUpdateDeviceSubtaskQueryWrapper queryWrapper = McUpdateDeviceSubtaskQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default public void pageConsumerByWrapper(Consumer<McUpdateDeviceSubtaskQueryWrapper> wrapperConsumer, Consumer<McUpdateDeviceSubtask> consumer) {
        McUpdateDeviceSubtaskQueryWrapper queryWrapper = McUpdateDeviceSubtaskQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumerByWrapper(int pageSize, Consumer<McUpdateDeviceSubtaskQueryWrapper> wrapperConsumer, Consumer<McUpdateDeviceSubtask> consumer) {
        McUpdateDeviceSubtaskQueryWrapper queryWrapper = McUpdateDeviceSubtaskQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(QueryWrapper<McUpdateDeviceSubtask> queryWrapper, Consumer<McUpdateDeviceSubtask> consumer) {
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(int pageSize, QueryWrapper<McUpdateDeviceSubtask> queryWrapper, Consumer<McUpdateDeviceSubtask> consumer) {
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(Function<Page<McUpdateDeviceSubtask>, Page<McUpdateDeviceSubtask>> consumerSupplier, Consumer<McUpdateDeviceSubtask> consumer) {
        pageConsumer(1000, consumerSupplier, consumer);
    }

    default public void pageConsumer(int pageSize, Function<Page<McUpdateDeviceSubtask>, Page<McUpdateDeviceSubtask>> consumerSupplier, Consumer<McUpdateDeviceSubtask> consumer) {
        Page<McUpdateDeviceSubtask> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<McUpdateDeviceSubtask> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    for (McUpdateDeviceSubtask t : result) {
                        consumer.accept(t);
                    }
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public void pageConsumersByWrapper(Consumer<McUpdateDeviceSubtaskQueryWrapper> wrapperConsumer, Consumer<List<McUpdateDeviceSubtask>> consumerList) {
        McUpdateDeviceSubtaskQueryWrapper queryWrapper = McUpdateDeviceSubtaskQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumersByWrapper(int pageSize, Consumer<McUpdateDeviceSubtaskQueryWrapper> wrapperConsumer, Consumer<List<McUpdateDeviceSubtask>> consumerList) {
        McUpdateDeviceSubtaskQueryWrapper queryWrapper = McUpdateDeviceSubtaskQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(QueryWrapper<McUpdateDeviceSubtask> queryWrapper, Consumer<List<McUpdateDeviceSubtask>> consumerList) {
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(int pageSize, QueryWrapper<McUpdateDeviceSubtask> queryWrapper, Consumer<List<McUpdateDeviceSubtask>> consumerList) {
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(Function<Page<McUpdateDeviceSubtask>, Page<McUpdateDeviceSubtask>> consumerSupplier, Consumer<List<McUpdateDeviceSubtask>> consumerList) {
        pageConsumers(1000, consumerSupplier, consumerList);
    }

    default public void pageConsumers(int pageSize, Function<Page<McUpdateDeviceSubtask>, Page<McUpdateDeviceSubtask>> consumerSupplier, Consumer<List<McUpdateDeviceSubtask>> consumerList) {
        Page<McUpdateDeviceSubtask> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<McUpdateDeviceSubtask> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    consumerList.accept(result);
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public boolean queryAndUpdateById(QueryWrapper<McUpdateDeviceSubtask> wrapper, McUpdateDeviceSubtask up) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<McUpdateDeviceSubtask> wrapper, McUpdateDeviceSubtask up) {
        return queryAndUpdateById(pageSize, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<McUpdateDeviceSubtask> wrapper, McUpdateDeviceSubtask up, BiPredicate<McUpdateDeviceSubtask, McUpdateDeviceSubtask> updateFilter) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<McUpdateDeviceSubtask> wrapper, McUpdateDeviceSubtask up, BiPredicate<McUpdateDeviceSubtask, McUpdateDeviceSubtask> updateFilter) {
        return queryAndUpdateById(pageSize, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<McUpdateDeviceSubtask> wrapper, McUpdateDeviceSubtask up, BiConsumer<McUpdateDeviceSubtask, McUpdateDeviceSubtaskUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, whereSet);
    }

    default public boolean queryAndUpdateById(QueryWrapper<McUpdateDeviceSubtask> wrapper, McUpdateDeviceSubtask up, BiPredicate<McUpdateDeviceSubtask, McUpdateDeviceSubtask> updateFilter, BiConsumer<McUpdateDeviceSubtask, McUpdateDeviceSubtaskUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, whereSet);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<McUpdateDeviceSubtask> wrapper, McUpdateDeviceSubtask up, BiPredicate<McUpdateDeviceSubtask, McUpdateDeviceSubtask> updateFilter, BiConsumer<McUpdateDeviceSubtask, McUpdateDeviceSubtaskUpdateWrapper> whereSet) {
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

    default public boolean removeByIds(Consumer<McUpdateDeviceSubtaskQueryWrapper> wrapper) {
        return removeByIds(1000, wrapper);
    }

    default public boolean removeByIds(int pageSize, Consumer<McUpdateDeviceSubtaskQueryWrapper> wrapper) {
        McUpdateDeviceSubtaskQueryWrapper removeWrapper = McUpdateDeviceSubtaskQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return removeByIds(pageSize, removeWrapper);
    }

    default public boolean removeByIds(McUpdateDeviceSubtaskQueryWrapper removeWrapper) {
        return removeByIds(1000, removeWrapper);
    }

    default public boolean removeByIds(int pageSize, McUpdateDeviceSubtaskQueryWrapper removeWrapper) {
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
