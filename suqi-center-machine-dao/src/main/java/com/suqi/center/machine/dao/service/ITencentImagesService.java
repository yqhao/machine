package com.suqi.center.machine.dao.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.suqi.center.machine.dao.entity.TencentImages;
import com.suqi.center.machine.dao.wrapper.TencentImagesQueryWrapper;
import java.util.function.Consumer;
import com.suqi.center.machine.dao.wrapper.TencentImagesUpdateWrapper;
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
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * <p>
 * 腾讯镜像管理 服务类
 * </p>
 *
 * @author PC001
 * @since 2023-06-02
 */
public interface ITencentImagesService extends IService<TencentImages> {

    void pageConsumer(int pageSize, TencentImagesQueryWrapper queryWrapper, Consumer<TencentImages> consumer);

    default long count(Consumer<TencentImagesQueryWrapper> wrapperConsumer) {
        TencentImagesQueryWrapper queryWrapper = TencentImagesQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return count(queryWrapper);
    }

    default public TencentImages selectOne(Consumer<TencentImagesQueryWrapper> wrapperConsumer) {
        TencentImagesQueryWrapper queryWrapper = TencentImagesQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        queryWrapper.last(" limit 1 ");
        return getOne(queryWrapper, false);
    }

    default public List<TencentImages> select(Consumer<TencentImagesQueryWrapper> wrapperConsumer) {
        TencentImagesQueryWrapper queryWrapper = TencentImagesQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public List<TencentImages> list(Consumer<TencentImagesQueryWrapper> wrapperConsumer) {
        TencentImagesQueryWrapper queryWrapper = TencentImagesQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public boolean update(Consumer<TencentImagesUpdateWrapper> wrapper) {
        TencentImagesUpdateWrapper updateWrapper = TencentImagesUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(updateWrapper);
    }

    default public boolean update(TencentImages up, Consumer<TencentImagesUpdateWrapper> wrapper) {
        TencentImagesUpdateWrapper updateWrapper = TencentImagesUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean update(Consumer<TencentImages> setUp, Consumer<TencentImagesUpdateWrapper> wrapper) {
        TencentImages up = new TencentImages();
        setUp.accept(up);
        TencentImagesUpdateWrapper updateWrapper = TencentImagesUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean remove(Consumer<TencentImagesQueryWrapper> wrapper) {
        TencentImagesQueryWrapper removeWrapper = TencentImagesQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return remove(removeWrapper);
    }

    default public Page<TencentImages> page(Page<TencentImages> page, Consumer<TencentImagesQueryWrapper> wrapperConsumer) {
        TencentImagesQueryWrapper queryWrapper = TencentImagesQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default Page<TencentImages> quickPageById(Page<TencentImages> page, long lastId, QueryWrapper<TencentImages> wrapper) {
        return quickPageById(true, page, lastId, wrapper);
    }

    default Page<TencentImages> quickPageById(Page<TencentImages> page, long lastId, Consumer<TencentImagesQueryWrapper> wrapperConsumer) {
        TencentImagesQueryWrapper queryWrapper = TencentImagesQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPageById(true, page, lastId, queryWrapper);
    }

    default Page<TencentImages> quickPageById(boolean queryTotals, Page<TencentImages> page, long lastId, QueryWrapper<TencentImages> wrapper) {
        return page(page, wrapper);
    }

    default Page<TencentImages> quickPage(Page<TencentImages> page, QueryWrapper<TencentImages> wrapper) {
        return IService.super.page(page, wrapper);
    }

    default Page<TencentImages> page(Page<TencentImages> page, QueryWrapper<TencentImages> wrapper) {
        return quickPage(page, wrapper);
    }

    default Page<TencentImages> quickPage(Page<TencentImages> page, Consumer<TencentImagesQueryWrapper> wrapperConsumer) {
        TencentImagesQueryWrapper queryWrapper = TencentImagesQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default public void pageConsumerByWrapper(Consumer<TencentImagesQueryWrapper> wrapperConsumer, Consumer<TencentImages> consumer) {
        TencentImagesQueryWrapper queryWrapper = TencentImagesQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumerByWrapper(int pageSize, Consumer<TencentImagesQueryWrapper> wrapperConsumer, Consumer<TencentImages> consumer) {
        TencentImagesQueryWrapper queryWrapper = TencentImagesQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(QueryWrapper<TencentImages> queryWrapper, Consumer<TencentImages> consumer) {
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(int pageSize, QueryWrapper<TencentImages> queryWrapper, Consumer<TencentImages> consumer) {
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(Function<Page<TencentImages>, Page<TencentImages>> consumerSupplier, Consumer<TencentImages> consumer) {
        pageConsumer(1000, consumerSupplier, consumer);
    }

    default public void pageConsumer(int pageSize, Function<Page<TencentImages>, Page<TencentImages>> consumerSupplier, Consumer<TencentImages> consumer) {
        Page<TencentImages> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<TencentImages> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    for (TencentImages t : result) {
                        consumer.accept(t);
                    }
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public void pageConsumersByWrapper(Consumer<TencentImagesQueryWrapper> wrapperConsumer, Consumer<List<TencentImages>> consumerList) {
        TencentImagesQueryWrapper queryWrapper = TencentImagesQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumersByWrapper(int pageSize, Consumer<TencentImagesQueryWrapper> wrapperConsumer, Consumer<List<TencentImages>> consumerList) {
        TencentImagesQueryWrapper queryWrapper = TencentImagesQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(QueryWrapper<TencentImages> queryWrapper, Consumer<List<TencentImages>> consumerList) {
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(int pageSize, QueryWrapper<TencentImages> queryWrapper, Consumer<List<TencentImages>> consumerList) {
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(Function<Page<TencentImages>, Page<TencentImages>> consumerSupplier, Consumer<List<TencentImages>> consumerList) {
        pageConsumers(1000, consumerSupplier, consumerList);
    }

    default public void pageConsumers(int pageSize, Function<Page<TencentImages>, Page<TencentImages>> consumerSupplier, Consumer<List<TencentImages>> consumerList) {
        Page<TencentImages> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<TencentImages> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    consumerList.accept(result);
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public boolean queryAndUpdateById(QueryWrapper<TencentImages> wrapper, TencentImages up) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<TencentImages> wrapper, TencentImages up) {
        return queryAndUpdateById(pageSize, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<TencentImages> wrapper, TencentImages up, BiPredicate<TencentImages, TencentImages> updateFilter) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<TencentImages> wrapper, TencentImages up, BiPredicate<TencentImages, TencentImages> updateFilter) {
        return queryAndUpdateById(pageSize, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<TencentImages> wrapper, TencentImages up, BiConsumer<TencentImages, TencentImagesUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, whereSet);
    }

    default public boolean queryAndUpdateById(QueryWrapper<TencentImages> wrapper, TencentImages up, BiPredicate<TencentImages, TencentImages> updateFilter, BiConsumer<TencentImages, TencentImagesUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, whereSet);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<TencentImages> wrapper, TencentImages up, BiPredicate<TencentImages, TencentImages> updateFilter, BiConsumer<TencentImages, TencentImagesUpdateWrapper> whereSet) {
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

    default public boolean removeByIds(Consumer<TencentImagesQueryWrapper> wrapper) {
        return removeByIds(1000, wrapper);
    }

    default public boolean removeByIds(int pageSize, Consumer<TencentImagesQueryWrapper> wrapper) {
        TencentImagesQueryWrapper removeWrapper = TencentImagesQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return removeByIds(pageSize, removeWrapper);
    }

    default public boolean removeByIds(TencentImagesQueryWrapper removeWrapper) {
        return removeByIds(1000, removeWrapper);
    }

    default public boolean removeByIds(int pageSize, TencentImagesQueryWrapper removeWrapper) {
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
