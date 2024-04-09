package com.suqi.center.machine.dao.viz.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.suqi.center.machine.dao.viz.dto.TaskRecordPageDto;
import com.suqi.center.machine.dao.viz.entity.McUpdateDeviceTaskRecord;
import com.suqi.center.machine.dao.vo.TaskRecordPageVo;
import com.suqi.center.machine.dao.viz.wrapper.McUpdateDeviceTaskRecordQueryWrapper;
import com.suqi.center.machine.dao.viz.wrapper.McUpdateDeviceTaskRecordUpdateWrapper;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * <p>
 * 机器更新任务记录表 服务类
 * </p>
 *
 * @author 18374
 * @since 2023-08-14
 */
public interface IMcUpdateDeviceTaskRecordService extends IService<McUpdateDeviceTaskRecord> {

    Page<TaskRecordPageVo> taskRecordPage(TaskRecordPageDto param);

    default long count(Consumer<McUpdateDeviceTaskRecordQueryWrapper> wrapperConsumer) {
        McUpdateDeviceTaskRecordQueryWrapper queryWrapper = McUpdateDeviceTaskRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return count(queryWrapper);
    }

    default public McUpdateDeviceTaskRecord selectOne(Consumer<McUpdateDeviceTaskRecordQueryWrapper> wrapperConsumer) {
        McUpdateDeviceTaskRecordQueryWrapper queryWrapper = McUpdateDeviceTaskRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        queryWrapper.last(" limit 1 ");
        return getOne(queryWrapper, false);
    }

    default public List<McUpdateDeviceTaskRecord> select(Consumer<McUpdateDeviceTaskRecordQueryWrapper> wrapperConsumer) {
        McUpdateDeviceTaskRecordQueryWrapper queryWrapper = McUpdateDeviceTaskRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public List<McUpdateDeviceTaskRecord> list(Consumer<McUpdateDeviceTaskRecordQueryWrapper> wrapperConsumer) {
        McUpdateDeviceTaskRecordQueryWrapper queryWrapper = McUpdateDeviceTaskRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public boolean update(Consumer<McUpdateDeviceTaskRecordUpdateWrapper> wrapper) {
        McUpdateDeviceTaskRecordUpdateWrapper updateWrapper = McUpdateDeviceTaskRecordUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(updateWrapper);
    }

    default public boolean update(McUpdateDeviceTaskRecord up, Consumer<McUpdateDeviceTaskRecordUpdateWrapper> wrapper) {
        McUpdateDeviceTaskRecordUpdateWrapper updateWrapper = McUpdateDeviceTaskRecordUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean update(Consumer<McUpdateDeviceTaskRecord> setUp, Consumer<McUpdateDeviceTaskRecordUpdateWrapper> wrapper) {
        McUpdateDeviceTaskRecord up = new McUpdateDeviceTaskRecord();
        setUp.accept(up);
        McUpdateDeviceTaskRecordUpdateWrapper updateWrapper = McUpdateDeviceTaskRecordUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean remove(Consumer<McUpdateDeviceTaskRecordQueryWrapper> wrapper) {
        McUpdateDeviceTaskRecordQueryWrapper removeWrapper = McUpdateDeviceTaskRecordQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return remove(removeWrapper);
    }

    default public Page<McUpdateDeviceTaskRecord> page(Page<McUpdateDeviceTaskRecord> page, Consumer<McUpdateDeviceTaskRecordQueryWrapper> wrapperConsumer) {
        McUpdateDeviceTaskRecordQueryWrapper queryWrapper = McUpdateDeviceTaskRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default Page<McUpdateDeviceTaskRecord> quickPageById(Page<McUpdateDeviceTaskRecord> page, long lastId, QueryWrapper<McUpdateDeviceTaskRecord> wrapper) {
        return quickPageById(true, page, lastId, wrapper);
    }

    default Page<McUpdateDeviceTaskRecord> quickPageById(Page<McUpdateDeviceTaskRecord> page, long lastId, Consumer<McUpdateDeviceTaskRecordQueryWrapper> wrapperConsumer) {
        McUpdateDeviceTaskRecordQueryWrapper queryWrapper = McUpdateDeviceTaskRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPageById(true, page, lastId, queryWrapper);
    }

    default Page<McUpdateDeviceTaskRecord> quickPageById(boolean queryTotals, Page<McUpdateDeviceTaskRecord> page, long lastId, QueryWrapper<McUpdateDeviceTaskRecord> wrapper) {
        return page(page, wrapper);
    }

    default Page<McUpdateDeviceTaskRecord> quickPage(Page<McUpdateDeviceTaskRecord> page, QueryWrapper<McUpdateDeviceTaskRecord> wrapper) {
        return IService.super.page(page, wrapper);
    }

    default Page<McUpdateDeviceTaskRecord> page(Page<McUpdateDeviceTaskRecord> page, QueryWrapper<McUpdateDeviceTaskRecord> wrapper) {
        return quickPage(page, wrapper);
    }

    default Page<McUpdateDeviceTaskRecord> quickPage(Page<McUpdateDeviceTaskRecord> page, Consumer<McUpdateDeviceTaskRecordQueryWrapper> wrapperConsumer) {
        McUpdateDeviceTaskRecordQueryWrapper queryWrapper = McUpdateDeviceTaskRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default public void pageConsumerByWrapper(Consumer<McUpdateDeviceTaskRecordQueryWrapper> wrapperConsumer, Consumer<McUpdateDeviceTaskRecord> consumer) {
        McUpdateDeviceTaskRecordQueryWrapper queryWrapper = McUpdateDeviceTaskRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumerByWrapper(int pageSize, Consumer<McUpdateDeviceTaskRecordQueryWrapper> wrapperConsumer, Consumer<McUpdateDeviceTaskRecord> consumer) {
        McUpdateDeviceTaskRecordQueryWrapper queryWrapper = McUpdateDeviceTaskRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(QueryWrapper<McUpdateDeviceTaskRecord> queryWrapper, Consumer<McUpdateDeviceTaskRecord> consumer) {
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(int pageSize, QueryWrapper<McUpdateDeviceTaskRecord> queryWrapper, Consumer<McUpdateDeviceTaskRecord> consumer) {
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(Function<Page<McUpdateDeviceTaskRecord>, Page<McUpdateDeviceTaskRecord>> consumerSupplier, Consumer<McUpdateDeviceTaskRecord> consumer) {
        pageConsumer(1000, consumerSupplier, consumer);
    }

    default public void pageConsumer(int pageSize, Function<Page<McUpdateDeviceTaskRecord>, Page<McUpdateDeviceTaskRecord>> consumerSupplier, Consumer<McUpdateDeviceTaskRecord> consumer) {
        Page<McUpdateDeviceTaskRecord> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<McUpdateDeviceTaskRecord> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    for (McUpdateDeviceTaskRecord t : result) {
                        consumer.accept(t);
                    }
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public void pageConsumersByWrapper(Consumer<McUpdateDeviceTaskRecordQueryWrapper> wrapperConsumer, Consumer<List<McUpdateDeviceTaskRecord>> consumerList) {
        McUpdateDeviceTaskRecordQueryWrapper queryWrapper = McUpdateDeviceTaskRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumersByWrapper(int pageSize, Consumer<McUpdateDeviceTaskRecordQueryWrapper> wrapperConsumer, Consumer<List<McUpdateDeviceTaskRecord>> consumerList) {
        McUpdateDeviceTaskRecordQueryWrapper queryWrapper = McUpdateDeviceTaskRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(QueryWrapper<McUpdateDeviceTaskRecord> queryWrapper, Consumer<List<McUpdateDeviceTaskRecord>> consumerList) {
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(int pageSize, QueryWrapper<McUpdateDeviceTaskRecord> queryWrapper, Consumer<List<McUpdateDeviceTaskRecord>> consumerList) {
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(Function<Page<McUpdateDeviceTaskRecord>, Page<McUpdateDeviceTaskRecord>> consumerSupplier, Consumer<List<McUpdateDeviceTaskRecord>> consumerList) {
        pageConsumers(1000, consumerSupplier, consumerList);
    }

    default public void pageConsumers(int pageSize, Function<Page<McUpdateDeviceTaskRecord>, Page<McUpdateDeviceTaskRecord>> consumerSupplier, Consumer<List<McUpdateDeviceTaskRecord>> consumerList) {
        Page<McUpdateDeviceTaskRecord> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<McUpdateDeviceTaskRecord> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    consumerList.accept(result);
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public boolean queryAndUpdateById(QueryWrapper<McUpdateDeviceTaskRecord> wrapper, McUpdateDeviceTaskRecord up) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<McUpdateDeviceTaskRecord> wrapper, McUpdateDeviceTaskRecord up) {
        return queryAndUpdateById(pageSize, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<McUpdateDeviceTaskRecord> wrapper, McUpdateDeviceTaskRecord up, BiPredicate<McUpdateDeviceTaskRecord, McUpdateDeviceTaskRecord> updateFilter) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<McUpdateDeviceTaskRecord> wrapper, McUpdateDeviceTaskRecord up, BiPredicate<McUpdateDeviceTaskRecord, McUpdateDeviceTaskRecord> updateFilter) {
        return queryAndUpdateById(pageSize, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<McUpdateDeviceTaskRecord> wrapper, McUpdateDeviceTaskRecord up, BiConsumer<McUpdateDeviceTaskRecord, McUpdateDeviceTaskRecordUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, whereSet);
    }

    default public boolean queryAndUpdateById(QueryWrapper<McUpdateDeviceTaskRecord> wrapper, McUpdateDeviceTaskRecord up, BiPredicate<McUpdateDeviceTaskRecord, McUpdateDeviceTaskRecord> updateFilter, BiConsumer<McUpdateDeviceTaskRecord, McUpdateDeviceTaskRecordUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, whereSet);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<McUpdateDeviceTaskRecord> wrapper, McUpdateDeviceTaskRecord up, BiPredicate<McUpdateDeviceTaskRecord, McUpdateDeviceTaskRecord> updateFilter, BiConsumer<McUpdateDeviceTaskRecord, McUpdateDeviceTaskRecordUpdateWrapper> whereSet) {
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

    default public boolean removeByIds(Consumer<McUpdateDeviceTaskRecordQueryWrapper> wrapper) {
        return removeByIds(1000, wrapper);
    }

    default public boolean removeByIds(int pageSize, Consumer<McUpdateDeviceTaskRecordQueryWrapper> wrapper) {
        McUpdateDeviceTaskRecordQueryWrapper removeWrapper = McUpdateDeviceTaskRecordQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return removeByIds(pageSize, removeWrapper);
    }

    default public boolean removeByIds(McUpdateDeviceTaskRecordQueryWrapper removeWrapper) {
        return removeByIds(1000, removeWrapper);
    }

    default public boolean removeByIds(int pageSize, McUpdateDeviceTaskRecordQueryWrapper removeWrapper) {
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
