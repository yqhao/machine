package com.suqi.center.machine.dao.viz.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.suqi.center.machine.dao.viz.dto.MachinePageDto;
import com.suqi.center.machine.dao.viz.entity.VizMcMachine;
import com.suqi.center.machine.dao.viz.vo.MachinePageVo;
import com.suqi.center.machine.dao.viz.wrapper.VizMcMachineQueryWrapper;
import com.suqi.center.machine.dao.viz.wrapper.VizMcMachineUpdateWrapper;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * <p>
 * 机器基础信息表 服务类
 * </p>
 *
 * @author 18374
 * @since 2023-10-11
 */
public interface IVizMcMachineService extends IService<VizMcMachine> {

    /**
     * 根据条件分页获取相关参数
     * @param param
     * @return
     */
    Page<MachinePageVo> pageList(MachinePageDto param);

    default long count(Consumer<VizMcMachineQueryWrapper> wrapperConsumer) {
        VizMcMachineQueryWrapper queryWrapper = VizMcMachineQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return count(queryWrapper);
    }

    default public VizMcMachine selectOne(QueryWrapper<VizMcMachine> queryWrapper) {
        queryWrapper.last(" limit 1 ");
        return getOne(queryWrapper, false);
    }

    default public VizMcMachine selectOne(Consumer<VizMcMachineQueryWrapper> wrapperConsumer) {
        VizMcMachineQueryWrapper queryWrapper = VizMcMachineQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        queryWrapper.last(" limit 1 ");
        return getOne(queryWrapper, false);
    }

    default public List<VizMcMachine> select(QueryWrapper<VizMcMachine> queryWrapper) {
        return list(queryWrapper);
    }

    default public List<VizMcMachine> select(Consumer<VizMcMachineQueryWrapper> wrapperConsumer) {
        VizMcMachineQueryWrapper queryWrapper = VizMcMachineQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public List<VizMcMachine> list(Consumer<VizMcMachineQueryWrapper> wrapperConsumer) {
        VizMcMachineQueryWrapper queryWrapper = VizMcMachineQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return list(queryWrapper);
    }

    default public boolean update(Consumer<VizMcMachineUpdateWrapper> wrapper) {
        VizMcMachineUpdateWrapper updateWrapper = VizMcMachineUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(updateWrapper);
    }

    default public boolean update(VizMcMachine up, Consumer<VizMcMachineUpdateWrapper> wrapper) {
        VizMcMachineUpdateWrapper updateWrapper = VizMcMachineUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean update(Consumer<VizMcMachine> setUp, Consumer<VizMcMachineUpdateWrapper> wrapper) {
        VizMcMachine up = new VizMcMachine();
        setUp.accept(up);
        VizMcMachineUpdateWrapper updateWrapper = VizMcMachineUpdateWrapper.wrapper();
        wrapper.accept(updateWrapper);
        return update(up, updateWrapper);
    }

    default public boolean remove(Consumer<VizMcMachineQueryWrapper> wrapper) {
        VizMcMachineQueryWrapper removeWrapper = VizMcMachineQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return remove(removeWrapper);
    }

    default public Page<VizMcMachine> page(Page<VizMcMachine> page, Consumer<VizMcMachineQueryWrapper> wrapperConsumer) {
        VizMcMachineQueryWrapper queryWrapper = VizMcMachineQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default Page<VizMcMachine> quickPageById(Page<VizMcMachine> page, long lastId, QueryWrapper<VizMcMachine> wrapper) {
        return quickPageById(true, page, lastId, wrapper);
    }

    default Page<VizMcMachine> quickPageById(Page<VizMcMachine> page, long lastId, Consumer<VizMcMachineQueryWrapper> wrapperConsumer) {
        VizMcMachineQueryWrapper queryWrapper = VizMcMachineQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPageById(true, page, lastId, queryWrapper);
    }

    default Page<VizMcMachine> quickPageById(boolean queryTotals, Page<VizMcMachine> page, long lastId, QueryWrapper<VizMcMachine> wrapper) {
        return page(page, wrapper);
    }

    default Page<VizMcMachine> quickPage(Page<VizMcMachine> page, QueryWrapper<VizMcMachine> wrapper) {
        return IService.super.page(page, wrapper);
    }

    default Page<VizMcMachine> page(Page<VizMcMachine> page, QueryWrapper<VizMcMachine> wrapper) {
        return quickPage(page, wrapper);
    }

    default Page<VizMcMachine> quickPage(Page<VizMcMachine> page, Consumer<VizMcMachineQueryWrapper> wrapperConsumer) {
        VizMcMachineQueryWrapper queryWrapper = VizMcMachineQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        return quickPage(page, queryWrapper);
    }

    default public void pageConsumerByWrapper(Consumer<VizMcMachineQueryWrapper> wrapperConsumer, Consumer<VizMcMachine> consumer) {
        VizMcMachineQueryWrapper queryWrapper = VizMcMachineQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumerByWrapper(int pageSize, Consumer<VizMcMachineQueryWrapper> wrapperConsumer, Consumer<VizMcMachine> consumer) {
        VizMcMachineQueryWrapper queryWrapper = VizMcMachineQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(QueryWrapper<VizMcMachine> queryWrapper, Consumer<VizMcMachine> consumer) {
        pageConsumer(1000, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(int pageSize, QueryWrapper<VizMcMachine> queryWrapper, Consumer<VizMcMachine> consumer) {
        pageConsumer(pageSize, p -> quickPage(p, queryWrapper), consumer);
    }

    default public void pageConsumer(Function<Page<VizMcMachine>, Page<VizMcMachine>> consumerSupplier, Consumer<VizMcMachine> consumer) {
        pageConsumer(1000, consumerSupplier, consumer);
    }

    default public void pageConsumer(int pageSize, Function<Page<VizMcMachine>, Page<VizMcMachine>> consumerSupplier, Consumer<VizMcMachine> consumer) {
        Page<VizMcMachine> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<VizMcMachine> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    for (VizMcMachine t : result) {
                        consumer.accept(t);
                    }
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public void pageConsumersByWrapper(Consumer<VizMcMachineQueryWrapper> wrapperConsumer, Consumer<List<VizMcMachine>> consumerList) {
        VizMcMachineQueryWrapper queryWrapper = VizMcMachineQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumersByWrapper(int pageSize, Consumer<VizMcMachineQueryWrapper> wrapperConsumer, Consumer<List<VizMcMachine>> consumerList) {
        VizMcMachineQueryWrapper queryWrapper = VizMcMachineQueryWrapper.wrapper();
        wrapperConsumer.accept(queryWrapper);
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(QueryWrapper<VizMcMachine> queryWrapper, Consumer<List<VizMcMachine>> consumerList) {
        pageConsumers(1000, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(int pageSize, QueryWrapper<VizMcMachine> queryWrapper, Consumer<List<VizMcMachine>> consumerList) {
        pageConsumers(pageSize, p -> quickPage(p, queryWrapper), consumerList);
    }

    default public void pageConsumers(Function<Page<VizMcMachine>, Page<VizMcMachine>> consumerSupplier, Consumer<List<VizMcMachine>> consumerList) {
        pageConsumers(1000, consumerSupplier, consumerList);
    }

    default public void pageConsumers(int pageSize, Function<Page<VizMcMachine>, Page<VizMcMachine>> consumerSupplier, Consumer<List<VizMcMachine>> consumerList) {
        Page<VizMcMachine> page = new Page();
        page.setSize(pageSize);
        page = (Page) consumerSupplier.apply(page);
        if (page.getPages() > 0L) {
            long max = page.getPages();
            page.setCurrent(page.getPages());
            do {
                page = (Page) consumerSupplier.apply(page);
                List<VizMcMachine> result = page.getRecords();
                if (result != null && !result.isEmpty()) {
                    consumerList.accept(result);
                    result.clear();
                }
                page.setCurrent(--max);
            } while (page.getCurrent() > 0L && page.getPages() > 0L && max > 0L);
        }
    }

    default public boolean queryAndUpdateById(QueryWrapper<VizMcMachine> wrapper, VizMcMachine up) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<VizMcMachine> wrapper, VizMcMachine up) {
        return queryAndUpdateById(pageSize, wrapper, up, (o, u) -> true, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<VizMcMachine> wrapper, VizMcMachine up, BiPredicate<VizMcMachine, VizMcMachine> updateFilter) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<VizMcMachine> wrapper, VizMcMachine up, BiPredicate<VizMcMachine, VizMcMachine> updateFilter) {
        return queryAndUpdateById(pageSize, wrapper, up, updateFilter, null);
    }

    default public boolean queryAndUpdateById(QueryWrapper<VizMcMachine> wrapper, VizMcMachine up, BiConsumer<VizMcMachine, VizMcMachineUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, (o, u) -> true, whereSet);
    }

    default public boolean queryAndUpdateById(QueryWrapper<VizMcMachine> wrapper, VizMcMachine up, BiPredicate<VizMcMachine, VizMcMachine> updateFilter, BiConsumer<VizMcMachine, VizMcMachineUpdateWrapper> whereSet) {
        return queryAndUpdateById(1000, wrapper, up, updateFilter, whereSet);
    }

    default public boolean queryAndUpdateById(int pageSize, QueryWrapper<VizMcMachine> wrapper, VizMcMachine up, BiPredicate<VizMcMachine, VizMcMachine> updateFilter, BiConsumer<VizMcMachine, VizMcMachineUpdateWrapper> whereSet) {
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

    default public boolean removeByIds(Consumer<VizMcMachineQueryWrapper> wrapper) {
        return removeByIds(1000, wrapper);
    }

    default public boolean removeByIds(int pageSize, Consumer<VizMcMachineQueryWrapper> wrapper) {
        VizMcMachineQueryWrapper removeWrapper = VizMcMachineQueryWrapper.wrapper();
        wrapper.accept(removeWrapper);
        return removeByIds(pageSize, removeWrapper);
    }

    default public boolean removeByIds(VizMcMachineQueryWrapper removeWrapper) {
        return removeByIds(1000, removeWrapper);
    }

    default public boolean removeByIds(int pageSize, VizMcMachineQueryWrapper removeWrapper) {
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
