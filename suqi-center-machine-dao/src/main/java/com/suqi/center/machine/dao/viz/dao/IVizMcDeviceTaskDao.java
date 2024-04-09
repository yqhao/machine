package com.suqi.center.machine.dao.viz.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.suqi.center.machine.dao.viz.entity.VizMcDeviceTaskEo;
import com.suqi.center.machine.dao.viz.wrapper.VizMcDeviceTaskEoQueryWrapper;
import com.suqi.center.machine.dao.viz.wrapper.VizMcDeviceTaskEoUpdateWrapper;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * <p>
 * 机器任务表 服务类
 * </p>
 *
 * @author 18374
 * @since 2023-10-20
 */
public interface IVizMcDeviceTaskDao extends IService<VizMcDeviceTaskEo> {

    default long count(Consumer<VizMcDeviceTaskEoQueryWrapper> wrapperConsumer) {
        VizMcDeviceTaskEoQueryWrapper queryWrapper = VizMcDeviceTaskEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return count(queryWrapper);
    }

    default public VizMcDeviceTaskEo selectOne(Consumer<VizMcDeviceTaskEoQueryWrapper> wrapperConsumer) {
        VizMcDeviceTaskEoQueryWrapper queryWrapper = VizMcDeviceTaskEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        queryWrapper.last(" limit 1 ");
        return getOne(queryWrapper, false);
    }

    default public List<VizMcDeviceTaskEo> select(Consumer<VizMcDeviceTaskEoQueryWrapper> wrapperConsumer) {
        VizMcDeviceTaskEoQueryWrapper queryWrapper = VizMcDeviceTaskEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public List<VizMcDeviceTaskEo> list(Consumer<VizMcDeviceTaskEoQueryWrapper> wrapperConsumer) {
        VizMcDeviceTaskEoQueryWrapper queryWrapper = VizMcDeviceTaskEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public boolean update(Consumer<VizMcDeviceTaskEoUpdateWrapper> wrapper) {
        VizMcDeviceTaskEoUpdateWrapper updateWrapper = VizMcDeviceTaskEoUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(updateWrapper);
    }

    default public boolean update(VizMcDeviceTaskEo up, Consumer<VizMcDeviceTaskEoUpdateWrapper> wrapper) {
        VizMcDeviceTaskEoUpdateWrapper updateWrapper = VizMcDeviceTaskEoUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean update(Consumer<VizMcDeviceTaskEo> setUp, Consumer<VizMcDeviceTaskEoUpdateWrapper> wrapper) {
        VizMcDeviceTaskEo up = new VizMcDeviceTaskEo();
        setUp.accept(up);
        VizMcDeviceTaskEoUpdateWrapper updateWrapper = VizMcDeviceTaskEoUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean remove(Consumer<VizMcDeviceTaskEoQueryWrapper> wrapper) {
        VizMcDeviceTaskEoQueryWrapper removeWrapper = VizMcDeviceTaskEoQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return remove(removeWrapper);
    }

    default public Page<VizMcDeviceTaskEo> page(Page<VizMcDeviceTaskEo> page, Consumer<VizMcDeviceTaskEoQueryWrapper> wrapperConsumer) {
        VizMcDeviceTaskEoQueryWrapper queryWrapper = VizMcDeviceTaskEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default Page<VizMcDeviceTaskEo> quickPageById(Page<VizMcDeviceTaskEo> page, long lastId, QueryWrapper<VizMcDeviceTaskEo> wrapper) {
        return quickPageById(true, page, lastId, wrapper);
    }

    default Page<VizMcDeviceTaskEo> quickPageById(Page<VizMcDeviceTaskEo> page, long lastId, Consumer<VizMcDeviceTaskEoQueryWrapper> wrapperConsumer) {
        VizMcDeviceTaskEoQueryWrapper queryWrapper = VizMcDeviceTaskEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPageById(true, page, lastId, queryWrapper);
    }

    default Page<VizMcDeviceTaskEo> quickPageById(boolean queryTotals, Page<VizMcDeviceTaskEo> page, long lastId, QueryWrapper<VizMcDeviceTaskEo> wrapper) {
        return page(page, wrapper);
    }

    default Page<VizMcDeviceTaskEo> quickPage(Page<VizMcDeviceTaskEo> page, QueryWrapper<VizMcDeviceTaskEo> wrapper) {
        return IService.super.page(page, wrapper);
    }

    default Page<VizMcDeviceTaskEo> page(Page<VizMcDeviceTaskEo> page, QueryWrapper<VizMcDeviceTaskEo> wrapper) {
        return quickPage(page, wrapper);
    }

    default Page<VizMcDeviceTaskEo> quickPage(Page<VizMcDeviceTaskEo> page, Consumer<VizMcDeviceTaskEoQueryWrapper> wrapperConsumer) {
        VizMcDeviceTaskEoQueryWrapper queryWrapper = VizMcDeviceTaskEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default public void pageConsumerByWrapper(Consumer<VizMcDeviceTaskEoQueryWrapper> wrapperConsumer, Consumer<VizMcDeviceTaskEo> consumer) {
        VizMcDeviceTaskEoQueryWrapper queryWrapper = VizMcDeviceTaskEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumerByWrapper(int pageSize, Consumer<VizMcDeviceTaskEoQueryWrapper> wrapperConsumer, Consumer<VizMcDeviceTaskEo> consumer) {
        VizMcDeviceTaskEoQueryWrapper queryWrapper = VizMcDeviceTaskEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(QueryWrapper<VizMcDeviceTaskEo> queryWrapper, Consumer<VizMcDeviceTaskEo> consumer) {
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(int pageSize, QueryWrapper<VizMcDeviceTaskEo> queryWrapper, Consumer<VizMcDeviceTaskEo> consumer) {
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(Function<Page<VizMcDeviceTaskEo>, Page<VizMcDeviceTaskEo>> consumerSupplier, Consumer<VizMcDeviceTaskEo> consumer) {
        pageConsumer(1000, consumerSupplier, consumer);
    }

    default public void pageConsumer(int pageSize, Function<Page<VizMcDeviceTaskEo>, Page<VizMcDeviceTaskEo>> consumerSupplier, Consumer<VizMcDeviceTaskEo> consumer) {
        Page<VizMcDeviceTaskEo> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<VizMcDeviceTaskEo> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    for (VizMcDeviceTaskEo t : result) {
                        consumer.accept(t);
                    }
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public void pageConsumersByWrapper(Consumer<VizMcDeviceTaskEoQueryWrapper> wrapperConsumer, Consumer<List<VizMcDeviceTaskEo>> consumerList) {
        VizMcDeviceTaskEoQueryWrapper queryWrapper = VizMcDeviceTaskEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumersByWrapper(int pageSize, Consumer<VizMcDeviceTaskEoQueryWrapper> wrapperConsumer, Consumer<List<VizMcDeviceTaskEo>> consumerList) {
        VizMcDeviceTaskEoQueryWrapper queryWrapper = VizMcDeviceTaskEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(QueryWrapper<VizMcDeviceTaskEo> queryWrapper, Consumer<List<VizMcDeviceTaskEo>> consumerList) {
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(int pageSize, QueryWrapper<VizMcDeviceTaskEo> queryWrapper, Consumer<List<VizMcDeviceTaskEo>> consumerList) {
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(Function<Page<VizMcDeviceTaskEo>, Page<VizMcDeviceTaskEo>> consumerSupplier, Consumer<List<VizMcDeviceTaskEo>> consumerList) {
        pageConsumers(1000, consumerSupplier, consumerList);
    }

    default public void pageConsumers(int pageSize, Function<Page<VizMcDeviceTaskEo>, Page<VizMcDeviceTaskEo>> consumerSupplier, Consumer<List<VizMcDeviceTaskEo>> consumerList) {
        Page<VizMcDeviceTaskEo> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<VizMcDeviceTaskEo> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    consumerList.accept(result);
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public boolean queryAndUpdateById(QueryWrapper<VizMcDeviceTaskEo> wrapper, VizMcDeviceTaskEo up) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<VizMcDeviceTaskEo> wrapper, VizMcDeviceTaskEo up) {
        return queryAndUpdateById(pageSize, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<VizMcDeviceTaskEo> wrapper, VizMcDeviceTaskEo up, BiPredicate<VizMcDeviceTaskEo, VizMcDeviceTaskEo> updateFilter) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<VizMcDeviceTaskEo> wrapper, VizMcDeviceTaskEo up, BiPredicate<VizMcDeviceTaskEo, VizMcDeviceTaskEo> updateFilter) {
        return queryAndUpdateById(pageSize, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<VizMcDeviceTaskEo> wrapper, VizMcDeviceTaskEo up, BiConsumer<VizMcDeviceTaskEo, VizMcDeviceTaskEoUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, whereSet);
    }

    default public boolean queryAndUpdateById(QueryWrapper<VizMcDeviceTaskEo> wrapper, VizMcDeviceTaskEo up, BiPredicate<VizMcDeviceTaskEo, VizMcDeviceTaskEo> updateFilter, BiConsumer<VizMcDeviceTaskEo, VizMcDeviceTaskEoUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, whereSet);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<VizMcDeviceTaskEo> wrapper, VizMcDeviceTaskEo up, BiPredicate<VizMcDeviceTaskEo, VizMcDeviceTaskEo> updateFilter, BiConsumer<VizMcDeviceTaskEo, VizMcDeviceTaskEoUpdateWrapper> whereSet) {
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

    default public boolean removeByIds(Consumer<VizMcDeviceTaskEoQueryWrapper> wrapper) {
        return removeByIds(1000, wrapper);
    }

    default public boolean removeByIds(int pageSize, Consumer<VizMcDeviceTaskEoQueryWrapper> wrapper) {
        VizMcDeviceTaskEoQueryWrapper removeWrapper = VizMcDeviceTaskEoQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return removeByIds(pageSize, removeWrapper);
    }

    default public boolean removeByIds(VizMcDeviceTaskEoQueryWrapper removeWrapper) {
        return removeByIds(1000, removeWrapper);
    }

    default public boolean removeByIds(int pageSize, VizMcDeviceTaskEoQueryWrapper removeWrapper) {
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
