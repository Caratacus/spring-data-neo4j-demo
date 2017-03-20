package com.study.neo4j.repository;

import org.springframework.data.neo4j.repository.GraphRepository;

import com.study.neo4j.relation.User2DeviceRelationShip;

/**
 * @Author wtwei .
 * @Date 2017/3/3 .
 * @Time 17:52 .
 */
public interface User2DeviceRepository extends GraphRepository<User2DeviceRelationShip> {
}
