package com.suqi.center.machine.dao.service;

import com.suqi.center.machine.dao.entity.YunMemberDevice;
import com.suqi.center.machine.dao.wrapper.YunMemberDeviceQueryWrapper;
import com.suqi.center.machine.dao.wrapper.YunMemberDeviceUpdateWrapper;
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
 * 用户设备表（yun_member_device） 服务类
 * </p>
 *
 * @author PC001
 * @since 2023-08-28
 */
public interface IYunMemberDeviceService extends IService<YunMemberDevice> {

    default long count(Consumer<YunMemberDeviceQueryWrapper> wrapperConsumer) {
        YunMemberDeviceQueryWrapper queryWrapper = YunMemberDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return count(queryWrapper);
    }

    default public YunMemberDevice selectOne(Consumer<YunMemberDeviceQueryWrapper> wrapperConsumer) {
        YunMemberDeviceQueryWrapper queryWrapper = YunMemberDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        queryWrapper.last(" limit 1 ");
        return getOne(queryWrapper, false);
    }

    default public List<YunMemberDevice> select(Consumer<YunMemberDeviceQueryWrapper> wrapperConsumer) {
        YunMemberDeviceQueryWrapper queryWrapper = YunMemberDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public List<YunMemberDevice> list(Consumer<YunMemberDeviceQueryWrapper> wrapperConsumer) {
        YunMemberDeviceQueryWrapper queryWrapper = YunMemberDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public boolean update(Consumer<YunMemberDeviceUpdateWrapper> wrapper) {
        YunMemberDeviceUpdateWrapper updateWrapper = YunMemberDeviceUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(updateWrapper);
    }

    default public boolean update(YunMemberDevice up, Consumer<YunMemberDeviceUpdateWrapper> wrapper) {
        YunMemberDeviceUpdateWrapper updateWrapper = YunMemberDeviceUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean update(Consumer<YunMemberDevice> setUp, Consumer<YunMemberDeviceUpdateWrapper> wrapper) {
        YunMemberDevice up = new YunMemberDevice();
        setUp.accept(up);
        YunMemberDeviceUpdateWrapper updateWrapper = YunMemberDeviceUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean remove(Consumer<YunMemberDeviceQueryWrapper> wrapper) {
        YunMemberDeviceQueryWrapper removeWrapper = YunMemberDeviceQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return remove(removeWrapper);
    }

    default public Page<YunMemberDevice> page(Page<YunMemberDevice> page, Consumer<YunMemberDeviceQueryWrapper> wrapperConsumer) {
        YunMemberDeviceQueryWrapper queryWrapper = YunMemberDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default Page<YunMemberDevice> quickPageById(Page<YunMemberDevice> page, long lastId, QueryWrapper<YunMemberDevice> wrapper) {
        return quickPageById(true, page, lastId, wrapper);
    }

    default Page<YunMemberDevice> quickPageById(Page<YunMemberDevice> page, long lastId, Consumer<YunMemberDeviceQueryWrapper> wrapperConsumer) {
        YunMemberDeviceQueryWrapper queryWrapper = YunMemberDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPageById(true, page, lastId, queryWrapper);
    }

    default Page<YunMemberDevice> quickPageById(boolean queryTotals, Page<YunMemberDevice> page, long lastId, QueryWrapper<YunMemberDevice> wrapper) {
        return page(page, wrapper);
    }

    default Page<YunMemberDevice> quickPage(Page<YunMemberDevice> page, QueryWrapper<YunMemberDevice> wrapper) {
        return IService.super.page(page, wrapper);
    }

    default Page<YunMemberDevice> page(Page<YunMemberDevice> page, QueryWrapper<YunMemberDevice> wrapper) {
        return quickPage(page, wrapper);
    }

    default Page<YunMemberDevice> quickPage(Page<YunMemberDevice> page, Consumer<YunMemberDeviceQueryWrapper> wrapperConsumer) {
        YunMemberDeviceQueryWrapper queryWrapper = YunMemberDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default public void pageConsumerByWrapper(Consumer<YunMemberDeviceQueryWrapper> wrapperConsumer, Consumer<YunMemberDevice> consumer) {
        YunMemberDeviceQueryWrapper queryWrapper = YunMemberDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumerByWrapper(int pageSize, Consumer<YunMemberDeviceQueryWrapper> wrapperConsumer, Consumer<YunMemberDevice> consumer) {
        YunMemberDeviceQueryWrapper queryWrapper = YunMemberDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(QueryWrapper<YunMemberDevice> queryWrapper, Consumer<YunMemberDevice> consumer) {
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(int pageSize, QueryWrapper<YunMemberDevice> queryWrapper, Consumer<YunMemberDevice> consumer) {
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(Function<Page<YunMemberDevice>, Page<YunMemberDevice>> consumerSupplier, Consumer<YunMemberDevice> consumer) {
        pageConsumer(1000, consumerSupplier, consumer);
    }

    default public void pageConsumer(int pageSize, Function<Page<YunMemberDevice>, Page<YunMemberDevice>> consumerSupplier, Consumer<YunMemberDevice> consumer) {
        Page<YunMemberDevice> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<YunMemberDevice> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    for (YunMemberDevice t : result) {
                        consumer.accept(t);
                    }
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public void pageConsumersByWrapper(Consumer<YunMemberDeviceQueryWrapper> wrapperConsumer, Consumer<List<YunMemberDevice>> consumerList) {
        YunMemberDeviceQueryWrapper queryWrapper = YunMemberDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumersByWrapper(int pageSize, Consumer<YunMemberDeviceQueryWrapper> wrapperConsumer, Consumer<List<YunMemberDevice>> consumerList) {
        YunMemberDeviceQueryWrapper queryWrapper = YunMemberDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(QueryWrapper<YunMemberDevice> queryWrapper, Consumer<List<YunMemberDevice>> consumerList) {
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(int pageSize, QueryWrapper<YunMemberDevice> queryWrapper, Consumer<List<YunMemberDevice>> consumerList) {
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(Function<Page<YunMemberDevice>, Page<YunMemberDevice>> consumerSupplier, Consumer<List<YunMemberDevice>> consumerList) {
        pageConsumers(1000, consumerSupplier, consumerList);
    }

    default public void pageConsumers(int pageSize, Function<Page<YunMemberDevice>, Page<YunMemberDevice>> consumerSupplier, Consumer<List<YunMemberDevice>> consumerList) {
        Page<YunMemberDevice> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<YunMemberDevice> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    consumerList.accept(result);
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public boolean queryAndUpdateById(QueryWrapper<YunMemberDevice> wrapper, YunMemberDevice up) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<YunMemberDevice> wrapper, YunMemberDevice up) {
        return queryAndUpdateById(pageSize, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<YunMemberDevice> wrapper, YunMemberDevice up, BiPredicate<YunMemberDevice, YunMemberDevice> updateFilter) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<YunMemberDevice> wrapper, YunMemberDevice up, BiPredicate<YunMemberDevice, YunMemberDevice> updateFilter) {
        return queryAndUpdateById(pageSize, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<YunMemberDevice> wrapper, YunMemberDevice up, BiConsumer<YunMemberDevice, YunMemberDeviceUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, whereSet);
    }

    default public boolean queryAndUpdateById(QueryWrapper<YunMemberDevice> wrapper, YunMemberDevice up, BiPredicate<YunMemberDevice, YunMemberDevice> updateFilter, BiConsumer<YunMemberDevice, YunMemberDeviceUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, whereSet);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<YunMemberDevice> wrapper, YunMemberDevice up, BiPredicate<YunMemberDevice, YunMemberDevice> updateFilter, BiConsumer<YunMemberDevice, YunMemberDeviceUpdateWrapper> whereSet) {
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

    default public boolean removeByIds(Consumer<YunMemberDeviceQueryWrapper> wrapper) {
        return removeByIds(1000, wrapper);
    }

    default public boolean removeByIds(int pageSize, Consumer<YunMemberDeviceQueryWrapper> wrapper) {
        YunMemberDeviceQueryWrapper removeWrapper = YunMemberDeviceQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return removeByIds(pageSize, removeWrapper);
    }

    default public boolean removeByIds(YunMemberDeviceQueryWrapper removeWrapper) {
        return removeByIds(1000, removeWrapper);
    }

    default public boolean removeByIds(int pageSize, YunMemberDeviceQueryWrapper removeWrapper) {
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
