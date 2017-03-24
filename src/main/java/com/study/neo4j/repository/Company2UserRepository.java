package com.study.neo4j.repository;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

import com.study.neo4j.relation.Company2UserRelation;

/**
 * <p>
 * Company2UserRepository
 * </p>
 *
 * @author Caratacus
 * @date 2017-03-23
 */
@Repository
public interface Company2UserRepository extends GraphRepository<Company2UserRelation> {
}
