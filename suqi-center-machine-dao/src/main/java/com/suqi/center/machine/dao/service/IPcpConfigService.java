package com.suqi.center.machine.dao.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.suqi.center.machine.dao.entity.PcpConfig;
import com.suqi.center.machine.dao.wrapper.PcpConfigQueryWrapper;
import com.suqi.center.machine.dao.wrapper.PcpConfigUpdateWrapper;
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
 * 华为云配置表 服务类
 * </p>
 *
 * @author PC001
 * @since 2023-05-08
 */
public interface IPcpConfigService extends IService<PcpConfig> {

    /**
     * 根据项目iD获取对应关系
     * @param projectId
     * @return
     */
    PcpConfig getPcpConfigByProjectId(String projectId);

    default long count(Consumer<PcpConfigQueryWrapper> wrapperConsumer) {
        PcpConfigQueryWrapper queryWrapper = PcpConfigQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return count(queryWrapper);
    }

    default public PcpConfig selectOne(Consumer<PcpConfigQueryWrapper> wrapperConsumer) {
        PcpConfigQueryWrapper queryWrapper = PcpConfigQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        queryWrapper.last(" limit 1 ");
        return getOne(queryWrapper, false);
    }

    default public List<PcpConfig> select(Consumer<PcpConfigQueryWrapper> wrapperConsumer) {
        PcpConfigQueryWrapper queryWrapper = PcpConfigQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public List<PcpConfig> list(Consumer<PcpConfigQueryWrapper> wrapperConsumer) {
        PcpConfigQueryWrapper queryWrapper = PcpConfigQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public boolean update(Consumer<PcpConfigUpdateWrapper> wrapper) {
        PcpConfigUpdateWrapper updateWrapper = PcpConfigUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(updateWrapper);
    }

    default public boolean update(PcpConfig up, Consumer<PcpConfigUpdateWrapper> wrapper) {
        PcpConfigUpdateWrapper updateWrapper = PcpConfigUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean update(Consumer<PcpConfig> setUp, Consumer<PcpConfigUpdateWrapper> wrapper) {
        PcpConfig up = new PcpConfig();
        setUp.accept(up);
        PcpConfigUpdateWrapper updateWrapper = PcpConfigUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean remove(Consumer<PcpConfigQueryWrapper> wrapper) {
        PcpConfigQueryWrapper removeWrapper = PcpConfigQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return remove(removeWrapper);
    }

    default public Page<PcpConfig> page(Page<PcpConfig> page, Consumer<PcpConfigQueryWrapper> wrapperConsumer) {
        PcpConfigQueryWrapper queryWrapper = PcpConfigQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default Page<PcpConfig> quickPageById(Page<PcpConfig> page, long lastId, QueryWrapper<PcpConfig> wrapper) {
        return quickPageById(true, page, lastId, wrapper);
    }

    default Page<PcpConfig> quickPageById(Page<PcpConfig> page, long lastId, Consumer<PcpConfigQueryWrapper> wrapperConsumer) {
        PcpConfigQueryWrapper queryWrapper = PcpConfigQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPageById(true, page, lastId, queryWrapper);
    }

    default Page<PcpConfig> quickPageById(boolean queryTotals, Page<PcpConfig> page, long lastId, QueryWrapper<PcpConfig> wrapper) {
        return page(page, wrapper);
    }

    default Page<PcpConfig> quickPage(Page<PcpConfig> page, QueryWrapper<PcpConfig> wrapper) {
        return IService.super.page(page, wrapper);
    }

    default Page<PcpConfig> page(Page<PcpConfig> page, QueryWrapper<PcpConfig> wrapper) {
        return quickPage(page, wrapper);
    }

    default Page<PcpConfig> quickPage(Page<PcpConfig> page, Consumer<PcpConfigQueryWrapper> wrapperConsumer) {
        PcpConfigQueryWrapper queryWrapper = PcpConfigQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default public void pageConsumerByWrapper(Consumer<PcpConfigQueryWrapper> wrapperConsumer, Consumer<PcpConfig> consumer) {
        PcpConfigQueryWrapper queryWrapper = PcpConfigQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumerByWrapper(int pageSize, Consumer<PcpConfigQueryWrapper> wrapperConsumer, Consumer<PcpConfig> consumer) {
        PcpConfigQueryWrapper queryWrapper = PcpConfigQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(QueryWrapper<PcpConfig> queryWrapper, Consumer<PcpConfig> consumer) {
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(int pageSize, QueryWrapper<PcpConfig> queryWrapper, Consumer<PcpConfig> consumer) {
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(Function<Page<PcpConfig>, Page<PcpConfig>> consumerSupplier, Consumer<PcpConfig> consumer) {
        pageConsumer(1000, consumerSupplier, consumer);
    }

    default public void pageConsumer(int pageSize, Function<Page<PcpConfig>, Page<PcpConfig>> consumerSupplier, Consumer<PcpConfig> consumer) {
        Page<PcpConfig> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<PcpConfig> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    for (PcpConfig t : result) {
                        consumer.accept(t);
                    }
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public void pageConsumersByWrapper(Consumer<PcpConfigQueryWrapper> wrapperConsumer, Consumer<List<PcpConfig>> consumerList) {
        PcpConfigQueryWrapper queryWrapper = PcpConfigQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumersByWrapper(int pageSize, Consumer<PcpConfigQueryWrapper> wrapperConsumer, Consumer<List<PcpConfig>> consumerList) {
        PcpConfigQueryWrapper queryWrapper = PcpConfigQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(QueryWrapper<PcpConfig> queryWrapper, Consumer<List<PcpConfig>> consumerList) {
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(int pageSize, QueryWrapper<PcpConfig> queryWrapper, Consumer<List<PcpConfig>> consumerList) {
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(Function<Page<PcpConfig>, Page<PcpConfig>> consumerSupplier, Consumer<List<PcpConfig>> consumerList) {
        pageConsumers(1000, consumerSupplier, consumerList);
    }

    default public void pageConsumers(int pageSize, Function<Page<PcpConfig>, Page<PcpConfig>> consumerSupplier, Consumer<List<PcpConfig>> consumerList) {
        Page<PcpConfig> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<PcpConfig> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    consumerList.accept(result);
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public boolean queryAndUpdateById(QueryWrapper<PcpConfig> wrapper, PcpConfig up) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<PcpConfig> wrapper, PcpConfig up) {
        return queryAndUpdateById(pageSize, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<PcpConfig> wrapper, PcpConfig up, BiPredicate<PcpConfig, PcpConfig> updateFilter) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<PcpConfig> wrapper, PcpConfig up, BiPredicate<PcpConfig, PcpConfig> updateFilter) {
        return queryAndUpdateById(pageSize, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<PcpConfig> wrapper, PcpConfig up, BiConsumer<PcpConfig, PcpConfigUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, whereSet);
    }

    default public boolean queryAndUpdateById(QueryWrapper<PcpConfig> wrapper, PcpConfig up, BiPredicate<PcpConfig, PcpConfig> updateFilter, BiConsumer<PcpConfig, PcpConfigUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, whereSet);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<PcpConfig> wrapper, PcpConfig up, BiPredicate<PcpConfig, PcpConfig> updateFilter, BiConsumer<PcpConfig, PcpConfigUpdateWrapper> whereSet) {
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

    default public boolean removeByIds(Consumer<PcpConfigQueryWrapper> wrapper) {
        return removeByIds(1000, wrapper);
    }

    default public boolean removeByIds(int pageSize, Consumer<PcpConfigQueryWrapper> wrapper) {
        PcpConfigQueryWrapper removeWrapper = PcpConfigQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return removeByIds(pageSize, removeWrapper);
    }

    default public boolean removeByIds(PcpConfigQueryWrapper removeWrapper) {
        return removeByIds(1000, removeWrapper);
    }

    default public boolean removeByIds(int pageSize, PcpConfigQueryWrapper removeWrapper) {
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
