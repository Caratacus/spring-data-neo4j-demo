package com.study.neo4j.repo;

import com.study.neo4j.domain.User;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @Author wtwei
 * @Date 2017/3/2
 * @Time 15:36
 */
public interface UserRepository extends Neo4jRepository<User,Long> {

    @Query("MATCH (n:User {name:{name}}) RETURN n  ")
    List<User> findByName(@Param("name") String name);

    @Query("MATCH (n:User {mobile:{mobile}}) RETURN n  ")
    List<User> findByMobile(@Param("mobile") String mobile);
}
