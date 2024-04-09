package com.suqi.center.machine.dao.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.suqi.center.machine.dao.entity.YunMemberUserDevice;
import com.suqi.center.machine.dao.wrapper.YunMemberUserDeviceQueryWrapper;
import com.suqi.center.machine.dao.wrapper.YunMemberUserDeviceUpdateWrapper;
import java.util.List;
import java.util.function.Consumer;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * <p>
 * 商户用户设备表（yun_member_user_device） 服务类
 * </p>
 *
 * @author PC001
 * @since 2023-05-19
 */
public interface IYunMemberUserDeviceService extends IService<YunMemberUserDevice> {

    default long count(Consumer<YunMemberUserDeviceQueryWrapper> wrapperConsumer) {
        YunMemberUserDeviceQueryWrapper queryWrapper = YunMemberUserDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return count(queryWrapper);
    }

    default public YunMemberUserDevice selectOne(Consumer<YunMemberUserDeviceQueryWrapper> wrapperConsumer) {
        YunMemberUserDeviceQueryWrapper queryWrapper = YunMemberUserDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        queryWrapper.last(" limit 1 ");
        return getOne(queryWrapper, false);
    }

    default public List<YunMemberUserDevice> select(Consumer<YunMemberUserDeviceQueryWrapper> wrapperConsumer) {
        YunMemberUserDeviceQueryWrapper queryWrapper = YunMemberUserDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public List<YunMemberUserDevice> list(Consumer<YunMemberUserDeviceQueryWrapper> wrapperConsumer) {
        YunMemberUserDeviceQueryWrapper queryWrapper = YunMemberUserDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public boolean update(Consumer<YunMemberUserDeviceUpdateWrapper> wrapper) {
        YunMemberUserDeviceUpdateWrapper updateWrapper = YunMemberUserDeviceUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(updateWrapper);
    }

    default public boolean update(YunMemberUserDevice up, Consumer<YunMemberUserDeviceUpdateWrapper> wrapper) {
        YunMemberUserDeviceUpdateWrapper updateWrapper = YunMemberUserDeviceUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean update(Consumer<YunMemberUserDevice> setUp, Consumer<YunMemberUserDeviceUpdateWrapper> wrapper) {
        YunMemberUserDevice up = new YunMemberUserDevice();
        setUp.accept(up);
        YunMemberUserDeviceUpdateWrapper updateWrapper = YunMemberUserDeviceUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean remove(Consumer<YunMemberUserDeviceQueryWrapper> wrapper) {
        YunMemberUserDeviceQueryWrapper removeWrapper = YunMemberUserDeviceQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return remove(removeWrapper);
    }

    default public Page<YunMemberUserDevice> page(Page<YunMemberUserDevice> page, Consumer<YunMemberUserDeviceQueryWrapper> wrapperConsumer) {
        YunMemberUserDeviceQueryWrapper queryWrapper = YunMemberUserDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default Page<YunMemberUserDevice> quickPageById(Page<YunMemberUserDevice> page, long lastId, QueryWrapper<YunMemberUserDevice> wrapper) {
        return quickPageById(true, page, lastId, wrapper);
    }

    default Page<YunMemberUserDevice> quickPageById(Page<YunMemberUserDevice> page, long lastId, Consumer<YunMemberUserDeviceQueryWrapper> wrapperConsumer) {
        YunMemberUserDeviceQueryWrapper queryWrapper = YunMemberUserDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPageById(true, page, lastId, queryWrapper);
    }

    default Page<YunMemberUserDevice> quickPageById(boolean queryTotals, Page<YunMemberUserDevice> page, long lastId, QueryWrapper<YunMemberUserDevice> wrapper) {
        return page(page, wrapper);
    }

    default Page<YunMemberUserDevice> quickPage(Page<YunMemberUserDevice> page, QueryWrapper<YunMemberUserDevice> wrapper) {
        return IService.super.page(page, wrapper);
    }

    default Page<YunMemberUserDevice> page(Page<YunMemberUserDevice> page, QueryWrapper<YunMemberUserDevice> wrapper) {
        return quickPage(page, wrapper);
    }

    default Page<YunMemberUserDevice> quickPage(Page<YunMemberUserDevice> page, Consumer<YunMemberUserDeviceQueryWrapper> wrapperConsumer) {
        YunMemberUserDeviceQueryWrapper queryWrapper = YunMemberUserDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default public void pageConsumerByWrapper(Consumer<YunMemberUserDeviceQueryWrapper> wrapperConsumer, Consumer<YunMemberUserDevice> consumer) {
        YunMemberUserDeviceQueryWrapper queryWrapper = YunMemberUserDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumerByWrapper(int pageSize, Consumer<YunMemberUserDeviceQueryWrapper> wrapperConsumer, Consumer<YunMemberUserDevice> consumer) {
        YunMemberUserDeviceQueryWrapper queryWrapper = YunMemberUserDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(QueryWrapper<YunMemberUserDevice> queryWrapper, Consumer<YunMemberUserDevice> consumer) {
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(int pageSize, QueryWrapper<YunMemberUserDevice> queryWrapper, Consumer<YunMemberUserDevice> consumer) {
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(Function<Page<YunMemberUserDevice>, Page<YunMemberUserDevice>> consumerSupplier, Consumer<YunMemberUserDevice> consumer) {
        pageConsumer(1000, consumerSupplier, consumer);
    }

    default public void pageConsumer(int pageSize, Function<Page<YunMemberUserDevice>, Page<YunMemberUserDevice>> consumerSupplier, Consumer<YunMemberUserDevice> consumer) {
        Page<YunMemberUserDevice> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<YunMemberUserDevice> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    for (YunMemberUserDevice t : result) {
                        consumer.accept(t);
                    }
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public void pageConsumersByWrapper(Consumer<YunMemberUserDeviceQueryWrapper> wrapperConsumer, Consumer<List<YunMemberUserDevice>> consumerList) {
        YunMemberUserDeviceQueryWrapper queryWrapper = YunMemberUserDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumersByWrapper(int pageSize, Consumer<YunMemberUserDeviceQueryWrapper> wrapperConsumer, Consumer<List<YunMemberUserDevice>> consumerList) {
        YunMemberUserDeviceQueryWrapper queryWrapper = YunMemberUserDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(QueryWrapper<YunMemberUserDevice> queryWrapper, Consumer<List<YunMemberUserDevice>> consumerList) {
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(int pageSize, QueryWrapper<YunMemberUserDevice> queryWrapper, Consumer<List<YunMemberUserDevice>> consumerList) {
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(Function<Page<YunMemberUserDevice>, Page<YunMemberUserDevice>> consumerSupplier, Consumer<List<YunMemberUserDevice>> consumerList) {
        pageConsumers(1000, consumerSupplier, consumerList);
    }

    default public void pageConsumers(int pageSize, Function<Page<YunMemberUserDevice>, Page<YunMemberUserDevice>> consumerSupplier, Consumer<List<YunMemberUserDevice>> consumerList) {
        Page<YunMemberUserDevice> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<YunMemberUserDevice> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    consumerList.accept(result);
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public boolean queryAndUpdateById(QueryWrapper<YunMemberUserDevice> wrapper, YunMemberUserDevice up) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<YunMemberUserDevice> wrapper, YunMemberUserDevice up) {
        return queryAndUpdateById(pageSize, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<YunMemberUserDevice> wrapper, YunMemberUserDevice up, BiPredicate<YunMemberUserDevice, YunMemberUserDevice> updateFilter) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<YunMemberUserDevice> wrapper, YunMemberUserDevice up, BiPredicate<YunMemberUserDevice, YunMemberUserDevice> updateFilter) {
        return queryAndUpdateById(pageSize, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<YunMemberUserDevice> wrapper, YunMemberUserDevice up, BiConsumer<YunMemberUserDevice, YunMemberUserDeviceUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, whereSet);
    }

    default public boolean queryAndUpdateById(QueryWrapper<YunMemberUserDevice> wrapper, YunMemberUserDevice up, BiPredicate<YunMemberUserDevice, YunMemberUserDevice> updateFilter, BiConsumer<YunMemberUserDevice, YunMemberUserDeviceUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, whereSet);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<YunMemberUserDevice> wrapper, YunMemberUserDevice up, BiPredicate<YunMemberUserDevice, YunMemberUserDevice> updateFilter, BiConsumer<YunMemberUserDevice, YunMemberUserDeviceUpdateWrapper> whereSet) {
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

    default public boolean removeByIds(Consumer<YunMemberUserDeviceQueryWrapper> wrapper) {
        return removeByIds(1000, wrapper);
    }

    default public boolean removeByIds(int pageSize, Consumer<YunMemberUserDeviceQueryWrapper> wrapper) {
        YunMemberUserDeviceQueryWrapper removeWrapper = YunMemberUserDeviceQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return removeByIds(pageSize, removeWrapper);
    }

    default public boolean removeByIds(YunMemberUserDeviceQueryWrapper removeWrapper) {
        return removeByIds(1000, removeWrapper);
    }

    default public boolean removeByIds(int pageSize, YunMemberUserDeviceQueryWrapper removeWrapper) {
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
