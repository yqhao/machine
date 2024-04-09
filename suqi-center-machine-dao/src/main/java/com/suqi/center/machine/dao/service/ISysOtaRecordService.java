package com.suqi.center.machine.dao.service;

import com.suqi.center.machine.dao.entity.SysOtaRecord;
import com.suqi.center.machine.dao.wrapper.SysOtaRecordQueryWrapper;
import com.suqi.center.machine.dao.wrapper.SysOtaRecordUpdateWrapper;
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
 *  服务类
 * </p>
 *
 * @author PC001
 * @since 2023-10-31
 */
public interface ISysOtaRecordService extends IService<SysOtaRecord> {

    default long count(Consumer<SysOtaRecordQueryWrapper> wrapperConsumer) {
        SysOtaRecordQueryWrapper queryWrapper = SysOtaRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return count(queryWrapper);
    }

    default public SysOtaRecord selectOne(Consumer<SysOtaRecordQueryWrapper> wrapperConsumer) {
          SysOtaRecordQueryWrapper queryWrapper = SysOtaRecordQueryWrapper.wrapper();
          wrapperConsumer.accept(queryWrapper);
          queryWrapper.last(" limit 1 ");
        return getOne(queryWrapper,false);
    }

    default public List<SysOtaRecord> select(Consumer<SysOtaRecordQueryWrapper> wrapperConsumer) {
          SysOtaRecordQueryWrapper queryWrapper = SysOtaRecordQueryWrapper.wrapper();
          wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public List<SysOtaRecord> list(Consumer<SysOtaRecordQueryWrapper> wrapperConsumer) {
          SysOtaRecordQueryWrapper queryWrapper = SysOtaRecordQueryWrapper.wrapper();
          wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default  public boolean update(Consumer<SysOtaRecordUpdateWrapper> wrapper){
        SysOtaRecordUpdateWrapper updateWrapper = SysOtaRecordUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return  update(updateWrapper);
    }

    default  public boolean update(SysOtaRecord up,Consumer<SysOtaRecordUpdateWrapper> wrapper){
        SysOtaRecordUpdateWrapper updateWrapper = SysOtaRecordUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return  update(up, updateWrapper);
    }

    default  public boolean update(Consumer<SysOtaRecord> setUp,Consumer<SysOtaRecordUpdateWrapper> wrapper){
        SysOtaRecord up = new SysOtaRecord();
        setUp.accept(up);
        SysOtaRecordUpdateWrapper updateWrapper = SysOtaRecordUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return  update(up, updateWrapper);
    }

    default  public boolean remove(Consumer<SysOtaRecordQueryWrapper> wrapper){
        SysOtaRecordQueryWrapper removeWrapper = SysOtaRecordQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return  remove(removeWrapper);
    }

    default public Page<SysOtaRecord> page(Page<SysOtaRecord> page,Consumer<SysOtaRecordQueryWrapper> wrapperConsumer) {
        SysOtaRecordQueryWrapper queryWrapper = SysOtaRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default Page<SysOtaRecord> quickPageById(Page<SysOtaRecord> page,long lastId, QueryWrapper<SysOtaRecord> wrapper){
          return quickPageById(true,page,lastId,wrapper);
    }

    default Page<SysOtaRecord> quickPageById(Page<SysOtaRecord> page,long lastId,Consumer<SysOtaRecordQueryWrapper> wrapperConsumer) {
          SysOtaRecordQueryWrapper queryWrapper = SysOtaRecordQueryWrapper.wrapper();
          wrapperConsumer.accept(queryWrapper);
          return quickPageById(true,page,lastId,queryWrapper);
    }

    default Page<SysOtaRecord> quickPageById(boolean queryTotals,Page<SysOtaRecord> page,long lastId, QueryWrapper<SysOtaRecord> wrapper){
          return page(page, wrapper);
    }

    default Page<SysOtaRecord> quickPage(Page<SysOtaRecord> page,QueryWrapper<SysOtaRecord> wrapper){
          return IService.super.page(page,wrapper);
    }

    default Page<SysOtaRecord> page(Page<SysOtaRecord> page,QueryWrapper<SysOtaRecord> wrapper){
          return quickPage(page, wrapper);
    }


    default Page<SysOtaRecord> quickPage(Page<SysOtaRecord> page,Consumer<SysOtaRecordQueryWrapper> wrapperConsumer) {
          SysOtaRecordQueryWrapper queryWrapper = SysOtaRecordQueryWrapper.wrapper();
           wrapperConsumer.accept(queryWrapper);
          return quickPage(page, queryWrapper);
    }

    default public void pageConsumerByWrapper(Consumer<SysOtaRecordQueryWrapper> wrapperConsumer, Consumer<SysOtaRecord> consumer) {
        SysOtaRecordQueryWrapper queryWrapper = SysOtaRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumerByWrapper(int pageSize, Consumer<SysOtaRecordQueryWrapper> wrapperConsumer, Consumer<SysOtaRecord> consumer) {
        SysOtaRecordQueryWrapper queryWrapper = SysOtaRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }


    default public void pageConsumer(QueryWrapper<SysOtaRecord> queryWrapper, Consumer<SysOtaRecord> consumer) {
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(int pageSize, QueryWrapper<SysOtaRecord> queryWrapper, Consumer<SysOtaRecord> consumer) {
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(Function<Page<SysOtaRecord>, Page<SysOtaRecord>> consumerSupplier, Consumer<SysOtaRecord> consumer) {
        pageConsumer(1000, consumerSupplier, consumer);
    }

    default public void pageConsumer(int pageSize, Function<Page<SysOtaRecord>, Page<SysOtaRecord>> consumerSupplier, Consumer<SysOtaRecord> consumer) {
        Page<SysOtaRecord> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<SysOtaRecord> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    for (SysOtaRecord t : result) {
                        consumer.accept(t);
                    }
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }


    default public void pageConsumersByWrapper(Consumer<SysOtaRecordQueryWrapper> wrapperConsumer, Consumer<List<SysOtaRecord>> consumerList) {
        SysOtaRecordQueryWrapper queryWrapper = SysOtaRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumersByWrapper(int pageSize, Consumer<SysOtaRecordQueryWrapper> wrapperConsumer, Consumer<List<SysOtaRecord>> consumerList) {
        SysOtaRecordQueryWrapper queryWrapper = SysOtaRecordQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }


    default public void pageConsumers(QueryWrapper<SysOtaRecord> queryWrapper, Consumer<List<SysOtaRecord>> consumerList) {
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(int pageSize, QueryWrapper<SysOtaRecord> queryWrapper, Consumer<List<SysOtaRecord>> consumerList) {
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(Function<Page<SysOtaRecord>, Page<SysOtaRecord>> consumerSupplier, Consumer<List<SysOtaRecord>> consumerList) {
        pageConsumers(1000, consumerSupplier, consumerList);
    }

    default public void pageConsumers(int pageSize, Function<Page<SysOtaRecord>, Page<SysOtaRecord>> consumerSupplier, Consumer<List<SysOtaRecord>> consumerList) {
        Page<SysOtaRecord> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<SysOtaRecord> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    consumerList.accept(result);
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }


    default public boolean queryAndUpdateById(QueryWrapper<SysOtaRecord> wrapper, SysOtaRecord up) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<SysOtaRecord> wrapper, SysOtaRecord up) {
        return queryAndUpdateById(pageSize, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<SysOtaRecord> wrapper, SysOtaRecord up, BiPredicate<SysOtaRecord, SysOtaRecord> updateFilter) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<SysOtaRecord> wrapper, SysOtaRecord up, BiPredicate<SysOtaRecord, SysOtaRecord> updateFilter) {
        return queryAndUpdateById(pageSize, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<SysOtaRecord> wrapper, SysOtaRecord up, BiConsumer<SysOtaRecord, SysOtaRecordUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, whereSet);
    }

    default public boolean queryAndUpdateById(QueryWrapper<SysOtaRecord> wrapper, SysOtaRecord up, BiPredicate<SysOtaRecord, SysOtaRecord> updateFilter, BiConsumer<SysOtaRecord, SysOtaRecordUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, whereSet);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<SysOtaRecord> wrapper, SysOtaRecord up, BiPredicate<SysOtaRecord, SysOtaRecord> updateFilter, BiConsumer<SysOtaRecord, SysOtaRecordUpdateWrapper> whereSet) {
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

    default public boolean removeByIds(Consumer<SysOtaRecordQueryWrapper> wrapper) {
        return removeByIds(1000, wrapper);
    }

    default public boolean removeByIds(int pageSize, Consumer<SysOtaRecordQueryWrapper> wrapper) {
        SysOtaRecordQueryWrapper removeWrapper = SysOtaRecordQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return removeByIds(pageSize, removeWrapper);
    }

    default public boolean removeByIds(SysOtaRecordQueryWrapper removeWrapper) {
        return removeByIds(1000,removeWrapper);
    }

    default public boolean removeByIds(int pageSize, SysOtaRecordQueryWrapper removeWrapper) {
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
