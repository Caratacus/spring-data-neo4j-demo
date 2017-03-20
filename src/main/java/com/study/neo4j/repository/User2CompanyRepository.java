package com.study.neo4j.repository;

import org.springframework.data.neo4j.repository.GraphRepository;

import com.study.neo4j.relation.User2CompanyRelationShip;

/**
 * @Author wtwei .
 * @Date 2017/3/3 .
 * @Time 16:51 .
 */
public interface User2CompanyRepository extends GraphRepository<User2CompanyRelationShip> {
}
