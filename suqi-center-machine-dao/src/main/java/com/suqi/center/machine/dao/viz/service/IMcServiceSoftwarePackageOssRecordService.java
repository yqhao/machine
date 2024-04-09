package com.suqi.center.machine.dao.viz.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.suqi.center.machine.dao.viz.entity.McServiceSoftwarePackageOssRecord;
import com.suqi.center.machine.dao.viz.wrapper.McServiceSoftwarePackageOssRecordQueryWrapper;
import com.suqi.center.machine.dao.viz.wrapper.McServiceSoftwarePackageOssRecordUpdateWrapper;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * <p>
 * 云机端软件包对象存储记录表 服务类
 * </p>
 *
 * @author 18374
 * @since 2023-07-26
 */
public interface IMcServiceSoftwarePackageOssRecordService extends IService<McServiceSoftwarePackageOssRecord> {

    default long count(Consumer<McServiceSoftwarePackageOssRecordQueryWrapper> wrapperConsumer) {
        McServiceSoftwarePackageOssRecordQueryWrapper queryWrapper = McServiceSoftwarePackageOssRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return count(queryWrapper);
    }

    default public McServiceSoftwarePackageOssRecord selectOne(Consumer<McServiceSoftwarePackageOssRecordQueryWrapper> wrapperConsumer) {
        McServiceSoftwarePackageOssRecordQueryWrapper queryWrapper = McServiceSoftwarePackageOssRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        queryWrapper.last(" limit 1 ");
        return getOne(queryWrapper, false);
    }

    default public List<McServiceSoftwarePackageOssRecord> select(Consumer<McServiceSoftwarePackageOssRecordQueryWrapper> wrapperConsumer) {
        McServiceSoftwarePackageOssRecordQueryWrapper queryWrapper = McServiceSoftwarePackageOssRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public List<McServiceSoftwarePackageOssRecord> list(Consumer<McServiceSoftwarePackageOssRecordQueryWrapper> wrapperConsumer) {
        McServiceSoftwarePackageOssRecordQueryWrapper queryWrapper = McServiceSoftwarePackageOssRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public boolean update(Consumer<McServiceSoftwarePackageOssRecordUpdateWrapper> wrapper) {
        McServiceSoftwarePackageOssRecordUpdateWrapper updateWrapper = McServiceSoftwarePackageOssRecordUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(updateWrapper);
    }

    default public boolean update(McServiceSoftwarePackageOssRecord up, Consumer<McServiceSoftwarePackageOssRecordUpdateWrapper> wrapper) {
        McServiceSoftwarePackageOssRecordUpdateWrapper updateWrapper = McServiceSoftwarePackageOssRecordUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean update(Consumer<McServiceSoftwarePackageOssRecord> setUp, Consumer<McServiceSoftwarePackageOssRecordUpdateWrapper> wrapper) {
        McServiceSoftwarePackageOssRecord up = new McServiceSoftwarePackageOssRecord();
        setUp.accept(up);
        McServiceSoftwarePackageOssRecordUpdateWrapper updateWrapper = McServiceSoftwarePackageOssRecordUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean remove(Consumer<McServiceSoftwarePackageOssRecordQueryWrapper> wrapper) {
        McServiceSoftwarePackageOssRecordQueryWrapper removeWrapper = McServiceSoftwarePackageOssRecordQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return remove(removeWrapper);
    }

    default public Page<McServiceSoftwarePackageOssRecord> page(Page<McServiceSoftwarePackageOssRecord> page, Consumer<McServiceSoftwarePackageOssRecordQueryWrapper> wrapperConsumer) {
        McServiceSoftwarePackageOssRecordQueryWrapper queryWrapper = McServiceSoftwarePackageOssRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default Page<McServiceSoftwarePackageOssRecord> quickPageById(Page<McServiceSoftwarePackageOssRecord> page, long lastId, QueryWrapper<McServiceSoftwarePackageOssRecord> wrapper) {
        return quickPageById(true, page, lastId, wrapper);
    }

    default Page<McServiceSoftwarePackageOssRecord> quickPageById(Page<McServiceSoftwarePackageOssRecord> page, long lastId, Consumer<McServiceSoftwarePackageOssRecordQueryWrapper> wrapperConsumer) {
        McServiceSoftwarePackageOssRecordQueryWrapper queryWrapper = McServiceSoftwarePackageOssRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPageById(true, page, lastId, queryWrapper);
    }

    default Page<McServiceSoftwarePackageOssRecord> quickPageById(boolean queryTotals, Page<McServiceSoftwarePackageOssRecord> page, long lastId, QueryWrapper<McServiceSoftwarePackageOssRecord> wrapper) {
        return page(page, wrapper);
    }

    default Page<McServiceSoftwarePackageOssRecord> quickPage(Page<McServiceSoftwarePackageOssRecord> page, QueryWrapper<McServiceSoftwarePackageOssRecord> wrapper) {
        return IService.super.page(page, wrapper);
    }

    default Page<McServiceSoftwarePackageOssRecord> page(Page<McServiceSoftwarePackageOssRecord> page, QueryWrapper<McServiceSoftwarePackageOssRecord> wrapper) {
        return quickPage(page, wrapper);
    }

    default Page<McServiceSoftwarePackageOssRecord> quickPage(Page<McServiceSoftwarePackageOssRecord> page, Consumer<McServiceSoftwarePackageOssRecordQueryWrapper> wrapperConsumer) {
        McServiceSoftwarePackageOssRecordQueryWrapper queryWrapper = McServiceSoftwarePackageOssRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default public void pageConsumerByWrapper(Consumer<McServiceSoftwarePackageOssRecordQueryWrapper> wrapperConsumer, Consumer<McServiceSoftwarePackageOssRecord> consumer) {
        McServiceSoftwarePackageOssRecordQueryWrapper queryWrapper = McServiceSoftwarePackageOssRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumerByWrapper(int pageSize, Consumer<McServiceSoftwarePackageOssRecordQueryWrapper> wrapperConsumer, Consumer<McServiceSoftwarePackageOssRecord> consumer) {
        McServiceSoftwarePackageOssRecordQueryWrapper queryWrapper = McServiceSoftwarePackageOssRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(QueryWrapper<McServiceSoftwarePackageOssRecord> queryWrapper, Consumer<McServiceSoftwarePackageOssRecord> consumer) {
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(int pageSize, QueryWrapper<McServiceSoftwarePackageOssRecord> queryWrapper, Consumer<McServiceSoftwarePackageOssRecord> consumer) {
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(Function<Page<McServiceSoftwarePackageOssRecord>, Page<McServiceSoftwarePackageOssRecord>> consumerSupplier, Consumer<McServiceSoftwarePackageOssRecord> consumer) {
        pageConsumer(1000, consumerSupplier, consumer);
    }

    default public void pageConsumer(int pageSize, Function<Page<McServiceSoftwarePackageOssRecord>, Page<McServiceSoftwarePackageOssRecord>> consumerSupplier, Consumer<McServiceSoftwarePackageOssRecord> consumer) {
        Page<McServiceSoftwarePackageOssRecord> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<McServiceSoftwarePackageOssRecord> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    for (McServiceSoftwarePackageOssRecord t : result) {
                        consumer.accept(t);
                    }
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public void pageConsumersByWrapper(Consumer<McServiceSoftwarePackageOssRecordQueryWrapper> wrapperConsumer, Consumer<List<McServiceSoftwarePackageOssRecord>> consumerList) {
        McServiceSoftwarePackageOssRecordQueryWrapper queryWrapper = McServiceSoftwarePackageOssRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumersByWrapper(int pageSize, Consumer<McServiceSoftwarePackageOssRecordQueryWrapper> wrapperConsumer, Consumer<List<McServiceSoftwarePackageOssRecord>> consumerList) {
        McServiceSoftwarePackageOssRecordQueryWrapper queryWrapper = McServiceSoftwarePackageOssRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(QueryWrapper<McServiceSoftwarePackageOssRecord> queryWrapper, Consumer<List<McServiceSoftwarePackageOssRecord>> consumerList) {
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(int pageSize, QueryWrapper<McServiceSoftwarePackageOssRecord> queryWrapper, Consumer<List<McServiceSoftwarePackageOssRecord>> consumerList) {
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(Function<Page<McServiceSoftwarePackageOssRecord>, Page<McServiceSoftwarePackageOssRecord>> consumerSupplier, Consumer<List<McServiceSoftwarePackageOssRecord>> consumerList) {
        pageConsumers(1000, consumerSupplier, consumerList);
    }

    default public void pageConsumers(int pageSize, Function<Page<McServiceSoftwarePackageOssRecord>, Page<McServiceSoftwarePackageOssRecord>> consumerSupplier, Consumer<List<McServiceSoftwarePackageOssRecord>> consumerList) {
        Page<McServiceSoftwarePackageOssRecord> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<McServiceSoftwarePackageOssRecord> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    consumerList.accept(result);
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public boolean queryAndUpdateById(QueryWrapper<McServiceSoftwarePackageOssRecord> wrapper, McServiceSoftwarePackageOssRecord up) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<McServiceSoftwarePackageOssRecord> wrapper, McServiceSoftwarePackageOssRecord up) {
        return queryAndUpdateById(pageSize, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<McServiceSoftwarePackageOssRecord> wrapper, McServiceSoftwarePackageOssRecord up, BiPredicate<McServiceSoftwarePackageOssRecord, McServiceSoftwarePackageOssRecord> updateFilter) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<McServiceSoftwarePackageOssRecord> wrapper, McServiceSoftwarePackageOssRecord up, BiPredicate<McServiceSoftwarePackageOssRecord, McServiceSoftwarePackageOssRecord> updateFilter) {
        return queryAndUpdateById(pageSize, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<McServiceSoftwarePackageOssRecord> wrapper, McServiceSoftwarePackageOssRecord up, BiConsumer<McServiceSoftwarePackageOssRecord, McServiceSoftwarePackageOssRecordUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, whereSet);
    }

    default public boolean queryAndUpdateById(QueryWrapper<McServiceSoftwarePackageOssRecord> wrapper, McServiceSoftwarePackageOssRecord up, BiPredicate<McServiceSoftwarePackageOssRecord, McServiceSoftwarePackageOssRecord> updateFilter, BiConsumer<McServiceSoftwarePackageOssRecord, McServiceSoftwarePackageOssRecordUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, whereSet);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<McServiceSoftwarePackageOssRecord> wrapper, McServiceSoftwarePackageOssRecord up, BiPredicate<McServiceSoftwarePackageOssRecord, McServiceSoftwarePackageOssRecord> updateFilter, BiConsumer<McServiceSoftwarePackageOssRecord, McServiceSoftwarePackageOssRecordUpdateWrapper> whereSet) {
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

    default public boolean removeByIds(Consumer<McServiceSoftwarePackageOssRecordQueryWrapper> wrapper) {
        return removeByIds(1000, wrapper);
    }

    default public boolean removeByIds(int pageSize, Consumer<McServiceSoftwarePackageOssRecordQueryWrapper> wrapper) {
        McServiceSoftwarePackageOssRecordQueryWrapper removeWrapper = McServiceSoftwarePackageOssRecordQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return removeByIds(pageSize, removeWrapper);
    }

    default public boolean removeByIds(McServiceSoftwarePackageOssRecordQueryWrapper removeWrapper) {
        return removeByIds(1000, removeWrapper);
    }

    default public boolean removeByIds(int pageSize, McServiceSoftwarePackageOssRecordQueryWrapper removeWrapper) {
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
