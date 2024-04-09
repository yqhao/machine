package com.suqi.center.machine.dao.viz.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.suqi.center.machine.dao.viz.entity.McServiceSoftwarePackageType;
import com.suqi.center.machine.dao.viz.wrapper.McServiceSoftwarePackageTypeQueryWrapper;
import com.suqi.center.machine.dao.viz.wrapper.McServiceSoftwarePackageTypeUpdateWrapper;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * <p>
 * 云机端软件包类型表 服务类
 * </p>
 *
 * @author 18374
 * @since 2023-07-25
 */
public interface IMcServiceSoftwarePackageTypeService extends IService<McServiceSoftwarePackageType> {

    default long count(Consumer<McServiceSoftwarePackageTypeQueryWrapper> wrapperConsumer) {
        McServiceSoftwarePackageTypeQueryWrapper queryWrapper = McServiceSoftwarePackageTypeQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return count(queryWrapper);
    }

    default public McServiceSoftwarePackageType selectOne(Consumer<McServiceSoftwarePackageTypeQueryWrapper> wrapperConsumer) {
          McServiceSoftwarePackageTypeQueryWrapper queryWrapper = McServiceSoftwarePackageTypeQueryWrapper.wrapper();
          wrapperConsumer.accept(queryWrapper);
          queryWrapper.last(" limit 1 ");
        return getOne(queryWrapper,false);
    }

    default public List<McServiceSoftwarePackageType> select(Consumer<McServiceSoftwarePackageTypeQueryWrapper> wrapperConsumer) {
          McServiceSoftwarePackageTypeQueryWrapper queryWrapper = McServiceSoftwarePackageTypeQueryWrapper.wrapper();
          wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public List<McServiceSoftwarePackageType> list(Consumer<McServiceSoftwarePackageTypeQueryWrapper> wrapperConsumer) {
          McServiceSoftwarePackageTypeQueryWrapper queryWrapper = McServiceSoftwarePackageTypeQueryWrapper.wrapper();
          wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default  public boolean update(Consumer<McServiceSoftwarePackageTypeUpdateWrapper> wrapper){
        McServiceSoftwarePackageTypeUpdateWrapper updateWrapper = McServiceSoftwarePackageTypeUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return  update(updateWrapper);
    }

    default  public boolean update(McServiceSoftwarePackageType up,Consumer<McServiceSoftwarePackageTypeUpdateWrapper> wrapper){
        McServiceSoftwarePackageTypeUpdateWrapper updateWrapper = McServiceSoftwarePackageTypeUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return  update(up, updateWrapper);
    }

    default  public boolean update(Consumer<McServiceSoftwarePackageType> setUp,Consumer<McServiceSoftwarePackageTypeUpdateWrapper> wrapper){
        McServiceSoftwarePackageType up = new McServiceSoftwarePackageType();
        setUp.accept(up);
        McServiceSoftwarePackageTypeUpdateWrapper updateWrapper = McServiceSoftwarePackageTypeUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return  update(up, updateWrapper);
    }

    default  public boolean remove(Consumer<McServiceSoftwarePackageTypeQueryWrapper> wrapper){
        McServiceSoftwarePackageTypeQueryWrapper removeWrapper = McServiceSoftwarePackageTypeQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return  remove(removeWrapper);
    }

    default public Page<McServiceSoftwarePackageType> page(Page<McServiceSoftwarePackageType> page,Consumer<McServiceSoftwarePackageTypeQueryWrapper> wrapperConsumer) {
        McServiceSoftwarePackageTypeQueryWrapper queryWrapper = McServiceSoftwarePackageTypeQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default Page<McServiceSoftwarePackageType> quickPageById(Page<McServiceSoftwarePackageType> page,long lastId, QueryWrapper<McServiceSoftwarePackageType> wrapper){
          return quickPageById(true,page,lastId,wrapper);
    }

    default Page<McServiceSoftwarePackageType> quickPageById(Page<McServiceSoftwarePackageType> page,long lastId,Consumer<McServiceSoftwarePackageTypeQueryWrapper> wrapperConsumer) {
          McServiceSoftwarePackageTypeQueryWrapper queryWrapper = McServiceSoftwarePackageTypeQueryWrapper.wrapper();
          wrapperConsumer.accept(queryWrapper);
          return quickPageById(true,page,lastId,queryWrapper);
    }

    default Page<McServiceSoftwarePackageType> quickPageById(boolean queryTotals,Page<McServiceSoftwarePackageType> page,long lastId, QueryWrapper<McServiceSoftwarePackageType> wrapper){
          return page(page, wrapper);
    }

    default Page<McServiceSoftwarePackageType> quickPage(Page<McServiceSoftwarePackageType> page,QueryWrapper<McServiceSoftwarePackageType> wrapper){
          return IService.super.page(page,wrapper);
    }

    default Page<McServiceSoftwarePackageType> page(Page<McServiceSoftwarePackageType> page,QueryWrapper<McServiceSoftwarePackageType> wrapper){
          return quickPage(page, wrapper);
    }


    default Page<McServiceSoftwarePackageType> quickPage(Page<McServiceSoftwarePackageType> page,Consumer<McServiceSoftwarePackageTypeQueryWrapper> wrapperConsumer) {
          McServiceSoftwarePackageTypeQueryWrapper queryWrapper = McServiceSoftwarePackageTypeQueryWrapper.wrapper();
           wrapperConsumer.accept(queryWrapper);
          return quickPage(page, queryWrapper);
    }

    default public void pageConsumerByWrapper(Consumer<McServiceSoftwarePackageTypeQueryWrapper> wrapperConsumer, Consumer<McServiceSoftwarePackageType> consumer) {
        McServiceSoftwarePackageTypeQueryWrapper queryWrapper = McServiceSoftwarePackageTypeQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumerByWrapper(int pageSize, Consumer<McServiceSoftwarePackageTypeQueryWrapper> wrapperConsumer, Consumer<McServiceSoftwarePackageType> consumer) {
        McServiceSoftwarePackageTypeQueryWrapper queryWrapper = McServiceSoftwarePackageTypeQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }


    default public void pageConsumer(QueryWrapper<McServiceSoftwarePackageType> queryWrapper, Consumer<McServiceSoftwarePackageType> consumer) {
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(int pageSize, QueryWrapper<McServiceSoftwarePackageType> queryWrapper, Consumer<McServiceSoftwarePackageType> consumer) {
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(Function<Page<McServiceSoftwarePackageType>, Page<McServiceSoftwarePackageType>> consumerSupplier, Consumer<McServiceSoftwarePackageType> consumer) {
        pageConsumer(1000, consumerSupplier, consumer);
    }

    default public void pageConsumer(int pageSize, Function<Page<McServiceSoftwarePackageType>, Page<McServiceSoftwarePackageType>> consumerSupplier, Consumer<McServiceSoftwarePackageType> consumer) {
        Page<McServiceSoftwarePackageType> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<McServiceSoftwarePackageType> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    for (McServiceSoftwarePackageType t : result) {
                        consumer.accept(t);
                    }
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }


    default public void pageConsumersByWrapper(Consumer<McServiceSoftwarePackageTypeQueryWrapper> wrapperConsumer, Consumer<List<McServiceSoftwarePackageType>> consumerList) {
        McServiceSoftwarePackageTypeQueryWrapper queryWrapper = McServiceSoftwarePackageTypeQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumersByWrapper(int pageSize, Consumer<McServiceSoftwarePackageTypeQueryWrapper> wrapperConsumer, Consumer<List<McServiceSoftwarePackageType>> consumerList) {
        McServiceSoftwarePackageTypeQueryWrapper queryWrapper = McServiceSoftwarePackageTypeQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }


    default public void pageConsumers(QueryWrapper<McServiceSoftwarePackageType> queryWrapper, Consumer<List<McServiceSoftwarePackageType>> consumerList) {
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(int pageSize, QueryWrapper<McServiceSoftwarePackageType> queryWrapper, Consumer<List<McServiceSoftwarePackageType>> consumerList) {
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(Function<Page<McServiceSoftwarePackageType>, Page<McServiceSoftwarePackageType>> consumerSupplier, Consumer<List<McServiceSoftwarePackageType>> consumerList) {
        pageConsumers(1000, consumerSupplier, consumerList);
    }

    default public void pageConsumers(int pageSize, Function<Page<McServiceSoftwarePackageType>, Page<McServiceSoftwarePackageType>> consumerSupplier, Consumer<List<McServiceSoftwarePackageType>> consumerList) {
        Page<McServiceSoftwarePackageType> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<McServiceSoftwarePackageType> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    consumerList.accept(result);
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }


    default public boolean queryAndUpdateById(QueryWrapper<McServiceSoftwarePackageType> wrapper, McServiceSoftwarePackageType up) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<McServiceSoftwarePackageType> wrapper, McServiceSoftwarePackageType up) {
        return queryAndUpdateById(pageSize, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<McServiceSoftwarePackageType> wrapper, McServiceSoftwarePackageType up, BiPredicate<McServiceSoftwarePackageType, McServiceSoftwarePackageType> updateFilter) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<McServiceSoftwarePackageType> wrapper, McServiceSoftwarePackageType up, BiPredicate<McServiceSoftwarePackageType, McServiceSoftwarePackageType> updateFilter) {
        return queryAndUpdateById(pageSize, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<McServiceSoftwarePackageType> wrapper, McServiceSoftwarePackageType up, BiConsumer<McServiceSoftwarePackageType, McServiceSoftwarePackageTypeUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, whereSet);
    }

    default public boolean queryAndUpdateById(QueryWrapper<McServiceSoftwarePackageType> wrapper, McServiceSoftwarePackageType up, BiPredicate<McServiceSoftwarePackageType, McServiceSoftwarePackageType> updateFilter, BiConsumer<McServiceSoftwarePackageType, McServiceSoftwarePackageTypeUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, whereSet);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<McServiceSoftwarePackageType> wrapper, McServiceSoftwarePackageType up, BiPredicate<McServiceSoftwarePackageType, McServiceSoftwarePackageType> updateFilter, BiConsumer<McServiceSoftwarePackageType, McServiceSoftwarePackageTypeUpdateWrapper> whereSet) {
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

    default public boolean removeByIds(Consumer<McServiceSoftwarePackageTypeQueryWrapper> wrapper) {
        return removeByIds(1000, wrapper);
    }

    default public boolean removeByIds(int pageSize, Consumer<McServiceSoftwarePackageTypeQueryWrapper> wrapper) {
        McServiceSoftwarePackageTypeQueryWrapper removeWrapper = McServiceSoftwarePackageTypeQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return removeByIds(pageSize, removeWrapper);
    }

    default public boolean removeByIds(McServiceSoftwarePackageTypeQueryWrapper removeWrapper) {
        return removeByIds(1000,removeWrapper);
    }

    default public boolean removeByIds(int pageSize, McServiceSoftwarePackageTypeQueryWrapper removeWrapper) {
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
