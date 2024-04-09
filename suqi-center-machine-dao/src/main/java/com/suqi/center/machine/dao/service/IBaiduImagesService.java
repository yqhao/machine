package com.suqi.center.machine.dao.service;

import com.suqi.center.machine.dao.entity.BaiduImages;
import com.suqi.center.machine.dao.wrapper.BaiduImagesQueryWrapper;
import com.suqi.center.machine.dao.wrapper.BaiduImagesUpdateWrapper;
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
 * @since 2023-08-25
 */
public interface IBaiduImagesService extends IService<BaiduImages> {

    default long count(Consumer<BaiduImagesQueryWrapper> wrapperConsumer) {
        BaiduImagesQueryWrapper queryWrapper = BaiduImagesQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return count(queryWrapper);
    }

    default public BaiduImages selectOne(Consumer<BaiduImagesQueryWrapper> wrapperConsumer) {
        BaiduImagesQueryWrapper queryWrapper = BaiduImagesQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        queryWrapper.last(" limit 1 ");
        return getOne(queryWrapper, false);
    }

    default public List<BaiduImages> select(Consumer<BaiduImagesQueryWrapper> wrapperConsumer) {
        BaiduImagesQueryWrapper queryWrapper = BaiduImagesQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public List<BaiduImages> list(Consumer<BaiduImagesQueryWrapper> wrapperConsumer) {
        BaiduImagesQueryWrapper queryWrapper = BaiduImagesQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public boolean update(Consumer<BaiduImagesUpdateWrapper> wrapper) {
        BaiduImagesUpdateWrapper updateWrapper = BaiduImagesUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(updateWrapper);
    }

    default public boolean update(BaiduImages up, Consumer<BaiduImagesUpdateWrapper> wrapper) {
        BaiduImagesUpdateWrapper updateWrapper = BaiduImagesUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean update(Consumer<BaiduImages> setUp, Consumer<BaiduImagesUpdateWrapper> wrapper) {
        BaiduImages up = new BaiduImages();
        setUp.accept(up);
        BaiduImagesUpdateWrapper updateWrapper = BaiduImagesUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean remove(Consumer<BaiduImagesQueryWrapper> wrapper) {
        BaiduImagesQueryWrapper removeWrapper = BaiduImagesQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return remove(removeWrapper);
    }

    default public Page<BaiduImages> page(Page<BaiduImages> page, Consumer<BaiduImagesQueryWrapper> wrapperConsumer) {
        BaiduImagesQueryWrapper queryWrapper = BaiduImagesQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default Page<BaiduImages> quickPageById(Page<BaiduImages> page, long lastId, QueryWrapper<BaiduImages> wrapper) {
        return quickPageById(true, page, lastId, wrapper);
    }

    default Page<BaiduImages> quickPageById(Page<BaiduImages> page, long lastId, Consumer<BaiduImagesQueryWrapper> wrapperConsumer) {
        BaiduImagesQueryWrapper queryWrapper = BaiduImagesQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPageById(true, page, lastId, queryWrapper);
    }

    default Page<BaiduImages> quickPageById(boolean queryTotals, Page<BaiduImages> page, long lastId, QueryWrapper<BaiduImages> wrapper) {
        return page(page, wrapper);
    }

    default Page<BaiduImages> quickPage(Page<BaiduImages> page, QueryWrapper<BaiduImages> wrapper) {
        return IService.super.page(page, wrapper);
    }

    default Page<BaiduImages> page(Page<BaiduImages> page, QueryWrapper<BaiduImages> wrapper) {
        return quickPage(page, wrapper);
    }

    default Page<BaiduImages> quickPage(Page<BaiduImages> page, Consumer<BaiduImagesQueryWrapper> wrapperConsumer) {
        BaiduImagesQueryWrapper queryWrapper = BaiduImagesQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default public void pageConsumerByWrapper(Consumer<BaiduImagesQueryWrapper> wrapperConsumer, Consumer<BaiduImages> consumer) {
        BaiduImagesQueryWrapper queryWrapper = BaiduImagesQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumerByWrapper(int pageSize, Consumer<BaiduImagesQueryWrapper> wrapperConsumer, Consumer<BaiduImages> consumer) {
        BaiduImagesQueryWrapper queryWrapper = BaiduImagesQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(QueryWrapper<BaiduImages> queryWrapper, Consumer<BaiduImages> consumer) {
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(int pageSize, QueryWrapper<BaiduImages> queryWrapper, Consumer<BaiduImages> consumer) {
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(Function<Page<BaiduImages>, Page<BaiduImages>> consumerSupplier, Consumer<BaiduImages> consumer) {
        pageConsumer(1000, consumerSupplier, consumer);
    }

    default public void pageConsumer(int pageSize, Function<Page<BaiduImages>, Page<BaiduImages>> consumerSupplier, Consumer<BaiduImages> consumer) {
        Page<BaiduImages> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<BaiduImages> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    for (BaiduImages t : result) {
                        consumer.accept(t);
                    }
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public void pageConsumersByWrapper(Consumer<BaiduImagesQueryWrapper> wrapperConsumer, Consumer<List<BaiduImages>> consumerList) {
        BaiduImagesQueryWrapper queryWrapper = BaiduImagesQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumersByWrapper(int pageSize, Consumer<BaiduImagesQueryWrapper> wrapperConsumer, Consumer<List<BaiduImages>> consumerList) {
        BaiduImagesQueryWrapper queryWrapper = BaiduImagesQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(QueryWrapper<BaiduImages> queryWrapper, Consumer<List<BaiduImages>> consumerList) {
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(int pageSize, QueryWrapper<BaiduImages> queryWrapper, Consumer<List<BaiduImages>> consumerList) {
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(Function<Page<BaiduImages>, Page<BaiduImages>> consumerSupplier, Consumer<List<BaiduImages>> consumerList) {
        pageConsumers(1000, consumerSupplier, consumerList);
    }

    default public void pageConsumers(int pageSize, Function<Page<BaiduImages>, Page<BaiduImages>> consumerSupplier, Consumer<List<BaiduImages>> consumerList) {
        Page<BaiduImages> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<BaiduImages> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    consumerList.accept(result);
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public boolean queryAndUpdateById(QueryWrapper<BaiduImages> wrapper, BaiduImages up) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<BaiduImages> wrapper, BaiduImages up) {
        return queryAndUpdateById(pageSize, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<BaiduImages> wrapper, BaiduImages up, BiPredicate<BaiduImages, BaiduImages> updateFilter) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<BaiduImages> wrapper, BaiduImages up, BiPredicate<BaiduImages, BaiduImages> updateFilter) {
        return queryAndUpdateById(pageSize, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<BaiduImages> wrapper, BaiduImages up, BiConsumer<BaiduImages, BaiduImagesUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, whereSet);
    }

    default public boolean queryAndUpdateById(QueryWrapper<BaiduImages> wrapper, BaiduImages up, BiPredicate<BaiduImages, BaiduImages> updateFilter, BiConsumer<BaiduImages, BaiduImagesUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, whereSet);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<BaiduImages> wrapper, BaiduImages up, BiPredicate<BaiduImages, BaiduImages> updateFilter, BiConsumer<BaiduImages, BaiduImagesUpdateWrapper> whereSet) {
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

    default public boolean removeByIds(Consumer<BaiduImagesQueryWrapper> wrapper) {
        return removeByIds(1000, wrapper);
    }

    default public boolean removeByIds(int pageSize, Consumer<BaiduImagesQueryWrapper> wrapper) {
        BaiduImagesQueryWrapper removeWrapper = BaiduImagesQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return removeByIds(pageSize, removeWrapper);
    }

    default public boolean removeByIds(BaiduImagesQueryWrapper removeWrapper) {
        return removeByIds(1000, removeWrapper);
    }

    default public boolean removeByIds(int pageSize, BaiduImagesQueryWrapper removeWrapper) {
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
