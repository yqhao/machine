package com.suqi.center.machine.dao.service;

import com.suqi.center.machine.dao.entity.YunMemberHangUp;
import com.suqi.center.machine.dao.wrapper.YunMemberHangUpQueryWrapper;
import com.suqi.center.machine.dao.wrapper.YunMemberHangUpUpdateWrapper;
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
 * 商户挂机时长表 服务类
 * </p>
 *
 * @author PC001
 * @since 2023-08-29
 */
public interface IYunMemberHangUpService extends IService<YunMemberHangUp> {

    default long count(Consumer<YunMemberHangUpQueryWrapper> wrapperConsumer) {
        YunMemberHangUpQueryWrapper queryWrapper = YunMemberHangUpQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return count(queryWrapper);
    }

    default public YunMemberHangUp selectOne(Consumer<YunMemberHangUpQueryWrapper> wrapperConsumer) {
        YunMemberHangUpQueryWrapper queryWrapper = YunMemberHangUpQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        queryWrapper.last(" limit 1 ");
        return getOne(queryWrapper, false);
    }

    default public List<YunMemberHangUp> select(Consumer<YunMemberHangUpQueryWrapper> wrapperConsumer) {
        YunMemberHangUpQueryWrapper queryWrapper = YunMemberHangUpQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public List<YunMemberHangUp> list(Consumer<YunMemberHangUpQueryWrapper> wrapperConsumer) {
        YunMemberHangUpQueryWrapper queryWrapper = YunMemberHangUpQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public boolean update(Consumer<YunMemberHangUpUpdateWrapper> wrapper) {
        YunMemberHangUpUpdateWrapper updateWrapper = YunMemberHangUpUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(updateWrapper);
    }

    default public boolean update(YunMemberHangUp up, Consumer<YunMemberHangUpUpdateWrapper> wrapper) {
        YunMemberHangUpUpdateWrapper updateWrapper = YunMemberHangUpUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean update(Consumer<YunMemberHangUp> setUp, Consumer<YunMemberHangUpUpdateWrapper> wrapper) {
        YunMemberHangUp up = new YunMemberHangUp();
        setUp.accept(up);
        YunMemberHangUpUpdateWrapper updateWrapper = YunMemberHangUpUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean remove(Consumer<YunMemberHangUpQueryWrapper> wrapper) {
        YunMemberHangUpQueryWrapper removeWrapper = YunMemberHangUpQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return remove(removeWrapper);
    }

    default public Page<YunMemberHangUp> page(Page<YunMemberHangUp> page, Consumer<YunMemberHangUpQueryWrapper> wrapperConsumer) {
        YunMemberHangUpQueryWrapper queryWrapper = YunMemberHangUpQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default Page<YunMemberHangUp> quickPageById(Page<YunMemberHangUp> page, long lastId, QueryWrapper<YunMemberHangUp> wrapper) {
        return quickPageById(true, page, lastId, wrapper);
    }

    default Page<YunMemberHangUp> quickPageById(Page<YunMemberHangUp> page, long lastId, Consumer<YunMemberHangUpQueryWrapper> wrapperConsumer) {
        YunMemberHangUpQueryWrapper queryWrapper = YunMemberHangUpQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPageById(true, page, lastId, queryWrapper);
    }

    default Page<YunMemberHangUp> quickPageById(boolean queryTotals, Page<YunMemberHangUp> page, long lastId, QueryWrapper<YunMemberHangUp> wrapper) {
        return page(page, wrapper);
    }

    default Page<YunMemberHangUp> quickPage(Page<YunMemberHangUp> page, QueryWrapper<YunMemberHangUp> wrapper) {
        return IService.super.page(page, wrapper);
    }

    default Page<YunMemberHangUp> page(Page<YunMemberHangUp> page, QueryWrapper<YunMemberHangUp> wrapper) {
        return quickPage(page, wrapper);
    }

    default Page<YunMemberHangUp> quickPage(Page<YunMemberHangUp> page, Consumer<YunMemberHangUpQueryWrapper> wrapperConsumer) {
        YunMemberHangUpQueryWrapper queryWrapper = YunMemberHangUpQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default public void pageConsumerByWrapper(Consumer<YunMemberHangUpQueryWrapper> wrapperConsumer, Consumer<YunMemberHangUp> consumer) {
        YunMemberHangUpQueryWrapper queryWrapper = YunMemberHangUpQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumerByWrapper(int pageSize, Consumer<YunMemberHangUpQueryWrapper> wrapperConsumer, Consumer<YunMemberHangUp> consumer) {
        YunMemberHangUpQueryWrapper queryWrapper = YunMemberHangUpQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(QueryWrapper<YunMemberHangUp> queryWrapper, Consumer<YunMemberHangUp> consumer) {
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(int pageSize, QueryWrapper<YunMemberHangUp> queryWrapper, Consumer<YunMemberHangUp> consumer) {
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(Function<Page<YunMemberHangUp>, Page<YunMemberHangUp>> consumerSupplier, Consumer<YunMemberHangUp> consumer) {
        pageConsumer(1000, consumerSupplier, consumer);
    }

    default public void pageConsumer(int pageSize, Function<Page<YunMemberHangUp>, Page<YunMemberHangUp>> consumerSupplier, Consumer<YunMemberHangUp> consumer) {
        Page<YunMemberHangUp> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<YunMemberHangUp> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    for (YunMemberHangUp t : result) {
                        consumer.accept(t);
                    }
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public void pageConsumersByWrapper(Consumer<YunMemberHangUpQueryWrapper> wrapperConsumer, Consumer<List<YunMemberHangUp>> consumerList) {
        YunMemberHangUpQueryWrapper queryWrapper = YunMemberHangUpQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumersByWrapper(int pageSize, Consumer<YunMemberHangUpQueryWrapper> wrapperConsumer, Consumer<List<YunMemberHangUp>> consumerList) {
        YunMemberHangUpQueryWrapper queryWrapper = YunMemberHangUpQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(QueryWrapper<YunMemberHangUp> queryWrapper, Consumer<List<YunMemberHangUp>> consumerList) {
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(int pageSize, QueryWrapper<YunMemberHangUp> queryWrapper, Consumer<List<YunMemberHangUp>> consumerList) {
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(Function<Page<YunMemberHangUp>, Page<YunMemberHangUp>> consumerSupplier, Consumer<List<YunMemberHangUp>> consumerList) {
        pageConsumers(1000, consumerSupplier, consumerList);
    }

    default public void pageConsumers(int pageSize, Function<Page<YunMemberHangUp>, Page<YunMemberHangUp>> consumerSupplier, Consumer<List<YunMemberHangUp>> consumerList) {
        Page<YunMemberHangUp> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<YunMemberHangUp> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    consumerList.accept(result);
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public boolean queryAndUpdateById(QueryWrapper<YunMemberHangUp> wrapper, YunMemberHangUp up) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<YunMemberHangUp> wrapper, YunMemberHangUp up) {
        return queryAndUpdateById(pageSize, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<YunMemberHangUp> wrapper, YunMemberHangUp up, BiPredicate<YunMemberHangUp, YunMemberHangUp> updateFilter) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<YunMemberHangUp> wrapper, YunMemberHangUp up, BiPredicate<YunMemberHangUp, YunMemberHangUp> updateFilter) {
        return queryAndUpdateById(pageSize, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<YunMemberHangUp> wrapper, YunMemberHangUp up, BiConsumer<YunMemberHangUp, YunMemberHangUpUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, whereSet);
    }

    default public boolean queryAndUpdateById(QueryWrapper<YunMemberHangUp> wrapper, YunMemberHangUp up, BiPredicate<YunMemberHangUp, YunMemberHangUp> updateFilter, BiConsumer<YunMemberHangUp, YunMemberHangUpUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, whereSet);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<YunMemberHangUp> wrapper, YunMemberHangUp up, BiPredicate<YunMemberHangUp, YunMemberHangUp> updateFilter, BiConsumer<YunMemberHangUp, YunMemberHangUpUpdateWrapper> whereSet) {
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

    default public boolean removeByIds(Consumer<YunMemberHangUpQueryWrapper> wrapper) {
        return removeByIds(1000, wrapper);
    }

    default public boolean removeByIds(int pageSize, Consumer<YunMemberHangUpQueryWrapper> wrapper) {
        YunMemberHangUpQueryWrapper removeWrapper = YunMemberHangUpQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return removeByIds(pageSize, removeWrapper);
    }

    default public boolean removeByIds(YunMemberHangUpQueryWrapper removeWrapper) {
        return removeByIds(1000, removeWrapper);
    }

    default public boolean removeByIds(int pageSize, YunMemberHangUpQueryWrapper removeWrapper) {
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
