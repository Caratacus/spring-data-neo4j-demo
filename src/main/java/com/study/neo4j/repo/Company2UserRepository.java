package com.study.neo4j.repo;

import com.study.neo4j.domain.relation.Company2UserRelationShip;
import org.springframework.data.neo4j.repository.Neo4jRepository;

/**
 * @Author wtwei .
 * @Date 2017/3/6 .
 * @Time 11:10 .
 */
public interface Company2UserRepository extends Neo4jRepository<Company2UserRelationShip,Long> {
}