package com.study.neo4j.repository;

import com.study.neo4j.relation.User2FriendRelation;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * CommonRepository
 * </p>
 *
 * @author Caratacus
 * @date 2017-03-23
 */
@Repository
public interface User2FriendRepository extends GraphRepository<User2FriendRelation> {

}
