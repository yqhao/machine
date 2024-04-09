package com.suqi.center.machine.dao.viz.service;

import com.suqi.center.machine.dao.viz.entity.VizMcMachineStatus;
import com.suqi.center.machine.dao.viz.wrapper.VizMcMachineStatusQueryWrapper;
import com.suqi.center.machine.dao.viz.wrapper.VizMcMachineStatusUpdateWrapper;
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
 * 机器状态表 服务类
 * </p>
 *
 * @author 18374
 * @since 2023-10-11
 */
public interface IVizMcMachineStatusService extends IService<VizMcMachineStatus> {

    default long count(Consumer<VizMcMachineStatusQueryWrapper> wrapperConsumer) {
        VizMcMachineStatusQueryWrapper queryWrapper = VizMcMachineStatusQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return count(queryWrapper);
    }

    default public VizMcMachineStatus selectOne(Consumer<VizMcMachineStatusQueryWrapper> wrapperConsumer) {
        VizMcMachineStatusQueryWrapper queryWrapper = VizMcMachineStatusQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        queryWrapper.last(" limit 1 ");
        return getOne(queryWrapper, false);
    }

    default public List<VizMcMachineStatus> select(Consumer<VizMcMachineStatusQueryWrapper> wrapperConsumer) {
        VizMcMachineStatusQueryWrapper queryWrapper = VizMcMachineStatusQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public List<VizMcMachineStatus> list(Consumer<VizMcMachineStatusQueryWrapper> wrapperConsumer) {
        VizMcMachineStatusQueryWrapper queryWrapper = VizMcMachineStatusQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public boolean update(Consumer<VizMcMachineStatusUpdateWrapper> wrapper) {
        VizMcMachineStatusUpdateWrapper updateWrapper = VizMcMachineStatusUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(updateWrapper);
    }

    default public boolean update(VizMcMachineStatus up, Consumer<VizMcMachineStatusUpdateWrapper> wrapper) {
        VizMcMachineStatusUpdateWrapper updateWrapper = VizMcMachineStatusUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean update(Consumer<VizMcMachineStatus> setUp, Consumer<VizMcMachineStatusUpdateWrapper> wrapper) {
        VizMcMachineStatus up = new VizMcMachineStatus();
        setUp.accept(up);
        VizMcMachineStatusUpdateWrapper updateWrapper = VizMcMachineStatusUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean remove(Consumer<VizMcMachineStatusQueryWrapper> wrapper) {
        VizMcMachineStatusQueryWrapper removeWrapper = VizMcMachineStatusQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return remove(removeWrapper);
    }

    default public Page<VizMcMachineStatus> page(Page<VizMcMachineStatus> page, Consumer<VizMcMachineStatusQueryWrapper> wrapperConsumer) {
        VizMcMachineStatusQueryWrapper queryWrapper = VizMcMachineStatusQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default Page<VizMcMachineStatus> quickPageById(Page<VizMcMachineStatus> page, long lastId, QueryWrapper<VizMcMachineStatus> wrapper) {
        return quickPageById(true, page, lastId, wrapper);
    }

    default Page<VizMcMachineStatus> quickPageById(Page<VizMcMachineStatus> page, long lastId, Consumer<VizMcMachineStatusQueryWrapper> wrapperConsumer) {
        VizMcMachineStatusQueryWrapper queryWrapper = VizMcMachineStatusQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPageById(true, page, lastId, queryWrapper);
    }

    default Page<VizMcMachineStatus> quickPageById(boolean queryTotals, Page<VizMcMachineStatus> page, long lastId, QueryWrapper<VizMcMachineStatus> wrapper) {
        return page(page, wrapper);
    }

    default Page<VizMcMachineStatus> quickPage(Page<VizMcMachineStatus> page, QueryWrapper<VizMcMachineStatus> wrapper) {
        return IService.super.page(page, wrapper);
    }

    default Page<VizMcMachineStatus> page(Page<VizMcMachineStatus> page, QueryWrapper<VizMcMachineStatus> wrapper) {
        return quickPage(page, wrapper);
    }

    default Page<VizMcMachineStatus> quickPage(Page<VizMcMachineStatus> page, Consumer<VizMcMachineStatusQueryWrapper> wrapperConsumer) {
        VizMcMachineStatusQueryWrapper queryWrapper = VizMcMachineStatusQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default public void pageConsumerByWrapper(Consumer<VizMcMachineStatusQueryWrapper> wrapperConsumer, Consumer<VizMcMachineStatus> consumer) {
        VizMcMachineStatusQueryWrapper queryWrapper = VizMcMachineStatusQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumerByWrapper(int pageSize, Consumer<VizMcMachineStatusQueryWrapper> wrapperConsumer, Consumer<VizMcMachineStatus> consumer) {
        VizMcMachineStatusQueryWrapper queryWrapper = VizMcMachineStatusQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(QueryWrapper<VizMcMachineStatus> queryWrapper, Consumer<VizMcMachineStatus> consumer) {
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(int pageSize, QueryWrapper<VizMcMachineStatus> queryWrapper, Consumer<VizMcMachineStatus> consumer) {
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(Function<Page<VizMcMachineStatus>, Page<VizMcMachineStatus>> consumerSupplier, Consumer<VizMcMachineStatus> consumer) {
        pageConsumer(1000, consumerSupplier, consumer);
    }

    default public void pageConsumer(int pageSize, Function<Page<VizMcMachineStatus>, Page<VizMcMachineStatus>> consumerSupplier, Consumer<VizMcMachineStatus> consumer) {
        Page<VizMcMachineStatus> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<VizMcMachineStatus> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    for (VizMcMachineStatus t : result) {
                        consumer.accept(t);
                    }
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public void pageConsumersByWrapper(Consumer<VizMcMachineStatusQueryWrapper> wrapperConsumer, Consumer<List<VizMcMachineStatus>> consumerList) {
        VizMcMachineStatusQueryWrapper queryWrapper = VizMcMachineStatusQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumersByWrapper(int pageSize, Consumer<VizMcMachineStatusQueryWrapper> wrapperConsumer, Consumer<List<VizMcMachineStatus>> consumerList) {
        VizMcMachineStatusQueryWrapper queryWrapper = VizMcMachineStatusQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(QueryWrapper<VizMcMachineStatus> queryWrapper, Consumer<List<VizMcMachineStatus>> consumerList) {
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(int pageSize, QueryWrapper<VizMcMachineStatus> queryWrapper, Consumer<List<VizMcMachineStatus>> consumerList) {
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(Function<Page<VizMcMachineStatus>, Page<VizMcMachineStatus>> consumerSupplier, Consumer<List<VizMcMachineStatus>> consumerList) {
        pageConsumers(1000, consumerSupplier, consumerList);
    }

    default public void pageConsumers(int pageSize, Function<Page<VizMcMachineStatus>, Page<VizMcMachineStatus>> consumerSupplier, Consumer<List<VizMcMachineStatus>> consumerList) {
        Page<VizMcMachineStatus> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<VizMcMachineStatus> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    consumerList.accept(result);
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public boolean queryAndUpdateById(QueryWrapper<VizMcMachineStatus> wrapper, VizMcMachineStatus up) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<VizMcMachineStatus> wrapper, VizMcMachineStatus up) {
        return queryAndUpdateById(pageSize, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<VizMcMachineStatus> wrapper, VizMcMachineStatus up, BiPredicate<VizMcMachineStatus, VizMcMachineStatus> updateFilter) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<VizMcMachineStatus> wrapper, VizMcMachineStatus up, BiPredicate<VizMcMachineStatus, VizMcMachineStatus> updateFilter) {
        return queryAndUpdateById(pageSize, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<VizMcMachineStatus> wrapper, VizMcMachineStatus up, BiConsumer<VizMcMachineStatus, VizMcMachineStatusUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, whereSet);
    }

    default public boolean queryAndUpdateById(QueryWrapper<VizMcMachineStatus> wrapper, VizMcMachineStatus up, BiPredicate<VizMcMachineStatus, VizMcMachineStatus> updateFilter, BiConsumer<VizMcMachineStatus, VizMcMachineStatusUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, whereSet);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<VizMcMachineStatus> wrapper, VizMcMachineStatus up, BiPredicate<VizMcMachineStatus, VizMcMachineStatus> updateFilter, BiConsumer<VizMcMachineStatus, VizMcMachineStatusUpdateWrapper> whereSet) {
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

    default public boolean removeByIds(Consumer<VizMcMachineStatusQueryWrapper> wrapper) {
        return removeByIds(1000, wrapper);
    }

    default public boolean removeByIds(int pageSize, Consumer<VizMcMachineStatusQueryWrapper> wrapper) {
        VizMcMachineStatusQueryWrapper removeWrapper = VizMcMachineStatusQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return removeByIds(pageSize, removeWrapper);
    }

    default public boolean removeByIds(VizMcMachineStatusQueryWrapper removeWrapper) {
        return removeByIds(1000, removeWrapper);
    }

    default public boolean removeByIds(int pageSize, VizMcMachineStatusQueryWrapper removeWrapper) {
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
