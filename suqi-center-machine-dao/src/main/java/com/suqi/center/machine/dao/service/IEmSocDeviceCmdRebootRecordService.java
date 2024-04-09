package com.suqi.center.machine.dao.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.suqi.center.machine.dao.entity.EmSocDeviceCmdRebootRecord;
import com.suqi.center.machine.dao.wrapper.EmSocDeviceCmdRebootRecordQueryWrapper;
import com.suqi.center.machine.dao.wrapper.EmSocDeviceCmdRebootRecordUpdateWrapper;

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
 * @author Administrator
 * @since 2023-12-20
 */
public interface IEmSocDeviceCmdRebootRecordService extends IService<EmSocDeviceCmdRebootRecord> {

    default long count(Consumer<EmSocDeviceCmdRebootRecordQueryWrapper> wrapperConsumer) {
        EmSocDeviceCmdRebootRecordQueryWrapper queryWrapper = EmSocDeviceCmdRebootRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return count(queryWrapper);
    }

    default public EmSocDeviceCmdRebootRecord selectOne(QueryWrapper<EmSocDeviceCmdRebootRecord> queryWrapper) {
        queryWrapper.last(" limit 1 ");
        return getOne(queryWrapper,false);
    }

    default public EmSocDeviceCmdRebootRecord selectOne(Consumer<EmSocDeviceCmdRebootRecordQueryWrapper> wrapperConsumer) {
          EmSocDeviceCmdRebootRecordQueryWrapper queryWrapper = EmSocDeviceCmdRebootRecordQueryWrapper.wrapper();
          wrapperConsumer.accept(queryWrapper);
          queryWrapper.last(" limit 1 ");
        return getOne(queryWrapper,false);
    }

    default public List<EmSocDeviceCmdRebootRecord> select(QueryWrapper<EmSocDeviceCmdRebootRecord> queryWrapper) {
        return list(queryWrapper);
    }

    default public List<EmSocDeviceCmdRebootRecord> select(Consumer<EmSocDeviceCmdRebootRecordQueryWrapper> wrapperConsumer) {
          EmSocDeviceCmdRebootRecordQueryWrapper queryWrapper = EmSocDeviceCmdRebootRecordQueryWrapper.wrapper();
          wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public List<EmSocDeviceCmdRebootRecord> list(Consumer<EmSocDeviceCmdRebootRecordQueryWrapper> wrapperConsumer) {
          EmSocDeviceCmdRebootRecordQueryWrapper queryWrapper = EmSocDeviceCmdRebootRecordQueryWrapper.wrapper();
          wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default  public boolean update(Consumer<EmSocDeviceCmdRebootRecordUpdateWrapper> wrapper){
        EmSocDeviceCmdRebootRecordUpdateWrapper updateWrapper = EmSocDeviceCmdRebootRecordUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return  update(updateWrapper);
    }

    default  public boolean update(EmSocDeviceCmdRebootRecord up,Consumer<EmSocDeviceCmdRebootRecordUpdateWrapper> wrapper){
        EmSocDeviceCmdRebootRecordUpdateWrapper updateWrapper = EmSocDeviceCmdRebootRecordUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return  update(up, updateWrapper);
    }

    default  public boolean update(Consumer<EmSocDeviceCmdRebootRecord> setUp,Consumer<EmSocDeviceCmdRebootRecordUpdateWrapper> wrapper){
        EmSocDeviceCmdRebootRecord up = new EmSocDeviceCmdRebootRecord();
        setUp.accept(up);
        EmSocDeviceCmdRebootRecordUpdateWrapper updateWrapper = EmSocDeviceCmdRebootRecordUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return  update(up, updateWrapper);
    }

    default  public boolean remove(Consumer<EmSocDeviceCmdRebootRecordQueryWrapper> wrapper){
        EmSocDeviceCmdRebootRecordQueryWrapper removeWrapper = EmSocDeviceCmdRebootRecordQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return  remove(removeWrapper);
    }

    default public Page<EmSocDeviceCmdRebootRecord> page(Page<EmSocDeviceCmdRebootRecord> page,Consumer<EmSocDeviceCmdRebootRecordQueryWrapper> wrapperConsumer) {
        EmSocDeviceCmdRebootRecordQueryWrapper queryWrapper = EmSocDeviceCmdRebootRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default Page<EmSocDeviceCmdRebootRecord> quickPageById(Page<EmSocDeviceCmdRebootRecord> page,long lastId, QueryWrapper<EmSocDeviceCmdRebootRecord> wrapper){
          return quickPageById(true,page,lastId,wrapper);
    }

    default Page<EmSocDeviceCmdRebootRecord> quickPageById(Page<EmSocDeviceCmdRebootRecord> page,long lastId,Consumer<EmSocDeviceCmdRebootRecordQueryWrapper> wrapperConsumer) {
          EmSocDeviceCmdRebootRecordQueryWrapper queryWrapper = EmSocDeviceCmdRebootRecordQueryWrapper.wrapper();
          wrapperConsumer.accept(queryWrapper);
          return quickPageById(true,page,lastId,queryWrapper);
    }

    default Page<EmSocDeviceCmdRebootRecord> quickPageById(boolean queryTotals,Page<EmSocDeviceCmdRebootRecord> page,long lastId, QueryWrapper<EmSocDeviceCmdRebootRecord> wrapper){
          return page(page, wrapper);
    }

    default Page<EmSocDeviceCmdRebootRecord> quickPage(Page<EmSocDeviceCmdRebootRecord> page,QueryWrapper<EmSocDeviceCmdRebootRecord> wrapper){
          return IService.super.page(page,wrapper);
    }

    default Page<EmSocDeviceCmdRebootRecord> page(Page<EmSocDeviceCmdRebootRecord> page,QueryWrapper<EmSocDeviceCmdRebootRecord> wrapper){
          return quickPage(page, wrapper);
    }


    default Page<EmSocDeviceCmdRebootRecord> quickPage(Page<EmSocDeviceCmdRebootRecord> page,Consumer<EmSocDeviceCmdRebootRecordQueryWrapper> wrapperConsumer) {
          EmSocDeviceCmdRebootRecordQueryWrapper queryWrapper = EmSocDeviceCmdRebootRecordQueryWrapper.wrapper();
           wrapperConsumer.accept(queryWrapper);
          return quickPage(page, queryWrapper);
    }

    default public void pageConsumerByWrapper(Consumer<EmSocDeviceCmdRebootRecordQueryWrapper> wrapperConsumer, Consumer<EmSocDeviceCmdRebootRecord> consumer) {
        EmSocDeviceCmdRebootRecordQueryWrapper queryWrapper = EmSocDeviceCmdRebootRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumerByWrapper(int pageSize, Consumer<EmSocDeviceCmdRebootRecordQueryWrapper> wrapperConsumer, Consumer<EmSocDeviceCmdRebootRecord> consumer) {
        EmSocDeviceCmdRebootRecordQueryWrapper queryWrapper = EmSocDeviceCmdRebootRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }


    default public void pageConsumer(QueryWrapper<EmSocDeviceCmdRebootRecord> queryWrapper, Consumer<EmSocDeviceCmdRebootRecord> consumer) {
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(int pageSize, QueryWrapper<EmSocDeviceCmdRebootRecord> queryWrapper, Consumer<EmSocDeviceCmdRebootRecord> consumer) {
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(Function<Page<EmSocDeviceCmdRebootRecord>, Page<EmSocDeviceCmdRebootRecord>> consumerSupplier, Consumer<EmSocDeviceCmdRebootRecord> consumer) {
        pageConsumer(1000, consumerSupplier, consumer);
    }

    default public void pageConsumer(int pageSize, Function<Page<EmSocDeviceCmdRebootRecord>, Page<EmSocDeviceCmdRebootRecord>> consumerSupplier, Consumer<EmSocDeviceCmdRebootRecord> consumer) {
        Page<EmSocDeviceCmdRebootRecord> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<EmSocDeviceCmdRebootRecord> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    for (EmSocDeviceCmdRebootRecord t : result) {
                        consumer.accept(t);
                    }
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }


    default public void pageConsumersByWrapper(Consumer<EmSocDeviceCmdRebootRecordQueryWrapper> wrapperConsumer, Consumer<List<EmSocDeviceCmdRebootRecord>> consumerList) {
        EmSocDeviceCmdRebootRecordQueryWrapper queryWrapper = EmSocDeviceCmdRebootRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumersByWrapper(int pageSize, Consumer<EmSocDeviceCmdRebootRecordQueryWrapper> wrapperConsumer, Consumer<List<EmSocDeviceCmdRebootRecord>> consumerList) {
        EmSocDeviceCmdRebootRecordQueryWrapper queryWrapper = EmSocDeviceCmdRebootRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }


    default public void pageConsumers(QueryWrapper<EmSocDeviceCmdRebootRecord> queryWrapper, Consumer<List<EmSocDeviceCmdRebootRecord>> consumerList) {
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(int pageSize, QueryWrapper<EmSocDeviceCmdRebootRecord> queryWrapper, Consumer<List<EmSocDeviceCmdRebootRecord>> consumerList) {
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(Function<Page<EmSocDeviceCmdRebootRecord>, Page<EmSocDeviceCmdRebootRecord>> consumerSupplier, Consumer<List<EmSocDeviceCmdRebootRecord>> consumerList) {
        pageConsumers(1000, consumerSupplier, consumerList);
    }

    default public void pageConsumers(int pageSize, Function<Page<EmSocDeviceCmdRebootRecord>, Page<EmSocDeviceCmdRebootRecord>> consumerSupplier, Consumer<List<EmSocDeviceCmdRebootRecord>> consumerList) {
        Page<EmSocDeviceCmdRebootRecord> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<EmSocDeviceCmdRebootRecord> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    consumerList.accept(result);
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public boolean queryAndUpdateById(QueryWrapper<EmSocDeviceCmdRebootRecord> wrapper, EmSocDeviceCmdRebootRecord up) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<EmSocDeviceCmdRebootRecord> wrapper, EmSocDeviceCmdRebootRecord up) {
        return queryAndUpdateById(pageSize, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<EmSocDeviceCmdRebootRecord> wrapper, EmSocDeviceCmdRebootRecord up, BiPredicate<EmSocDeviceCmdRebootRecord, EmSocDeviceCmdRebootRecord> updateFilter) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<EmSocDeviceCmdRebootRecord> wrapper, EmSocDeviceCmdRebootRecord up, BiPredicate<EmSocDeviceCmdRebootRecord, EmSocDeviceCmdRebootRecord> updateFilter) {
        return queryAndUpdateById(pageSize, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<EmSocDeviceCmdRebootRecord> wrapper, EmSocDeviceCmdRebootRecord up, BiConsumer<EmSocDeviceCmdRebootRecord, EmSocDeviceCmdRebootRecordUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, whereSet);
    }

    default public boolean queryAndUpdateById(QueryWrapper<EmSocDeviceCmdRebootRecord> wrapper, EmSocDeviceCmdRebootRecord up, BiPredicate<EmSocDeviceCmdRebootRecord, EmSocDeviceCmdRebootRecord> updateFilter, BiConsumer<EmSocDeviceCmdRebootRecord, EmSocDeviceCmdRebootRecordUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, whereSet);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<EmSocDeviceCmdRebootRecord> wrapper, EmSocDeviceCmdRebootRecord up, BiPredicate<EmSocDeviceCmdRebootRecord, EmSocDeviceCmdRebootRecord> updateFilter, BiConsumer<EmSocDeviceCmdRebootRecord, EmSocDeviceCmdRebootRecordUpdateWrapper> whereSet) {
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


    default public boolean removeByIds(Consumer<EmSocDeviceCmdRebootRecordQueryWrapper> wrapper) {
        return removeByIds(1000, wrapper);
    }

    default public boolean removeByIds(int pageSize, Consumer<EmSocDeviceCmdRebootRecordQueryWrapper> wrapper) {
        EmSocDeviceCmdRebootRecordQueryWrapper removeWrapper = EmSocDeviceCmdRebootRecordQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return removeByIds(pageSize, removeWrapper);
    }

    default public boolean removeByIds(EmSocDeviceCmdRebootRecordQueryWrapper removeWrapper) {
        return removeByIds(1000,removeWrapper);
    }

    default public boolean removeByIds(int pageSize, EmSocDeviceCmdRebootRecordQueryWrapper removeWrapper) {
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
