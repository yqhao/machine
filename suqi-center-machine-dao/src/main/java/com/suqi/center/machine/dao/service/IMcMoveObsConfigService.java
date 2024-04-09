package com.suqi.center.machine.dao.service;

import com.suqi.center.machine.dao.entity.McMoveObsConfig;
import com.suqi.center.machine.dao.wrapper.McMoveObsConfigQueryWrapper;
import com.suqi.center.machine.dao.wrapper.McMoveObsConfigUpdateWrapper;
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
 * @since 2023-09-25
 */
public interface IMcMoveObsConfigService extends IService<McMoveObsConfig> {

    default long count(Consumer<McMoveObsConfigQueryWrapper> wrapperConsumer) {
        McMoveObsConfigQueryWrapper queryWrapper = McMoveObsConfigQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return count(queryWrapper);
    }

    default public McMoveObsConfig selectOne(Consumer<McMoveObsConfigQueryWrapper> wrapperConsumer) {
          McMoveObsConfigQueryWrapper queryWrapper = McMoveObsConfigQueryWrapper.wrapper();
          wrapperConsumer.accept(queryWrapper);
          queryWrapper.last(" limit 1 ");
        return getOne(queryWrapper,false);
    }

    default public List<McMoveObsConfig> select(Consumer<McMoveObsConfigQueryWrapper> wrapperConsumer) {
          McMoveObsConfigQueryWrapper queryWrapper = McMoveObsConfigQueryWrapper.wrapper();
          wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public List<McMoveObsConfig> list(Consumer<McMoveObsConfigQueryWrapper> wrapperConsumer) {
          McMoveObsConfigQueryWrapper queryWrapper = McMoveObsConfigQueryWrapper.wrapper();
          wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default  public boolean update(Consumer<McMoveObsConfigUpdateWrapper> wrapper){
        McMoveObsConfigUpdateWrapper updateWrapper = McMoveObsConfigUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return  update(updateWrapper);
    }

    default  public boolean update(McMoveObsConfig up,Consumer<McMoveObsConfigUpdateWrapper> wrapper){
        McMoveObsConfigUpdateWrapper updateWrapper = McMoveObsConfigUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return  update(up, updateWrapper);
    }

    default  public boolean update(Consumer<McMoveObsConfig> setUp,Consumer<McMoveObsConfigUpdateWrapper> wrapper){
        McMoveObsConfig up = new McMoveObsConfig();
        setUp.accept(up);
        McMoveObsConfigUpdateWrapper updateWrapper = McMoveObsConfigUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return  update(up, updateWrapper);
    }

    default  public boolean remove(Consumer<McMoveObsConfigQueryWrapper> wrapper){
        McMoveObsConfigQueryWrapper removeWrapper = McMoveObsConfigQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return  remove(removeWrapper);
    }

    default public Page<McMoveObsConfig> page(Page<McMoveObsConfig> page,Consumer<McMoveObsConfigQueryWrapper> wrapperConsumer) {
        McMoveObsConfigQueryWrapper queryWrapper = McMoveObsConfigQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default Page<McMoveObsConfig> quickPageById(Page<McMoveObsConfig> page,long lastId, QueryWrapper<McMoveObsConfig> wrapper){
          return quickPageById(true,page,lastId,wrapper);
    }

    default Page<McMoveObsConfig> quickPageById(Page<McMoveObsConfig> page,long lastId,Consumer<McMoveObsConfigQueryWrapper> wrapperConsumer) {
          McMoveObsConfigQueryWrapper queryWrapper = McMoveObsConfigQueryWrapper.wrapper();
          wrapperConsumer.accept(queryWrapper);
          return quickPageById(true,page,lastId,queryWrapper);
    }

    default Page<McMoveObsConfig> quickPageById(boolean queryTotals,Page<McMoveObsConfig> page,long lastId, QueryWrapper<McMoveObsConfig> wrapper){
          return page(page, wrapper);
    }

    default Page<McMoveObsConfig> quickPage(Page<McMoveObsConfig> page,QueryWrapper<McMoveObsConfig> wrapper){
          return IService.super.page(page,wrapper);
    }

    default Page<McMoveObsConfig> page(Page<McMoveObsConfig> page,QueryWrapper<McMoveObsConfig> wrapper){
          return quickPage(page, wrapper);
    }


    default Page<McMoveObsConfig> quickPage(Page<McMoveObsConfig> page,Consumer<McMoveObsConfigQueryWrapper> wrapperConsumer) {
          McMoveObsConfigQueryWrapper queryWrapper = McMoveObsConfigQueryWrapper.wrapper();
           wrapperConsumer.accept(queryWrapper);
          return quickPage(page, queryWrapper);
    }

    default public void pageConsumerByWrapper(Consumer<McMoveObsConfigQueryWrapper> wrapperConsumer, Consumer<McMoveObsConfig> consumer) {
        McMoveObsConfigQueryWrapper queryWrapper = McMoveObsConfigQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumerByWrapper(int pageSize, Consumer<McMoveObsConfigQueryWrapper> wrapperConsumer, Consumer<McMoveObsConfig> consumer) {
        McMoveObsConfigQueryWrapper queryWrapper = McMoveObsConfigQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }


    default public void pageConsumer(QueryWrapper<McMoveObsConfig> queryWrapper, Consumer<McMoveObsConfig> consumer) {
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(int pageSize, QueryWrapper<McMoveObsConfig> queryWrapper, Consumer<McMoveObsConfig> consumer) {
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(Function<Page<McMoveObsConfig>, Page<McMoveObsConfig>> consumerSupplier, Consumer<McMoveObsConfig> consumer) {
        pageConsumer(1000, consumerSupplier, consumer);
    }

    default public void pageConsumer(int pageSize, Function<Page<McMoveObsConfig>, Page<McMoveObsConfig>> consumerSupplier, Consumer<McMoveObsConfig> consumer) {
        Page<McMoveObsConfig> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<McMoveObsConfig> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    for (McMoveObsConfig t : result) {
                        consumer.accept(t);
                    }
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }


    default public void pageConsumersByWrapper(Consumer<McMoveObsConfigQueryWrapper> wrapperConsumer, Consumer<List<McMoveObsConfig>> consumerList) {
        McMoveObsConfigQueryWrapper queryWrapper = McMoveObsConfigQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumersByWrapper(int pageSize, Consumer<McMoveObsConfigQueryWrapper> wrapperConsumer, Consumer<List<McMoveObsConfig>> consumerList) {
        McMoveObsConfigQueryWrapper queryWrapper = McMoveObsConfigQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }


    default public void pageConsumers(QueryWrapper<McMoveObsConfig> queryWrapper, Consumer<List<McMoveObsConfig>> consumerList) {
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(int pageSize, QueryWrapper<McMoveObsConfig> queryWrapper, Consumer<List<McMoveObsConfig>> consumerList) {
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(Function<Page<McMoveObsConfig>, Page<McMoveObsConfig>> consumerSupplier, Consumer<List<McMoveObsConfig>> consumerList) {
        pageConsumers(1000, consumerSupplier, consumerList);
    }

    default public void pageConsumers(int pageSize, Function<Page<McMoveObsConfig>, Page<McMoveObsConfig>> consumerSupplier, Consumer<List<McMoveObsConfig>> consumerList) {
        Page<McMoveObsConfig> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<McMoveObsConfig> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    consumerList.accept(result);
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }


    default public boolean queryAndUpdateById(QueryWrapper<McMoveObsConfig> wrapper, McMoveObsConfig up) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<McMoveObsConfig> wrapper, McMoveObsConfig up) {
        return queryAndUpdateById(pageSize, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<McMoveObsConfig> wrapper, McMoveObsConfig up, BiPredicate<McMoveObsConfig, McMoveObsConfig> updateFilter) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<McMoveObsConfig> wrapper, McMoveObsConfig up, BiPredicate<McMoveObsConfig, McMoveObsConfig> updateFilter) {
        return queryAndUpdateById(pageSize, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<McMoveObsConfig> wrapper, McMoveObsConfig up, BiConsumer<McMoveObsConfig, McMoveObsConfigUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, whereSet);
    }

    default public boolean queryAndUpdateById(QueryWrapper<McMoveObsConfig> wrapper, McMoveObsConfig up, BiPredicate<McMoveObsConfig, McMoveObsConfig> updateFilter, BiConsumer<McMoveObsConfig, McMoveObsConfigUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, whereSet);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<McMoveObsConfig> wrapper, McMoveObsConfig up, BiPredicate<McMoveObsConfig, McMoveObsConfig> updateFilter, BiConsumer<McMoveObsConfig, McMoveObsConfigUpdateWrapper> whereSet) {
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

    default public boolean removeByIds(Consumer<McMoveObsConfigQueryWrapper> wrapper) {
        return removeByIds(1000, wrapper);
    }

    default public boolean removeByIds(int pageSize, Consumer<McMoveObsConfigQueryWrapper> wrapper) {
        McMoveObsConfigQueryWrapper removeWrapper = McMoveObsConfigQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return removeByIds(pageSize, removeWrapper);
    }

    default public boolean removeByIds(McMoveObsConfigQueryWrapper removeWrapper) {
        return removeByIds(1000,removeWrapper);
    }

    default public boolean removeByIds(int pageSize, McMoveObsConfigQueryWrapper removeWrapper) {
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
