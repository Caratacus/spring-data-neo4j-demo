package com.study.neo4j.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.study.neo4j.domain.Device;
import com.study.neo4j.repository.DeviceRepository;
import com.study.neo4j.service.DeviceService;

/**
 * @Author wtwei .
 * @Date 2017/3/3 .
 * @Time 17:39 .
 */
@Service
public class DeviceServiceImpl implements DeviceService {
    @Resource
    DeviceRepository deviceRepository;

    @Override
    public void save(Device device) {
        deviceRepository.save(device);
    }
}
