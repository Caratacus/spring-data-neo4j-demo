package com.study.neo4j.repository;

import java.util.Collection;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.study.neo4j.domain.Task;

@Repository
public interface TaskRepository extends GraphRepository<Task> {

    Task findByTaskName(@Param("taskName") String taskName);

    @Query("MATCH (t:Task) WHERE t.taskName =~ ('(?i).*'+{taskName}+'.*') RETURN t")
    Collection<Task> findByNameContaining(@Param("taskName") String taskName);

}