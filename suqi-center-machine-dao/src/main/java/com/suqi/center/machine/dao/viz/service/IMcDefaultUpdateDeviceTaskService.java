package com.suqi.center.machine.dao.viz.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.suqi.center.machine.dao.viz.entity.McDefaultUpdateDeviceTask;
import com.suqi.center.machine.dao.viz.vo.McDefaultUpdateDeviceTaskListVo;
import com.suqi.center.machine.dao.viz.wrapper.McDefaultUpdateDeviceTaskQueryWrapper;
import com.suqi.center.machine.dao.viz.wrapper.McDefaultUpdateDeviceTaskUpdateWrapper;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * <p>
 * 更新机器默认任务表 服务类
 * </p>
 *
 * @author 18374
 * @since 2023-08-16
 */
public interface IMcDefaultUpdateDeviceTaskService extends IService<McDefaultUpdateDeviceTask> {

    default long count(Consumer<McDefaultUpdateDeviceTaskQueryWrapper> wrapperConsumer) {
        McDefaultUpdateDeviceTaskQueryWrapper queryWrapper = McDefaultUpdateDeviceTaskQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return count(queryWrapper);
    }

    default public McDefaultUpdateDeviceTask selectOne(Consumer<McDefaultUpdateDeviceTaskQueryWrapper> wrapperConsumer) {
          McDefaultUpdateDeviceTaskQueryWrapper queryWrapper = McDefaultUpdateDeviceTaskQueryWrapper.wrapper();
          wrapperConsumer.accept(queryWrapper);
          queryWrapper.last(" limit 1 ");
        return getOne(queryWrapper,false);
    }

    default public List<McDefaultUpdateDeviceTask> select(Consumer<McDefaultUpdateDeviceTaskQueryWrapper> wrapperConsumer) {
          McDefaultUpdateDeviceTaskQueryWrapper queryWrapper = McDefaultUpdateDeviceTaskQueryWrapper.wrapper();
          wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public List<McDefaultUpdateDeviceTask> list(Consumer<McDefaultUpdateDeviceTaskQueryWrapper> wrapperConsumer) {
          McDefaultUpdateDeviceTaskQueryWrapper queryWrapper = McDefaultUpdateDeviceTaskQueryWrapper.wrapper();
          wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default  public boolean update(Consumer<McDefaultUpdateDeviceTaskUpdateWrapper> wrapper){
        McDefaultUpdateDeviceTaskUpdateWrapper updateWrapper = McDefaultUpdateDeviceTaskUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return  update(updateWrapper);
    }

    default  public boolean update(McDefaultUpdateDeviceTask up,Consumer<McDefaultUpdateDeviceTaskUpdateWrapper> wrapper){
        McDefaultUpdateDeviceTaskUpdateWrapper updateWrapper = McDefaultUpdateDeviceTaskUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return  update(up, updateWrapper);
    }

    default  public boolean update(Consumer<McDefaultUpdateDeviceTask> setUp,Consumer<McDefaultUpdateDeviceTaskUpdateWrapper> wrapper){
        McDefaultUpdateDeviceTask up = new McDefaultUpdateDeviceTask();
        setUp.accept(up);
        McDefaultUpdateDeviceTaskUpdateWrapper updateWrapper = McDefaultUpdateDeviceTaskUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return  update(up, updateWrapper);
    }

    default  public boolean remove(Consumer<McDefaultUpdateDeviceTaskQueryWrapper> wrapper){
        McDefaultUpdateDeviceTaskQueryWrapper removeWrapper = McDefaultUpdateDeviceTaskQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return  remove(removeWrapper);
    }

    default public Page<McDefaultUpdateDeviceTask> page(Page<McDefaultUpdateDeviceTask> page,Consumer<McDefaultUpdateDeviceTaskQueryWrapper> wrapperConsumer) {
        McDefaultUpdateDeviceTaskQueryWrapper queryWrapper = McDefaultUpdateDeviceTaskQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default Page<McDefaultUpdateDeviceTask> quickPageById(Page<McDefaultUpdateDeviceTask> page,long lastId, QueryWrapper<McDefaultUpdateDeviceTask> wrapper){
          return quickPageById(true,page,lastId,wrapper);
    }

    default Page<McDefaultUpdateDeviceTask> quickPageById(Page<McDefaultUpdateDeviceTask> page,long lastId,Consumer<McDefaultUpdateDeviceTaskQueryWrapper> wrapperConsumer) {
          McDefaultUpdateDeviceTaskQueryWrapper queryWrapper = McDefaultUpdateDeviceTaskQueryWrapper.wrapper();
          wrapperConsumer.accept(queryWrapper);
          return quickPageById(true,page,lastId,queryWrapper);
    }

    default Page<McDefaultUpdateDeviceTask> quickPageById(boolean queryTotals,Page<McDefaultUpdateDeviceTask> page,long lastId, QueryWrapper<McDefaultUpdateDeviceTask> wrapper){
          return page(page, wrapper);
    }

    default Page<McDefaultUpdateDeviceTask> quickPage(Page<McDefaultUpdateDeviceTask> page,QueryWrapper<McDefaultUpdateDeviceTask> wrapper){
          return IService.super.page(page,wrapper);
    }

    default Page<McDefaultUpdateDeviceTask> page(Page<McDefaultUpdateDeviceTask> page,QueryWrapper<McDefaultUpdateDeviceTask> wrapper){
          return quickPage(page, wrapper);
    }


    default Page<McDefaultUpdateDeviceTask> quickPage(Page<McDefaultUpdateDeviceTask> page,Consumer<McDefaultUpdateDeviceTaskQueryWrapper> wrapperConsumer) {
          McDefaultUpdateDeviceTaskQueryWrapper queryWrapper = McDefaultUpdateDeviceTaskQueryWrapper.wrapper();
           wrapperConsumer.accept(queryWrapper);
          return quickPage(page, queryWrapper);
    }

    default public void pageConsumerByWrapper(Consumer<McDefaultUpdateDeviceTaskQueryWrapper> wrapperConsumer, Consumer<McDefaultUpdateDeviceTask> consumer) {
        McDefaultUpdateDeviceTaskQueryWrapper queryWrapper = McDefaultUpdateDeviceTaskQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumerByWrapper(int pageSize, Consumer<McDefaultUpdateDeviceTaskQueryWrapper> wrapperConsumer, Consumer<McDefaultUpdateDeviceTask> consumer) {
        McDefaultUpdateDeviceTaskQueryWrapper queryWrapper = McDefaultUpdateDeviceTaskQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }


    default public void pageConsumer(QueryWrapper<McDefaultUpdateDeviceTask> queryWrapper, Consumer<McDefaultUpdateDeviceTask> consumer) {
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(int pageSize, QueryWrapper<McDefaultUpdateDeviceTask> queryWrapper, Consumer<McDefaultUpdateDeviceTask> consumer) {
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(Function<Page<McDefaultUpdateDeviceTask>, Page<McDefaultUpdateDeviceTask>> consumerSupplier, Consumer<McDefaultUpdateDeviceTask> consumer) {
        pageConsumer(1000, consumerSupplier, consumer);
    }

    default public void pageConsumer(int pageSize, Function<Page<McDefaultUpdateDeviceTask>, Page<McDefaultUpdateDeviceTask>> consumerSupplier, Consumer<McDefaultUpdateDeviceTask> consumer) {
        Page<McDefaultUpdateDeviceTask> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<McDefaultUpdateDeviceTask> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    for (McDefaultUpdateDeviceTask t : result) {
                        consumer.accept(t);
                    }
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }


    default public void pageConsumersByWrapper(Consumer<McDefaultUpdateDeviceTaskQueryWrapper> wrapperConsumer, Consumer<List<McDefaultUpdateDeviceTask>> consumerList) {
        McDefaultUpdateDeviceTaskQueryWrapper queryWrapper = McDefaultUpdateDeviceTaskQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumersByWrapper(int pageSize, Consumer<McDefaultUpdateDeviceTaskQueryWrapper> wrapperConsumer, Consumer<List<McDefaultUpdateDeviceTask>> consumerList) {
        McDefaultUpdateDeviceTaskQueryWrapper queryWrapper = McDefaultUpdateDeviceTaskQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }


    default public void pageConsumers(QueryWrapper<McDefaultUpdateDeviceTask> queryWrapper, Consumer<List<McDefaultUpdateDeviceTask>> consumerList) {
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(int pageSize, QueryWrapper<McDefaultUpdateDeviceTask> queryWrapper, Consumer<List<McDefaultUpdateDeviceTask>> consumerList) {
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(Function<Page<McDefaultUpdateDeviceTask>, Page<McDefaultUpdateDeviceTask>> consumerSupplier, Consumer<List<McDefaultUpdateDeviceTask>> consumerList) {
        pageConsumers(1000, consumerSupplier, consumerList);
    }

    default public void pageConsumers(int pageSize, Function<Page<McDefaultUpdateDeviceTask>, Page<McDefaultUpdateDeviceTask>> consumerSupplier, Consumer<List<McDefaultUpdateDeviceTask>> consumerList) {
        Page<McDefaultUpdateDeviceTask> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<McDefaultUpdateDeviceTask> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    consumerList.accept(result);
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }


    default public boolean queryAndUpdateById(QueryWrapper<McDefaultUpdateDeviceTask> wrapper, McDefaultUpdateDeviceTask up) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<McDefaultUpdateDeviceTask> wrapper, McDefaultUpdateDeviceTask up) {
        return queryAndUpdateById(pageSize, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<McDefaultUpdateDeviceTask> wrapper, McDefaultUpdateDeviceTask up, BiPredicate<McDefaultUpdateDeviceTask, McDefaultUpdateDeviceTask> updateFilter) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<McDefaultUpdateDeviceTask> wrapper, McDefaultUpdateDeviceTask up, BiPredicate<McDefaultUpdateDeviceTask, McDefaultUpdateDeviceTask> updateFilter) {
        return queryAndUpdateById(pageSize, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<McDefaultUpdateDeviceTask> wrapper, McDefaultUpdateDeviceTask up, BiConsumer<McDefaultUpdateDeviceTask, McDefaultUpdateDeviceTaskUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, whereSet);
    }

    default public boolean queryAndUpdateById(QueryWrapper<McDefaultUpdateDeviceTask> wrapper, McDefaultUpdateDeviceTask up, BiPredicate<McDefaultUpdateDeviceTask, McDefaultUpdateDeviceTask> updateFilter, BiConsumer<McDefaultUpdateDeviceTask, McDefaultUpdateDeviceTaskUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, whereSet);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<McDefaultUpdateDeviceTask> wrapper, McDefaultUpdateDeviceTask up, BiPredicate<McDefaultUpdateDeviceTask, McDefaultUpdateDeviceTask> updateFilter, BiConsumer<McDefaultUpdateDeviceTask, McDefaultUpdateDeviceTaskUpdateWrapper> whereSet) {
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

    default public boolean removeByIds(Consumer<McDefaultUpdateDeviceTaskQueryWrapper> wrapper) {
        return removeByIds(1000, wrapper);
    }

    default public boolean removeByIds(int pageSize, Consumer<McDefaultUpdateDeviceTaskQueryWrapper> wrapper) {
        McDefaultUpdateDeviceTaskQueryWrapper removeWrapper = McDefaultUpdateDeviceTaskQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return removeByIds(pageSize, removeWrapper);
    }

    default public boolean removeByIds(McDefaultUpdateDeviceTaskQueryWrapper removeWrapper) {
        return removeByIds(1000,removeWrapper);
    }

    default public boolean removeByIds(int pageSize, McDefaultUpdateDeviceTaskQueryWrapper removeWrapper) {
        AtomicBoolean rs = new AtomicBoolean(false);
        pageConsumer(pageSize, removeWrapper, t -> {
            boolean r = removeById(t.getId());
            if (r && !rs.get()) {
                rs.set(r);
            }
        });
        return rs.get();
    }


    /**
     * 查询更新机器默认任务列表
     * @return
     */
    List<McDefaultUpdateDeviceTaskListVo> listVo();

    /**
     * 检查是否重复添加
     * @param fkMcUpdateDeviceTaskId
     * @return
     */
    Boolean checkTaskRepeat(Long fkMcUpdateDeviceTaskId);
}
