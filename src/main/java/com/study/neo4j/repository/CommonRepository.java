package com.study.neo4j.repository;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * CommonRepository
 * </p>
 *
 * @author Caratacus
 * @date 2017-03-23
 */
@Repository
public interface CommonRepository extends GraphRepository {

	@Query("MATCH (n) OPTIONAL MATCH (n)-[r]-() DELETE r, n")
	@Transactional
	public void clearDatabase();
}
