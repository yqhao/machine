package com.suqi.center.machine.biz.viz.service.common;

import com.suqi.center.common.utils.ProFilesActiveUtils;
import com.suqi.center.common.utils.SqKeyValuePair;
import com.suqi.center.machine.api.viz.dto.request.MachineRecycleReqDto;
import com.suqi.center.machine.api.viz.dto.request.MachineSaleStatusReqDto;
import com.suqi.center.machine.api.viz.dto.request.McMachineTaskHandleDto;
import com.suqi.center.machine.api.viz.dto.response.VizAssignResultRespDto;
import com.suqi.center.machine.biz.viz.service.VizMcMachineRestService;
import com.suqi.core.kafka.KafkaService;
import com.suqi.core.kafka.dto.KafkaBaseReqDto;
import com.suqi.core.kafka.dto.KafkaResult;
import com.suqi.core.kafka.topic.MqTopicConstant;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

/**
 * @Auther: chenbinhong
 * @Date: 2023/10/31 11:28
 * @Description: MachineTopicSendService
 * @Version 1.0.0
 */
@Slf4j
@Component
public class MachineTopicSendUtils {
    @Resource
    private KafkaService kafkaService;

    @Value("${mc.handle.task.partition:0}")
    private Integer taskPartitionNums;
    @Resource
    private VizMcMachineRestService vizMcMachineRestService;

    /**
     * 平台分配机器给租户MQ
     *
     * @param saleStatusReqDto
     * @return
     */
    public VizAssignResultRespDto executeUnSoldMachine(MachineSaleStatusReqDto saleStatusReqDto) {
        VizAssignResultRespDto resultRespDto = vizMcMachineRestService.executeUnSoldMachine(saleStatusReqDto);
        if (Objects.nonNull(resultRespDto) && CollectionUtils.isNotEmpty(resultRespDto.getTaskHandleList())) {
            for (McMachineTaskHandleDto mqDto : resultRespDto.getTaskHandleList()) {
                log.info("platformAssignMachineToTenantTask send request ==>> {}", mqDto);
                KafkaResult message = kafkaService.sendKafkaMessage(ProFilesActiveUtils.environment.getEnv() + MqTopicConstant.BackEndApi.PLATFORM_ASSIGN_MACHINE_TO_TENANT_TASK, new KafkaBaseReqDto<McMachineTaskHandleDto>(mqDto), taskPartitionNums, mqDto.getDeviceId());
                log.info("platformAssignMachineToTenantTask send result ==>> {}", message);
            }
            // 信息不返回前端
            resultRespDto.setTaskHandleList(null);
        }

        return resultRespDto;
    }

    /**
     * 平台回收租户的机器MQ
     *
     * @param reqListDto
     * @return
     */
    public List<String> executeRecycleDevice(List<MachineRecycleReqDto> reqListDto) {
        SqKeyValuePair<List<String>, List<McMachineTaskHandleDto>> keyValuePair = vizMcMachineRestService.executeRecycleDevice(reqListDto);
        List<McMachineTaskHandleDto> currentHandleList = keyValuePair.getValue();
        if (CollectionUtils.isNotEmpty(currentHandleList)) {
            // 4、发送分配任务的MQ消息 按设备ID hash和分区 取模发送
            for (McMachineTaskHandleDto mqDto : currentHandleList) {
                log.info("platformRecycleMachineFromTenantTask send request ==>> {}", mqDto);
                KafkaResult message = kafkaService.sendKafkaMessage(ProFilesActiveUtils.environment.getEnv() + MqTopicConstant.BackEndApi.PLATFORM_RECYCLE_MACHINE_FROM_TENANT_TASK, new KafkaBaseReqDto<McMachineTaskHandleDto>(mqDto), taskPartitionNums, mqDto.getDeviceId());
                log.info("platformRecycleMachineFromTenantTask send result ==>> {}", message);
            }
        }
        return keyValuePair.getKey();
    }


}
