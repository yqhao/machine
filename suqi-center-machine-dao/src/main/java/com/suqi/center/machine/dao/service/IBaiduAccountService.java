package com.suqi.center.machine.dao.service;

import com.suqi.center.machine.dao.entity.BaiduAccount;
import com.suqi.center.machine.dao.wrapper.BaiduAccountQueryWrapper;
import com.suqi.center.machine.dao.wrapper.BaiduAccountUpdateWrapper;
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
 * 百度账号表 服务类
 * </p>
 *
 * @author PC001
 * @since 2023-08-25
 */
public interface IBaiduAccountService extends IService<BaiduAccount> {

    default long count(Consumer<BaiduAccountQueryWrapper> wrapperConsumer) {
        BaiduAccountQueryWrapper queryWrapper = BaiduAccountQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return count(queryWrapper);
    }

    default public BaiduAccount selectOne(Consumer<BaiduAccountQueryWrapper> wrapperConsumer) {
        BaiduAccountQueryWrapper queryWrapper = BaiduAccountQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        queryWrapper.last(" limit 1 ");
        return getOne(queryWrapper, false);
    }

    default public List<BaiduAccount> select(Consumer<BaiduAccountQueryWrapper> wrapperConsumer) {
        BaiduAccountQueryWrapper queryWrapper = BaiduAccountQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public List<BaiduAccount> list(Consumer<BaiduAccountQueryWrapper> wrapperConsumer) {
        BaiduAccountQueryWrapper queryWrapper = BaiduAccountQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public boolean update(Consumer<BaiduAccountUpdateWrapper> wrapper) {
        BaiduAccountUpdateWrapper updateWrapper = BaiduAccountUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(updateWrapper);
    }

    default public boolean update(BaiduAccount up, Consumer<BaiduAccountUpdateWrapper> wrapper) {
        BaiduAccountUpdateWrapper updateWrapper = BaiduAccountUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean update(Consumer<BaiduAccount> setUp, Consumer<BaiduAccountUpdateWrapper> wrapper) {
        BaiduAccount up = new BaiduAccount();
        setUp.accept(up);
        BaiduAccountUpdateWrapper updateWrapper = BaiduAccountUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean remove(Consumer<BaiduAccountQueryWrapper> wrapper) {
        BaiduAccountQueryWrapper removeWrapper = BaiduAccountQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return remove(removeWrapper);
    }

    default public Page<BaiduAccount> page(Page<BaiduAccount> page, Consumer<BaiduAccountQueryWrapper> wrapperConsumer) {
        BaiduAccountQueryWrapper queryWrapper = BaiduAccountQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default Page<BaiduAccount> quickPageById(Page<BaiduAccount> page, long lastId, QueryWrapper<BaiduAccount> wrapper) {
        return quickPageById(true, page, lastId, wrapper);
    }

    default Page<BaiduAccount> quickPageById(Page<BaiduAccount> page, long lastId, Consumer<BaiduAccountQueryWrapper> wrapperConsumer) {
        BaiduAccountQueryWrapper queryWrapper = BaiduAccountQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPageById(true, page, lastId, queryWrapper);
    }

    default Page<BaiduAccount> quickPageById(boolean queryTotals, Page<BaiduAccount> page, long lastId, QueryWrapper<BaiduAccount> wrapper) {
        return page(page, wrapper);
    }

    default Page<BaiduAccount> quickPage(Page<BaiduAccount> page, QueryWrapper<BaiduAccount> wrapper) {
        return IService.super.page(page, wrapper);
    }

    default Page<BaiduAccount> page(Page<BaiduAccount> page, QueryWrapper<BaiduAccount> wrapper) {
        return quickPage(page, wrapper);
    }

    default Page<BaiduAccount> quickPage(Page<BaiduAccount> page, Consumer<BaiduAccountQueryWrapper> wrapperConsumer) {
        BaiduAccountQueryWrapper queryWrapper = BaiduAccountQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default public void pageConsumerByWrapper(Consumer<BaiduAccountQueryWrapper> wrapperConsumer, Consumer<BaiduAccount> consumer) {
        BaiduAccountQueryWrapper queryWrapper = BaiduAccountQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumerByWrapper(int pageSize, Consumer<BaiduAccountQueryWrapper> wrapperConsumer, Consumer<BaiduAccount> consumer) {
        BaiduAccountQueryWrapper queryWrapper = BaiduAccountQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(QueryWrapper<BaiduAccount> queryWrapper, Consumer<BaiduAccount> consumer) {
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(int pageSize, QueryWrapper<BaiduAccount> queryWrapper, Consumer<BaiduAccount> consumer) {
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(Function<Page<BaiduAccount>, Page<BaiduAccount>> consumerSupplier, Consumer<BaiduAccount> consumer) {
        pageConsumer(1000, consumerSupplier, consumer);
    }

    default public void pageConsumer(int pageSize, Function<Page<BaiduAccount>, Page<BaiduAccount>> consumerSupplier, Consumer<BaiduAccount> consumer) {
        Page<BaiduAccount> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<BaiduAccount> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    for (BaiduAccount t : result) {
                        consumer.accept(t);
                    }
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public void pageConsumersByWrapper(Consumer<BaiduAccountQueryWrapper> wrapperConsumer, Consumer<List<BaiduAccount>> consumerList) {
        BaiduAccountQueryWrapper queryWrapper = BaiduAccountQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumersByWrapper(int pageSize, Consumer<BaiduAccountQueryWrapper> wrapperConsumer, Consumer<List<BaiduAccount>> consumerList) {
        BaiduAccountQueryWrapper queryWrapper = BaiduAccountQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(QueryWrapper<BaiduAccount> queryWrapper, Consumer<List<BaiduAccount>> consumerList) {
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(int pageSize, QueryWrapper<BaiduAccount> queryWrapper, Consumer<List<BaiduAccount>> consumerList) {
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(Function<Page<BaiduAccount>, Page<BaiduAccount>> consumerSupplier, Consumer<List<BaiduAccount>> consumerList) {
        pageConsumers(1000, consumerSupplier, consumerList);
    }

    default public void pageConsumers(int pageSize, Function<Page<BaiduAccount>, Page<BaiduAccount>> consumerSupplier, Consumer<List<BaiduAccount>> consumerList) {
        Page<BaiduAccount> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<BaiduAccount> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    consumerList.accept(result);
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public boolean queryAndUpdateById(QueryWrapper<BaiduAccount> wrapper, BaiduAccount up) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<BaiduAccount> wrapper, BaiduAccount up) {
        return queryAndUpdateById(pageSize, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<BaiduAccount> wrapper, BaiduAccount up, BiPredicate<BaiduAccount, BaiduAccount> updateFilter) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<BaiduAccount> wrapper, BaiduAccount up, BiPredicate<BaiduAccount, BaiduAccount> updateFilter) {
        return queryAndUpdateById(pageSize, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<BaiduAccount> wrapper, BaiduAccount up, BiConsumer<BaiduAccount, BaiduAccountUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, whereSet);
    }

    default public boolean queryAndUpdateById(QueryWrapper<BaiduAccount> wrapper, BaiduAccount up, BiPredicate<BaiduAccount, BaiduAccount> updateFilter, BiConsumer<BaiduAccount, BaiduAccountUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, whereSet);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<BaiduAccount> wrapper, BaiduAccount up, BiPredicate<BaiduAccount, BaiduAccount> updateFilter, BiConsumer<BaiduAccount, BaiduAccountUpdateWrapper> whereSet) {
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

    default public boolean removeByIds(Consumer<BaiduAccountQueryWrapper> wrapper) {
        return removeByIds(1000, wrapper);
    }

    default public boolean removeByIds(int pageSize, Consumer<BaiduAccountQueryWrapper> wrapper) {
        BaiduAccountQueryWrapper removeWrapper = BaiduAccountQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return removeByIds(pageSize, removeWrapper);
    }

    default public boolean removeByIds(BaiduAccountQueryWrapper removeWrapper) {
        return removeByIds(1000, removeWrapper);
    }

    default public boolean removeByIds(int pageSize, BaiduAccountQueryWrapper removeWrapper) {
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
