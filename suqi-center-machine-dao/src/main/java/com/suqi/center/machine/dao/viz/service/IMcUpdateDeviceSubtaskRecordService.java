package com.suqi.center.machine.dao.viz.service;

import com.suqi.center.machine.dao.viz.entity.McUpdateDeviceSubtaskRecord;
import com.suqi.center.machine.dao.viz.wrapper.McUpdateDeviceSubtaskRecordQueryWrapper;
import com.suqi.center.machine.dao.viz.wrapper.McUpdateDeviceSubtaskRecordUpdateWrapper;
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
 * 机器更新子任务记录表 服务类
 * </p>
 *
 * @author 18374
 * @since 2023-08-15
 */
public interface IMcUpdateDeviceSubtaskRecordService extends IService<McUpdateDeviceSubtaskRecord> {

    default long count(Consumer<McUpdateDeviceSubtaskRecordQueryWrapper> wrapperConsumer) {
        McUpdateDeviceSubtaskRecordQueryWrapper queryWrapper = McUpdateDeviceSubtaskRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return count(queryWrapper);
    }

    default public McUpdateDeviceSubtaskRecord selectOne(Consumer<McUpdateDeviceSubtaskRecordQueryWrapper> wrapperConsumer) {
        McUpdateDeviceSubtaskRecordQueryWrapper queryWrapper = McUpdateDeviceSubtaskRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        queryWrapper.last(" limit 1 ");
        return getOne(queryWrapper, false);
    }

    default public List<McUpdateDeviceSubtaskRecord> select(Consumer<McUpdateDeviceSubtaskRecordQueryWrapper> wrapperConsumer) {
        McUpdateDeviceSubtaskRecordQueryWrapper queryWrapper = McUpdateDeviceSubtaskRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public List<McUpdateDeviceSubtaskRecord> list(Consumer<McUpdateDeviceSubtaskRecordQueryWrapper> wrapperConsumer) {
        McUpdateDeviceSubtaskRecordQueryWrapper queryWrapper = McUpdateDeviceSubtaskRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public boolean update(Consumer<McUpdateDeviceSubtaskRecordUpdateWrapper> wrapper) {
        McUpdateDeviceSubtaskRecordUpdateWrapper updateWrapper = McUpdateDeviceSubtaskRecordUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(updateWrapper);
    }

    default public boolean update(McUpdateDeviceSubtaskRecord up, Consumer<McUpdateDeviceSubtaskRecordUpdateWrapper> wrapper) {
        McUpdateDeviceSubtaskRecordUpdateWrapper updateWrapper = McUpdateDeviceSubtaskRecordUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean update(Consumer<McUpdateDeviceSubtaskRecord> setUp, Consumer<McUpdateDeviceSubtaskRecordUpdateWrapper> wrapper) {
        McUpdateDeviceSubtaskRecord up = new McUpdateDeviceSubtaskRecord();
        setUp.accept(up);
        McUpdateDeviceSubtaskRecordUpdateWrapper updateWrapper = McUpdateDeviceSubtaskRecordUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean remove(Consumer<McUpdateDeviceSubtaskRecordQueryWrapper> wrapper) {
        McUpdateDeviceSubtaskRecordQueryWrapper removeWrapper = McUpdateDeviceSubtaskRecordQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return remove(removeWrapper);
    }

    default public Page<McUpdateDeviceSubtaskRecord> page(Page<McUpdateDeviceSubtaskRecord> page, Consumer<McUpdateDeviceSubtaskRecordQueryWrapper> wrapperConsumer) {
        McUpdateDeviceSubtaskRecordQueryWrapper queryWrapper = McUpdateDeviceSubtaskRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default Page<McUpdateDeviceSubtaskRecord> quickPageById(Page<McUpdateDeviceSubtaskRecord> page, long lastId, QueryWrapper<McUpdateDeviceSubtaskRecord> wrapper) {
        return quickPageById(true, page, lastId, wrapper);
    }

    default Page<McUpdateDeviceSubtaskRecord> quickPageById(Page<McUpdateDeviceSubtaskRecord> page, long lastId, Consumer<McUpdateDeviceSubtaskRecordQueryWrapper> wrapperConsumer) {
        McUpdateDeviceSubtaskRecordQueryWrapper queryWrapper = McUpdateDeviceSubtaskRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPageById(true, page, lastId, queryWrapper);
    }

    default Page<McUpdateDeviceSubtaskRecord> quickPageById(boolean queryTotals, Page<McUpdateDeviceSubtaskRecord> page, long lastId, QueryWrapper<McUpdateDeviceSubtaskRecord> wrapper) {
        return page(page, wrapper);
    }

    default Page<McUpdateDeviceSubtaskRecord> quickPage(Page<McUpdateDeviceSubtaskRecord> page, QueryWrapper<McUpdateDeviceSubtaskRecord> wrapper) {
        return IService.super.page(page, wrapper);
    }

    default Page<McUpdateDeviceSubtaskRecord> page(Page<McUpdateDeviceSubtaskRecord> page, QueryWrapper<McUpdateDeviceSubtaskRecord> wrapper) {
        return quickPage(page, wrapper);
    }

    default Page<McUpdateDeviceSubtaskRecord> quickPage(Page<McUpdateDeviceSubtaskRecord> page, Consumer<McUpdateDeviceSubtaskRecordQueryWrapper> wrapperConsumer) {
        McUpdateDeviceSubtaskRecordQueryWrapper queryWrapper = McUpdateDeviceSubtaskRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default public void pageConsumerByWrapper(Consumer<McUpdateDeviceSubtaskRecordQueryWrapper> wrapperConsumer, Consumer<McUpdateDeviceSubtaskRecord> consumer) {
        McUpdateDeviceSubtaskRecordQueryWrapper queryWrapper = McUpdateDeviceSubtaskRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumerByWrapper(int pageSize, Consumer<McUpdateDeviceSubtaskRecordQueryWrapper> wrapperConsumer, Consumer<McUpdateDeviceSubtaskRecord> consumer) {
        McUpdateDeviceSubtaskRecordQueryWrapper queryWrapper = McUpdateDeviceSubtaskRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(QueryWrapper<McUpdateDeviceSubtaskRecord> queryWrapper, Consumer<McUpdateDeviceSubtaskRecord> consumer) {
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(int pageSize, QueryWrapper<McUpdateDeviceSubtaskRecord> queryWrapper, Consumer<McUpdateDeviceSubtaskRecord> consumer) {
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(Function<Page<McUpdateDeviceSubtaskRecord>, Page<McUpdateDeviceSubtaskRecord>> consumerSupplier, Consumer<McUpdateDeviceSubtaskRecord> consumer) {
        pageConsumer(1000, consumerSupplier, consumer);
    }

    default public void pageConsumer(int pageSize, Function<Page<McUpdateDeviceSubtaskRecord>, Page<McUpdateDeviceSubtaskRecord>> consumerSupplier, Consumer<McUpdateDeviceSubtaskRecord> consumer) {
        Page<McUpdateDeviceSubtaskRecord> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<McUpdateDeviceSubtaskRecord> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    for (McUpdateDeviceSubtaskRecord t : result) {
                        consumer.accept(t);
                    }
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public void pageConsumersByWrapper(Consumer<McUpdateDeviceSubtaskRecordQueryWrapper> wrapperConsumer, Consumer<List<McUpdateDeviceSubtaskRecord>> consumerList) {
        McUpdateDeviceSubtaskRecordQueryWrapper queryWrapper = McUpdateDeviceSubtaskRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumersByWrapper(int pageSize, Consumer<McUpdateDeviceSubtaskRecordQueryWrapper> wrapperConsumer, Consumer<List<McUpdateDeviceSubtaskRecord>> consumerList) {
        McUpdateDeviceSubtaskRecordQueryWrapper queryWrapper = McUpdateDeviceSubtaskRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(QueryWrapper<McUpdateDeviceSubtaskRecord> queryWrapper, Consumer<List<McUpdateDeviceSubtaskRecord>> consumerList) {
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(int pageSize, QueryWrapper<McUpdateDeviceSubtaskRecord> queryWrapper, Consumer<List<McUpdateDeviceSubtaskRecord>> consumerList) {
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(Function<Page<McUpdateDeviceSubtaskRecord>, Page<McUpdateDeviceSubtaskRecord>> consumerSupplier, Consumer<List<McUpdateDeviceSubtaskRecord>> consumerList) {
        pageConsumers(1000, consumerSupplier, consumerList);
    }

    default public void pageConsumers(int pageSize, Function<Page<McUpdateDeviceSubtaskRecord>, Page<McUpdateDeviceSubtaskRecord>> consumerSupplier, Consumer<List<McUpdateDeviceSubtaskRecord>> consumerList) {
        Page<McUpdateDeviceSubtaskRecord> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<McUpdateDeviceSubtaskRecord> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    consumerList.accept(result);
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public boolean queryAndUpdateById(QueryWrapper<McUpdateDeviceSubtaskRecord> wrapper, McUpdateDeviceSubtaskRecord up) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<McUpdateDeviceSubtaskRecord> wrapper, McUpdateDeviceSubtaskRecord up) {
        return queryAndUpdateById(pageSize, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<McUpdateDeviceSubtaskRecord> wrapper, McUpdateDeviceSubtaskRecord up, BiPredicate<McUpdateDeviceSubtaskRecord, McUpdateDeviceSubtaskRecord> updateFilter) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<McUpdateDeviceSubtaskRecord> wrapper, McUpdateDeviceSubtaskRecord up, BiPredicate<McUpdateDeviceSubtaskRecord, McUpdateDeviceSubtaskRecord> updateFilter) {
        return queryAndUpdateById(pageSize, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<McUpdateDeviceSubtaskRecord> wrapper, McUpdateDeviceSubtaskRecord up, BiConsumer<McUpdateDeviceSubtaskRecord, McUpdateDeviceSubtaskRecordUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, whereSet);
    }

    default public boolean queryAndUpdateById(QueryWrapper<McUpdateDeviceSubtaskRecord> wrapper, McUpdateDeviceSubtaskRecord up, BiPredicate<McUpdateDeviceSubtaskRecord, McUpdateDeviceSubtaskRecord> updateFilter, BiConsumer<McUpdateDeviceSubtaskRecord, McUpdateDeviceSubtaskRecordUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, whereSet);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<McUpdateDeviceSubtaskRecord> wrapper, McUpdateDeviceSubtaskRecord up, BiPredicate<McUpdateDeviceSubtaskRecord, McUpdateDeviceSubtaskRecord> updateFilter, BiConsumer<McUpdateDeviceSubtaskRecord, McUpdateDeviceSubtaskRecordUpdateWrapper> whereSet) {
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

    default public boolean removeByIds(Consumer<McUpdateDeviceSubtaskRecordQueryWrapper> wrapper) {
        return removeByIds(1000, wrapper);
    }

    default public boolean removeByIds(int pageSize, Consumer<McUpdateDeviceSubtaskRecordQueryWrapper> wrapper) {
        McUpdateDeviceSubtaskRecordQueryWrapper removeWrapper = McUpdateDeviceSubtaskRecordQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return removeByIds(pageSize, removeWrapper);
    }

    default public boolean removeByIds(McUpdateDeviceSubtaskRecordQueryWrapper removeWrapper) {
        return removeByIds(1000, removeWrapper);
    }

    default public boolean removeByIds(int pageSize, McUpdateDeviceSubtaskRecordQueryWrapper removeWrapper) {
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
