package com.suqi.center.machine.dao.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.suqi.center.machine.dao.entity.McMoveJobs;
import com.suqi.center.machine.dao.wrapper.McMoveJobsQueryWrapper;
import com.suqi.center.machine.dao.wrapper.McMoveJobsUpdateWrapper;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author PC001
 * @since 2023-08-24
 */
public interface IMcMoveJobsService extends IService<McMoveJobs> {

    default long count(Consumer<McMoveJobsQueryWrapper> wrapperConsumer) {
        McMoveJobsQueryWrapper queryWrapper = McMoveJobsQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return count(queryWrapper);
    }

    default public McMoveJobs selectOne(Consumer<McMoveJobsQueryWrapper> wrapperConsumer) {
          McMoveJobsQueryWrapper queryWrapper = McMoveJobsQueryWrapper.wrapper();
          wrapperConsumer.accept(queryWrapper);
          queryWrapper.last(" limit 1 ");
        return getOne(queryWrapper,false);
    }

    default public List<McMoveJobs> select(Consumer<McMoveJobsQueryWrapper> wrapperConsumer) {
          McMoveJobsQueryWrapper queryWrapper = McMoveJobsQueryWrapper.wrapper();
          wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public List<McMoveJobs> list(Consumer<McMoveJobsQueryWrapper> wrapperConsumer) {
          McMoveJobsQueryWrapper queryWrapper = McMoveJobsQueryWrapper.wrapper();
          wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default  public boolean update(Consumer<McMoveJobsUpdateWrapper> wrapper){
        McMoveJobsUpdateWrapper updateWrapper = McMoveJobsUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return  update(updateWrapper);
    }

    default  public boolean update(McMoveJobs up,Consumer<McMoveJobsUpdateWrapper> wrapper){
        McMoveJobsUpdateWrapper updateWrapper = McMoveJobsUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return  update(up, updateWrapper);
    }

    default  public boolean update(Consumer<McMoveJobs> setUp,Consumer<McMoveJobsUpdateWrapper> wrapper){
        McMoveJobs up = new McMoveJobs();
        setUp.accept(up);
        McMoveJobsUpdateWrapper updateWrapper = McMoveJobsUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return  update(up, updateWrapper);
    }

    default  public boolean remove(Consumer<McMoveJobsQueryWrapper> wrapper){
        McMoveJobsQueryWrapper removeWrapper = McMoveJobsQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return  remove(removeWrapper);
    }

    default public Page<McMoveJobs> page(Page<McMoveJobs> page,Consumer<McMoveJobsQueryWrapper> wrapperConsumer) {
        McMoveJobsQueryWrapper queryWrapper = McMoveJobsQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default Page<McMoveJobs> quickPageById(Page<McMoveJobs> page,long lastId, QueryWrapper<McMoveJobs> wrapper){
          return quickPageById(true,page,lastId,wrapper);
    }

    default Page<McMoveJobs> quickPageById(Page<McMoveJobs> page,long lastId,Consumer<McMoveJobsQueryWrapper> wrapperConsumer) {
          McMoveJobsQueryWrapper queryWrapper = McMoveJobsQueryWrapper.wrapper();
          wrapperConsumer.accept(queryWrapper);
          return quickPageById(true,page,lastId,queryWrapper);
    }

    default Page<McMoveJobs> quickPageById(boolean queryTotals,Page<McMoveJobs> page,long lastId, QueryWrapper<McMoveJobs> wrapper){
          return page(page, wrapper);
    }

    default Page<McMoveJobs> quickPage(Page<McMoveJobs> page,QueryWrapper<McMoveJobs> wrapper){
          return IService.super.page(page,wrapper);
    }

    default Page<McMoveJobs> page(Page<McMoveJobs> page,QueryWrapper<McMoveJobs> wrapper){
          return quickPage(page, wrapper);
    }


    default Page<McMoveJobs> quickPage(Page<McMoveJobs> page,Consumer<McMoveJobsQueryWrapper> wrapperConsumer) {
          McMoveJobsQueryWrapper queryWrapper = McMoveJobsQueryWrapper.wrapper();
           wrapperConsumer.accept(queryWrapper);
          return quickPage(page, queryWrapper);
    }

    default public void pageConsumerByWrapper(Consumer<McMoveJobsQueryWrapper> wrapperConsumer, Consumer<McMoveJobs> consumer) {
        McMoveJobsQueryWrapper queryWrapper = McMoveJobsQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumerByWrapper(int pageSize, Consumer<McMoveJobsQueryWrapper> wrapperConsumer, Consumer<McMoveJobs> consumer) {
        McMoveJobsQueryWrapper queryWrapper = McMoveJobsQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }


    default public void pageConsumer(QueryWrapper<McMoveJobs> queryWrapper, Consumer<McMoveJobs> consumer) {
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(int pageSize, QueryWrapper<McMoveJobs> queryWrapper, Consumer<McMoveJobs> consumer) {
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(Function<Page<McMoveJobs>, Page<McMoveJobs>> consumerSupplier, Consumer<McMoveJobs> consumer) {
        pageConsumer(1000, consumerSupplier, consumer);
    }

    default public void pageConsumer(int pageSize, Function<Page<McMoveJobs>, Page<McMoveJobs>> consumerSupplier, Consumer<McMoveJobs> consumer) {
        Page<McMoveJobs> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<McMoveJobs> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    for (McMoveJobs t : result) {
                        consumer.accept(t);
                    }
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }


    default public void pageConsumersByWrapper(Consumer<McMoveJobsQueryWrapper> wrapperConsumer, Consumer<List<McMoveJobs>> consumerList) {
        McMoveJobsQueryWrapper queryWrapper = McMoveJobsQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumersByWrapper(int pageSize, Consumer<McMoveJobsQueryWrapper> wrapperConsumer, Consumer<List<McMoveJobs>> consumerList) {
        McMoveJobsQueryWrapper queryWrapper = McMoveJobsQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }


    default public void pageConsumers(QueryWrapper<McMoveJobs> queryWrapper, Consumer<List<McMoveJobs>> consumerList) {
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(int pageSize, QueryWrapper<McMoveJobs> queryWrapper, Consumer<List<McMoveJobs>> consumerList) {
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(Function<Page<McMoveJobs>, Page<McMoveJobs>> consumerSupplier, Consumer<List<McMoveJobs>> consumerList) {
        pageConsumers(1000, consumerSupplier, consumerList);
    }

    default public void pageConsumers(int pageSize, Function<Page<McMoveJobs>, Page<McMoveJobs>> consumerSupplier, Consumer<List<McMoveJobs>> consumerList) {
        Page<McMoveJobs> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<McMoveJobs> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    consumerList.accept(result);
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }


    default public boolean queryAndUpdateById(QueryWrapper<McMoveJobs> wrapper, McMoveJobs up) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<McMoveJobs> wrapper, McMoveJobs up) {
        return queryAndUpdateById(pageSize, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<McMoveJobs> wrapper, McMoveJobs up, BiPredicate<McMoveJobs, McMoveJobs> updateFilter) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<McMoveJobs> wrapper, McMoveJobs up, BiPredicate<McMoveJobs, McMoveJobs> updateFilter) {
        return queryAndUpdateById(pageSize, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<McMoveJobs> wrapper, McMoveJobs up, BiConsumer<McMoveJobs, McMoveJobsUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, whereSet);
    }

    default public boolean queryAndUpdateById(QueryWrapper<McMoveJobs> wrapper, McMoveJobs up, BiPredicate<McMoveJobs, McMoveJobs> updateFilter, BiConsumer<McMoveJobs, McMoveJobsUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, whereSet);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<McMoveJobs> wrapper, McMoveJobs up, BiPredicate<McMoveJobs, McMoveJobs> updateFilter, BiConsumer<McMoveJobs, McMoveJobsUpdateWrapper> whereSet) {
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

    default public boolean removeByIds(Consumer<McMoveJobsQueryWrapper> wrapper) {
        return removeByIds(1000, wrapper);
    }

    default public boolean removeByIds(int pageSize, Consumer<McMoveJobsQueryWrapper> wrapper) {
        McMoveJobsQueryWrapper removeWrapper = McMoveJobsQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return removeByIds(pageSize, removeWrapper);
    }

    default public boolean removeByIds(McMoveJobsQueryWrapper removeWrapper) {
        return removeByIds(1000,removeWrapper);
    }

    default public boolean removeByIds(int pageSize, McMoveJobsQueryWrapper removeWrapper) {
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
