package com.suqi.center.machine.dao.service;

import com.suqi.center.machine.dao.entity.EmSocDeviceExtend;
import com.suqi.center.machine.dao.wrapper.EmSocDeviceExtendQueryWrapper;
import com.suqi.center.machine.dao.wrapper.EmSocDeviceExtendUpdateWrapper;
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
 * 设备扩展信息表（em_soc_device_extend） 服务类
 * </p>
 *
 * @author PC001
 * @since 2023-08-29
 */
public interface IEmSocDeviceExtendService extends IService<EmSocDeviceExtend> {

    default long count(Consumer<EmSocDeviceExtendQueryWrapper> wrapperConsumer) {
        EmSocDeviceExtendQueryWrapper queryWrapper = EmSocDeviceExtendQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return count(queryWrapper);
    }

    default public EmSocDeviceExtend selectOne(Consumer<EmSocDeviceExtendQueryWrapper> wrapperConsumer) {
        EmSocDeviceExtendQueryWrapper queryWrapper = EmSocDeviceExtendQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        queryWrapper.last(" limit 1 ");
        return getOne(queryWrapper, false);
    }

    default public List<EmSocDeviceExtend> select(Consumer<EmSocDeviceExtendQueryWrapper> wrapperConsumer) {
        EmSocDeviceExtendQueryWrapper queryWrapper = EmSocDeviceExtendQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public List<EmSocDeviceExtend> list(Consumer<EmSocDeviceExtendQueryWrapper> wrapperConsumer) {
        EmSocDeviceExtendQueryWrapper queryWrapper = EmSocDeviceExtendQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public boolean update(Consumer<EmSocDeviceExtendUpdateWrapper> wrapper) {
        EmSocDeviceExtendUpdateWrapper updateWrapper = EmSocDeviceExtendUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(updateWrapper);
    }

    default public boolean update(EmSocDeviceExtend up, Consumer<EmSocDeviceExtendUpdateWrapper> wrapper) {
        EmSocDeviceExtendUpdateWrapper updateWrapper = EmSocDeviceExtendUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean update(Consumer<EmSocDeviceExtend> setUp, Consumer<EmSocDeviceExtendUpdateWrapper> wrapper) {
        EmSocDeviceExtend up = new EmSocDeviceExtend();
        setUp.accept(up);
        EmSocDeviceExtendUpdateWrapper updateWrapper = EmSocDeviceExtendUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean remove(Consumer<EmSocDeviceExtendQueryWrapper> wrapper) {
        EmSocDeviceExtendQueryWrapper removeWrapper = EmSocDeviceExtendQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return remove(removeWrapper);
    }

    default public Page<EmSocDeviceExtend> page(Page<EmSocDeviceExtend> page, Consumer<EmSocDeviceExtendQueryWrapper> wrapperConsumer) {
        EmSocDeviceExtendQueryWrapper queryWrapper = EmSocDeviceExtendQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default Page<EmSocDeviceExtend> quickPageById(Page<EmSocDeviceExtend> page, long lastId, QueryWrapper<EmSocDeviceExtend> wrapper) {
        return quickPageById(true, page, lastId, wrapper);
    }

    default Page<EmSocDeviceExtend> quickPageById(Page<EmSocDeviceExtend> page, long lastId, Consumer<EmSocDeviceExtendQueryWrapper> wrapperConsumer) {
        EmSocDeviceExtendQueryWrapper queryWrapper = EmSocDeviceExtendQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPageById(true, page, lastId, queryWrapper);
    }

    default Page<EmSocDeviceExtend> quickPageById(boolean queryTotals, Page<EmSocDeviceExtend> page, long lastId, QueryWrapper<EmSocDeviceExtend> wrapper) {
        return page(page, wrapper);
    }

    default Page<EmSocDeviceExtend> quickPage(Page<EmSocDeviceExtend> page, QueryWrapper<EmSocDeviceExtend> wrapper) {
        return IService.super.page(page, wrapper);
    }

    default Page<EmSocDeviceExtend> page(Page<EmSocDeviceExtend> page, QueryWrapper<EmSocDeviceExtend> wrapper) {
        return quickPage(page, wrapper);
    }

    default Page<EmSocDeviceExtend> quickPage(Page<EmSocDeviceExtend> page, Consumer<EmSocDeviceExtendQueryWrapper> wrapperConsumer) {
        EmSocDeviceExtendQueryWrapper queryWrapper = EmSocDeviceExtendQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default public void pageConsumerByWrapper(Consumer<EmSocDeviceExtendQueryWrapper> wrapperConsumer, Consumer<EmSocDeviceExtend> consumer) {
        EmSocDeviceExtendQueryWrapper queryWrapper = EmSocDeviceExtendQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumerByWrapper(int pageSize, Consumer<EmSocDeviceExtendQueryWrapper> wrapperConsumer, Consumer<EmSocDeviceExtend> consumer) {
        EmSocDeviceExtendQueryWrapper queryWrapper = EmSocDeviceExtendQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(QueryWrapper<EmSocDeviceExtend> queryWrapper, Consumer<EmSocDeviceExtend> consumer) {
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(int pageSize, QueryWrapper<EmSocDeviceExtend> queryWrapper, Consumer<EmSocDeviceExtend> consumer) {
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(Function<Page<EmSocDeviceExtend>, Page<EmSocDeviceExtend>> consumerSupplier, Consumer<EmSocDeviceExtend> consumer) {
        pageConsumer(1000, consumerSupplier, consumer);
    }

    default public void pageConsumer(int pageSize, Function<Page<EmSocDeviceExtend>, Page<EmSocDeviceExtend>> consumerSupplier, Consumer<EmSocDeviceExtend> consumer) {
        Page<EmSocDeviceExtend> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<EmSocDeviceExtend> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    for (EmSocDeviceExtend t : result) {
                        consumer.accept(t);
                    }
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public void pageConsumersByWrapper(Consumer<EmSocDeviceExtendQueryWrapper> wrapperConsumer, Consumer<List<EmSocDeviceExtend>> consumerList) {
        EmSocDeviceExtendQueryWrapper queryWrapper = EmSocDeviceExtendQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumersByWrapper(int pageSize, Consumer<EmSocDeviceExtendQueryWrapper> wrapperConsumer, Consumer<List<EmSocDeviceExtend>> consumerList) {
        EmSocDeviceExtendQueryWrapper queryWrapper = EmSocDeviceExtendQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(QueryWrapper<EmSocDeviceExtend> queryWrapper, Consumer<List<EmSocDeviceExtend>> consumerList) {
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(int pageSize, QueryWrapper<EmSocDeviceExtend> queryWrapper, Consumer<List<EmSocDeviceExtend>> consumerList) {
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(Function<Page<EmSocDeviceExtend>, Page<EmSocDeviceExtend>> consumerSupplier, Consumer<List<EmSocDeviceExtend>> consumerList) {
        pageConsumers(1000, consumerSupplier, consumerList);
    }

    default public void pageConsumers(int pageSize, Function<Page<EmSocDeviceExtend>, Page<EmSocDeviceExtend>> consumerSupplier, Consumer<List<EmSocDeviceExtend>> consumerList) {
        Page<EmSocDeviceExtend> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<EmSocDeviceExtend> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    consumerList.accept(result);
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public boolean queryAndUpdateById(QueryWrapper<EmSocDeviceExtend> wrapper, EmSocDeviceExtend up) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<EmSocDeviceExtend> wrapper, EmSocDeviceExtend up) {
        return queryAndUpdateById(pageSize, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<EmSocDeviceExtend> wrapper, EmSocDeviceExtend up, BiPredicate<EmSocDeviceExtend, EmSocDeviceExtend> updateFilter) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<EmSocDeviceExtend> wrapper, EmSocDeviceExtend up, BiPredicate<EmSocDeviceExtend, EmSocDeviceExtend> updateFilter) {
        return queryAndUpdateById(pageSize, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<EmSocDeviceExtend> wrapper, EmSocDeviceExtend up, BiConsumer<EmSocDeviceExtend, EmSocDeviceExtendUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, whereSet);
    }

    default public boolean queryAndUpdateById(QueryWrapper<EmSocDeviceExtend> wrapper, EmSocDeviceExtend up, BiPredicate<EmSocDeviceExtend, EmSocDeviceExtend> updateFilter, BiConsumer<EmSocDeviceExtend, EmSocDeviceExtendUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, whereSet);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<EmSocDeviceExtend> wrapper, EmSocDeviceExtend up, BiPredicate<EmSocDeviceExtend, EmSocDeviceExtend> updateFilter, BiConsumer<EmSocDeviceExtend, EmSocDeviceExtendUpdateWrapper> whereSet) {
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

    default public boolean removeByIds(Consumer<EmSocDeviceExtendQueryWrapper> wrapper) {
        return removeByIds(1000, wrapper);
    }

    default public boolean removeByIds(int pageSize, Consumer<EmSocDeviceExtendQueryWrapper> wrapper) {
        EmSocDeviceExtendQueryWrapper removeWrapper = EmSocDeviceExtendQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return removeByIds(pageSize, removeWrapper);
    }

    default public boolean removeByIds(EmSocDeviceExtendQueryWrapper removeWrapper) {
        return removeByIds(1000, removeWrapper);
    }

    default public boolean removeByIds(int pageSize, EmSocDeviceExtendQueryWrapper removeWrapper) {
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
