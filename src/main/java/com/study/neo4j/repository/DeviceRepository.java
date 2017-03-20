package com.study.neo4j.repository;

import org.springframework.data.neo4j.repository.GraphRepository;

import com.study.neo4j.domain.Device;

/**
 * @Author wtwei .
 * @Date 2017/3/3 .
 * @Time 17:40 .
 */
public interface DeviceRepository extends GraphRepository<Device> {
}
