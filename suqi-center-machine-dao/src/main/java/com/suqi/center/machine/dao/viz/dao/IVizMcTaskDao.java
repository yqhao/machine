package com.suqi.center.machine.dao.viz.dao;

import com.suqi.center.machine.dao.viz.entity.VizMcTaskEo;
import com.suqi.center.machine.dao.viz.wrapper.VizMcTaskEoQueryWrapper;
import com.suqi.center.machine.dao.viz.wrapper.VizMcTaskEoUpdateWrapper;
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
 * 任务表 服务类
 * </p>
 *
 * @author 18374
 * @since 2023-10-20
 */
public interface IVizMcTaskDao extends IService<VizMcTaskEo> {

    default long count(Consumer<VizMcTaskEoQueryWrapper> wrapperConsumer) {
        VizMcTaskEoQueryWrapper queryWrapper = VizMcTaskEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return count(queryWrapper);
    }

    default public VizMcTaskEo selectOne(QueryWrapper<VizMcTaskEo> queryWrapper) {
        queryWrapper.last(" limit 1 ");
        return getOne(queryWrapper, false);
    }

    default public VizMcTaskEo selectOne(Consumer<VizMcTaskEoQueryWrapper> wrapperConsumer) {
        VizMcTaskEoQueryWrapper queryWrapper = VizMcTaskEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        queryWrapper.last(" limit 1 ");
        return getOne(queryWrapper, false);
    }

    default public List<VizMcTaskEo> select(QueryWrapper<VizMcTaskEo> queryWrapper) {
        return list(queryWrapper);
    }

    default public List<VizMcTaskEo> select(Consumer<VizMcTaskEoQueryWrapper> wrapperConsumer) {
        VizMcTaskEoQueryWrapper queryWrapper = VizMcTaskEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public List<VizMcTaskEo> list(Consumer<VizMcTaskEoQueryWrapper> wrapperConsumer) {
        VizMcTaskEoQueryWrapper queryWrapper = VizMcTaskEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public boolean update(Consumer<VizMcTaskEoUpdateWrapper> wrapper) {
        VizMcTaskEoUpdateWrapper updateWrapper = VizMcTaskEoUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(updateWrapper);
    }

    default public boolean update(VizMcTaskEo up, Consumer<VizMcTaskEoUpdateWrapper> wrapper) {
        VizMcTaskEoUpdateWrapper updateWrapper = VizMcTaskEoUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean update(Consumer<VizMcTaskEo> setUp, Consumer<VizMcTaskEoUpdateWrapper> wrapper) {
        VizMcTaskEo up = new VizMcTaskEo();
        setUp.accept(up);
        VizMcTaskEoUpdateWrapper updateWrapper = VizMcTaskEoUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean remove(Consumer<VizMcTaskEoQueryWrapper> wrapper) {
        VizMcTaskEoQueryWrapper removeWrapper = VizMcTaskEoQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return remove(removeWrapper);
    }

    default public Page<VizMcTaskEo> page(Page<VizMcTaskEo> page, Consumer<VizMcTaskEoQueryWrapper> wrapperConsumer) {
        VizMcTaskEoQueryWrapper queryWrapper = VizMcTaskEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default Page<VizMcTaskEo> quickPageById(Page<VizMcTaskEo> page, long lastId, QueryWrapper<VizMcTaskEo> wrapper) {
        return quickPageById(true, page, lastId, wrapper);
    }

    default Page<VizMcTaskEo> quickPageById(Page<VizMcTaskEo> page, long lastId, Consumer<VizMcTaskEoQueryWrapper> wrapperConsumer) {
        VizMcTaskEoQueryWrapper queryWrapper = VizMcTaskEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPageById(true, page, lastId, queryWrapper);
    }

    default Page<VizMcTaskEo> quickPageById(boolean queryTotals, Page<VizMcTaskEo> page, long lastId, QueryWrapper<VizMcTaskEo> wrapper) {
        return page(page, wrapper);
    }

    default Page<VizMcTaskEo> quickPage(Page<VizMcTaskEo> page, QueryWrapper<VizMcTaskEo> wrapper) {
        return IService.super.page(page, wrapper);
    }

    default Page<VizMcTaskEo> page(Page<VizMcTaskEo> page, QueryWrapper<VizMcTaskEo> wrapper) {
        return quickPage(page, wrapper);
    }

    default Page<VizMcTaskEo> quickPage(Page<VizMcTaskEo> page, Consumer<VizMcTaskEoQueryWrapper> wrapperConsumer) {
        VizMcTaskEoQueryWrapper queryWrapper = VizMcTaskEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default public void pageConsumerByWrapper(Consumer<VizMcTaskEoQueryWrapper> wrapperConsumer, Consumer<VizMcTaskEo> consumer) {
        VizMcTaskEoQueryWrapper queryWrapper = VizMcTaskEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumerByWrapper(int pageSize, Consumer<VizMcTaskEoQueryWrapper> wrapperConsumer, Consumer<VizMcTaskEo> consumer) {
        VizMcTaskEoQueryWrapper queryWrapper = VizMcTaskEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(QueryWrapper<VizMcTaskEo> queryWrapper, Consumer<VizMcTaskEo> consumer) {
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(int pageSize, QueryWrapper<VizMcTaskEo> queryWrapper, Consumer<VizMcTaskEo> consumer) {
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(Function<Page<VizMcTaskEo>, Page<VizMcTaskEo>> consumerSupplier, Consumer<VizMcTaskEo> consumer) {
        pageConsumer(1000, consumerSupplier, consumer);
    }

    default public void pageConsumer(int pageSize, Function<Page<VizMcTaskEo>, Page<VizMcTaskEo>> consumerSupplier, Consumer<VizMcTaskEo> consumer) {
        Page<VizMcTaskEo> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<VizMcTaskEo> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    for (VizMcTaskEo t : result) {
                        consumer.accept(t);
                    }
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public void pageConsumersByWrapper(Consumer<VizMcTaskEoQueryWrapper> wrapperConsumer, Consumer<List<VizMcTaskEo>> consumerList) {
        VizMcTaskEoQueryWrapper queryWrapper = VizMcTaskEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumersByWrapper(int pageSize, Consumer<VizMcTaskEoQueryWrapper> wrapperConsumer, Consumer<List<VizMcTaskEo>> consumerList) {
        VizMcTaskEoQueryWrapper queryWrapper = VizMcTaskEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(QueryWrapper<VizMcTaskEo> queryWrapper, Consumer<List<VizMcTaskEo>> consumerList) {
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(int pageSize, QueryWrapper<VizMcTaskEo> queryWrapper, Consumer<List<VizMcTaskEo>> consumerList) {
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(Function<Page<VizMcTaskEo>, Page<VizMcTaskEo>> consumerSupplier, Consumer<List<VizMcTaskEo>> consumerList) {
        pageConsumers(1000, consumerSupplier, consumerList);
    }

    default public void pageConsumers(int pageSize, Function<Page<VizMcTaskEo>, Page<VizMcTaskEo>> consumerSupplier, Consumer<List<VizMcTaskEo>> consumerList) {
        Page<VizMcTaskEo> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<VizMcTaskEo> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    consumerList.accept(result);
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public boolean queryAndUpdateById(QueryWrapper<VizMcTaskEo> wrapper, VizMcTaskEo up) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<VizMcTaskEo> wrapper, VizMcTaskEo up) {
        return queryAndUpdateById(pageSize, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<VizMcTaskEo> wrapper, VizMcTaskEo up, BiPredicate<VizMcTaskEo, VizMcTaskEo> updateFilter) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<VizMcTaskEo> wrapper, VizMcTaskEo up, BiPredicate<VizMcTaskEo, VizMcTaskEo> updateFilter) {
        return queryAndUpdateById(pageSize, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<VizMcTaskEo> wrapper, VizMcTaskEo up, BiConsumer<VizMcTaskEo, VizMcTaskEoUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, whereSet);
    }

    default public boolean queryAndUpdateById(QueryWrapper<VizMcTaskEo> wrapper, VizMcTaskEo up, BiPredicate<VizMcTaskEo, VizMcTaskEo> updateFilter, BiConsumer<VizMcTaskEo, VizMcTaskEoUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, whereSet);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<VizMcTaskEo> wrapper, VizMcTaskEo up, BiPredicate<VizMcTaskEo, VizMcTaskEo> updateFilter, BiConsumer<VizMcTaskEo, VizMcTaskEoUpdateWrapper> whereSet) {
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

    default public boolean removeByIds(Consumer<VizMcTaskEoQueryWrapper> wrapper) {
        return removeByIds(1000, wrapper);
    }

    default public boolean removeByIds(int pageSize, Consumer<VizMcTaskEoQueryWrapper> wrapper) {
        VizMcTaskEoQueryWrapper removeWrapper = VizMcTaskEoQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return removeByIds(pageSize, removeWrapper);
    }

    default public boolean removeByIds(VizMcTaskEoQueryWrapper removeWrapper) {
        return removeByIds(1000, removeWrapper);
    }

    default public boolean removeByIds(int pageSize, VizMcTaskEoQueryWrapper removeWrapper) {
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
