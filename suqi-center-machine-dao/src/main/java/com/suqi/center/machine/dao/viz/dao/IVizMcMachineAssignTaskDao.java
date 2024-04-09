package com.suqi.center.machine.dao.viz.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.suqi.center.machine.dao.viz.entity.VizMcMachineAssignTaskEo;
import com.suqi.center.machine.dao.viz.wrapper.VizMcMachineAssignTaskEoQueryWrapper;
import com.suqi.center.machine.dao.viz.wrapper.VizMcMachineAssignTaskEoUpdateWrapper;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * <p>
 * 【可视化】机器分配任务表 服务类
 * </p>
 *
 * @author Administrator
 * @since 2023-10-17
 */
public interface IVizMcMachineAssignTaskDao extends IService<VizMcMachineAssignTaskEo> {

    default long count(Consumer<VizMcMachineAssignTaskEoQueryWrapper> wrapperConsumer) {
        VizMcMachineAssignTaskEoQueryWrapper queryWrapper = VizMcMachineAssignTaskEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return count(queryWrapper);
    }

    default public VizMcMachineAssignTaskEo selectOne(QueryWrapper<VizMcMachineAssignTaskEo> queryWrapper) {
        queryWrapper.last(" limit 1 ");
        return getOne(queryWrapper, false);
    }

    default public VizMcMachineAssignTaskEo selectOne(Consumer<VizMcMachineAssignTaskEoQueryWrapper> wrapperConsumer) {
        VizMcMachineAssignTaskEoQueryWrapper queryWrapper = VizMcMachineAssignTaskEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        queryWrapper.last(" limit 1 ");
        return getOne(queryWrapper, false);
    }

    default public List<VizMcMachineAssignTaskEo> select(QueryWrapper<VizMcMachineAssignTaskEo> queryWrapper) {
        return list(queryWrapper);
    }

    default public List<VizMcMachineAssignTaskEo> select(Consumer<VizMcMachineAssignTaskEoQueryWrapper> wrapperConsumer) {
        VizMcMachineAssignTaskEoQueryWrapper queryWrapper = VizMcMachineAssignTaskEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public List<VizMcMachineAssignTaskEo> list(Consumer<VizMcMachineAssignTaskEoQueryWrapper> wrapperConsumer) {
        VizMcMachineAssignTaskEoQueryWrapper queryWrapper = VizMcMachineAssignTaskEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public boolean update(Consumer<VizMcMachineAssignTaskEoUpdateWrapper> wrapper) {
        VizMcMachineAssignTaskEoUpdateWrapper updateWrapper = VizMcMachineAssignTaskEoUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(updateWrapper);
    }

    default public boolean update(VizMcMachineAssignTaskEo up, Consumer<VizMcMachineAssignTaskEoUpdateWrapper> wrapper) {
        VizMcMachineAssignTaskEoUpdateWrapper updateWrapper = VizMcMachineAssignTaskEoUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean update(Consumer<VizMcMachineAssignTaskEo> setUp, Consumer<VizMcMachineAssignTaskEoUpdateWrapper> wrapper) {
        VizMcMachineAssignTaskEo up = new VizMcMachineAssignTaskEo();
        setUp.accept(up);
        VizMcMachineAssignTaskEoUpdateWrapper updateWrapper = VizMcMachineAssignTaskEoUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean remove(Consumer<VizMcMachineAssignTaskEoQueryWrapper> wrapper) {
        VizMcMachineAssignTaskEoQueryWrapper removeWrapper = VizMcMachineAssignTaskEoQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return remove(removeWrapper);
    }

    default public Page<VizMcMachineAssignTaskEo> page(Page<VizMcMachineAssignTaskEo> page, Consumer<VizMcMachineAssignTaskEoQueryWrapper> wrapperConsumer) {
        VizMcMachineAssignTaskEoQueryWrapper queryWrapper = VizMcMachineAssignTaskEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default Page<VizMcMachineAssignTaskEo> quickPageById(Page<VizMcMachineAssignTaskEo> page, long lastId, QueryWrapper<VizMcMachineAssignTaskEo> wrapper) {
        return quickPageById(true, page, lastId, wrapper);
    }

    default Page<VizMcMachineAssignTaskEo> quickPageById(Page<VizMcMachineAssignTaskEo> page, long lastId, Consumer<VizMcMachineAssignTaskEoQueryWrapper> wrapperConsumer) {
        VizMcMachineAssignTaskEoQueryWrapper queryWrapper = VizMcMachineAssignTaskEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPageById(true, page, lastId, queryWrapper);
    }

    default Page<VizMcMachineAssignTaskEo> quickPageById(boolean queryTotals, Page<VizMcMachineAssignTaskEo> page, long lastId, QueryWrapper<VizMcMachineAssignTaskEo> wrapper) {
        return page(page, wrapper);
    }

    default Page<VizMcMachineAssignTaskEo> quickPage(Page<VizMcMachineAssignTaskEo> page, QueryWrapper<VizMcMachineAssignTaskEo> wrapper) {
        return IService.super.page(page, wrapper);
    }

    default Page<VizMcMachineAssignTaskEo> page(Page<VizMcMachineAssignTaskEo> page, QueryWrapper<VizMcMachineAssignTaskEo> wrapper) {
        return quickPage(page, wrapper);
    }

    default Page<VizMcMachineAssignTaskEo> quickPage(Page<VizMcMachineAssignTaskEo> page, Consumer<VizMcMachineAssignTaskEoQueryWrapper> wrapperConsumer) {
        VizMcMachineAssignTaskEoQueryWrapper queryWrapper = VizMcMachineAssignTaskEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default public void pageConsumerByWrapper(Consumer<VizMcMachineAssignTaskEoQueryWrapper> wrapperConsumer, Consumer<VizMcMachineAssignTaskEo> consumer) {
        VizMcMachineAssignTaskEoQueryWrapper queryWrapper = VizMcMachineAssignTaskEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumerByWrapper(int pageSize, Consumer<VizMcMachineAssignTaskEoQueryWrapper> wrapperConsumer, Consumer<VizMcMachineAssignTaskEo> consumer) {
        VizMcMachineAssignTaskEoQueryWrapper queryWrapper = VizMcMachineAssignTaskEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(QueryWrapper<VizMcMachineAssignTaskEo> queryWrapper, Consumer<VizMcMachineAssignTaskEo> consumer) {
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(int pageSize, QueryWrapper<VizMcMachineAssignTaskEo> queryWrapper, Consumer<VizMcMachineAssignTaskEo> consumer) {
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(Function<Page<VizMcMachineAssignTaskEo>, Page<VizMcMachineAssignTaskEo>> consumerSupplier, Consumer<VizMcMachineAssignTaskEo> consumer) {
        pageConsumer(1000, consumerSupplier, consumer);
    }

    default public void pageConsumer(int pageSize, Function<Page<VizMcMachineAssignTaskEo>, Page<VizMcMachineAssignTaskEo>> consumerSupplier, Consumer<VizMcMachineAssignTaskEo> consumer) {
        Page<VizMcMachineAssignTaskEo> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<VizMcMachineAssignTaskEo> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    for (VizMcMachineAssignTaskEo t : result) {
                        consumer.accept(t);
                    }
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public void pageConsumersByWrapper(Consumer<VizMcMachineAssignTaskEoQueryWrapper> wrapperConsumer, Consumer<List<VizMcMachineAssignTaskEo>> consumerList) {
        VizMcMachineAssignTaskEoQueryWrapper queryWrapper = VizMcMachineAssignTaskEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumersByWrapper(int pageSize, Consumer<VizMcMachineAssignTaskEoQueryWrapper> wrapperConsumer, Consumer<List<VizMcMachineAssignTaskEo>> consumerList) {
        VizMcMachineAssignTaskEoQueryWrapper queryWrapper = VizMcMachineAssignTaskEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(QueryWrapper<VizMcMachineAssignTaskEo> queryWrapper, Consumer<List<VizMcMachineAssignTaskEo>> consumerList) {
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(int pageSize, QueryWrapper<VizMcMachineAssignTaskEo> queryWrapper, Consumer<List<VizMcMachineAssignTaskEo>> consumerList) {
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(Function<Page<VizMcMachineAssignTaskEo>, Page<VizMcMachineAssignTaskEo>> consumerSupplier, Consumer<List<VizMcMachineAssignTaskEo>> consumerList) {
        pageConsumers(1000, consumerSupplier, consumerList);
    }

    default public void pageConsumers(int pageSize, Function<Page<VizMcMachineAssignTaskEo>, Page<VizMcMachineAssignTaskEo>> consumerSupplier, Consumer<List<VizMcMachineAssignTaskEo>> consumerList) {
        Page<VizMcMachineAssignTaskEo> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<VizMcMachineAssignTaskEo> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    consumerList.accept(result);
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public boolean queryAndUpdateById(QueryWrapper<VizMcMachineAssignTaskEo> wrapper, VizMcMachineAssignTaskEo up) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<VizMcMachineAssignTaskEo> wrapper, VizMcMachineAssignTaskEo up) {
        return queryAndUpdateById(pageSize, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<VizMcMachineAssignTaskEo> wrapper, VizMcMachineAssignTaskEo up, BiPredicate<VizMcMachineAssignTaskEo, VizMcMachineAssignTaskEo> updateFilter) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<VizMcMachineAssignTaskEo> wrapper, VizMcMachineAssignTaskEo up, BiPredicate<VizMcMachineAssignTaskEo, VizMcMachineAssignTaskEo> updateFilter) {
        return queryAndUpdateById(pageSize, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<VizMcMachineAssignTaskEo> wrapper, VizMcMachineAssignTaskEo up, BiConsumer<VizMcMachineAssignTaskEo, VizMcMachineAssignTaskEoUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, whereSet);
    }

    default public boolean queryAndUpdateById(QueryWrapper<VizMcMachineAssignTaskEo> wrapper, VizMcMachineAssignTaskEo up, BiPredicate<VizMcMachineAssignTaskEo, VizMcMachineAssignTaskEo> updateFilter, BiConsumer<VizMcMachineAssignTaskEo, VizMcMachineAssignTaskEoUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, whereSet);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<VizMcMachineAssignTaskEo> wrapper, VizMcMachineAssignTaskEo up, BiPredicate<VizMcMachineAssignTaskEo, VizMcMachineAssignTaskEo> updateFilter, BiConsumer<VizMcMachineAssignTaskEo, VizMcMachineAssignTaskEoUpdateWrapper> whereSet) {
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

    default public boolean removeByIds(Consumer<VizMcMachineAssignTaskEoQueryWrapper> wrapper) {
        return removeByIds(1000, wrapper);
    }

    default public boolean removeByIds(int pageSize, Consumer<VizMcMachineAssignTaskEoQueryWrapper> wrapper) {
        VizMcMachineAssignTaskEoQueryWrapper removeWrapper = VizMcMachineAssignTaskEoQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return removeByIds(pageSize, removeWrapper);
    }

    default public boolean removeByIds(VizMcMachineAssignTaskEoQueryWrapper removeWrapper) {
        return removeByIds(1000, removeWrapper);
    }

    default public boolean removeByIds(int pageSize, VizMcMachineAssignTaskEoQueryWrapper removeWrapper) {
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
