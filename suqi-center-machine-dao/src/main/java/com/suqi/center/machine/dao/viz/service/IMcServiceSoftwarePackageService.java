package com.suqi.center.machine.dao.viz.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.suqi.center.machine.dao.viz.entity.McServiceSoftwarePackage;
import com.suqi.center.machine.dao.viz.wrapper.McServiceSoftwarePackageQueryWrapper;
import com.suqi.center.machine.dao.viz.wrapper.McServiceSoftwarePackageUpdateWrapper;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * <p>
 * 云机端软件包表 服务类
 * </p>
 *
 * @author 18374
 * @since 2023-07-25
 */
public interface IMcServiceSoftwarePackageService extends IService<McServiceSoftwarePackage> {

    default long count(Consumer<McServiceSoftwarePackageQueryWrapper> wrapperConsumer) {
        McServiceSoftwarePackageQueryWrapper queryWrapper = McServiceSoftwarePackageQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return count(queryWrapper);
    }

    default public McServiceSoftwarePackage selectOne(Consumer<McServiceSoftwarePackageQueryWrapper> wrapperConsumer) {
          McServiceSoftwarePackageQueryWrapper queryWrapper = McServiceSoftwarePackageQueryWrapper.wrapper();
          wrapperConsumer.accept(queryWrapper);
          queryWrapper.last(" limit 1 ");
        return getOne(queryWrapper,false);
    }

    default public List<McServiceSoftwarePackage> select(Consumer<McServiceSoftwarePackageQueryWrapper> wrapperConsumer) {
          McServiceSoftwarePackageQueryWrapper queryWrapper = McServiceSoftwarePackageQueryWrapper.wrapper();
          wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public List<McServiceSoftwarePackage> list(Consumer<McServiceSoftwarePackageQueryWrapper> wrapperConsumer) {
          McServiceSoftwarePackageQueryWrapper queryWrapper = McServiceSoftwarePackageQueryWrapper.wrapper();
          wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default  public boolean update(Consumer<McServiceSoftwarePackageUpdateWrapper> wrapper){
        McServiceSoftwarePackageUpdateWrapper updateWrapper = McServiceSoftwarePackageUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return  update(updateWrapper);
    }

    default  public boolean update(McServiceSoftwarePackage up,Consumer<McServiceSoftwarePackageUpdateWrapper> wrapper){
        McServiceSoftwarePackageUpdateWrapper updateWrapper = McServiceSoftwarePackageUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return  update(up, updateWrapper);
    }

    default  public boolean update(Consumer<McServiceSoftwarePackage> setUp,Consumer<McServiceSoftwarePackageUpdateWrapper> wrapper){
        McServiceSoftwarePackage up = new McServiceSoftwarePackage();
        setUp.accept(up);
        McServiceSoftwarePackageUpdateWrapper updateWrapper = McServiceSoftwarePackageUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return  update(up, updateWrapper);
    }

    default  public boolean remove(Consumer<McServiceSoftwarePackageQueryWrapper> wrapper){
        McServiceSoftwarePackageQueryWrapper removeWrapper = McServiceSoftwarePackageQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return  remove(removeWrapper);
    }

    default public Page<McServiceSoftwarePackage> page(Page<McServiceSoftwarePackage> page,Consumer<McServiceSoftwarePackageQueryWrapper> wrapperConsumer) {
        McServiceSoftwarePackageQueryWrapper queryWrapper = McServiceSoftwarePackageQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default Page<McServiceSoftwarePackage> quickPageById(Page<McServiceSoftwarePackage> page,long lastId, QueryWrapper<McServiceSoftwarePackage> wrapper){
          return quickPageById(true,page,lastId,wrapper);
    }

    default Page<McServiceSoftwarePackage> quickPageById(Page<McServiceSoftwarePackage> page,long lastId,Consumer<McServiceSoftwarePackageQueryWrapper> wrapperConsumer) {
          McServiceSoftwarePackageQueryWrapper queryWrapper = McServiceSoftwarePackageQueryWrapper.wrapper();
          wrapperConsumer.accept(queryWrapper);
          return quickPageById(true,page,lastId,queryWrapper);
    }

    default Page<McServiceSoftwarePackage> quickPageById(boolean queryTotals,Page<McServiceSoftwarePackage> page,long lastId, QueryWrapper<McServiceSoftwarePackage> wrapper){
          return page(page, wrapper);
    }

    default Page<McServiceSoftwarePackage> quickPage(Page<McServiceSoftwarePackage> page,QueryWrapper<McServiceSoftwarePackage> wrapper){
          return IService.super.page(page,wrapper);
    }

    default Page<McServiceSoftwarePackage> page(Page<McServiceSoftwarePackage> page,QueryWrapper<McServiceSoftwarePackage> wrapper){
          return quickPage(page, wrapper);
    }


    default Page<McServiceSoftwarePackage> quickPage(Page<McServiceSoftwarePackage> page,Consumer<McServiceSoftwarePackageQueryWrapper> wrapperConsumer) {
          McServiceSoftwarePackageQueryWrapper queryWrapper = McServiceSoftwarePackageQueryWrapper.wrapper();
           wrapperConsumer.accept(queryWrapper);
          return quickPage(page, queryWrapper);
    }

    default public void pageConsumerByWrapper(Consumer<McServiceSoftwarePackageQueryWrapper> wrapperConsumer, Consumer<McServiceSoftwarePackage> consumer) {
        McServiceSoftwarePackageQueryWrapper queryWrapper = McServiceSoftwarePackageQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumerByWrapper(int pageSize, Consumer<McServiceSoftwarePackageQueryWrapper> wrapperConsumer, Consumer<McServiceSoftwarePackage> consumer) {
        McServiceSoftwarePackageQueryWrapper queryWrapper = McServiceSoftwarePackageQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }


    default public void pageConsumer(QueryWrapper<McServiceSoftwarePackage> queryWrapper, Consumer<McServiceSoftwarePackage> consumer) {
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(int pageSize, QueryWrapper<McServiceSoftwarePackage> queryWrapper, Consumer<McServiceSoftwarePackage> consumer) {
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(Function<Page<McServiceSoftwarePackage>, Page<McServiceSoftwarePackage>> consumerSupplier, Consumer<McServiceSoftwarePackage> consumer) {
        pageConsumer(1000, consumerSupplier, consumer);
    }

    default public void pageConsumer(int pageSize, Function<Page<McServiceSoftwarePackage>, Page<McServiceSoftwarePackage>> consumerSupplier, Consumer<McServiceSoftwarePackage> consumer) {
        Page<McServiceSoftwarePackage> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<McServiceSoftwarePackage> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    for (McServiceSoftwarePackage t : result) {
                        consumer.accept(t);
                    }
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }


    default public void pageConsumersByWrapper(Consumer<McServiceSoftwarePackageQueryWrapper> wrapperConsumer, Consumer<List<McServiceSoftwarePackage>> consumerList) {
        McServiceSoftwarePackageQueryWrapper queryWrapper = McServiceSoftwarePackageQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumersByWrapper(int pageSize, Consumer<McServiceSoftwarePackageQueryWrapper> wrapperConsumer, Consumer<List<McServiceSoftwarePackage>> consumerList) {
        McServiceSoftwarePackageQueryWrapper queryWrapper = McServiceSoftwarePackageQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }


    default public void pageConsumers(QueryWrapper<McServiceSoftwarePackage> queryWrapper, Consumer<List<McServiceSoftwarePackage>> consumerList) {
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(int pageSize, QueryWrapper<McServiceSoftwarePackage> queryWrapper, Consumer<List<McServiceSoftwarePackage>> consumerList) {
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(Function<Page<McServiceSoftwarePackage>, Page<McServiceSoftwarePackage>> consumerSupplier, Consumer<List<McServiceSoftwarePackage>> consumerList) {
        pageConsumers(1000, consumerSupplier, consumerList);
    }

    default public void pageConsumers(int pageSize, Function<Page<McServiceSoftwarePackage>, Page<McServiceSoftwarePackage>> consumerSupplier, Consumer<List<McServiceSoftwarePackage>> consumerList) {
        Page<McServiceSoftwarePackage> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<McServiceSoftwarePackage> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    consumerList.accept(result);
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }


    default public boolean queryAndUpdateById(QueryWrapper<McServiceSoftwarePackage> wrapper, McServiceSoftwarePackage up) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<McServiceSoftwarePackage> wrapper, McServiceSoftwarePackage up) {
        return queryAndUpdateById(pageSize, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<McServiceSoftwarePackage> wrapper, McServiceSoftwarePackage up, BiPredicate<McServiceSoftwarePackage, McServiceSoftwarePackage> updateFilter) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<McServiceSoftwarePackage> wrapper, McServiceSoftwarePackage up, BiPredicate<McServiceSoftwarePackage, McServiceSoftwarePackage> updateFilter) {
        return queryAndUpdateById(pageSize, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<McServiceSoftwarePackage> wrapper, McServiceSoftwarePackage up, BiConsumer<McServiceSoftwarePackage, McServiceSoftwarePackageUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, whereSet);
    }

    default public boolean queryAndUpdateById(QueryWrapper<McServiceSoftwarePackage> wrapper, McServiceSoftwarePackage up, BiPredicate<McServiceSoftwarePackage, McServiceSoftwarePackage> updateFilter, BiConsumer<McServiceSoftwarePackage, McServiceSoftwarePackageUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, whereSet);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<McServiceSoftwarePackage> wrapper, McServiceSoftwarePackage up, BiPredicate<McServiceSoftwarePackage, McServiceSoftwarePackage> updateFilter, BiConsumer<McServiceSoftwarePackage, McServiceSoftwarePackageUpdateWrapper> whereSet) {
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

    default public boolean removeByIds(Consumer<McServiceSoftwarePackageQueryWrapper> wrapper) {
        return removeByIds(1000, wrapper);
    }

    default public boolean removeByIds(int pageSize, Consumer<McServiceSoftwarePackageQueryWrapper> wrapper) {
        McServiceSoftwarePackageQueryWrapper removeWrapper = McServiceSoftwarePackageQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return removeByIds(pageSize, removeWrapper);
    }

    default public boolean removeByIds(McServiceSoftwarePackageQueryWrapper removeWrapper) {
        return removeByIds(1000,removeWrapper);
    }

    default public boolean removeByIds(int pageSize, McServiceSoftwarePackageQueryWrapper removeWrapper) {
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
