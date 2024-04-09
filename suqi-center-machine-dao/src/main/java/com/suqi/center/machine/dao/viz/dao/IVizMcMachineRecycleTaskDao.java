package com.suqi.center.machine.dao.viz.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.suqi.center.machine.dao.viz.entity.VizMcMachineRecycleTaskEo;
import com.suqi.center.machine.dao.viz.wrapper.VizMcMachineRecycleTaskEoQueryWrapper;
import com.suqi.center.machine.dao.viz.wrapper.VizMcMachineRecycleTaskEoUpdateWrapper;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * <p>
 * 【可视化】机器回收任务表 服务类
 * </p>
 *
 * @author Administrator
 * @since 2023-10-17
 */
public interface IVizMcMachineRecycleTaskDao extends IService<VizMcMachineRecycleTaskEo> {

    default long count(Consumer<VizMcMachineRecycleTaskEoQueryWrapper> wrapperConsumer) {
        VizMcMachineRecycleTaskEoQueryWrapper queryWrapper = VizMcMachineRecycleTaskEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return count(queryWrapper);
    }

    default public VizMcMachineRecycleTaskEo selectOne(QueryWrapper<VizMcMachineRecycleTaskEo> queryWrapper) {
        queryWrapper.last(" limit 1 ");
        return getOne(queryWrapper, false);
    }

    default public VizMcMachineRecycleTaskEo selectOne(Consumer<VizMcMachineRecycleTaskEoQueryWrapper> wrapperConsumer) {
        VizMcMachineRecycleTaskEoQueryWrapper queryWrapper = VizMcMachineRecycleTaskEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        queryWrapper.last(" limit 1 ");
        return getOne(queryWrapper, false);
    }

    default public List<VizMcMachineRecycleTaskEo> select(QueryWrapper<VizMcMachineRecycleTaskEo> queryWrapper) {
        return list(queryWrapper);
    }

    default public List<VizMcMachineRecycleTaskEo> select(Consumer<VizMcMachineRecycleTaskEoQueryWrapper> wrapperConsumer) {
        VizMcMachineRecycleTaskEoQueryWrapper queryWrapper = VizMcMachineRecycleTaskEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public List<VizMcMachineRecycleTaskEo> list(Consumer<VizMcMachineRecycleTaskEoQueryWrapper> wrapperConsumer) {
        VizMcMachineRecycleTaskEoQueryWrapper queryWrapper = VizMcMachineRecycleTaskEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public boolean update(Consumer<VizMcMachineRecycleTaskEoUpdateWrapper> wrapper) {
        VizMcMachineRecycleTaskEoUpdateWrapper updateWrapper = VizMcMachineRecycleTaskEoUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(updateWrapper);
    }

    default public boolean update(VizMcMachineRecycleTaskEo up, Consumer<VizMcMachineRecycleTaskEoUpdateWrapper> wrapper) {
        VizMcMachineRecycleTaskEoUpdateWrapper updateWrapper = VizMcMachineRecycleTaskEoUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean update(Consumer<VizMcMachineRecycleTaskEo> setUp, Consumer<VizMcMachineRecycleTaskEoUpdateWrapper> wrapper) {
        VizMcMachineRecycleTaskEo up = new VizMcMachineRecycleTaskEo();
        setUp.accept(up);
        VizMcMachineRecycleTaskEoUpdateWrapper updateWrapper = VizMcMachineRecycleTaskEoUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean remove(Consumer<VizMcMachineRecycleTaskEoQueryWrapper> wrapper) {
        VizMcMachineRecycleTaskEoQueryWrapper removeWrapper = VizMcMachineRecycleTaskEoQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return remove(removeWrapper);
    }

    default public Page<VizMcMachineRecycleTaskEo> page(Page<VizMcMachineRecycleTaskEo> page, Consumer<VizMcMachineRecycleTaskEoQueryWrapper> wrapperConsumer) {
        VizMcMachineRecycleTaskEoQueryWrapper queryWrapper = VizMcMachineRecycleTaskEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default Page<VizMcMachineRecycleTaskEo> quickPageById(Page<VizMcMachineRecycleTaskEo> page, long lastId, QueryWrapper<VizMcMachineRecycleTaskEo> wrapper) {
        return quickPageById(true, page, lastId, wrapper);
    }

    default Page<VizMcMachineRecycleTaskEo> quickPageById(Page<VizMcMachineRecycleTaskEo> page, long lastId, Consumer<VizMcMachineRecycleTaskEoQueryWrapper> wrapperConsumer) {
        VizMcMachineRecycleTaskEoQueryWrapper queryWrapper = VizMcMachineRecycleTaskEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPageById(true, page, lastId, queryWrapper);
    }

    default Page<VizMcMachineRecycleTaskEo> quickPageById(boolean queryTotals, Page<VizMcMachineRecycleTaskEo> page, long lastId, QueryWrapper<VizMcMachineRecycleTaskEo> wrapper) {
        return page(page, wrapper);
    }

    default Page<VizMcMachineRecycleTaskEo> quickPage(Page<VizMcMachineRecycleTaskEo> page, QueryWrapper<VizMcMachineRecycleTaskEo> wrapper) {
        return IService.super.page(page, wrapper);
    }

    default Page<VizMcMachineRecycleTaskEo> page(Page<VizMcMachineRecycleTaskEo> page, QueryWrapper<VizMcMachineRecycleTaskEo> wrapper) {
        return quickPage(page, wrapper);
    }

    default Page<VizMcMachineRecycleTaskEo> quickPage(Page<VizMcMachineRecycleTaskEo> page, Consumer<VizMcMachineRecycleTaskEoQueryWrapper> wrapperConsumer) {
        VizMcMachineRecycleTaskEoQueryWrapper queryWrapper = VizMcMachineRecycleTaskEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default public void pageConsumerByWrapper(Consumer<VizMcMachineRecycleTaskEoQueryWrapper> wrapperConsumer, Consumer<VizMcMachineRecycleTaskEo> consumer) {
        VizMcMachineRecycleTaskEoQueryWrapper queryWrapper = VizMcMachineRecycleTaskEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumerByWrapper(int pageSize, Consumer<VizMcMachineRecycleTaskEoQueryWrapper> wrapperConsumer, Consumer<VizMcMachineRecycleTaskEo> consumer) {
        VizMcMachineRecycleTaskEoQueryWrapper queryWrapper = VizMcMachineRecycleTaskEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(QueryWrapper<VizMcMachineRecycleTaskEo> queryWrapper, Consumer<VizMcMachineRecycleTaskEo> consumer) {
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(int pageSize, QueryWrapper<VizMcMachineRecycleTaskEo> queryWrapper, Consumer<VizMcMachineRecycleTaskEo> consumer) {
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(Function<Page<VizMcMachineRecycleTaskEo>, Page<VizMcMachineRecycleTaskEo>> consumerSupplier, Consumer<VizMcMachineRecycleTaskEo> consumer) {
        pageConsumer(1000, consumerSupplier, consumer);
    }

    default public void pageConsumer(int pageSize, Function<Page<VizMcMachineRecycleTaskEo>, Page<VizMcMachineRecycleTaskEo>> consumerSupplier, Consumer<VizMcMachineRecycleTaskEo> consumer) {
        Page<VizMcMachineRecycleTaskEo> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<VizMcMachineRecycleTaskEo> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    for (VizMcMachineRecycleTaskEo t : result) {
                        consumer.accept(t);
                    }
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public void pageConsumersByWrapper(Consumer<VizMcMachineRecycleTaskEoQueryWrapper> wrapperConsumer, Consumer<List<VizMcMachineRecycleTaskEo>> consumerList) {
        VizMcMachineRecycleTaskEoQueryWrapper queryWrapper = VizMcMachineRecycleTaskEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumersByWrapper(int pageSize, Consumer<VizMcMachineRecycleTaskEoQueryWrapper> wrapperConsumer, Consumer<List<VizMcMachineRecycleTaskEo>> consumerList) {
        VizMcMachineRecycleTaskEoQueryWrapper queryWrapper = VizMcMachineRecycleTaskEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(QueryWrapper<VizMcMachineRecycleTaskEo> queryWrapper, Consumer<List<VizMcMachineRecycleTaskEo>> consumerList) {
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(int pageSize, QueryWrapper<VizMcMachineRecycleTaskEo> queryWrapper, Consumer<List<VizMcMachineRecycleTaskEo>> consumerList) {
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(Function<Page<VizMcMachineRecycleTaskEo>, Page<VizMcMachineRecycleTaskEo>> consumerSupplier, Consumer<List<VizMcMachineRecycleTaskEo>> consumerList) {
        pageConsumers(1000, consumerSupplier, consumerList);
    }

    default public void pageConsumers(int pageSize, Function<Page<VizMcMachineRecycleTaskEo>, Page<VizMcMachineRecycleTaskEo>> consumerSupplier, Consumer<List<VizMcMachineRecycleTaskEo>> consumerList) {
        Page<VizMcMachineRecycleTaskEo> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<VizMcMachineRecycleTaskEo> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    consumerList.accept(result);
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public boolean queryAndUpdateById(QueryWrapper<VizMcMachineRecycleTaskEo> wrapper, VizMcMachineRecycleTaskEo up) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<VizMcMachineRecycleTaskEo> wrapper, VizMcMachineRecycleTaskEo up) {
        return queryAndUpdateById(pageSize, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<VizMcMachineRecycleTaskEo> wrapper, VizMcMachineRecycleTaskEo up, BiPredicate<VizMcMachineRecycleTaskEo, VizMcMachineRecycleTaskEo> updateFilter) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<VizMcMachineRecycleTaskEo> wrapper, VizMcMachineRecycleTaskEo up, BiPredicate<VizMcMachineRecycleTaskEo, VizMcMachineRecycleTaskEo> updateFilter) {
        return queryAndUpdateById(pageSize, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<VizMcMachineRecycleTaskEo> wrapper, VizMcMachineRecycleTaskEo up, BiConsumer<VizMcMachineRecycleTaskEo, VizMcMachineRecycleTaskEoUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, whereSet);
    }

    default public boolean queryAndUpdateById(QueryWrapper<VizMcMachineRecycleTaskEo> wrapper, VizMcMachineRecycleTaskEo up, BiPredicate<VizMcMachineRecycleTaskEo, VizMcMachineRecycleTaskEo> updateFilter, BiConsumer<VizMcMachineRecycleTaskEo, VizMcMachineRecycleTaskEoUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, whereSet);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<VizMcMachineRecycleTaskEo> wrapper, VizMcMachineRecycleTaskEo up, BiPredicate<VizMcMachineRecycleTaskEo, VizMcMachineRecycleTaskEo> updateFilter, BiConsumer<VizMcMachineRecycleTaskEo, VizMcMachineRecycleTaskEoUpdateWrapper> whereSet) {
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

    default public boolean removeByIds(Consumer<VizMcMachineRecycleTaskEoQueryWrapper> wrapper) {
        return removeByIds(1000, wrapper);
    }

    default public boolean removeByIds(int pageSize, Consumer<VizMcMachineRecycleTaskEoQueryWrapper> wrapper) {
        VizMcMachineRecycleTaskEoQueryWrapper removeWrapper = VizMcMachineRecycleTaskEoQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return removeByIds(pageSize, removeWrapper);
    }

    default public boolean removeByIds(VizMcMachineRecycleTaskEoQueryWrapper removeWrapper) {
        return removeByIds(1000, removeWrapper);
    }

    default public boolean removeByIds(int pageSize, VizMcMachineRecycleTaskEoQueryWrapper removeWrapper) {
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
