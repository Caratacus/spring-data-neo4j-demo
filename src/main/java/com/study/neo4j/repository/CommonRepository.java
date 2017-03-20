package com.study.neo4j.repository;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author wtwei .
 * @Date 2017/3/6 .
 * @Time 16:54 .
 */
public interface CommonRepository extends GraphRepository {

    @Query("MATCH (n) OPTIONAL MATCH (n)-[r]-() DELETE r, n")
    @Transactional
    public void clearDatabase();
}
