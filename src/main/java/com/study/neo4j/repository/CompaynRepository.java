package com.study.neo4j.repository;

import org.springframework.data.neo4j.repository.GraphRepository;

import com.study.neo4j.domain.Company;

/**
 * @Author wtwei
 * @Date 2017/3/2
 * @Time 15:36
 */
public interface CompaynRepository extends GraphRepository<Company> {
}
