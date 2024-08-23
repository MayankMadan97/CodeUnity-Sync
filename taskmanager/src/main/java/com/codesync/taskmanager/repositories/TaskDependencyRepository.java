package com.codesync.taskmanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codesync.taskmanager.entities.TaskDependency;

@Repository
public interface TaskDependencyRepository extends JpaRepository<TaskDependency, Long> {

}
