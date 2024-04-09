package com.suqi.center.machine.dao.viz.service;

import com.suqi.center.machine.dao.viz.entity.VizMcMachineStreams;
import com.suqi.center.machine.dao.viz.wrapper.VizMcMachineStreamsQueryWrapper;
import com.suqi.center.machine.dao.viz.wrapper.VizMcMachineStreamsUpdateWrapper;
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
 * 机器streaming端口映射 服务类
 * </p>
 *
 * @author 18374
 * @since 2023-10-10
 */
public interface IVizMcMachineStreamsService extends IService<VizMcMachineStreams> {

    default long count(Consumer<VizMcMachineStreamsQueryWrapper> wrapperConsumer) {
        VizMcMachineStreamsQueryWrapper queryWrapper = VizMcMachineStreamsQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return count(queryWrapper);
    }

    default public VizMcMachineStreams selectOne(QueryWrapper<VizMcMachineStreams> queryWrapper) {
        queryWrapper.last(" limit 1 ");
        return getOne(queryWrapper, false);
    }

    default public VizMcMachineStreams selectOne(Consumer<VizMcMachineStreamsQueryWrapper> wrapperConsumer) {
        VizMcMachineStreamsQueryWrapper queryWrapper = VizMcMachineStreamsQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        queryWrapper.last(" limit 1 ");
        return getOne(queryWrapper, false);
    }

    default public List<VizMcMachineStreams> select(QueryWrapper<VizMcMachineStreams> queryWrapper) {
        return list(queryWrapper);
    }

    default public List<VizMcMachineStreams> select(Consumer<VizMcMachineStreamsQueryWrapper> wrapperConsumer) {
        VizMcMachineStreamsQueryWrapper queryWrapper = VizMcMachineStreamsQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public List<VizMcMachineStreams> list(Consumer<VizMcMachineStreamsQueryWrapper> wrapperConsumer) {
        VizMcMachineStreamsQueryWrapper queryWrapper = VizMcMachineStreamsQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public boolean update(Consumer<VizMcMachineStreamsUpdateWrapper> wrapper) {
        VizMcMachineStreamsUpdateWrapper updateWrapper = VizMcMachineStreamsUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(updateWrapper);
    }

    default public boolean update(VizMcMachineStreams up, Consumer<VizMcMachineStreamsUpdateWrapper> wrapper) {
        VizMcMachineStreamsUpdateWrapper updateWrapper = VizMcMachineStreamsUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean update(Consumer<VizMcMachineStreams> setUp, Consumer<VizMcMachineStreamsUpdateWrapper> wrapper) {
        VizMcMachineStreams up = new VizMcMachineStreams();
        setUp.accept(up);
        VizMcMachineStreamsUpdateWrapper updateWrapper = VizMcMachineStreamsUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean remove(Consumer<VizMcMachineStreamsQueryWrapper> wrapper) {
        VizMcMachineStreamsQueryWrapper removeWrapper = VizMcMachineStreamsQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return remove(removeWrapper);
    }

    default public Page<VizMcMachineStreams> page(Page<VizMcMachineStreams> page, Consumer<VizMcMachineStreamsQueryWrapper> wrapperConsumer) {
        VizMcMachineStreamsQueryWrapper queryWrapper = VizMcMachineStreamsQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default Page<VizMcMachineStreams> quickPageById(Page<VizMcMachineStreams> page, long lastId, QueryWrapper<VizMcMachineStreams> wrapper) {
        return quickPageById(true, page, lastId, wrapper);
    }

    default Page<VizMcMachineStreams> quickPageById(Page<VizMcMachineStreams> page, long lastId, Consumer<VizMcMachineStreamsQueryWrapper> wrapperConsumer) {
        VizMcMachineStreamsQueryWrapper queryWrapper = VizMcMachineStreamsQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPageById(true, page, lastId, queryWrapper);
    }

    default Page<VizMcMachineStreams> quickPageById(boolean queryTotals, Page<VizMcMachineStreams> page, long lastId, QueryWrapper<VizMcMachineStreams> wrapper) {
        return page(page, wrapper);
    }

    default Page<VizMcMachineStreams> quickPage(Page<VizMcMachineStreams> page, QueryWrapper<VizMcMachineStreams> wrapper) {
        return IService.super.page(page, wrapper);
    }

    default Page<VizMcMachineStreams> page(Page<VizMcMachineStreams> page, QueryWrapper<VizMcMachineStreams> wrapper) {
        return quickPage(page, wrapper);
    }

    default Page<VizMcMachineStreams> quickPage(Page<VizMcMachineStreams> page, Consumer<VizMcMachineStreamsQueryWrapper> wrapperConsumer) {
        VizMcMachineStreamsQueryWrapper queryWrapper = VizMcMachineStreamsQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default public void pageConsumerByWrapper(Consumer<VizMcMachineStreamsQueryWrapper> wrapperConsumer, Consumer<VizMcMachineStreams> consumer) {
        VizMcMachineStreamsQueryWrapper queryWrapper = VizMcMachineStreamsQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumerByWrapper(int pageSize, Consumer<VizMcMachineStreamsQueryWrapper> wrapperConsumer, Consumer<VizMcMachineStreams> consumer) {
        VizMcMachineStreamsQueryWrapper queryWrapper = VizMcMachineStreamsQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(QueryWrapper<VizMcMachineStreams> queryWrapper, Consumer<VizMcMachineStreams> consumer) {
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(int pageSize, QueryWrapper<VizMcMachineStreams> queryWrapper, Consumer<VizMcMachineStreams> consumer) {
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(Function<Page<VizMcMachineStreams>, Page<VizMcMachineStreams>> consumerSupplier, Consumer<VizMcMachineStreams> consumer) {
        pageConsumer(1000, consumerSupplier, consumer);
    }

    default public void pageConsumer(int pageSize, Function<Page<VizMcMachineStreams>, Page<VizMcMachineStreams>> consumerSupplier, Consumer<VizMcMachineStreams> consumer) {
        Page<VizMcMachineStreams> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<VizMcMachineStreams> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    for (VizMcMachineStreams t : result) {
                        consumer.accept(t);
                    }
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public void pageConsumersByWrapper(Consumer<VizMcMachineStreamsQueryWrapper> wrapperConsumer, Consumer<List<VizMcMachineStreams>> consumerList) {
        VizMcMachineStreamsQueryWrapper queryWrapper = VizMcMachineStreamsQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumersByWrapper(int pageSize, Consumer<VizMcMachineStreamsQueryWrapper> wrapperConsumer, Consumer<List<VizMcMachineStreams>> consumerList) {
        VizMcMachineStreamsQueryWrapper queryWrapper = VizMcMachineStreamsQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(QueryWrapper<VizMcMachineStreams> queryWrapper, Consumer<List<VizMcMachineStreams>> consumerList) {
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(int pageSize, QueryWrapper<VizMcMachineStreams> queryWrapper, Consumer<List<VizMcMachineStreams>> consumerList) {
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(Function<Page<VizMcMachineStreams>, Page<VizMcMachineStreams>> consumerSupplier, Consumer<List<VizMcMachineStreams>> consumerList) {
        pageConsumers(1000, consumerSupplier, consumerList);
    }

    default public void pageConsumers(int pageSize, Function<Page<VizMcMachineStreams>, Page<VizMcMachineStreams>> consumerSupplier, Consumer<List<VizMcMachineStreams>> consumerList) {
        Page<VizMcMachineStreams> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<VizMcMachineStreams> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    consumerList.accept(result);
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public boolean queryAndUpdateById(QueryWrapper<VizMcMachineStreams> wrapper, VizMcMachineStreams up) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<VizMcMachineStreams> wrapper, VizMcMachineStreams up) {
        return queryAndUpdateById(pageSize, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<VizMcMachineStreams> wrapper, VizMcMachineStreams up, BiPredicate<VizMcMachineStreams, VizMcMachineStreams> updateFilter) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<VizMcMachineStreams> wrapper, VizMcMachineStreams up, BiPredicate<VizMcMachineStreams, VizMcMachineStreams> updateFilter) {
        return queryAndUpdateById(pageSize, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<VizMcMachineStreams> wrapper, VizMcMachineStreams up, BiConsumer<VizMcMachineStreams, VizMcMachineStreamsUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, whereSet);
    }

    default public boolean queryAndUpdateById(QueryWrapper<VizMcMachineStreams> wrapper, VizMcMachineStreams up, BiPredicate<VizMcMachineStreams, VizMcMachineStreams> updateFilter, BiConsumer<VizMcMachineStreams, VizMcMachineStreamsUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, whereSet);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<VizMcMachineStreams> wrapper, VizMcMachineStreams up, BiPredicate<VizMcMachineStreams, VizMcMachineStreams> updateFilter, BiConsumer<VizMcMachineStreams, VizMcMachineStreamsUpdateWrapper> whereSet) {
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

    default public boolean removeByIds(Consumer<VizMcMachineStreamsQueryWrapper> wrapper) {
        return removeByIds(1000, wrapper);
    }

    default public boolean removeByIds(int pageSize, Consumer<VizMcMachineStreamsQueryWrapper> wrapper) {
        VizMcMachineStreamsQueryWrapper removeWrapper = VizMcMachineStreamsQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return removeByIds(pageSize, removeWrapper);
    }

    default public boolean removeByIds(VizMcMachineStreamsQueryWrapper removeWrapper) {
        return removeByIds(1000, removeWrapper);
    }

    default public boolean removeByIds(int pageSize, VizMcMachineStreamsQueryWrapper removeWrapper) {
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
