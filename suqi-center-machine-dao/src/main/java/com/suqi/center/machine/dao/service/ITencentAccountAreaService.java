package com.suqi.center.machine.dao.service;

import com.suqi.center.machine.dao.entity.TencentAccountArea;
import com.baomidou.mybatisplus.extension.service.IService;
import com.suqi.center.machine.dao.wrapper.TencentAccountAreaQueryWrapper;
import com.suqi.center.machine.dao.wrapper.TencentAccountAreaUpdateWrapper;
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
 * 腾讯账号区域表 服务类
 * </p>
 *
 * @author PC001
 * @since 2023-06-02
 */
public interface ITencentAccountAreaService extends IService<TencentAccountArea> {

    default long count(Consumer<TencentAccountAreaQueryWrapper> wrapperConsumer) {
        TencentAccountAreaQueryWrapper queryWrapper = TencentAccountAreaQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return count(queryWrapper);
    }

    default public TencentAccountArea selectOne(Consumer<TencentAccountAreaQueryWrapper> wrapperConsumer) {
        TencentAccountAreaQueryWrapper queryWrapper = TencentAccountAreaQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        queryWrapper.last(" limit 1 ");
        return getOne(queryWrapper, false);
    }

    default public List<TencentAccountArea> select(Consumer<TencentAccountAreaQueryWrapper> wrapperConsumer) {
        TencentAccountAreaQueryWrapper queryWrapper = TencentAccountAreaQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public List<TencentAccountArea> list(Consumer<TencentAccountAreaQueryWrapper> wrapperConsumer) {
        TencentAccountAreaQueryWrapper queryWrapper = TencentAccountAreaQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public boolean update(Consumer<TencentAccountAreaUpdateWrapper> wrapper) {
        TencentAccountAreaUpdateWrapper updateWrapper = TencentAccountAreaUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(updateWrapper);
    }

    default public boolean update(TencentAccountArea up, Consumer<TencentAccountAreaUpdateWrapper> wrapper) {
        TencentAccountAreaUpdateWrapper updateWrapper = TencentAccountAreaUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean update(Consumer<TencentAccountArea> setUp, Consumer<TencentAccountAreaUpdateWrapper> wrapper) {
        TencentAccountArea up = new TencentAccountArea();
        setUp.accept(up);
        TencentAccountAreaUpdateWrapper updateWrapper = TencentAccountAreaUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean remove(Consumer<TencentAccountAreaQueryWrapper> wrapper) {
        TencentAccountAreaQueryWrapper removeWrapper = TencentAccountAreaQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return remove(removeWrapper);
    }

    default public Page<TencentAccountArea> page(Page<TencentAccountArea> page, Consumer<TencentAccountAreaQueryWrapper> wrapperConsumer) {
        TencentAccountAreaQueryWrapper queryWrapper = TencentAccountAreaQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default Page<TencentAccountArea> quickPageById(Page<TencentAccountArea> page, long lastId, QueryWrapper<TencentAccountArea> wrapper) {
        return quickPageById(true, page, lastId, wrapper);
    }

    default Page<TencentAccountArea> quickPageById(Page<TencentAccountArea> page, long lastId, Consumer<TencentAccountAreaQueryWrapper> wrapperConsumer) {
        TencentAccountAreaQueryWrapper queryWrapper = TencentAccountAreaQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPageById(true, page, lastId, queryWrapper);
    }

    default Page<TencentAccountArea> quickPageById(boolean queryTotals, Page<TencentAccountArea> page, long lastId, QueryWrapper<TencentAccountArea> wrapper) {
        return page(page, wrapper);
    }

    default Page<TencentAccountArea> quickPage(Page<TencentAccountArea> page, QueryWrapper<TencentAccountArea> wrapper) {
        return IService.super.page(page, wrapper);
    }

    default Page<TencentAccountArea> page(Page<TencentAccountArea> page, QueryWrapper<TencentAccountArea> wrapper) {
        return quickPage(page, wrapper);
    }

    default Page<TencentAccountArea> quickPage(Page<TencentAccountArea> page, Consumer<TencentAccountAreaQueryWrapper> wrapperConsumer) {
        TencentAccountAreaQueryWrapper queryWrapper = TencentAccountAreaQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default public void pageConsumerByWrapper(Consumer<TencentAccountAreaQueryWrapper> wrapperConsumer, Consumer<TencentAccountArea> consumer) {
        TencentAccountAreaQueryWrapper queryWrapper = TencentAccountAreaQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumerByWrapper(int pageSize, Consumer<TencentAccountAreaQueryWrapper> wrapperConsumer, Consumer<TencentAccountArea> consumer) {
        TencentAccountAreaQueryWrapper queryWrapper = TencentAccountAreaQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(QueryWrapper<TencentAccountArea> queryWrapper, Consumer<TencentAccountArea> consumer) {
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(int pageSize, QueryWrapper<TencentAccountArea> queryWrapper, Consumer<TencentAccountArea> consumer) {
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(Function<Page<TencentAccountArea>, Page<TencentAccountArea>> consumerSupplier, Consumer<TencentAccountArea> consumer) {
        pageConsumer(1000, consumerSupplier, consumer);
    }

    default public void pageConsumer(int pageSize, Function<Page<TencentAccountArea>, Page<TencentAccountArea>> consumerSupplier, Consumer<TencentAccountArea> consumer) {
        Page<TencentAccountArea> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<TencentAccountArea> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    for (TencentAccountArea t : result) {
                        consumer.accept(t);
                    }
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public void pageConsumersByWrapper(Consumer<TencentAccountAreaQueryWrapper> wrapperConsumer, Consumer<List<TencentAccountArea>> consumerList) {
        TencentAccountAreaQueryWrapper queryWrapper = TencentAccountAreaQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumersByWrapper(int pageSize, Consumer<TencentAccountAreaQueryWrapper> wrapperConsumer, Consumer<List<TencentAccountArea>> consumerList) {
        TencentAccountAreaQueryWrapper queryWrapper = TencentAccountAreaQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(QueryWrapper<TencentAccountArea> queryWrapper, Consumer<List<TencentAccountArea>> consumerList) {
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(int pageSize, QueryWrapper<TencentAccountArea> queryWrapper, Consumer<List<TencentAccountArea>> consumerList) {
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(Function<Page<TencentAccountArea>, Page<TencentAccountArea>> consumerSupplier, Consumer<List<TencentAccountArea>> consumerList) {
        pageConsumers(1000, consumerSupplier, consumerList);
    }

    default public void pageConsumers(int pageSize, Function<Page<TencentAccountArea>, Page<TencentAccountArea>> consumerSupplier, Consumer<List<TencentAccountArea>> consumerList) {
        Page<TencentAccountArea> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<TencentAccountArea> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    consumerList.accept(result);
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public boolean queryAndUpdateById(QueryWrapper<TencentAccountArea> wrapper, TencentAccountArea up) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<TencentAccountArea> wrapper, TencentAccountArea up) {
        return queryAndUpdateById(pageSize, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<TencentAccountArea> wrapper, TencentAccountArea up, BiPredicate<TencentAccountArea, TencentAccountArea> updateFilter) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<TencentAccountArea> wrapper, TencentAccountArea up, BiPredicate<TencentAccountArea, TencentAccountArea> updateFilter) {
        return queryAndUpdateById(pageSize, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<TencentAccountArea> wrapper, TencentAccountArea up, BiConsumer<TencentAccountArea, TencentAccountAreaUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, whereSet);
    }

    default public boolean queryAndUpdateById(QueryWrapper<TencentAccountArea> wrapper, TencentAccountArea up, BiPredicate<TencentAccountArea, TencentAccountArea> updateFilter, BiConsumer<TencentAccountArea, TencentAccountAreaUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, whereSet);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<TencentAccountArea> wrapper, TencentAccountArea up, BiPredicate<TencentAccountArea, TencentAccountArea> updateFilter, BiConsumer<TencentAccountArea, TencentAccountAreaUpdateWrapper> whereSet) {
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

    default public boolean removeByIds(Consumer<TencentAccountAreaQueryWrapper> wrapper) {
        return removeByIds(1000, wrapper);
    }

    default public boolean removeByIds(int pageSize, Consumer<TencentAccountAreaQueryWrapper> wrapper) {
        TencentAccountAreaQueryWrapper removeWrapper = TencentAccountAreaQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return removeByIds(pageSize, removeWrapper);
    }

    default public boolean removeByIds(TencentAccountAreaQueryWrapper removeWrapper) {
        return removeByIds(1000, removeWrapper);
    }

    default public boolean removeByIds(int pageSize, TencentAccountAreaQueryWrapper removeWrapper) {
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
