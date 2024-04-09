package com.suqi.center.machine.dao.viz.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.suqi.center.machine.dao.viz.dto.McUpdateDeviceTaskTenantListDto;
import com.suqi.center.machine.dao.viz.entity.McUpdateDeviceTaskTenant;
import com.suqi.center.machine.dao.viz.vo.McUpdateDeviceTaskTenantListVo;
import com.suqi.center.machine.dao.viz.wrapper.McUpdateDeviceTaskTenantQueryWrapper;
import com.suqi.center.machine.dao.viz.wrapper.McUpdateDeviceTaskTenantUpdateWrapper;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * <p>
 * 租户更新机器任务表 服务类
 * </p>
 *
 * @author 18374
 * @since 2023-08-16
 */
public interface IMcUpdateDeviceTaskTenantService extends IService<McUpdateDeviceTaskTenant> {

    Page<McUpdateDeviceTaskTenantListVo> listPage(McUpdateDeviceTaskTenantListDto param);

    default long count(Consumer<McUpdateDeviceTaskTenantQueryWrapper> wrapperConsumer) {
        McUpdateDeviceTaskTenantQueryWrapper queryWrapper = McUpdateDeviceTaskTenantQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return count(queryWrapper);
    }

    default public McUpdateDeviceTaskTenant selectOne(Consumer<McUpdateDeviceTaskTenantQueryWrapper> wrapperConsumer) {
        McUpdateDeviceTaskTenantQueryWrapper queryWrapper = McUpdateDeviceTaskTenantQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        queryWrapper.last(" limit 1 ");
        return getOne(queryWrapper, false);
    }

    default public List<McUpdateDeviceTaskTenant> select(Consumer<McUpdateDeviceTaskTenantQueryWrapper> wrapperConsumer) {
        McUpdateDeviceTaskTenantQueryWrapper queryWrapper = McUpdateDeviceTaskTenantQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public List<McUpdateDeviceTaskTenant> list(Consumer<McUpdateDeviceTaskTenantQueryWrapper> wrapperConsumer) {
        McUpdateDeviceTaskTenantQueryWrapper queryWrapper = McUpdateDeviceTaskTenantQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public boolean update(Consumer<McUpdateDeviceTaskTenantUpdateWrapper> wrapper) {
        McUpdateDeviceTaskTenantUpdateWrapper updateWrapper = McUpdateDeviceTaskTenantUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(updateWrapper);
    }

    default public boolean update(McUpdateDeviceTaskTenant up, Consumer<McUpdateDeviceTaskTenantUpdateWrapper> wrapper) {
        McUpdateDeviceTaskTenantUpdateWrapper updateWrapper = McUpdateDeviceTaskTenantUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean update(Consumer<McUpdateDeviceTaskTenant> setUp, Consumer<McUpdateDeviceTaskTenantUpdateWrapper> wrapper) {
        McUpdateDeviceTaskTenant up = new McUpdateDeviceTaskTenant();
        setUp.accept(up);
        McUpdateDeviceTaskTenantUpdateWrapper updateWrapper = McUpdateDeviceTaskTenantUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean remove(Consumer<McUpdateDeviceTaskTenantQueryWrapper> wrapper) {
        McUpdateDeviceTaskTenantQueryWrapper removeWrapper = McUpdateDeviceTaskTenantQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return remove(removeWrapper);
    }

    default public Page<McUpdateDeviceTaskTenant> page(Page<McUpdateDeviceTaskTenant> page, Consumer<McUpdateDeviceTaskTenantQueryWrapper> wrapperConsumer) {
        McUpdateDeviceTaskTenantQueryWrapper queryWrapper = McUpdateDeviceTaskTenantQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default Page<McUpdateDeviceTaskTenant> quickPageById(Page<McUpdateDeviceTaskTenant> page, long lastId, QueryWrapper<McUpdateDeviceTaskTenant> wrapper) {
        return quickPageById(true, page, lastId, wrapper);
    }

    default Page<McUpdateDeviceTaskTenant> quickPageById(Page<McUpdateDeviceTaskTenant> page, long lastId, Consumer<McUpdateDeviceTaskTenantQueryWrapper> wrapperConsumer) {
        McUpdateDeviceTaskTenantQueryWrapper queryWrapper = McUpdateDeviceTaskTenantQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPageById(true, page, lastId, queryWrapper);
    }

    default Page<McUpdateDeviceTaskTenant> quickPageById(boolean queryTotals, Page<McUpdateDeviceTaskTenant> page, long lastId, QueryWrapper<McUpdateDeviceTaskTenant> wrapper) {
        return page(page, wrapper);
    }

    default Page<McUpdateDeviceTaskTenant> quickPage(Page<McUpdateDeviceTaskTenant> page, QueryWrapper<McUpdateDeviceTaskTenant> wrapper) {
        return IService.super.page(page, wrapper);
    }

    default Page<McUpdateDeviceTaskTenant> page(Page<McUpdateDeviceTaskTenant> page, QueryWrapper<McUpdateDeviceTaskTenant> wrapper) {
        return quickPage(page, wrapper);
    }

    default Page<McUpdateDeviceTaskTenant> quickPage(Page<McUpdateDeviceTaskTenant> page, Consumer<McUpdateDeviceTaskTenantQueryWrapper> wrapperConsumer) {
        McUpdateDeviceTaskTenantQueryWrapper queryWrapper = McUpdateDeviceTaskTenantQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default public void pageConsumerByWrapper(Consumer<McUpdateDeviceTaskTenantQueryWrapper> wrapperConsumer, Consumer<McUpdateDeviceTaskTenant> consumer) {
        McUpdateDeviceTaskTenantQueryWrapper queryWrapper = McUpdateDeviceTaskTenantQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumerByWrapper(int pageSize, Consumer<McUpdateDeviceTaskTenantQueryWrapper> wrapperConsumer, Consumer<McUpdateDeviceTaskTenant> consumer) {
        McUpdateDeviceTaskTenantQueryWrapper queryWrapper = McUpdateDeviceTaskTenantQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(QueryWrapper<McUpdateDeviceTaskTenant> queryWrapper, Consumer<McUpdateDeviceTaskTenant> consumer) {
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(int pageSize, QueryWrapper<McUpdateDeviceTaskTenant> queryWrapper, Consumer<McUpdateDeviceTaskTenant> consumer) {
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(Function<Page<McUpdateDeviceTaskTenant>, Page<McUpdateDeviceTaskTenant>> consumerSupplier, Consumer<McUpdateDeviceTaskTenant> consumer) {
        pageConsumer(1000, consumerSupplier, consumer);
    }

    default public void pageConsumer(int pageSize, Function<Page<McUpdateDeviceTaskTenant>, Page<McUpdateDeviceTaskTenant>> consumerSupplier, Consumer<McUpdateDeviceTaskTenant> consumer) {
        Page<McUpdateDeviceTaskTenant> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<McUpdateDeviceTaskTenant> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    for (McUpdateDeviceTaskTenant t : result) {
                        consumer.accept(t);
                    }
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public void pageConsumersByWrapper(Consumer<McUpdateDeviceTaskTenantQueryWrapper> wrapperConsumer, Consumer<List<McUpdateDeviceTaskTenant>> consumerList) {
        McUpdateDeviceTaskTenantQueryWrapper queryWrapper = McUpdateDeviceTaskTenantQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumersByWrapper(int pageSize, Consumer<McUpdateDeviceTaskTenantQueryWrapper> wrapperConsumer, Consumer<List<McUpdateDeviceTaskTenant>> consumerList) {
        McUpdateDeviceTaskTenantQueryWrapper queryWrapper = McUpdateDeviceTaskTenantQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(QueryWrapper<McUpdateDeviceTaskTenant> queryWrapper, Consumer<List<McUpdateDeviceTaskTenant>> consumerList) {
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(int pageSize, QueryWrapper<McUpdateDeviceTaskTenant> queryWrapper, Consumer<List<McUpdateDeviceTaskTenant>> consumerList) {
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(Function<Page<McUpdateDeviceTaskTenant>, Page<McUpdateDeviceTaskTenant>> consumerSupplier, Consumer<List<McUpdateDeviceTaskTenant>> consumerList) {
        pageConsumers(1000, consumerSupplier, consumerList);
    }

    default public void pageConsumers(int pageSize, Function<Page<McUpdateDeviceTaskTenant>, Page<McUpdateDeviceTaskTenant>> consumerSupplier, Consumer<List<McUpdateDeviceTaskTenant>> consumerList) {
        Page<McUpdateDeviceTaskTenant> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<McUpdateDeviceTaskTenant> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    consumerList.accept(result);
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public boolean queryAndUpdateById(QueryWrapper<McUpdateDeviceTaskTenant> wrapper, McUpdateDeviceTaskTenant up) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<McUpdateDeviceTaskTenant> wrapper, McUpdateDeviceTaskTenant up) {
        return queryAndUpdateById(pageSize, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<McUpdateDeviceTaskTenant> wrapper, McUpdateDeviceTaskTenant up, BiPredicate<McUpdateDeviceTaskTenant, McUpdateDeviceTaskTenant> updateFilter) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<McUpdateDeviceTaskTenant> wrapper, McUpdateDeviceTaskTenant up, BiPredicate<McUpdateDeviceTaskTenant, McUpdateDeviceTaskTenant> updateFilter) {
        return queryAndUpdateById(pageSize, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<McUpdateDeviceTaskTenant> wrapper, McUpdateDeviceTaskTenant up, BiConsumer<McUpdateDeviceTaskTenant, McUpdateDeviceTaskTenantUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, whereSet);
    }

    default public boolean queryAndUpdateById(QueryWrapper<McUpdateDeviceTaskTenant> wrapper, McUpdateDeviceTaskTenant up, BiPredicate<McUpdateDeviceTaskTenant, McUpdateDeviceTaskTenant> updateFilter, BiConsumer<McUpdateDeviceTaskTenant, McUpdateDeviceTaskTenantUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, whereSet);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<McUpdateDeviceTaskTenant> wrapper, McUpdateDeviceTaskTenant up, BiPredicate<McUpdateDeviceTaskTenant, McUpdateDeviceTaskTenant> updateFilter, BiConsumer<McUpdateDeviceTaskTenant, McUpdateDeviceTaskTenantUpdateWrapper> whereSet) {
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

    default public boolean removeByIds(Consumer<McUpdateDeviceTaskTenantQueryWrapper> wrapper) {
        return removeByIds(1000, wrapper);
    }

    default public boolean removeByIds(int pageSize, Consumer<McUpdateDeviceTaskTenantQueryWrapper> wrapper) {
        McUpdateDeviceTaskTenantQueryWrapper removeWrapper = McUpdateDeviceTaskTenantQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return removeByIds(pageSize, removeWrapper);
    }

    default public boolean removeByIds(McUpdateDeviceTaskTenantQueryWrapper removeWrapper) {
        return removeByIds(1000, removeWrapper);
    }

    default public boolean removeByIds(int pageSize, McUpdateDeviceTaskTenantQueryWrapper removeWrapper) {
        AtomicBoolean rs = new AtomicBoolean(false);
        pageConsumer(pageSize, removeWrapper, t -> {
            boolean r = removeById(t.getId());
            if (r && !rs.get()) {
                rs.set(r);
            }
        });
        return rs.get();
    }

    Boolean checkTaskRepeat (Long fkTenantId, Long fkMcUpdateDeviceTaskId);

}
