package com.study.neo4j.repository;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

import com.study.neo4j.domain.Company;

/**
 * <p>
 * CompaynRepository
 * </p>
 *
 * @author Caratacus
 * @date 2017-03-23
 */
@Repository
public interface CompaynRepository extends GraphRepository<Company> {
}
