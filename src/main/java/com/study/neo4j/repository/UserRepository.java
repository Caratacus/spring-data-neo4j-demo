package com.study.neo4j.repository;

import com.study.neo4j.domain.User;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * UserRepository
 * </p>
 *
 * @author Caratacus
 * @date 2017-03-23
 */
@Repository
public interface UserRepository extends GraphRepository<User> {

	@Query("MATCH (n:User {name:{name}}) RETURN n  ")
	List<User> findByName(@Param("name") String name);

	@Query("MATCH (n:User {mobile:{mobile}}) RETURN n  ")
	List<User> findByMobile(@Param("mobile") String mobile);
}
