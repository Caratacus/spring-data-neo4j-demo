package com.study.neo4j.repository;

import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.repository.query.Param;

import com.study.neo4j.domain.User;

/**
 * @Author wtwei
 * @Date 2017/3/2
 * @Time 15:36
 */
public interface UserRepository extends GraphRepository<User> {

    @Query("MATCH (n:User {name:{name}}) RETURN n  ")
    List<User> findByName(@Param("name") String name);

    @Query("MATCH (n:User {mobile:{mobile}}) RETURN n  ")
    List<User> findByMobile(@Param("mobile") String mobile);
}
