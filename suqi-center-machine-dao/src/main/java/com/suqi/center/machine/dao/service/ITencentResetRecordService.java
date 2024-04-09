package com.suqi.center.machine.dao.service;

import com.suqi.center.machine.dao.entity.TencentResetRecord;
import com.suqi.center.machine.dao.wrapper.TencentResetRecordQueryWrapper;
import com.suqi.center.machine.dao.wrapper.TencentResetRecordUpdateWrapper;
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
 * 腾讯云机重置记录 服务类
 * </p>
 *
 * @author PC001
 * @since 2023-08-31
 */
public interface ITencentResetRecordService extends IService<TencentResetRecord> {

    default long count(Consumer<TencentResetRecordQueryWrapper> wrapperConsumer) {
        TencentResetRecordQueryWrapper queryWrapper = TencentResetRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return count(queryWrapper);
    }

    default public TencentResetRecord selectOne(Consumer<TencentResetRecordQueryWrapper> wrapperConsumer) {
        TencentResetRecordQueryWrapper queryWrapper = TencentResetRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        queryWrapper.last(" limit 1 ");
        return getOne(queryWrapper, false);
    }

    default public List<TencentResetRecord> select(Consumer<TencentResetRecordQueryWrapper> wrapperConsumer) {
        TencentResetRecordQueryWrapper queryWrapper = TencentResetRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public List<TencentResetRecord> list(Consumer<TencentResetRecordQueryWrapper> wrapperConsumer) {
        TencentResetRecordQueryWrapper queryWrapper = TencentResetRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public boolean update(Consumer<TencentResetRecordUpdateWrapper> wrapper) {
        TencentResetRecordUpdateWrapper updateWrapper = TencentResetRecordUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(updateWrapper);
    }

    default public boolean update(TencentResetRecord up, Consumer<TencentResetRecordUpdateWrapper> wrapper) {
        TencentResetRecordUpdateWrapper updateWrapper = TencentResetRecordUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean update(Consumer<TencentResetRecord> setUp, Consumer<TencentResetRecordUpdateWrapper> wrapper) {
        TencentResetRecord up = new TencentResetRecord();
        setUp.accept(up);
        TencentResetRecordUpdateWrapper updateWrapper = TencentResetRecordUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean remove(Consumer<TencentResetRecordQueryWrapper> wrapper) {
        TencentResetRecordQueryWrapper removeWrapper = TencentResetRecordQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return remove(removeWrapper);
    }

    default public Page<TencentResetRecord> page(Page<TencentResetRecord> page, Consumer<TencentResetRecordQueryWrapper> wrapperConsumer) {
        TencentResetRecordQueryWrapper queryWrapper = TencentResetRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default Page<TencentResetRecord> quickPageById(Page<TencentResetRecord> page, long lastId, QueryWrapper<TencentResetRecord> wrapper) {
        return quickPageById(true, page, lastId, wrapper);
    }

    default Page<TencentResetRecord> quickPageById(Page<TencentResetRecord> page, long lastId, Consumer<TencentResetRecordQueryWrapper> wrapperConsumer) {
        TencentResetRecordQueryWrapper queryWrapper = TencentResetRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPageById(true, page, lastId, queryWrapper);
    }

    default Page<TencentResetRecord> quickPageById(boolean queryTotals, Page<TencentResetRecord> page, long lastId, QueryWrapper<TencentResetRecord> wrapper) {
        return page(page, wrapper);
    }

    default Page<TencentResetRecord> quickPage(Page<TencentResetRecord> page, QueryWrapper<TencentResetRecord> wrapper) {
        return IService.super.page(page, wrapper);
    }

    default Page<TencentResetRecord> page(Page<TencentResetRecord> page, QueryWrapper<TencentResetRecord> wrapper) {
        return quickPage(page, wrapper);
    }

    default Page<TencentResetRecord> quickPage(Page<TencentResetRecord> page, Consumer<TencentResetRecordQueryWrapper> wrapperConsumer) {
        TencentResetRecordQueryWrapper queryWrapper = TencentResetRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default public void pageConsumerByWrapper(Consumer<TencentResetRecordQueryWrapper> wrapperConsumer, Consumer<TencentResetRecord> consumer) {
        TencentResetRecordQueryWrapper queryWrapper = TencentResetRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumerByWrapper(int pageSize, Consumer<TencentResetRecordQueryWrapper> wrapperConsumer, Consumer<TencentResetRecord> consumer) {
        TencentResetRecordQueryWrapper queryWrapper = TencentResetRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(QueryWrapper<TencentResetRecord> queryWrapper, Consumer<TencentResetRecord> consumer) {
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(int pageSize, QueryWrapper<TencentResetRecord> queryWrapper, Consumer<TencentResetRecord> consumer) {
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(Function<Page<TencentResetRecord>, Page<TencentResetRecord>> consumerSupplier, Consumer<TencentResetRecord> consumer) {
        pageConsumer(1000, consumerSupplier, consumer);
    }

    default public void pageConsumer(int pageSize, Function<Page<TencentResetRecord>, Page<TencentResetRecord>> consumerSupplier, Consumer<TencentResetRecord> consumer) {
        Page<TencentResetRecord> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<TencentResetRecord> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    for (TencentResetRecord t : result) {
                        consumer.accept(t);
                    }
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public void pageConsumersByWrapper(Consumer<TencentResetRecordQueryWrapper> wrapperConsumer, Consumer<List<TencentResetRecord>> consumerList) {
        TencentResetRecordQueryWrapper queryWrapper = TencentResetRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumersByWrapper(int pageSize, Consumer<TencentResetRecordQueryWrapper> wrapperConsumer, Consumer<List<TencentResetRecord>> consumerList) {
        TencentResetRecordQueryWrapper queryWrapper = TencentResetRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(QueryWrapper<TencentResetRecord> queryWrapper, Consumer<List<TencentResetRecord>> consumerList) {
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(int pageSize, QueryWrapper<TencentResetRecord> queryWrapper, Consumer<List<TencentResetRecord>> consumerList) {
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(Function<Page<TencentResetRecord>, Page<TencentResetRecord>> consumerSupplier, Consumer<List<TencentResetRecord>> consumerList) {
        pageConsumers(1000, consumerSupplier, consumerList);
    }

    default public void pageConsumers(int pageSize, Function<Page<TencentResetRecord>, Page<TencentResetRecord>> consumerSupplier, Consumer<List<TencentResetRecord>> consumerList) {
        Page<TencentResetRecord> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<TencentResetRecord> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    consumerList.accept(result);
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public boolean queryAndUpdateById(QueryWrapper<TencentResetRecord> wrapper, TencentResetRecord up) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<TencentResetRecord> wrapper, TencentResetRecord up) {
        return queryAndUpdateById(pageSize, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<TencentResetRecord> wrapper, TencentResetRecord up, BiPredicate<TencentResetRecord, TencentResetRecord> updateFilter) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<TencentResetRecord> wrapper, TencentResetRecord up, BiPredicate<TencentResetRecord, TencentResetRecord> updateFilter) {
        return queryAndUpdateById(pageSize, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<TencentResetRecord> wrapper, TencentResetRecord up, BiConsumer<TencentResetRecord, TencentResetRecordUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, whereSet);
    }

    default public boolean queryAndUpdateById(QueryWrapper<TencentResetRecord> wrapper, TencentResetRecord up, BiPredicate<TencentResetRecord, TencentResetRecord> updateFilter, BiConsumer<TencentResetRecord, TencentResetRecordUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, whereSet);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<TencentResetRecord> wrapper, TencentResetRecord up, BiPredicate<TencentResetRecord, TencentResetRecord> updateFilter, BiConsumer<TencentResetRecord, TencentResetRecordUpdateWrapper> whereSet) {
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

    default public boolean removeByIds(Consumer<TencentResetRecordQueryWrapper> wrapper) {
        return removeByIds(1000, wrapper);
    }

    default public boolean removeByIds(int pageSize, Consumer<TencentResetRecordQueryWrapper> wrapper) {
        TencentResetRecordQueryWrapper removeWrapper = TencentResetRecordQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return removeByIds(pageSize, removeWrapper);
    }

    default public boolean removeByIds(TencentResetRecordQueryWrapper removeWrapper) {
        return removeByIds(1000, removeWrapper);
    }

    default public boolean removeByIds(int pageSize, TencentResetRecordQueryWrapper removeWrapper) {
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
