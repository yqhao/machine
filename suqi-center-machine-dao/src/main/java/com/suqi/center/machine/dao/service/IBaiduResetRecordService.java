package com.suqi.center.machine.dao.service;

import com.suqi.center.machine.dao.entity.BaiduResetRecord;
import com.suqi.center.machine.dao.wrapper.BaiduResetRecordQueryWrapper;
import com.suqi.center.machine.dao.wrapper.BaiduResetRecordUpdateWrapper;
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
 * 百度云机重置记录 服务类
 * </p>
 *
 * @author PC001
 * @since 2023-08-31
 */
public interface IBaiduResetRecordService extends IService<BaiduResetRecord> {

    default long count(Consumer<BaiduResetRecordQueryWrapper> wrapperConsumer) {
        BaiduResetRecordQueryWrapper queryWrapper = BaiduResetRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return count(queryWrapper);
    }

    default public BaiduResetRecord selectOne(Consumer<BaiduResetRecordQueryWrapper> wrapperConsumer) {
        BaiduResetRecordQueryWrapper queryWrapper = BaiduResetRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        queryWrapper.last(" limit 1 ");
        return getOne(queryWrapper, false);
    }

    default public List<BaiduResetRecord> select(Consumer<BaiduResetRecordQueryWrapper> wrapperConsumer) {
        BaiduResetRecordQueryWrapper queryWrapper = BaiduResetRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public List<BaiduResetRecord> list(Consumer<BaiduResetRecordQueryWrapper> wrapperConsumer) {
        BaiduResetRecordQueryWrapper queryWrapper = BaiduResetRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public boolean update(Consumer<BaiduResetRecordUpdateWrapper> wrapper) {
        BaiduResetRecordUpdateWrapper updateWrapper = BaiduResetRecordUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(updateWrapper);
    }

    default public boolean update(BaiduResetRecord up, Consumer<BaiduResetRecordUpdateWrapper> wrapper) {
        BaiduResetRecordUpdateWrapper updateWrapper = BaiduResetRecordUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean update(Consumer<BaiduResetRecord> setUp, Consumer<BaiduResetRecordUpdateWrapper> wrapper) {
        BaiduResetRecord up = new BaiduResetRecord();
        setUp.accept(up);
        BaiduResetRecordUpdateWrapper updateWrapper = BaiduResetRecordUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean remove(Consumer<BaiduResetRecordQueryWrapper> wrapper) {
        BaiduResetRecordQueryWrapper removeWrapper = BaiduResetRecordQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return remove(removeWrapper);
    }

    default public Page<BaiduResetRecord> page(Page<BaiduResetRecord> page, Consumer<BaiduResetRecordQueryWrapper> wrapperConsumer) {
        BaiduResetRecordQueryWrapper queryWrapper = BaiduResetRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default Page<BaiduResetRecord> quickPageById(Page<BaiduResetRecord> page, long lastId, QueryWrapper<BaiduResetRecord> wrapper) {
        return quickPageById(true, page, lastId, wrapper);
    }

    default Page<BaiduResetRecord> quickPageById(Page<BaiduResetRecord> page, long lastId, Consumer<BaiduResetRecordQueryWrapper> wrapperConsumer) {
        BaiduResetRecordQueryWrapper queryWrapper = BaiduResetRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPageById(true, page, lastId, queryWrapper);
    }

    default Page<BaiduResetRecord> quickPageById(boolean queryTotals, Page<BaiduResetRecord> page, long lastId, QueryWrapper<BaiduResetRecord> wrapper) {
        return page(page, wrapper);
    }

    default Page<BaiduResetRecord> quickPage(Page<BaiduResetRecord> page, QueryWrapper<BaiduResetRecord> wrapper) {
        return IService.super.page(page, wrapper);
    }

    default Page<BaiduResetRecord> page(Page<BaiduResetRecord> page, QueryWrapper<BaiduResetRecord> wrapper) {
        return quickPage(page, wrapper);
    }

    default Page<BaiduResetRecord> quickPage(Page<BaiduResetRecord> page, Consumer<BaiduResetRecordQueryWrapper> wrapperConsumer) {
        BaiduResetRecordQueryWrapper queryWrapper = BaiduResetRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default public void pageConsumerByWrapper(Consumer<BaiduResetRecordQueryWrapper> wrapperConsumer, Consumer<BaiduResetRecord> consumer) {
        BaiduResetRecordQueryWrapper queryWrapper = BaiduResetRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumerByWrapper(int pageSize, Consumer<BaiduResetRecordQueryWrapper> wrapperConsumer, Consumer<BaiduResetRecord> consumer) {
        BaiduResetRecordQueryWrapper queryWrapper = BaiduResetRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(QueryWrapper<BaiduResetRecord> queryWrapper, Consumer<BaiduResetRecord> consumer) {
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(int pageSize, QueryWrapper<BaiduResetRecord> queryWrapper, Consumer<BaiduResetRecord> consumer) {
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(Function<Page<BaiduResetRecord>, Page<BaiduResetRecord>> consumerSupplier, Consumer<BaiduResetRecord> consumer) {
        pageConsumer(1000, consumerSupplier, consumer);
    }

    default public void pageConsumer(int pageSize, Function<Page<BaiduResetRecord>, Page<BaiduResetRecord>> consumerSupplier, Consumer<BaiduResetRecord> consumer) {
        Page<BaiduResetRecord> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<BaiduResetRecord> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    for (BaiduResetRecord t : result) {
                        consumer.accept(t);
                    }
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public void pageConsumersByWrapper(Consumer<BaiduResetRecordQueryWrapper> wrapperConsumer, Consumer<List<BaiduResetRecord>> consumerList) {
        BaiduResetRecordQueryWrapper queryWrapper = BaiduResetRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumersByWrapper(int pageSize, Consumer<BaiduResetRecordQueryWrapper> wrapperConsumer, Consumer<List<BaiduResetRecord>> consumerList) {
        BaiduResetRecordQueryWrapper queryWrapper = BaiduResetRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(QueryWrapper<BaiduResetRecord> queryWrapper, Consumer<List<BaiduResetRecord>> consumerList) {
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(int pageSize, QueryWrapper<BaiduResetRecord> queryWrapper, Consumer<List<BaiduResetRecord>> consumerList) {
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(Function<Page<BaiduResetRecord>, Page<BaiduResetRecord>> consumerSupplier, Consumer<List<BaiduResetRecord>> consumerList) {
        pageConsumers(1000, consumerSupplier, consumerList);
    }

    default public void pageConsumers(int pageSize, Function<Page<BaiduResetRecord>, Page<BaiduResetRecord>> consumerSupplier, Consumer<List<BaiduResetRecord>> consumerList) {
        Page<BaiduResetRecord> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<BaiduResetRecord> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    consumerList.accept(result);
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public boolean queryAndUpdateById(QueryWrapper<BaiduResetRecord> wrapper, BaiduResetRecord up) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<BaiduResetRecord> wrapper, BaiduResetRecord up) {
        return queryAndUpdateById(pageSize, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<BaiduResetRecord> wrapper, BaiduResetRecord up, BiPredicate<BaiduResetRecord, BaiduResetRecord> updateFilter) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<BaiduResetRecord> wrapper, BaiduResetRecord up, BiPredicate<BaiduResetRecord, BaiduResetRecord> updateFilter) {
        return queryAndUpdateById(pageSize, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<BaiduResetRecord> wrapper, BaiduResetRecord up, BiConsumer<BaiduResetRecord, BaiduResetRecordUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, whereSet);
    }

    default public boolean queryAndUpdateById(QueryWrapper<BaiduResetRecord> wrapper, BaiduResetRecord up, BiPredicate<BaiduResetRecord, BaiduResetRecord> updateFilter, BiConsumer<BaiduResetRecord, BaiduResetRecordUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, whereSet);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<BaiduResetRecord> wrapper, BaiduResetRecord up, BiPredicate<BaiduResetRecord, BaiduResetRecord> updateFilter, BiConsumer<BaiduResetRecord, BaiduResetRecordUpdateWrapper> whereSet) {
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

    default public boolean removeByIds(Consumer<BaiduResetRecordQueryWrapper> wrapper) {
        return removeByIds(1000, wrapper);
    }

    default public boolean removeByIds(int pageSize, Consumer<BaiduResetRecordQueryWrapper> wrapper) {
        BaiduResetRecordQueryWrapper removeWrapper = BaiduResetRecordQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return removeByIds(pageSize, removeWrapper);
    }

    default public boolean removeByIds(BaiduResetRecordQueryWrapper removeWrapper) {
        return removeByIds(1000, removeWrapper);
    }

    default public boolean removeByIds(int pageSize, BaiduResetRecordQueryWrapper removeWrapper) {
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
