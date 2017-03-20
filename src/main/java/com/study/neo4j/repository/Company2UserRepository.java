package com.study.neo4j.repository;

import org.springframework.data.neo4j.repository.GraphRepository;

import com.study.neo4j.relation.Company2UserRelationShip;

/**
 * @Author wtwei .
 * @Date 2017/3/6 .
 * @Time 11:10 .
 */
public interface Company2UserRepository extends GraphRepository<Company2UserRelationShip> {
}
