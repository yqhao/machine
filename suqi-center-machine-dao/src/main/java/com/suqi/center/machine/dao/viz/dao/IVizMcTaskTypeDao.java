package com.suqi.center.machine.dao.viz.dao;

import com.suqi.center.machine.dao.viz.entity.VizMcTaskTypeEo;
import com.suqi.center.machine.dao.viz.wrapper.VizMcTaskTypeEoQueryWrapper;
import com.suqi.center.machine.dao.viz.wrapper.VizMcTaskTypeEoUpdateWrapper;
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
 * 任务类型表 服务类
 * </p>
 *
 * @author 18374
 * @since 2023-10-20
 */
public interface IVizMcTaskTypeDao extends IService<VizMcTaskTypeEo> {

    default long count(Consumer<VizMcTaskTypeEoQueryWrapper> wrapperConsumer) {
        VizMcTaskTypeEoQueryWrapper queryWrapper = VizMcTaskTypeEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return count(queryWrapper);
    }

    default public VizMcTaskTypeEo selectOne(Consumer<VizMcTaskTypeEoQueryWrapper> wrapperConsumer) {
          VizMcTaskTypeEoQueryWrapper queryWrapper = VizMcTaskTypeEoQueryWrapper.wrapper();
          wrapperConsumer.accept(queryWrapper);
          queryWrapper.last(" limit 1 ");
        return getOne(queryWrapper,false);
    }

    default public List<VizMcTaskTypeEo> select(Consumer<VizMcTaskTypeEoQueryWrapper> wrapperConsumer) {
          VizMcTaskTypeEoQueryWrapper queryWrapper = VizMcTaskTypeEoQueryWrapper.wrapper();
          wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public List<VizMcTaskTypeEo> list(Consumer<VizMcTaskTypeEoQueryWrapper> wrapperConsumer) {
          VizMcTaskTypeEoQueryWrapper queryWrapper = VizMcTaskTypeEoQueryWrapper.wrapper();
          wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default  public boolean update(Consumer<VizMcTaskTypeEoUpdateWrapper> wrapper){
        VizMcTaskTypeEoUpdateWrapper updateWrapper = VizMcTaskTypeEoUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return  update(updateWrapper);
    }

    default  public boolean update(VizMcTaskTypeEo up,Consumer<VizMcTaskTypeEoUpdateWrapper> wrapper){
        VizMcTaskTypeEoUpdateWrapper updateWrapper = VizMcTaskTypeEoUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return  update(up, updateWrapper);
    }

    default  public boolean update(Consumer<VizMcTaskTypeEo> setUp,Consumer<VizMcTaskTypeEoUpdateWrapper> wrapper){
        VizMcTaskTypeEo up = new VizMcTaskTypeEo();
        setUp.accept(up);
        VizMcTaskTypeEoUpdateWrapper updateWrapper = VizMcTaskTypeEoUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return  update(up, updateWrapper);
    }

    default  public boolean remove(Consumer<VizMcTaskTypeEoQueryWrapper> wrapper){
        VizMcTaskTypeEoQueryWrapper removeWrapper = VizMcTaskTypeEoQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return  remove(removeWrapper);
    }

    default public Page<VizMcTaskTypeEo> page(Page<VizMcTaskTypeEo> page,Consumer<VizMcTaskTypeEoQueryWrapper> wrapperConsumer) {
        VizMcTaskTypeEoQueryWrapper queryWrapper = VizMcTaskTypeEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default Page<VizMcTaskTypeEo> quickPageById(Page<VizMcTaskTypeEo> page,long lastId, QueryWrapper<VizMcTaskTypeEo> wrapper){
          return quickPageById(true,page,lastId,wrapper);
    }

    default Page<VizMcTaskTypeEo> quickPageById(Page<VizMcTaskTypeEo> page,long lastId,Consumer<VizMcTaskTypeEoQueryWrapper> wrapperConsumer) {
          VizMcTaskTypeEoQueryWrapper queryWrapper = VizMcTaskTypeEoQueryWrapper.wrapper();
          wrapperConsumer.accept(queryWrapper);
          return quickPageById(true,page,lastId,queryWrapper);
    }

    default Page<VizMcTaskTypeEo> quickPageById(boolean queryTotals,Page<VizMcTaskTypeEo> page,long lastId, QueryWrapper<VizMcTaskTypeEo> wrapper){
          return page(page, wrapper);
    }

    default Page<VizMcTaskTypeEo> quickPage(Page<VizMcTaskTypeEo> page,QueryWrapper<VizMcTaskTypeEo> wrapper){
          return IService.super.page(page,wrapper);
    }

    default Page<VizMcTaskTypeEo> page(Page<VizMcTaskTypeEo> page,QueryWrapper<VizMcTaskTypeEo> wrapper){
          return quickPage(page, wrapper);
    }


    default Page<VizMcTaskTypeEo> quickPage(Page<VizMcTaskTypeEo> page,Consumer<VizMcTaskTypeEoQueryWrapper> wrapperConsumer) {
          VizMcTaskTypeEoQueryWrapper queryWrapper = VizMcTaskTypeEoQueryWrapper.wrapper();
           wrapperConsumer.accept(queryWrapper);
          return quickPage(page, queryWrapper);
    }

    default public void pageConsumerByWrapper(Consumer<VizMcTaskTypeEoQueryWrapper> wrapperConsumer, Consumer<VizMcTaskTypeEo> consumer) {
        VizMcTaskTypeEoQueryWrapper queryWrapper = VizMcTaskTypeEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumerByWrapper(int pageSize, Consumer<VizMcTaskTypeEoQueryWrapper> wrapperConsumer, Consumer<VizMcTaskTypeEo> consumer) {
        VizMcTaskTypeEoQueryWrapper queryWrapper = VizMcTaskTypeEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }


    default public void pageConsumer(QueryWrapper<VizMcTaskTypeEo> queryWrapper, Consumer<VizMcTaskTypeEo> consumer) {
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(int pageSize, QueryWrapper<VizMcTaskTypeEo> queryWrapper, Consumer<VizMcTaskTypeEo> consumer) {
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(Function<Page<VizMcTaskTypeEo>, Page<VizMcTaskTypeEo>> consumerSupplier, Consumer<VizMcTaskTypeEo> consumer) {
        pageConsumer(1000, consumerSupplier, consumer);
    }

    default public void pageConsumer(int pageSize, Function<Page<VizMcTaskTypeEo>, Page<VizMcTaskTypeEo>> consumerSupplier, Consumer<VizMcTaskTypeEo> consumer) {
        Page<VizMcTaskTypeEo> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<VizMcTaskTypeEo> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    for (VizMcTaskTypeEo t : result) {
                        consumer.accept(t);
                    }
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }


    default public void pageConsumersByWrapper(Consumer<VizMcTaskTypeEoQueryWrapper> wrapperConsumer, Consumer<List<VizMcTaskTypeEo>> consumerList) {
        VizMcTaskTypeEoQueryWrapper queryWrapper = VizMcTaskTypeEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumersByWrapper(int pageSize, Consumer<VizMcTaskTypeEoQueryWrapper> wrapperConsumer, Consumer<List<VizMcTaskTypeEo>> consumerList) {
        VizMcTaskTypeEoQueryWrapper queryWrapper = VizMcTaskTypeEoQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }


    default public void pageConsumers(QueryWrapper<VizMcTaskTypeEo> queryWrapper, Consumer<List<VizMcTaskTypeEo>> consumerList) {
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(int pageSize, QueryWrapper<VizMcTaskTypeEo> queryWrapper, Consumer<List<VizMcTaskTypeEo>> consumerList) {
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(Function<Page<VizMcTaskTypeEo>, Page<VizMcTaskTypeEo>> consumerSupplier, Consumer<List<VizMcTaskTypeEo>> consumerList) {
        pageConsumers(1000, consumerSupplier, consumerList);
    }

    default public void pageConsumers(int pageSize, Function<Page<VizMcTaskTypeEo>, Page<VizMcTaskTypeEo>> consumerSupplier, Consumer<List<VizMcTaskTypeEo>> consumerList) {
        Page<VizMcTaskTypeEo> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<VizMcTaskTypeEo> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    consumerList.accept(result);
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public boolean queryAndUpdateById(QueryWrapper<VizMcTaskTypeEo> wrapper, VizMcTaskTypeEo up) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<VizMcTaskTypeEo> wrapper, VizMcTaskTypeEo up) {
        return queryAndUpdateById(pageSize, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<VizMcTaskTypeEo> wrapper, VizMcTaskTypeEo up, BiPredicate<VizMcTaskTypeEo, VizMcTaskTypeEo> updateFilter) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<VizMcTaskTypeEo> wrapper, VizMcTaskTypeEo up, BiPredicate<VizMcTaskTypeEo, VizMcTaskTypeEo> updateFilter) {
        return queryAndUpdateById(pageSize, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<VizMcTaskTypeEo> wrapper, VizMcTaskTypeEo up, BiConsumer<VizMcTaskTypeEo, VizMcTaskTypeEoUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, whereSet);
    }

    default public boolean queryAndUpdateById(QueryWrapper<VizMcTaskTypeEo> wrapper, VizMcTaskTypeEo up, BiPredicate<VizMcTaskTypeEo, VizMcTaskTypeEo> updateFilter, BiConsumer<VizMcTaskTypeEo, VizMcTaskTypeEoUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, whereSet);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<VizMcTaskTypeEo> wrapper, VizMcTaskTypeEo up, BiPredicate<VizMcTaskTypeEo, VizMcTaskTypeEo> updateFilter, BiConsumer<VizMcTaskTypeEo, VizMcTaskTypeEoUpdateWrapper> whereSet) {
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


    default public boolean removeByIds(Consumer<VizMcTaskTypeEoQueryWrapper> wrapper) {
        return removeByIds(1000, wrapper);
    }

    default public boolean removeByIds(int pageSize, Consumer<VizMcTaskTypeEoQueryWrapper> wrapper) {
        VizMcTaskTypeEoQueryWrapper removeWrapper = VizMcTaskTypeEoQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return removeByIds(pageSize, removeWrapper);
    }

    default public boolean removeByIds(VizMcTaskTypeEoQueryWrapper removeWrapper) {
        return removeByIds(1000,removeWrapper);
    }

    default public boolean removeByIds(int pageSize, VizMcTaskTypeEoQueryWrapper removeWrapper) {
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
