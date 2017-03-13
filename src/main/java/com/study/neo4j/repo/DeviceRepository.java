package com.study.neo4j.repo;

import com.study.neo4j.domain.Device;
import org.springframework.data.neo4j.repository.Neo4jRepository;

/**
 * @Author wtwei .
 * @Date 2017/3/3 .
 * @Time 17:40 .
 */
public interface DeviceRepository extends Neo4jRepository<Device,Long> {
}
