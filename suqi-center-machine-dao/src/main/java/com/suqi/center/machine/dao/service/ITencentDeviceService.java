package com.suqi.center.machine.dao.service;

import com.suqi.center.machine.dao.entity.TencentDevice;
import com.suqi.center.machine.dao.wrapper.TencentDeviceQueryWrapper;
import com.suqi.center.machine.dao.wrapper.TencentDeviceUpdateWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * <p>
 * 腾讯设备表 服务类
 * </p>
 *
 * @author PC001
 * @since 2023-06-14
 */
public interface ITencentDeviceService extends IService<TencentDevice> {

    default long count(Consumer<TencentDeviceQueryWrapper> wrapperConsumer) {
        TencentDeviceQueryWrapper queryWrapper = TencentDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return count(queryWrapper);
    }

    default  public boolean update(Consumer<TencentDeviceUpdateWrapper> wrapper){
        TencentDeviceUpdateWrapper updateWrapper = TencentDeviceUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return  update(updateWrapper);
    }

    default  public boolean update(TencentDevice up,Consumer<TencentDeviceUpdateWrapper> wrapper){
        TencentDeviceUpdateWrapper updateWrapper = TencentDeviceUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return  update(up, updateWrapper);
    }

    default  public boolean update(Consumer<TencentDevice> setUp,Consumer<TencentDeviceUpdateWrapper> wrapper){
        TencentDevice up = new TencentDevice();
        setUp.accept(up);
        TencentDeviceUpdateWrapper updateWrapper = TencentDeviceUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return  update(up, updateWrapper);
    }

    default  public boolean remove(Consumer<TencentDeviceQueryWrapper> wrapper){
        TencentDeviceQueryWrapper removeWrapper = TencentDeviceQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return  remove(removeWrapper);
    }

    default public Page<TencentDevice> page(Page<TencentDevice> page,Consumer<TencentDeviceQueryWrapper> wrapperConsumer) {
        TencentDeviceQueryWrapper queryWrapper = TencentDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default Page<TencentDevice> quickPageById(Page<TencentDevice> page,long lastId, QueryWrapper<TencentDevice> wrapper){
          return quickPageById(true,page,lastId,wrapper);
    }

    default Page<TencentDevice> quickPageById(Page<TencentDevice> page,long lastId,Consumer<TencentDeviceQueryWrapper> wrapperConsumer) {
          TencentDeviceQueryWrapper queryWrapper = TencentDeviceQueryWrapper.wrapper();
          wrapperConsumer.accept(queryWrapper);
          return quickPageById(true,page,lastId,queryWrapper);
    }

    default Page<TencentDevice> quickPageById(boolean queryTotals,Page<TencentDevice> page,long lastId, QueryWrapper<TencentDevice> wrapper){
          return page(page, wrapper);
    }

    default Page<TencentDevice> quickPage(Page<TencentDevice> page,QueryWrapper<TencentDevice> wrapper){
          return page(page, wrapper);
    }

    default Page<TencentDevice> quickPage(Page<TencentDevice> page,Consumer<TencentDeviceQueryWrapper> wrapperConsumer) {
          TencentDeviceQueryWrapper queryWrapper = TencentDeviceQueryWrapper.wrapper();
           wrapperConsumer.accept(queryWrapper);
          return quickPage(page, queryWrapper);
    }

    default public void pageConsumerByWrapper(Consumer<TencentDeviceQueryWrapper> wrapperConsumer, Consumer<TencentDevice> consumer) {
        TencentDeviceQueryWrapper queryWrapper = TencentDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumerByWrapper(int pageSize, Consumer<TencentDeviceQueryWrapper> wrapperConsumer, Consumer<TencentDevice> consumer) {
        TencentDeviceQueryWrapper queryWrapper = TencentDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }


    default public void pageConsumer(QueryWrapper<TencentDevice> queryWrapper, Consumer<TencentDevice> consumer) {
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(int pageSize, QueryWrapper<TencentDevice> queryWrapper, Consumer<TencentDevice> consumer) {
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(Function<Page<TencentDevice>, Page<TencentDevice>> consumerSupplier, Consumer<TencentDevice> consumer) {
        pageConsumer(1000, consumerSupplier, consumer);
    }

    default public void pageConsumer(int pageSize, Function<Page<TencentDevice>, Page<TencentDevice>> consumerSupplier, Consumer<TencentDevice> consumer) {
        Page<TencentDevice> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<TencentDevice> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    for (TencentDevice t : result) {
                        consumer.accept(t);
                    }
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }


    default public void pageConsumersByWrapper(Consumer<TencentDeviceQueryWrapper> wrapperConsumer, Consumer<List<TencentDevice>> consumerList) {
        TencentDeviceQueryWrapper queryWrapper = TencentDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumersByWrapper(int pageSize, Consumer<TencentDeviceQueryWrapper> wrapperConsumer, Consumer<List<TencentDevice>> consumerList) {
        TencentDeviceQueryWrapper queryWrapper = TencentDeviceQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }


    default public void pageConsumers(QueryWrapper<TencentDevice> queryWrapper, Consumer<List<TencentDevice>> consumerList) {
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(int pageSize, QueryWrapper<TencentDevice> queryWrapper, Consumer<List<TencentDevice>> consumerList) {
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(Function<Page<TencentDevice>, Page<TencentDevice>> consumerSupplier, Consumer<List<TencentDevice>> consumerList) {
        pageConsumers(1000, consumerSupplier, consumerList);
    }

    default public void pageConsumers(int pageSize, Function<Page<TencentDevice>, Page<TencentDevice>> consumerSupplier, Consumer<List<TencentDevice>> consumerList) {
        Page<TencentDevice> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<TencentDevice> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    consumerList.accept(result);
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }


    default public boolean queryAndUpdateById(QueryWrapper<TencentDevice> wrapper, TencentDevice up) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<TencentDevice> wrapper, TencentDevice up) {
        return queryAndUpdateById(pageSize, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<TencentDevice> wrapper, TencentDevice up, BiPredicate<TencentDevice, TencentDevice> updateFilter) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<TencentDevice> wrapper, TencentDevice up, BiPredicate<TencentDevice, TencentDevice> updateFilter) {
        return queryAndUpdateById(pageSize, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<TencentDevice> wrapper, TencentDevice up, BiConsumer<TencentDevice, TencentDeviceUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, whereSet);
    }

    default public boolean queryAndUpdateById(QueryWrapper<TencentDevice> wrapper, TencentDevice up, BiPredicate<TencentDevice, TencentDevice> updateFilter, BiConsumer<TencentDevice, TencentDeviceUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, whereSet);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<TencentDevice> wrapper, TencentDevice up, BiPredicate<TencentDevice, TencentDevice> updateFilter, BiConsumer<TencentDevice, TencentDeviceUpdateWrapper> whereSet) {
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

    default public boolean removeByIds(Consumer<TencentDeviceQueryWrapper> wrapper) {
        return removeByIds(1000, wrapper);
    }

    default public boolean removeByIds(int pageSize, Consumer<TencentDeviceQueryWrapper> wrapper) {
        TencentDeviceQueryWrapper removeWrapper = TencentDeviceQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
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
