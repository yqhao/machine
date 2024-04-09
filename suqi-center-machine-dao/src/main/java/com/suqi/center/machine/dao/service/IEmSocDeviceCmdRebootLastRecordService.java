package com.suqi.center.machine.dao.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.suqi.center.machine.dao.entity.EmSocDeviceCmdRebootLastRecord;
import com.suqi.center.machine.dao.wrapper.EmSocDeviceCmdRebootLastRecordQueryWrapper;
import com.suqi.center.machine.dao.wrapper.EmSocDeviceCmdRebootLastRecordUpdateWrapper;

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
public interface IEmSocDeviceCmdRebootLastRecordService extends IService<EmSocDeviceCmdRebootLastRecord> {

    default long count(Consumer<EmSocDeviceCmdRebootLastRecordQueryWrapper> wrapperConsumer) {
        EmSocDeviceCmdRebootLastRecordQueryWrapper queryWrapper = EmSocDeviceCmdRebootLastRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return count(queryWrapper);
    }

    default public EmSocDeviceCmdRebootLastRecord selectOne(QueryWrapper<EmSocDeviceCmdRebootLastRecord> queryWrapper) {
        queryWrapper.last(" limit 1 ");
        return getOne(queryWrapper,false);
    }

    default public EmSocDeviceCmdRebootLastRecord selectOne(Consumer<EmSocDeviceCmdRebootLastRecordQueryWrapper> wrapperConsumer) {
          EmSocDeviceCmdRebootLastRecordQueryWrapper queryWrapper = EmSocDeviceCmdRebootLastRecordQueryWrapper.wrapper();
          wrapperConsumer.accept(queryWrapper);
          queryWrapper.last(" limit 1 ");
        return getOne(queryWrapper,false);
    }

    default public List<EmSocDeviceCmdRebootLastRecord> select(QueryWrapper<EmSocDeviceCmdRebootLastRecord> queryWrapper) {
        return list(queryWrapper);
    }

    default public List<EmSocDeviceCmdRebootLastRecord> select(Consumer<EmSocDeviceCmdRebootLastRecordQueryWrapper> wrapperConsumer) {
          EmSocDeviceCmdRebootLastRecordQueryWrapper queryWrapper = EmSocDeviceCmdRebootLastRecordQueryWrapper.wrapper();
          wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public List<EmSocDeviceCmdRebootLastRecord> list(Consumer<EmSocDeviceCmdRebootLastRecordQueryWrapper> wrapperConsumer) {
          EmSocDeviceCmdRebootLastRecordQueryWrapper queryWrapper = EmSocDeviceCmdRebootLastRecordQueryWrapper.wrapper();
          wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default  public boolean update(Consumer<EmSocDeviceCmdRebootLastRecordUpdateWrapper> wrapper){
        EmSocDeviceCmdRebootLastRecordUpdateWrapper updateWrapper = EmSocDeviceCmdRebootLastRecordUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return  update(updateWrapper);
    }

    default  public boolean update(EmSocDeviceCmdRebootLastRecord up,Consumer<EmSocDeviceCmdRebootLastRecordUpdateWrapper> wrapper){
        EmSocDeviceCmdRebootLastRecordUpdateWrapper updateWrapper = EmSocDeviceCmdRebootLastRecordUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return  update(up, updateWrapper);
    }

    default  public boolean update(Consumer<EmSocDeviceCmdRebootLastRecord> setUp,Consumer<EmSocDeviceCmdRebootLastRecordUpdateWrapper> wrapper){
        EmSocDeviceCmdRebootLastRecord up = new EmSocDeviceCmdRebootLastRecord();
        setUp.accept(up);
        EmSocDeviceCmdRebootLastRecordUpdateWrapper updateWrapper = EmSocDeviceCmdRebootLastRecordUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return  update(up, updateWrapper);
    }

    default  public boolean remove(Consumer<EmSocDeviceCmdRebootLastRecordQueryWrapper> wrapper){
        EmSocDeviceCmdRebootLastRecordQueryWrapper removeWrapper = EmSocDeviceCmdRebootLastRecordQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return  remove(removeWrapper);
    }

    default public Page<EmSocDeviceCmdRebootLastRecord> page(Page<EmSocDeviceCmdRebootLastRecord> page,Consumer<EmSocDeviceCmdRebootLastRecordQueryWrapper> wrapperConsumer) {
        EmSocDeviceCmdRebootLastRecordQueryWrapper queryWrapper = EmSocDeviceCmdRebootLastRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default Page<EmSocDeviceCmdRebootLastRecord> quickPageById(Page<EmSocDeviceCmdRebootLastRecord> page,long lastId, QueryWrapper<EmSocDeviceCmdRebootLastRecord> wrapper){
          return quickPageById(true,page,lastId,wrapper);
    }

    default Page<EmSocDeviceCmdRebootLastRecord> quickPageById(Page<EmSocDeviceCmdRebootLastRecord> page,long lastId,Consumer<EmSocDeviceCmdRebootLastRecordQueryWrapper> wrapperConsumer) {
          EmSocDeviceCmdRebootLastRecordQueryWrapper queryWrapper = EmSocDeviceCmdRebootLastRecordQueryWrapper.wrapper();
          wrapperConsumer.accept(queryWrapper);
          return quickPageById(true,page,lastId,queryWrapper);
    }

    default Page<EmSocDeviceCmdRebootLastRecord> quickPageById(boolean queryTotals,Page<EmSocDeviceCmdRebootLastRecord> page,long lastId, QueryWrapper<EmSocDeviceCmdRebootLastRecord> wrapper){
          return page(page, wrapper);
    }

    default Page<EmSocDeviceCmdRebootLastRecord> quickPage(Page<EmSocDeviceCmdRebootLastRecord> page,QueryWrapper<EmSocDeviceCmdRebootLastRecord> wrapper){
          return IService.super.page(page,wrapper);
    }

    default Page<EmSocDeviceCmdRebootLastRecord> page(Page<EmSocDeviceCmdRebootLastRecord> page,QueryWrapper<EmSocDeviceCmdRebootLastRecord> wrapper){
          return quickPage(page, wrapper);
    }


    default Page<EmSocDeviceCmdRebootLastRecord> quickPage(Page<EmSocDeviceCmdRebootLastRecord> page,Consumer<EmSocDeviceCmdRebootLastRecordQueryWrapper> wrapperConsumer) {
          EmSocDeviceCmdRebootLastRecordQueryWrapper queryWrapper = EmSocDeviceCmdRebootLastRecordQueryWrapper.wrapper();
           wrapperConsumer.accept(queryWrapper);
          return quickPage(page, queryWrapper);
    }

    default public void pageConsumerByWrapper(Consumer<EmSocDeviceCmdRebootLastRecordQueryWrapper> wrapperConsumer, Consumer<EmSocDeviceCmdRebootLastRecord> consumer) {
        EmSocDeviceCmdRebootLastRecordQueryWrapper queryWrapper = EmSocDeviceCmdRebootLastRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumerByWrapper(int pageSize, Consumer<EmSocDeviceCmdRebootLastRecordQueryWrapper> wrapperConsumer, Consumer<EmSocDeviceCmdRebootLastRecord> consumer) {
        EmSocDeviceCmdRebootLastRecordQueryWrapper queryWrapper = EmSocDeviceCmdRebootLastRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }


    default public void pageConsumer(QueryWrapper<EmSocDeviceCmdRebootLastRecord> queryWrapper, Consumer<EmSocDeviceCmdRebootLastRecord> consumer) {
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(int pageSize, QueryWrapper<EmSocDeviceCmdRebootLastRecord> queryWrapper, Consumer<EmSocDeviceCmdRebootLastRecord> consumer) {
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(Function<Page<EmSocDeviceCmdRebootLastRecord>, Page<EmSocDeviceCmdRebootLastRecord>> consumerSupplier, Consumer<EmSocDeviceCmdRebootLastRecord> consumer) {
        pageConsumer(1000, consumerSupplier, consumer);
    }

    default public void pageConsumer(int pageSize, Function<Page<EmSocDeviceCmdRebootLastRecord>, Page<EmSocDeviceCmdRebootLastRecord>> consumerSupplier, Consumer<EmSocDeviceCmdRebootLastRecord> consumer) {
        Page<EmSocDeviceCmdRebootLastRecord> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<EmSocDeviceCmdRebootLastRecord> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    for (EmSocDeviceCmdRebootLastRecord t : result) {
                        consumer.accept(t);
                    }
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }


    default public void pageConsumersByWrapper(Consumer<EmSocDeviceCmdRebootLastRecordQueryWrapper> wrapperConsumer, Consumer<List<EmSocDeviceCmdRebootLastRecord>> consumerList) {
        EmSocDeviceCmdRebootLastRecordQueryWrapper queryWrapper = EmSocDeviceCmdRebootLastRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumersByWrapper(int pageSize, Consumer<EmSocDeviceCmdRebootLastRecordQueryWrapper> wrapperConsumer, Consumer<List<EmSocDeviceCmdRebootLastRecord>> consumerList) {
        EmSocDeviceCmdRebootLastRecordQueryWrapper queryWrapper = EmSocDeviceCmdRebootLastRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }


    default public void pageConsumers(QueryWrapper<EmSocDeviceCmdRebootLastRecord> queryWrapper, Consumer<List<EmSocDeviceCmdRebootLastRecord>> consumerList) {
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(int pageSize, QueryWrapper<EmSocDeviceCmdRebootLastRecord> queryWrapper, Consumer<List<EmSocDeviceCmdRebootLastRecord>> consumerList) {
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(Function<Page<EmSocDeviceCmdRebootLastRecord>, Page<EmSocDeviceCmdRebootLastRecord>> consumerSupplier, Consumer<List<EmSocDeviceCmdRebootLastRecord>> consumerList) {
        pageConsumers(1000, consumerSupplier, consumerList);
    }

    default public void pageConsumers(int pageSize, Function<Page<EmSocDeviceCmdRebootLastRecord>, Page<EmSocDeviceCmdRebootLastRecord>> consumerSupplier, Consumer<List<EmSocDeviceCmdRebootLastRecord>> consumerList) {
        Page<EmSocDeviceCmdRebootLastRecord> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<EmSocDeviceCmdRebootLastRecord> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    consumerList.accept(result);
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public boolean queryAndUpdateById(QueryWrapper<EmSocDeviceCmdRebootLastRecord> wrapper, EmSocDeviceCmdRebootLastRecord up) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<EmSocDeviceCmdRebootLastRecord> wrapper, EmSocDeviceCmdRebootLastRecord up) {
        return queryAndUpdateById(pageSize, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<EmSocDeviceCmdRebootLastRecord> wrapper, EmSocDeviceCmdRebootLastRecord up, BiPredicate<EmSocDeviceCmdRebootLastRecord, EmSocDeviceCmdRebootLastRecord> updateFilter) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<EmSocDeviceCmdRebootLastRecord> wrapper, EmSocDeviceCmdRebootLastRecord up, BiPredicate<EmSocDeviceCmdRebootLastRecord, EmSocDeviceCmdRebootLastRecord> updateFilter) {
        return queryAndUpdateById(pageSize, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<EmSocDeviceCmdRebootLastRecord> wrapper, EmSocDeviceCmdRebootLastRecord up, BiConsumer<EmSocDeviceCmdRebootLastRecord, EmSocDeviceCmdRebootLastRecordUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, whereSet);
    }

    default public boolean queryAndUpdateById(QueryWrapper<EmSocDeviceCmdRebootLastRecord> wrapper, EmSocDeviceCmdRebootLastRecord up, BiPredicate<EmSocDeviceCmdRebootLastRecord, EmSocDeviceCmdRebootLastRecord> updateFilter, BiConsumer<EmSocDeviceCmdRebootLastRecord, EmSocDeviceCmdRebootLastRecordUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, whereSet);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<EmSocDeviceCmdRebootLastRecord> wrapper, EmSocDeviceCmdRebootLastRecord up, BiPredicate<EmSocDeviceCmdRebootLastRecord, EmSocDeviceCmdRebootLastRecord> updateFilter, BiConsumer<EmSocDeviceCmdRebootLastRecord, EmSocDeviceCmdRebootLastRecordUpdateWrapper> whereSet) {
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


    default public boolean removeByIds(Consumer<EmSocDeviceCmdRebootLastRecordQueryWrapper> wrapper) {
        return removeByIds(1000, wrapper);
    }

    default public boolean removeByIds(int pageSize, Consumer<EmSocDeviceCmdRebootLastRecordQueryWrapper> wrapper) {
        EmSocDeviceCmdRebootLastRecordQueryWrapper removeWrapper = EmSocDeviceCmdRebootLastRecordQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return removeByIds(pageSize, removeWrapper);
    }

    default public boolean removeByIds(EmSocDeviceCmdRebootLastRecordQueryWrapper removeWrapper) {
        return removeByIds(1000,removeWrapper);
    }

    default public boolean removeByIds(int pageSize, EmSocDeviceCmdRebootLastRecordQueryWrapper removeWrapper) {
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
