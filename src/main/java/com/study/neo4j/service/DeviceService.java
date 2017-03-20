package com.study.neo4j.service;

import org.springframework.stereotype.Service;

import com.study.neo4j.domain.Device;

/**
 * @Author wtwei .
 * @Date 2017/3/3 .
 * @Time 17:38 .
 */
@Service
public interface DeviceService {
    public void save(Device device);
}
