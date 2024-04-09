package com.suqi.center.machine.dao.viz.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.suqi.center.machine.dao.viz.dto.McUpdateDeviceTaskListDto;
import com.suqi.center.machine.dao.viz.entity.McUpdateDeviceTask;
import com.suqi.center.machine.dao.viz.vo.McUpdateDeviceTaskInfoVo;
import com.suqi.center.machine.dao.viz.vo.McUpdateDeviceTaskListVo;
import com.suqi.center.machine.dao.viz.wrapper.McUpdateDeviceTaskQueryWrapper;
import com.suqi.center.machine.dao.viz.wrapper.McUpdateDeviceTaskUpdateWrapper;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * <p>
 * 更新机器任务表 服务类
 * </p>
 *
 * @author 18374
 * @since 2023-08-11
 */
public interface IMcUpdateDeviceTaskService extends IService<McUpdateDeviceTask> {

    /**
     * 分页查询主任务数据
     * @param param
     * @return
     */
    Page<McUpdateDeviceTaskListVo> listPage(McUpdateDeviceTaskListDto param);

    /**
     * 查询主任务详细信息
     * @param mcUpdateDeviceTaskId
     * @return
     */
    McUpdateDeviceTaskInfoVo info(Long mcUpdateDeviceTaskId);

    default long count(Consumer<McUpdateDeviceTaskQueryWrapper> wrapperConsumer) {
        McUpdateDeviceTaskQueryWrapper queryWrapper = McUpdateDeviceTaskQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return count(queryWrapper);
    }

    default public McUpdateDeviceTask selectOne(Consumer<McUpdateDeviceTaskQueryWrapper> wrapperConsumer) {
        McUpdateDeviceTaskQueryWrapper queryWrapper = McUpdateDeviceTaskQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        queryWrapper.last(" limit 1 ");
        return getOne(queryWrapper, false);
    }

    default public List<McUpdateDeviceTask> select(Consumer<McUpdateDeviceTaskQueryWrapper> wrapperConsumer) {
        McUpdateDeviceTaskQueryWrapper queryWrapper = McUpdateDeviceTaskQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public List<McUpdateDeviceTask> list(Consumer<McUpdateDeviceTaskQueryWrapper> wrapperConsumer) {
        McUpdateDeviceTaskQueryWrapper queryWrapper = McUpdateDeviceTaskQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public boolean update(Consumer<McUpdateDeviceTaskUpdateWrapper> wrapper) {
        McUpdateDeviceTaskUpdateWrapper updateWrapper = McUpdateDeviceTaskUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(updateWrapper);
    }

    default public boolean update(McUpdateDeviceTask up, Consumer<McUpdateDeviceTaskUpdateWrapper> wrapper) {
        McUpdateDeviceTaskUpdateWrapper updateWrapper = McUpdateDeviceTaskUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean update(Consumer<McUpdateDeviceTask> setUp, Consumer<McUpdateDeviceTaskUpdateWrapper> wrapper) {
        McUpdateDeviceTask up = new McUpdateDeviceTask();
        setUp.accept(up);
        McUpdateDeviceTaskUpdateWrapper updateWrapper = McUpdateDeviceTaskUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean remove(Consumer<McUpdateDeviceTaskQueryWrapper> wrapper) {
        McUpdateDeviceTaskQueryWrapper removeWrapper = McUpdateDeviceTaskQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return remove(removeWrapper);
    }

    default public Page<McUpdateDeviceTask> page(Page<McUpdateDeviceTask> page, Consumer<McUpdateDeviceTaskQueryWrapper> wrapperConsumer) {
        McUpdateDeviceTaskQueryWrapper queryWrapper = McUpdateDeviceTaskQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default Page<McUpdateDeviceTask> quickPageById(Page<McUpdateDeviceTask> page, long lastId, QueryWrapper<McUpdateDeviceTask> wrapper) {
        return quickPageById(true, page, lastId, wrapper);
    }

    default Page<McUpdateDeviceTask> quickPageById(Page<McUpdateDeviceTask> page, long lastId, Consumer<McUpdateDeviceTaskQueryWrapper> wrapperConsumer) {
        McUpdateDeviceTaskQueryWrapper queryWrapper = McUpdateDeviceTaskQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPageById(true, page, lastId, queryWrapper);
    }

    default Page<McUpdateDeviceTask> quickPageById(boolean queryTotals, Page<McUpdateDeviceTask> page, long lastId, QueryWrapper<McUpdateDeviceTask> wrapper) {
        return page(page, wrapper);
    }

    default Page<McUpdateDeviceTask> quickPage(Page<McUpdateDeviceTask> page, QueryWrapper<McUpdateDeviceTask> wrapper) {
        return IService.super.page(page, wrapper);
    }

    default Page<McUpdateDeviceTask> page(Page<McUpdateDeviceTask> page, QueryWrapper<McUpdateDeviceTask> wrapper) {
        return quickPage(page, wrapper);
    }

    default Page<McUpdateDeviceTask> quickPage(Page<McUpdateDeviceTask> page, Consumer<McUpdateDeviceTaskQueryWrapper> wrapperConsumer) {
        McUpdateDeviceTaskQueryWrapper queryWrapper = McUpdateDeviceTaskQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default public void pageConsumerByWrapper(Consumer<McUpdateDeviceTaskQueryWrapper> wrapperConsumer, Consumer<McUpdateDeviceTask> consumer) {
        McUpdateDeviceTaskQueryWrapper queryWrapper = McUpdateDeviceTaskQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumerByWrapper(int pageSize, Consumer<McUpdateDeviceTaskQueryWrapper> wrapperConsumer, Consumer<McUpdateDeviceTask> consumer) {
        McUpdateDeviceTaskQueryWrapper queryWrapper = McUpdateDeviceTaskQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(QueryWrapper<McUpdateDeviceTask> queryWrapper, Consumer<McUpdateDeviceTask> consumer) {
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(int pageSize, QueryWrapper<McUpdateDeviceTask> queryWrapper, Consumer<McUpdateDeviceTask> consumer) {
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(Function<Page<McUpdateDeviceTask>, Page<McUpdateDeviceTask>> consumerSupplier, Consumer<McUpdateDeviceTask> consumer) {
        pageConsumer(1000, consumerSupplier, consumer);
    }

    default public void pageConsumer(int pageSize, Function<Page<McUpdateDeviceTask>, Page<McUpdateDeviceTask>> consumerSupplier, Consumer<McUpdateDeviceTask> consumer) {
        Page<McUpdateDeviceTask> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<McUpdateDeviceTask> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    for (McUpdateDeviceTask t : result) {
                        consumer.accept(t);
                    }
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public void pageConsumersByWrapper(Consumer<McUpdateDeviceTaskQueryWrapper> wrapperConsumer, Consumer<List<McUpdateDeviceTask>> consumerList) {
        McUpdateDeviceTaskQueryWrapper queryWrapper = McUpdateDeviceTaskQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumersByWrapper(int pageSize, Consumer<McUpdateDeviceTaskQueryWrapper> wrapperConsumer, Consumer<List<McUpdateDeviceTask>> consumerList) {
        McUpdateDeviceTaskQueryWrapper queryWrapper = McUpdateDeviceTaskQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(QueryWrapper<McUpdateDeviceTask> queryWrapper, Consumer<List<McUpdateDeviceTask>> consumerList) {
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(int pageSize, QueryWrapper<McUpdateDeviceTask> queryWrapper, Consumer<List<McUpdateDeviceTask>> consumerList) {
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(Function<Page<McUpdateDeviceTask>, Page<McUpdateDeviceTask>> consumerSupplier, Consumer<List<McUpdateDeviceTask>> consumerList) {
        pageConsumers(1000, consumerSupplier, consumerList);
    }

    default public void pageConsumers(int pageSize, Function<Page<McUpdateDeviceTask>, Page<McUpdateDeviceTask>> consumerSupplier, Consumer<List<McUpdateDeviceTask>> consumerList) {
        Page<McUpdateDeviceTask> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<McUpdateDeviceTask> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    consumerList.accept(result);
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public boolean queryAndUpdateById(QueryWrapper<McUpdateDeviceTask> wrapper, McUpdateDeviceTask up) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<McUpdateDeviceTask> wrapper, McUpdateDeviceTask up) {
        return queryAndUpdateById(pageSize, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<McUpdateDeviceTask> wrapper, McUpdateDeviceTask up, BiPredicate<McUpdateDeviceTask, McUpdateDeviceTask> updateFilter) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<McUpdateDeviceTask> wrapper, McUpdateDeviceTask up, BiPredicate<McUpdateDeviceTask, McUpdateDeviceTask> updateFilter) {
        return queryAndUpdateById(pageSize, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<McUpdateDeviceTask> wrapper, McUpdateDeviceTask up, BiConsumer<McUpdateDeviceTask, McUpdateDeviceTaskUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, whereSet);
    }

    default public boolean queryAndUpdateById(QueryWrapper<McUpdateDeviceTask> wrapper, McUpdateDeviceTask up, BiPredicate<McUpdateDeviceTask, McUpdateDeviceTask> updateFilter, BiConsumer<McUpdateDeviceTask, McUpdateDeviceTaskUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, whereSet);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<McUpdateDeviceTask> wrapper, McUpdateDeviceTask up, BiPredicate<McUpdateDeviceTask, McUpdateDeviceTask> updateFilter, BiConsumer<McUpdateDeviceTask, McUpdateDeviceTaskUpdateWrapper> whereSet) {
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

    default public boolean removeByIds(Consumer<McUpdateDeviceTaskQueryWrapper> wrapper) {
        return removeByIds(1000, wrapper);
    }

    default public boolean removeByIds(int pageSize, Consumer<McUpdateDeviceTaskQueryWrapper> wrapper) {
        McUpdateDeviceTaskQueryWrapper removeWrapper = McUpdateDeviceTaskQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return removeByIds(pageSize, removeWrapper);
    }

    default public boolean removeByIds(McUpdateDeviceTaskQueryWrapper removeWrapper) {
        return removeByIds(1000, removeWrapper);
    }

    default public boolean removeByIds(int pageSize, McUpdateDeviceTaskQueryWrapper removeWrapper) {
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
