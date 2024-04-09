package com.suqi.center.machine.dao.service;

import com.suqi.center.machine.dao.entity.DevRoomPlayer;
import com.baomidou.mybatisplus.extension.service.IService;
import com.suqi.center.machine.dao.wrapper.DevRoomPlayerQueryWrapper;
import com.suqi.center.machine.dao.wrapper.DevRoomPlayerUpdateWrapper;
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
 * 设备房间成员记录表（dev_room_player） 服务类
 * </p>
 *
 * @author PC001
 * @since 2022-11-11
 */
public interface IDevRoomPlayerService extends IService<DevRoomPlayer> {

    default long count(Consumer<DevRoomPlayerQueryWrapper> wrapperConsumer) {
        DevRoomPlayerQueryWrapper queryWrapper = DevRoomPlayerQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return count(queryWrapper);
    }

    default public DevRoomPlayer selectOne(Consumer<DevRoomPlayerQueryWrapper> wrapperConsumer) {
        DevRoomPlayerQueryWrapper queryWrapper = DevRoomPlayerQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        queryWrapper.last(" limit 1 ");
        return getOne(queryWrapper, false);
    }

    default public List<DevRoomPlayer> select(Consumer<DevRoomPlayerQueryWrapper> wrapperConsumer) {
        DevRoomPlayerQueryWrapper queryWrapper = DevRoomPlayerQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public List<DevRoomPlayer> list(Consumer<DevRoomPlayerQueryWrapper> wrapperConsumer) {
        DevRoomPlayerQueryWrapper queryWrapper = DevRoomPlayerQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public boolean update(Consumer<DevRoomPlayerUpdateWrapper> wrapper) {
        DevRoomPlayerUpdateWrapper updateWrapper = DevRoomPlayerUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(updateWrapper);
    }

    default public boolean update(DevRoomPlayer up, Consumer<DevRoomPlayerUpdateWrapper> wrapper) {
        DevRoomPlayerUpdateWrapper updateWrapper = DevRoomPlayerUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean update(Consumer<DevRoomPlayer> setUp, Consumer<DevRoomPlayerUpdateWrapper> wrapper) {
        DevRoomPlayer up = new DevRoomPlayer();
        setUp.accept(up);
        DevRoomPlayerUpdateWrapper updateWrapper = DevRoomPlayerUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean remove(Consumer<DevRoomPlayerQueryWrapper> wrapper) {
        DevRoomPlayerQueryWrapper removeWrapper = DevRoomPlayerQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return remove(removeWrapper);
    }

    default public Page<DevRoomPlayer> page(Page<DevRoomPlayer> page, Consumer<DevRoomPlayerQueryWrapper> wrapperConsumer) {
        DevRoomPlayerQueryWrapper queryWrapper = DevRoomPlayerQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default Page<DevRoomPlayer> quickPageById(Page<DevRoomPlayer> page, long lastId, QueryWrapper<DevRoomPlayer> wrapper) {
        return quickPageById(true, page, lastId, wrapper);
    }

    default Page<DevRoomPlayer> quickPageById(Page<DevRoomPlayer> page, long lastId, Consumer<DevRoomPlayerQueryWrapper> wrapperConsumer) {
        DevRoomPlayerQueryWrapper queryWrapper = DevRoomPlayerQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPageById(true, page, lastId, queryWrapper);
    }

    default Page<DevRoomPlayer> quickPageById(boolean queryTotals, Page<DevRoomPlayer> page, long lastId, QueryWrapper<DevRoomPlayer> wrapper) {
        return page(page, wrapper);
    }

    default Page<DevRoomPlayer> quickPage(Page<DevRoomPlayer> page, QueryWrapper<DevRoomPlayer> wrapper) {
        return IService.super.page(page, wrapper);
    }

    default Page<DevRoomPlayer> page(Page<DevRoomPlayer> page, QueryWrapper<DevRoomPlayer> wrapper) {
        return quickPage(page, wrapper);
    }

    default Page<DevRoomPlayer> quickPage(Page<DevRoomPlayer> page, Consumer<DevRoomPlayerQueryWrapper> wrapperConsumer) {
        DevRoomPlayerQueryWrapper queryWrapper = DevRoomPlayerQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default public void pageConsumerByWrapper(Consumer<DevRoomPlayerQueryWrapper> wrapperConsumer, Consumer<DevRoomPlayer> consumer) {
        DevRoomPlayerQueryWrapper queryWrapper = DevRoomPlayerQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumerByWrapper(int pageSize, Consumer<DevRoomPlayerQueryWrapper> wrapperConsumer, Consumer<DevRoomPlayer> consumer) {
        DevRoomPlayerQueryWrapper queryWrapper = DevRoomPlayerQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(QueryWrapper<DevRoomPlayer> queryWrapper, Consumer<DevRoomPlayer> consumer) {
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(int pageSize, QueryWrapper<DevRoomPlayer> queryWrapper, Consumer<DevRoomPlayer> consumer) {
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(Function<Page<DevRoomPlayer>, Page<DevRoomPlayer>> consumerSupplier, Consumer<DevRoomPlayer> consumer) {
        pageConsumer(1000, consumerSupplier, consumer);
    }

    default public void pageConsumer(int pageSize, Function<Page<DevRoomPlayer>, Page<DevRoomPlayer>> consumerSupplier, Consumer<DevRoomPlayer> consumer) {
        Page<DevRoomPlayer> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<DevRoomPlayer> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    for (DevRoomPlayer t : result) {
                        consumer.accept(t);
                    }
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public void pageConsumersByWrapper(Consumer<DevRoomPlayerQueryWrapper> wrapperConsumer, Consumer<List<DevRoomPlayer>> consumerList) {
        DevRoomPlayerQueryWrapper queryWrapper = DevRoomPlayerQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumersByWrapper(int pageSize, Consumer<DevRoomPlayerQueryWrapper> wrapperConsumer, Consumer<List<DevRoomPlayer>> consumerList) {
        DevRoomPlayerQueryWrapper queryWrapper = DevRoomPlayerQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(QueryWrapper<DevRoomPlayer> queryWrapper, Consumer<List<DevRoomPlayer>> consumerList) {
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(int pageSize, QueryWrapper<DevRoomPlayer> queryWrapper, Consumer<List<DevRoomPlayer>> consumerList) {
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(Function<Page<DevRoomPlayer>, Page<DevRoomPlayer>> consumerSupplier, Consumer<List<DevRoomPlayer>> consumerList) {
        pageConsumers(1000, consumerSupplier, consumerList);
    }

    default public void pageConsumers(int pageSize, Function<Page<DevRoomPlayer>, Page<DevRoomPlayer>> consumerSupplier, Consumer<List<DevRoomPlayer>> consumerList) {
        Page<DevRoomPlayer> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<DevRoomPlayer> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    consumerList.accept(result);
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public boolean queryAndUpdateById(QueryWrapper<DevRoomPlayer> wrapper, DevRoomPlayer up) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<DevRoomPlayer> wrapper, DevRoomPlayer up) {
        return queryAndUpdateById(pageSize, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<DevRoomPlayer> wrapper, DevRoomPlayer up, BiPredicate<DevRoomPlayer, DevRoomPlayer> updateFilter) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<DevRoomPlayer> wrapper, DevRoomPlayer up, BiPredicate<DevRoomPlayer, DevRoomPlayer> updateFilter) {
        return queryAndUpdateById(pageSize, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<DevRoomPlayer> wrapper, DevRoomPlayer up, BiConsumer<DevRoomPlayer, DevRoomPlayerUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, whereSet);
    }

    default public boolean queryAndUpdateById(QueryWrapper<DevRoomPlayer> wrapper, DevRoomPlayer up, BiPredicate<DevRoomPlayer, DevRoomPlayer> updateFilter, BiConsumer<DevRoomPlayer, DevRoomPlayerUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, whereSet);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<DevRoomPlayer> wrapper, DevRoomPlayer up, BiPredicate<DevRoomPlayer, DevRoomPlayer> updateFilter, BiConsumer<DevRoomPlayer, DevRoomPlayerUpdateWrapper> whereSet) {
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

    default public boolean removeByIds(Consumer<DevRoomPlayerQueryWrapper> wrapper) {
        return removeByIds(1000, wrapper);
    }

    default public boolean removeByIds(int pageSize, Consumer<DevRoomPlayerQueryWrapper> wrapper) {
        DevRoomPlayerQueryWrapper removeWrapper = DevRoomPlayerQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return removeByIds(pageSize, removeWrapper);
    }

    default public boolean removeByIds(DevRoomPlayerQueryWrapper removeWrapper) {
        return removeByIds(1000, removeWrapper);
    }

    default public boolean removeByIds(int pageSize, DevRoomPlayerQueryWrapper removeWrapper) {
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
