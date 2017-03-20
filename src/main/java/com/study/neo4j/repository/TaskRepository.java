package com.study.neo4j.repository;

import com.study.neo4j.domain.Task;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface TaskRepository extends GraphRepository<Task> {

    Task findByTaskName(@Param("taskName") String taskName);

    @Query("MATCH (t:Task) WHERE t.taskName =~ ('(?i).*'+{taskName}+'.*') RETURN t")
    Collection<Task> findByNameContaining(@Param("taskName") String taskName);

}